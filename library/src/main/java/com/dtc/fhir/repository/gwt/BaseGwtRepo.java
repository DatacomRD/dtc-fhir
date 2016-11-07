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
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.dtc.fhir.gwt.Bundle;
import com.dtc.fhir.gwt.BundleEntry;
import com.dtc.fhir.gwt.BundleLink;
import com.dtc.fhir.gwt.Id;
import com.dtc.fhir.gwt.ListDt;
import com.dtc.fhir.gwt.Resource;
import com.dtc.fhir.gwt.ResourceContainer;
import com.dtc.fhir.gwt.extension.PageResult;
import com.dtc.fhir.gwt.util.ReferenceUtil;
import com.dtc.fhir.repository.BaseRepo;
import com.dtc.fhir.repository.Constant;
import com.dtc.fhir.unmarshal.GwtMarshaller;
import com.dtc.fhir.unmarshal.GwtUnmarshaller;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.io.CharStreams;

import ca.uhn.fhir.rest.server.exceptions.UnprocessableEntityException;

/**
 * @param <T> 注意：如果 FHIR resource 名稱與 T 的 class 名稱不同
 *  （例如 List 是用 {@link ListDt}），
 * 	請 override {@link #getResourceType()} 重新指定。
 */
public abstract class BaseGwtRepo<T extends Resource> extends BaseRepo {
	/** FHIR 規範的 HTTP request 的 MIME type。 */
	protected static final String MIME_TYPE = "application/xml";
	
	/** FHIR 規範的 HTTP POST / PUT 的 content type */
	protected static final ContentType CONTENT_TYPE = ContentType.create(MIME_TYPE, StandardCharsets.UTF_8);

	protected final Class<T> entityClass;

	protected abstract T getResource(ResourceContainer resourceContainer);

	@SuppressWarnings("unchecked")
	public BaseGwtRepo(String baseUrl) {
		super(baseUrl);
		Type type = getClass().getGenericSuperclass();
		entityClass = (Class<T>)((ParameterizedType)type).getActualTypeArguments()[0];
	}

	public T findOne(String id) {
		return unmarshal(
			fetch(
				ReferenceUtil.compose(getResourceType(), id)
			)
		);
	}

	public T findOne(Id id) {
		if(id == null) { return null; }

		return findOne(id.getValue());
	}

	public boolean delete(T resource) {
		HttpDelete delRequest = new HttpDelete(baseUrl + ReferenceUtil.compose(resource));
		delRequest.addHeader(HttpHeaders.CONTENT_TYPE, MIME_TYPE);
		HttpClient client = HttpClientBuilder.create().build();
		HttpResponse response = null;

		try {
			response = client.execute(delRequest);

			// 根據 fhir 規格說明，刪除會回傳 200 or 204
			if (response.getStatusLine().getStatusCode() != 200
				&& response.getStatusLine().getStatusCode() != 204) {
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeResponse(response);
		}

		return true;
	}

	/**
	 * 參考 FHIR RESTful API 規範：https://www.hl7.org/fhir/http.html#create，<br/>
	 * 若要讓 resource 經由 `create` 也就是透過 HTTP POST 存入 FHIR server，resource 不可帶有 id，id 應由 FHIR server 指派。<br />
	 * 若 resource instance 帶有 id (是已經存在於 FHIR server 的 resource) <br />
	 * 或者新的 resource 需要 <b>自訂 id</b>，則使用 `update` (透過HTTP PUT) 存入 FHIR server。
	 */
	public boolean save(T resource) {
		if(resource == null) { return false; }

		if (resource.getId() == null || resource.getId().getValue() == null || resource.getId().getValue().isEmpty()) {
			try {
				return create(resource);
			} catch (UnprocessableEntityException e) {
				System.out.println("UnprocessableEntityException : " + e.getMessage());
				/* 當 resource 被刪除後 id 會是已經存在，但 findOne 會找無。可是後來需要再修改則必須可以修改。 */
				return update(resource);
			}
		} else {
			return update(resource);
		}
	}

	private boolean update(T resource) {
		//TODO exception 機制不良（create() 亦同）
		//marshall() 會炸 exception，在這裡應該要處理
		//xml 如果是 null 不應該炸 Preconditions 產生的 NullPointerException（有炸跟沒炸一樣）
		String xml = GwtMarshaller.marshal(entityClass, resource);

		Preconditions.checkNotNull(xml);

		HttpPut putRequest = new HttpPut(baseUrl + ReferenceUtil.compose(resource));
		putRequest.addHeader(HttpHeaders.CONTENT_TYPE, MIME_TYPE);
		StringEntity input = new StringEntity(xml, CONTENT_TYPE);
		putRequest.setEntity(input);

		HttpClient client = HttpClientBuilder.create().build();

		HttpResponse response = null;
		try {
			response = client.execute(putRequest);

			// 如果更新的 resource 找不到（id 不存在），回傳的 StatusCode = 400
			// 根據 fhir 規格說明，修改會回傳 200 or 201
			if (response.getStatusLine().getStatusCode() != 200
				&& response.getStatusLine().getStatusCode() != 201) {
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeResponse(response);
		}

		return true;
	}

	private boolean create(T resource) {
		String xml = GwtMarshaller.marshal(entityClass, resource);

		Preconditions.checkNotNull(xml);

		HttpPost postRequest = new HttpPost(baseUrl + getResourceType());
		postRequest.addHeader(HttpHeaders.CONTENT_TYPE, MIME_TYPE);
		StringEntity input = new StringEntity(xml, CONTENT_TYPE);
		postRequest.setEntity(input);

		HttpClient client = HttpClientBuilder.create().build();

		HttpResponse response = null;
		try {
			response = client.execute(postRequest);

			if (response.getStatusLine().getStatusCode() != 201) {
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeResponse(response);
		}

		return true;
	}

	private void closeResponse(HttpResponse response) {
		if (response != null && response instanceof CloseableHttpResponse) {
			try {
				((CloseableHttpResponse) response).close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
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

		return unmarshallBundle(fetch(sb.toString()));
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
		request.setHeader(HttpHeaders.ACCEPT, MIME_TYPE);

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
