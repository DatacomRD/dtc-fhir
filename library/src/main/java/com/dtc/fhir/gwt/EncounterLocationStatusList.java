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
 * <p>EncounterLocationStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="EncounterLocationStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="planned"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="reserved"/>
 *     &lt;enumeration value="completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncounterLocationStatus-list")
@XmlEnum
public enum EncounterLocationStatusList {


    /**
     * The patient is planned to be moved to this location at some point in the future.
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned"),

    /**
     * The patient is currently at this location, or was between the period specified.
     * 
     * A system may update these records when the patient leaves the location to either reserved, or completed
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * This location is held empty for this patient.
     * 
     */
    @XmlEnumValue("reserved")
    RESERVED("reserved"),

    /**
     * The patient was at this location during the period specified.
     * 
     * Not to be used when the patient is currently at the location
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed");
    private final String value;

    EncounterLocationStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncounterLocationStatusList fromValue(String v) {
        for (EncounterLocationStatusList c: EncounterLocationStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
