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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>BackboneElement complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="BackboneElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
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
@XmlType(name = "BackboneElement", propOrder = {
    "modifierExtension"
})
@XmlSeeAlso({
    ContractSigner.class,
    ProvenanceEntity.class,
    DocumentReferenceRelatesTo.class,
    ImagingObjectSelectionFrames.class,
    ContractRule.class,
    ConformanceMessaging.class,
    EncounterStatusHistory.class,
    ClaimResponseError.class,
    ClaimResponseDetail.class,
    ProcessRequestItem.class,
    SubstanceIngredient.class,
    ValueSetParameter.class,
    PractitionerPractitionerRole.class,
    ImmunizationRecommendationDateCriterion.class,
    DetectedIssueMitigation.class,
    DocumentManifestContent.class,
    ObservationRelated.class,
    CompositionSection.class,
    MedicationPackage.class,
    ValueSetContact.class,
    NutritionOrderSupplement.class,
    MedicationOrderDosageInstruction.class,
    SpecimenContainer.class,
    CompositionAttester.class,
    ValueSetContains.class,
    NamingSystemUniqueId.class,
    ImagingObjectSelectionSeries.class,
    PatientCommunication.class,
    TestScriptCapability.class,
    TestScriptTest.class,
    ClaimResponseDetail1 .class,
    MedicationStatementDosage.class,
    ImagingObjectSelectionInstance.class,
    OperationDefinitionBinding.class,
    DocumentReferenceContext.class,
    AuditEventSource.class,
    BundleRequest.class,
    MessageHeaderDestination.class,
    ValueSetCodeSystem.class,
    ClaimMissingTeeth.class,
    ImmunizationExplanation.class,
    ContractValuedItem.class,
    ClaimResponseAdjudication.class,
    MedicationAdministrationDosage.class,
    ConformanceImplementation.class,
    StructureDefinitionMapping.class,
    ValueSetFilter.class,
    DeviceComponentProductionSpecification.class,
    ImagingStudySeries.class,
    HealthcareServiceNotAvailable.class,
    HealthcareServiceServiceType.class,
    CarePlanActivity.class,
    TestScriptLink.class,
    SpecimenTreatment.class,
    NutritionOrderAdministration.class,
    ImplementationGuideDependency.class,
    CommunicationRequestPayload.class,
    SupplyRequestWhen.class,
    ClaimResponseAddItem.class,
    ContractActor.class,
    ConditionEvidence.class,
    QuestionnaireQuestion.class,
    ClaimSubDetail.class,
    TestScriptAction.class,
    AuditEventEvent.class,
    OperationDefinitionContact.class,
    OperationOutcomeIssue.class,
    NutritionOrderNutrient.class,
    MedicationContent.class,
    ContractLegal.class,
    GroupMember.class,
    ConditionStage.class,
    ConformanceDocument.class,
    ClaimCoverage.class,
    ConceptMapTarget.class,
    ContractValuedItem1 .class,
    ConformanceContact.class,
    HealthcareServiceAvailableTime.class,
    QuestionnaireResponseAnswer.class,
    ContractTerm.class,
    ClaimDiagnosis.class,
    ImplementationGuideGlobal.class,
    ConformanceSecurity.class,
    MedicationDispenseSubstitution.class,
    StructureDefinitionDifferential.class,
    TestScriptMetadata.class,
    ConceptMapContact.class,
    DocumentReferenceRelated.class,
    NutritionOrderTexture.class,
    ConformanceResource.class,
    PersonLink.class,
    DocumentManifestRelated.class,
    ContractActor1 .class,
    ImagingStudyInstance.class,
    ImmunizationVaccinationProtocol.class,
    QuestionnaireGroup.class,
    DocumentReferenceContent.class,
    CarePlanDetail.class,
    CommunicationPayload.class,
    QuestionnaireResponseGroup.class,
    ConceptMapDependsOn.class,
    CompositionEvent.class,
    PatientContact.class,
    ValueSetCompose.class,
    TestScriptContact.class,
    ListEntry.class,
    ConformanceInteraction1 .class,
    ConformanceSearchParam.class,
    ConformanceSoftware.class,
    AuditEventNetwork.class,
    TestScriptSetup.class,
    AuditEventDetail.class,
    DiagnosticReportImage.class,
    ClaimResponseSubDetail.class,
    ClaimResponseCoverage.class,
    EncounterParticipant.class,
    AllergyIntoleranceReaction.class,
    DeviceMetricCalibration.class,
    ProcedurePerformer.class,
    RiskAssessmentPrediction.class,
    ClaimItem.class,
    QuestionnaireResponseQuestion.class,
    NutritionOrderEnteralFormula.class,
    SpecimenCollection.class,
    ProvenanceAgent.class,
    CarePlanParticipant.class,
    NamingSystemContact.class,
    ConformanceCertificate.class,
    DiagnosticOrderEvent.class,
    ConformanceRest.class,
    ObservationComponent.class,
    ValueSetConcept.class,
    ConformanceOperation.class,
    ClaimResponseAdjudication1 .class,
    ClaimResponseAdjudication2 .class,
    DataElementMapping.class,
    ClaimResponseAdjudication3 .class,
    ClaimResponseAdjudication4 .class,
    ProcedureFocalDevice.class,
    SearchParameterContact.class,
    GoalOutcome.class,
    OrganizationContact.class,
    TestScriptVariable.class,
    ObservationReferenceRange.class,
    MedicationProduct.class,
    ImmunizationRecommendationProtocol.class,
    TestScriptFixture.class,
    StructureDefinitionContact.class,
    OperationDefinitionParameter.class,
    GroupCharacteristic.class,
    AuditEventObject.class,
    SubstanceInstance.class,
    DataElementContact.class,
    StructureDefinitionSnapshot.class,
    BundleEntry.class,
    ClinicalImpressionFinding.class,
    BundleSearch.class,
    TestScriptRequestHeader.class,
    AppointmentParticipant.class,
    MedicationIngredient.class,
    PractitionerQualification.class,
    ImmunizationReaction.class,
    TestScriptAssert.class,
    SubscriptionChannel.class,
    AuditEventParticipant.class,
    TestScriptOperation.class,
    ConceptMapElement.class,
    TestScriptAction2 .class,
    TestScriptAction1 .class,
    ImplementationGuideResource.class,
    OrderWhen.class,
    MedicationOrderSubstitution.class,
    ContractFriendly.class,
    EncounterLocation.class,
    MedicationBatch.class,
    MedicationOrderDispenseRequest.class,
    EpisodeOfCareCareTeam.class,
    FamilyMemberHistoryCondition.class,
    ConformanceEndpoint.class,
    DiagnosticOrderItem.class,
    MedicationDispenseDosageInstruction.class,
    ClaimResponseItem.class,
    ConformanceInteraction.class,
    EncounterHospitalization.class,
    PatientLink.class,
    ProvenanceRelatedAgent.class,
    ImagingObjectSelectionStudy.class,
    NutritionOrderOralDiet.class,
    ClaimDetail.class,
    ClaimProsthesis.class,
    PatientAnimal.class,
    ClinicalImpressionInvestigations.class,
    LocationPosition.class,
    TestScriptTeardown.class,
    ConformanceEvent.class,
    ClinicalImpressionRuledOut.class,
    PaymentReconciliationNote.class,
    ValueSetConcept1 .class,
    ImplementationGuidePage.class,
    EpisodeOfCareStatusHistory.class,
    PaymentReconciliationDetail.class,
    VisionPrescriptionDispense.class,
    ImplementationGuidePackage.class,
    ImplementationGuideContact.class,
    ValueSetInclude.class,
    ClaimResponseNote.class,
    MessageHeaderSource.class,
    MessageHeaderResponse.class,
    ValueSetExpansion.class,
    BundleResponse.class,
    ParametersParameter.class,
    BundleLink.class,
    CarePlanRelatedPlan.class,
    ClaimPayee.class,
    ImmunizationRecommendationRecommendation.class,
    ProcessResponseNotes.class,
    ValueSetDesignation.class
})
public class BackboneElement
    extends Element
{

    protected List<Extension> modifierExtension;

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
