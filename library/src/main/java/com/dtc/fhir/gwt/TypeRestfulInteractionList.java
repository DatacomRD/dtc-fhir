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
 * <p>TypeRestfulInteraction-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeRestfulInteraction-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="read"/>
 *     &lt;enumeration value="vread"/>
 *     &lt;enumeration value="update"/>
 *     &lt;enumeration value="delete"/>
 *     &lt;enumeration value="history-instance"/>
 *     &lt;enumeration value="validate"/>
 *     &lt;enumeration value="history-type"/>
 *     &lt;enumeration value="create"/>
 *     &lt;enumeration value="search-type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeRestfulInteraction-list")
@XmlEnum
public enum TypeRestfulInteractionList {

    @XmlEnumValue("read")
    READ("read"),
    @XmlEnumValue("vread")
    VREAD("vread"),
    @XmlEnumValue("update")
    UPDATE("update"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("history-instance")
    HISTORY_INSTANCE("history-instance"),
    @XmlEnumValue("validate")
    VALIDATE("validate"),
    @XmlEnumValue("history-type")
    HISTORY_TYPE("history-type"),
    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("search-type")
    SEARCH_TYPE("search-type");
    private final String value;

    TypeRestfulInteractionList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRestfulInteractionList fromValue(String v) {
        for (TypeRestfulInteractionList c: TypeRestfulInteractionList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
