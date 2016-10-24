package com.dtc.fhir.repository.hapi;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.rest.gclient.ICriterion;
import ca.uhn.fhir.rest.gclient.IParam;
import java.util.List;

/**
 * 這是一個簡單的 HapiFHIR client，只提供以下功能 :
 * <ul>
 *     <li>save(IResource resource)</li>
 *     <li>delete(IResource resource)</li>
 *     <li>findOne(String id)</li>
 * </ul>
 *
 * @param <T> 一種型態為繼承 IResource 的 Hapi FHIR class
 */
public class SimpleHapiRepo<T extends IResource> extends GenericHapiRepo<T> {

	public SimpleHapiRepo(String baseUrl, Class _class) {
		super(baseUrl, _class);
	}

	@Deprecated
	@Override
	final protected List<T> executeQuery(ICriterion<? extends IParam>... params) {
		throw new UnsupportedOperationException();
	}

	@Deprecated
	@Override
	final protected T transformation(IResource resource) {
		throw new UnsupportedOperationException();
	}
}