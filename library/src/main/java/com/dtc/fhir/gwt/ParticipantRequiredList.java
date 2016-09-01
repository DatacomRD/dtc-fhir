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
 * <p>ParticipantRequired-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipantRequired-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="required"/>
 *     &lt;enumeration value="optional"/>
 *     &lt;enumeration value="information-only"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipantRequired-list")
@XmlEnum
public enum ParticipantRequiredList {


    /**
     * The participant is required to attend the appointment.
     * 
     */
    @XmlEnumValue("required")
    REQUIRED("required"),

    /**
     * The participant may optionally attend the appointment.
     * 
     */
    @XmlEnumValue("optional")
    OPTIONAL("optional"),

    /**
     * The participant is excluded from the appointment, and may not be informed of the appointment taking place. (Appointment is about them, not for them - such as 2 doctors discussing results about a patient's test).
     * 
     */
    @XmlEnumValue("information-only")
    INFORMATION_ONLY("information-only");
    private final String value;

    ParticipantRequiredList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParticipantRequiredList fromValue(String v) {
        for (ParticipantRequiredList c: ParticipantRequiredList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
