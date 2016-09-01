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
 * <p>AuditEvent.Event complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="AuditEvent.Event">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="subtype" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="action" type="{http://hl7.org/fhir}AuditEventAction" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}AuditEventOutcome" minOccurs="0"/>
 *         &lt;element name="outcomeDesc" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="purposeOfEvent" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditEvent.Event", propOrder = {
    "type",
    "subtype",
    "action",
    "dateTime",
    "outcome",
    "outcomeDesc",
    "purposeOfEvent"
})
public class AuditEventEvent
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Coding type;
    protected List<Coding> subtype;
    protected AuditEventAction action;
    @XmlElement(required = true)
    protected Instant dateTime;
    protected AuditEventOutcome outcome;
    protected StringDt outcomeDesc;
    protected List<Coding> purposeOfEvent;

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
     * Gets the value of the subtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getSubtype() {
        if (subtype == null) {
            subtype = new ArrayList<Coding>();
        }
        return this.subtype;
    }

    /**
     * 取得 action 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AuditEventAction }
     *     
     */
    public AuditEventAction getAction() {
        return action;
    }

    /**
     * 設定 action 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEventAction }
     *     
     */
    public void setAction(AuditEventAction value) {
        this.action = value;
    }

    /**
     * 取得 dateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getDateTime() {
        return dateTime;
    }

    /**
     * 設定 dateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setDateTime(Instant value) {
        this.dateTime = value;
    }

    /**
     * 取得 outcome 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AuditEventOutcome }
     *     
     */
    public AuditEventOutcome getOutcome() {
        return outcome;
    }

    /**
     * 設定 outcome 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEventOutcome }
     *     
     */
    public void setOutcome(AuditEventOutcome value) {
        this.outcome = value;
    }

    /**
     * 取得 outcomeDesc 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getOutcomeDesc() {
        return outcomeDesc;
    }

    /**
     * 設定 outcomeDesc 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setOutcomeDesc(StringDt value) {
        this.outcomeDesc = value;
    }

    /**
     * Gets the value of the purposeOfEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purposeOfEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurposeOfEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getPurposeOfEvent() {
        if (purposeOfEvent == null) {
            purposeOfEvent = new ArrayList<Coding>();
        }
        return this.purposeOfEvent;
    }

}
