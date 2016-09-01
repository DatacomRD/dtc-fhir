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
 * <p>BindingStrength-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="BindingStrength-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="required"/>
 *     &lt;enumeration value="extensible"/>
 *     &lt;enumeration value="preferred"/>
 *     &lt;enumeration value="example"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BindingStrength-list")
@XmlEnum
public enum BindingStrengthList {


    /**
     * To be conformant, instances of this element SHALL include a code from the specified value set.
     * 
     */
    @XmlEnumValue("required")
    REQUIRED("required"),

    /**
     * To be conformant, instances of this element SHALL include a code from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the valueset does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead.
     * 
     */
    @XmlEnumValue("extensible")
    EXTENSIBLE("extensible"),

    /**
     * Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant.
     * 
     */
    @XmlEnumValue("preferred")
    PREFERRED("preferred"),

    /**
     * Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included.
     * 
     */
    @XmlEnumValue("example")
    EXAMPLE("example");
    private final String value;

    BindingStrengthList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BindingStrengthList fromValue(String v) {
        for (BindingStrengthList c: BindingStrengthList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
