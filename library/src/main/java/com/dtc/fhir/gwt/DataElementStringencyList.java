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
 * <p>DataElementStringency-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DataElementStringency-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="comparable"/>
 *     &lt;enumeration value="fully-specified"/>
 *     &lt;enumeration value="equivalent"/>
 *     &lt;enumeration value="convertable"/>
 *     &lt;enumeration value="scaleable"/>
 *     &lt;enumeration value="flexible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataElementStringency-list")
@XmlEnum
public enum DataElementStringencyList {


    /**
     * The data element is sufficiently well-constrained that multiple pieces of data captured according to the constraints of the data element will be comparable (though in some cases, a degree of automated conversion/normalization may be required).
     * 
     */
    @XmlEnumValue("comparable")
    COMPARABLE("comparable"),

    /**
     * The data element is fully specified down to a single value set, single unit of measure, single data type, etc.  Multiple pieces of data associated with this data element are fully comparable.
     * 
     */
    @XmlEnumValue("fully-specified")
    FULLY_SPECIFIED("fully-specified"),

    /**
     * The data element allows multiple units of measure having equivalent meaning; e.g. "cc" (cubic centimeter) and "mL" (milliliter).
     * 
     */
    @XmlEnumValue("equivalent")
    EQUIVALENT("equivalent"),

    /**
     * The data element allows multiple units of measure that are convertable between each other (e.g. inches and centimeters) and/or allows data to be captured in multiple value sets for which a known mapping exists allowing conversion of meaning.
     * 
     */
    @XmlEnumValue("convertable")
    CONVERTABLE("convertable"),

    /**
     * A convertable data element where unit conversions are different only by a power of 10; e.g. g, mg, kg.
     * 
     */
    @XmlEnumValue("scaleable")
    SCALEABLE("scaleable"),

    /**
     * The data element is unconstrained in units, choice of data types and/or choice of vocabulary such that automated comparison of data captured using the data element is not possible.
     * 
     */
    @XmlEnumValue("flexible")
    FLEXIBLE("flexible");
    private final String value;

    DataElementStringencyList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataElementStringencyList fromValue(String v) {
        for (DataElementStringencyList c: DataElementStringencyList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
