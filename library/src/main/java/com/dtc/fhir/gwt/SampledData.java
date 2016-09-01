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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>SampledData complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="SampledData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://hl7.org/fhir}SimpleQuantity"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}decimal"/>
 *         &lt;element name="factor" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="lowerLimit" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="upperLimit" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="dimensions" type="{http://hl7.org/fhir}positiveInt"/>
 *         &lt;element name="data" type="{http://hl7.org/fhir}SampledDataDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampledData", propOrder = {
    "origin",
    "period",
    "factor",
    "lowerLimit",
    "upperLimit",
    "dimensions",
    "data"
})
public class SampledData
    extends Element
{

    @XmlElement(required = true)
    protected SimpleQuantity origin;
    @XmlElement(required = true)
    protected Decimal period;
    protected Decimal factor;
    protected Decimal lowerLimit;
    protected Decimal upperLimit;
    @XmlElement(required = true)
    protected PositiveInt dimensions;
    @XmlElement(required = true)
    protected SampledDataDataType data;

    /**
     * 取得 origin 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getOrigin() {
        return origin;
    }

    /**
     * 設定 origin 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setOrigin(SimpleQuantity value) {
        this.origin = value;
    }

    /**
     * 取得 period 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPeriod() {
        return period;
    }

    /**
     * 設定 period 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPeriod(Decimal value) {
        this.period = value;
    }

    /**
     * 取得 factor 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getFactor() {
        return factor;
    }

    /**
     * 設定 factor 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setFactor(Decimal value) {
        this.factor = value;
    }

    /**
     * 取得 lowerLimit 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getLowerLimit() {
        return lowerLimit;
    }

    /**
     * 設定 lowerLimit 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setLowerLimit(Decimal value) {
        this.lowerLimit = value;
    }

    /**
     * 取得 upperLimit 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getUpperLimit() {
        return upperLimit;
    }

    /**
     * 設定 upperLimit 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setUpperLimit(Decimal value) {
        this.upperLimit = value;
    }

    /**
     * 取得 dimensions 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getDimensions() {
        return dimensions;
    }

    /**
     * 設定 dimensions 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setDimensions(PositiveInt value) {
        this.dimensions = value;
    }

    /**
     * 取得 data 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SampledDataDataType }
     *     
     */
    public SampledDataDataType getData() {
        return data;
    }

    /**
     * 設定 data 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledDataDataType }
     *     
     */
    public void setData(SampledDataDataType value) {
        this.data = value;
    }

}
