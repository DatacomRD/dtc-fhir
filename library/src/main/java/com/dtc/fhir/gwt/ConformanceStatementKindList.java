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
 * <p>ConformanceStatementKind-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ConformanceStatementKind-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="instance"/>
 *     &lt;enumeration value="capability"/>
 *     &lt;enumeration value="requirements"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConformanceStatementKind-list")
@XmlEnum
public enum ConformanceStatementKindList {


    /**
     * The Conformance instance represents the present capabilities of a specific system instance.  This is the kind returned by OPTIONS for a FHIR server end-point.
     * 
     */
    @XmlEnumValue("instance")
    INSTANCE("instance"),

    /**
     * The Conformance instance represents the capabilities of a system or piece of software, independent of a particular installation.
     * 
     */
    @XmlEnumValue("capability")
    CAPABILITY("capability"),

    /**
     * The Conformance instance represents a set of requirements for other systems to meet; e.g. as part of an implementation guide or 'request for proposal'.
     * 
     */
    @XmlEnumValue("requirements")
    REQUIREMENTS("requirements");
    private final String value;

    ConformanceStatementKindList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConformanceStatementKindList fromValue(String v) {
        for (ConformanceStatementKindList c: ConformanceStatementKindList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
