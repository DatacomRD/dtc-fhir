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
 * <p>AuditEventAction-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="AuditEventAction-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuditEventAction-list")
@XmlEnum
public enum AuditEventActionList {


    /**
     * Create a new database object, such as placing an order.
     * 
     */
    C,

    /**
     * Display or print data, such as a doctor census.
     * 
     */
    R,

    /**
     * Update data, such as revise patient information.
     * 
     */
    U,

    /**
     * Delete items, such as a doctor master file record.
     * 
     */
    D,

    /**
     * Perform a system or application function such as log-on, program execution or use of an object's method, or perform a query/search operation.
     * 
     */
    E;

    public String value() {
        return name();
    }

    public static AuditEventActionList fromValue(String v) {
        return valueOf(v);
    }

}
