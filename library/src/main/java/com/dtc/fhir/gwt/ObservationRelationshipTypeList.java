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
 * <p>ObservationRelationshipType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationRelationshipType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="has-member"/>
 *     &lt;enumeration value="derived-from"/>
 *     &lt;enumeration value="sequel-to"/>
 *     &lt;enumeration value="replaces"/>
 *     &lt;enumeration value="qualified-by"/>
 *     &lt;enumeration value="interfered-by"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationRelationshipType-list")
@XmlEnum
public enum ObservationRelationshipTypeList {


    /**
     * This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.
     * 
     */
    @XmlEnumValue("has-member")
    HAS_MEMBER("has-member"),

    /**
     * The target resource (Observation or QuestionnaireResponse) is part of the information from which this observation value is derived. (e.g. calculated anion gap, Apgar score)  NOTE:  "derived-from" is only logical choice when referencing QuestionnaireResponse.
     * 
     */
    @XmlEnumValue("derived-from")
    DERIVED_FROM("derived-from"),

    /**
     * This observation follows the target observation (e.g. timed tests such as Glucose Tolerance Test).
     * 
     */
    @XmlEnumValue("sequel-to")
    SEQUEL_TO("sequel-to"),

    /**
     * This observation replaces a previous observation (i.e. a revised value). The target observation is now obsolete.
     * 
     */
    @XmlEnumValue("replaces")
    REPLACES("replaces"),

    /**
     * The value of the target observation qualifies (refines) the semantics of the source observation (e.g. a lipemia measure target from a plasma measure).
     * 
     */
    @XmlEnumValue("qualified-by")
    QUALIFIED_BY("qualified-by"),

    /**
     * The value of the target observation interferes (degrades quality, or prevents valid observation) with the semantics of the source observation (e.g. a hemolysis measure target from a plasma potassium measure which has no value).
     * 
     */
    @XmlEnumValue("interfered-by")
    INTERFERED_BY("interfered-by");
    private final String value;

    ObservationRelationshipTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObservationRelationshipTypeList fromValue(String v) {
        for (ObservationRelationshipTypeList c: ObservationRelationshipTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
