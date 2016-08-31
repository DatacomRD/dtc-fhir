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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Condition complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Condition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="asserter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="dateRecorded" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="clinicalStatus" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="verificationStatus" type="{http://hl7.org/fhir}ConditionVerificationStatus"/>
 *         &lt;element name="severity" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="onsetDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="onsetQuantity" type="{http://hl7.org/fhir}Age"/>
 *           &lt;element name="onsetPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="onsetRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="onsetString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="abatementDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="abatementQuantity" type="{http://hl7.org/fhir}Age"/>
 *           &lt;element name="abatementBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="abatementPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="abatementRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="abatementString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;element name="stage" type="{http://hl7.org/fhir}Condition.Stage" minOccurs="0"/>
 *         &lt;element name="evidence" type="{http://hl7.org/fhir}Condition.Evidence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condition", propOrder = {
    "identifier",
    "patient",
    "encounter",
    "asserter",
    "dateRecorded",
    "code",
    "category",
    "clinicalStatus",
    "verificationStatus",
    "severity",
    "onsetDateTime",
    "onsetQuantity",
    "onsetPeriod",
    "onsetRange",
    "onsetString",
    "abatementDateTime",
    "abatementQuantity",
    "abatementBoolean",
    "abatementPeriod",
    "abatementRange",
    "abatementString",
    "stage",
    "evidence",
    "bodySite",
    "notes"
})
public class Condition
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected Reference patient;
    protected Reference encounter;
    protected Reference asserter;
    protected Date dateRecorded;
    @XmlElement(required = true)
    protected CodeableConcept code;
    protected CodeableConcept category;
    protected Code clinicalStatus;
    @XmlElement(required = true)
    protected ConditionVerificationStatus verificationStatus;
    protected CodeableConcept severity;
    protected DateTime onsetDateTime;
    protected Age onsetQuantity;
    protected Period onsetPeriod;
    protected Range onsetRange;
    protected StringDt onsetString;
    protected DateTime abatementDateTime;
    protected Age abatementQuantity;
    protected BooleanDt abatementBoolean;
    protected Period abatementPeriod;
    protected Range abatementRange;
    protected StringDt abatementString;
    protected ConditionStage stage;
    protected List<ConditionEvidence> evidence;
    protected List<CodeableConcept> bodySite;
    protected StringDt notes;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * 取得 patient 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPatient() {
        return patient;
    }

    /**
     * 設定 patient 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPatient(Reference value) {
        this.patient = value;
    }

    /**
     * 取得 encounter 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * 設定 encounter 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setEncounter(Reference value) {
        this.encounter = value;
    }

    /**
     * 取得 asserter 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getAsserter() {
        return asserter;
    }

    /**
     * 設定 asserter 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setAsserter(Reference value) {
        this.asserter = value;
    }

    /**
     * 取得 dateRecorded 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateRecorded() {
        return dateRecorded;
    }

    /**
     * 設定 dateRecorded 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateRecorded(Date value) {
        this.dateRecorded = value;
    }

    /**
     * 取得 code 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * 設定 code 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * 取得 category 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * 設定 category 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCategory(CodeableConcept value) {
        this.category = value;
    }

    /**
     * 取得 clinicalStatus 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getClinicalStatus() {
        return clinicalStatus;
    }

    /**
     * 設定 clinicalStatus 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setClinicalStatus(Code value) {
        this.clinicalStatus = value;
    }

    /**
     * 取得 verificationStatus 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ConditionVerificationStatus }
     *     
     */
    public ConditionVerificationStatus getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * 設定 verificationStatus 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionVerificationStatus }
     *     
     */
    public void setVerificationStatus(ConditionVerificationStatus value) {
        this.verificationStatus = value;
    }

    /**
     * 取得 severity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSeverity() {
        return severity;
    }

    /**
     * 設定 severity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSeverity(CodeableConcept value) {
        this.severity = value;
    }

    /**
     * 取得 onsetDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getOnsetDateTime() {
        return onsetDateTime;
    }

    /**
     * 設定 onsetDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setOnsetDateTime(DateTime value) {
        this.onsetDateTime = value;
    }

    /**
     * 取得 onsetQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    public Age getOnsetQuantity() {
        return onsetQuantity;
    }

    /**
     * 設定 onsetQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setOnsetQuantity(Age value) {
        this.onsetQuantity = value;
    }

    /**
     * 取得 onsetPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getOnsetPeriod() {
        return onsetPeriod;
    }

    /**
     * 設定 onsetPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setOnsetPeriod(Period value) {
        this.onsetPeriod = value;
    }

    /**
     * 取得 onsetRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getOnsetRange() {
        return onsetRange;
    }

    /**
     * 設定 onsetRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setOnsetRange(Range value) {
        this.onsetRange = value;
    }

    /**
     * 取得 onsetString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getOnsetString() {
        return onsetString;
    }

    /**
     * 設定 onsetString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setOnsetString(StringDt value) {
        this.onsetString = value;
    }

    /**
     * 取得 abatementDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getAbatementDateTime() {
        return abatementDateTime;
    }

    /**
     * 設定 abatementDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setAbatementDateTime(DateTime value) {
        this.abatementDateTime = value;
    }

    /**
     * 取得 abatementQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    public Age getAbatementQuantity() {
        return abatementQuantity;
    }

    /**
     * 設定 abatementQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setAbatementQuantity(Age value) {
        this.abatementQuantity = value;
    }

    /**
     * 取得 abatementBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getAbatementBoolean() {
        return abatementBoolean;
    }

    /**
     * 設定 abatementBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setAbatementBoolean(BooleanDt value) {
        this.abatementBoolean = value;
    }

    /**
     * 取得 abatementPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getAbatementPeriod() {
        return abatementPeriod;
    }

    /**
     * 設定 abatementPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setAbatementPeriod(Period value) {
        this.abatementPeriod = value;
    }

    /**
     * 取得 abatementRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getAbatementRange() {
        return abatementRange;
    }

    /**
     * 設定 abatementRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setAbatementRange(Range value) {
        this.abatementRange = value;
    }

    /**
     * 取得 abatementString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getAbatementString() {
        return abatementString;
    }

    /**
     * 設定 abatementString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setAbatementString(StringDt value) {
        this.abatementString = value;
    }

    /**
     * 取得 stage 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ConditionStage }
     *     
     */
    public ConditionStage getStage() {
        return stage;
    }

    /**
     * 設定 stage 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionStage }
     *     
     */
    public void setStage(ConditionStage value) {
        this.stage = value;
    }

    /**
     * Gets the value of the evidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionEvidence }
     * 
     * 
     */
    public List<ConditionEvidence> getEvidence() {
        if (evidence == null) {
            evidence = new ArrayList<ConditionEvidence>();
        }
        return this.evidence;
    }

    /**
     * Gets the value of the bodySite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodySite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodySite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getBodySite() {
        if (bodySite == null) {
            bodySite = new ArrayList<CodeableConcept>();
        }
        return this.bodySite;
    }

    /**
     * 取得 notes 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getNotes() {
        return notes;
    }

    /**
     * 設定 notes 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setNotes(StringDt value) {
        this.notes = value;
    }

}
