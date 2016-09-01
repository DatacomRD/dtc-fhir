//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An order for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationOrder" rather than "MedicationPrescription" to generalize the use across inpatient and outpatient settings as well as for care plans, etc.
 * 
 * <p>MedicationOrder.DispenseRequest complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="MedicationOrder.DispenseRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="medicationCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="medicationReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="validityPeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="numberOfRepeatsAllowed" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="expectedSupplyDuration" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationOrder.DispenseRequest", propOrder = {
    "medicationCodeableConcept",
    "medicationReference",
    "validityPeriod",
    "numberOfRepeatsAllowed",
    "quantity",
    "expectedSupplyDuration"
})
public class MedicationOrderDispenseRequest
    extends BackboneElement
{

    protected CodeableConcept medicationCodeableConcept;
    protected Reference medicationReference;
    protected Period validityPeriod;
    protected PositiveInt numberOfRepeatsAllowed;
    protected SimpleQuantity quantity;
    protected Duration expectedSupplyDuration;

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
     * 取得 validityPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * 設定 validityPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setValidityPeriod(Period value) {
        this.validityPeriod = value;
    }

    /**
     * 取得 numberOfRepeatsAllowed 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getNumberOfRepeatsAllowed() {
        return numberOfRepeatsAllowed;
    }

    /**
     * 設定 numberOfRepeatsAllowed 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setNumberOfRepeatsAllowed(PositiveInt value) {
        this.numberOfRepeatsAllowed = value;
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
     * 取得 expectedSupplyDuration 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpectedSupplyDuration() {
        return expectedSupplyDuration;
    }

    /**
     * 設定 expectedSupplyDuration 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpectedSupplyDuration(Duration value) {
        this.expectedSupplyDuration = value;
    }

}
