package com.dtc.fhir.util;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dtc.common.reflection.MethodUtil;
import com.dtc.common.reflection.TypeUtil;

import ca.uhn.fhir.model.dstu2.resource.Organization;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class VOConverter {
	public static final String BASE_PACKAGE = "com.dtc.fhir.gwt.vo";
	public static final String FHIR_PACKAGE = "ca.uhn.fhir.model";

	private static final List<String> SKIP_METHOD = Arrays.asList(
		"getAllPopulatedChildElementsOfType"
		, "getStructureFhirVersionEnum"

		, "getResources"	//ca.uhn.fhir.model.api.Bundle
		, "getAbstract"	//ca.uhn.fhir.model.dstu2.resource.ValueSet.CodeSystemConcept
	);
	private static final List<String> SKIP_METHOD_TAIL = Arrays.asList(
		"Rep", "Element"
	);

	private static File target;

	private static final Configuration config = new Configuration(Configuration.VERSION_2_3_24);

	public static void main(String[] args) throws Exception {
		//TODO BaseElement 的所有 child class 都丟進去做
		Class<?> clazz = Organization.class;

		init(args);
		convert(clazz);
	}

	private static void init(String[] args) throws Exception {
		config.setDefaultEncoding("UTF-8");
		//Refactory 怎麼指到相對位置？
		config.setDirectoryForTemplateLoading(new File(args[0]));
		target = new File(args[1]);

		if (!target.exists()) { target.mkdirs(); }
	}

	private static void convert(Class<?> clazz) throws Exception {
		System.out.println("Convert " + clazz.getName());

		HashMap<String, Object> data = new HashMap<>();
		String packageName = transferPackage(clazz);
		data.put("packageName", packageName);
		data.put("className", genClassDeclaration(clazz));

		ArrayList<FtlField> fieldList = new ArrayList<>();
		data.put("fieldList", fieldList);

		//FTL 會用 fieldList 產生 field 宣告、getter、setter
		//因為 hapi 的 field 命名都喜歡加上「my」...... ＝＝"
		//所以用 source 的 getter 來產生 fieldList 內容，比較好寫也比較保險
		for(Method method : clazz.getDeclaredMethods()) {
			if (!MethodUtil.isGetter(method)) { continue; }
			//有一些莫名其妙的 getter 也忽略
			if (skipMethod(method)) { continue; }

			System.out.println("\t" + method.getName());
			FtlField field = new FtlField();
			field.setName(MethodUtil.getterToField(method));
			field.setType(method.getGenericReturnType());
			fieldList.add(field);
		}

		File java = new File(
			toPackageFolder(packageName, target),
			clazz.getSimpleName() + ".java"
		);
		java.getParentFile().mkdirs();

		Template temp = config.getTemplate("vo.ftl");
		temp.process(data,
			new FileWriter(java)
		);
	}

	private static String genClassDeclaration(Class<?> clazz) {
		StringBuffer result = new StringBuffer(clazz.getSimpleName());

		if (clazz.getTypeParameters().length > 0) {
			StringBuffer generic = new StringBuffer("<");

			for (Type type : clazz.getTypeParameters()) {
				generic.append(TypeUtil.toDeclaration(type));
				generic.append(",");
			}

			result.append(generic.substring(0, generic.length() - 1));
			result.append(">");
		}

		if (clazz.getGenericSuperclass() != Object.class) {
			result.append(" extends ");
			result.append(TypeUtil.toDeclaration(clazz.getGenericSuperclass(), true));
		}

		return result.toString().replace(VOConverter.FHIR_PACKAGE, VOConverter.BASE_PACKAGE);
	}

	/**
	 * 將 FHIR 的 base package 轉換成自己指定的 base package
	 */
	private static String transferPackage(Class<?> clazz) {
		String name = clazz.getName();

		if (!name.startsWith(FHIR_PACKAGE)) { return BASE_PACKAGE; }

		return BASE_PACKAGE +
			name.substring(FHIR_PACKAGE.length(), name.lastIndexOf('.'));
	}

	private static boolean skipMethod(Method method) {
		if (SKIP_METHOD.contains(method.getName())) { return true; }

		for (String tail : SKIP_METHOD_TAIL) {
			if (method.getName().endsWith(tail)) { return true; }
		}

		return false;
	}

	private static File toPackageFolder(String packageName, File root) {
		return Paths.get(root.getAbsolutePath(), packageName.split("\\.")).toFile();
	}
}
