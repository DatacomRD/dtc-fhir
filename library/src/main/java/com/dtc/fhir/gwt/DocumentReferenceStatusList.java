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
 * <p>DocumentReferenceStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentReferenceStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="current"/>
 *     &lt;enumeration value="superseded"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentReferenceStatus-list")
@XmlEnum
public enum DocumentReferenceStatusList {


    /**
     * This is the current reference for this document.
     * 
     */
    @XmlEnumValue("current")
    CURRENT("current"),

    /**
     * This reference has been superseded by another reference.
     * 
     */
    @XmlEnumValue("superseded")
    SUPERSEDED("superseded"),

    /**
     * This reference was created in error.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final String value;

    DocumentReferenceStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentReferenceStatusList fromValue(String v) {
        for (DocumentReferenceStatusList c: DocumentReferenceStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
