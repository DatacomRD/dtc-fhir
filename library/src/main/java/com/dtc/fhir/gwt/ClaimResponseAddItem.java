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
 * <p>ClaimResponse.AddItem complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ClaimResponse.AddItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="sequenceLinkId" type="{http://hl7.org/fhir}positiveInt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="service" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="fee" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="noteNumberLinkId" type="{http://hl7.org/fhir}positiveInt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adjudication" type="{http://hl7.org/fhir}ClaimResponse.Adjudication3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://hl7.org/fhir}ClaimResponse.Detail1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimResponse.AddItem", propOrder = {
    "sequenceLinkId",
    "service",
    "fee",
    "noteNumberLinkId",
    "adjudication",
    "detail"
})
public class ClaimResponseAddItem
    extends BackboneElement
{

    protected List<PositiveInt> sequenceLinkId;
    @XmlElement(required = true)
    protected Coding service;
    protected Money fee;
    protected List<PositiveInt> noteNumberLinkId;
    protected List<ClaimResponseAdjudication3> adjudication;
    protected List<ClaimResponseDetail1> detail;

    /**
     * Gets the value of the sequenceLinkId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sequenceLinkId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceLinkId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositiveInt }
     * 
     * 
     */
    public List<PositiveInt> getSequenceLinkId() {
        if (sequenceLinkId == null) {
            sequenceLinkId = new ArrayList<PositiveInt>();
        }
        return this.sequenceLinkId;
    }

    /**
     * 取得 service 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getService() {
        return service;
    }

    /**
     * 設定 service 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setService(Coding value) {
        this.service = value;
    }

    /**
     * 取得 fee 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getFee() {
        return fee;
    }

    /**
     * 設定 fee 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setFee(Money value) {
        this.fee = value;
    }

    /**
     * Gets the value of the noteNumberLinkId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteNumberLinkId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteNumberLinkId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositiveInt }
     * 
     * 
     */
    public List<PositiveInt> getNoteNumberLinkId() {
        if (noteNumberLinkId == null) {
            noteNumberLinkId = new ArrayList<PositiveInt>();
        }
        return this.noteNumberLinkId;
    }

    /**
     * Gets the value of the adjudication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjudication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjudication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimResponseAdjudication3 }
     * 
     * 
     */
    public List<ClaimResponseAdjudication3> getAdjudication() {
        if (adjudication == null) {
            adjudication = new ArrayList<ClaimResponseAdjudication3>();
        }
        return this.adjudication;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimResponseDetail1 }
     * 
     * 
     */
    public List<ClaimResponseDetail1> getDetail() {
        if (detail == null) {
            detail = new ArrayList<ClaimResponseDetail1>();
        }
        return this.detail;
    }

}
