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
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * 
 * <p>Claim.Item complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Claim.Item">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="sequence" type="{http://hl7.org/fhir}positiveInt"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="provider" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="diagnosisLinkId" type="{http://hl7.org/fhir}positiveInt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="service" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="serviceDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="factor" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="points" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="net" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="udi" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="subSite" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modifier" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://hl7.org/fhir}Claim.Detail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prosthesis" type="{http://hl7.org/fhir}Claim.Prosthesis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Claim.Item", propOrder = {
    "sequence",
    "type",
    "provider",
    "diagnosisLinkId",
    "service",
    "serviceDate",
    "quantity",
    "unitPrice",
    "factor",
    "points",
    "net",
    "udi",
    "bodySite",
    "subSite",
    "modifier",
    "detail",
    "prosthesis"
})
public class ClaimItem
    extends BackboneElement
{

    @XmlElement(required = true)
    protected PositiveInt sequence;
    @XmlElement(required = true)
    protected Coding type;
    protected Reference provider;
    protected List<PositiveInt> diagnosisLinkId;
    @XmlElement(required = true)
    protected Coding service;
    protected Date serviceDate;
    protected SimpleQuantity quantity;
    protected Money unitPrice;
    protected Decimal factor;
    protected Decimal points;
    protected Money net;
    protected Coding udi;
    protected Coding bodySite;
    protected List<Coding> subSite;
    protected List<Coding> modifier;
    protected List<ClaimDetail> detail;
    protected ClaimProsthesis prosthesis;

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
     * Gets the value of the diagnosisLinkId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosisLinkId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosisLinkId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositiveInt }
     * 
     * 
     */
    public List<PositiveInt> getDiagnosisLinkId() {
        if (diagnosisLinkId == null) {
            diagnosisLinkId = new ArrayList<PositiveInt>();
        }
        return this.diagnosisLinkId;
    }

    /**
     * 取得 service 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getService() {
        return service;
    }

    /**
     * 設定 service 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setService(Coding value) {
        this.service = value;
    }

    /**
     * 取得 serviceDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getServiceDate() {
        return serviceDate;
    }

    /**
     * 設定 serviceDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setServiceDate(Date value) {
        this.serviceDate = value;
    }

    /**
     * 取得 quantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getQuantity() {
        return quantity;
    }

    /**
     * 設定 quantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setQuantity(SimpleQuantity value) {
        this.quantity = value;
    }

    /**
     * 取得 unitPrice 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUnitPrice() {
        return unitPrice;
    }

    /**
     * 設定 unitPrice 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUnitPrice(Money value) {
        this.unitPrice = value;
    }

    /**
     * 取得 factor 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getFactor() {
        return factor;
    }

    /**
     * 設定 factor 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setFactor(Decimal value) {
        this.factor = value;
    }

    /**
     * 取得 points 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPoints() {
        return points;
    }

    /**
     * 設定 points 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPoints(Decimal value) {
        this.points = value;
    }

    /**
     * 取得 net 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNet() {
        return net;
    }

    /**
     * 設定 net 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNet(Money value) {
        this.net = value;
    }

    /**
     * 取得 udi 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getUdi() {
        return udi;
    }

    /**
     * 設定 udi 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setUdi(Coding value) {
        this.udi = value;
    }

    /**
     * 取得 bodySite 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getBodySite() {
        return bodySite;
    }

    /**
     * 設定 bodySite 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setBodySite(Coding value) {
        this.bodySite = value;
    }

    /**
     * Gets the value of the subSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getSubSite() {
        if (subSite == null) {
            subSite = new ArrayList<Coding>();
        }
        return this.subSite;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getModifier() {
        if (modifier == null) {
            modifier = new ArrayList<Coding>();
        }
        return this.modifier;
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
     * {@link ClaimDetail }
     * 
     * 
     */
    public List<ClaimDetail> getDetail() {
        if (detail == null) {
            detail = new ArrayList<ClaimDetail>();
        }
        return this.detail;
    }

    /**
     * 取得 prosthesis 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ClaimProsthesis }
     *     
     */
    public ClaimProsthesis getProsthesis() {
        return prosthesis;
    }

    /**
     * 設定 prosthesis 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimProsthesis }
     *     
     */
    public void setProsthesis(ClaimProsthesis value) {
        this.prosthesis = value;
    }

}
