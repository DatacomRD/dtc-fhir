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
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * 
 * <p>TestScript.Assert complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="TestScript.Assert">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="label" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://hl7.org/fhir}AssertionDirectionType" minOccurs="0"/>
 *         &lt;element name="compareToSourceId" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="compareToSourcePath" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="contentType" type="{http://hl7.org/fhir}ContentType" minOccurs="0"/>
 *         &lt;element name="headerField" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="minimumId" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="navigationLinks" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://hl7.org/fhir}AssertionOperatorType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="response" type="{http://hl7.org/fhir}AssertionResponseTypes" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://hl7.org/fhir}id" minOccurs="0"/>
 *         &lt;element name="validateProfileId" type="{http://hl7.org/fhir}id" minOccurs="0"/>
 *         &lt;element name="value" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="warningOnly" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestScript.Assert", propOrder = {
    "label",
    "description",
    "direction",
    "compareToSourceId",
    "compareToSourcePath",
    "contentType",
    "headerField",
    "minimumId",
    "navigationLinks",
    "operator",
    "path",
    "resource",
    "response",
    "responseCode",
    "sourceId",
    "validateProfileId",
    "value",
    "warningOnly"
})
public class TestScriptAssert
    extends BackboneElement
{

    protected StringDt label;
    protected StringDt description;
    protected AssertionDirectionType direction;
    protected StringDt compareToSourceId;
    protected StringDt compareToSourcePath;
    protected ContentType contentType;
    protected StringDt headerField;
    protected StringDt minimumId;
    protected BooleanDt navigationLinks;
    protected AssertionOperatorType operator;
    protected StringDt path;
    protected Code resource;
    protected AssertionResponseTypes response;
    protected StringDt responseCode;
    protected Id sourceId;
    protected Id validateProfileId;
    protected StringDt value;
    protected BooleanDt warningOnly;

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
     * 取得 direction 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AssertionDirectionType }
     *     
     */
    public AssertionDirectionType getDirection() {
        return direction;
    }

    /**
     * 設定 direction 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionDirectionType }
     *     
     */
    public void setDirection(AssertionDirectionType value) {
        this.direction = value;
    }

    /**
     * 取得 compareToSourceId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getCompareToSourceId() {
        return compareToSourceId;
    }

    /**
     * 設定 compareToSourceId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setCompareToSourceId(StringDt value) {
        this.compareToSourceId = value;
    }

    /**
     * 取得 compareToSourcePath 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getCompareToSourcePath() {
        return compareToSourcePath;
    }

    /**
     * 設定 compareToSourcePath 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setCompareToSourcePath(StringDt value) {
        this.compareToSourcePath = value;
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
     * 取得 headerField 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getHeaderField() {
        return headerField;
    }

    /**
     * 設定 headerField 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setHeaderField(StringDt value) {
        this.headerField = value;
    }

    /**
     * 取得 minimumId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getMinimumId() {
        return minimumId;
    }

    /**
     * 設定 minimumId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setMinimumId(StringDt value) {
        this.minimumId = value;
    }

    /**
     * 取得 navigationLinks 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getNavigationLinks() {
        return navigationLinks;
    }

    /**
     * 設定 navigationLinks 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setNavigationLinks(BooleanDt value) {
        this.navigationLinks = value;
    }

    /**
     * 取得 operator 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AssertionOperatorType }
     *     
     */
    public AssertionOperatorType getOperator() {
        return operator;
    }

    /**
     * 設定 operator 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionOperatorType }
     *     
     */
    public void setOperator(AssertionOperatorType value) {
        this.operator = value;
    }

    /**
     * 取得 path 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getPath() {
        return path;
    }

    /**
     * 設定 path 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setPath(StringDt value) {
        this.path = value;
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
     * 取得 response 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AssertionResponseTypes }
     *     
     */
    public AssertionResponseTypes getResponse() {
        return response;
    }

    /**
     * 設定 response 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AssertionResponseTypes }
     *     
     */
    public void setResponse(AssertionResponseTypes value) {
        this.response = value;
    }

    /**
     * 取得 responseCode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getResponseCode() {
        return responseCode;
    }

    /**
     * 設定 responseCode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setResponseCode(StringDt value) {
        this.responseCode = value;
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
     * 取得 validateProfileId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getValidateProfileId() {
        return validateProfileId;
    }

    /**
     * 設定 validateProfileId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setValidateProfileId(Id value) {
        this.validateProfileId = value;
    }

    /**
     * 取得 value 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getValue() {
        return value;
    }

    /**
     * 設定 value 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setValue(StringDt value) {
        this.value = value;
    }

    /**
     * 取得 warningOnly 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getWarningOnly() {
        return warningOnly;
    }

    /**
     * 設定 warningOnly 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setWarningOnly(BooleanDt value) {
        this.warningOnly = value;
    }

}
