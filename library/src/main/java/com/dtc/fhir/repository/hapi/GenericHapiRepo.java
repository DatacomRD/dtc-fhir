package com.dtc.fhir.repository.hapi;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.resource.Bundle;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.IGenericClient;
import ca.uhn.fhir.rest.client.IRestfulClientFactory;
import ca.uhn.fhir.rest.gclient.ICreate;
import ca.uhn.fhir.rest.gclient.ICreateTyped;
import ca.uhn.fhir.rest.gclient.ICriterion;
import ca.uhn.fhir.rest.gclient.IDelete;
import ca.uhn.fhir.rest.gclient.IDeleteTyped;
import ca.uhn.fhir.rest.gclient.IParam;
import ca.uhn.fhir.rest.gclient.IQuery;
import ca.uhn.fhir.rest.gclient.IRead;
import ca.uhn.fhir.rest.gclient.IReadExecutable;
import ca.uhn.fhir.rest.gclient.IReadTyped;
import ca.uhn.fhir.rest.gclient.IUntypedQuery;
import ca.uhn.fhir.rest.gclient.IUpdate;
import ca.uhn.fhir.rest.gclient.IUpdateTyped;
import ca.uhn.fhir.rest.server.exceptions.InvalidRequestException;
import ca.uhn.fhir.rest.server.exceptions.ResourceGoneException;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;
import ca.uhn.fhir.rest.server.exceptions.UnprocessableEntityException;
import com.dtc.fhir.repository.BaseRepo;
import com.google.common.collect.Lists;
import java.util.List;
import org.hl7.fhir.instance.model.api.IIdType;

public abstract class GenericHapiRepo<T extends IResource> extends BaseRepo {

	private final Class classType;

	private final FhirContext ctx;

	protected abstract T transformation(IResource resource);

	public GenericHapiRepo(String baseUrl, Class<T> _class) {
		super(baseUrl);
		this.classType = _class;
		this.ctx = FhirContext.forDstu2();
		IRestfulClientFactory factory = ctx.getRestfulClientFactory();
		factory.setSocketTimeout(IRestfulClientFactory.DEFAULT_SOCKET_TIMEOUT  * 10);
	}

	public IIdType save(T resource) {
		if (findOne(resource.getId()) == null && (resource.getId() == null || resource.getId().isEmpty())) {
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

	public T findOne(String id) {
		if(id == null) { return null; }

		IGenericClient client = ctx.newRestfulGenericClient(baseUrl);
		IRead read = client.read();
		IReadTyped<?> readTyped = read.resource(classType);
		IReadExecutable<?> readExecutable = readTyped.withId(id);
		readExecutable.encodedJson();

		try {
			T resource = (T) readExecutable.execute();
			return resource;
		} catch (ResourceGoneException e) {
			System.out.println("ResourceGoneException : " + e.getMessage());
			return null;
		} catch (ResourceNotFoundException e) {
			System.out.println("ResourceNotFoundException : " + e.getMessage());
			return null;
		}
	}

	public T findOne(IIdType id) {
		if(id == null) { return null; }

		return findOne(id.getIdPart());
	}

	public void delete(IResource resource) {
		IGenericClient client = ctx.newRestfulGenericClient(baseUrl);
		IDelete delete = client.delete();
		IDeleteTyped deleteTyped = delete.resource(resource);
		deleteTyped.execute();
	}

	protected List<T> executeQuery(ICriterion<? extends IParam> ... params) {
		IGenericClient client = ctx.newRestfulGenericClient(baseUrl);
		IUntypedQuery search = client.search();
		IQuery<Bundle> query = search
				.forResource(classType)
				.returnBundle(Bundle.class);
		for (ICriterion param : params) {
			query.where(param);
		}
		
		Bundle bundle = query.execute();
		return getResources(bundle);
	}

	private List<T> getResources(Bundle bundle) {
		if(bundle == null) {
			return Lists.newArrayList();
		}

		List<T> resources = Lists.newArrayList();
		List<Bundle.Entry> entry = bundle.getEntry();
		for(Bundle.Entry e : entry) {
			IResource resource = e.getResource();
			resources.add(transformation(resource));
		}
		return resources;
	}

	private IIdType create(T resource) {
		IGenericClient client = ctx.newRestfulGenericClient(baseUrl);
		ICreate create = client.create();
		ICreateTyped createTyped = create.resource(resource);
		createTyped.encodedJson();

		try {
			MethodOutcome methodOutcome = createTyped.execute();
			return methodOutcome.getId();
		} catch (InvalidRequestException e) {
			System.out.println("InvalidRequestException : " + e.getMessage());
		}
		return null;
	}

	private IIdType update(T resource) {
		IGenericClient client = ctx.newRestfulGenericClient(baseUrl);
		IUpdate update = client.update();
		IUpdateTyped updateTyped = update.resource(resource);
		updateTyped.encodedJson();

		try {
			MethodOutcome methodOutcome = updateTyped.execute();
			return methodOutcome.getId();
		} catch (InvalidRequestException e) {
			System.out.println("InvalidRequestException : " + e.getMessage());
		}
		return null;
	}
}
