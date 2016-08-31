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
 * <p>Bundle.Request complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Bundle.Request">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="method" type="{http://hl7.org/fhir}HTTPVerb"/>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri"/>
 *         &lt;element name="ifNoneMatch" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="ifModifiedSince" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *         &lt;element name="ifMatch" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="ifNoneExist" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bundle.Request", propOrder = {
    "method",
    "url",
    "ifNoneMatch",
    "ifModifiedSince",
    "ifMatch",
    "ifNoneExist"
})
public class BundleRequest
    extends BackboneElement
{

    @XmlElement(required = true)
    protected HTTPVerb method;
    @XmlElement(required = true)
    protected Uri url;
    protected StringDt ifNoneMatch;
    protected Instant ifModifiedSince;
    protected StringDt ifMatch;
    protected StringDt ifNoneExist;

    /**
     * 取得 method 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link HTTPVerb }
     *     
     */
    public HTTPVerb getMethod() {
        return method;
    }

    /**
     * 設定 method 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPVerb }
     *     
     */
    public void setMethod(HTTPVerb value) {
        this.method = value;
    }

    /**
     * 取得 url 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getUrl() {
        return url;
    }

    /**
     * 設定 url 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setUrl(Uri value) {
        this.url = value;
    }

    /**
     * 取得 ifNoneMatch 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getIfNoneMatch() {
        return ifNoneMatch;
    }

    /**
     * 設定 ifNoneMatch 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setIfNoneMatch(StringDt value) {
        this.ifNoneMatch = value;
    }

    /**
     * 取得 ifModifiedSince 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getIfModifiedSince() {
        return ifModifiedSince;
    }

    /**
     * 設定 ifModifiedSince 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setIfModifiedSince(Instant value) {
        this.ifModifiedSince = value;
    }

    /**
     * 取得 ifMatch 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getIfMatch() {
        return ifMatch;
    }

    /**
     * 設定 ifMatch 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setIfMatch(StringDt value) {
        this.ifMatch = value;
    }

    /**
     * 取得 ifNoneExist 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getIfNoneExist() {
        return ifNoneExist;
    }

    /**
     * 設定 ifNoneExist 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setIfNoneExist(StringDt value) {
        this.ifNoneExist = value;
    }

}
