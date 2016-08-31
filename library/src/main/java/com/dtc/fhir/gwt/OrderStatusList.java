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
 * <p>OrderStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pending"/>
 *     &lt;enumeration value="review"/>
 *     &lt;enumeration value="rejected"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="accepted"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="replaced"/>
 *     &lt;enumeration value="aborted"/>
 *     &lt;enumeration value="completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus-list")
@XmlEnum
public enum OrderStatusList {


    /**
     * The order is known, but no processing has occurred at this time
     * 
     */
    @XmlEnumValue("pending")
    PENDING("pending"),

    /**
     * The order is undergoing initial processing to determine whether it will be accepted (usually this involves human review)
     * 
     */
    @XmlEnumValue("review")
    REVIEW("review"),

    /**
     * The order was rejected because of a workflow/business logic reason
     * 
     */
    @XmlEnumValue("rejected")
    REJECTED("rejected"),

    /**
     * The order was unable to be processed because of a technical error (i.e. unexpected error)
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * The order has been accepted, and work is in progress.
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * Processing the order was halted at the initiators request.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * The order has been cancelled and replaced by another.
     * 
     */
    @XmlEnumValue("replaced")
    REPLACED("replaced"),

    /**
     * Processing the order was stopped because of some workflow/business logic reason.
     * 
     */
    @XmlEnumValue("aborted")
    ABORTED("aborted"),

    /**
     * The order has been completed.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed");
    private final String value;

    OrderStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatusList fromValue(String v) {
        for (OrderStatusList c: OrderStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
