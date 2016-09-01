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
 * The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system is able to take an appropriate action.
 * 
 * <p>Subscription.Channel complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Subscription.Channel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}SubscriptionChannelType"/>
 *         &lt;element name="endpoint" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="payload" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="header" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription.Channel", propOrder = {
    "type",
    "endpoint",
    "payload",
    "header"
})
public class SubscriptionChannel
    extends BackboneElement
{

    @XmlElement(required = true)
    protected SubscriptionChannelType type;
    protected Uri endpoint;
    @XmlElement(required = true)
    protected StringDt payload;
    protected StringDt header;

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionChannelType }
     *     
     */
    public SubscriptionChannelType getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionChannelType }
     *     
     */
    public void setType(SubscriptionChannelType value) {
        this.type = value;
    }

    /**
     * 取得 endpoint 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getEndpoint() {
        return endpoint;
    }

    /**
     * 設定 endpoint 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setEndpoint(Uri value) {
        this.endpoint = value;
    }

    /**
     * 取得 payload 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getPayload() {
        return payload;
    }

    /**
     * 設定 payload 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setPayload(StringDt value) {
        this.payload = value;
    }

    /**
     * 取得 header 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getHeader() {
        return header;
    }

    /**
     * 設定 header 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setHeader(StringDt value) {
        this.header = value;
    }

}
