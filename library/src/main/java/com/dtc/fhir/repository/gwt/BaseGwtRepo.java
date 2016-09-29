package com.dtc.fhir.repository.gwt;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import com.dtc.fhir.gwt.Bundle;
import com.dtc.fhir.gwt.BundleEntry;
import com.dtc.fhir.gwt.BundleLink;
import com.dtc.fhir.gwt.ListDt;
import com.dtc.fhir.gwt.Resource;
import com.dtc.fhir.gwt.ResourceContainer;
import com.dtc.fhir.gwt.extension.PageResult;
import com.dtc.fhir.repository.BaseRepo;
import com.dtc.fhir.repository.Constant;
import com.dtc.fhir.unmarshal.GwtMarshaller;
import com.dtc.fhir.unmarshal.GwtUnmarshaller;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.io.CharStreams;

/**
 * @param <T> 注意：如果 FHIR resource 名稱與 T 的 class 名稱不同
 *  （例如 List 是用 {@link ListDt}），
 * 	請 override {@link #getResourceType()} 重新指定。
 */
public abstract class BaseGwtRepo<T extends Resource> extends BaseRepo {

	protected final Class<T> entityClass;

	protected abstract T getResource(ResourceContainer resourceContainer);

	@SuppressWarnings("unchecked")
	public BaseGwtRepo(String baseUrl) {
		super(baseUrl);
		Type type = getClass().getGenericSuperclass();
		entityClass = (Class<T>)((ParameterizedType)type).getActualTypeArguments()[0];
	}

	public T findOne(String id) {
		return unmarshal(fetch(getResourceType() + "/" + id));
	}
	
	public boolean update(T resource) {
		String xml = GwtMarshaller.marshal(entityClass, resource);
		
		Preconditions.checkNotNull(xml);
		
		String id = resource.getId().getValue();
		HttpPut putRequest = new HttpPut(baseUrl + getResourceType() + "/" + id);
		putRequest.addHeader("Content-Type", "application/xml");
		StringEntity input = new StringEntity(xml, ContentType.APPLICATION_XML);
		putRequest.setEntity(input);

		HttpClient client = HttpClientBuilder.create().build();
		
		HttpResponse response = null;
		try {
			response = client.execute(putRequest);
			
			if (response.getStatusLine().getStatusCode() != 200) {
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (response != null && response instanceof CloseableHttpResponse) {
				try {
					((CloseableHttpResponse) response).close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return true;
	}

	/**
	 * @return null(when error occur)
	 */
	public PageResult<T> findByRange(String code, int startIndex, int amount) {
		Preconditions.checkArgument(amount <= Constant.FHIR_COUNT_LIMIT);

		StringBuilder sb = new StringBuilder();
		sb.append("?").append(Constant.PARAM_GETPAGES).append("=").append(code);
		sb.append("&").append(Constant.PARAM_GETPAGESOFFSET).append("=").append(startIndex);
		sb.append("&").append(Constant.PARAM_COUNT).append("=").append(amount);

		return unmarshallBundle(fetch(baseUrl + sb.toString()));
	}

	protected String getResourceType(){
		return entityClass.getSimpleName();
	}

	protected T unmarshal(String xml) {
		if(xml == null || xml.trim().equals("")) {
			return null;
		}
		return GwtUnmarshaller.unmarshal(entityClass, xml);
	}

	/**
	 * @return null(when error occur)
	 */
	protected PageResult<T> unmarshallBundle(String xml) {
		if(xml == null || xml.trim().equals("")) {
			return null;
		}
		List<T> resources = Lists.newArrayList();

		Bundle bundle = GwtUnmarshaller.unmarshal(Bundle.class, xml);

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

	protected String fetch(String path) {
		HttpGet request = new HttpGet(baseUrl + path);
		request.setHeader(HttpHeaders.ACCEPT, "application/xml");

		HttpClient client = HttpClientBuilder.create().build();

		try {
			HttpResponse response = client.execute(request);
			return CharStreams.toString(
				new InputStreamReader(
					response.getEntity().getContent(), StandardCharsets.UTF_8
				)
			);
		} catch (IOException e) {
			return "";
		}
	}

	private String resolveCode(String link) {
		int indexStart = link.indexOf(Constant.PARAM_GETPAGES);

		if (indexStart == -1) { return null; }

		indexStart += Constant.PARAM_GETPAGES.length() + 1;
		int indexEnd = link.indexOf("&", indexStart);
		if (indexEnd != -1) {
			return link.substring(indexStart, indexEnd);
		} else {
			return link.substring(indexStart);
		}
	}
}
