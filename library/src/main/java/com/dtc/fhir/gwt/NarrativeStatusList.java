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
 * <p>NarrativeStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="NarrativeStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="generated"/>
 *     &lt;enumeration value="extensions"/>
 *     &lt;enumeration value="additional"/>
 *     &lt;enumeration value="empty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NarrativeStatus-list")
@XmlEnum
public enum NarrativeStatusList {


    /**
     * The contents of the narrative are entirely generated from the structured data in the content.
     * 
     */
    @XmlEnumValue("generated")
    GENERATED("generated"),

    /**
     * The contents of the narrative are entirely generated from the structured data in the content and some of the content is generated from extensions
     * 
     */
    @XmlEnumValue("extensions")
    EXTENSIONS("extensions"),

    /**
     * The contents of the narrative contain additional information not found in the structured data
     * 
     */
    @XmlEnumValue("additional")
    ADDITIONAL("additional"),

    /**
     * The contents of the narrative are some equivalent of "No human-readable text provided in this case"
     * 
     */
    @XmlEnumValue("empty")
    EMPTY("empty");
    private final String value;

    NarrativeStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NarrativeStatusList fromValue(String v) {
        for (NarrativeStatusList c: NarrativeStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
