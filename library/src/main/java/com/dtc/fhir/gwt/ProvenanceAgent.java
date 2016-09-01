//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 * 
 * <p>Provenance.Agent complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Provenance.Agent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="actor" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="relatedAgent" type="{http://hl7.org/fhir}Provenance.RelatedAgent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provenance.Agent", propOrder = {
    "role",
    "actor",
    "userId",
    "relatedAgent"
})
public class ProvenanceAgent
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Coding role;
    protected Reference actor;
    protected Identifier userId;
    protected List<ProvenanceRelatedAgent> relatedAgent;

    /**
     * 取得 role 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getRole() {
        return role;
    }

    /**
     * 設定 role 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setRole(Coding value) {
        this.role = value;
    }

    /**
     * 取得 actor 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getActor() {
        return actor;
    }

    /**
     * 設定 actor 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setActor(Reference value) {
        this.actor = value;
    }

    /**
     * 取得 userId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getUserId() {
        return userId;
    }

    /**
     * 設定 userId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setUserId(Identifier value) {
        this.userId = value;
    }

    /**
     * Gets the value of the relatedAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvenanceRelatedAgent }
     * 
     * 
     */
    public List<ProvenanceRelatedAgent> getRelatedAgent() {
        if (relatedAgent == null) {
            relatedAgent = new ArrayList<ProvenanceRelatedAgent>();
        }
        return this.relatedAgent;
    }

}
