package com.dtc.test.fhir.gwt;

import com.dtc.fhir.gwt.Communication;
import com.dtc.fhir.gwt.ResourceContainer;
import com.dtc.fhir.repository.gwt.BaseGwtRepo;
import org.junit.Assert;
import org.junit.Test;

public class CmmunicationGwtRepoTest {
	// TODO
	private final String baseUrl = "http://192.168.1.200:8000/fhir-jpaserver_v13/baseDstu2";

	private BaseGwtRepo<Communication> cmmunicationGwtRepo = new BaseGwtRepo<Communication>(baseUrl) {
		@Override
		protected String getResourceType() {
			return "Communication";
		}

		@Override
		protected Communication getResource(ResourceContainer resourceContainer) {
			return resourceContainer.getCommunication();
		}
	};

	@Test
	public void testCommunicationFindOneAssertNull() {
		Communication resource = cmmunicationGwtRepo.findOne("1");
		Assert.assertNull(resource);
	}
}
