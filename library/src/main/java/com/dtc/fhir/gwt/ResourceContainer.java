//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>ResourceContainer complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ResourceContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://hl7.org/fhir}Account"/>
 *         &lt;element ref="{http://hl7.org/fhir}AllergyIntolerance"/>
 *         &lt;element ref="{http://hl7.org/fhir}Appointment"/>
 *         &lt;element ref="{http://hl7.org/fhir}AppointmentResponse"/>
 *         &lt;element ref="{http://hl7.org/fhir}AuditEvent"/>
 *         &lt;element ref="{http://hl7.org/fhir}Basic"/>
 *         &lt;element ref="{http://hl7.org/fhir}Binary"/>
 *         &lt;element ref="{http://hl7.org/fhir}BodySite"/>
 *         &lt;element ref="{http://hl7.org/fhir}Bundle"/>
 *         &lt;element ref="{http://hl7.org/fhir}CarePlan"/>
 *         &lt;element ref="{http://hl7.org/fhir}Claim"/>
 *         &lt;element ref="{http://hl7.org/fhir}ClaimResponse"/>
 *         &lt;element ref="{http://hl7.org/fhir}ClinicalImpression"/>
 *         &lt;element ref="{http://hl7.org/fhir}Communication"/>
 *         &lt;element ref="{http://hl7.org/fhir}CommunicationRequest"/>
 *         &lt;element ref="{http://hl7.org/fhir}Composition"/>
 *         &lt;element ref="{http://hl7.org/fhir}ConceptMap"/>
 *         &lt;element ref="{http://hl7.org/fhir}Condition"/>
 *         &lt;element ref="{http://hl7.org/fhir}Conformance"/>
 *         &lt;element ref="{http://hl7.org/fhir}Contract"/>
 *         &lt;element ref="{http://hl7.org/fhir}Coverage"/>
 *         &lt;element ref="{http://hl7.org/fhir}DataElement"/>
 *         &lt;element ref="{http://hl7.org/fhir}DetectedIssue"/>
 *         &lt;element ref="{http://hl7.org/fhir}Device"/>
 *         &lt;element ref="{http://hl7.org/fhir}DeviceComponent"/>
 *         &lt;element ref="{http://hl7.org/fhir}DeviceMetric"/>
 *         &lt;element ref="{http://hl7.org/fhir}DeviceUseRequest"/>
 *         &lt;element ref="{http://hl7.org/fhir}DeviceUseStatement"/>
 *         &lt;element ref="{http://hl7.org/fhir}DiagnosticOrder"/>
 *         &lt;element ref="{http://hl7.org/fhir}DiagnosticReport"/>
 *         &lt;element ref="{http://hl7.org/fhir}DocumentManifest"/>
 *         &lt;element ref="{http://hl7.org/fhir}DocumentReference"/>
 *         &lt;element ref="{http://hl7.org/fhir}EligibilityRequest"/>
 *         &lt;element ref="{http://hl7.org/fhir}EligibilityResponse"/>
 *         &lt;element ref="{http://hl7.org/fhir}Encounter"/>
 *         &lt;element ref="{http://hl7.org/fhir}EnrollmentRequest"/>
 *         &lt;element ref="{http://hl7.org/fhir}EnrollmentResponse"/>
 *         &lt;element ref="{http://hl7.org/fhir}EpisodeOfCare"/>
 *         &lt;element ref="{http://hl7.org/fhir}ExplanationOfBenefit"/>
 *         &lt;element ref="{http://hl7.org/fhir}FamilyMemberHistory"/>
 *         &lt;element ref="{http://hl7.org/fhir}Flag"/>
 *         &lt;element ref="{http://hl7.org/fhir}Goal"/>
 *         &lt;element ref="{http://hl7.org/fhir}Group"/>
 *         &lt;element ref="{http://hl7.org/fhir}HealthcareService"/>
 *         &lt;element ref="{http://hl7.org/fhir}ImagingObjectSelection"/>
 *         &lt;element ref="{http://hl7.org/fhir}ImagingStudy"/>
 *         &lt;element ref="{http://hl7.org/fhir}Immunization"/>
 *         &lt;element ref="{http://hl7.org/fhir}ImmunizationRecommendation"/>
 *         &lt;element ref="{http://hl7.org/fhir}ImplementationGuide"/>
 *         &lt;element ref="{http://hl7.org/fhir}List"/>
 *         &lt;element ref="{http://hl7.org/fhir}Location"/>
 *         &lt;element ref="{http://hl7.org/fhir}Media"/>
 *         &lt;element ref="{http://hl7.org/fhir}Medication"/>
 *         &lt;element ref="{http://hl7.org/fhir}MedicationAdministration"/>
 *         &lt;element ref="{http://hl7.org/fhir}MedicationDispense"/>
 *         &lt;element ref="{http://hl7.org/fhir}MedicationOrder"/>
 *         &lt;element ref="{http://hl7.org/fhir}MedicationStatement"/>
 *         &lt;element ref="{http://hl7.org/fhir}MessageHeader"/>
 *         &lt;element ref="{http://hl7.org/fhir}NamingSystem"/>
 *         &lt;element ref="{http://hl7.org/fhir}NutritionOrder"/>
 *         &lt;element ref="{http://hl7.org/fhir}Observation"/>
 *         &lt;element ref="{http://hl7.org/fhir}OperationDefinition"/>
 *         &lt;element ref="{http://hl7.org/fhir}OperationOutcome"/>
 *         &lt;element ref="{http://hl7.org/fhir}Order"/>
 *         &lt;element ref="{http://hl7.org/fhir}OrderResponse"/>
 *         &lt;element ref="{http://hl7.org/fhir}Organization"/>
 *         &lt;element ref="{http://hl7.org/fhir}Patient"/>
 *         &lt;element ref="{http://hl7.org/fhir}PaymentNotice"/>
 *         &lt;element ref="{http://hl7.org/fhir}PaymentReconciliation"/>
 *         &lt;element ref="{http://hl7.org/fhir}Person"/>
 *         &lt;element ref="{http://hl7.org/fhir}Practitioner"/>
 *         &lt;element ref="{http://hl7.org/fhir}Procedure"/>
 *         &lt;element ref="{http://hl7.org/fhir}ProcedureRequest"/>
 *         &lt;element ref="{http://hl7.org/fhir}ProcessRequest"/>
 *         &lt;element ref="{http://hl7.org/fhir}ProcessResponse"/>
 *         &lt;element ref="{http://hl7.org/fhir}Provenance"/>
 *         &lt;element ref="{http://hl7.org/fhir}Questionnaire"/>
 *         &lt;element ref="{http://hl7.org/fhir}QuestionnaireResponse"/>
 *         &lt;element ref="{http://hl7.org/fhir}ReferralRequest"/>
 *         &lt;element ref="{http://hl7.org/fhir}RelatedPerson"/>
 *         &lt;element ref="{http://hl7.org/fhir}RiskAssessment"/>
 *         &lt;element ref="{http://hl7.org/fhir}Schedule"/>
 *         &lt;element ref="{http://hl7.org/fhir}SearchParameter"/>
 *         &lt;element ref="{http://hl7.org/fhir}Slot"/>
 *         &lt;element ref="{http://hl7.org/fhir}Specimen"/>
 *         &lt;element ref="{http://hl7.org/fhir}StructureDefinition"/>
 *         &lt;element ref="{http://hl7.org/fhir}Subscription"/>
 *         &lt;element ref="{http://hl7.org/fhir}Substance"/>
 *         &lt;element ref="{http://hl7.org/fhir}SupplyDelivery"/>
 *         &lt;element ref="{http://hl7.org/fhir}SupplyRequest"/>
 *         &lt;element ref="{http://hl7.org/fhir}TestScript"/>
 *         &lt;element ref="{http://hl7.org/fhir}ValueSet"/>
 *         &lt;element ref="{http://hl7.org/fhir}VisionPrescription"/>
 *         &lt;element ref="{http://hl7.org/fhir}Parameters"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceContainer", propOrder = {
    "account",
    "allergyIntolerance",
    "appointment",
    "appointmentResponse",
    "auditEvent",
    "basic",
    "binary",
    "bodySite",
    "bundle",
    "carePlan",
    "claim",
    "claimResponse",
    "clinicalImpression",
    "communication",
    "communicationRequest",
    "composition",
    "conceptMap",
    "condition",
    "conformance",
    "contract",
    "coverage",
    "dataElement",
    "detectedIssue",
    "device",
    "deviceComponent",
    "deviceMetric",
    "deviceUseRequest",
    "deviceUseStatement",
    "diagnosticOrder",
    "diagnosticReport",
    "documentManifest",
    "documentReference",
    "eligibilityRequest",
    "eligibilityResponse",
    "encounter",
    "enrollmentRequest",
    "enrollmentResponse",
    "episodeOfCare",
    "explanationOfBenefit",
    "familyMemberHistory",
    "flag",
    "goal",
    "group",
    "healthcareService",
    "imagingObjectSelection",
    "imagingStudy",
    "immunization",
    "immunizationRecommendation",
    "implementationGuide",
    "list",
    "location",
    "media",
    "medication",
    "medicationAdministration",
    "medicationDispense",
    "medicationOrder",
    "medicationStatement",
    "messageHeader",
    "namingSystem",
    "nutritionOrder",
    "observation",
    "operationDefinition",
    "operationOutcome",
    "order",
    "orderResponse",
    "organization",
    "patient",
    "paymentNotice",
    "paymentReconciliation",
    "person",
    "practitioner",
    "procedure",
    "procedureRequest",
    "processRequest",
    "processResponse",
    "provenance",
    "questionnaire",
    "questionnaireResponse",
    "referralRequest",
    "relatedPerson",
    "riskAssessment",
    "schedule",
    "searchParameter",
    "slot",
    "specimen",
    "structureDefinition",
    "subscription",
    "substance",
    "supplyDelivery",
    "supplyRequest",
    "testScript",
    "valueSet",
    "visionPrescription",
    "parameters"
})
public class ResourceContainer implements Serializable {

    @XmlElement(name = "Account")
    protected Account account;
    @XmlElement(name = "AllergyIntolerance")
    protected AllergyIntolerance allergyIntolerance;
    @XmlElement(name = "Appointment")
    protected Appointment appointment;
    @XmlElement(name = "AppointmentResponse")
    protected AppointmentResponse appointmentResponse;
    @XmlElement(name = "AuditEvent")
    protected AuditEvent auditEvent;
    @XmlElement(name = "Basic")
    protected Basic basic;
    @XmlElement(name = "Binary")
    protected Binary binary;
    @XmlElement(name = "BodySite")
    protected BodySite bodySite;
    @XmlElement(name = "Bundle")
    protected Bundle bundle;
    @XmlElement(name = "CarePlan")
    protected CarePlan carePlan;
    @XmlElement(name = "Claim")
    protected Claim claim;
    @XmlElement(name = "ClaimResponse")
    protected ClaimResponse claimResponse;
    @XmlElement(name = "ClinicalImpression")
    protected ClinicalImpression clinicalImpression;
    @XmlElement(name = "Communication")
    protected Communication communication;
    @XmlElement(name = "CommunicationRequest")
    protected CommunicationRequest communicationRequest;
    @XmlElement(name = "Composition")
    protected Composition composition;
    @XmlElement(name = "ConceptMap")
    protected ConceptMap conceptMap;
    @XmlElement(name = "Condition")
    protected Condition condition;
    @XmlElement(name = "Conformance")
    protected Conformance conformance;
    @XmlElement(name = "Contract")
    protected Contract contract;
    @XmlElement(name = "Coverage")
    protected Coverage coverage;
    @XmlElement(name = "DataElement")
    protected DataElement dataElement;
    @XmlElement(name = "DetectedIssue")
    protected DetectedIssue detectedIssue;
    @XmlElement(name = "Device")
    protected Device device;
    @XmlElement(name = "DeviceComponent")
    protected DeviceComponent deviceComponent;
    @XmlElement(name = "DeviceMetric")
    protected DeviceMetric deviceMetric;
    @XmlElement(name = "DeviceUseRequest")
    protected DeviceUseRequest deviceUseRequest;
    @XmlElement(name = "DeviceUseStatement")
    protected DeviceUseStatement deviceUseStatement;
    @XmlElement(name = "DiagnosticOrder")
    protected DiagnosticOrder diagnosticOrder;
    @XmlElement(name = "DiagnosticReport")
    protected DiagnosticReport diagnosticReport;
    @XmlElement(name = "DocumentManifest")
    protected DocumentManifest documentManifest;
    @XmlElement(name = "DocumentReference")
    protected DocumentReference documentReference;
    @XmlElement(name = "EligibilityRequest")
    protected EligibilityRequest eligibilityRequest;
    @XmlElement(name = "EligibilityResponse")
    protected EligibilityResponse eligibilityResponse;
    @XmlElement(name = "Encounter")
    protected Encounter encounter;
    @XmlElement(name = "EnrollmentRequest")
    protected EnrollmentRequest enrollmentRequest;
    @XmlElement(name = "EnrollmentResponse")
    protected EnrollmentResponse enrollmentResponse;
    @XmlElement(name = "EpisodeOfCare")
    protected EpisodeOfCare episodeOfCare;
    @XmlElement(name = "ExplanationOfBenefit")
    protected ExplanationOfBenefit explanationOfBenefit;
    @XmlElement(name = "FamilyMemberHistory")
    protected FamilyMemberHistory familyMemberHistory;
    @XmlElement(name = "Flag")
    protected Flag flag;
    @XmlElement(name = "Goal")
    protected Goal goal;
    @XmlElement(name = "Group")
    protected Group group;
    @XmlElement(name = "HealthcareService")
    protected HealthcareService healthcareService;
    @XmlElement(name = "ImagingObjectSelection")
    protected ImagingObjectSelection imagingObjectSelection;
    @XmlElement(name = "ImagingStudy")
    protected ImagingStudy imagingStudy;
    @XmlElement(name = "Immunization")
    protected Immunization immunization;
    @XmlElement(name = "ImmunizationRecommendation")
    protected ImmunizationRecommendation immunizationRecommendation;
    @XmlElement(name = "ImplementationGuide")
    protected ImplementationGuide implementationGuide;
    @XmlElement(name = "List")
    protected ListDt list;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "Media")
    protected Media media;
    @XmlElement(name = "Medication")
    protected Medication medication;
    @XmlElement(name = "MedicationAdministration")
    protected MedicationAdministration medicationAdministration;
    @XmlElement(name = "MedicationDispense")
    protected MedicationDispense medicationDispense;
    @XmlElement(name = "MedicationOrder")
    protected MedicationOrder medicationOrder;
    @XmlElement(name = "MedicationStatement")
    protected MedicationStatement medicationStatement;
    @XmlElement(name = "MessageHeader")
    protected MessageHeader messageHeader;
    @XmlElement(name = "NamingSystem")
    protected NamingSystem namingSystem;
    @XmlElement(name = "NutritionOrder")
    protected NutritionOrder nutritionOrder;
    @XmlElement(name = "Observation")
    protected Observation observation;
    @XmlElement(name = "OperationDefinition")
    protected OperationDefinition operationDefinition;
    @XmlElement(name = "OperationOutcome")
    protected OperationOutcome operationOutcome;
    @XmlElement(name = "Order")
    protected Order order;
    @XmlElement(name = "OrderResponse")
    protected OrderResponse orderResponse;
    @XmlElement(name = "Organization")
    protected Organization organization;
    @XmlElement(name = "Patient")
    protected Patient patient;
    @XmlElement(name = "PaymentNotice")
    protected PaymentNotice paymentNotice;
    @XmlElement(name = "PaymentReconciliation")
    protected PaymentReconciliation paymentReconciliation;
    @XmlElement(name = "Person")
    protected Person person;
    @XmlElement(name = "Practitioner")
    protected Practitioner practitioner;
    @XmlElement(name = "Procedure")
    protected Procedure procedure;
    @XmlElement(name = "ProcedureRequest")
    protected ProcedureRequest procedureRequest;
    @XmlElement(name = "ProcessRequest")
    protected ProcessRequest processRequest;
    @XmlElement(name = "ProcessResponse")
    protected ProcessResponse processResponse;
    @XmlElement(name = "Provenance")
    protected Provenance provenance;
    @XmlElement(name = "Questionnaire")
    protected Questionnaire questionnaire;
    @XmlElement(name = "QuestionnaireResponse")
    protected QuestionnaireResponse questionnaireResponse;
    @XmlElement(name = "ReferralRequest")
    protected ReferralRequest referralRequest;
    @XmlElement(name = "RelatedPerson")
    protected RelatedPerson relatedPerson;
    @XmlElement(name = "RiskAssessment")
    protected RiskAssessment riskAssessment;
    @XmlElement(name = "Schedule")
    protected Schedule schedule;
    @XmlElement(name = "SearchParameter")
    protected SearchParameter searchParameter;
    @XmlElement(name = "Slot")
    protected Slot slot;
    @XmlElement(name = "Specimen")
    protected Specimen specimen;
    @XmlElement(name = "StructureDefinition")
    protected StructureDefinition structureDefinition;
    @XmlElement(name = "Subscription")
    protected Subscription subscription;
    @XmlElement(name = "Substance")
    protected Substance substance;
    @XmlElement(name = "SupplyDelivery")
    protected SupplyDelivery supplyDelivery;
    @XmlElement(name = "SupplyRequest")
    protected SupplyRequest supplyRequest;
    @XmlElement(name = "TestScript")
    protected TestScript testScript;
    @XmlElement(name = "ValueSet")
    protected ValueSet valueSet;
    @XmlElement(name = "VisionPrescription")
    protected VisionPrescription visionPrescription;
    @XmlElement(name = "Parameters")
    protected Parameters parameters;

    /**
     * 取得 account 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * 設定 account 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * 取得 allergyIntolerance 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AllergyIntolerance }
     *     
     */
    public AllergyIntolerance getAllergyIntolerance() {
        return allergyIntolerance;
    }

    /**
     * 設定 allergyIntolerance 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AllergyIntolerance }
     *     
     */
    public void setAllergyIntolerance(AllergyIntolerance value) {
        this.allergyIntolerance = value;
    }

    /**
     * 取得 appointment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Appointment }
     *     
     */
    public Appointment getAppointment() {
        return appointment;
    }

    /**
     * 設定 appointment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Appointment }
     *     
     */
    public void setAppointment(Appointment value) {
        this.appointment = value;
    }

    /**
     * 取得 appointmentResponse 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentResponse }
     *     
     */
    public AppointmentResponse getAppointmentResponse() {
        return appointmentResponse;
    }

    /**
     * 設定 appointmentResponse 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentResponse }
     *     
     */
    public void setAppointmentResponse(AppointmentResponse value) {
        this.appointmentResponse = value;
    }

    /**
     * 取得 auditEvent 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AuditEvent }
     *     
     */
    public AuditEvent getAuditEvent() {
        return auditEvent;
    }

    /**
     * 設定 auditEvent 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEvent }
     *     
     */
    public void setAuditEvent(AuditEvent value) {
        this.auditEvent = value;
    }

    /**
     * 取得 basic 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Basic }
     *     
     */
    public Basic getBasic() {
        return basic;
    }

    /**
     * 設定 basic 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Basic }
     *     
     */
    public void setBasic(Basic value) {
        this.basic = value;
    }

    /**
     * 取得 binary 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Binary }
     *     
     */
    public Binary getBinary() {
        return binary;
    }

    /**
     * 設定 binary 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Binary }
     *     
     */
    public void setBinary(Binary value) {
        this.binary = value;
    }

    /**
     * 取得 bodySite 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BodySite }
     *     
     */
    public BodySite getBodySite() {
        return bodySite;
    }

    /**
     * 設定 bodySite 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BodySite }
     *     
     */
    public void setBodySite(BodySite value) {
        this.bodySite = value;
    }

    /**
     * 取得 bundle 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Bundle }
     *     
     */
    public Bundle getBundle() {
        return bundle;
    }

    /**
     * 設定 bundle 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Bundle }
     *     
     */
    public void setBundle(Bundle value) {
        this.bundle = value;
    }

    /**
     * 取得 carePlan 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CarePlan }
     *     
     */
    public CarePlan getCarePlan() {
        return carePlan;
    }

    /**
     * 設定 carePlan 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlan }
     *     
     */
    public void setCarePlan(CarePlan value) {
        this.carePlan = value;
    }

    /**
     * 取得 claim 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Claim }
     *     
     */
    public Claim getClaim() {
        return claim;
    }

    /**
     * 設定 claim 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim }
     *     
     */
    public void setClaim(Claim value) {
        this.claim = value;
    }

    /**
     * 取得 claimResponse 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ClaimResponse }
     *     
     */
    public ClaimResponse getClaimResponse() {
        return claimResponse;
    }

    /**
     * 設定 claimResponse 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimResponse }
     *     
     */
    public void setClaimResponse(ClaimResponse value) {
        this.claimResponse = value;
    }

    /**
     * 取得 clinicalImpression 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalImpression }
     *     
     */
    public ClinicalImpression getClinicalImpression() {
        return clinicalImpression;
    }

    /**
     * 設定 clinicalImpression 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalImpression }
     *     
     */
    public void setClinicalImpression(ClinicalImpression value) {
        this.clinicalImpression = value;
    }

    /**
     * 取得 communication 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Communication }
     *     
     */
    public Communication getCommunication() {
        return communication;
    }

    /**
     * 設定 communication 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Communication }
     *     
     */
    public void setCommunication(Communication value) {
        this.communication = value;
    }

    /**
     * 取得 communicationRequest 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationRequest }
     *     
     */
    public CommunicationRequest getCommunicationRequest() {
        return communicationRequest;
    }

    /**
     * 設定 communicationRequest 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationRequest }
     *     
     */
    public void setCommunicationRequest(CommunicationRequest value) {
        this.communicationRequest = value;
    }

    /**
     * 取得 composition 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Composition }
     *     
     */
    public Composition getComposition() {
        return composition;
    }

    /**
     * 設定 composition 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Composition }
     *     
     */
    public void setComposition(Composition value) {
        this.composition = value;
    }

    /**
     * 取得 conceptMap 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ConceptMap }
     *     
     */
    public ConceptMap getConceptMap() {
        return conceptMap;
    }

    /**
     * 設定 conceptMap 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptMap }
     *     
     */
    public void setConceptMap(ConceptMap value) {
        this.conceptMap = value;
    }

    /**
     * 取得 condition 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * 設定 condition 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setCondition(Condition value) {
        this.condition = value;
    }

    /**
     * 取得 conformance 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Conformance }
     *     
     */
    public Conformance getConformance() {
        return conformance;
    }

    /**
     * 設定 conformance 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Conformance }
     *     
     */
    public void setConformance(Conformance value) {
        this.conformance = value;
    }

    /**
     * 取得 contract 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Contract }
     *     
     */
    public Contract getContract() {
        return contract;
    }

    /**
     * 設定 contract 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract }
     *     
     */
    public void setContract(Contract value) {
        this.contract = value;
    }

    /**
     * 取得 coverage 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coverage }
     *     
     */
    public Coverage getCoverage() {
        return coverage;
    }

    /**
     * 設定 coverage 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coverage }
     *     
     */
    public void setCoverage(Coverage value) {
        this.coverage = value;
    }

    /**
     * 取得 dataElement 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DataElement }
     *     
     */
    public DataElement getDataElement() {
        return dataElement;
    }

    /**
     * 設定 dataElement 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DataElement }
     *     
     */
    public void setDataElement(DataElement value) {
        this.dataElement = value;
    }

    /**
     * 取得 detectedIssue 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DetectedIssue }
     *     
     */
    public DetectedIssue getDetectedIssue() {
        return detectedIssue;
    }

    /**
     * 設定 detectedIssue 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DetectedIssue }
     *     
     */
    public void setDetectedIssue(DetectedIssue value) {
        this.detectedIssue = value;
    }

    /**
     * 取得 device 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Device }
     *     
     */
    public Device getDevice() {
        return device;
    }

    /**
     * 設定 device 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Device }
     *     
     */
    public void setDevice(Device value) {
        this.device = value;
    }

    /**
     * 取得 deviceComponent 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DeviceComponent }
     *     
     */
    public DeviceComponent getDeviceComponent() {
        return deviceComponent;
    }

    /**
     * 設定 deviceComponent 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceComponent }
     *     
     */
    public void setDeviceComponent(DeviceComponent value) {
        this.deviceComponent = value;
    }

    /**
     * 取得 deviceMetric 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DeviceMetric }
     *     
     */
    public DeviceMetric getDeviceMetric() {
        return deviceMetric;
    }

    /**
     * 設定 deviceMetric 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceMetric }
     *     
     */
    public void setDeviceMetric(DeviceMetric value) {
        this.deviceMetric = value;
    }

    /**
     * 取得 deviceUseRequest 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DeviceUseRequest }
     *     
     */
    public DeviceUseRequest getDeviceUseRequest() {
        return deviceUseRequest;
    }

    /**
     * 設定 deviceUseRequest 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceUseRequest }
     *     
     */
    public void setDeviceUseRequest(DeviceUseRequest value) {
        this.deviceUseRequest = value;
    }

    /**
     * 取得 deviceUseStatement 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DeviceUseStatement }
     *     
     */
    public DeviceUseStatement getDeviceUseStatement() {
        return deviceUseStatement;
    }

    /**
     * 設定 deviceUseStatement 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceUseStatement }
     *     
     */
    public void setDeviceUseStatement(DeviceUseStatement value) {
        this.deviceUseStatement = value;
    }

    /**
     * 取得 diagnosticOrder 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticOrder }
     *     
     */
    public DiagnosticOrder getDiagnosticOrder() {
        return diagnosticOrder;
    }

    /**
     * 設定 diagnosticOrder 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticOrder }
     *     
     */
    public void setDiagnosticOrder(DiagnosticOrder value) {
        this.diagnosticOrder = value;
    }

    /**
     * 取得 diagnosticReport 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticReport }
     *     
     */
    public DiagnosticReport getDiagnosticReport() {
        return diagnosticReport;
    }

    /**
     * 設定 diagnosticReport 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticReport }
     *     
     */
    public void setDiagnosticReport(DiagnosticReport value) {
        this.diagnosticReport = value;
    }

    /**
     * 取得 documentManifest 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DocumentManifest }
     *     
     */
    public DocumentManifest getDocumentManifest() {
        return documentManifest;
    }

    /**
     * 設定 documentManifest 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentManifest }
     *     
     */
    public void setDocumentManifest(DocumentManifest value) {
        this.documentManifest = value;
    }

    /**
     * 取得 documentReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReference }
     *     
     */
    public DocumentReference getDocumentReference() {
        return documentReference;
    }

    /**
     * 設定 documentReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReference }
     *     
     */
    public void setDocumentReference(DocumentReference value) {
        this.documentReference = value;
    }

    /**
     * 取得 eligibilityRequest 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityRequest }
     *     
     */
    public EligibilityRequest getEligibilityRequest() {
        return eligibilityRequest;
    }

    /**
     * 設定 eligibilityRequest 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityRequest }
     *     
     */
    public void setEligibilityRequest(EligibilityRequest value) {
        this.eligibilityRequest = value;
    }

    /**
     * 取得 eligibilityResponse 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityResponse }
     *     
     */
    public EligibilityResponse getEligibilityResponse() {
        return eligibilityResponse;
    }

    /**
     * 設定 eligibilityResponse 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityResponse }
     *     
     */
    public void setEligibilityResponse(EligibilityResponse value) {
        this.eligibilityResponse = value;
    }

    /**
     * 取得 encounter 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Encounter }
     *     
     */
    public Encounter getEncounter() {
        return encounter;
    }

    /**
     * 設定 encounter 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Encounter }
     *     
     */
    public void setEncounter(Encounter value) {
        this.encounter = value;
    }

    /**
     * 取得 enrollmentRequest 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentRequest }
     *     
     */
    public EnrollmentRequest getEnrollmentRequest() {
        return enrollmentRequest;
    }

    /**
     * 設定 enrollmentRequest 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentRequest }
     *     
     */
    public void setEnrollmentRequest(EnrollmentRequest value) {
        this.enrollmentRequest = value;
    }

    /**
     * 取得 enrollmentResponse 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentResponse }
     *     
     */
    public EnrollmentResponse getEnrollmentResponse() {
        return enrollmentResponse;
    }

    /**
     * 設定 enrollmentResponse 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentResponse }
     *     
     */
    public void setEnrollmentResponse(EnrollmentResponse value) {
        this.enrollmentResponse = value;
    }

    /**
     * 取得 episodeOfCare 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link EpisodeOfCare }
     *     
     */
    public EpisodeOfCare getEpisodeOfCare() {
        return episodeOfCare;
    }

    /**
     * 設定 episodeOfCare 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link EpisodeOfCare }
     *     
     */
    public void setEpisodeOfCare(EpisodeOfCare value) {
        this.episodeOfCare = value;
    }

    /**
     * 取得 explanationOfBenefit 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ExplanationOfBenefit }
     *     
     */
    public ExplanationOfBenefit getExplanationOfBenefit() {
        return explanationOfBenefit;
    }

    /**
     * 設定 explanationOfBenefit 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplanationOfBenefit }
     *     
     */
    public void setExplanationOfBenefit(ExplanationOfBenefit value) {
        this.explanationOfBenefit = value;
    }

    /**
     * 取得 familyMemberHistory 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link FamilyMemberHistory }
     *     
     */
    public FamilyMemberHistory getFamilyMemberHistory() {
        return familyMemberHistory;
    }

    /**
     * 設定 familyMemberHistory 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyMemberHistory }
     *     
     */
    public void setFamilyMemberHistory(FamilyMemberHistory value) {
        this.familyMemberHistory = value;
    }

    /**
     * 取得 flag 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Flag }
     *     
     */
    public Flag getFlag() {
        return flag;
    }

    /**
     * 設定 flag 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Flag }
     *     
     */
    public void setFlag(Flag value) {
        this.flag = value;
    }

    /**
     * 取得 goal 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getGoal() {
        return goal;
    }

    /**
     * 設定 goal 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setGoal(Goal value) {
        this.goal = value;
    }

    /**
     * 取得 group 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * 設定 group 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * 取得 healthcareService 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link HealthcareService }
     *     
     */
    public HealthcareService getHealthcareService() {
        return healthcareService;
    }

    /**
     * 設定 healthcareService 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthcareService }
     *     
     */
    public void setHealthcareService(HealthcareService value) {
        this.healthcareService = value;
    }

    /**
     * 取得 imagingObjectSelection 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ImagingObjectSelection }
     *     
     */
    public ImagingObjectSelection getImagingObjectSelection() {
        return imagingObjectSelection;
    }

    /**
     * 設定 imagingObjectSelection 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingObjectSelection }
     *     
     */
    public void setImagingObjectSelection(ImagingObjectSelection value) {
        this.imagingObjectSelection = value;
    }

    /**
     * 取得 imagingStudy 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ImagingStudy }
     *     
     */
    public ImagingStudy getImagingStudy() {
        return imagingStudy;
    }

    /**
     * 設定 imagingStudy 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingStudy }
     *     
     */
    public void setImagingStudy(ImagingStudy value) {
        this.imagingStudy = value;
    }

    /**
     * 取得 immunization 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Immunization }
     *     
     */
    public Immunization getImmunization() {
        return immunization;
    }

    /**
     * 設定 immunization 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Immunization }
     *     
     */
    public void setImmunization(Immunization value) {
        this.immunization = value;
    }

    /**
     * 取得 immunizationRecommendation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ImmunizationRecommendation }
     *     
     */
    public ImmunizationRecommendation getImmunizationRecommendation() {
        return immunizationRecommendation;
    }

    /**
     * 設定 immunizationRecommendation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmunizationRecommendation }
     *     
     */
    public void setImmunizationRecommendation(ImmunizationRecommendation value) {
        this.immunizationRecommendation = value;
    }

    /**
     * 取得 implementationGuide 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ImplementationGuide }
     *     
     */
    public ImplementationGuide getImplementationGuide() {
        return implementationGuide;
    }

    /**
     * 設定 implementationGuide 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ImplementationGuide }
     *     
     */
    public void setImplementationGuide(ImplementationGuide value) {
        this.implementationGuide = value;
    }

    /**
     * 取得 list 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ListDt }
     *     
     */
    public ListDt getList() {
        return list;
    }

    /**
     * 設定 list 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ListDt }
     *     
     */
    public void setList(ListDt value) {
        this.list = value;
    }

    /**
     * 取得 location 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 設定 location 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * 取得 media 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Media }
     *     
     */
    public Media getMedia() {
        return media;
    }

    /**
     * 設定 media 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Media }
     *     
     */
    public void setMedia(Media value) {
        this.media = value;
    }

    /**
     * 取得 medication 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Medication }
     *     
     */
    public Medication getMedication() {
        return medication;
    }

    /**
     * 設定 medication 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Medication }
     *     
     */
    public void setMedication(Medication value) {
        this.medication = value;
    }

    /**
     * 取得 medicationAdministration 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationAdministration }
     *     
     */
    public MedicationAdministration getMedicationAdministration() {
        return medicationAdministration;
    }

    /**
     * 設定 medicationAdministration 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationAdministration }
     *     
     */
    public void setMedicationAdministration(MedicationAdministration value) {
        this.medicationAdministration = value;
    }

    /**
     * 取得 medicationDispense 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationDispense }
     *     
     */
    public MedicationDispense getMedicationDispense() {
        return medicationDispense;
    }

    /**
     * 設定 medicationDispense 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationDispense }
     *     
     */
    public void setMedicationDispense(MedicationDispense value) {
        this.medicationDispense = value;
    }

    /**
     * 取得 medicationOrder 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationOrder }
     *     
     */
    public MedicationOrder getMedicationOrder() {
        return medicationOrder;
    }

    /**
     * 設定 medicationOrder 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationOrder }
     *     
     */
    public void setMedicationOrder(MedicationOrder value) {
        this.medicationOrder = value;
    }

    /**
     * 取得 medicationStatement 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationStatement }
     *     
     */
    public MedicationStatement getMedicationStatement() {
        return medicationStatement;
    }

    /**
     * 設定 medicationStatement 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationStatement }
     *     
     */
    public void setMedicationStatement(MedicationStatement value) {
        this.medicationStatement = value;
    }

    /**
     * 取得 messageHeader 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * 設定 messageHeader 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
    public void setMessageHeader(MessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * 取得 namingSystem 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link NamingSystem }
     *     
     */
    public NamingSystem getNamingSystem() {
        return namingSystem;
    }

    /**
     * 設定 namingSystem 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link NamingSystem }
     *     
     */
    public void setNamingSystem(NamingSystem value) {
        this.namingSystem = value;
    }

    /**
     * 取得 nutritionOrder 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link NutritionOrder }
     *     
     */
    public NutritionOrder getNutritionOrder() {
        return nutritionOrder;
    }

    /**
     * 設定 nutritionOrder 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link NutritionOrder }
     *     
     */
    public void setNutritionOrder(NutritionOrder value) {
        this.nutritionOrder = value;
    }

    /**
     * 取得 observation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Observation }
     *     
     */
    public Observation getObservation() {
        return observation;
    }

    /**
     * 設定 observation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Observation }
     *     
     */
    public void setObservation(Observation value) {
        this.observation = value;
    }

    /**
     * 取得 operationDefinition 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link OperationDefinition }
     *     
     */
    public OperationDefinition getOperationDefinition() {
        return operationDefinition;
    }

    /**
     * 設定 operationDefinition 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationDefinition }
     *     
     */
    public void setOperationDefinition(OperationDefinition value) {
        this.operationDefinition = value;
    }

    /**
     * 取得 operationOutcome 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link OperationOutcome }
     *     
     */
    public OperationOutcome getOperationOutcome() {
        return operationOutcome;
    }

    /**
     * 設定 operationOutcome 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationOutcome }
     *     
     */
    public void setOperationOutcome(OperationOutcome value) {
        this.operationOutcome = value;
    }

    /**
     * 取得 order 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * 設定 order 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
    }

    /**
     * 取得 orderResponse 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponse }
     *     
     */
    public OrderResponse getOrderResponse() {
        return orderResponse;
    }

    /**
     * 設定 orderResponse 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponse }
     *     
     */
    public void setOrderResponse(OrderResponse value) {
        this.orderResponse = value;
    }

    /**
     * 取得 organization 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * 設定 organization 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * 取得 patient 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Patient }
     *     
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * 設定 patient 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Patient }
     *     
     */
    public void setPatient(Patient value) {
        this.patient = value;
    }

    /**
     * 取得 paymentNotice 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PaymentNotice }
     *     
     */
    public PaymentNotice getPaymentNotice() {
        return paymentNotice;
    }

    /**
     * 設定 paymentNotice 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentNotice }
     *     
     */
    public void setPaymentNotice(PaymentNotice value) {
        this.paymentNotice = value;
    }

    /**
     * 取得 paymentReconciliation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReconciliation }
     *     
     */
    public PaymentReconciliation getPaymentReconciliation() {
        return paymentReconciliation;
    }

    /**
     * 設定 paymentReconciliation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReconciliation }
     *     
     */
    public void setPaymentReconciliation(PaymentReconciliation value) {
        this.paymentReconciliation = value;
    }

    /**
     * 取得 person 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * 設定 person 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * 取得 practitioner 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Practitioner }
     *     
     */
    public Practitioner getPractitioner() {
        return practitioner;
    }

    /**
     * 設定 practitioner 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Practitioner }
     *     
     */
    public void setPractitioner(Practitioner value) {
        this.practitioner = value;
    }

    /**
     * 取得 procedure 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Procedure }
     *     
     */
    public Procedure getProcedure() {
        return procedure;
    }

    /**
     * 設定 procedure 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Procedure }
     *     
     */
    public void setProcedure(Procedure value) {
        this.procedure = value;
    }

    /**
     * 取得 procedureRequest 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureRequest }
     *     
     */
    public ProcedureRequest getProcedureRequest() {
        return procedureRequest;
    }

    /**
     * 設定 procedureRequest 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureRequest }
     *     
     */
    public void setProcedureRequest(ProcedureRequest value) {
        this.procedureRequest = value;
    }

    /**
     * 取得 processRequest 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRequest }
     *     
     */
    public ProcessRequest getProcessRequest() {
        return processRequest;
    }

    /**
     * 設定 processRequest 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRequest }
     *     
     */
    public void setProcessRequest(ProcessRequest value) {
        this.processRequest = value;
    }

    /**
     * 取得 processResponse 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ProcessResponse }
     *     
     */
    public ProcessResponse getProcessResponse() {
        return processResponse;
    }

    /**
     * 設定 processResponse 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessResponse }
     *     
     */
    public void setProcessResponse(ProcessResponse value) {
        this.processResponse = value;
    }

    /**
     * 取得 provenance 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Provenance }
     *     
     */
    public Provenance getProvenance() {
        return provenance;
    }

    /**
     * 設定 provenance 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Provenance }
     *     
     */
    public void setProvenance(Provenance value) {
        this.provenance = value;
    }

    /**
     * 取得 questionnaire 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Questionnaire }
     *     
     */
    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    /**
     * 設定 questionnaire 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Questionnaire }
     *     
     */
    public void setQuestionnaire(Questionnaire value) {
        this.questionnaire = value;
    }

    /**
     * 取得 questionnaireResponse 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link QuestionnaireResponse }
     *     
     */
    public QuestionnaireResponse getQuestionnaireResponse() {
        return questionnaireResponse;
    }

    /**
     * 設定 questionnaireResponse 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionnaireResponse }
     *     
     */
    public void setQuestionnaireResponse(QuestionnaireResponse value) {
        this.questionnaireResponse = value;
    }

    /**
     * 取得 referralRequest 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ReferralRequest }
     *     
     */
    public ReferralRequest getReferralRequest() {
        return referralRequest;
    }

    /**
     * 設定 referralRequest 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferralRequest }
     *     
     */
    public void setReferralRequest(ReferralRequest value) {
        this.referralRequest = value;
    }

    /**
     * 取得 relatedPerson 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPerson }
     *     
     */
    public RelatedPerson getRelatedPerson() {
        return relatedPerson;
    }

    /**
     * 設定 relatedPerson 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPerson }
     *     
     */
    public void setRelatedPerson(RelatedPerson value) {
        this.relatedPerson = value;
    }

    /**
     * 取得 riskAssessment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link RiskAssessment }
     *     
     */
    public RiskAssessment getRiskAssessment() {
        return riskAssessment;
    }

    /**
     * 設定 riskAssessment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskAssessment }
     *     
     */
    public void setRiskAssessment(RiskAssessment value) {
        this.riskAssessment = value;
    }

    /**
     * 取得 schedule 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * 設定 schedule 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setSchedule(Schedule value) {
        this.schedule = value;
    }

    /**
     * 取得 searchParameter 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SearchParameter }
     *     
     */
    public SearchParameter getSearchParameter() {
        return searchParameter;
    }

    /**
     * 設定 searchParameter 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchParameter }
     *     
     */
    public void setSearchParameter(SearchParameter value) {
        this.searchParameter = value;
    }

    /**
     * 取得 slot 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Slot }
     *     
     */
    public Slot getSlot() {
        return slot;
    }

    /**
     * 設定 slot 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Slot }
     *     
     */
    public void setSlot(Slot value) {
        this.slot = value;
    }

    /**
     * 取得 specimen 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Specimen }
     *     
     */
    public Specimen getSpecimen() {
        return specimen;
    }

    /**
     * 設定 specimen 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Specimen }
     *     
     */
    public void setSpecimen(Specimen value) {
        this.specimen = value;
    }

    /**
     * 取得 structureDefinition 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StructureDefinition }
     *     
     */
    public StructureDefinition getStructureDefinition() {
        return structureDefinition;
    }

    /**
     * 設定 structureDefinition 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureDefinition }
     *     
     */
    public void setStructureDefinition(StructureDefinition value) {
        this.structureDefinition = value;
    }

    /**
     * 取得 subscription 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * 設定 subscription 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * 取得 substance 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Substance }
     *     
     */
    public Substance getSubstance() {
        return substance;
    }

    /**
     * 設定 substance 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Substance }
     *     
     */
    public void setSubstance(Substance value) {
        this.substance = value;
    }

    /**
     * 取得 supplyDelivery 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SupplyDelivery }
     *     
     */
    public SupplyDelivery getSupplyDelivery() {
        return supplyDelivery;
    }

    /**
     * 設定 supplyDelivery 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyDelivery }
     *     
     */
    public void setSupplyDelivery(SupplyDelivery value) {
        this.supplyDelivery = value;
    }

    /**
     * 取得 supplyRequest 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SupplyRequest }
     *     
     */
    public SupplyRequest getSupplyRequest() {
        return supplyRequest;
    }

    /**
     * 設定 supplyRequest 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyRequest }
     *     
     */
    public void setSupplyRequest(SupplyRequest value) {
        this.supplyRequest = value;
    }

    /**
     * 取得 testScript 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link TestScript }
     *     
     */
    public TestScript getTestScript() {
        return testScript;
    }

    /**
     * 設定 testScript 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link TestScript }
     *     
     */
    public void setTestScript(TestScript value) {
        this.testScript = value;
    }

    /**
     * 取得 valueSet 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ValueSet }
     *     
     */
    public ValueSet getValueSet() {
        return valueSet;
    }

    /**
     * 設定 valueSet 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSet }
     *     
     */
    public void setValueSet(ValueSet value) {
        this.valueSet = value;
    }

    /**
     * 取得 visionPrescription 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link VisionPrescription }
     *     
     */
    public VisionPrescription getVisionPrescription() {
        return visionPrescription;
    }

    /**
     * 設定 visionPrescription 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link VisionPrescription }
     *     
     */
    public void setVisionPrescription(VisionPrescription value) {
        this.visionPrescription = value;
    }

    /**
     * 取得 parameters 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * 設定 parameters 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    public void setParameters(Parameters value) {
        this.parameters = value;
    }

}
