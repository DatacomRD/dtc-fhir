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
 * <p>IdentifierUse-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentifierUse-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="usual"/>
 *     &lt;enumeration value="official"/>
 *     &lt;enumeration value="temp"/>
 *     &lt;enumeration value="secondary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdentifierUse-list")
@XmlEnum
public enum IdentifierUseList {


    /**
     * The identifier recommended for display and use in real-world interactions.
     * 
     */
    @XmlEnumValue("usual")
    USUAL("usual"),

    /**
     * The identifier considered to be most trusted for the identification of this item.
     * 
     */
    @XmlEnumValue("official")
    OFFICIAL("official"),

    /**
     * A temporary identifier.
     * 
     */
    @XmlEnumValue("temp")
    TEMP("temp"),

    /**
     * An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context.
     * 
     */
    @XmlEnumValue("secondary")
    SECONDARY("secondary");
    private final String value;

    IdentifierUseList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentifierUseList fromValue(String v) {
        for (IdentifierUseList c: IdentifierUseList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
