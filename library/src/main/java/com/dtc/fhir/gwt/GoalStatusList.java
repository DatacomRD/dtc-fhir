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
 * <p>GoalStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="GoalStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="proposed"/>
 *     &lt;enumeration value="planned"/>
 *     &lt;enumeration value="accepted"/>
 *     &lt;enumeration value="rejected"/>
 *     &lt;enumeration value="in-progress"/>
 *     &lt;enumeration value="achieved"/>
 *     &lt;enumeration value="sustaining"/>
 *     &lt;enumeration value="on-hold"/>
 *     &lt;enumeration value="cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GoalStatus-list")
@XmlEnum
public enum GoalStatusList {


    /**
     * A goal is proposed for this patient
     * 
     */
    @XmlEnumValue("proposed")
    PROPOSED("proposed"),

    /**
     * A goal is planned for this patient
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned"),

    /**
     * A proposed goal was accepted
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * A proposed goal was rejected
     * 
     */
    @XmlEnumValue("rejected")
    REJECTED("rejected"),

    /**
     * The goal is being sought but has not yet been reached.  (Also applies if goal was reached in the past but there has been regression and goal is being sought again)
     * 
     */
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress"),

    /**
     * The goal has been met and no further action is needed
     * 
     */
    @XmlEnumValue("achieved")
    ACHIEVED("achieved"),

    /**
     * The goal has been met, but ongoing activity is needed to sustain the goal objective
     * 
     */
    @XmlEnumValue("sustaining")
    SUSTAINING("sustaining"),

    /**
     * The goal remains a long term objective but is no longer being actively pursued for a temporary period of time.
     * 
     */
    @XmlEnumValue("on-hold")
    ON_HOLD("on-hold"),

    /**
     * The goal is no longer being sought
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final String value;

    GoalStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GoalStatusList fromValue(String v) {
        for (GoalStatusList c: GoalStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
