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
 * <p>UnitsOfTime-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitsOfTime-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="s"/>
 *     &lt;enumeration value="min"/>
 *     &lt;enumeration value="h"/>
 *     &lt;enumeration value="d"/>
 *     &lt;enumeration value="wk"/>
 *     &lt;enumeration value="mo"/>
 *     &lt;enumeration value="a"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitsOfTime-list")
@XmlEnum
public enum UnitsOfTimeList {

    @XmlEnumValue("s")
    S("s"),
    @XmlEnumValue("min")
    MIN("min"),
    @XmlEnumValue("h")
    H("h"),
    @XmlEnumValue("d")
    D("d"),
    @XmlEnumValue("wk")
    WK("wk"),
    @XmlEnumValue("mo")
    MO("mo"),
    @XmlEnumValue("a")
    A("a");
    private final String value;

    UnitsOfTimeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitsOfTimeList fromValue(String v) {
        for (UnitsOfTimeList c: UnitsOfTimeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
