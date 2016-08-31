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
 * <p>CarePlanActivityStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="CarePlanActivityStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="not-started"/>
 *     &lt;enumeration value="scheduled"/>
 *     &lt;enumeration value="in-progress"/>
 *     &lt;enumeration value="on-hold"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarePlanActivityStatus-list")
@XmlEnum
public enum CarePlanActivityStatusList {


    /**
     * Activity is planned but no action has yet been taken.
     * 
     */
    @XmlEnumValue("not-started")
    NOT_STARTED("not-started"),

    /**
     * Appointment or other booking has occurred but activity has not yet begun.
     * 
     */
    @XmlEnumValue("scheduled")
    SCHEDULED("scheduled"),

    /**
     * Activity has been started but is not yet complete.
     * 
     */
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress"),

    /**
     * Activity was started but has temporarily ceased with an expectation of resumption at a future time.
     * 
     */
    @XmlEnumValue("on-hold")
    ON_HOLD("on-hold"),

    /**
     * The activities have been completed (more or less) as planned.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The activities have been ended prior to completion (perhaps even before they were started).
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final String value;

    CarePlanActivityStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarePlanActivityStatusList fromValue(String v) {
        for (CarePlanActivityStatusList c: CarePlanActivityStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
