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
 * <p>MessageHeader complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="MessageHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="timestamp" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="event" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="response" type="{http://hl7.org/fhir}MessageHeader.Response" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}MessageHeader.Source"/>
 *         &lt;element name="destination" type="{http://hl7.org/fhir}MessageHeader.Destination" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enterer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="author" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="responsible" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="data" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader", propOrder = {
    "timestamp",
    "event",
    "response",
    "source",
    "destination",
    "enterer",
    "author",
    "receiver",
    "responsible",
    "reason",
    "data"
})
public class MessageHeader
    extends DomainResource
{

    @XmlElement(required = true)
    protected Instant timestamp;
    @XmlElement(required = true)
    protected Coding event;
    protected MessageHeaderResponse response;
    @XmlElement(required = true)
    protected MessageHeaderSource source;
    protected List<MessageHeaderDestination> destination;
    protected Reference enterer;
    protected Reference author;
    protected Reference receiver;
    protected Reference responsible;
    protected CodeableConcept reason;
    protected List<Reference> data;

    /**
     * 取得 timestamp 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getTimestamp() {
        return timestamp;
    }

    /**
     * 設定 timestamp 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setTimestamp(Instant value) {
        this.timestamp = value;
    }

    /**
     * 取得 event 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getEvent() {
        return event;
    }

    /**
     * 設定 event 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setEvent(Coding value) {
        this.event = value;
    }

    /**
     * 取得 response 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderResponse }
     *     
     */
    public MessageHeaderResponse getResponse() {
        return response;
    }

    /**
     * 設定 response 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderResponse }
     *     
     */
    public void setResponse(MessageHeaderResponse value) {
        this.response = value;
    }

    /**
     * 取得 source 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderSource }
     *     
     */
    public MessageHeaderSource getSource() {
        return source;
    }

    /**
     * 設定 source 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderSource }
     *     
     */
    public void setSource(MessageHeaderSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageHeaderDestination }
     * 
     * 
     */
    public List<MessageHeaderDestination> getDestination() {
        if (destination == null) {
            destination = new ArrayList<MessageHeaderDestination>();
        }
        return this.destination;
    }

    /**
     * 取得 enterer 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getEnterer() {
        return enterer;
    }

    /**
     * 設定 enterer 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setEnterer(Reference value) {
        this.enterer = value;
    }

    /**
     * 取得 author 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getAuthor() {
        return author;
    }

    /**
     * 設定 author 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setAuthor(Reference value) {
        this.author = value;
    }

    /**
     * 取得 receiver 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReceiver() {
        return receiver;
    }

    /**
     * 設定 receiver 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReceiver(Reference value) {
        this.receiver = value;
    }

    /**
     * 取得 responsible 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getResponsible() {
        return responsible;
    }

    /**
     * 設定 responsible 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setResponsible(Reference value) {
        this.responsible = value;
    }

    /**
     * 取得 reason 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReason() {
        return reason;
    }

    /**
     * 設定 reason 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReason(CodeableConcept value) {
        this.reason = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getData() {
        if (data == null) {
            data = new ArrayList<Reference>();
        }
        return this.data;
    }

}
