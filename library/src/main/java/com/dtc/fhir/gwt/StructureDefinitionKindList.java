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
 * <p>StructureDefinitionKind-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="StructureDefinitionKind-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="datatype"/>
 *     &lt;enumeration value="resource"/>
 *     &lt;enumeration value="logical"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StructureDefinitionKind-list")
@XmlEnum
public enum StructureDefinitionKindList {


    /**
     * A data type - either a primitive or complex structure that defines a set of data elements. These can be used throughout Resource and extension definitions.
     * 
     */
    @XmlEnumValue("datatype")
    DATATYPE("datatype"),

    /**
     * A resource defined by the FHIR specification.
     * 
     */
    @XmlEnumValue("resource")
    RESOURCE("resource"),

    /**
     * A logical model - a conceptual package of data that will be mapped to resources for implementation.
     * 
     */
    @XmlEnumValue("logical")
    LOGICAL("logical");
    private final String value;

    StructureDefinitionKindList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StructureDefinitionKindList fromValue(String v) {
        for (StructureDefinitionKindList c: StructureDefinitionKindList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
