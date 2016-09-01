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
 * <p>Bundle complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Bundle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}BundleType"/>
 *         &lt;element name="total" type="{http://hl7.org/fhir}unsignedInt" minOccurs="0"/>
 *         &lt;element name="link" type="{http://hl7.org/fhir}Bundle.Link" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entry" type="{http://hl7.org/fhir}Bundle.Entry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://hl7.org/fhir}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bundle", propOrder = {
    "type",
    "total",
    "link",
    "entry",
    "signature"
})
public class Bundle
    extends Resource
{

    @XmlElement(required = true)
    protected BundleType type;
    protected UnsignedInt total;
    protected List<BundleLink> link;
    protected List<BundleEntry> entry;
    protected Signature signature;

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BundleType }
     *     
     */
    public BundleType getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleType }
     *     
     */
    public void setType(BundleType value) {
        this.type = value;
    }

    /**
     * 取得 total 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getTotal() {
        return total;
    }

    /**
     * 設定 total 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setTotal(UnsignedInt value) {
        this.total = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BundleLink }
     * 
     * 
     */
    public List<BundleLink> getLink() {
        if (link == null) {
            link = new ArrayList<BundleLink>();
        }
        return this.link;
    }

    /**
     * Gets the value of the entry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BundleEntry }
     * 
     * 
     */
    public List<BundleEntry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<BundleEntry>();
        }
        return this.entry;
    }

    /**
     * 取得 signature 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getSignature() {
        return signature;
    }

    /**
     * 設定 signature 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setSignature(Signature value) {
        this.signature = value;
    }

}
