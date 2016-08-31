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
 * <p>ProvenanceEntityRole-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ProvenanceEntityRole-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="derivation"/>
 *     &lt;enumeration value="revision"/>
 *     &lt;enumeration value="quotation"/>
 *     &lt;enumeration value="source"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProvenanceEntityRole-list")
@XmlEnum
public enum ProvenanceEntityRoleList {


    /**
     * A transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a preexisting entity.
     * 
     */
    @XmlEnumValue("derivation")
    DERIVATION("derivation"),

    /**
     * A derivation for which the resulting entity is a revised version of some original.
     * 
     */
    @XmlEnumValue("revision")
    REVISION("revision"),

    /**
     * The repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author.
     * 
     */
    @XmlEnumValue("quotation")
    QUOTATION("quotation"),

    /**
     * A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.
     * 
     */
    @XmlEnumValue("source")
    SOURCE("source");
    private final String value;

    ProvenanceEntityRoleList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProvenanceEntityRoleList fromValue(String v) {
        for (ProvenanceEntityRoleList c: ProvenanceEntityRoleList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
