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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>DeviceMetric complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="DeviceMetric">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier"/>
 *         &lt;element name="unit" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="operationalStatus" type="{http://hl7.org/fhir}DeviceMetricOperationalStatus" minOccurs="0"/>
 *         &lt;element name="color" type="{http://hl7.org/fhir}DeviceMetricColor" minOccurs="0"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}DeviceMetricCategory"/>
 *         &lt;element name="measurementPeriod" type="{http://hl7.org/fhir}Timing" minOccurs="0"/>
 *         &lt;element name="calibration" type="{http://hl7.org/fhir}DeviceMetric.Calibration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceMetric", propOrder = {
    "type",
    "identifier",
    "unit",
    "source",
    "parent",
    "operationalStatus",
    "color",
    "category",
    "measurementPeriod",
    "calibration"
})
public class DeviceMetric
    extends DomainResource
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    @XmlElement(required = true)
    protected Identifier identifier;
    protected CodeableConcept unit;
    protected Reference source;
    protected Reference parent;
    protected DeviceMetricOperationalStatus operationalStatus;
    protected DeviceMetricColor color;
    @XmlElement(required = true)
    protected DeviceMetricCategory category;
    protected Timing measurementPeriod;
    protected List<DeviceMetricCalibration> calibration;

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * 取得 identifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * 設定 identifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * 取得 unit 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getUnit() {
        return unit;
    }

    /**
     * 設定 unit 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setUnit(CodeableConcept value) {
        this.unit = value;
    }

    /**
     * 取得 source 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSource() {
        return source;
    }

    /**
     * 設定 source 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSource(Reference value) {
        this.source = value;
    }

    /**
     * 取得 parent 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getParent() {
        return parent;
    }

    /**
     * 設定 parent 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setParent(Reference value) {
        this.parent = value;
    }

    /**
     * 取得 operationalStatus 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DeviceMetricOperationalStatus }
     *     
     */
    public DeviceMetricOperationalStatus getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * 設定 operationalStatus 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceMetricOperationalStatus }
     *     
     */
    public void setOperationalStatus(DeviceMetricOperationalStatus value) {
        this.operationalStatus = value;
    }

    /**
     * 取得 color 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DeviceMetricColor }
     *     
     */
    public DeviceMetricColor getColor() {
        return color;
    }

    /**
     * 設定 color 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceMetricColor }
     *     
     */
    public void setColor(DeviceMetricColor value) {
        this.color = value;
    }

    /**
     * 取得 category 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DeviceMetricCategory }
     *     
     */
    public DeviceMetricCategory getCategory() {
        return category;
    }

    /**
     * 設定 category 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceMetricCategory }
     *     
     */
    public void setCategory(DeviceMetricCategory value) {
        this.category = value;
    }

    /**
     * 取得 measurementPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getMeasurementPeriod() {
        return measurementPeriod;
    }

    /**
     * 設定 measurementPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setMeasurementPeriod(Timing value) {
        this.measurementPeriod = value;
    }

    /**
     * Gets the value of the calibration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calibration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalibration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceMetricCalibration }
     * 
     * 
     */
    public List<DeviceMetricCalibration> getCalibration() {
        if (calibration == null) {
            calibration = new ArrayList<DeviceMetricCalibration>();
        }
        return this.calibration;
    }

}
