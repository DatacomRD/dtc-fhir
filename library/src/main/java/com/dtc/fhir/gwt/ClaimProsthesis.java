//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * 
 * <p>Claim.Prosthesis complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Claim.Prosthesis">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="initial" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="priorDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="priorMaterial" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Claim.Prosthesis", propOrder = {
    "initial",
    "priorDate",
    "priorMaterial"
})
public class ClaimProsthesis
    extends BackboneElement
{

    protected BooleanDt initial;
    protected Date priorDate;
    protected Coding priorMaterial;

    /**
     * 取得 initial 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getInitial() {
        return initial;
    }

    /**
     * 設定 initial 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setInitial(BooleanDt value) {
        this.initial = value;
    }

    /**
     * 取得 priorDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getPriorDate() {
        return priorDate;
    }

    /**
     * 設定 priorDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setPriorDate(Date value) {
        this.priorDate = value;
    }

    /**
     * 取得 priorMaterial 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getPriorMaterial() {
        return priorMaterial;
    }

    /**
     * 設定 priorMaterial 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setPriorMaterial(Coding value) {
        this.priorMaterial = value;
    }

}
