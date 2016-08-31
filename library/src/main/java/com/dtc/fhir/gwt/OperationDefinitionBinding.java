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
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 * 
 * <p>OperationDefinition.Binding complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="OperationDefinition.Binding">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="strength" type="{http://hl7.org/fhir}code"/>
 *         &lt;choice>
 *           &lt;element name="valueSetUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="valueSetReference" type="{http://hl7.org/fhir}Reference"/>
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
@XmlType(name = "OperationDefinition.Binding", propOrder = {
    "strength",
    "valueSetUri",
    "valueSetReference"
})
public class OperationDefinitionBinding
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Code strength;
    protected Uri valueSetUri;
    protected Reference valueSetReference;

    /**
     * 取得 strength 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getStrength() {
        return strength;
    }

    /**
     * 設定 strength 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setStrength(Code value) {
        this.strength = value;
    }

    /**
     * 取得 valueSetUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getValueSetUri() {
        return valueSetUri;
    }

    /**
     * 設定 valueSetUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setValueSetUri(Uri value) {
        this.valueSetUri = value;
    }

    /**
     * 取得 valueSetReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getValueSetReference() {
        return valueSetReference;
    }

    /**
     * 設定 valueSetReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setValueSetReference(Reference value) {
        this.valueSetReference = value;
    }

}
