package com.dtc.fhir.gwt.extension;

import java.util.List;

public class PageResult<T> {
	
	private int total;
	
	private String code;
	
	List<T> results;
	
	public PageResult(int total, String code, List<T> results) {
		this.total = total;
		this.results = results;
		this.code = code;
	}
	
	// Getter & Setter
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<T> getResults() {
		return results;
	}
	public void setResults(List<T> results) {
		this.results = results;
	}
}
