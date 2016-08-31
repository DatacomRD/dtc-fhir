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
 * <p>ResponseType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ok"/>
 *     &lt;enumeration value="transient-error"/>
 *     &lt;enumeration value="fatal-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponseType-list")
@XmlEnum
public enum ResponseTypeList {


    /**
     * The message was accepted and processed without error.
     * 
     */
    @XmlEnumValue("ok")
    OK("ok"),

    /**
     * Some internal unexpected error occurred - wait and try again. Note - this is usually used for things like database unavailable, which may be expected to resolve, though human intervention may be required.
     * 
     */
    @XmlEnumValue("transient-error")
    TRANSIENT_ERROR("transient-error"),

    /**
     * The message was rejected because of some content in it. There is no point in re-sending without change. The response narrative SHALL describe the issue.
     * 
     */
    @XmlEnumValue("fatal-error")
    FATAL_ERROR("fatal-error");
    private final String value;

    ResponseTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseTypeList fromValue(String v) {
        for (ResponseTypeList c: ResponseTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
