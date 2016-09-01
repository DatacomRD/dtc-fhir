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
 * <p>AllergyIntoleranceStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="AllergyIntoleranceStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="unconfirmed"/>
 *     &lt;enumeration value="confirmed"/>
 *     &lt;enumeration value="inactive"/>
 *     &lt;enumeration value="resolved"/>
 *     &lt;enumeration value="refuted"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllergyIntoleranceStatus-list")
@XmlEnum
public enum AllergyIntoleranceStatusList {


    /**
     * An active record of a reaction to the identified Substance.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * A low level of certainty about the propensity for a reaction to the identified Substance.
     * 
     */
    @XmlEnumValue("unconfirmed")
    UNCONFIRMED("unconfirmed"),

    /**
     * A high level of certainty about the propensity for a reaction to the identified Substance, which may include clinical evidence by testing or rechallenge.
     * 
     */
    @XmlEnumValue("confirmed")
    CONFIRMED("confirmed"),

    /**
     * An inactive record of a reaction to the identified Substance.
     * 
     */
    @XmlEnumValue("inactive")
    INACTIVE("inactive"),

    /**
     * A reaction to the identified Substance has been clinically reassessed by testing or rechallenge and considered to be resolved.
     * 
     */
    @XmlEnumValue("resolved")
    RESOLVED("resolved"),

    /**
     * A propensity for a reaction to the identified Substance has been disproven with a high level of clinical certainty, which may include testing or rechallenge, and is refuted.
     * 
     */
    @XmlEnumValue("refuted")
    REFUTED("refuted"),

    /**
     * The statement was entered in error and is not valid.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final String value;

    AllergyIntoleranceStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllergyIntoleranceStatusList fromValue(String v) {
        for (AllergyIntoleranceStatusList c: AllergyIntoleranceStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
