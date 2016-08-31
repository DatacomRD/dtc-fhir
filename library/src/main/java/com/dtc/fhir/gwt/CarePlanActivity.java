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
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 * <p>CarePlan.Activity complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="CarePlan.Activity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="actionResulting" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="progress" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://hl7.org/fhir}CarePlan.Detail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlan.Activity", propOrder = {
    "actionResulting",
    "progress",
    "reference",
    "detail"
})
public class CarePlanActivity
    extends BackboneElement
{

    protected List<Reference> actionResulting;
    protected List<Annotation> progress;
    protected Reference reference;
    protected CarePlanDetail detail;

    /**
     * Gets the value of the actionResulting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionResulting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionResulting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getActionResulting() {
        if (actionResulting == null) {
            actionResulting = new ArrayList<Reference>();
        }
        return this.actionResulting;
    }

    /**
     * Gets the value of the progress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the progress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * 
     * 
     */
    public List<Annotation> getProgress() {
        if (progress == null) {
            progress = new ArrayList<Annotation>();
        }
        return this.progress;
    }

    /**
     * 取得 reference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * 設定 reference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReference(Reference value) {
        this.reference = value;
    }

    /**
     * 取得 detail 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanDetail }
     *     
     */
    public CarePlanDetail getDetail() {
        return detail;
    }

    /**
     * 設定 detail 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanDetail }
     *     
     */
    public void setDetail(CarePlanDetail value) {
        this.detail = value;
    }

}
