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
 * <p>QuestionnaireStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="QuestionnaireStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="published"/>
 *     &lt;enumeration value="retired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuestionnaireStatus-list")
@XmlEnum
public enum QuestionnaireStatusList {


    /**
     * This Questionnaire is not ready for official use.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * This Questionnaire is ready for use.
     * 
     */
    @XmlEnumValue("published")
    PUBLISHED("published"),

    /**
     * This Questionnaire should no longer be used to gather data.
     * 
     */
    @XmlEnumValue("retired")
    RETIRED("retired");
    private final String value;

    QuestionnaireStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuestionnaireStatusList fromValue(String v) {
        for (QuestionnaireStatusList c: QuestionnaireStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
