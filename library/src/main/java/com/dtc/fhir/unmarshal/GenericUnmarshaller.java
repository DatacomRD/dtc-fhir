package com.dtc.fhir.unmarshal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class GenericUnmarshaller {

	private static Unmarshaller unmarshaller;

	static {
		try {
			JAXBContext context = JAXBContext.newInstance("com.dtc.fhir.gwt");
			unmarshaller = context.createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static <T> T unmarshal(Class<T> clazz, String xml) {
		try {
			InputStream inputStream = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
			Object object = ((JAXBElement<T>) unmarshaller.unmarshal(inputStream)).getValue();
			if(clazz.isInstance(object)) {
				return (T) object;
			} else {
				return null;
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}
}
