package com.dtc.test.fhir.gwt;

import com.dtc.fhir.gwt.Communication;
import com.dtc.fhir.gwt.ResourceContainer;
import com.dtc.fhir.repository.gwt.BaseGwtRepo;
import com.dtc.fhir.repository.hapi.SimpleHapiRepo;
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

	private SimpleHapiRepo<ca.uhn.fhir.model.dstu2.resource.Communication> simpleHapiRepo = new SimpleHapiRepo<>(baseUrl, ca.uhn.fhir.model.dstu2.resource.Communication.class);

	/**
	 * 測試流程：
	 * <ol>
	 *     <li>先利用 simpleHapiRepo save 一個 id 為 test.id 的 communication resource 到 FHIR server</li>
	 *     <li>再利用 cmmunicationRepo 查詢 id 為 "test.id" 的 resource</li>
	 *     <li>預期是 not null 以及 id 為 "test.id"</li>
	 * </ol>
	 */
	@Test
	public void testCommunicationFindOneAssertNotNull() {
		final String ID = "test.id";
		ca.uhn.fhir.model.dstu2.resource.Communication communication = new ca.uhn.fhir.model.dstu2.resource.Communication();
		communication.setId(ID);
		simpleHapiRepo.save(communication);

		Communication resource = cmmunicationGwtRepo.findOne(ID);
		Assert.assertNotNull(resource);
		Assert.assertEquals(ID, resource.getId().getValue());
	}
}
