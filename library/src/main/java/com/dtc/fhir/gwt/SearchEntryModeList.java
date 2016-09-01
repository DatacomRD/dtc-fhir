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
 * <p>SearchEntryMode-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchEntryMode-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="match"/>
 *     &lt;enumeration value="include"/>
 *     &lt;enumeration value="outcome"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchEntryMode-list")
@XmlEnum
public enum SearchEntryModeList {


    /**
     * This resource matched the search specification.
     * 
     */
    @XmlEnumValue("match")
    MATCH("match"),

    /**
     * This resource is returned because it is referred to from another resource in the search set.
     * 
     */
    @XmlEnumValue("include")
    INCLUDE("include"),

    /**
     * An OperationOutcome that provides additional information about the processing of a search.
     * 
     */
    @XmlEnumValue("outcome")
    OUTCOME("outcome");
    private final String value;

    SearchEntryModeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchEntryModeList fromValue(String v) {
        for (SearchEntryModeList c: SearchEntryModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
