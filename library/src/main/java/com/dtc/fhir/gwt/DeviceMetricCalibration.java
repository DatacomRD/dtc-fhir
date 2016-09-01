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
 * Describes a measurement, calculation or setting capability of a medical device.
 * 
 * <p>DeviceMetric.Calibration complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="DeviceMetric.Calibration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}DeviceMetricCalibrationType" minOccurs="0"/>
 *         &lt;element name="state" type="{http://hl7.org/fhir}DeviceMetricCalibrationState" minOccurs="0"/>
 *         &lt;element name="time" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceMetric.Calibration", propOrder = {
    "type",
    "state",
    "time"
})
public class DeviceMetricCalibration
    extends BackboneElement
{

    protected DeviceMetricCalibrationType type;
    protected DeviceMetricCalibrationState state;
    protected Instant time;

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DeviceMetricCalibrationType }
     *     
     */
    public DeviceMetricCalibrationType getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceMetricCalibrationType }
     *     
     */
    public void setType(DeviceMetricCalibrationType value) {
        this.type = value;
    }

    /**
     * 取得 state 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DeviceMetricCalibrationState }
     *     
     */
    public DeviceMetricCalibrationState getState() {
        return state;
    }

    /**
     * 設定 state 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceMetricCalibrationState }
     *     
     */
    public void setState(DeviceMetricCalibrationState value) {
        this.state = value;
    }

    /**
     * 取得 time 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getTime() {
        return time;
    }

    /**
     * 設定 time 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setTime(Instant value) {
        this.time = value;
    }

}
