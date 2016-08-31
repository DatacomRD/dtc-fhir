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
 * <p>DeviceMetricOperationalStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceMetricOperationalStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="on"/>
 *     &lt;enumeration value="off"/>
 *     &lt;enumeration value="standby"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceMetricOperationalStatus-list")
@XmlEnum
public enum DeviceMetricOperationalStatusList {


    /**
     * The DeviceMetric is operating and will generate DeviceObservations.
     * 
     */
    @XmlEnumValue("on")
    ON("on"),

    /**
     * The DeviceMetric is not operating.
     * 
     */
    @XmlEnumValue("off")
    OFF("off"),

    /**
     * The DeviceMetric is operating, but will not generate any DeviceObservations.
     * 
     */
    @XmlEnumValue("standby")
    STANDBY("standby");
    private final String value;

    DeviceMetricOperationalStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceMetricOperationalStatusList fromValue(String v) {
        for (DeviceMetricOperationalStatusList c: DeviceMetricOperationalStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
