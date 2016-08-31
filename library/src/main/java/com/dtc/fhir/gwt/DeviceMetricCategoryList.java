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
 * <p>DeviceMetricCategory-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceMetricCategory-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="measurement"/>
 *     &lt;enumeration value="setting"/>
 *     &lt;enumeration value="calculation"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceMetricCategory-list")
@XmlEnum
public enum DeviceMetricCategoryList {


    /**
     * DeviceObservations generated for this DeviceMetric are measured.
     * 
     */
    @XmlEnumValue("measurement")
    MEASUREMENT("measurement"),

    /**
     * DeviceObservations generated for this DeviceMetric is a setting that will influence the behavior of the Device.
     * 
     */
    @XmlEnumValue("setting")
    SETTING("setting"),

    /**
     * DeviceObservations generated for this DeviceMetric are calculated.
     * 
     */
    @XmlEnumValue("calculation")
    CALCULATION("calculation"),

    /**
     * The category of this DeviceMetric is unspecified.
     * 
     */
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    DeviceMetricCategoryList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceMetricCategoryList fromValue(String v) {
        for (DeviceMetricCategoryList c: DeviceMetricCategoryList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
