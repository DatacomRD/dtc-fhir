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
 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
 * 
 * <p>MedicationDispense.DosageInstruction complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="MedicationDispense.DosageInstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="additionalInstructions" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="timing" type="{http://hl7.org/fhir}Timing" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="asNeededBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="asNeededCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="siteCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="siteReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="route" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="doseRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="doseQuantity" type="{http://hl7.org/fhir}SimpleQuantity"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="rateRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="rateRange" type="{http://hl7.org/fhir}Range"/>
 *         &lt;/choice>
 *         &lt;element name="maxDosePerPeriod" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationDispense.DosageInstruction", propOrder = {
    "text",
    "additionalInstructions",
    "timing",
    "asNeededBoolean",
    "asNeededCodeableConcept",
    "siteCodeableConcept",
    "siteReference",
    "route",
    "method",
    "doseRange",
    "doseQuantity",
    "rateRatio",
    "rateRange",
    "maxDosePerPeriod"
})
public class MedicationDispenseDosageInstruction
    extends BackboneElement
{

    protected StringDt text;
    protected CodeableConcept additionalInstructions;
    protected Timing timing;
    protected BooleanDt asNeededBoolean;
    protected CodeableConcept asNeededCodeableConcept;
    protected CodeableConcept siteCodeableConcept;
    protected Reference siteReference;
    protected CodeableConcept route;
    protected CodeableConcept method;
    protected Range doseRange;
    protected SimpleQuantity doseQuantity;
    protected Ratio rateRatio;
    protected Range rateRange;
    protected Ratio maxDosePerPeriod;

    /**
     * 取得 text 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getText() {
        return text;
    }

    /**
     * 設定 text 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setText(StringDt value) {
        this.text = value;
    }

    /**
     * 取得 additionalInstructions 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getAdditionalInstructions() {
        return additionalInstructions;
    }

    /**
     * 設定 additionalInstructions 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAdditionalInstructions(CodeableConcept value) {
        this.additionalInstructions = value;
    }

    /**
     * 取得 timing 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getTiming() {
        return timing;
    }

    /**
     * 設定 timing 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setTiming(Timing value) {
        this.timing = value;
    }

    /**
     * 取得 asNeededBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getAsNeededBoolean() {
        return asNeededBoolean;
    }

    /**
     * 設定 asNeededBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setAsNeededBoolean(BooleanDt value) {
        this.asNeededBoolean = value;
    }

    /**
     * 取得 asNeededCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getAsNeededCodeableConcept() {
        return asNeededCodeableConcept;
    }

    /**
     * 設定 asNeededCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAsNeededCodeableConcept(CodeableConcept value) {
        this.asNeededCodeableConcept = value;
    }

    /**
     * 取得 siteCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSiteCodeableConcept() {
        return siteCodeableConcept;
    }

    /**
     * 設定 siteCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSiteCodeableConcept(CodeableConcept value) {
        this.siteCodeableConcept = value;
    }

    /**
     * 取得 siteReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSiteReference() {
        return siteReference;
    }

    /**
     * 設定 siteReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSiteReference(Reference value) {
        this.siteReference = value;
    }

    /**
     * 取得 route 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getRoute() {
        return route;
    }

    /**
     * 設定 route 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRoute(CodeableConcept value) {
        this.route = value;
    }

    /**
     * 取得 method 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * 設定 method 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMethod(CodeableConcept value) {
        this.method = value;
    }

    /**
     * 取得 doseRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getDoseRange() {
        return doseRange;
    }

    /**
     * 設定 doseRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setDoseRange(Range value) {
        this.doseRange = value;
    }

    /**
     * 取得 doseQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * 設定 doseQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setDoseQuantity(SimpleQuantity value) {
        this.doseQuantity = value;
    }

    /**
     * 取得 rateRatio 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getRateRatio() {
        return rateRatio;
    }

    /**
     * 設定 rateRatio 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setRateRatio(Ratio value) {
        this.rateRatio = value;
    }

    /**
     * 取得 rateRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getRateRange() {
        return rateRange;
    }

    /**
     * 設定 rateRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setRateRange(Range value) {
        this.rateRange = value;
    }

    /**
     * 取得 maxDosePerPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getMaxDosePerPeriod() {
        return maxDosePerPeriod;
    }

    /**
     * 設定 maxDosePerPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setMaxDosePerPeriod(Ratio value) {
        this.maxDosePerPeriod = value;
    }

}
