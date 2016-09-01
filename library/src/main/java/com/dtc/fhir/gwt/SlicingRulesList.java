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
 * <p>SlicingRules-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="SlicingRules-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="closed"/>
 *     &lt;enumeration value="open"/>
 *     &lt;enumeration value="openAtEnd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SlicingRules-list")
@XmlEnum
public enum SlicingRulesList {


    /**
     * No additional content is allowed other than that described by the slices in this profile.
     * 
     */
    @XmlEnumValue("closed")
    CLOSED("closed"),

    /**
     * Additional content is allowed anywhere in the list.
     * 
     */
    @XmlEnumValue("open")
    OPEN("open"),

    /**
     * Additional content is allowed, but only at the end of the list. Note that using this requires that the slices be ordered, which makes it hard to share uses. This should only be done where absolutely required.
     * 
     */
    @XmlEnumValue("openAtEnd")
    OPEN_AT_END("openAtEnd");
    private final String value;

    SlicingRulesList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SlicingRulesList fromValue(String v) {
        for (SlicingRulesList c: SlicingRulesList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
