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
 * <p>ReferralStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferralStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="requested"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="accepted"/>
 *     &lt;enumeration value="rejected"/>
 *     &lt;enumeration value="completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferralStatus-list")
@XmlEnum
public enum ReferralStatusList {


    /**
     * A draft referral that has yet to be send.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * The referral has been transmitted, but not yet acknowledged by the recipient.
     * 
     */
    @XmlEnumValue("requested")
    REQUESTED("requested"),

    /**
     * The referral has been acknowledged by the recipient, and is in the process of being actioned.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * The referral has been cancelled without being completed. For example it is no longer needed.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * The recipient has agreed to deliver the care requested by the referral.
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * The recipient has declined to accept the referral.
     * 
     */
    @XmlEnumValue("rejected")
    REJECTED("rejected"),

    /**
     * The referral has been completely actioned.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed");
    private final String value;

    ReferralStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferralStatusList fromValue(String v) {
        for (ReferralStatusList c: ReferralStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
