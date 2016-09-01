//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>ElementDefinition.Slicing complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ElementDefinition.Slicing">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="discriminator" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="ordered" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="rules" type="{http://hl7.org/fhir}SlicingRules"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementDefinition.Slicing", propOrder = {
    "discriminator",
    "description",
    "ordered",
    "rules"
})
public class ElementDefinitionSlicing
    extends Element
{

    protected List<StringDt> discriminator;
    protected StringDt description;
    protected BooleanDt ordered;
    @XmlElement(required = true)
    protected SlicingRules rules;

    /**
     * Gets the value of the discriminator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discriminator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscriminator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDt }
     * 
     * 
     */
    public List<StringDt> getDiscriminator() {
        if (discriminator == null) {
            discriminator = new ArrayList<StringDt>();
        }
        return this.discriminator;
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
     * 取得 ordered 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getOrdered() {
        return ordered;
    }

    /**
     * 設定 ordered 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setOrdered(BooleanDt value) {
        this.ordered = value;
    }

    /**
     * 取得 rules 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SlicingRules }
     *     
     */
    public SlicingRules getRules() {
        return rules;
    }

    /**
     * 設定 rules 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SlicingRules }
     *     
     */
    public void setRules(SlicingRules value) {
        this.rules = value;
    }

}
