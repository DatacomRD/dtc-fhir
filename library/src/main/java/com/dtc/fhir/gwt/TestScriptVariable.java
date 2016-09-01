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
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * 
 * <p>TestScript.Variable complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="TestScript.Variable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="headerField" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="path" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://hl7.org/fhir}id" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestScript.Variable", propOrder = {
    "name",
    "headerField",
    "path",
    "sourceId"
})
public class TestScriptVariable
    extends BackboneElement
{

    @XmlElement(required = true)
    protected StringDt name;
    protected StringDt headerField;
    protected StringDt path;
    protected Id sourceId;

    /**
     * 取得 name 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getName() {
        return name;
    }

    /**
     * 設定 name 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setName(StringDt value) {
        this.name = value;
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

}
