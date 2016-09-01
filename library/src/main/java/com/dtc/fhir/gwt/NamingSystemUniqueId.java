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
 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
 * 
 * <p>NamingSystem.UniqueId complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="NamingSystem.UniqueId">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}NamingSystemIdentifierType"/>
 *         &lt;element name="value" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="preferred" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
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
@XmlType(name = "NamingSystem.UniqueId", propOrder = {
    "type",
    "value",
    "preferred",
    "period"
})
public class NamingSystemUniqueId
    extends BackboneElement
{

    @XmlElement(required = true)
    protected NamingSystemIdentifierType type;
    @XmlElement(required = true)
    protected StringDt value;
    protected BooleanDt preferred;
    protected Period period;

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link NamingSystemIdentifierType }
     *     
     */
    public NamingSystemIdentifierType getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link NamingSystemIdentifierType }
     *     
     */
    public void setType(NamingSystemIdentifierType value) {
        this.type = value;
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

    /**
     * 取得 preferred 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getPreferred() {
        return preferred;
    }

    /**
     * 設定 preferred 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setPreferred(BooleanDt value) {
        this.preferred = value;
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
