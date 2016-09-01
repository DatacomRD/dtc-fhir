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
 * <p>DetectedIssueSeverity-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DetectedIssueSeverity-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="high"/>
 *     &lt;enumeration value="moderate"/>
 *     &lt;enumeration value="low"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DetectedIssueSeverity-list")
@XmlEnum
public enum DetectedIssueSeverityList {


    /**
     * Indicates the issue may be life-threatening or has the potential to cause permanent injury.
     * 
     */
    @XmlEnumValue("high")
    HIGH("high"),

    /**
     * Indicates the issue may result in noticeable adverse consequences but is unlikely to be life-threatening or cause permanent injury.
     * 
     */
    @XmlEnumValue("moderate")
    MODERATE("moderate"),

    /**
     * Indicates the issue may result in some adverse consequences but is unlikely to substantially affect the situation of the subject.
     * 
     */
    @XmlEnumValue("low")
    LOW("low");
    private final String value;

    DetectedIssueSeverityList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetectedIssueSeverityList fromValue(String v) {
        for (DetectedIssueSeverityList c: DetectedIssueSeverityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
