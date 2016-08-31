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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Signature complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Signature">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded"/>
 *         &lt;element name="when" type="{http://hl7.org/fhir}instant"/>
 *         &lt;choice>
 *           &lt;element name="whoUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="whoReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="contentType" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="blob" type="{http://hl7.org/fhir}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signature", propOrder = {
    "type",
    "when",
    "whoUri",
    "whoReference",
    "contentType",
    "blob"
})
public class Signature
    extends Element
{

    @XmlElement(required = true)
    protected List<Coding> type;
    @XmlElement(required = true)
    protected Instant when;
    protected Uri whoUri;
    protected Reference whoReference;
    @XmlElement(required = true)
    protected Code contentType;
    @XmlElement(required = true)
    protected Base64Binary blob;

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getType() {
        if (type == null) {
            type = new ArrayList<Coding>();
        }
        return this.type;
    }

    /**
     * 取得 when 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getWhen() {
        return when;
    }

    /**
     * 設定 when 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setWhen(Instant value) {
        this.when = value;
    }

    /**
     * 取得 whoUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getWhoUri() {
        return whoUri;
    }

    /**
     * 設定 whoUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setWhoUri(Uri value) {
        this.whoUri = value;
    }

    /**
     * 取得 whoReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getWhoReference() {
        return whoReference;
    }

    /**
     * 設定 whoReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setWhoReference(Reference value) {
        this.whoReference = value;
    }

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
     * 取得 blob 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getBlob() {
        return blob;
    }

    /**
     * 設定 blob 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setBlob(Base64Binary value) {
        this.blob = value;
    }

}
