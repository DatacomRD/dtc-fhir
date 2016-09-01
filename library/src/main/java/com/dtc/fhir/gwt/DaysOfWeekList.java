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
 * <p>DaysOfWeek-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DaysOfWeek-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mon"/>
 *     &lt;enumeration value="tue"/>
 *     &lt;enumeration value="wed"/>
 *     &lt;enumeration value="thu"/>
 *     &lt;enumeration value="fri"/>
 *     &lt;enumeration value="sat"/>
 *     &lt;enumeration value="sun"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DaysOfWeek-list")
@XmlEnum
public enum DaysOfWeekList {


    /**
     * Monday
     * 
     */
    @XmlEnumValue("mon")
    MON("mon"),

    /**
     * Tuesday
     * 
     */
    @XmlEnumValue("tue")
    TUE("tue"),

    /**
     * Wednesday
     * 
     */
    @XmlEnumValue("wed")
    WED("wed"),

    /**
     * Thursday
     * 
     */
    @XmlEnumValue("thu")
    THU("thu"),

    /**
     * Friday
     * 
     */
    @XmlEnumValue("fri")
    FRI("fri"),

    /**
     * Saturday
     * 
     */
    @XmlEnumValue("sat")
    SAT("sat"),

    /**
     * Sunday
     * 
     */
    @XmlEnumValue("sun")
    SUN("sun");
    private final String value;

    DaysOfWeekList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DaysOfWeekList fromValue(String v) {
        for (DaysOfWeekList c: DaysOfWeekList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
