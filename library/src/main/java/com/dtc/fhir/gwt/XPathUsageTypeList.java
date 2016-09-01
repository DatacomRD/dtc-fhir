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
 * <p>XPathUsageType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="XPathUsageType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="phonetic"/>
 *     &lt;enumeration value="nearby"/>
 *     &lt;enumeration value="distance"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XPathUsageType-list")
@XmlEnum
public enum XPathUsageTypeList {


    /**
     * The search parameter is derived directly from the selected nodes based on the type definitions.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * The search parameter is derived by a phonetic transform from the selected nodes.
     * 
     */
    @XmlEnumValue("phonetic")
    PHONETIC("phonetic"),

    /**
     * The search parameter is based on a spatial transform of the selected nodes.
     * 
     */
    @XmlEnumValue("nearby")
    NEARBY("nearby"),

    /**
     * The search parameter is based on a spatial transform of the selected nodes, using physical distance from the middle.
     * 
     */
    @XmlEnumValue("distance")
    DISTANCE("distance"),

    /**
     * The interpretation of the xpath statement is unknown (and can't be automated).
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    XPathUsageTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XPathUsageTypeList fromValue(String v) {
        for (XPathUsageTypeList c: XPathUsageTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
