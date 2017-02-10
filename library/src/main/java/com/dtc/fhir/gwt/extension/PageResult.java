package com.dtc.fhir.gwt.extension;

import java.io.Serializable;

public class PageResult implements Serializable {
	private static final long serialVersionUID = 1L;

	private int total;
	private String code;

	PageResult() {}	//Just for GWT RPC

	public PageResult(int total, String code) {
		this.total = total;
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
}
