//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 * 
 * <p>Provenance.Entity complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Provenance.Entity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://hl7.org/fhir}ProvenanceEntityRole"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="reference" type="{http://hl7.org/fhir}uri"/>
 *         &lt;element name="display" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="agent" type="{http://hl7.org/fhir}Provenance.Agent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provenance.Entity", propOrder = {
    "role",
    "type",
    "reference",
    "display",
    "agent"
})
public class ProvenanceEntity
    extends BackboneElement
{

    @XmlElement(required = true)
    protected ProvenanceEntityRole role;
    @XmlElement(required = true)
    protected Coding type;
    @XmlElement(required = true)
    protected Uri reference;
    protected StringDt display;
    protected ProvenanceAgent agent;

    /**
     * 取得 role 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ProvenanceEntityRole }
     *     
     */
    public ProvenanceEntityRole getRole() {
        return role;
    }

    /**
     * 設定 role 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvenanceEntityRole }
     *     
     */
    public void setRole(ProvenanceEntityRole value) {
        this.role = value;
    }

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setType(Coding value) {
        this.type = value;
    }

    /**
     * 取得 reference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getReference() {
        return reference;
    }

    /**
     * 設定 reference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setReference(Uri value) {
        this.reference = value;
    }

    /**
     * 取得 display 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDisplay() {
        return display;
    }

    /**
     * 設定 display 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDisplay(StringDt value) {
        this.display = value;
    }

    /**
     * 取得 agent 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ProvenanceAgent }
     *     
     */
    public ProvenanceAgent getAgent() {
        return agent;
    }

    /**
     * 設定 agent 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvenanceAgent }
     *     
     */
    public void setAgent(ProvenanceAgent value) {
        this.agent = value;
    }

}
