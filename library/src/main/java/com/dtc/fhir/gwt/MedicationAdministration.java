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
 * <p>MedicationAdministration complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="MedicationAdministration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}MedicationAdministrationStatus"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="practitioner" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="prescription" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="wasNotGiven" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="reasonNotGiven" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reasonGiven" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="effectiveTimeDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="effectiveTimePeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="medicationCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="medicationReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="device" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="dosage" type="{http://hl7.org/fhir}MedicationAdministration.Dosage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationAdministration", propOrder = {
    "identifier",
    "status",
    "patient",
    "practitioner",
    "encounter",
    "prescription",
    "wasNotGiven",
    "reasonNotGiven",
    "reasonGiven",
    "effectiveTimeDateTime",
    "effectiveTimePeriod",
    "medicationCodeableConcept",
    "medicationReference",
    "device",
    "note",
    "dosage"
})
public class MedicationAdministration
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected MedicationAdministrationStatus status;
    @XmlElement(required = true)
    protected Reference patient;
    protected Reference practitioner;
    protected Reference encounter;
    protected Reference prescription;
    protected BooleanDt wasNotGiven;
    protected List<CodeableConcept> reasonNotGiven;
    protected List<CodeableConcept> reasonGiven;
    protected DateTime effectiveTimeDateTime;
    protected Period effectiveTimePeriod;
    protected CodeableConcept medicationCodeableConcept;
    protected Reference medicationReference;
    protected List<Reference> device;
    protected StringDt note;
    protected MedicationAdministrationDosage dosage;

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
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationAdministrationStatus }
     *     
     */
    public MedicationAdministrationStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationAdministrationStatus }
     *     
     */
    public void setStatus(MedicationAdministrationStatus value) {
        this.status = value;
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
     * 取得 practitioner 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPractitioner() {
        return practitioner;
    }

    /**
     * 設定 practitioner 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPractitioner(Reference value) {
        this.practitioner = value;
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
     * 取得 prescription 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPrescription() {
        return prescription;
    }

    /**
     * 設定 prescription 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPrescription(Reference value) {
        this.prescription = value;
    }

    /**
     * 取得 wasNotGiven 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getWasNotGiven() {
        return wasNotGiven;
    }

    /**
     * 設定 wasNotGiven 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setWasNotGiven(BooleanDt value) {
        this.wasNotGiven = value;
    }

    /**
     * Gets the value of the reasonNotGiven property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonNotGiven property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonNotGiven().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getReasonNotGiven() {
        if (reasonNotGiven == null) {
            reasonNotGiven = new ArrayList<CodeableConcept>();
        }
        return this.reasonNotGiven;
    }

    /**
     * Gets the value of the reasonGiven property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonGiven property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonGiven().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getReasonGiven() {
        if (reasonGiven == null) {
            reasonGiven = new ArrayList<CodeableConcept>();
        }
        return this.reasonGiven;
    }

    /**
     * 取得 effectiveTimeDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEffectiveTimeDateTime() {
        return effectiveTimeDateTime;
    }

    /**
     * 設定 effectiveTimeDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEffectiveTimeDateTime(DateTime value) {
        this.effectiveTimeDateTime = value;
    }

    /**
     * 取得 effectiveTimePeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getEffectiveTimePeriod() {
        return effectiveTimePeriod;
    }

    /**
     * 設定 effectiveTimePeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setEffectiveTimePeriod(Period value) {
        this.effectiveTimePeriod = value;
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
     * Gets the value of the device property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the device property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getDevice() {
        if (device == null) {
            device = new ArrayList<Reference>();
        }
        return this.device;
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
     * 取得 dosage 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationAdministrationDosage }
     *     
     */
    public MedicationAdministrationDosage getDosage() {
        return dosage;
    }

    /**
     * 設定 dosage 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationAdministrationDosage }
     *     
     */
    public void setDosage(MedicationAdministrationDosage value) {
        this.dosage = value;
    }

}
