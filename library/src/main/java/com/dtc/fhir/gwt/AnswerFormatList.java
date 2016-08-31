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
 * <p>AnswerFormat-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="AnswerFormat-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="decimal"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="dateTime"/>
 *     &lt;enumeration value="instant"/>
 *     &lt;enumeration value="time"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="url"/>
 *     &lt;enumeration value="choice"/>
 *     &lt;enumeration value="open-choice"/>
 *     &lt;enumeration value="attachment"/>
 *     &lt;enumeration value="reference"/>
 *     &lt;enumeration value="quantity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnswerFormat-list")
@XmlEnum
public enum AnswerFormatList {


    /**
     * Answer is a yes/no answer.
     * 
     */
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),

    /**
     * Answer is a floating point number.
     * 
     */
    @XmlEnumValue("decimal")
    DECIMAL("decimal"),

    /**
     * Answer is an integer.
     * 
     */
    @XmlEnumValue("integer")
    INTEGER("integer"),

    /**
     * Answer is a date.
     * 
     */
    @XmlEnumValue("date")
    DATE("date"),

    /**
     * Answer is a date and time.
     * 
     */
    @XmlEnumValue("dateTime")
    DATE_TIME("dateTime"),

    /**
     * Answer is a system timestamp.
     * 
     */
    @XmlEnumValue("instant")
    INSTANT("instant"),

    /**
     * Answer is a time (hour/minute/second) independent of date.
     * 
     */
    @XmlEnumValue("time")
    TIME("time"),

    /**
     * Answer is a short (few words to short sentence) free-text entry.
     * 
     */
    @XmlEnumValue("string")
    STRING("string"),

    /**
     * Answer is a long (potentially multi-paragraph) free-text entry (still captured as a string).
     * 
     */
    @XmlEnumValue("text")
    TEXT("text"),

    /**
     * Answer is a url (website, FTP site, etc.).
     * 
     */
    @XmlEnumValue("url")
    URL("url"),

    /**
     * Answer is a Coding drawn from a list of options.
     * 
     */
    @XmlEnumValue("choice")
    CHOICE("choice"),

    /**
     * Answer is a Coding drawn from a list of options or a free-text entry.
     * 
     */
    @XmlEnumValue("open-choice")
    OPEN_CHOICE("open-choice"),

    /**
     * Answer is binary content such as a image, PDF, etc.
     * 
     */
    @XmlEnumValue("attachment")
    ATTACHMENT("attachment"),

    /**
     * Answer is a reference to another resource (practitioner, organization, etc.).
     * 
     */
    @XmlEnumValue("reference")
    REFERENCE("reference"),

    /**
     * Answer is a combination of a numeric value and unit, potentially with a comparator (<, >, etc.).
     * 
     */
    @XmlEnumValue("quantity")
    QUANTITY("quantity");
    private final String value;

    AnswerFormatList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnswerFormatList fromValue(String v) {
        for (AnswerFormatList c: AnswerFormatList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
