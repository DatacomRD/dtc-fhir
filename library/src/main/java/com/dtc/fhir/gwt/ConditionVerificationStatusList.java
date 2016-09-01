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
 * <p>ConditionVerificationStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionVerificationStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="provisional"/>
 *     &lt;enumeration value="differential"/>
 *     &lt;enumeration value="confirmed"/>
 *     &lt;enumeration value="refuted"/>
 *     &lt;enumeration value="entered-in-error"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditionVerificationStatus-list")
@XmlEnum
public enum ConditionVerificationStatusList {


    /**
     * This is a tentative diagnosis - still a candidate that is under consideration.
     * 
     */
    @XmlEnumValue("provisional")
    PROVISIONAL("provisional"),

    /**
     * One of a set of potential (and typically mutually exclusive) diagnosis asserted to further guide the diagnostic process and preliminary treatment.
     * 
     */
    @XmlEnumValue("differential")
    DIFFERENTIAL("differential"),

    /**
     * There is sufficient diagnostic and/or clinical evidence to treat this as a confirmed condition.
     * 
     */
    @XmlEnumValue("confirmed")
    CONFIRMED("confirmed"),

    /**
     * This condition has been ruled out by diagnostic and clinical evidence.
     * 
     */
    @XmlEnumValue("refuted")
    REFUTED("refuted"),

    /**
     * The statement was entered in error and is not valid.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error"),

    /**
     * The condition status is unknown.  Note that "unknown" is a value of last resort and every attempt should be made to provide a meaningful value other than "unknown".
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ConditionVerificationStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionVerificationStatusList fromValue(String v) {
        for (ConditionVerificationStatusList c: ConditionVerificationStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
