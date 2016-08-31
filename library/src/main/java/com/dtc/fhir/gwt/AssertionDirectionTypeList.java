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
 * <p>AssertionDirectionType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="AssertionDirectionType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="response"/>
 *     &lt;enumeration value="request"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssertionDirectionType-list")
@XmlEnum
public enum AssertionDirectionTypeList {


    /**
     * The assertion is evaluated on the response. This is the default value.
     * 
     */
    @XmlEnumValue("response")
    RESPONSE("response"),

    /**
     * The assertion is evaluated on the request.
     * 
     */
    @XmlEnumValue("request")
    REQUEST("request");
    private final String value;

    AssertionDirectionTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssertionDirectionTypeList fromValue(String v) {
        for (AssertionDirectionTypeList c: AssertionDirectionTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
