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
 * <p>IdentityAssuranceLevel-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentityAssuranceLevel-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="level1"/>
 *     &lt;enumeration value="level2"/>
 *     &lt;enumeration value="level3"/>
 *     &lt;enumeration value="level4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdentityAssuranceLevel-list")
@XmlEnum
public enum IdentityAssuranceLevelList {


    /**
     * Little or no confidence in the asserted identity's accuracy.
     * 
     */
    @XmlEnumValue("level1")
    LEVEL_1("level1"),

    /**
     * Some confidence in the asserted identity's accuracy.
     * 
     */
    @XmlEnumValue("level2")
    LEVEL_2("level2"),

    /**
     * High confidence in the asserted identity's accuracy.
     * 
     */
    @XmlEnumValue("level3")
    LEVEL_3("level3"),

    /**
     * Very high confidence in the asserted identity's accuracy.
     * 
     */
    @XmlEnumValue("level4")
    LEVEL_4("level4");
    private final String value;

    IdentityAssuranceLevelList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentityAssuranceLevelList fromValue(String v) {
        for (IdentityAssuranceLevelList c: IdentityAssuranceLevelList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
