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
 * <p>IssueSeverity-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="IssueSeverity-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fatal"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="warning"/>
 *     &lt;enumeration value="information"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IssueSeverity-list")
@XmlEnum
public enum IssueSeverityList {


    /**
     * The issue caused the action to fail, and no further checking could be performed.
     * 
     */
    @XmlEnumValue("fatal")
    FATAL("fatal"),

    /**
     * The issue is sufficiently important to cause the action to fail.
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * The issue is not important enough to cause the action to fail, but may cause it to be performed suboptimally or in a way that is not as desired.
     * 
     */
    @XmlEnumValue("warning")
    WARNING("warning"),

    /**
     * The issue has no relation to the degree of success of the action.
     * 
     */
    @XmlEnumValue("information")
    INFORMATION("information");
    private final String value;

    IssueSeverityList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IssueSeverityList fromValue(String v) {
        for (IssueSeverityList c: IssueSeverityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
