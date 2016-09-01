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
 * <p>ValueSet.Designation complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Designation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="language" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="use" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="value" type="{http://hl7.org/fhir}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Designation", propOrder = {
    "language",
    "use",
    "value"
})
public class ValueSetDesignation
    extends BackboneElement
{

    protected Code language;
    protected Coding use;
    @XmlElement(required = true)
    protected StringDt value;

    /**
     * 取得 language 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLanguage() {
        return language;
    }

    /**
     * 設定 language 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLanguage(Code value) {
        this.language = value;
    }

    /**
     * 取得 use 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getUse() {
        return use;
    }

    /**
     * 設定 use 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setUse(Coding value) {
        this.use = value;
    }

    /**
     * 取得 value 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getValue() {
        return value;
    }

    /**
     * 設定 value 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setValue(StringDt value) {
        this.value = value;
    }

}
