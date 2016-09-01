//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Quantity complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Quantity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="comparator" type="{http://hl7.org/fhir}QuantityComparator" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity", propOrder = {
    "value",
    "comparator",
    "unit",
    "system",
    "code"
})
@XmlSeeAlso({
    Duration.class,
    Money.class,
    Age.class,
    Distance.class,
    SimpleQuantity.class,
    Count.class
})
public class Quantity
    extends Element
{

    protected Decimal value;
    protected QuantityComparator comparator;
    protected StringDt unit;
    protected Uri system;
    protected Code code;

    /**
     * 取得 value 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getValue() {
        return value;
    }

    /**
     * 設定 value 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setValue(Decimal value) {
        this.value = value;
    }

    /**
     * 取得 comparator 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link QuantityComparator }
     *     
     */
    public QuantityComparator getComparator() {
        return comparator;
    }

    /**
     * 設定 comparator 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityComparator }
     *     
     */
    public void setComparator(QuantityComparator value) {
        this.comparator = value;
    }

    /**
     * 取得 unit 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getUnit() {
        return unit;
    }

    /**
     * 設定 unit 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setUnit(StringDt value) {
        this.unit = value;
    }

    /**
     * 取得 system 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getSystem() {
        return system;
    }

    /**
     * 設定 system 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setSystem(Uri value) {
        this.system = value;
    }

    /**
     * 取得 code 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCode() {
        return code;
    }

    /**
     * 設定 code 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCode(Code value) {
        this.code = value;
    }

}
