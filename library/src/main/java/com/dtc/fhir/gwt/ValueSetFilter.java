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
 * <p>ValueSet.Filter complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Filter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="property" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="op" type="{http://hl7.org/fhir}FilterOperator"/>
 *         &lt;element name="value" type="{http://hl7.org/fhir}code"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Filter", propOrder = {
    "property",
    "op",
    "value"
})
public class ValueSetFilter
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Code property;
    @XmlElement(required = true)
    protected FilterOperator op;
    @XmlElement(required = true)
    protected Code value;

    /**
     * 取得 property 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getProperty() {
        return property;
    }

    /**
     * 設定 property 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setProperty(Code value) {
        this.property = value;
    }

    /**
     * 取得 op 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link FilterOperator }
     *     
     */
    public FilterOperator getOp() {
        return op;
    }

    /**
     * 設定 op 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterOperator }
     *     
     */
    public void setOp(FilterOperator value) {
        this.op = value;
    }

    /**
     * 取得 value 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getValue() {
        return value;
    }

    /**
     * 設定 value 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setValue(Code value) {
        this.value = value;
    }

}
