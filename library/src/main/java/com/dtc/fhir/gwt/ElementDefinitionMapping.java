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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>ElementDefinition.Mapping complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ElementDefinition.Mapping">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="identity" type="{http://hl7.org/fhir}id"/>
 *         &lt;element name="language" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="map" type="{http://hl7.org/fhir}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementDefinition.Mapping", propOrder = {
    "identity",
    "language",
    "map"
})
public class ElementDefinitionMapping
    extends Element
{

    @XmlElement(required = true)
    protected Id identity;
    protected Code language;
    @XmlElement(required = true)
    protected StringDt map;

    /**
     * 取得 identity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getIdentity() {
        return identity;
    }

    /**
     * 設定 identity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setIdentity(Id value) {
        this.identity = value;
    }

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
     * 取得 map 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getMap() {
        return map;
    }

    /**
     * 設定 map 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setMap(StringDt value) {
        this.map = value;
    }

}
