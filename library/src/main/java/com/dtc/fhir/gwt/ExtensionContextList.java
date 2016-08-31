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
 * <p>ExtensionContext-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtensionContext-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="resource"/>
 *     &lt;enumeration value="datatype"/>
 *     &lt;enumeration value="mapping"/>
 *     &lt;enumeration value="extension"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtensionContext-list")
@XmlEnum
public enum ExtensionContextList {


    /**
     * The context is all elements matching a particular resource element path.
     * 
     */
    @XmlEnumValue("resource")
    RESOURCE("resource"),

    /**
     * The context is all nodes matching a particular data type element path (root or repeating element) or all elements referencing a particular primitive data type (expressed as the datatype name).
     * 
     */
    @XmlEnumValue("datatype")
    DATATYPE("datatype"),

    /**
     * The context is all nodes whose mapping to a specified reference model corresponds to a particular mapping structure.  The context identifies the mapping target. The mapping should clearly identify where such an extension could be used.
     * 
     */
    @XmlEnumValue("mapping")
    MAPPING("mapping"),

    /**
     * The context is a particular extension from a particular profile, a uri that identifies the extension definition.
     * 
     */
    @XmlEnumValue("extension")
    EXTENSION("extension");
    private final String value;

    ExtensionContextList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtensionContextList fromValue(String v) {
        for (ExtensionContextList c: ExtensionContextList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
