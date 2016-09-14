package com.dtc.fhir.repository;

public abstract class BaseRepo {
	protected final String baseUrl;

	public BaseRepo(final String baseUrl) {
		if(!baseUrl.endsWith("/")) {
			this.baseUrl = baseUrl + "/";
		} else {
			this.baseUrl = baseUrl;
		}
	}
}
