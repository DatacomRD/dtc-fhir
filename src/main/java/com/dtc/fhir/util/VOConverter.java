package com.dtc.fhir.util;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dtc.common.reflection.MethodUtil;

import ca.uhn.fhir.model.dstu2.resource.Organization;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class VOConverter {
	private static final String BASE_PACKAGE = "com.dtc.fhir.gwt.vo";
	private static final List<String> SKIP_METHOD = Arrays.asList(
		"getAllPopulatedChildElementsOfType"
	);
	private static final List<String> SKIP_METHOD_TAIL = Arrays.asList(
		"Rep", "Element"
	);

	/** 用來紀錄處理過 / 處理中的 class */
	private static final HashMap<Class<?>, String> classSet = new HashMap<>();
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
		System.out.print("Convert " + clazz.getName() + " ......");

		if (classSet.containsKey(clazz)) {
			System.out.println(" existed");
			return;
		} else {
			System.out.println();
			classSet.put(clazz, BASE_PACKAGE + clazz.getSimpleName());
		}

		HashMap<String, Object> data = new HashMap<>();
		//Refactory 跟 source class 做 mapping 而不是放在同一個 package 下
		data.put("packageName", BASE_PACKAGE);
		data.put("className", clazz.getSimpleName());

		ArrayList<FtlField> fieldList = new ArrayList<>();
		data.put("fieldList", fieldList);

		//FTL 會用 fieldList 產生 field 宣告、getter、setter
		//因為 hapi 的 field 命名都喜歡加上「my」...... ＝＝"
		//所以用 source 的 getter 來產生 fieldList 內容，比較好寫也比較保險
		for(Method method : clazz.getDeclaredMethods()) {
			if (!MethodUtil.isGetter(method)) { continue; }
			//有一些莫名其妙的 getter 也忽略
			if (skipMethod(method)) { continue; }

			System.out.println(method.getName());
			FtlField field = new FtlField();
			field.setName(MethodUtil.getterToField(method));
			field.setType(method.getGenericReturnType());
			fieldList.add(field);
		}

		Template temp = config.getTemplate("vo.ftl");
		temp.process(data,
			new FileWriter(
				new File(
					toPackageFolder(BASE_PACKAGE, target),
					clazz.getSimpleName() + ".java"
				)
			)
		);

		System.out.println(" finish");
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
