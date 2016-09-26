package com.dtc.fhir.unmarshal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class GenericUnmarshaller {
	private static JAXBContext context;

	static {
		try {
			context = JAXBContext.newInstance("com.dtc.fhir.gwt");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T unmarshal(Class<T> clazz, String xml) {
		if (context == null) {
			throw new UnsupportedOperationException("JAXBContext of \"com.dtc.fhir.gwt\" initial failed.");
		}

		//unmarshaller 應該沒有保證 thread-safe
		//所以每次 unmarshal 都重新產生一個新的 instance
		Unmarshaller unmarshaller;

		try {
			unmarshaller = context.createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
			throw new UnsupportedOperationException("Unmarshaller create failed");
		}

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
