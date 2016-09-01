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
 * A manifest that defines a set of documents.
 * 
 * <p>DocumentManifest.Content complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="DocumentManifest.Content">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="pAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="pReference" type="{http://hl7.org/fhir}Reference"/>
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
@XmlType(name = "DocumentManifest.Content", propOrder = {
    "pAttachment",
    "pReference"
})
public class DocumentManifestContent
    extends BackboneElement
{

    protected Attachment pAttachment;
    protected Reference pReference;

    /**
     * 取得 pAttachment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getPAttachment() {
        return pAttachment;
    }

    /**
     * 設定 pAttachment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setPAttachment(Attachment value) {
        this.pAttachment = value;
    }

    /**
     * 取得 pReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPReference() {
        return pReference;
    }

    /**
     * 設定 pReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPReference(Reference value) {
        this.pReference = value;
    }

}
