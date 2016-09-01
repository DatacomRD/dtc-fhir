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
 * <p>ClaimResponse.Detail complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ClaimResponse.Detail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="sequenceLinkId" type="{http://hl7.org/fhir}positiveInt"/>
 *         &lt;element name="adjudication" type="{http://hl7.org/fhir}ClaimResponse.Adjudication1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subDetail" type="{http://hl7.org/fhir}ClaimResponse.SubDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimResponse.Detail", propOrder = {
    "sequenceLinkId",
    "adjudication",
    "subDetail"
})
public class ClaimResponseDetail
    extends BackboneElement
{

    @XmlElement(required = true)
    protected PositiveInt sequenceLinkId;
    protected List<ClaimResponseAdjudication1> adjudication;
    protected List<ClaimResponseSubDetail> subDetail;

    /**
     * 取得 sequenceLinkId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getSequenceLinkId() {
        return sequenceLinkId;
    }

    /**
     * 設定 sequenceLinkId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setSequenceLinkId(PositiveInt value) {
        this.sequenceLinkId = value;
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
     * {@link ClaimResponseAdjudication1 }
     * 
     * 
     */
    public List<ClaimResponseAdjudication1> getAdjudication() {
        if (adjudication == null) {
            adjudication = new ArrayList<ClaimResponseAdjudication1>();
        }
        return this.adjudication;
    }

    /**
     * Gets the value of the subDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimResponseSubDetail }
     * 
     * 
     */
    public List<ClaimResponseSubDetail> getSubDetail() {
        if (subDetail == null) {
            subDetail = new ArrayList<ClaimResponseSubDetail>();
        }
        return this.subDetail;
    }

}
