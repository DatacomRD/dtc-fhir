//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 * 
 * <p>RiskAssessment.Prediction complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="RiskAssessment.Prediction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="probabilityDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="probabilityRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="probabilityCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;/choice>
 *         &lt;element name="relativeRisk" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="whenPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="whenRange" type="{http://hl7.org/fhir}Range"/>
 *         &lt;/choice>
 *         &lt;element name="rationale" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskAssessment.Prediction", propOrder = {
    "outcome",
    "probabilityDecimal",
    "probabilityRange",
    "probabilityCodeableConcept",
    "relativeRisk",
    "whenPeriod",
    "whenRange",
    "rationale"
})
public class RiskAssessmentPrediction
    extends BackboneElement
{

    @XmlElement(required = true)
    protected CodeableConcept outcome;
    protected Decimal probabilityDecimal;
    protected Range probabilityRange;
    protected CodeableConcept probabilityCodeableConcept;
    protected Decimal relativeRisk;
    protected Period whenPeriod;
    protected Range whenRange;
    protected StringDt rationale;

    /**
     * 取得 outcome 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getOutcome() {
        return outcome;
    }

    /**
     * 設定 outcome 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setOutcome(CodeableConcept value) {
        this.outcome = value;
    }

    /**
     * 取得 probabilityDecimal 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getProbabilityDecimal() {
        return probabilityDecimal;
    }

    /**
     * 設定 probabilityDecimal 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setProbabilityDecimal(Decimal value) {
        this.probabilityDecimal = value;
    }

    /**
     * 取得 probabilityRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getProbabilityRange() {
        return probabilityRange;
    }

    /**
     * 設定 probabilityRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setProbabilityRange(Range value) {
        this.probabilityRange = value;
    }

    /**
     * 取得 probabilityCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getProbabilityCodeableConcept() {
        return probabilityCodeableConcept;
    }

    /**
     * 設定 probabilityCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setProbabilityCodeableConcept(CodeableConcept value) {
        this.probabilityCodeableConcept = value;
    }

    /**
     * 取得 relativeRisk 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getRelativeRisk() {
        return relativeRisk;
    }

    /**
     * 設定 relativeRisk 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setRelativeRisk(Decimal value) {
        this.relativeRisk = value;
    }

    /**
     * 取得 whenPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getWhenPeriod() {
        return whenPeriod;
    }

    /**
     * 設定 whenPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setWhenPeriod(Period value) {
        this.whenPeriod = value;
    }

    /**
     * 取得 whenRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getWhenRange() {
        return whenRange;
    }

    /**
     * 設定 whenRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setWhenRange(Range value) {
        this.whenRange = value;
    }

    /**
     * 取得 rationale 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getRationale() {
        return rationale;
    }

    /**
     * 設定 rationale 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setRationale(StringDt value) {
        this.rationale = value;
    }

}
