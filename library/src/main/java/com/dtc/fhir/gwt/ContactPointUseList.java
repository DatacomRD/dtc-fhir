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
 * <p>ContactPointUse-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactPointUse-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="home"/>
 *     &lt;enumeration value="work"/>
 *     &lt;enumeration value="temp"/>
 *     &lt;enumeration value="old"/>
 *     &lt;enumeration value="mobile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactPointUse-list")
@XmlEnum
public enum ContactPointUseList {


    /**
     * A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.
     * 
     */
    @XmlEnumValue("home")
    HOME("home"),

    /**
     * An office contact point. First choice for business related contacts during business hours.
     * 
     */
    @XmlEnumValue("work")
    WORK("work"),

    /**
     * A temporary contact point. The period can provide more detailed information.
     * 
     */
    @XmlEnumValue("temp")
    TEMP("temp"),

    /**
     * This contact point is no longer in use (or was never correct, but retained for records).
     * 
     */
    @XmlEnumValue("old")
    OLD("old"),

    /**
     * A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business.
     * 
     */
    @XmlEnumValue("mobile")
    MOBILE("mobile");
    private final String value;

    ContactPointUseList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactPointUseList fromValue(String v) {
        for (ContactPointUseList c: ContactPointUseList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
