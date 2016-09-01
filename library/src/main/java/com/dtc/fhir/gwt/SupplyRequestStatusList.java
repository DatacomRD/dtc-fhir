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
 * <p>SupplyRequestStatus-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplyRequestStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="requested"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="failed"/>
 *     &lt;enumeration value="cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupplyRequestStatus-list")
@XmlEnum
public enum SupplyRequestStatusList {


    /**
     * Supply has been requested, but not dispensed.
     * 
     */
    @XmlEnumValue("requested")
    REQUESTED("requested"),

    /**
     * Supply has been received by the requestor.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The supply will not be completed because the supplier was unable or unwilling to supply the item.
     * 
     */
    @XmlEnumValue("failed")
    FAILED("failed"),

    /**
     * The orderer of the supply cancelled the request.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final String value;

    SupplyRequestStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplyRequestStatusList fromValue(String v) {
        for (SupplyRequestStatusList c: SupplyRequestStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
