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
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.
 * 
 * <p>Communication.Payload complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Communication.Payload">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="contentString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="contentAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="contentReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Communication.Payload", propOrder = {
    "contentString",
    "contentAttachment",
    "contentReference"
})
public class CommunicationPayload
    extends BackboneElement
{

    protected StringDt contentString;
    protected Attachment contentAttachment;
    protected Reference contentReference;

    /**
     * 取得 contentString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getContentString() {
        return contentString;
    }

    /**
     * 設定 contentString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setContentString(StringDt value) {
        this.contentString = value;
    }

    /**
     * 取得 contentAttachment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getContentAttachment() {
        return contentAttachment;
    }

    /**
     * 設定 contentAttachment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setContentAttachment(Attachment value) {
        this.contentAttachment = value;
    }

    /**
     * 取得 contentReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getContentReference() {
        return contentReference;
    }

    /**
     * 設定 contentReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setContentReference(Reference value) {
        this.contentReference = value;
    }

}
