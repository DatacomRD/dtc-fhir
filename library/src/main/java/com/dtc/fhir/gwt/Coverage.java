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
 * <p>Coverage complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Coverage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="issuer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="bin" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="subscriberId" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="group" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="plan" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="subPlan" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="dependent" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="subscriber" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="network" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="contract" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coverage", propOrder = {
    "issuer",
    "bin",
    "period",
    "type",
    "subscriberId",
    "identifier",
    "group",
    "plan",
    "subPlan",
    "dependent",
    "sequence",
    "subscriber",
    "network",
    "contract"
})
public class Coverage
    extends DomainResource
{

    protected Reference issuer;
    protected Identifier bin;
    protected Period period;
    protected Coding type;
    protected Identifier subscriberId;
    protected List<Identifier> identifier;
    protected StringDt group;
    protected StringDt plan;
    protected StringDt subPlan;
    protected PositiveInt dependent;
    protected PositiveInt sequence;
    protected Reference subscriber;
    protected Identifier network;
    protected List<Reference> contract;

    /**
     * 取得 issuer 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getIssuer() {
        return issuer;
    }

    /**
     * 設定 issuer 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setIssuer(Reference value) {
        this.issuer = value;
    }

    /**
     * 取得 bin 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getBin() {
        return bin;
    }

    /**
     * 設定 bin 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setBin(Identifier value) {
        this.bin = value;
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
     * 取得 subscriberId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getSubscriberId() {
        return subscriberId;
    }

    /**
     * 設定 subscriberId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setSubscriberId(Identifier value) {
        this.subscriberId = value;
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
     * 取得 group 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getGroup() {
        return group;
    }

    /**
     * 設定 group 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setGroup(StringDt value) {
        this.group = value;
    }

    /**
     * 取得 plan 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getPlan() {
        return plan;
    }

    /**
     * 設定 plan 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setPlan(StringDt value) {
        this.plan = value;
    }

    /**
     * 取得 subPlan 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getSubPlan() {
        return subPlan;
    }

    /**
     * 設定 subPlan 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setSubPlan(StringDt value) {
        this.subPlan = value;
    }

    /**
     * 取得 dependent 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getDependent() {
        return dependent;
    }

    /**
     * 設定 dependent 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setDependent(PositiveInt value) {
        this.dependent = value;
    }

    /**
     * 取得 sequence 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getSequence() {
        return sequence;
    }

    /**
     * 設定 sequence 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setSequence(PositiveInt value) {
        this.sequence = value;
    }

    /**
     * 取得 subscriber 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSubscriber() {
        return subscriber;
    }

    /**
     * 設定 subscriber 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSubscriber(Reference value) {
        this.subscriber = value;
    }

    /**
     * 取得 network 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getNetwork() {
        return network;
    }

    /**
     * 設定 network 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setNetwork(Identifier value) {
        this.network = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getContract() {
        if (contract == null) {
            contract = new ArrayList<Reference>();
        }
        return this.contract;
    }

}
