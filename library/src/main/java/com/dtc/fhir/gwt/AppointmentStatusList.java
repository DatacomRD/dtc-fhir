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
 * <p>AppointmentStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="AppointmentStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="proposed"/>
 *     &lt;enumeration value="pending"/>
 *     &lt;enumeration value="booked"/>
 *     &lt;enumeration value="arrived"/>
 *     &lt;enumeration value="fulfilled"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="noshow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppointmentStatus-list")
@XmlEnum
public enum AppointmentStatusList {


    /**
     * None of the participant(s) have finalized their acceptance of the appointment request, and the start/end time may not be set yet.
     * 
     */
    @XmlEnumValue("proposed")
    PROPOSED("proposed"),

    /**
     * Some or all of the participant(s) have not finalized their acceptance of the appointment request.
     * 
     */
    @XmlEnumValue("pending")
    PENDING("pending"),

    /**
     * All participant(s) have been considered and the appointment is confirmed to go ahead at the date/times specified.
     * 
     */
    @XmlEnumValue("booked")
    BOOKED("booked"),

    /**
     * Some of the patients have arrived.
     * 
     */
    @XmlEnumValue("arrived")
    ARRIVED("arrived"),

    /**
     * This appointment has completed and may have resulted in an encounter.
     * 
     */
    @XmlEnumValue("fulfilled")
    FULFILLED("fulfilled"),

    /**
     * The appointment has been cancelled.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * Some or all of the participant(s) have not/did not appear for the appointment (usually the patient).
     * 
     */
    @XmlEnumValue("noshow")
    NOSHOW("noshow");
    private final String value;

    AppointmentStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppointmentStatusList fromValue(String v) {
        for (AppointmentStatusList c: AppointmentStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
