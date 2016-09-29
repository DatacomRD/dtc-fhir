package com.dtc.fhir.unmarshal;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

public class GwtMarshaller {
	private static JAXBContext context;

	static {
		try {
			context = JAXBContext.newInstance("com.dtc.fhir.gwt");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static <T> String marshal(Class<T> clazz, T resource) {
		if (context == null) {
			throw new UnsupportedOperationException("JAXBContext of \"com.dtc.fhir.gwt\" initial failed.");
		}

		//marshaller 應該沒有保證 thread-safe
		//所以每次 marshal 都重新產生一個新的 instance
		Marshaller marshaller;

		try {
			marshaller = context.createMarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
			throw new UnsupportedOperationException("Marshaller create failed");
		}

		try {
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			marshaller.marshal(new JAXBElement<T>(new QName("http://hl7.org/fhir", clazz.getSimpleName()), clazz, resource), outputStream);
			
			if(clazz.isInstance(resource)) {
				return new String(outputStream.toByteArray(), StandardCharsets.UTF_8);
			} else {
				return null;
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return null;
	}
}
