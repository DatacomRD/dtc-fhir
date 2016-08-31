//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A resource that includes narrative, extensions, and contained resources.
 * 
 * <p>DomainResource complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="DomainResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://hl7.org/fhir}Narrative" minOccurs="0"/>
 *         &lt;element name="contained" type="{http://hl7.org/fhir}ResourceContainer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modifierExtension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainResource", propOrder = {
    "text",
    "contained",
    "extension",
    "modifierExtension"
})
@XmlSeeAlso({
    Appointment.class,
    Account.class,
    ReferralRequest.class,
    Provenance.class,
    Questionnaire.class,
    ExplanationOfBenefit.class,
    DocumentManifest.class,
    Specimen.class,
    AllergyIntolerance.class,
    CarePlan.class,
    Goal.class,
    StructureDefinition.class,
    EnrollmentRequest.class,
    EpisodeOfCare.class,
    OperationOutcome.class,
    Medication.class,
    Procedure.class,
    ListDt.class,
    ConceptMap.class,
    Subscription.class,
    OperationDefinition.class,
    ValueSet.class,
    DocumentReference.class,
    Order.class,
    Immunization.class,
    Device.class,
    VisionPrescription.class,
    Media.class,
    Conformance.class,
    EligibilityResponse.class,
    ProcedureRequest.class,
    DeviceUseRequest.class,
    DeviceMetric.class,
    Flag.class,
    RelatedPerson.class,
    SupplyRequest.class,
    AppointmentResponse.class,
    Practitioner.class,
    Observation.class,
    MedicationAdministration.class,
    Slot.class,
    EnrollmentResponse.class,
    MedicationStatement.class,
    Contract.class,
    Person.class,
    CommunicationRequest.class,
    RiskAssessment.class,
    TestScript.class,
    Basic.class,
    Group.class,
    PaymentNotice.class,
    Organization.class,
    ImplementationGuide.class,
    ClaimResponse.class,
    EligibilityRequest.class,
    ProcessRequest.class,
    MedicationDispense.class,
    DiagnosticReport.class,
    ImagingObjectSelection.class,
    ImagingStudy.class,
    HealthcareService.class,
    DataElement.class,
    DeviceComponent.class,
    FamilyMemberHistory.class,
    NutritionOrder.class,
    Encounter.class,
    Substance.class,
    AuditEvent.class,
    MedicationOrder.class,
    SearchParameter.class,
    PaymentReconciliation.class,
    Communication.class,
    Condition.class,
    Composition.class,
    DetectedIssue.class,
    DiagnosticOrder.class,
    Patient.class,
    Coverage.class,
    OrderResponse.class,
    QuestionnaireResponse.class,
    DeviceUseStatement.class,
    ProcessResponse.class,
    NamingSystem.class,
    Schedule.class,
    SupplyDelivery.class,
    ClinicalImpression.class,
    MessageHeader.class,
    Claim.class,
    BodySite.class,
    ImmunizationRecommendation.class,
    Location.class
})
public class DomainResource
    extends Resource
{

    protected Narrative text;
    protected List<ResourceContainer> contained;
    protected List<Extension> extension;
    protected List<Extension> modifierExtension;

    /**
     * 取得 text 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Narrative }
     *     
     */
    public Narrative getText() {
        return text;
    }

    /**
     * 設定 text 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Narrative }
     *     
     */
    public void setText(Narrative value) {
        this.text = value;
    }

    /**
     * Gets the value of the contained property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contained property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContained().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceContainer }
     * 
     * 
     */
    public List<ResourceContainer> getContained() {
        if (contained == null) {
            contained = new ArrayList<ResourceContainer>();
        }
        return this.contained;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the modifierExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifierExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifierExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getModifierExtension() {
        if (modifierExtension == null) {
            modifierExtension = new ArrayList<Extension>();
        }
        return this.modifierExtension;
    }

}
