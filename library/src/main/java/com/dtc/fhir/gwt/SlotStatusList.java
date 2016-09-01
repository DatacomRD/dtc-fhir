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
 * <p>SlotStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="SlotStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="busy"/>
 *     &lt;enumeration value="free"/>
 *     &lt;enumeration value="busy-unavailable"/>
 *     &lt;enumeration value="busy-tentative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SlotStatus-list")
@XmlEnum
public enum SlotStatusList {


    /**
     * Indicates that the time interval is busy because one  or more events have been scheduled for that interval.
     * 
     */
    @XmlEnumValue("busy")
    BUSY("busy"),

    /**
     * Indicates that the time interval is free for scheduling.
     * 
     */
    @XmlEnumValue("free")
    FREE("free"),

    /**
     * Indicates that the time interval is busy and that the interval can not be scheduled.
     * 
     */
    @XmlEnumValue("busy-unavailable")
    BUSY_UNAVAILABLE("busy-unavailable"),

    /**
     * Indicates that the time interval is busy because one or more events have been tentatively scheduled for that interval.
     * 
     */
    @XmlEnumValue("busy-tentative")
    BUSY_TENTATIVE("busy-tentative");
    private final String value;

    SlotStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SlotStatusList fromValue(String v) {
        for (SlotStatusList c: SlotStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
