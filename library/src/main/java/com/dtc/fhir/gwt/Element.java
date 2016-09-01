//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Element complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://hl7.org/fhir}id-primitive" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Element", propOrder = {
    "extension"
})
@XmlSeeAlso({
    ElementDefinitionSlicing.class,
    InstanceAvailability.class,
    ClaimType.class,
    EncounterClass.class,
    MedicationOrderStatus.class,
    ConditionVerificationStatus.class,
    CommunicationRequestStatus.class,
    AllergyIntoleranceType.class,
    CarePlanActivityStatus.class,
    LocationStatus.class,
    NamingSystemIdentifierType.class,
    ContactPoint.class,
    OrderStatus.class,
    DeviceMetricCalibrationState.class,
    SlotStatus.class,
    VisionEyes.class,
    OperationKind.class,
    GuideResourcePurpose.class,
    NoteType.class,
    SubscriptionChannelType.class,
    ExtensionContext.class,
    DeviceStatus.class,
    AddressType.class,
    RestfulConformanceMode.class,
    FlagStatus.class,
    DocumentMode.class,
    ClinicalImpressionStatus.class,
    Attachment.class,
    ProvenanceEntityRole.class,
    ReferralStatus.class,
    DeviceMetricCategory.class,
    ResponseType.class,
    CompositionStatus.class,
    RemittanceOutcome.class,
    Decimal.class,
    DocumentReferenceStatus.class,
    CodeableConcept.class,
    SearchEntryMode.class,
    DigitalMediaType.class,
    NarrativeStatus.class,
    DetectedIssueSeverity.class,
    UnitsOfTime.class,
    UnsignedInt.class,
    Address.class,
    AggregationMode.class,
    AppointmentStatus.class,
    Id.class,
    ElementDefinition.class,
    GroupType.class,
    UnknownContentCode.class,
    Timing.class,
    ActionList.class,
    DateTime.class,
    ParticipationStatus.class,
    Instant.class,
    LocationMode.class,
    DocumentRelationshipType.class,
    ResourceVersionPolicy.class,
    Use.class,
    Uri.class,
    AdministrativeGender.class,
    Annotation.class,
    LinkType.class,
    EventTiming.class,
    DeviceMetricCalibrationType.class,
    IntegerDt.class,
    FamilyHistoryStatus.class,
    Range.class,
    Base64Binary.class,
    IssueSeverity.class,
    SampledDataDataType.class,
    Code.class,
    PropertyRepresentation.class,
    CarePlanStatus.class,
    Oid.class,
    SupplyDeliveryStatus.class,
    ProcedureStatus.class,
    TimingRepeat.class,
    EpisodeOfCareStatus.class,
    IssueType.class,
    DeviceMetricColor.class,
    SearchParamType.class,
    NamingSystemType.class,
    AllergyIntoleranceStatus.class,
    SubscriptionStatus.class,
    CompositionAttestationMode.class,
    Meta.class,
    MedicationAdministrationStatus.class,
    VisionBase.class,
    BundleType.class,
    SampledData.class,
    AllergyIntoleranceSeverity.class,
    EncounterState.class,
    SystemRestfulInteraction.class,
    FilterOperator.class,
    DeviceUseRequestStatus.class,
    ConceptMapEquivalence.class,
    AnswerFormat.class,
    SupplyRequestStatus.class,
    QuantityComparator.class,
    OperationParameterUse.class,
    TransactionMode.class,
    Markdown.class,
    ObservationRelationshipType.class,
    IdentifierUse.class,
    StructureDefinitionKind.class,
    QuestionnaireStatus.class,
    BindingStrength.class,
    ConformanceResourceStatus.class,
    Identifier.class,
    ConformanceStatementKind.class,
    ContactPointSystem.class,
    GuidePageKind.class,
    GoalStatus.class,
    StringDt.class,
    ParticipantStatus.class,
    SpecimenStatus.class,
    SearchModifierCode.class,
    AllergyIntoleranceCriticality.class,
    XPathUsageType.class,
    ListStatus.class,
    ConditionalDeleteStatus.class,
    AuditEventAction.class,
    Extension.class,
    ParticipantRequired.class,
    SlicingRules.class,
    Time.class,
    HTTPVerb.class,
    DeviceUseRequestPriority.class,
    ContentType.class,
    NameUse.class,
    DiagnosticOrderStatus.class,
    Coding.class,
    MessageSignificanceCategory.class,
    PositiveInt.class,
    DaysOfWeek.class,
    AssertionResponseTypes.class,
    AllergyIntoleranceCategory.class,
    ElementDefinitionBinding.class,
    AssertionDirectionType.class,
    CommunicationStatus.class,
    ProcedureRequestPriority.class,
    TypeRestfulInteraction.class,
    ObservationStatus.class,
    ElementDefinitionMapping.class,
    ElementDefinitionBase.class,
    Ratio.class,
    AuditEventOutcome.class,
    DiagnosticReportStatus.class,
    Reference.class,
    AuditEventParticipantNetworkType.class,
    QuestionnaireResponseStatus.class,
    DeviceMetricOperationalStatus.class,
    Date.class,
    ElementDefinitionConstraint.class,
    ConstraintSeverity.class,
    Uuid.class,
    ListMode.class,
    AccountStatus.class,
    MedicationStatementStatus.class,
    ProcedureRequestStatus.class,
    NutritionOrderStatus.class,
    Narrative.class,
    DataElementStringency.class,
    GuideDependencyType.class,
    AssertionOperatorType.class,
    Period.class,
    CarePlanRelationship.class,
    HumanName.class,
    AddressUse.class,
    ConformanceEventMode.class,
    MeasmntPrinciple.class,
    ContactPointUse.class,
    ElementDefinitionType.class,
    Quantity.class,
    AllergyIntoleranceCertainty.class,
    BooleanDt.class,
    MedicationDispenseStatus.class,
    BackboneElement.class,
    Signature.class,
    EncounterLocationStatus.class,
    DiagnosticOrderPriority.class,
    IdentityAssuranceLevel.class
})
public class Element implements Serializable {

    protected List<Extension> extension;
    @XmlAttribute(name = "id")
    protected String id;

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
     * 取得 id 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 設定 id 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
