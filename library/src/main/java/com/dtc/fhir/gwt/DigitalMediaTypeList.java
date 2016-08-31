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
 * <p>DigitalMediaType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DigitalMediaType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="photo"/>
 *     &lt;enumeration value="video"/>
 *     &lt;enumeration value="audio"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DigitalMediaType-list")
@XmlEnum
public enum DigitalMediaTypeList {


    /**
     * The media consists of one or more unmoving images, including photographs, computer-generated graphs and charts, and scanned documents
     * 
     */
    @XmlEnumValue("photo")
    PHOTO("photo"),

    /**
     * The media consists of a series of frames that capture a moving image
     * 
     */
    @XmlEnumValue("video")
    VIDEO("video"),

    /**
     * The media consists of a sound recording
     * 
     */
    @XmlEnumValue("audio")
    AUDIO("audio");
    private final String value;

    DigitalMediaTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DigitalMediaTypeList fromValue(String v) {
        for (DigitalMediaTypeList c: DigitalMediaTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
