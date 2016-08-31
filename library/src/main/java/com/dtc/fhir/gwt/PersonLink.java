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
 * Demographics and administrative information about a person independent of a specific health-related context.
 * 
 * <p>Person.Link complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Person.Link">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="target" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="assurance" type="{http://hl7.org/fhir}IdentityAssuranceLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person.Link", propOrder = {
    "target",
    "assurance"
})
public class PersonLink
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Reference target;
    protected IdentityAssuranceLevel assurance;

    /**
     * 取得 target 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getTarget() {
        return target;
    }

    /**
     * 設定 target 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setTarget(Reference value) {
        this.target = value;
    }

    /**
     * 取得 assurance 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IdentityAssuranceLevel }
     *     
     */
    public IdentityAssuranceLevel getAssurance() {
        return assurance;
    }

    /**
     * 設定 assurance 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityAssuranceLevel }
     *     
     */
    public void setAssurance(IdentityAssuranceLevel value) {
        this.assurance = value;
    }

}
