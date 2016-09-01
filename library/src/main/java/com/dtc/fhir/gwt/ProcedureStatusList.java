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
 * <p>ProcedureStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcedureStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="in-progress"/>
 *     &lt;enumeration value="aborted"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcedureStatus-list")
@XmlEnum
public enum ProcedureStatusList {


    /**
     * The procedure is still occurring.
     * 
     */
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress"),

    /**
     * The procedure was terminated without completing successfully.
     * 
     */
    @XmlEnumValue("aborted")
    ABORTED("aborted"),

    /**
     * All actions involved in the procedure have taken place.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The statement was entered in error and Is not valid.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final String value;

    ProcedureStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcedureStatusList fromValue(String v) {
        for (ProcedureStatusList c: ProcedureStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
