package com.dtc.fhir.gwt.util;

import com.dtc.fhir.gwt.DomainResource;
import com.dtc.fhir.gwt.Id;

public class IdUtil {
	public static final int PREFIX_LENGTH = 5;

	private static final String[][] table = {
		{"AllergyIntolerance", "AGIR."},
		{"Appointment", "APMT."},
		{"AppointmentResponse", "AMRP."},
		{"AuditEvent", "ADET."},
		{"Basic", "BSIC."},
		{"Binary", "BNRY."},
		{"BodySite", "BDST."},
		{"Bundle", "BNDL."},
		{"CarePlan", "CRPL."},
		{"Claim", "CLAM."},
		{"ClaimResponse", "CLRP."},
		{"ClinicalImpression", "CNIP."},
		{"Communication", "COMM."},
		{"CommunicationRequest", "CMRQ."},
		{"Composition", "CPST."},
		{"ConceptMap", "CCMP."},
		{"Condition", "CDTN."},
		{"Conformance", "CFMC."},
		{"Contract", "CNTT."},
		{"Coverage", "CVRG."},
		{"DetectedIssue", "DTIS."},
		{"DataElement", "DTEM."},
		{"Device", "DVICE."},
		{"DeviceComponent", "DVCP."},
		{"DeviceMetric", "DVMT."},
		{"DeviceUseRequest", "DVUR."},
		{"DeviceUseStatement", "DVUS."},
		{"DiagnosticOrder", "DXOD."},
		{"DiagnosticReport", "DXRP."},
		{"DocumentManifest", "DCMF."},
		{"DocumentReference", "DCRR."},
		{"EligibilityRequest", "EBRQ."},
		{"EligibilityResponse", "EBRP."},
		{"Encounter", "ECNT."},
		{"EnrollmentRequest", "EMRQ."},
		{"EnrollmentResponse", "EMRP."},
		{"EpisodeOfCare", "ESCR."},
		{"ExplanationOfBenefit", "EPBF."},
		{"FamilyMemberHistory", "FMHT."},
		{"Flag", "FLAG."},
		{"Goal", "GOAL."},
		{"Group", "GROP."},
		{"HealthcareService", "HCSV."},
		{"ImagingObjectSelection", "IGOS."},
		{"ImagingStudy", "IGSD."},
		{"Immunization", "IMZT."},
		{"ImmunizationRecommendation", "IZRD."},
		{"ImplementationGuide", "IMGD."},
		{"List", "LIST."},
		{"Location", "LCTN."},
		{"Media", "MDIA."},
		{"Medication", "MDCT."},
		{"MedicationAdministration", "MDAD."},
		{"MedicationDispense", "MDDP."},
		{"MedicationOrder", "MDOD."},
		{"MedicationStatement", "MDSM."},
		{"MessageHeader", "MSHD."},
		{"NamingSystem", "NSYS."},
		{"NutritionOrder", "NTOD."},
		{"Observation", "OBVT."},
		{"OperationDefinition", "OPDF."},
		{"OperationOutcome", "OPOC."},
		{"Order", "ODER."},
		{"OrderResponse", "ODRP."},
		{"Organization", "ORGN."},
		{"Parameters", "PARA."},
		{"Patient", "PATT."},
		{"PaymentNotice", "PMNT."},
		{"PaymentReconciliation", "PMRC."},
		{"Person", "PRSN."},
		{"Practitioner", "PRAC."},
		{"Procedure", "PCDR."},
		{"ProcessRequest", "PRRQ."},
		{"ProcessResponse", "PRRP."},
		{"ProcedureRequest", "PCRQ."},
		{"Provenance", "PVNC."},
		{"Questionnaire", "QSNR."},
		{"QuestionnaireResponse", "QSRP."},
		{"ReferralRequest", "RFRQ."},
		{"RelatedPerson", "RLPS."},
		{"RiskAssessment", "RSAS."},
		{"Schedule", "SCHE."},
		{"SearchParameter", "SEPA."},
		{"Slot", "SLOT."},
		{"Specimen", "SPCM."},
		{"StructureDefinition", "STDF."},
		{"Subscription", "SBSP."},
		{"Substance", "SBTC."},
		{"SupplyRequest", "SPRQ."},
		{"SupplyDelivery", "SPDV."},
		{"TestScript", "TTST."},
		{"ValueSet", "VLST."},
		{"VisionPrescription", "VSPS."},
	};

	/**
	 * @return 長度為 {@value #PREFIX_LENGTH} 的對應 ID prefix
	 */
	public static String prefix(DomainResource resource) {
		return prefix(resource.getClass());
	}

	/**
	 * @return 長度為 {@value #PREFIX_LENGTH} 的對應 ID prefix
	 */
	public static String prefix(Class<? extends DomainResource> clazz) {
		String result = findPrefix(clazz.getSimpleName());

		if (result != null) {
			return result;
		} else {
			//除了 FHIR 版本變更或是 table 有漏，不然會炸這個並不科學...
			throw new IllegalArgumentException(
				clazz.getName() + " is unknown resource"
			);
		}
	}

	/**
	 * @deprecated 這是開放給純粹只是查 prefix 的 caller 使用。
	 * 	標準 dtc-fhir 的 caller 請使用 {@link #prefix(Class)} 或 {@link #prefix(DomainResource)}。
	 * @param resourceName FHIR resource 名稱
	 * @return 長度為 {@value #PREFIX_LENGTH} 的對應 ID prefix
	 */
	@Deprecated
	public static String prefix(String resourceName) {
		String result = findPrefix(resourceName);

		if (result != null) {
			return result;
		} else {
			throw new IllegalArgumentException(
				resourceName + " is unknown resource"
			);
		}
	}

	/**
	 * @return id 是否符合 HAPI FHIR server 的規範。若 id 不存在也會回傳 true。
	 * @see #isValid(String)
	 */
	public static boolean isValid(Id id) {
		return id == null ? true : isValid(id.getValue());
	}

	/**
	 * 若對 HAPI FHIR server UPDATE 一個 resource，
	 * 其 id 為純數字、且該 id 在 server 上並無對應的 resource，
	 * 則 HAPI FHIR server 會認定是非法 id 而拒絕寫入。
	 *
	 * @return id 是否符合 HAPI FHIR server 的規範。若 id 不存在也會回傳 true。
	 */
	public static boolean isValid(String idValue) {
		//ID 不存在的另一種搞笑形式
		if (idValue == null || idValue.isEmpty()) { return true; }

		//不用 Long.parseLong()，除了內部邏輯複雜、炸 exception 會很慢之外
		//重點是 "-1" 這種值會 pass 但實際上 HAPI FHIR server 會接受... XD
		//（HAPI FHIR server 連 "-" 都會接受呢... lol）
		//所以就直接回歸判斷每個 char 是不是 0～9 就好啦
		for (char digit : idValue.toCharArray()) {
			if (digit < '0' || digit > '9') { return true; }
		}

		return false;
	}

	/**
	 * 如果 resource 的 ID 不合法（{@link #isValid(Id)}），會自動補上 prefix。
	 */
	public static void makeSure(DomainResource resource) {
		if (isValid(resource.getId())) { return; }

		String idValue = resource.getId().getValue();
		resource.getId().setValue(prefix(resource) + idValue);
	}

	private static String findPrefix(String name) {
		for (String[] tuple : table) {
			if (tuple[0].equals(name)) {
				return tuple[1];
			}
		}

		return null;
	}
}
