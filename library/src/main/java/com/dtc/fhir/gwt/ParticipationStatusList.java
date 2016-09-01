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
 * <p>ParticipationStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accepted"/>
 *     &lt;enumeration value="declined"/>
 *     &lt;enumeration value="tentative"/>
 *     &lt;enumeration value="needs-action"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationStatus-list")
@XmlEnum
public enum ParticipationStatusList {


    /**
     * The participant has accepted the appointment.
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * The participant has declined the appointment and will not participate in the appointment.
     * 
     */
    @XmlEnumValue("declined")
    DECLINED("declined"),

    /**
     * The participant has  tentatively accepted the appointment. This could be automatically created by a system and requires further processing before it can be accepted. There is no commitment that attendance will occur.
     * 
     */
    @XmlEnumValue("tentative")
    TENTATIVE("tentative"),

    /**
     * The participant needs to indicate if they accept the appointment by changing this status to one of the other statuses.
     * 
     */
    @XmlEnumValue("needs-action")
    NEEDS_ACTION("needs-action");
    private final String value;

    ParticipationStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParticipationStatusList fromValue(String v) {
        for (ParticipationStatusList c: ParticipationStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
