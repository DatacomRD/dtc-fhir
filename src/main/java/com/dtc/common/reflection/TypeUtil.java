package com.dtc.common.reflection;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

public class TypeUtil {
	public static String toDeclaration(Type type) {
		return toDeclaration(type, false);
	}

	/**
	 * 將 {@link Type} 轉換成 Java 中宣告變數的形式（包含泛型處理）
	 */
	public static String toDeclaration(Type type, boolean full) {
//		System.out.println("==> " + type.getClass().getName() + " = " + type);

		if (type instanceof ParameterizedType) {
			return toString((ParameterizedType) type, full);
		} else if (type instanceof TypeVariable) {
			StringBuffer result = new StringBuffer();
			TypeVariable<?> tt = (TypeVariable<?>) type;
			result.append(tt.getName());

			if (full && tt.getBounds().length > 0) {
				result.append(" extends ");
				StringBuffer boundResult = new StringBuffer();

				for (Type bound : tt.getBounds()) {
					boundResult.append(toDeclaration(bound, full));
					boundResult.append(",");
				}

				result.append(boundResult.substring(0, boundResult.length() - 1));
			}

			return result.toString();
		} else if (type instanceof WildcardType) {
			return "?";
		} else {
			return classTypeToString(type);
		}
	}

	private static String toString(ParameterizedType type, boolean full) {
		StringBuffer result = new StringBuffer(toDeclaration(type.getRawType()));
		result.append("<");

		for (Type t : type.getActualTypeArguments()) {
			result.append(toDeclaration(t));
			result.append(",");
		}

		return result.substring(0, result.length() - 1) + ">";
	}

	private static String classTypeToString(Type classType) {
		Class<?> clazz = (Class<?>) classType;
		return clazz.getName().replace('$', '.');
	}
}
