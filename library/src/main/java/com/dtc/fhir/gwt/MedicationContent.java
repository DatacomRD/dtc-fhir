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
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 * 
 * <p>Medication.Content complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Medication.Content">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="amount" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Medication.Content", propOrder = {
    "item",
    "amount"
})
public class MedicationContent
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Reference item;
    protected SimpleQuantity amount;

    /**
     * 取得 item 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getItem() {
        return item;
    }

    /**
     * 設定 item 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setItem(Reference value) {
        this.item = value;
    }

    /**
     * 取得 amount 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getAmount() {
        return amount;
    }

    /**
     * 設定 amount 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setAmount(SimpleQuantity value) {
        this.amount = value;
    }

}
