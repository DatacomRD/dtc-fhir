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
 * This resource provides the adjudication details from the processing of a Claim resource.
 * 
 * <p>ClaimResponse.Coverage complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ClaimResponse.Coverage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="sequence" type="{http://hl7.org/fhir}positiveInt"/>
 *         &lt;element name="focal" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="coverage" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="businessArrangement" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="relationship" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="preAuthRef" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="claimResponse" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="originalRuleset" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimResponse.Coverage", propOrder = {
    "sequence",
    "focal",
    "coverage",
    "businessArrangement",
    "relationship",
    "preAuthRef",
    "claimResponse",
    "originalRuleset"
})
public class ClaimResponseCoverage
    extends BackboneElement
{

    @XmlElement(required = true)
    protected PositiveInt sequence;
    @XmlElement(required = true)
    protected BooleanDt focal;
    @XmlElement(required = true)
    protected Reference coverage;
    protected StringDt businessArrangement;
    @XmlElement(required = true)
    protected Coding relationship;
    protected List<StringDt> preAuthRef;
    protected Reference claimResponse;
    protected Coding originalRuleset;

    /**
     * 取得 sequence 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getSequence() {
        return sequence;
    }

    /**
     * 設定 sequence 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setSequence(PositiveInt value) {
        this.sequence = value;
    }

    /**
     * 取得 focal 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getFocal() {
        return focal;
    }

    /**
     * 設定 focal 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setFocal(BooleanDt value) {
        this.focal = value;
    }

    /**
     * 取得 coverage 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getCoverage() {
        return coverage;
    }

    /**
     * 設定 coverage 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setCoverage(Reference value) {
        this.coverage = value;
    }

    /**
     * 取得 businessArrangement 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getBusinessArrangement() {
        return businessArrangement;
    }

    /**
     * 設定 businessArrangement 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setBusinessArrangement(StringDt value) {
        this.businessArrangement = value;
    }

    /**
     * 取得 relationship 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getRelationship() {
        return relationship;
    }

    /**
     * 設定 relationship 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setRelationship(Coding value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the preAuthRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preAuthRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreAuthRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDt }
     * 
     * 
     */
    public List<StringDt> getPreAuthRef() {
        if (preAuthRef == null) {
            preAuthRef = new ArrayList<StringDt>();
        }
        return this.preAuthRef;
    }

    /**
     * 取得 claimResponse 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getClaimResponse() {
        return claimResponse;
    }

    /**
     * 設定 claimResponse 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setClaimResponse(Reference value) {
        this.claimResponse = value;
    }

    /**
     * 取得 originalRuleset 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getOriginalRuleset() {
        return originalRuleset;
    }

    /**
     * 設定 originalRuleset 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setOriginalRuleset(Coding value) {
        this.originalRuleset = value;
    }

}
