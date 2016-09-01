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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Attachment complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Attachment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="contentType" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="language" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="data" type="{http://hl7.org/fhir}base64Binary" minOccurs="0"/>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="size" type="{http://hl7.org/fhir}unsignedInt" minOccurs="0"/>
 *         &lt;element name="hash" type="{http://hl7.org/fhir}base64Binary" minOccurs="0"/>
 *         &lt;element name="title" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="creation" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attachment", propOrder = {
    "contentType",
    "language",
    "data",
    "url",
    "size",
    "hash",
    "title",
    "creation"
})
public class Attachment
    extends Element
{

    protected Code contentType;
    protected Code language;
    protected Base64Binary data;
    protected Uri url;
    protected UnsignedInt size;
    protected Base64Binary hash;
    protected StringDt title;
    protected DateTime creation;

    /**
     * 取得 contentType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getContentType() {
        return contentType;
    }

    /**
     * 設定 contentType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setContentType(Code value) {
        this.contentType = value;
    }

    /**
     * 取得 language 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLanguage() {
        return language;
    }

    /**
     * 設定 language 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLanguage(Code value) {
        this.language = value;
    }

    /**
     * 取得 data 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getData() {
        return data;
    }

    /**
     * 設定 data 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setData(Base64Binary value) {
        this.data = value;
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
     * 取得 size 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getSize() {
        return size;
    }

    /**
     * 設定 size 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setSize(UnsignedInt value) {
        this.size = value;
    }

    /**
     * 取得 hash 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getHash() {
        return hash;
    }

    /**
     * 設定 hash 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setHash(Base64Binary value) {
        this.hash = value;
    }

    /**
     * 取得 title 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getTitle() {
        return title;
    }

    /**
     * 設定 title 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setTitle(StringDt value) {
        this.title = value;
    }

    /**
     * 取得 creation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCreation() {
        return creation;
    }

    /**
     * 設定 creation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreation(DateTime value) {
        this.creation = value;
    }

}
