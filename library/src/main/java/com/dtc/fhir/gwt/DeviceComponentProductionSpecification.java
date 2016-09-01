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
 * Describes the characteristics, operational status and capabilities of a medical-related component of a medical device.
 * 
 * <p>DeviceComponent.ProductionSpecification complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="DeviceComponent.ProductionSpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="specType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="componentId" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="productionSpec" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceComponent.ProductionSpecification", propOrder = {
    "specType",
    "componentId",
    "productionSpec"
})
public class DeviceComponentProductionSpecification
    extends BackboneElement
{

    protected CodeableConcept specType;
    protected Identifier componentId;
    protected StringDt productionSpec;

    /**
     * 取得 specType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSpecType() {
        return specType;
    }

    /**
     * 設定 specType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSpecType(CodeableConcept value) {
        this.specType = value;
    }

    /**
     * 取得 componentId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getComponentId() {
        return componentId;
    }

    /**
     * 設定 componentId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setComponentId(Identifier value) {
        this.componentId = value;
    }

    /**
     * 取得 productionSpec 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getProductionSpec() {
        return productionSpec;
    }

    /**
     * 設定 productionSpec 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setProductionSpec(StringDt value) {
        this.productionSpec = value;
    }

}
