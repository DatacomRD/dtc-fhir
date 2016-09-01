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
 * <p>MedicationAdministrationStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationAdministrationStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="in-progress"/>
 *     &lt;enumeration value="on-hold"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="entered-in-error"/>
 *     &lt;enumeration value="stopped"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicationAdministrationStatus-list")
@XmlEnum
public enum MedicationAdministrationStatusList {


    /**
     * The administration has started but has not yet completed.
     * 
     */
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress"),

    /**
     * Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called "suspended".
     * 
     */
    @XmlEnumValue("on-hold")
    ON_HOLD("on-hold"),

    /**
     * All actions that are implied by the administration have occurred.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The administration was entered in error and therefore nullified.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error"),

    /**
     * Actions implied by the administration have been permanently halted, before all of them occurred.
     * 
     */
    @XmlEnumValue("stopped")
    STOPPED("stopped");
    private final String value;

    MedicationAdministrationStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicationAdministrationStatusList fromValue(String v) {
        for (MedicationAdministrationStatusList c: MedicationAdministrationStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
