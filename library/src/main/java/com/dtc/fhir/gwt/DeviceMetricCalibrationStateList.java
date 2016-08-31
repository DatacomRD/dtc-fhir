//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeviceMetricCalibrationState-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceMetricCalibrationState-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="not-calibrated"/>
 *     &lt;enumeration value="calibration-required"/>
 *     &lt;enumeration value="calibrated"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceMetricCalibrationState-list")
@XmlEnum
public enum DeviceMetricCalibrationStateList {


    /**
     * The metric has not been calibrated.
     * 
     */
    @XmlEnumValue("not-calibrated")
    NOT_CALIBRATED("not-calibrated"),

    /**
     * The metric needs to be calibrated.
     * 
     */
    @XmlEnumValue("calibration-required")
    CALIBRATION_REQUIRED("calibration-required"),

    /**
     * The metric has been calibrated.
     * 
     */
    @XmlEnumValue("calibrated")
    CALIBRATED("calibrated"),

    /**
     * The state of calibration of this metric is unspecified.
     * 
     */
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    DeviceMetricCalibrationStateList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceMetricCalibrationStateList fromValue(String v) {
        for (DeviceMetricCalibrationStateList c: DeviceMetricCalibrationStateList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
