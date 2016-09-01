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
import javax.xml.bind.annotation.XmlType;


/**
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * 
 * <p>TestScript.Operation complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="TestScript.Operation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="label" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="accept" type="{http://hl7.org/fhir}ContentType" minOccurs="0"/>
 *         &lt;element name="contentType" type="{http://hl7.org/fhir}ContentType" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="encodeRequestUrl" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="params" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="requestHeader" type="{http://hl7.org/fhir}TestScript.RequestHeader" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responseId" type="{http://hl7.org/fhir}id" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://hl7.org/fhir}id" minOccurs="0"/>
 *         &lt;element name="targetId" type="{http://hl7.org/fhir}id" minOccurs="0"/>
 *         &lt;element name="url" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestScript.Operation", propOrder = {
    "type",
    "resource",
    "label",
    "description",
    "accept",
    "contentType",
    "destination",
    "encodeRequestUrl",
    "params",
    "requestHeader",
    "responseId",
    "sourceId",
    "targetId",
    "url"
})
public class TestScriptOperation
    extends BackboneElement
{

    protected Coding type;
    protected Code resource;
    protected StringDt label;
    protected StringDt description;
    protected ContentType accept;
    protected ContentType contentType;
    protected IntegerDt destination;
    protected BooleanDt encodeRequestUrl;
    protected StringDt params;
    protected List<TestScriptRequestHeader> requestHeader;
    protected Id responseId;
    protected Id sourceId;
    protected Id targetId;
    protected StringDt url;

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setType(Coding value) {
        this.type = value;
    }

    /**
     * 取得 resource 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getResource() {
        return resource;
    }

    /**
     * 設定 resource 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setResource(Code value) {
        this.resource = value;
    }

    /**
     * 取得 label 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getLabel() {
        return label;
    }

    /**
     * 設定 label 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setLabel(StringDt value) {
        this.label = value;
    }

    /**
     * 取得 description 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDescription() {
        return description;
    }

    /**
     * 設定 description 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDescription(StringDt value) {
        this.description = value;
    }

    /**
     * 取得 accept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getAccept() {
        return accept;
    }

    /**
     * 設定 accept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setAccept(ContentType value) {
        this.accept = value;
    }

    /**
     * 取得 contentType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getContentType() {
        return contentType;
    }

    /**
     * 設定 contentType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setContentType(ContentType value) {
        this.contentType = value;
    }

    /**
     * 取得 destination 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getDestination() {
        return destination;
    }

    /**
     * 設定 destination 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setDestination(IntegerDt value) {
        this.destination = value;
    }

    /**
     * 取得 encodeRequestUrl 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getEncodeRequestUrl() {
        return encodeRequestUrl;
    }

    /**
     * 設定 encodeRequestUrl 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setEncodeRequestUrl(BooleanDt value) {
        this.encodeRequestUrl = value;
    }

    /**
     * 取得 params 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getParams() {
        return params;
    }

    /**
     * 設定 params 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setParams(StringDt value) {
        this.params = value;
    }

    /**
     * Gets the value of the requestHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestScriptRequestHeader }
     * 
     * 
     */
    public List<TestScriptRequestHeader> getRequestHeader() {
        if (requestHeader == null) {
            requestHeader = new ArrayList<TestScriptRequestHeader>();
        }
        return this.requestHeader;
    }

    /**
     * 取得 responseId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getResponseId() {
        return responseId;
    }

    /**
     * 設定 responseId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setResponseId(Id value) {
        this.responseId = value;
    }

    /**
     * 取得 sourceId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getSourceId() {
        return sourceId;
    }

    /**
     * 設定 sourceId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setSourceId(Id value) {
        this.sourceId = value;
    }

    /**
     * 取得 targetId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getTargetId() {
        return targetId;
    }

    /**
     * 設定 targetId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setTargetId(Id value) {
        this.targetId = value;
    }

    /**
     * 取得 url 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getUrl() {
        return url;
    }

    /**
     * 設定 url 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setUrl(StringDt value) {
        this.url = value;
    }

}
