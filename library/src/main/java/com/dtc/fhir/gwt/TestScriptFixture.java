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
 * <p>TestScript.Fixture complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="TestScript.Fixture">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="autocreate" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="autodelete" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestScript.Fixture", propOrder = {
    "autocreate",
    "autodelete",
    "resource"
})
public class TestScriptFixture
    extends BackboneElement
{

    protected BooleanDt autocreate;
    protected BooleanDt autodelete;
    protected Reference resource;

    /**
     * 取得 autocreate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getAutocreate() {
        return autocreate;
    }

    /**
     * 設定 autocreate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setAutocreate(BooleanDt value) {
        this.autocreate = value;
    }

    /**
     * 取得 autodelete 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getAutodelete() {
        return autodelete;
    }

    /**
     * 設定 autodelete 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setAutodelete(BooleanDt value) {
        this.autodelete = value;
    }

    /**
     * 取得 resource 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getResource() {
        return resource;
    }

    /**
     * 設定 resource 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setResource(Reference value) {
        this.resource = value;
    }

}
