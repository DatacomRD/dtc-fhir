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
 * <p>AdministrativeGender-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="AdministrativeGender-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="male"/>
 *     &lt;enumeration value="female"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdministrativeGender-list")
@XmlEnum
public enum AdministrativeGenderList {


    /**
     * Male
     * 
     */
    @XmlEnumValue("male")
    MALE("male"),

    /**
     * Female
     * 
     */
    @XmlEnumValue("female")
    FEMALE("female"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * Unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    AdministrativeGenderList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdministrativeGenderList fromValue(String v) {
        for (AdministrativeGenderList c: AdministrativeGenderList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
