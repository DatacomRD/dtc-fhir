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
 * <p>ElementDefinition.Binding complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ElementDefinition.Binding">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="strength" type="{http://hl7.org/fhir}BindingStrength"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
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
@XmlType(name = "ElementDefinition.Binding", propOrder = {
    "strength",
    "description",
    "valueSetUri",
    "valueSetReference"
})
public class ElementDefinitionBinding
    extends Element
{

    @XmlElement(required = true)
    protected BindingStrength strength;
    protected StringDt description;
    protected Uri valueSetUri;
    protected Reference valueSetReference;

    /**
     * 取得 strength 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BindingStrength }
     *     
     */
    public BindingStrength getStrength() {
        return strength;
    }

    /**
     * 設定 strength 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingStrength }
     *     
     */
    public void setStrength(BindingStrength value) {
        this.strength = value;
    }

    /**
     * 取得 description 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDescription() {
        return description;
    }

    /**
     * 設定 description 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDescription(StringDt value) {
        this.description = value;
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
