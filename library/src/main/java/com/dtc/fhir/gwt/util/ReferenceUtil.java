package com.dtc.fhir.gwt.util;

import java.util.ArrayList;
import java.util.List;

import com.dtc.fhir.gwt.Reference;
import com.dtc.fhir.gwt.Resource;
import com.dtc.fhir.gwt.StringDt;

public class ReferenceUtil {
	/** 用來分隔 resource type 與 id 的符號 */
	private static final String SEPEARATOR = "/";

	/**
	 * 將 {@link Resource} 轉成 {@link Reference#getReference()} 的 relative URL 格式
	 */
	public static String compose(Resource resource) {
		return compose(resource.getClass().getSimpleName(), resource.getId().getValue());
	}

	/**
	 *  將傳入的字串轉成 {@link Reference#getReference()} 的 relative URL 格式
	 */
	public static String compose(String resourceName, String resourceId) {
		return resourceName + SEPEARATOR + resourceId;
	}

	/**
	 * 將 {@link Reference#getReference()} 的字串格式拆解得 resource type 與 resource id
	 *
	 * @return {resource type, resource id}
	 */
	public static String[] decompose(String reference) throws IllegalArgumentException {
		int i = reference.indexOf(SEPEARATOR);
		if (i == -1) { throw new IllegalArgumentException(); }

		return new String[]{
				reference.substring(0, i),
				reference.substring(i + SEPEARATOR.length())
		};
	}

	/**
	 * 將 {@link Resource} 轉為 {@link Reference}
	 */
	public static <T extends Resource> List<Reference> convert(List<T> list, Getter<T, String> vp) {
		List<Reference> result = new ArrayList<>();
		for (T r : list) {
			result.add(convert(r, vp));
		}
		return result;
	}

	/**
	 * 將 {@link Resource} 轉為 {@link Reference}
	 */
	public static <T extends Resource> Reference convert(T resource, Getter<T, String> vp) {
		Reference reference = new Reference();
		StringDt ref = new StringDt();
		ref.setValue(compose(resource));
		reference.setReference(ref);
		StringDt disp = new StringDt();
		disp.setValue(vp.getValue(resource));
		reference.setDisplay(disp);
		return reference;
	}
}
