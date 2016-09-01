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
 * <p>GroupType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="person"/>
 *     &lt;enumeration value="animal"/>
 *     &lt;enumeration value="practitioner"/>
 *     &lt;enumeration value="device"/>
 *     &lt;enumeration value="medication"/>
 *     &lt;enumeration value="substance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GroupType-list")
@XmlEnum
public enum GroupTypeList {


    /**
     * Group contains "person" Patient resources
     * 
     */
    @XmlEnumValue("person")
    PERSON("person"),

    /**
     * Group contains "animal" Patient resources
     * 
     */
    @XmlEnumValue("animal")
    ANIMAL("animal"),

    /**
     * Group contains healthcare practitioner resources
     * 
     */
    @XmlEnumValue("practitioner")
    PRACTITIONER("practitioner"),

    /**
     * Group contains Device resources
     * 
     */
    @XmlEnumValue("device")
    DEVICE("device"),

    /**
     * Group contains Medication resources
     * 
     */
    @XmlEnumValue("medication")
    MEDICATION("medication"),

    /**
     * Group contains Substance resources
     * 
     */
    @XmlEnumValue("substance")
    SUBSTANCE("substance");
    private final String value;

    GroupTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupTypeList fromValue(String v) {
        for (GroupTypeList c: GroupTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
