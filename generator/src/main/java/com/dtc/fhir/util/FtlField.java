package com.dtc.fhir.util;

import java.lang.reflect.Type;

import com.dtc.common.reflection.TypeUtil;

public class FtlField {
	private Type type;
	private String name;

	public String getType() {
		//直接用字串取代的方式解決 package 轉換的 mapping 問題  XD
		//參見 VOConverter.transferPackage()
		return TypeUtil.toDeclaration(type).replace(VOConverter.FHIR_PACKAGE, VOConverter.BASE_PACKAGE);
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
