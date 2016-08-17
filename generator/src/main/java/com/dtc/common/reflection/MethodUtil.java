package com.dtc.common.reflection;

import java.lang.reflect.Method;

public class MethodUtil {
	public static boolean isGetter(Method method) {
		return method.getName().startsWith("get");
	}

	/**
	 * 取得 getter 的 field 名稱
	 */
	public static String getterToField(Method method) {
		if (!isGetter(method)) { return null; }

		return method.getName().toLowerCase().substring(3, 4) +
				method.getName().substring(4);
	}
}
