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
 * This resource provides the adjudication details from the processing of a Claim resource.
 * 
 * <p>ClaimResponse.Error complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ClaimResponse.Error">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="sequenceLinkId" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="detailSequenceLinkId" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="subdetailSequenceLinkId" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}Coding"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimResponse.Error", propOrder = {
    "sequenceLinkId",
    "detailSequenceLinkId",
    "subdetailSequenceLinkId",
    "code"
})
public class ClaimResponseError
    extends BackboneElement
{

    protected PositiveInt sequenceLinkId;
    protected PositiveInt detailSequenceLinkId;
    protected PositiveInt subdetailSequenceLinkId;
    @XmlElement(required = true)
    protected Coding code;

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
     * 取得 detailSequenceLinkId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getDetailSequenceLinkId() {
        return detailSequenceLinkId;
    }

    /**
     * 設定 detailSequenceLinkId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setDetailSequenceLinkId(PositiveInt value) {
        this.detailSequenceLinkId = value;
    }

    /**
     * 取得 subdetailSequenceLinkId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getSubdetailSequenceLinkId() {
        return subdetailSequenceLinkId;
    }

    /**
     * 設定 subdetailSequenceLinkId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setSubdetailSequenceLinkId(PositiveInt value) {
        this.subdetailSequenceLinkId = value;
    }

    /**
     * 取得 code 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getCode() {
        return code;
    }

    /**
     * 設定 code 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setCode(Coding value) {
        this.code = value;
    }

}
