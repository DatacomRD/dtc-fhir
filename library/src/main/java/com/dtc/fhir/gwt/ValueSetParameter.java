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
 * A value set specifies a set of codes drawn from one or more code systems.
 * 
 * <p>ValueSet.Parameter complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Parameter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="valueString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="valueBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="valueInteger" type="{http://hl7.org/fhir}integer"/>
 *           &lt;element name="valueDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="valueUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="valueCode" type="{http://hl7.org/fhir}code"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Parameter", propOrder = {
    "name",
    "valueString",
    "valueBoolean",
    "valueInteger",
    "valueDecimal",
    "valueUri",
    "valueCode"
})
public class ValueSetParameter
    extends BackboneElement
{

    @XmlElement(required = true)
    protected StringDt name;
    protected StringDt valueString;
    protected BooleanDt valueBoolean;
    protected IntegerDt valueInteger;
    protected Decimal valueDecimal;
    protected Uri valueUri;
    protected Code valueCode;

    /**
     * 取得 name 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getName() {
        return name;
    }

    /**
     * 設定 name 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setName(StringDt value) {
        this.name = value;
    }

    /**
     * 取得 valueString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getValueString() {
        return valueString;
    }

    /**
     * 設定 valueString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setValueString(StringDt value) {
        this.valueString = value;
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
     * 取得 valueInteger 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getValueInteger() {
        return valueInteger;
    }

    /**
     * 設定 valueInteger 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setValueInteger(IntegerDt value) {
        this.valueInteger = value;
    }

    /**
     * 取得 valueDecimal 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getValueDecimal() {
        return valueDecimal;
    }

    /**
     * 設定 valueDecimal 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setValueDecimal(Decimal value) {
        this.valueDecimal = value;
    }

    /**
     * 取得 valueUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getValueUri() {
        return valueUri;
    }

    /**
     * 設定 valueUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setValueUri(Uri value) {
        this.valueUri = value;
    }

    /**
     * 取得 valueCode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getValueCode() {
        return valueCode;
    }

    /**
     * 設定 valueCode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setValueCode(Code value) {
        this.valueCode = value;
    }

}
