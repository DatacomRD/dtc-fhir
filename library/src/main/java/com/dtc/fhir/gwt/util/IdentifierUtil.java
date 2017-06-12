package com.dtc.fhir.gwt.util;

import java.util.ArrayList;
import java.util.List;

import com.dtc.fhir.gwt.Identifier;

public class IdentifierUtil {
	/**
	 * 用指定的 system, value 快速建立 {@link Identifier}
	 */
	public static Identifier create(String system, String value) {
		Identifier id = new Identifier();
		PromiseSetter.set(id, "system.value", system);
		PromiseSetter.set(id, "value.value", value);
		return id;
	}

	/**
	 * 取得 identifierList 中對應 system 的 {@link Identifier}，
	 * 如果 identifierList 有多個 {@link Identifier} 對應 system 也只會回傳第一個 match 的，
	 * 若找不到則回傳 null。
	 */
	public static Identifier findBySystem(List<Identifier> identifierList, String system) {
		for (Identifier id : identifierList) {
			if (id.getSystem() != null &&
				system.equals(id.getSystem().getValue())) {
				return id;
			}
		}
		return null;
	}

	/**
	 * 取得 identifierList 中所有對應 system 的 {@link Identifier}
	 */
	public static List<Identifier> findAllBySystem(List<Identifier> identifierList, String system) {
		ArrayList<Identifier> list = new ArrayList<>();
		for (Identifier id : identifierList) {
			if (id.getSystem() != null &&
				system.equals(id.getSystem().getValue())) {
				list.add(id);
			}
		}
		return list;
	}
}
