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
 * <p>AggregationMode-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="AggregationMode-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="contained"/>
 *     &lt;enumeration value="referenced"/>
 *     &lt;enumeration value="bundled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AggregationMode-list")
@XmlEnum
public enum AggregationModeList {


    /**
     * The reference is a local reference to a contained resource.
     * 
     */
    @XmlEnumValue("contained")
    CONTAINED("contained"),

    /**
     * The reference to a resource that has to be resolved externally to the resource that includes the reference.
     * 
     */
    @XmlEnumValue("referenced")
    REFERENCED("referenced"),

    /**
     * The resource the reference points to will be found in the same bundle as the resource that includes the reference.
     * 
     */
    @XmlEnumValue("bundled")
    BUNDLED("bundled");
    private final String value;

    AggregationModeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AggregationModeList fromValue(String v) {
        for (AggregationModeList c: AggregationModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
