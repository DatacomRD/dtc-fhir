//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EventTiming-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="EventTiming-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HS"/>
 *     &lt;enumeration value="WAKE"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="ACM"/>
 *     &lt;enumeration value="ACD"/>
 *     &lt;enumeration value="ACV"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="PCM"/>
 *     &lt;enumeration value="PCD"/>
 *     &lt;enumeration value="PCV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventTiming-list")
@XmlEnum
public enum EventTimingList {

    HS,
    WAKE,
    C,
    CM,
    CD,
    CV,
    AC,
    ACM,
    ACD,
    ACV,
    PC,
    PCM,
    PCD,
    PCV;

    public String value() {
        return name();
    }

    public static EventTimingList fromValue(String v) {
        return valueOf(v);
    }

}
