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
 * <p>ParticipantStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipantStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accepted"/>
 *     &lt;enumeration value="declined"/>
 *     &lt;enumeration value="tentative"/>
 *     &lt;enumeration value="in-process"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="needs-action"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipantStatus-list")
@XmlEnum
public enum ParticipantStatusList {


    /**
     * The appointment participant has accepted that they can attend the appointment at the time specified in the AppointmentResponse.
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * The appointment participant has declined the appointment.
     * 
     */
    @XmlEnumValue("declined")
    DECLINED("declined"),

    /**
     * The appointment participant has tentatively accepted the appointment.
     * 
     */
    @XmlEnumValue("tentative")
    TENTATIVE("tentative"),

    /**
     * The participant has in-process the appointment.
     * 
     */
    @XmlEnumValue("in-process")
    IN_PROCESS("in-process"),

    /**
     * The participant has completed the appointment.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * This is the intitial status of an appointment participant until a participant has replied. It implies that there is no commitment for the appointment.
     * 
     */
    @XmlEnumValue("needs-action")
    NEEDS_ACTION("needs-action");
    private final String value;

    ParticipantStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParticipantStatusList fromValue(String v) {
        for (ParticipantStatusList c: ParticipantStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
