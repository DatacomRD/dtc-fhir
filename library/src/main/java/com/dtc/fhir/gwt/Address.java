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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Address complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="use" type="{http://hl7.org/fhir}AddressUse" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}AddressType" minOccurs="0"/>
 *         &lt;element name="text" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="line" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="city" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://hl7.org/fhir}string" minOccurs="0"/>
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
@XmlType(name = "Address", propOrder = {
    "use",
    "type",
    "text",
    "line",
    "city",
    "district",
    "state",
    "postalCode",
    "country",
    "period"
})
public class Address
    extends Element
{

    protected AddressUse use;
    protected AddressType type;
    protected StringDt text;
    protected List<StringDt> line;
    protected StringDt city;
    protected StringDt district;
    protected StringDt state;
    protected StringDt postalCode;
    protected StringDt country;
    protected Period period;

    /**
     * 取得 use 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AddressUse }
     *     
     */
    public AddressUse getUse() {
        return use;
    }

    /**
     * 設定 use 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUse }
     *     
     */
    public void setUse(AddressUse value) {
        this.use = value;
    }

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setType(AddressType value) {
        this.type = value;
    }

    /**
     * 取得 text 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getText() {
        return text;
    }

    /**
     * 設定 text 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setText(StringDt value) {
        this.text = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDt }
     * 
     * 
     */
    public List<StringDt> getLine() {
        if (line == null) {
            line = new ArrayList<StringDt>();
        }
        return this.line;
    }

    /**
     * 取得 city 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getCity() {
        return city;
    }

    /**
     * 設定 city 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setCity(StringDt value) {
        this.city = value;
    }

    /**
     * 取得 district 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDistrict() {
        return district;
    }

    /**
     * 設定 district 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDistrict(StringDt value) {
        this.district = value;
    }

    /**
     * 取得 state 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getState() {
        return state;
    }

    /**
     * 設定 state 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setState(StringDt value) {
        this.state = value;
    }

    /**
     * 取得 postalCode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getPostalCode() {
        return postalCode;
    }

    /**
     * 設定 postalCode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setPostalCode(StringDt value) {
        this.postalCode = value;
    }

    /**
     * 取得 country 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getCountry() {
        return country;
    }

    /**
     * 設定 country 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setCountry(StringDt value) {
        this.country = value;
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
