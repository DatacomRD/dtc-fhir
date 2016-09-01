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
 * <p>EncounterClass-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="EncounterClass-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="inpatient"/>
 *     &lt;enumeration value="outpatient"/>
 *     &lt;enumeration value="ambulatory"/>
 *     &lt;enumeration value="emergency"/>
 *     &lt;enumeration value="home"/>
 *     &lt;enumeration value="field"/>
 *     &lt;enumeration value="daytime"/>
 *     &lt;enumeration value="virtual"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncounterClass-list")
@XmlEnum
public enum EncounterClassList {


    /**
     * An encounter during which the patient is hospitalized and stays overnight.
     * 
     */
    @XmlEnumValue("inpatient")
    INPATIENT("inpatient"),

    /**
     * An encounter during which the patient is not hospitalized overnight.
     * 
     */
    @XmlEnumValue("outpatient")
    OUTPATIENT("outpatient"),

    /**
     * An encounter where the patient visits the practitioner in his/her office, e.g. a G.P. visit.
     * 
     */
    @XmlEnumValue("ambulatory")
    AMBULATORY("ambulatory"),

    /**
     * An encounter in the Emergency Care Department.
     * 
     */
    @XmlEnumValue("emergency")
    EMERGENCY("emergency"),

    /**
     * An encounter where the practitioner visits the patient at his/her home.
     * 
     */
    @XmlEnumValue("home")
    HOME("home"),

    /**
     * An encounter taking place outside the regular environment for giving care.
     * 
     */
    @XmlEnumValue("field")
    FIELD("field"),

    /**
     * An encounter where the patient needs more prolonged treatment or investigations than outpatients, but who do not need to stay in the hospital overnight.
     * 
     */
    @XmlEnumValue("daytime")
    DAYTIME("daytime"),

    /**
     * An encounter that takes place where the patient and practitioner do not physically meet but use electronic means for contact.
     * 
     */
    @XmlEnumValue("virtual")
    VIRTUAL("virtual"),

    /**
     * Any other encounter type that is not described by one of the other values. Where this is used it is expected that an implementer will include an extension value to define what the actual other type is.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EncounterClassList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncounterClassList fromValue(String v) {
        for (EncounterClassList c: EncounterClassList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
