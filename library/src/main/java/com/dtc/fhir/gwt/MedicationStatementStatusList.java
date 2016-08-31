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
 * <p>MedicationStatementStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationStatementStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="entered-in-error"/>
 *     &lt;enumeration value="intended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicationStatementStatus-list")
@XmlEnum
public enum MedicationStatementStatusList {


    /**
     * The medication is still being taken.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * The medication is no longer being taken.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The statement was entered in error.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error"),

    /**
     * The medication may be taken at some time in the future.
     * 
     */
    @XmlEnumValue("intended")
    INTENDED("intended");
    private final String value;

    MedicationStatementStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicationStatementStatusList fromValue(String v) {
        for (MedicationStatementStatusList c: MedicationStatementStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
