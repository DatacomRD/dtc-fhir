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
 * <p>CarePlanRelationship-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="CarePlanRelationship-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="includes"/>
 *     &lt;enumeration value="replaces"/>
 *     &lt;enumeration value="fulfills"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarePlanRelationship-list")
@XmlEnum
public enum CarePlanRelationshipList {


    /**
     * The referenced plan is considered to be part of this plan.
     * 
     */
    @XmlEnumValue("includes")
    INCLUDES("includes"),

    /**
     * This plan takes the places of the referenced plan.
     * 
     */
    @XmlEnumValue("replaces")
    REPLACES("replaces"),

    /**
     * This plan provides details about how to perform activities defined at a higher level by the referenced plan.
     * 
     */
    @XmlEnumValue("fulfills")
    FULFILLS("fulfills");
    private final String value;

    CarePlanRelationshipList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarePlanRelationshipList fromValue(String v) {
        for (CarePlanRelationshipList c: CarePlanRelationshipList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
