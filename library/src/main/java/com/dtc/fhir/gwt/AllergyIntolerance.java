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
 * <p>AllergyIntolerance complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="AllergyIntolerance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onset" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="recordedDate" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="recorder" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="reporter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="substance" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}AllergyIntoleranceStatus" minOccurs="0"/>
 *         &lt;element name="criticality" type="{http://hl7.org/fhir}AllergyIntoleranceCriticality" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}AllergyIntoleranceType" minOccurs="0"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}AllergyIntoleranceCategory" minOccurs="0"/>
 *         &lt;element name="lastOccurence" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" minOccurs="0"/>
 *         &lt;element name="reaction" type="{http://hl7.org/fhir}AllergyIntolerance.Reaction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllergyIntolerance", propOrder = {
    "identifier",
    "onset",
    "recordedDate",
    "recorder",
    "patient",
    "reporter",
    "substance",
    "status",
    "criticality",
    "type",
    "category",
    "lastOccurence",
    "note",
    "reaction"
})
public class AllergyIntolerance
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected DateTime onset;
    protected DateTime recordedDate;
    protected Reference recorder;
    @XmlElement(required = true)
    protected Reference patient;
    protected Reference reporter;
    @XmlElement(required = true)
    protected CodeableConcept substance;
    protected AllergyIntoleranceStatus status;
    protected AllergyIntoleranceCriticality criticality;
    protected AllergyIntoleranceType type;
    protected AllergyIntoleranceCategory category;
    protected DateTime lastOccurence;
    protected Annotation note;
    protected List<AllergyIntoleranceReaction> reaction;

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
     * 取得 onset 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getOnset() {
        return onset;
    }

    /**
     * 設定 onset 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setOnset(DateTime value) {
        this.onset = value;
    }

    /**
     * 取得 recordedDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getRecordedDate() {
        return recordedDate;
    }

    /**
     * 設定 recordedDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setRecordedDate(DateTime value) {
        this.recordedDate = value;
    }

    /**
     * 取得 recorder 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRecorder() {
        return recorder;
    }

    /**
     * 設定 recorder 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRecorder(Reference value) {
        this.recorder = value;
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
     * 取得 reporter 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReporter() {
        return reporter;
    }

    /**
     * 設定 reporter 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReporter(Reference value) {
        this.reporter = value;
    }

    /**
     * 取得 substance 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSubstance() {
        return substance;
    }

    /**
     * 設定 substance 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSubstance(CodeableConcept value) {
        this.substance = value;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AllergyIntoleranceStatus }
     *     
     */
    public AllergyIntoleranceStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AllergyIntoleranceStatus }
     *     
     */
    public void setStatus(AllergyIntoleranceStatus value) {
        this.status = value;
    }

    /**
     * 取得 criticality 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AllergyIntoleranceCriticality }
     *     
     */
    public AllergyIntoleranceCriticality getCriticality() {
        return criticality;
    }

    /**
     * 設定 criticality 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AllergyIntoleranceCriticality }
     *     
     */
    public void setCriticality(AllergyIntoleranceCriticality value) {
        this.criticality = value;
    }

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AllergyIntoleranceType }
     *     
     */
    public AllergyIntoleranceType getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AllergyIntoleranceType }
     *     
     */
    public void setType(AllergyIntoleranceType value) {
        this.type = value;
    }

    /**
     * 取得 category 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AllergyIntoleranceCategory }
     *     
     */
    public AllergyIntoleranceCategory getCategory() {
        return category;
    }

    /**
     * 設定 category 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AllergyIntoleranceCategory }
     *     
     */
    public void setCategory(AllergyIntoleranceCategory value) {
        this.category = value;
    }

    /**
     * 取得 lastOccurence 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLastOccurence() {
        return lastOccurence;
    }

    /**
     * 設定 lastOccurence 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLastOccurence(DateTime value) {
        this.lastOccurence = value;
    }

    /**
     * 取得 note 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getNote() {
        return note;
    }

    /**
     * 設定 note 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setNote(Annotation value) {
        this.note = value;
    }

    /**
     * Gets the value of the reaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllergyIntoleranceReaction }
     * 
     * 
     */
    public List<AllergyIntoleranceReaction> getReaction() {
        if (reaction == null) {
            reaction = new ArrayList<AllergyIntoleranceReaction>();
        }
        return this.reaction;
    }

}
