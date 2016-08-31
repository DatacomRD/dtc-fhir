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
 * <p>AddressUse-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressUse-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="home"/>
 *     &lt;enumeration value="work"/>
 *     &lt;enumeration value="temp"/>
 *     &lt;enumeration value="old"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressUse-list")
@XmlEnum
public enum AddressUseList {


    /**
     * A communication address at a home.
     * 
     */
    @XmlEnumValue("home")
    HOME("home"),

    /**
     * An office address. First choice for business related contacts during business hours.
     * 
     */
    @XmlEnumValue("work")
    WORK("work"),

    /**
     * A temporary address. The period can provide more detailed information.
     * 
     */
    @XmlEnumValue("temp")
    TEMP("temp"),

    /**
     * This address is no longer in use (or was never correct, but retained for records).
     * 
     */
    @XmlEnumValue("old")
    OLD("old");
    private final String value;

    AddressUseList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressUseList fromValue(String v) {
        for (AddressUseList c: AddressUseList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
