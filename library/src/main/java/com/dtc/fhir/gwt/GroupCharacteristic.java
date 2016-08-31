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
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
 * 
 * <p>Group.Characteristic complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Group.Characteristic">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;choice>
 *           &lt;element name="valueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="valueBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="valueRange" type="{http://hl7.org/fhir}Range"/>
 *         &lt;/choice>
 *         &lt;element name="exclude" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group.Characteristic", propOrder = {
    "code",
    "valueCodeableConcept",
    "valueBoolean",
    "valueQuantity",
    "valueRange",
    "exclude",
    "period"
})
public class GroupCharacteristic
    extends BackboneElement
{

    @XmlElement(required = true)
    protected CodeableConcept code;
    protected CodeableConcept valueCodeableConcept;
    protected BooleanDt valueBoolean;
    protected Quantity valueQuantity;
    protected Range valueRange;
    @XmlElement(required = true)
    protected BooleanDt exclude;
    protected Period period;

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
     * 取得 valueCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    /**
     * 設定 valueCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setValueCodeableConcept(CodeableConcept value) {
        this.valueCodeableConcept = value;
    }

    /**
     * 取得 valueBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getValueBoolean() {
        return valueBoolean;
    }

    /**
     * 設定 valueBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setValueBoolean(BooleanDt value) {
        this.valueBoolean = value;
    }

    /**
     * 取得 valueQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * 設定 valueQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setValueQuantity(Quantity value) {
        this.valueQuantity = value;
    }

    /**
     * 取得 valueRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getValueRange() {
        return valueRange;
    }

    /**
     * 設定 valueRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setValueRange(Range value) {
        this.valueRange = value;
    }

    /**
     * 取得 exclude 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getExclude() {
        return exclude;
    }

    /**
     * 設定 exclude 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setExclude(BooleanDt value) {
        this.exclude = value;
    }

    /**
     * 取得 period 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * 設定 period 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

}
