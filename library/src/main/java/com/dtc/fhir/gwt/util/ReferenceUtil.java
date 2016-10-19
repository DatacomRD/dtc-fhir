package com.dtc.fhir.gwt.util;

import com.dtc.fhir.gwt.Resource;

public class ReferenceUtil {
	// 用來分隔 resourceType 與 id 的符號
	private static final String SEPEARATOR = "/";

	/**
	 * @return FHIR Resource reference string
	 */
	public static String compose(Resource resource) {
		return resource.getClass().getSimpleName() + SEPEARATOR + resource.getId().getValue();
	}

	/**
	 * @return
	 * [0] is resource type <br/>
	 * [1] is resource id
	 */
	public static String[] decompose(String reference) throws IllegalArgumentException {
		int i = reference.indexOf(SEPEARATOR);
		if (i == -1) { throw new IllegalArgumentException(); }

		return new String[]{
				reference.substring(0, i),
				reference.substring(i + SEPEARATOR.length())
		};
	}
}
