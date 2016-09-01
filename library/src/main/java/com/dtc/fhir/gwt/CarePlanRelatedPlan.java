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
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 * <p>CarePlan.RelatedPlan complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="CarePlan.RelatedPlan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CarePlanRelationship" minOccurs="0"/>
 *         &lt;element name="plan" type="{http://hl7.org/fhir}Reference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlan.RelatedPlan", propOrder = {
    "code",
    "plan"
})
public class CarePlanRelatedPlan
    extends BackboneElement
{

    protected CarePlanRelationship code;
    @XmlElement(required = true)
    protected Reference plan;

    /**
     * 取得 code 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanRelationship }
     *     
     */
    public CarePlanRelationship getCode() {
        return code;
    }

    /**
     * 設定 code 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanRelationship }
     *     
     */
    public void setCode(CarePlanRelationship value) {
        this.code = value;
    }

    /**
     * 取得 plan 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPlan() {
        return plan;
    }

    /**
     * 設定 plan 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPlan(Reference value) {
        this.plan = value;
    }

}
