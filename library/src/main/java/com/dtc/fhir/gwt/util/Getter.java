package com.dtc.fhir.gwt.util;

public interface Getter<T, V> {
	V getValue(T object);
}