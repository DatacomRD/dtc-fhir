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
 * <p>GuidePageKind-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="GuidePageKind-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="page"/>
 *     &lt;enumeration value="example"/>
 *     &lt;enumeration value="list"/>
 *     &lt;enumeration value="include"/>
 *     &lt;enumeration value="directory"/>
 *     &lt;enumeration value="dictionary"/>
 *     &lt;enumeration value="toc"/>
 *     &lt;enumeration value="resource"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuidePageKind-list")
@XmlEnum
public enum GuidePageKindList {


    /**
     * This is a page of content that is included in the implementation guide. It has no particular function.
     * 
     */
    @XmlEnumValue("page")
    PAGE("page"),

    /**
     * This is a page that represents a human readable rendering of an example.
     * 
     */
    @XmlEnumValue("example")
    EXAMPLE("example"),

    /**
     * This is a page that represents a list of resources of one or more types.
     * 
     */
    @XmlEnumValue("list")
    LIST("list"),

    /**
     * This is a page showing where an included guide is injected.
     * 
     */
    @XmlEnumValue("include")
    INCLUDE("include"),

    /**
     * This is a page that lists the resources of a given type, and also creates pages for all the listed types as other pages in the section.
     * 
     */
    @XmlEnumValue("directory")
    DIRECTORY("directory"),

    /**
     * This is a page that creates the listed resources as a dictionary.
     * 
     */
    @XmlEnumValue("dictionary")
    DICTIONARY("dictionary"),

    /**
     * This is a generated page that contains the table of contents.
     * 
     */
    @XmlEnumValue("toc")
    TOC("toc"),

    /**
     * This is a page that represents a presented resource. This is typically used for generated conformance resource presentations.
     * 
     */
    @XmlEnumValue("resource")
    RESOURCE("resource");
    private final String value;

    GuidePageKindList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuidePageKindList fromValue(String v) {
        for (GuidePageKindList c: GuidePageKindList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
