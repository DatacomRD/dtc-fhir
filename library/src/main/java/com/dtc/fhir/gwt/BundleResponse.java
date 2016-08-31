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
 * A container for a collection of resources.
 * 
 * <p>Bundle.Response complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Bundle.Response">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="etag" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="lastModified" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bundle.Response", propOrder = {
    "status",
    "location",
    "etag",
    "lastModified"
})
public class BundleResponse
    extends BackboneElement
{

    @XmlElement(required = true)
    protected StringDt status;
    protected Uri location;
    protected StringDt etag;
    protected Instant lastModified;

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setStatus(StringDt value) {
        this.status = value;
    }

    /**
     * 取得 location 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getLocation() {
        return location;
    }

    /**
     * 設定 location 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setLocation(Uri value) {
        this.location = value;
    }

    /**
     * 取得 etag 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getEtag() {
        return etag;
    }

    /**
     * 設定 etag 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setEtag(StringDt value) {
        this.etag = value;
    }

    /**
     * 取得 lastModified 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getLastModified() {
        return lastModified;
    }

    /**
     * 設定 lastModified 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setLastModified(Instant value) {
        this.lastModified = value;
    }

}
