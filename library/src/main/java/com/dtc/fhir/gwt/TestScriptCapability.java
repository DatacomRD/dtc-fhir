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
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * 
 * <p>TestScript.Capability complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="TestScript.Capability">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="required" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="validated" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="link" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conformance" type="{http://hl7.org/fhir}Reference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestScript.Capability", propOrder = {
    "required",
    "validated",
    "description",
    "destination",
    "link",
    "conformance"
})
public class TestScriptCapability
    extends BackboneElement
{

    protected BooleanDt required;
    protected BooleanDt validated;
    protected StringDt description;
    protected IntegerDt destination;
    protected List<Uri> link;
    @XmlElement(required = true)
    protected Reference conformance;

    /**
     * 取得 required 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getRequired() {
        return required;
    }

    /**
     * 設定 required 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setRequired(BooleanDt value) {
        this.required = value;
    }

    /**
     * 取得 validated 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getValidated() {
        return validated;
    }

    /**
     * 設定 validated 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setValidated(BooleanDt value) {
        this.validated = value;
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
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getLink() {
        if (link == null) {
            link = new ArrayList<Uri>();
        }
        return this.link;
    }

    /**
     * 取得 conformance 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getConformance() {
        return conformance;
    }

    /**
     * 設定 conformance 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setConformance(Reference value) {
        this.conformance = value;
    }

}
