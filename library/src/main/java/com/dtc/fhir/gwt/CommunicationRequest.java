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
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>CommunicationRequest complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="CommunicationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="recipient" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="payload" type="{http://hl7.org/fhir}CommunicationRequest.Payload" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="medium" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requester" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}CommunicationRequestStatus" minOccurs="0"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="scheduledDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="scheduledPeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requestedOn" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationRequest", propOrder = {
    "identifier",
    "category",
    "sender",
    "recipient",
    "payload",
    "medium",
    "requester",
    "status",
    "encounter",
    "scheduledDateTime",
    "scheduledPeriod",
    "reason",
    "requestedOn",
    "subject",
    "priority"
})
public class CommunicationRequest
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected CodeableConcept category;
    protected Reference sender;
    protected List<Reference> recipient;
    protected List<CommunicationRequestPayload> payload;
    protected List<CodeableConcept> medium;
    protected Reference requester;
    protected CommunicationRequestStatus status;
    protected Reference encounter;
    protected DateTime scheduledDateTime;
    protected Period scheduledPeriod;
    protected List<CodeableConcept> reason;
    protected DateTime requestedOn;
    protected Reference subject;
    protected CodeableConcept priority;

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
     * 取得 category 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * 設定 category 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCategory(CodeableConcept value) {
        this.category = value;
    }

    /**
     * 取得 sender 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSender() {
        return sender;
    }

    /**
     * 設定 sender 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSender(Reference value) {
        this.sender = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getRecipient() {
        if (recipient == null) {
            recipient = new ArrayList<Reference>();
        }
        return this.recipient;
    }

    /**
     * Gets the value of the payload property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payload property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayload().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationRequestPayload }
     * 
     * 
     */
    public List<CommunicationRequestPayload> getPayload() {
        if (payload == null) {
            payload = new ArrayList<CommunicationRequestPayload>();
        }
        return this.payload;
    }

    /**
     * Gets the value of the medium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getMedium() {
        if (medium == null) {
            medium = new ArrayList<CodeableConcept>();
        }
        return this.medium;
    }

    /**
     * 取得 requester 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRequester() {
        return requester;
    }

    /**
     * 設定 requester 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRequester(Reference value) {
        this.requester = value;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationRequestStatus }
     *     
     */
    public CommunicationRequestStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationRequestStatus }
     *     
     */
    public void setStatus(CommunicationRequestStatus value) {
        this.status = value;
    }

    /**
     * 取得 encounter 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * 設定 encounter 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setEncounter(Reference value) {
        this.encounter = value;
    }

    /**
     * 取得 scheduledDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getScheduledDateTime() {
        return scheduledDateTime;
    }

    /**
     * 設定 scheduledDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setScheduledDateTime(DateTime value) {
        this.scheduledDateTime = value;
    }

    /**
     * 取得 scheduledPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getScheduledPeriod() {
        return scheduledPeriod;
    }

    /**
     * 設定 scheduledPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setScheduledPeriod(Period value) {
        this.scheduledPeriod = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getReason() {
        if (reason == null) {
            reason = new ArrayList<CodeableConcept>();
        }
        return this.reason;
    }

    /**
     * 取得 requestedOn 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getRequestedOn() {
        return requestedOn;
    }

    /**
     * 設定 requestedOn 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setRequestedOn(DateTime value) {
        this.requestedOn = value;
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
     * 取得 priority 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getPriority() {
        return priority;
    }

    /**
     * 設定 priority 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setPriority(CodeableConcept value) {
        this.priority = value;
    }

}
