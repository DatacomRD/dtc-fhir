package com.dtc.fhir.util;

import java.io.File;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.swing.JFileChooser;

/**
 * 雖然說是 GetXSD，但只要路徑一樣，啥東西都可以一起抓下來 \囧/
 */
public class GetXSD {
	private static final String DOC_BASE = "https://www.hl7.org/fhir/";

	public static void main(String[] args) throws Exception {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		jfc.showSaveDialog(null);
		File file = jfc.getSelectedFile();

		List<String> lines = Files.readAllLines(
			Paths.get(GetXSD.class.getClassLoader().getResource("RetrieveList.txt").toURI()),
			Charset.forName("UTF-8")
		);

		for (String line : lines) {
			fetch(line, file);
		}
	}

	private static void fetch(String name, File dir) throws Exception {
		Files.copy(
			new URL(DOC_BASE + name).openConnection().getInputStream(),
			new File(dir, name).toPath(),
			StandardCopyOption.REPLACE_EXISTING
		);
	}
}
