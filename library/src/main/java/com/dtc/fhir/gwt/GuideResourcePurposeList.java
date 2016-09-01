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
 * <p>GuideResourcePurpose-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="GuideResourcePurpose-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="example"/>
 *     &lt;enumeration value="terminology"/>
 *     &lt;enumeration value="profile"/>
 *     &lt;enumeration value="extension"/>
 *     &lt;enumeration value="dictionary"/>
 *     &lt;enumeration value="logical"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuideResourcePurpose-list")
@XmlEnum
public enum GuideResourcePurposeList {


    /**
     * The resource is intended as an example.
     * 
     */
    @XmlEnumValue("example")
    EXAMPLE("example"),

    /**
     * The resource defines a value set or concept map used in the implementation guide.
     * 
     */
    @XmlEnumValue("terminology")
    TERMINOLOGY("terminology"),

    /**
     * The resource defines a profile (StructureDefinition) that is used in the implementation guide.
     * 
     */
    @XmlEnumValue("profile")
    PROFILE("profile"),

    /**
     * The resource defines an extension (StructureDefinition) that is used in the implementation guide.
     * 
     */
    @XmlEnumValue("extension")
    EXTENSION("extension"),

    /**
     * The resource contains a dictionary that is part of the implementation guide.
     * 
     */
    @XmlEnumValue("dictionary")
    DICTIONARY("dictionary"),

    /**
     * The resource defines a logical model (in a StructureDefinition) that is used in the implementation guide.
     * 
     */
    @XmlEnumValue("logical")
    LOGICAL("logical");
    private final String value;

    GuideResourcePurposeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuideResourcePurposeList fromValue(String v) {
        for (GuideResourcePurposeList c: GuideResourcePurposeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
