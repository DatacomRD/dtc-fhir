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
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * 
 * <p>AuditEvent.Participant complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="AuditEvent.Participant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="altId" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="requestor" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="policy" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="media" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="network" type="{http://hl7.org/fhir}AuditEvent.Network" minOccurs="0"/>
 *         &lt;element name="purposeOfUse" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditEvent.Participant", propOrder = {
    "role",
    "reference",
    "userId",
    "altId",
    "name",
    "requestor",
    "location",
    "policy",
    "media",
    "network",
    "purposeOfUse"
})
public class AuditEventParticipant
    extends BackboneElement
{

    protected List<CodeableConcept> role;
    protected Reference reference;
    protected Identifier userId;
    protected StringDt altId;
    protected StringDt name;
    @XmlElement(required = true)
    protected BooleanDt requestor;
    protected Reference location;
    protected List<Uri> policy;
    protected Coding media;
    protected AuditEventNetwork network;
    protected List<Coding> purposeOfUse;

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getRole() {
        if (role == null) {
            role = new ArrayList<CodeableConcept>();
        }
        return this.role;
    }

    /**
     * 取得 reference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * 設定 reference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReference(Reference value) {
        this.reference = value;
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
     * 取得 altId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getAltId() {
        return altId;
    }

    /**
     * 設定 altId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setAltId(StringDt value) {
        this.altId = value;
    }

    /**
     * 取得 name 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getName() {
        return name;
    }

    /**
     * 設定 name 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setName(StringDt value) {
        this.name = value;
    }

    /**
     * 取得 requestor 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getRequestor() {
        return requestor;
    }

    /**
     * 設定 requestor 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setRequestor(BooleanDt value) {
        this.requestor = value;
    }

    /**
     * 取得 location 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getLocation() {
        return location;
    }

    /**
     * 設定 location 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setLocation(Reference value) {
        this.location = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<Uri>();
        }
        return this.policy;
    }

    /**
     * 取得 media 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getMedia() {
        return media;
    }

    /**
     * 設定 media 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setMedia(Coding value) {
        this.media = value;
    }

    /**
     * 取得 network 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AuditEventNetwork }
     *     
     */
    public AuditEventNetwork getNetwork() {
        return network;
    }

    /**
     * 設定 network 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEventNetwork }
     *     
     */
    public void setNetwork(AuditEventNetwork value) {
        this.network = value;
    }

    /**
     * Gets the value of the purposeOfUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purposeOfUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurposeOfUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getPurposeOfUse() {
        if (purposeOfUse == null) {
            purposeOfUse = new ArrayList<Coding>();
        }
        return this.purposeOfUse;
    }

}
