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
 * <p>MedicationDispense complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="MedicationDispense">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}MedicationDispenseStatus" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="dispenser" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="authorizingPrescription" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="daysSupply" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="medicationCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="medicationReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="whenPrepared" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="whenHandedOver" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="dosageInstruction" type="{http://hl7.org/fhir}MedicationDispense.DosageInstruction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="substitution" type="{http://hl7.org/fhir}MedicationDispense.Substitution" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationDispense", propOrder = {
    "identifier",
    "status",
    "patient",
    "dispenser",
    "authorizingPrescription",
    "type",
    "quantity",
    "daysSupply",
    "medicationCodeableConcept",
    "medicationReference",
    "whenPrepared",
    "whenHandedOver",
    "destination",
    "receiver",
    "note",
    "dosageInstruction",
    "substitution"
})
public class MedicationDispense
    extends DomainResource
{

    protected Identifier identifier;
    protected MedicationDispenseStatus status;
    protected Reference patient;
    protected Reference dispenser;
    protected List<Reference> authorizingPrescription;
    protected CodeableConcept type;
    protected SimpleQuantity quantity;
    protected SimpleQuantity daysSupply;
    protected CodeableConcept medicationCodeableConcept;
    protected Reference medicationReference;
    protected DateTime whenPrepared;
    protected DateTime whenHandedOver;
    protected Reference destination;
    protected List<Reference> receiver;
    protected StringDt note;
    protected List<MedicationDispenseDosageInstruction> dosageInstruction;
    protected MedicationDispenseSubstitution substitution;

    /**
     * 取得 identifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * 設定 identifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationDispenseStatus }
     *     
     */
    public MedicationDispenseStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationDispenseStatus }
     *     
     */
    public void setStatus(MedicationDispenseStatus value) {
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
     * 取得 dispenser 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getDispenser() {
        return dispenser;
    }

    /**
     * 設定 dispenser 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setDispenser(Reference value) {
        this.dispenser = value;
    }

    /**
     * Gets the value of the authorizingPrescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizingPrescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizingPrescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getAuthorizingPrescription() {
        if (authorizingPrescription == null) {
            authorizingPrescription = new ArrayList<Reference>();
        }
        return this.authorizingPrescription;
    }

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * 取得 quantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getQuantity() {
        return quantity;
    }

    /**
     * 設定 quantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setQuantity(SimpleQuantity value) {
        this.quantity = value;
    }

    /**
     * 取得 daysSupply 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getDaysSupply() {
        return daysSupply;
    }

    /**
     * 設定 daysSupply 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setDaysSupply(SimpleQuantity value) {
        this.daysSupply = value;
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
     * 取得 whenPrepared 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getWhenPrepared() {
        return whenPrepared;
    }

    /**
     * 設定 whenPrepared 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setWhenPrepared(DateTime value) {
        this.whenPrepared = value;
    }

    /**
     * 取得 whenHandedOver 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getWhenHandedOver() {
        return whenHandedOver;
    }

    /**
     * 設定 whenHandedOver 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setWhenHandedOver(DateTime value) {
        this.whenHandedOver = value;
    }

    /**
     * 取得 destination 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getDestination() {
        return destination;
    }

    /**
     * 設定 destination 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setDestination(Reference value) {
        this.destination = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getReceiver() {
        if (receiver == null) {
            receiver = new ArrayList<Reference>();
        }
        return this.receiver;
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
     * {@link MedicationDispenseDosageInstruction }
     * 
     * 
     */
    public List<MedicationDispenseDosageInstruction> getDosageInstruction() {
        if (dosageInstruction == null) {
            dosageInstruction = new ArrayList<MedicationDispenseDosageInstruction>();
        }
        return this.dosageInstruction;
    }

    /**
     * 取得 substitution 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationDispenseSubstitution }
     *     
     */
    public MedicationDispenseSubstitution getSubstitution() {
        return substitution;
    }

    /**
     * 設定 substitution 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationDispenseSubstitution }
     *     
     */
    public void setSubstitution(MedicationDispenseSubstitution value) {
        this.substitution = value;
    }

}
