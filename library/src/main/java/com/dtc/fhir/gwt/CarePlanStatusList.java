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
 * <p>CarePlanStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="CarePlanStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="proposed"/>
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarePlanStatus-list")
@XmlEnum
public enum CarePlanStatusList {


    /**
     * The plan has been suggested but no commitment to it has yet been made.
     * 
     */
    @XmlEnumValue("proposed")
    PROPOSED("proposed"),

    /**
     * The plan is in development or awaiting use but is not yet intended to be acted upon.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * The plan is intended to be followed and used as part of patient care.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * The plan is no longer in use and is not expected to be followed or used in patient care.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The plan has been terminated prior to reaching completion (though it may have been replaced by a new plan).
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final String value;

    CarePlanStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarePlanStatusList fromValue(String v) {
        for (CarePlanStatusList c: CarePlanStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
