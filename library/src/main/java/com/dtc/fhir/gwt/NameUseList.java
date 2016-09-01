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
 * <p>NameUse-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="NameUse-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="usual"/>
 *     &lt;enumeration value="official"/>
 *     &lt;enumeration value="temp"/>
 *     &lt;enumeration value="nickname"/>
 *     &lt;enumeration value="anonymous"/>
 *     &lt;enumeration value="old"/>
 *     &lt;enumeration value="maiden"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameUse-list")
@XmlEnum
public enum NameUseList {


    /**
     * Known as/conventional/the one you normally use
     * 
     */
    @XmlEnumValue("usual")
    USUAL("usual"),

    /**
     * The formal name as registered in an official (government) registry, but which name might not be commonly used. May be called "legal name".
     * 
     */
    @XmlEnumValue("official")
    OFFICIAL("official"),

    /**
     * A temporary name. Name.period can provide more detailed information. This may also be used for temporary names assigned at birth or in emergency situations.
     * 
     */
    @XmlEnumValue("temp")
    TEMP("temp"),

    /**
     * A name that is used to address the person in an informal manner, but is not part of their formal or usual name
     * 
     */
    @XmlEnumValue("nickname")
    NICKNAME("nickname"),

    /**
     * Anonymous assigned name, alias, or pseudonym (used to protect a person's identity for privacy reasons)
     * 
     */
    @XmlEnumValue("anonymous")
    ANONYMOUS("anonymous"),

    /**
     * This name is no longer in use (or was never correct, but retained for records)
     * 
     */
    @XmlEnumValue("old")
    OLD("old"),

    /**
     * A name used prior to marriage. Marriage naming customs vary greatly around the world. This name use is for use by applications that collect and store "maiden" names. Though the concept of maiden name is often gender specific, the use of this term is not gender specific. The use of this term does not imply any particular history for a person's name, nor should the maiden name be determined algorithmically.
     * 
     */
    @XmlEnumValue("maiden")
    MAIDEN("maiden");
    private final String value;

    NameUseList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameUseList fromValue(String v) {
        for (NameUseList c: NameUseList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
