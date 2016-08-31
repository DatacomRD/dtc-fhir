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
 * <p>PropertyRepresentation-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyRepresentation-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xmlAttr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyRepresentation-list")
@XmlEnum
public enum PropertyRepresentationList {


    /**
     * In XML, this property is represented as an attribute not an element.
     * 
     */
    @XmlEnumValue("xmlAttr")
    XML_ATTR("xmlAttr");
    private final String value;

    PropertyRepresentationList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyRepresentationList fromValue(String v) {
        for (PropertyRepresentationList c: PropertyRepresentationList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
