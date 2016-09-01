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
 * <p>SearchParamType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchParamType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="number"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="token"/>
 *     &lt;enumeration value="reference"/>
 *     &lt;enumeration value="composite"/>
 *     &lt;enumeration value="quantity"/>
 *     &lt;enumeration value="uri"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchParamType-list")
@XmlEnum
public enum SearchParamTypeList {


    /**
     * Search parameter SHALL be a number (a whole number, or a decimal).
     * 
     */
    @XmlEnumValue("number")
    NUMBER("number"),

    /**
     * Search parameter is on a date/time. The date format is the standard XML format, though other formats may be supported.
     * 
     */
    @XmlEnumValue("date")
    DATE("date"),

    /**
     * Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match just the start of a string. String parameters may contain spaces.
     * 
     */
    @XmlEnumValue("string")
    STRING("string"),

    /**
     * Search parameter on a coded element or identifier. May be used to search through the text, displayname, code and code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of namespace and value, separated by a "|", depending on the modifier used.
     * 
     */
    @XmlEnumValue("token")
    TOKEN("token"),

    /**
     * A reference to another resource.
     * 
     */
    @XmlEnumValue("reference")
    REFERENCE("reference"),

    /**
     * A composite search parameter that combines a search on two values together.
     * 
     */
    @XmlEnumValue("composite")
    COMPOSITE("composite"),

    /**
     * A search parameter that searches on a quantity.
     * 
     */
    @XmlEnumValue("quantity")
    QUANTITY("quantity"),

    /**
     * A search parameter that searches on a URI (RFC 3986).
     * 
     */
    @XmlEnumValue("uri")
    URI("uri");
    private final String value;

    SearchParamTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchParamTypeList fromValue(String v) {
        for (SearchParamTypeList c: SearchParamTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
