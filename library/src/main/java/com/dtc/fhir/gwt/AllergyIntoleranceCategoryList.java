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
 * <p>AllergyIntoleranceCategory-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="AllergyIntoleranceCategory-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="food"/>
 *     &lt;enumeration value="medication"/>
 *     &lt;enumeration value="environment"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllergyIntoleranceCategory-list")
@XmlEnum
public enum AllergyIntoleranceCategoryList {


    /**
     * Any substance consumed to provide nutritional support for the body.
     * 
     */
    @XmlEnumValue("food")
    FOOD("food"),

    /**
     * Substances administered to achieve a physiological effect.
     * 
     */
    @XmlEnumValue("medication")
    MEDICATION("medication"),

    /**
     * Substances that are encountered in the environment.
     * 
     */
    @XmlEnumValue("environment")
    ENVIRONMENT("environment"),

    /**
     * Other substances that are not covered by any other category.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AllergyIntoleranceCategoryList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllergyIntoleranceCategoryList fromValue(String v) {
        for (AllergyIntoleranceCategoryList c: AllergyIntoleranceCategoryList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
