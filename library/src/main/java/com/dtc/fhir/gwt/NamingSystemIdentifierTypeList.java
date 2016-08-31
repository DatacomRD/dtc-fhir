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
 * <p>NamingSystemIdentifierType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="NamingSystemIdentifierType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="oid"/>
 *     &lt;enumeration value="uuid"/>
 *     &lt;enumeration value="uri"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamingSystemIdentifierType-list")
@XmlEnum
public enum NamingSystemIdentifierTypeList {


    /**
     * An ISO object identifier; e.g. 1.2.3.4.5.
     * 
     */
    @XmlEnumValue("oid")
    OID("oid"),

    /**
     * A universally unique identifier of the form a5afddf4-e880-459b-876e-e4591b0acc11.
     * 
     */
    @XmlEnumValue("uuid")
    UUID("uuid"),

    /**
     * A uniform resource identifier (ideally a URL - uniform resource locator); e.g. http://unitsofmeasure.org.
     * 
     */
    @XmlEnumValue("uri")
    URI("uri"),

    /**
     * Some other type of unique identifier; e.g. HL7-assigned reserved string such as LN for LOINC.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NamingSystemIdentifierTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NamingSystemIdentifierTypeList fromValue(String v) {
        for (NamingSystemIdentifierTypeList c: NamingSystemIdentifierTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
