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
 * <p>ObservationStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="registered"/>
 *     &lt;enumeration value="preliminary"/>
 *     &lt;enumeration value="final"/>
 *     &lt;enumeration value="amended"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="entered-in-error"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationStatus-list")
@XmlEnum
public enum ObservationStatusList {


    /**
     * The existence of the observation is registered, but there is no result yet available.
     * 
     */
    @XmlEnumValue("registered")
    REGISTERED("registered"),

    /**
     * This is an initial or interim observation: data may be incomplete or unverified.
     * 
     */
    @XmlEnumValue("preliminary")
    PRELIMINARY("preliminary"),

    /**
     * The observation is complete and verified by an authorized person.
     * 
     */
    @XmlEnumValue("final")
    FINAL("final"),

    /**
     * The observation has been modified subsequent to being Final, and is complete and verified by an authorized person.
     * 
     */
    @XmlEnumValue("amended")
    AMENDED("amended"),

    /**
     * The observation is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * The observation has been withdrawn following previous final release.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error"),

    /**
     * The observation status is unknown.  Note that "unknown" is a value of last resort and every attempt should be made to provide a meaningful value other than "unknown".
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ObservationStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObservationStatusList fromValue(String v) {
        for (ObservationStatusList c: ObservationStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
