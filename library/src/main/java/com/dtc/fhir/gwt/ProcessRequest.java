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
 * <p>ProcessRequest complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ProcessRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://hl7.org/fhir}ActionList"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ruleset" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="originalRuleset" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="created" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="target" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="provider" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="request" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="response" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="nullify" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="item" type="{http://hl7.org/fhir}ProcessRequest.Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="include" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exclude" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessRequest", propOrder = {
    "action",
    "identifier",
    "ruleset",
    "originalRuleset",
    "created",
    "target",
    "provider",
    "organization",
    "request",
    "response",
    "nullify",
    "reference",
    "item",
    "include",
    "exclude",
    "period"
})
public class ProcessRequest
    extends DomainResource
{

    @XmlElement(required = true)
    protected ActionList action;
    protected List<Identifier> identifier;
    protected Coding ruleset;
    protected Coding originalRuleset;
    protected DateTime created;
    protected Reference target;
    protected Reference provider;
    protected Reference organization;
    protected Reference request;
    protected Reference response;
    protected BooleanDt nullify;
    protected StringDt reference;
    protected List<ProcessRequestItem> item;
    protected List<StringDt> include;
    protected List<StringDt> exclude;
    protected Period period;

    /**
     * 取得 action 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ActionList }
     *     
     */
    public ActionList getAction() {
        return action;
    }

    /**
     * 設定 action 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionList }
     *     
     */
    public void setAction(ActionList value) {
        this.action = value;
    }

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
     * 取得 response 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getResponse() {
        return response;
    }

    /**
     * 設定 response 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setResponse(Reference value) {
        this.response = value;
    }

    /**
     * 取得 nullify 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getNullify() {
        return nullify;
    }

    /**
     * 設定 nullify 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setNullify(BooleanDt value) {
        this.nullify = value;
    }

    /**
     * 取得 reference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getReference() {
        return reference;
    }

    /**
     * 設定 reference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setReference(StringDt value) {
        this.reference = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessRequestItem }
     * 
     * 
     */
    public List<ProcessRequestItem> getItem() {
        if (item == null) {
            item = new ArrayList<ProcessRequestItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the include property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the include property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDt }
     * 
     * 
     */
    public List<StringDt> getInclude() {
        if (include == null) {
            include = new ArrayList<StringDt>();
        }
        return this.include;
    }

    /**
     * Gets the value of the exclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDt }
     * 
     * 
     */
    public List<StringDt> getExclude() {
        if (exclude == null) {
            exclude = new ArrayList<StringDt>();
        }
        return this.exclude;
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

}
