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
 * <p>DeviceMetricColor-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceMetricColor-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="black"/>
 *     &lt;enumeration value="red"/>
 *     &lt;enumeration value="green"/>
 *     &lt;enumeration value="yellow"/>
 *     &lt;enumeration value="blue"/>
 *     &lt;enumeration value="magenta"/>
 *     &lt;enumeration value="cyan"/>
 *     &lt;enumeration value="white"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceMetricColor-list")
@XmlEnum
public enum DeviceMetricColorList {


    /**
     * Color for representation - black.
     * 
     */
    @XmlEnumValue("black")
    BLACK("black"),

    /**
     * Color for representation - red.
     * 
     */
    @XmlEnumValue("red")
    RED("red"),

    /**
     * Color for representation - green.
     * 
     */
    @XmlEnumValue("green")
    GREEN("green"),

    /**
     * Color for representation - yellow.
     * 
     */
    @XmlEnumValue("yellow")
    YELLOW("yellow"),

    /**
     * Color for representation - blue.
     * 
     */
    @XmlEnumValue("blue")
    BLUE("blue"),

    /**
     * Color for representation - magenta.
     * 
     */
    @XmlEnumValue("magenta")
    MAGENTA("magenta"),

    /**
     * Color for representation - cyan.
     * 
     */
    @XmlEnumValue("cyan")
    CYAN("cyan"),

    /**
     * Color for representation - white.
     * 
     */
    @XmlEnumValue("white")
    WHITE("white");
    private final String value;

    DeviceMetricColorList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceMetricColorList fromValue(String v) {
        for (DeviceMetricColorList c: DeviceMetricColorList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
