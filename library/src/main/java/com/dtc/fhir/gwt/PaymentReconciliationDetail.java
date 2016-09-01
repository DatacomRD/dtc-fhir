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
 * This resource provides payment details and claim references supporting a bulk payment.
 * 
 * <p>PaymentReconciliation.Detail complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="PaymentReconciliation.Detail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="request" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="responce" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="submitter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="payee" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReconciliation.Detail", propOrder = {
    "type",
    "request",
    "responce",
    "submitter",
    "payee",
    "date",
    "amount"
})
public class PaymentReconciliationDetail
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Coding type;
    protected Reference request;
    protected Reference responce;
    protected Reference submitter;
    protected Reference payee;
    protected Date date;
    protected Money amount;

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
     * 取得 request 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRequest() {
        return request;
    }

    /**
     * 設定 request 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRequest(Reference value) {
        this.request = value;
    }

    /**
     * 取得 responce 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getResponce() {
        return responce;
    }

    /**
     * 設定 responce 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setResponce(Reference value) {
        this.responce = value;
    }

    /**
     * 取得 submitter 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSubmitter() {
        return submitter;
    }

    /**
     * 設定 submitter 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSubmitter(Reference value) {
        this.submitter = value;
    }

    /**
     * 取得 payee 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPayee() {
        return payee;
    }

    /**
     * 設定 payee 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPayee(Reference value) {
        this.payee = value;
    }

    /**
     * 取得 date 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * 設定 date 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * 取得 amount 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * 設定 amount 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

}
