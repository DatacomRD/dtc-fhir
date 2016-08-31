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
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>MedicationOrder complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="MedicationOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateWritten" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}MedicationOrderStatus" minOccurs="0"/>
 *         &lt;element name="dateEnded" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="reasonEnded" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="prescriber" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="reasonCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="reasonReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="note" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="medicationCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="medicationReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="dosageInstruction" type="{http://hl7.org/fhir}MedicationOrder.DosageInstruction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dispenseRequest" type="{http://hl7.org/fhir}MedicationOrder.DispenseRequest" minOccurs="0"/>
 *         &lt;element name="substitution" type="{http://hl7.org/fhir}MedicationOrder.Substitution" minOccurs="0"/>
 *         &lt;element name="priorPrescription" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationOrder", propOrder = {
    "identifier",
    "dateWritten",
    "status",
    "dateEnded",
    "reasonEnded",
    "patient",
    "prescriber",
    "encounter",
    "reasonCodeableConcept",
    "reasonReference",
    "note",
    "medicationCodeableConcept",
    "medicationReference",
    "dosageInstruction",
    "dispenseRequest",
    "substitution",
    "priorPrescription"
})
public class MedicationOrder
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected DateTime dateWritten;
    protected MedicationOrderStatus status;
    protected DateTime dateEnded;
    protected CodeableConcept reasonEnded;
    protected Reference patient;
    protected Reference prescriber;
    protected Reference encounter;
    protected CodeableConcept reasonCodeableConcept;
    protected Reference reasonReference;
    protected StringDt note;
    protected CodeableConcept medicationCodeableConcept;
    protected Reference medicationReference;
    protected List<MedicationOrderDosageInstruction> dosageInstruction;
    protected MedicationOrderDispenseRequest dispenseRequest;
    protected MedicationOrderSubstitution substitution;
    protected Reference priorPrescription;

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
     * 取得 dateWritten 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateWritten() {
        return dateWritten;
    }

    /**
     * 設定 dateWritten 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateWritten(DateTime value) {
        this.dateWritten = value;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationOrderStatus }
     *     
     */
    public MedicationOrderStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationOrderStatus }
     *     
     */
    public void setStatus(MedicationOrderStatus value) {
        this.status = value;
    }

    /**
     * 取得 dateEnded 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateEnded() {
        return dateEnded;
    }

    /**
     * 設定 dateEnded 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateEnded(DateTime value) {
        this.dateEnded = value;
    }

    /**
     * 取得 reasonEnded 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReasonEnded() {
        return reasonEnded;
    }

    /**
     * 設定 reasonEnded 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReasonEnded(CodeableConcept value) {
        this.reasonEnded = value;
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
     * 取得 prescriber 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPrescriber() {
        return prescriber;
    }

    /**
     * 設定 prescriber 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPrescriber(Reference value) {
        this.prescriber = value;
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
     * 取得 reasonCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReasonCodeableConcept() {
        return reasonCodeableConcept;
    }

    /**
     * 設定 reasonCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReasonCodeableConcept(CodeableConcept value) {
        this.reasonCodeableConcept = value;
    }

    /**
     * 取得 reasonReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReasonReference() {
        return reasonReference;
    }

    /**
     * 設定 reasonReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReasonReference(Reference value) {
        this.reasonReference = value;
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
     * Gets the value of the dosageInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosageInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosageInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationOrderDosageInstruction }
     * 
     * 
     */
    public List<MedicationOrderDosageInstruction> getDosageInstruction() {
        if (dosageInstruction == null) {
            dosageInstruction = new ArrayList<MedicationOrderDosageInstruction>();
        }
        return this.dosageInstruction;
    }

    /**
     * 取得 dispenseRequest 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationOrderDispenseRequest }
     *     
     */
    public MedicationOrderDispenseRequest getDispenseRequest() {
        return dispenseRequest;
    }

    /**
     * 設定 dispenseRequest 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationOrderDispenseRequest }
     *     
     */
    public void setDispenseRequest(MedicationOrderDispenseRequest value) {
        this.dispenseRequest = value;
    }

    /**
     * 取得 substitution 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationOrderSubstitution }
     *     
     */
    public MedicationOrderSubstitution getSubstitution() {
        return substitution;
    }

    /**
     * 設定 substitution 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationOrderSubstitution }
     *     
     */
    public void setSubstitution(MedicationOrderSubstitution value) {
        this.substitution = value;
    }

    /**
     * 取得 priorPrescription 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPriorPrescription() {
        return priorPrescription;
    }

    /**
     * 設定 priorPrescription 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPriorPrescription(Reference value) {
        this.priorPrescription = value;
    }

}
