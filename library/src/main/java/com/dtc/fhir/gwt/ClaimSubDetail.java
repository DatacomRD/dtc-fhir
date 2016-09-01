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
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * 
 * <p>Claim.SubDetail complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Claim.SubDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="sequence" type="{http://hl7.org/fhir}positiveInt"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="service" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="factor" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="points" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="net" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="udi" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Claim.SubDetail", propOrder = {
    "sequence",
    "type",
    "service",
    "quantity",
    "unitPrice",
    "factor",
    "points",
    "net",
    "udi"
})
public class ClaimSubDetail
    extends BackboneElement
{

    @XmlElement(required = true)
    protected PositiveInt sequence;
    @XmlElement(required = true)
    protected Coding type;
    @XmlElement(required = true)
    protected Coding service;
    protected SimpleQuantity quantity;
    protected Money unitPrice;
    protected Decimal factor;
    protected Decimal points;
    protected Money net;
    protected Coding udi;

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

}
