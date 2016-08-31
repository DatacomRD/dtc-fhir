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
 * <p>NamingSystemType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="NamingSystemType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="codesystem"/>
 *     &lt;enumeration value="identifier"/>
 *     &lt;enumeration value="root"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamingSystemType-list")
@XmlEnum
public enum NamingSystemTypeList {


    /**
     * The naming system is used to define concepts and symbols to represent those concepts; e.g. UCUM, LOINC, NDC code, local lab codes, etc.
     * 
     */
    @XmlEnumValue("codesystem")
    CODESYSTEM("codesystem"),

    /**
     * The naming system is used to manage identifiers (e.g. license numbers, order numbers, etc.).
     * 
     */
    @XmlEnumValue("identifier")
    IDENTIFIER("identifier"),

    /**
     * The naming system is used as the root for other identifiers and naming systems.
     * 
     */
    @XmlEnumValue("root")
    ROOT("root");
    private final String value;

    NamingSystemTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NamingSystemTypeList fromValue(String v) {
        for (NamingSystemTypeList c: NamingSystemTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
