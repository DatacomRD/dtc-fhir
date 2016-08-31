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
 * <p>EncounterState-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="EncounterState-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="planned"/>
 *     &lt;enumeration value="arrived"/>
 *     &lt;enumeration value="in-progress"/>
 *     &lt;enumeration value="onleave"/>
 *     &lt;enumeration value="finished"/>
 *     &lt;enumeration value="cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncounterState-list")
@XmlEnum
public enum EncounterStateList {


    /**
     * The Encounter has not yet started.
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned"),

    /**
     * The Patient is present for the encounter, however is not currently meeting with a practitioner.
     * 
     */
    @XmlEnumValue("arrived")
    ARRIVED("arrived"),

    /**
     * The Encounter has begun and the patient is present / the practitioner and the patient are meeting.
     * 
     */
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress"),

    /**
     * The Encounter has begun, but the patient is temporarily on leave.
     * 
     */
    @XmlEnumValue("onleave")
    ONLEAVE("onleave"),

    /**
     * The Encounter has ended.
     * 
     */
    @XmlEnumValue("finished")
    FINISHED("finished"),

    /**
     * The Encounter has ended before it has begun.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final String value;

    EncounterStateList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncounterStateList fromValue(String v) {
        for (EncounterStateList c: EncounterStateList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
