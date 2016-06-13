package com.dtc.fhir.util;

import java.lang.reflect.Type;

import com.dtc.common.reflection.TypeUtil;

public class FtlField {
	private Type type;
	private String name;

	public String getType() {
		return TypeUtil.toDeclaration(type);
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
