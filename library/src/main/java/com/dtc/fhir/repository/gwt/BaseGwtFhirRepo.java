package com.dtc.fhir.repository.gwt;

import com.dtc.fhir.gwt.Bundle;
import com.dtc.fhir.gwt.BundleEntry;
import com.dtc.fhir.gwt.BundleLink;
import com.dtc.fhir.gwt.ResourceContainer;
import com.dtc.fhir.repository.BaseRepo;
import com.dtc.fhir.unmarshal.GenericUnmarshaller;
import com.dtc.fhir.vo.Context;
import com.dtc.fhir.vo.PageResult;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public abstract class BaseGwtFhirRepo<T> extends BaseRepo {

	private GenericUnmarshaller<T> unmarshaller = new GenericUnmarshaller<T>();

	abstract String getResourceType();

	abstract T getResource(ResourceContainer resourceContainer);

	public BaseGwtFhirRepo(String baseUrl) {
		super(baseUrl);
	}

	public T findOne(String id) {
		return unmarshal(fetch(getResourceType() + "/" + id));
	}

	protected T unmarshal(String xml) {
		return unmarshaller.unmarshal(xml);
	}

	/**
	 * @return null(when error occur)
	 */
	protected PageResult<T> unmarshallBundle(String xml) {
		List<T> resources = Lists.newArrayList();

		GenericUnmarshaller<Bundle> unmarshaller = new GenericUnmarshaller<>();
		Bundle bundle = unmarshaller.unmarshal(xml);

		if (bundle == null) { return null; }

		List<BundleEntry> entries = bundle.getEntry();
		for (BundleEntry entry : entries) {
			ResourceContainer resourceContainer = entry.getResource();
			resources.add(getResource(resourceContainer));
		}

		// 由於查詢可能是初次查詢或者換頁，但 unmarshallBundle() 不會知道，所以解析時必須多考慮一些狀況
		// 1. link 可能不會包含 code（發生在全部結果只有一頁的查詢）
		// 2. 無法確保哪個 link 會有 code，所以直接解析到有為止
		String code = null;
		for (BundleLink link : bundle.getLink()) {
			code = resolveCode(link.getUrl().getValue());
			if (code != null) {
				break;
			}
		}

		return new PageResult<T>(bundle.getTotal().getValue().intValue(), code, resources);
	}

	/**
	 * @return null(when error occur)
	 */
	public PageResult<T> findByRange(String code, int startIndex, int amount) {
		Preconditions.checkArgument(amount < Context.FHIR_COUNT_LIMIT);

		StringBuilder sb = new StringBuilder();
		sb.append("?").append(Context.PARAM_GETPAGES).append("=").append(code);
		sb.append("&").append(Context.PARAM_GETPAGESOFFSET).append("=").append(startIndex);
		sb.append("&").append(Context.PARAM_COUNT).append("=").append(amount);

		return unmarshallBundle(fetch(baseUrl + sb.toString()));
	}

	protected String fetch(String path) {
		StringBuffer result = new StringBuffer();

		HttpGet request = new HttpGet(baseUrl + path);
		request.setHeader(HttpHeaders.ACCEPT, "application/xml");

		HttpClient client = HttpClientBuilder.create().build();
		try {
			HttpResponse response = client.execute(request);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}

		} catch (IOException e) {
			return result.toString();
		}

		return result.toString();
	}

	private String resolveCode(String link) {
		int indexStart = link.indexOf(Context.PARAM_GETPAGES);

		if (indexStart == -1) { return null; }

		indexStart += Context.PARAM_GETPAGES.length() + 1;
		int indexEnd = link.indexOf("&", indexStart);
		if (indexEnd != -1) {
			return link.substring(indexStart, indexEnd);
		} else {
			return link.substring(indexStart);
		}
	}
}
