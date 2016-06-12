package com.dtc.fhir.util;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.HashMap;

import ca.uhn.fhir.model.dstu2.resource.Organization;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class VOConverter {
	private static final String BASE_PACKAGE = "com.dtc.fhir.gwt.vo";

	/** 用來紀錄處理過 / 處理中的 class */
	private static final HashMap<Class<?>, String> classSet = new HashMap<>();
	private static File target;

	private static final Configuration config = new Configuration(Configuration.VERSION_2_3_24);

	public static void main(String[] args) throws Exception {
		init(args);
		convert(Organization.class);
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

		Template temp = config.getTemplate("vo.ftl");
		temp.process(data,
			new FileWriter(
				new File(
					toPackageFolder(BASE_PACKAGE, target),
					clazz.getSimpleName() + ".java")
				)
			)
		;

		System.out.println(" finish");
	}

	private static File toPackageFolder(String packageName, File root) {
		return Paths.get(root.getAbsolutePath(), packageName.split("\\.")).toFile();
	}
}
