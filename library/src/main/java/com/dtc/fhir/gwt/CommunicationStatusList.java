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
 * <p>CommunicationStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="in-progress"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="suspended"/>
 *     &lt;enumeration value="rejected"/>
 *     &lt;enumeration value="failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationStatus-list")
@XmlEnum
public enum CommunicationStatusList {


    /**
     * The communication transmission is ongoing.
     * 
     */
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress"),

    /**
     * The message transmission is complete, i.e., delivered to the recipient's destination.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The communication transmission has been held by originating system/user request.
     * 
     */
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),

    /**
     * The receiving system has declined to accept the message.
     * 
     */
    @XmlEnumValue("rejected")
    REJECTED("rejected"),

    /**
     * There was a failure in transmitting the message out.
     * 
     */
    @XmlEnumValue("failed")
    FAILED("failed");
    private final String value;

    CommunicationStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationStatusList fromValue(String v) {
        for (CommunicationStatusList c: CommunicationStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
