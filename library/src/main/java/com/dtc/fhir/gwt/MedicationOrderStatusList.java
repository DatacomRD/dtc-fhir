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
 * <p>MedicationOrderStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationOrderStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="on-hold"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="entered-in-error"/>
 *     &lt;enumeration value="stopped"/>
 *     &lt;enumeration value="draft"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicationOrderStatus-list")
@XmlEnum
public enum MedicationOrderStatusList {


    /**
     * The prescription is 'actionable', but not all actions that are implied by it have occurred yet.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * Actions implied by the prescription are to be temporarily halted, but are expected to continue later.  May also be called "suspended".
     * 
     */
    @XmlEnumValue("on-hold")
    ON_HOLD("on-hold"),

    /**
     * All actions that are implied by the prescription have occurred.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The prescription was entered in error.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error"),

    /**
     * Actions implied by the prescription are to be permanently halted, before all of them occurred.
     * 
     */
    @XmlEnumValue("stopped")
    STOPPED("stopped"),

    /**
     * The prescription is not yet 'actionable', i.e. it is a work in progress, requires sign-off or verification, and needs to be run through decision support process.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft");
    private final String value;

    MedicationOrderStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicationOrderStatusList fromValue(String v) {
        for (MedicationOrderStatusList c: MedicationOrderStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
