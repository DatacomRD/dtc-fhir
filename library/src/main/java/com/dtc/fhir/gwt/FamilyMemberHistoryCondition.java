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
 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
 * 
 * <p>FamilyMemberHistory.Condition complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="FamilyMemberHistory.Condition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="onsetQuantity" type="{http://hl7.org/fhir}Age"/>
 *           &lt;element name="onsetRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="onsetPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="onsetString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyMemberHistory.Condition", propOrder = {
    "code",
    "outcome",
    "onsetQuantity",
    "onsetRange",
    "onsetPeriod",
    "onsetString",
    "note"
})
public class FamilyMemberHistoryCondition
    extends BackboneElement
{

    @XmlElement(required = true)
    protected CodeableConcept code;
    protected CodeableConcept outcome;
    protected Age onsetQuantity;
    protected Range onsetRange;
    protected Period onsetPeriod;
    protected StringDt onsetString;
    protected Annotation note;

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

}
