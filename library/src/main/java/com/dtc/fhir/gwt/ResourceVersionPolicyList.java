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
 * <p>ResourceVersionPolicy-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceVersionPolicy-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="no-version"/>
 *     &lt;enumeration value="versioned"/>
 *     &lt;enumeration value="versioned-update"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceVersionPolicy-list")
@XmlEnum
public enum ResourceVersionPolicyList {


    /**
     * VersionId meta-property is not supported (server) or used (client).
     * 
     */
    @XmlEnumValue("no-version")
    NO_VERSION("no-version"),

    /**
     * VersionId meta-property is supported (server) or used (client).
     * 
     */
    @XmlEnumValue("versioned")
    VERSIONED("versioned"),

    /**
     * VersionId is must be correct for updates (server) or will be specified (If-match header) for updates (client).
     * 
     */
    @XmlEnumValue("versioned-update")
    VERSIONED_UPDATE("versioned-update");
    private final String value;

    ResourceVersionPolicyList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceVersionPolicyList fromValue(String v) {
        for (ResourceVersionPolicyList c: ResourceVersionPolicyList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
