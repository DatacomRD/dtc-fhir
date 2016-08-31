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
 * <p>FamilyHistoryStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyHistoryStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="partial"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="entered-in-error"/>
 *     &lt;enumeration value="health-unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FamilyHistoryStatus-list")
@XmlEnum
public enum FamilyHistoryStatusList {


    /**
     * Some health information is known and captured, but not complete - see notes for details.
     * 
     */
    @XmlEnumValue("partial")
    PARTIAL("partial"),

    /**
     * All relevant health information is known and captured.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * This instance should not have been part of this patient's medical record.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error"),

    /**
     * Health information for this individual is unavailable/unknown.
     * 
     */
    @XmlEnumValue("health-unknown")
    HEALTH_UNKNOWN("health-unknown");
    private final String value;

    FamilyHistoryStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FamilyHistoryStatusList fromValue(String v) {
        for (FamilyHistoryStatusList c: FamilyHistoryStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
