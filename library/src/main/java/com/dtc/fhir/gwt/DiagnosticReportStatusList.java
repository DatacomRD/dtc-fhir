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
 * <p>DiagnosticReportStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticReportStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="registered"/>
 *     &lt;enumeration value="partial"/>
 *     &lt;enumeration value="final"/>
 *     &lt;enumeration value="corrected"/>
 *     &lt;enumeration value="appended"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticReportStatus-list")
@XmlEnum
public enum DiagnosticReportStatusList {


    /**
     * The existence of the report is registered, but there is nothing yet available.
     * 
     */
    @XmlEnumValue("registered")
    REGISTERED("registered"),

    /**
     * This is a partial (e.g. initial, interim or preliminary) report: data in the report may be incomplete or unverified.
     * 
     */
    @XmlEnumValue("partial")
    PARTIAL("partial"),

    /**
     * The report is complete and verified by an authorized person.
     * 
     */
    @XmlEnumValue("final")
    FINAL("final"),

    /**
     * The report has been modified subsequent to being Final, and is complete and verified by an authorized person. New content has been added, but existing content hasn't changed
     * 
     */
    @XmlEnumValue("corrected")
    CORRECTED("corrected"),

    /**
     * The report has been modified subsequent to being Final, and is complete and verified by an authorized person. New content has been added, but existing content hasn't changed.
     * 
     */
    @XmlEnumValue("appended")
    APPENDED("appended"),

    /**
     * The report is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * The report has been withdrawn following a previous final release.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final String value;

    DiagnosticReportStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiagnosticReportStatusList fromValue(String v) {
        for (DiagnosticReportStatusList c: DiagnosticReportStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
