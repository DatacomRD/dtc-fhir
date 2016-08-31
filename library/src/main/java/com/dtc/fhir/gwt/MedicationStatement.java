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
 * <p>MedicationStatement complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="MedicationStatement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="informationSource" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="dateAsserted" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}MedicationStatementStatus"/>
 *         &lt;element name="wasNotTaken" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="reasonNotTaken" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="reasonForUseCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="reasonForUseReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="effectiveDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="effectivePeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;element name="note" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="supportingInformation" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="medicationCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="medicationReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="dosage" type="{http://hl7.org/fhir}MedicationStatement.Dosage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationStatement", propOrder = {
    "identifier",
    "patient",
    "informationSource",
    "dateAsserted",
    "status",
    "wasNotTaken",
    "reasonNotTaken",
    "reasonForUseCodeableConcept",
    "reasonForUseReference",
    "effectiveDateTime",
    "effectivePeriod",
    "note",
    "supportingInformation",
    "medicationCodeableConcept",
    "medicationReference",
    "dosage"
})
public class MedicationStatement
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected Reference patient;
    protected Reference informationSource;
    protected DateTime dateAsserted;
    @XmlElement(required = true)
    protected MedicationStatementStatus status;
    protected BooleanDt wasNotTaken;
    protected List<CodeableConcept> reasonNotTaken;
    protected CodeableConcept reasonForUseCodeableConcept;
    protected Reference reasonForUseReference;
    protected DateTime effectiveDateTime;
    protected Period effectivePeriod;
    protected StringDt note;
    protected List<Reference> supportingInformation;
    protected CodeableConcept medicationCodeableConcept;
    protected Reference medicationReference;
    protected List<MedicationStatementDosage> dosage;

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
     * 取得 informationSource 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getInformationSource() {
        return informationSource;
    }

    /**
     * 設定 informationSource 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setInformationSource(Reference value) {
        this.informationSource = value;
    }

    /**
     * 取得 dateAsserted 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateAsserted() {
        return dateAsserted;
    }

    /**
     * 設定 dateAsserted 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateAsserted(DateTime value) {
        this.dateAsserted = value;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationStatementStatus }
     *     
     */
    public MedicationStatementStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationStatementStatus }
     *     
     */
    public void setStatus(MedicationStatementStatus value) {
        this.status = value;
    }

    /**
     * 取得 wasNotTaken 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getWasNotTaken() {
        return wasNotTaken;
    }

    /**
     * 設定 wasNotTaken 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setWasNotTaken(BooleanDt value) {
        this.wasNotTaken = value;
    }

    /**
     * Gets the value of the reasonNotTaken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonNotTaken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonNotTaken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getReasonNotTaken() {
        if (reasonNotTaken == null) {
            reasonNotTaken = new ArrayList<CodeableConcept>();
        }
        return this.reasonNotTaken;
    }

    /**
     * 取得 reasonForUseCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReasonForUseCodeableConcept() {
        return reasonForUseCodeableConcept;
    }

    /**
     * 設定 reasonForUseCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReasonForUseCodeableConcept(CodeableConcept value) {
        this.reasonForUseCodeableConcept = value;
    }

    /**
     * 取得 reasonForUseReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReasonForUseReference() {
        return reasonForUseReference;
    }

    /**
     * 設定 reasonForUseReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReasonForUseReference(Reference value) {
        this.reasonForUseReference = value;
    }

    /**
     * 取得 effectiveDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * 設定 effectiveDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEffectiveDateTime(DateTime value) {
        this.effectiveDateTime = value;
    }

    /**
     * 取得 effectivePeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * 設定 effectivePeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setEffectivePeriod(Period value) {
        this.effectivePeriod = value;
    }

    /**
     * 取得 note 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getNote() {
        return note;
    }

    /**
     * 設定 note 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setNote(StringDt value) {
        this.note = value;
    }

    /**
     * Gets the value of the supportingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSupportingInformation() {
        if (supportingInformation == null) {
            supportingInformation = new ArrayList<Reference>();
        }
        return this.supportingInformation;
    }

    /**
     * 取得 medicationCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMedicationCodeableConcept() {
        return medicationCodeableConcept;
    }

    /**
     * 設定 medicationCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMedicationCodeableConcept(CodeableConcept value) {
        this.medicationCodeableConcept = value;
    }

    /**
     * 取得 medicationReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getMedicationReference() {
        return medicationReference;
    }

    /**
     * 設定 medicationReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setMedicationReference(Reference value) {
        this.medicationReference = value;
    }

    /**
     * Gets the value of the dosage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationStatementDosage }
     * 
     * 
     */
    public List<MedicationStatementDosage> getDosage() {
        if (dosage == null) {
            dosage = new ArrayList<MedicationStatementDosage>();
        }
        return this.dosage;
    }

}
