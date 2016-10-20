package com.dtc.fhir.gwt.util;

import java.util.ArrayList;
import java.util.List;

import com.dtc.fhir.gwt.Reference;
import com.dtc.fhir.gwt.Resource;
import com.dtc.fhir.gwt.StringDt;

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

	/**
	 * 將 list 中的各種 fhir resource 轉為 reference
	 */
	public static <T extends Resource> List<Reference> convert(List<T> list, Getter<T, String> vp) {
		List<Reference> result = new ArrayList<>();
		for (T r : list) {
			result.add(convert(r, vp));
		}
		return result;
	}

	/**
	 * 將各種 fhir resource 轉為 reference
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
