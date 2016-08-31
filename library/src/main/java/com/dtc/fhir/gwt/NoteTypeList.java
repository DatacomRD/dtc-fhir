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
 * <p>NoteType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="NoteType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="display"/>
 *     &lt;enumeration value="print"/>
 *     &lt;enumeration value="printoper"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NoteType-list")
@XmlEnum
public enum NoteTypeList {


    /**
     * Display the note.
     * 
     */
    @XmlEnumValue("display")
    DISPLAY("display"),

    /**
     * Print the note on the form.
     * 
     */
    @XmlEnumValue("print")
    PRINT("print"),

    /**
     * Print the note for the operator.
     * 
     */
    @XmlEnumValue("printoper")
    PRINTOPER("printoper");
    private final String value;

    NoteTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoteTypeList fromValue(String v) {
        for (NoteTypeList c: NoteTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
