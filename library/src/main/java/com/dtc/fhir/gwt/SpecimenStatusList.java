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
 * <p>SpecimenStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecimenStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="available"/>
 *     &lt;enumeration value="unavailable"/>
 *     &lt;enumeration value="unsatisfactory"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecimenStatus-list")
@XmlEnum
public enum SpecimenStatusList {


    /**
     * The physical specimen is present and in good condition.
     * 
     */
    @XmlEnumValue("available")
    AVAILABLE("available"),

    /**
     * There is no physical specimen because it is either lost, destroyed or consumed.
     * 
     */
    @XmlEnumValue("unavailable")
    UNAVAILABLE("unavailable"),

    /**
     * The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old.
     * 
     */
    @XmlEnumValue("unsatisfactory")
    UNSATISFACTORY("unsatisfactory"),

    /**
     * The specimen was entered in error and therefore nullified.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final String value;

    SpecimenStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecimenStatusList fromValue(String v) {
        for (SpecimenStatusList c: SpecimenStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
