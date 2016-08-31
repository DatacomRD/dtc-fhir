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
 * <p>AssertionOperatorType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="AssertionOperatorType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="equals"/>
 *     &lt;enumeration value="notEquals"/>
 *     &lt;enumeration value="in"/>
 *     &lt;enumeration value="notIn"/>
 *     &lt;enumeration value="greaterThan"/>
 *     &lt;enumeration value="lessThan"/>
 *     &lt;enumeration value="empty"/>
 *     &lt;enumeration value="notEmpty"/>
 *     &lt;enumeration value="contains"/>
 *     &lt;enumeration value="notContains"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssertionOperatorType-list")
@XmlEnum
public enum AssertionOperatorTypeList {


    /**
     * Default value. Equals comparison.
     * 
     */
    @XmlEnumValue("equals")
    EQUALS("equals"),

    /**
     * Not equals comparison.
     * 
     */
    @XmlEnumValue("notEquals")
    NOT_EQUALS("notEquals"),

    /**
     * Compare value within a known set of values.
     * 
     */
    @XmlEnumValue("in")
    IN("in"),

    /**
     * Compare value not within a known set of values.
     * 
     */
    @XmlEnumValue("notIn")
    NOT_IN("notIn"),

    /**
     * Compare value to be greater than a known value.
     * 
     */
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),

    /**
     * Compare value to be less than a known value.
     * 
     */
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),

    /**
     * Compare value is empty.
     * 
     */
    @XmlEnumValue("empty")
    EMPTY("empty"),

    /**
     * Compare value is not empty.
     * 
     */
    @XmlEnumValue("notEmpty")
    NOT_EMPTY("notEmpty"),

    /**
     * Compare value string contains a known value.
     * 
     */
    @XmlEnumValue("contains")
    CONTAINS("contains"),

    /**
     * Compare value string does not contain a known value.
     * 
     */
    @XmlEnumValue("notContains")
    NOT_CONTAINS("notContains");
    private final String value;

    AssertionOperatorTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssertionOperatorTypeList fromValue(String v) {
        for (AssertionOperatorTypeList c: AssertionOperatorTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
