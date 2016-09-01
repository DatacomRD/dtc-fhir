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
 * <p>MessageSignificanceCategory-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageSignificanceCategory-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Consequence"/>
 *     &lt;enumeration value="Currency"/>
 *     &lt;enumeration value="Notification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageSignificanceCategory-list")
@XmlEnum
public enum MessageSignificanceCategoryList {


    /**
     * The message represents/requests a change that should not be processed more than once; e.g. Making a booking for an appointment.
     * 
     */
    @XmlEnumValue("Consequence")
    CONSEQUENCE("Consequence"),

    /**
     * The message represents a response to query for current information. Retrospective processing is wrong and/or wasteful.
     * 
     */
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),

    /**
     * The content is not necessarily intended to be current, and it can be reprocessed, though there may be version issues created by processing old notifications.
     * 
     */
    @XmlEnumValue("Notification")
    NOTIFICATION("Notification");
    private final String value;

    MessageSignificanceCategoryList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageSignificanceCategoryList fromValue(String v) {
        for (MessageSignificanceCategoryList c: MessageSignificanceCategoryList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
