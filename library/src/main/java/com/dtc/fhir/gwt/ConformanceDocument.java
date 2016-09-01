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
 * A conformance statement is a set of capabilities of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * 
 * <p>Conformance.Document complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Document">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{http://hl7.org/fhir}DocumentMode"/>
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="profile" type="{http://hl7.org/fhir}Reference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Document", propOrder = {
    "mode",
    "documentation",
    "profile"
})
public class ConformanceDocument
    extends BackboneElement
{

    @XmlElement(required = true)
    protected DocumentMode mode;
    protected StringDt documentation;
    @XmlElement(required = true)
    protected Reference profile;

    /**
     * 取得 mode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DocumentMode }
     *     
     */
    public DocumentMode getMode() {
        return mode;
    }

    /**
     * 設定 mode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentMode }
     *     
     */
    public void setMode(DocumentMode value) {
        this.mode = value;
    }

    /**
     * 取得 documentation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDocumentation() {
        return documentation;
    }

    /**
     * 設定 documentation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDocumentation(StringDt value) {
        this.documentation = value;
    }

    /**
     * 取得 profile 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getProfile() {
        return profile;
    }

    /**
     * 設定 profile 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setProfile(Reference value) {
        this.profile = value;
    }

}
