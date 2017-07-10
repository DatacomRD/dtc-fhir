package com.dtc.fhir.gwt.util;

import java.util.ArrayList;
import java.util.List;

import com.dtc.fhir.gwt.Reference;
import com.dtc.fhir.gwt.Resource;

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
	 * @param list 存放 T 的 {@link List}
	 * @param vp 從 T 取得 display 內容的方式
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
	public static <T extends Resource> List<Reference> convert(List<T> list) {
		List<Reference> result = new ArrayList<>();
		for (T r : list) {
			result.add(convert(r));
		}
		return result;
	}

	/**
	 * 將 {@link Resource} 轉為 {@link Reference}
	 * @param resource 要轉換的 {@link Resource}
	 * @param vp 從 T 取得 display 內容的方式
	 */
	public static <T extends Resource> Reference convert(T resource, Getter<T, String> vp) {
		return convert(resource, vp.getValue(resource));
	}

	/**
	 * 將 {@link Resource} 轉為 {@link Reference}
	 */
	public static <T extends Resource> Reference convert(T resource) {
		return convert(resource, (String)null);
	}

	/**
	 * 將 {@link Resource} 轉為 {@link Reference}
	 * @param resource 要轉換的 {@link Resource}
	 * @param display {@link Reference} 的 display 的值，可以為 null
	 */
	public static <T extends Resource> Reference convert(T resource, String display) {
		Reference reference = new Reference();
		PromiseSetter.set(reference, "reference.value", compose(resource));
		PromiseSetter.set(reference, "display.value", display);
		return reference;
	}
}
