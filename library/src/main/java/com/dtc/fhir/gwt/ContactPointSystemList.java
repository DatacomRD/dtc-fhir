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
 * <p>ContactPointSystem-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactPointSystem-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="phone"/>
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="pager"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactPointSystem-list")
@XmlEnum
public enum ContactPointSystemList {


    /**
     * The value is a telephone number used for voice calls. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
     * 
     */
    @XmlEnumValue("phone")
    PHONE("phone"),

    /**
     * The value is a fax machine. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
     * 
     */
    @XmlEnumValue("fax")
    FAX("fax"),

    /**
     * The value is an email address.
     * 
     */
    @XmlEnumValue("email")
    EMAIL("email"),

    /**
     * The value is a pager number. These may be local pager numbers that are only usable on a particular pager system.
     * 
     */
    @XmlEnumValue("pager")
    PAGER("pager"),

    /**
     * A contact that is not a phone, fax, or email address. The format of the value SHOULD be a URL. This is intended for various personal contacts including blogs, Twitter, Facebook, etc. Do not use for email addresses. If this is not a URL, then it will require human interpretation.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ContactPointSystemList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactPointSystemList fromValue(String v) {
        for (ContactPointSystemList c: ContactPointSystemList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
