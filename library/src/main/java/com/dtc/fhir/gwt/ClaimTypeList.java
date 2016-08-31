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
 * <p>ClaimType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="institutional"/>
 *     &lt;enumeration value="oral"/>
 *     &lt;enumeration value="pharmacy"/>
 *     &lt;enumeration value="professional"/>
 *     &lt;enumeration value="vision"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaimType-list")
@XmlEnum
public enum ClaimTypeList {


    /**
     * A claim for Institution based, typically in-patient, goods and services.
     * 
     */
    @XmlEnumValue("institutional")
    INSTITUTIONAL("institutional"),

    /**
     * A claim for Oral Health (Dentist, Denturist, Hygienist) goods and services.
     * 
     */
    @XmlEnumValue("oral")
    ORAL("oral"),

    /**
     * A claim for Pharmacy based goods and services.
     * 
     */
    @XmlEnumValue("pharmacy")
    PHARMACY("pharmacy"),

    /**
     * A claim for Professional, typically out-patient, goods and services.
     * 
     */
    @XmlEnumValue("professional")
    PROFESSIONAL("professional"),

    /**
     * A claim for Vision (Ophthamologist, Optometrist and Optician) goods and services.
     * 
     */
    @XmlEnumValue("vision")
    VISION("vision");
    private final String value;

    ClaimTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaimTypeList fromValue(String v) {
        for (ClaimTypeList c: ClaimTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
