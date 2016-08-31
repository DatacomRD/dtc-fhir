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
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * 
 * <p>Claim.MissingTeeth complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Claim.MissingTeeth">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="tooth" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="extractionDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Claim.MissingTeeth", propOrder = {
    "tooth",
    "reason",
    "extractionDate"
})
public class ClaimMissingTeeth
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Coding tooth;
    protected Coding reason;
    protected Date extractionDate;

    /**
     * 取得 tooth 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getTooth() {
        return tooth;
    }

    /**
     * 設定 tooth 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setTooth(Coding value) {
        this.tooth = value;
    }

    /**
     * 取得 reason 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getReason() {
        return reason;
    }

    /**
     * 設定 reason 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setReason(Coding value) {
        this.reason = value;
    }

    /**
     * 取得 extractionDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getExtractionDate() {
        return extractionDate;
    }

    /**
     * 設定 extractionDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExtractionDate(Date value) {
        this.extractionDate = value;
    }

}
