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
 * <p>DiagnosticOrderStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticOrderStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="proposed"/>
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="planned"/>
 *     &lt;enumeration value="requested"/>
 *     &lt;enumeration value="received"/>
 *     &lt;enumeration value="accepted"/>
 *     &lt;enumeration value="in-progress"/>
 *     &lt;enumeration value="review"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="suspended"/>
 *     &lt;enumeration value="rejected"/>
 *     &lt;enumeration value="failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticOrderStatus-list")
@XmlEnum
public enum DiagnosticOrderStatusList {


    /**
     * The request has been proposed.
     * 
     */
    @XmlEnumValue("proposed")
    PROPOSED("proposed"),

    /**
     * The request is in preliminary form prior to being sent.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * The request has been planned.
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned"),

    /**
     * The request has been placed.
     * 
     */
    @XmlEnumValue("requested")
    REQUESTED("requested"),

    /**
     * The receiving system has received the order, but not yet decided whether it will be performed.
     * 
     */
    @XmlEnumValue("received")
    RECEIVED("received"),

    /**
     * The receiving system has accepted the order, but work has not yet commenced.
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * The work to fulfill the order is happening.
     * 
     */
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress"),

    /**
     * The work is complete, and the outcomes are being reviewed for approval.
     * 
     */
    @XmlEnumValue("review")
    REVIEW("review"),

    /**
     * The work has been completed, the report(s) released, and no further work is planned.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The request has been withdrawn.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * The request has been held by originating system/user request.
     * 
     */
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),

    /**
     * The receiving system has declined to fulfill the request.
     * 
     */
    @XmlEnumValue("rejected")
    REJECTED("rejected"),

    /**
     * The diagnostic investigation was attempted, but due to some procedural error, it could not be completed.
     * 
     */
    @XmlEnumValue("failed")
    FAILED("failed");
    private final String value;

    DiagnosticOrderStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiagnosticOrderStatusList fromValue(String v) {
        for (DiagnosticOrderStatusList c: DiagnosticOrderStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
