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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Medication complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Medication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="isBrand" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="product" type="{http://hl7.org/fhir}Medication.Product" minOccurs="0"/>
 *         &lt;element name="package" type="{http://hl7.org/fhir}Medication.Package" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Medication", propOrder = {
    "code",
    "isBrand",
    "manufacturer",
    "product",
    "_package"
})
public class Medication
    extends DomainResource
{

    protected CodeableConcept code;
    protected BooleanDt isBrand;
    protected Reference manufacturer;
    protected MedicationProduct product;
    @XmlElement(name = "package")
    protected MedicationPackage _package;

    /**
     * 取得 code 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * 設定 code 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * 取得 isBrand 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getIsBrand() {
        return isBrand;
    }

    /**
     * 設定 isBrand 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setIsBrand(BooleanDt value) {
        this.isBrand = value;
    }

    /**
     * 取得 manufacturer 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getManufacturer() {
        return manufacturer;
    }

    /**
     * 設定 manufacturer 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setManufacturer(Reference value) {
        this.manufacturer = value;
    }

    /**
     * 取得 product 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationProduct }
     *     
     */
    public MedicationProduct getProduct() {
        return product;
    }

    /**
     * 設定 product 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationProduct }
     *     
     */
    public void setProduct(MedicationProduct value) {
        this.product = value;
    }

    /**
     * 取得 package 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MedicationPackage }
     *     
     */
    public MedicationPackage getPackage() {
        return _package;
    }

    /**
     * 設定 package 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationPackage }
     *     
     */
    public void setPackage(MedicationPackage value) {
        this._package = value;
    }

}
