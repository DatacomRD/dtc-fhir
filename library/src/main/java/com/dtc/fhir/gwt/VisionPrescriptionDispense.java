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
 * An authorization for the supply of glasses and/or contact lenses to a patient.
 * 
 * <p>VisionPrescription.Dispense complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="VisionPrescription.Dispense">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="product" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="eye" type="{http://hl7.org/fhir}VisionEyes" minOccurs="0"/>
 *         &lt;element name="sphere" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="cylinder" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="axis" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="prism" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="base" type="{http://hl7.org/fhir}VisionBase" minOccurs="0"/>
 *         &lt;element name="add" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="power" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="backCurve" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="diameter" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="color" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="brand" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisionPrescription.Dispense", propOrder = {
    "product",
    "eye",
    "sphere",
    "cylinder",
    "axis",
    "prism",
    "base",
    "add",
    "power",
    "backCurve",
    "diameter",
    "duration",
    "color",
    "brand",
    "notes"
})
public class VisionPrescriptionDispense
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Coding product;
    protected VisionEyes eye;
    protected Decimal sphere;
    protected Decimal cylinder;
    protected IntegerDt axis;
    protected Decimal prism;
    protected VisionBase base;
    protected Decimal add;
    protected Decimal power;
    protected Decimal backCurve;
    protected Decimal diameter;
    protected SimpleQuantity duration;
    protected StringDt color;
    protected StringDt brand;
    protected StringDt notes;

    /**
     * 取得 product 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getProduct() {
        return product;
    }

    /**
     * 設定 product 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setProduct(Coding value) {
        this.product = value;
    }

    /**
     * 取得 eye 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link VisionEyes }
     *     
     */
    public VisionEyes getEye() {
        return eye;
    }

    /**
     * 設定 eye 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link VisionEyes }
     *     
     */
    public void setEye(VisionEyes value) {
        this.eye = value;
    }

    /**
     * 取得 sphere 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getSphere() {
        return sphere;
    }

    /**
     * 設定 sphere 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setSphere(Decimal value) {
        this.sphere = value;
    }

    /**
     * 取得 cylinder 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getCylinder() {
        return cylinder;
    }

    /**
     * 設定 cylinder 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setCylinder(Decimal value) {
        this.cylinder = value;
    }

    /**
     * 取得 axis 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getAxis() {
        return axis;
    }

    /**
     * 設定 axis 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setAxis(IntegerDt value) {
        this.axis = value;
    }

    /**
     * 取得 prism 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPrism() {
        return prism;
    }

    /**
     * 設定 prism 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPrism(Decimal value) {
        this.prism = value;
    }

    /**
     * 取得 base 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link VisionBase }
     *     
     */
    public VisionBase getBase() {
        return base;
    }

    /**
     * 設定 base 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link VisionBase }
     *     
     */
    public void setBase(VisionBase value) {
        this.base = value;
    }

    /**
     * 取得 add 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getAdd() {
        return add;
    }

    /**
     * 設定 add 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setAdd(Decimal value) {
        this.add = value;
    }

    /**
     * 取得 power 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPower() {
        return power;
    }

    /**
     * 設定 power 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPower(Decimal value) {
        this.power = value;
    }

    /**
     * 取得 backCurve 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getBackCurve() {
        return backCurve;
    }

    /**
     * 設定 backCurve 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setBackCurve(Decimal value) {
        this.backCurve = value;
    }

    /**
     * 取得 diameter 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getDiameter() {
        return diameter;
    }

    /**
     * 設定 diameter 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setDiameter(Decimal value) {
        this.diameter = value;
    }

    /**
     * 取得 duration 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getDuration() {
        return duration;
    }

    /**
     * 設定 duration 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setDuration(SimpleQuantity value) {
        this.duration = value;
    }

    /**
     * 取得 color 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getColor() {
        return color;
    }

    /**
     * 設定 color 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setColor(StringDt value) {
        this.color = value;
    }

    /**
     * 取得 brand 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getBrand() {
        return brand;
    }

    /**
     * 設定 brand 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setBrand(StringDt value) {
        this.brand = value;
    }

    /**
     * 取得 notes 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getNotes() {
        return notes;
    }

    /**
     * 設定 notes 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setNotes(StringDt value) {
        this.notes = value;
    }

}
