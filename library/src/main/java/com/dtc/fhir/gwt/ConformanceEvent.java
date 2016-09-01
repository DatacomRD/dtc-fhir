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
 * <p>Conformance.Event complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Event">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}MessageSignificanceCategory" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://hl7.org/fhir}ConformanceEventMode"/>
 *         &lt;element name="focus" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="request" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="response" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Event", propOrder = {
    "code",
    "category",
    "mode",
    "focus",
    "request",
    "response",
    "documentation"
})
public class ConformanceEvent
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Coding code;
    protected MessageSignificanceCategory category;
    @XmlElement(required = true)
    protected ConformanceEventMode mode;
    @XmlElement(required = true)
    protected Code focus;
    @XmlElement(required = true)
    protected Reference request;
    @XmlElement(required = true)
    protected Reference response;
    protected StringDt documentation;

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

    /**
     * 取得 category 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MessageSignificanceCategory }
     *     
     */
    public MessageSignificanceCategory getCategory() {
        return category;
    }

    /**
     * 設定 category 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSignificanceCategory }
     *     
     */
    public void setCategory(MessageSignificanceCategory value) {
        this.category = value;
    }

    /**
     * 取得 mode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceEventMode }
     *     
     */
    public ConformanceEventMode getMode() {
        return mode;
    }

    /**
     * 設定 mode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceEventMode }
     *     
     */
    public void setMode(ConformanceEventMode value) {
        this.mode = value;
    }

    /**
     * 取得 focus 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getFocus() {
        return focus;
    }

    /**
     * 設定 focus 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setFocus(Code value) {
        this.focus = value;
    }

    /**
     * 取得 request 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRequest() {
        return request;
    }

    /**
     * 設定 request 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRequest(Reference value) {
        this.request = value;
    }

    /**
     * 取得 response 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getResponse() {
        return response;
    }

    /**
     * 設定 response 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setResponse(Reference value) {
        this.response = value;
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

}
