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
 * <p>ListMode-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ListMode-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="working"/>
 *     &lt;enumeration value="snapshot"/>
 *     &lt;enumeration value="changes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListMode-list")
@XmlEnum
public enum ListModeList {


    /**
     * This list is the master list, maintained in an ongoing fashion with regular updates as the real world list it is tracking changes
     * 
     */
    @XmlEnumValue("working")
    WORKING("working"),

    /**
     * This list was prepared as a snapshot. It should not be assumed to be current
     * 
     */
    @XmlEnumValue("snapshot")
    SNAPSHOT("snapshot"),

    /**
     * A list that indicates where changes have been made or recommended
     * 
     */
    @XmlEnumValue("changes")
    CHANGES("changes");
    private final String value;

    ListModeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListModeList fromValue(String v) {
        for (ListModeList c: ListModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
