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
 * <p>AssertionResponseTypes-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="AssertionResponseTypes-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="okay"/>
 *     &lt;enumeration value="created"/>
 *     &lt;enumeration value="noContent"/>
 *     &lt;enumeration value="notModified"/>
 *     &lt;enumeration value="bad"/>
 *     &lt;enumeration value="forbidden"/>
 *     &lt;enumeration value="notFound"/>
 *     &lt;enumeration value="methodNotAllowed"/>
 *     &lt;enumeration value="conflict"/>
 *     &lt;enumeration value="gone"/>
 *     &lt;enumeration value="preconditionFailed"/>
 *     &lt;enumeration value="unprocessable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssertionResponseTypes-list")
@XmlEnum
public enum AssertionResponseTypesList {


    /**
     * Response code is 200.
     * 
     */
    @XmlEnumValue("okay")
    OKAY("okay"),

    /**
     * Response code is 201.
     * 
     */
    @XmlEnumValue("created")
    CREATED("created"),

    /**
     * Response code is 204.
     * 
     */
    @XmlEnumValue("noContent")
    NO_CONTENT("noContent"),

    /**
     * Response code is 304.
     * 
     */
    @XmlEnumValue("notModified")
    NOT_MODIFIED("notModified"),

    /**
     * Response code is 400.
     * 
     */
    @XmlEnumValue("bad")
    BAD("bad"),

    /**
     * Response code is 403.
     * 
     */
    @XmlEnumValue("forbidden")
    FORBIDDEN("forbidden"),

    /**
     * Response code is 404.
     * 
     */
    @XmlEnumValue("notFound")
    NOT_FOUND("notFound"),

    /**
     * Response code is 405.
     * 
     */
    @XmlEnumValue("methodNotAllowed")
    METHOD_NOT_ALLOWED("methodNotAllowed"),

    /**
     * Response code is 409.
     * 
     */
    @XmlEnumValue("conflict")
    CONFLICT("conflict"),

    /**
     * Response code is 410.
     * 
     */
    @XmlEnumValue("gone")
    GONE("gone"),

    /**
     * Response code is 412.
     * 
     */
    @XmlEnumValue("preconditionFailed")
    PRECONDITION_FAILED("preconditionFailed"),

    /**
     * Response code is 422.
     * 
     */
    @XmlEnumValue("unprocessable")
    UNPROCESSABLE("unprocessable");
    private final String value;

    AssertionResponseTypesList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssertionResponseTypesList fromValue(String v) {
        for (AssertionResponseTypesList c: AssertionResponseTypesList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
