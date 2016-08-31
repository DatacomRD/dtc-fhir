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
 * <p>RestfulConformanceMode-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="RestfulConformanceMode-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="client"/>
 *     &lt;enumeration value="server"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RestfulConformanceMode-list")
@XmlEnum
public enum RestfulConformanceModeList {


    /**
     * The application acts as a client for this resource.
     * 
     */
    @XmlEnumValue("client")
    CLIENT("client"),

    /**
     * The application acts as a server for this resource.
     * 
     */
    @XmlEnumValue("server")
    SERVER("server");
    private final String value;

    RestfulConformanceModeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestfulConformanceModeList fromValue(String v) {
        for (RestfulConformanceModeList c: RestfulConformanceModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
