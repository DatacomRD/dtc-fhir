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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>EnrollmentRequest complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="EnrollmentRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ruleset" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="originalRuleset" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="created" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="target" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="provider" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="coverage" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="relationship" type="{http://hl7.org/fhir}Coding"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrollmentRequest", propOrder = {
    "identifier",
    "ruleset",
    "originalRuleset",
    "created",
    "target",
    "provider",
    "organization",
    "subject",
    "coverage",
    "relationship"
})
public class EnrollmentRequest
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected Coding ruleset;
    protected Coding originalRuleset;
    protected DateTime created;
    protected Reference target;
    protected Reference provider;
    protected Reference organization;
    @XmlElement(required = true)
    protected Reference subject;
    @XmlElement(required = true)
    protected Reference coverage;
    @XmlElement(required = true)
    protected Coding relationship;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * 取得 ruleset 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getRuleset() {
        return ruleset;
    }

    /**
     * 設定 ruleset 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setRuleset(Coding value) {
        this.ruleset = value;
    }

    /**
     * 取得 originalRuleset 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getOriginalRuleset() {
        return originalRuleset;
    }

    /**
     * 設定 originalRuleset 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setOriginalRuleset(Coding value) {
        this.originalRuleset = value;
    }

    /**
     * 取得 created 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCreated() {
        return created;
    }

    /**
     * 設定 created 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreated(DateTime value) {
        this.created = value;
    }

    /**
     * 取得 target 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getTarget() {
        return target;
    }

    /**
     * 設定 target 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setTarget(Reference value) {
        this.target = value;
    }

    /**
     * 取得 provider 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getProvider() {
        return provider;
    }

    /**
     * 設定 provider 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setProvider(Reference value) {
        this.provider = value;
    }

    /**
     * 取得 organization 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOrganization() {
        return organization;
    }

    /**
     * 設定 organization 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOrganization(Reference value) {
        this.organization = value;
    }

    /**
     * 取得 subject 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSubject() {
        return subject;
    }

    /**
     * 設定 subject 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSubject(Reference value) {
        this.subject = value;
    }

    /**
     * 取得 coverage 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getCoverage() {
        return coverage;
    }

    /**
     * 設定 coverage 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setCoverage(Reference value) {
        this.coverage = value;
    }

    /**
     * 取得 relationship 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getRelationship() {
        return relationship;
    }

    /**
     * 設定 relationship 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setRelationship(Coding value) {
        this.relationship = value;
    }

}
