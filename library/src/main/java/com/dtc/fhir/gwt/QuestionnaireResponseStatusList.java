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
 * <p>QuestionnaireResponseStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="QuestionnaireResponseStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="in-progress"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="amended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuestionnaireResponseStatus-list")
@XmlEnum
public enum QuestionnaireResponseStatusList {


    /**
     * This QuestionnaireResponse has been partially filled out with answers, but changes or additions are still expected to be made to it.
     * 
     */
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress"),

    /**
     * This QuestionnaireResponse has been filled out with answers, and the current content is regarded as definitive.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.
     * 
     */
    @XmlEnumValue("amended")
    AMENDED("amended");
    private final String value;

    QuestionnaireResponseStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuestionnaireResponseStatusList fromValue(String v) {
        for (QuestionnaireResponseStatusList c: QuestionnaireResponseStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
