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
 * <p>DiagnosticOrderPriority-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticOrderPriority-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="routine"/>
 *     &lt;enumeration value="urgent"/>
 *     &lt;enumeration value="stat"/>
 *     &lt;enumeration value="asap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticOrderPriority-list")
@XmlEnum
public enum DiagnosticOrderPriorityList {


    /**
     * The order has a normal priority .
     * 
     */
    @XmlEnumValue("routine")
    ROUTINE("routine"),

    /**
     * The order should be urgently.
     * 
     */
    @XmlEnumValue("urgent")
    URGENT("urgent"),

    /**
     * The order is time-critical.
     * 
     */
    @XmlEnumValue("stat")
    STAT("stat"),

    /**
     * The order should be acted on as soon as possible.
     * 
     */
    @XmlEnumValue("asap")
    ASAP("asap");
    private final String value;

    DiagnosticOrderPriorityList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiagnosticOrderPriorityList fromValue(String v) {
        for (DiagnosticOrderPriorityList c: DiagnosticOrderPriorityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}