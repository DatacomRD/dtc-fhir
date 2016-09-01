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
 * <p>CompositionAttestationMode-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="CompositionAttestationMode-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="personal"/>
 *     &lt;enumeration value="professional"/>
 *     &lt;enumeration value="legal"/>
 *     &lt;enumeration value="official"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompositionAttestationMode-list")
@XmlEnum
public enum CompositionAttestationModeList {


    /**
     * The person authenticated the content in their personal capacity.
     * 
     */
    @XmlEnumValue("personal")
    PERSONAL("personal"),

    /**
     * The person authenticated the content in their professional capacity.
     * 
     */
    @XmlEnumValue("professional")
    PROFESSIONAL("professional"),

    /**
     * The person authenticated the content and accepted legal responsibility for its content.
     * 
     */
    @XmlEnumValue("legal")
    LEGAL("legal"),

    /**
     * The organization authenticated the content as consistent with their policies and procedures.
     * 
     */
    @XmlEnumValue("official")
    OFFICIAL("official");
    private final String value;

    CompositionAttestationModeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompositionAttestationModeList fromValue(String v) {
        for (CompositionAttestationModeList c: CompositionAttestationModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
