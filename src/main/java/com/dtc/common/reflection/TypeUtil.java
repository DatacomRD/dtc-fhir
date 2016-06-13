package com.dtc.common.reflection;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TypeUtil {
	/**
	 * 將 {@link Type} 轉換成 Java 中宣告變數的形式（包含泛型處理）
	 */
	public static String toDeclaration(Type type) {
//		System.out.println(type.getClass().getName());
		StringBuffer result = new StringBuffer();

		if (type instanceof ParameterizedType) {
			result.append(toString((ParameterizedType) type));
		} else {
			result.append(classTypeToString(type));
		}

		return result.toString();
	}

	private static String toString(ParameterizedType type) {
		StringBuffer result = new StringBuffer(toDeclaration(type.getRawType()));
		result.append("<");

		for (Type t : type.getActualTypeArguments()) {
			if (t instanceof ParameterizedType) {
				result.append(toString((ParameterizedType) t));
			} else {
				result.append(classTypeToString(t));
			}

			result.append(",");
		}

		return result.substring(0, result.length() - 1) + ">";
	}

	private static String classTypeToString(Type classType) {
		Class<?> clazz = (Class<?>) classType;
		return clazz.getName().replace('$', '.');
	}
}
