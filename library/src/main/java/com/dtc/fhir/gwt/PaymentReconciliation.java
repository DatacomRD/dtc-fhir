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
 * <p>PaymentReconciliation complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="PaymentReconciliation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="request" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="disposition" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="ruleset" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="originalRuleset" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="created" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="requestProvider" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="requestOrganization" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://hl7.org/fhir}PaymentReconciliation.Detail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="form" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="total" type="{http://hl7.org/fhir}Money"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}PaymentReconciliation.Note" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReconciliation", propOrder = {
    "identifier",
    "request",
    "outcome",
    "disposition",
    "ruleset",
    "originalRuleset",
    "created",
    "period",
    "organization",
    "requestProvider",
    "requestOrganization",
    "detail",
    "form",
    "total",
    "note"
})
public class PaymentReconciliation
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected Reference request;
    protected Code outcome;
    protected StringDt disposition;
    protected Coding ruleset;
    protected Coding originalRuleset;
    protected DateTime created;
    protected Period period;
    protected Reference organization;
    protected Reference requestProvider;
    protected Reference requestOrganization;
    protected List<PaymentReconciliationDetail> detail;
    protected Coding form;
    @XmlElement(required = true)
    protected Money total;
    protected List<PaymentReconciliationNote> note;

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
     * 取得 outcome 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getOutcome() {
        return outcome;
    }

    /**
     * 設定 outcome 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setOutcome(Code value) {
        this.outcome = value;
    }

    /**
     * 取得 disposition 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDisposition() {
        return disposition;
    }

    /**
     * 設定 disposition 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDisposition(StringDt value) {
        this.disposition = value;
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
     * 取得 period 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * 設定 period 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
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
     * 取得 requestProvider 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRequestProvider() {
        return requestProvider;
    }

    /**
     * 設定 requestProvider 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRequestProvider(Reference value) {
        this.requestProvider = value;
    }

    /**
     * 取得 requestOrganization 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRequestOrganization() {
        return requestOrganization;
    }

    /**
     * 設定 requestOrganization 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRequestOrganization(Reference value) {
        this.requestOrganization = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReconciliationDetail }
     * 
     * 
     */
    public List<PaymentReconciliationDetail> getDetail() {
        if (detail == null) {
            detail = new ArrayList<PaymentReconciliationDetail>();
        }
        return this.detail;
    }

    /**
     * 取得 form 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getForm() {
        return form;
    }

    /**
     * 設定 form 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setForm(Coding value) {
        this.form = value;
    }

    /**
     * 取得 total 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotal() {
        return total;
    }

    /**
     * 設定 total 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotal(Money value) {
        this.total = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReconciliationNote }
     * 
     * 
     */
    public List<PaymentReconciliationNote> getNote() {
        if (note == null) {
            note = new ArrayList<PaymentReconciliationNote>();
        }
        return this.note;
    }

}
