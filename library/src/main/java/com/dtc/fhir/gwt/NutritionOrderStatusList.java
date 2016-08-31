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
 * <p>NutritionOrderStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="NutritionOrderStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="proposed"/>
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="planned"/>
 *     &lt;enumeration value="requested"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="on-hold"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NutritionOrderStatus-list")
@XmlEnum
public enum NutritionOrderStatusList {


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
     * The request is 'actionable', but not all actions that are implied by it have occurred yet.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * Actions implied by the request have been temporarily halted, but are expected to continue later. May also be called "suspended".
     * 
     */
    @XmlEnumValue("on-hold")
    ON_HOLD("on-hold"),

    /**
     * All actions that are implied by the order have occurred and no continuation is planned (this will rarely be made explicit).
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The request has been withdrawn and is no longer actionable.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final String value;

    NutritionOrderStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NutritionOrderStatusList fromValue(String v) {
        for (NutritionOrderStatusList c: NutritionOrderStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
