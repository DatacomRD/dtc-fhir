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
 * <p>Measmnt-Principle-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="Measmnt-Principle-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="chemical"/>
 *     &lt;enumeration value="electrical"/>
 *     &lt;enumeration value="impedance"/>
 *     &lt;enumeration value="nuclear"/>
 *     &lt;enumeration value="optical"/>
 *     &lt;enumeration value="thermal"/>
 *     &lt;enumeration value="biological"/>
 *     &lt;enumeration value="mechanical"/>
 *     &lt;enumeration value="acoustical"/>
 *     &lt;enumeration value="manual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Measmnt-Principle-list")
@XmlEnum
public enum MeasmntPrincipleList {


    /**
     * Measurement principle isn't in the list.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * Measurement is done using the chemical principle.
     * 
     */
    @XmlEnumValue("chemical")
    CHEMICAL("chemical"),

    /**
     * Measurement is done using the electrical principle.
     * 
     */
    @XmlEnumValue("electrical")
    ELECTRICAL("electrical"),

    /**
     * Measurement is done using the impedance principle.
     * 
     */
    @XmlEnumValue("impedance")
    IMPEDANCE("impedance"),

    /**
     * Measurement is done using the nuclear principle.
     * 
     */
    @XmlEnumValue("nuclear")
    NUCLEAR("nuclear"),

    /**
     * Measurement is done using the optical principle.
     * 
     */
    @XmlEnumValue("optical")
    OPTICAL("optical"),

    /**
     * Measurement is done using the thermal principle.
     * 
     */
    @XmlEnumValue("thermal")
    THERMAL("thermal"),

    /**
     * Measurement is done using the biological principle.
     * 
     */
    @XmlEnumValue("biological")
    BIOLOGICAL("biological"),

    /**
     * Measurement is done using the mechanical principle.
     * 
     */
    @XmlEnumValue("mechanical")
    MECHANICAL("mechanical"),

    /**
     * Measurement is done using the acoustical principle.
     * 
     */
    @XmlEnumValue("acoustical")
    ACOUSTICAL("acoustical"),

    /**
     * Measurement is done using the manual principle.
     * 
     */
    @XmlEnumValue("manual")
    MANUAL("manual");
    private final String value;

    MeasmntPrincipleList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasmntPrincipleList fromValue(String v) {
        for (MeasmntPrincipleList c: MeasmntPrincipleList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
