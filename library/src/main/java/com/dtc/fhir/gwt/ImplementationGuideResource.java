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
 * A set of rules or how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole, and to publish a computable definition of all the parts.
 * 
 * <p>ImplementationGuide.Resource complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ImplementationGuide.Resource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="purpose" type="{http://hl7.org/fhir}GuideResourcePurpose"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="acronym" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="sourceUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="sourceReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="exampleFor" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImplementationGuide.Resource", propOrder = {
    "purpose",
    "name",
    "description",
    "acronym",
    "sourceUri",
    "sourceReference",
    "exampleFor"
})
public class ImplementationGuideResource
    extends BackboneElement
{

    @XmlElement(required = true)
    protected GuideResourcePurpose purpose;
    protected StringDt name;
    protected StringDt description;
    protected StringDt acronym;
    protected Uri sourceUri;
    protected Reference sourceReference;
    protected Reference exampleFor;

    /**
     * 取得 purpose 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link GuideResourcePurpose }
     *     
     */
    public GuideResourcePurpose getPurpose() {
        return purpose;
    }

    /**
     * 設定 purpose 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link GuideResourcePurpose }
     *     
     */
    public void setPurpose(GuideResourcePurpose value) {
        this.purpose = value;
    }

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
     * 取得 acronym 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getAcronym() {
        return acronym;
    }

    /**
     * 設定 acronym 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setAcronym(StringDt value) {
        this.acronym = value;
    }

    /**
     * 取得 sourceUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getSourceUri() {
        return sourceUri;
    }

    /**
     * 設定 sourceUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setSourceUri(Uri value) {
        this.sourceUri = value;
    }

    /**
     * 取得 sourceReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSourceReference() {
        return sourceReference;
    }

    /**
     * 設定 sourceReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSourceReference(Reference value) {
        this.sourceReference = value;
    }

    /**
     * 取得 exampleFor 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getExampleFor() {
        return exampleFor;
    }

    /**
     * 設定 exampleFor 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setExampleFor(Reference value) {
        this.exampleFor = value;
    }

}
