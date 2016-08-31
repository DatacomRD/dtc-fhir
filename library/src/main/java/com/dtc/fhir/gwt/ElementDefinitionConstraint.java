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
 * <p>ElementDefinition.Constraint complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ElementDefinition.Constraint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://hl7.org/fhir}id"/>
 *         &lt;element name="requirements" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://hl7.org/fhir}ConstraintSeverity"/>
 *         &lt;element name="human" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="xpath" type="{http://hl7.org/fhir}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementDefinition.Constraint", propOrder = {
    "key",
    "requirements",
    "severity",
    "human",
    "xpath"
})
public class ElementDefinitionConstraint
    extends Element
{

    @XmlElement(required = true)
    protected Id key;
    protected StringDt requirements;
    @XmlElement(required = true)
    protected ConstraintSeverity severity;
    @XmlElement(required = true)
    protected StringDt human;
    @XmlElement(required = true)
    protected StringDt xpath;

    /**
     * 取得 key 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getKey() {
        return key;
    }

    /**
     * 設定 key 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setKey(Id value) {
        this.key = value;
    }

    /**
     * 取得 requirements 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getRequirements() {
        return requirements;
    }

    /**
     * 設定 requirements 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setRequirements(StringDt value) {
        this.requirements = value;
    }

    /**
     * 取得 severity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintSeverity }
     *     
     */
    public ConstraintSeverity getSeverity() {
        return severity;
    }

    /**
     * 設定 severity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintSeverity }
     *     
     */
    public void setSeverity(ConstraintSeverity value) {
        this.severity = value;
    }

    /**
     * 取得 human 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getHuman() {
        return human;
    }

    /**
     * 設定 human 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setHuman(StringDt value) {
        this.human = value;
    }

    /**
     * 取得 xpath 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getXpath() {
        return xpath;
    }

    /**
     * 設定 xpath 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setXpath(StringDt value) {
        this.xpath = value;
    }

}
