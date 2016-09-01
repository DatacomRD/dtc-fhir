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
 * <p>Subscription complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Subscription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}ContactPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}SubscriptionStatus"/>
 *         &lt;element name="error" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://hl7.org/fhir}Subscription.Channel"/>
 *         &lt;element name="end" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *         &lt;element name="tag" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "criteria",
    "contact",
    "reason",
    "status",
    "error",
    "channel",
    "end",
    "tag"
})
public class Subscription
    extends DomainResource
{

    @XmlElement(required = true)
    protected StringDt criteria;
    protected List<ContactPoint> contact;
    @XmlElement(required = true)
    protected StringDt reason;
    @XmlElement(required = true)
    protected SubscriptionStatus status;
    protected StringDt error;
    @XmlElement(required = true)
    protected SubscriptionChannel channel;
    protected Instant end;
    protected List<Coding> tag;

    /**
     * 取得 criteria 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getCriteria() {
        return criteria;
    }

    /**
     * 設定 criteria 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setCriteria(StringDt value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPoint }
     * 
     * 
     */
    public List<ContactPoint> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactPoint>();
        }
        return this.contact;
    }

    /**
     * 取得 reason 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getReason() {
        return reason;
    }

    /**
     * 設定 reason 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setReason(StringDt value) {
        this.reason = value;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionStatus }
     *     
     */
    public SubscriptionStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionStatus }
     *     
     */
    public void setStatus(SubscriptionStatus value) {
        this.status = value;
    }

    /**
     * 取得 error 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getError() {
        return error;
    }

    /**
     * 設定 error 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setError(StringDt value) {
        this.error = value;
    }

    /**
     * 取得 channel 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionChannel }
     *     
     */
    public SubscriptionChannel getChannel() {
        return channel;
    }

    /**
     * 設定 channel 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionChannel }
     *     
     */
    public void setChannel(SubscriptionChannel value) {
        this.channel = value;
    }

    /**
     * 取得 end 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getEnd() {
        return end;
    }

    /**
     * 設定 end 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setEnd(Instant value) {
        this.end = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getTag() {
        if (tag == null) {
            tag = new ArrayList<Coding>();
        }
        return this.tag;
    }

}
