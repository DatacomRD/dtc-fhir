//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>ContactPoint complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ContactPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="system" type="{http://hl7.org/fhir}ContactPointSystem" minOccurs="0"/>
 *         &lt;element name="value" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="use" type="{http://hl7.org/fhir}ContactPointUse" minOccurs="0"/>
 *         &lt;element name="rank" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
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
@XmlType(name = "ContactPoint", propOrder = {
    "system",
    "value",
    "use",
    "rank",
    "period"
})
public class ContactPoint
    extends Element
{

    protected ContactPointSystem system;
    protected StringDt value;
    protected ContactPointUse use;
    protected PositiveInt rank;
    protected Period period;

    /**
     * 取得 system 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ContactPointSystem }
     *     
     */
    public ContactPointSystem getSystem() {
        return system;
    }

    /**
     * 設定 system 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPointSystem }
     *     
     */
    public void setSystem(ContactPointSystem value) {
        this.system = value;
    }

    /**
     * 取得 value 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getValue() {
        return value;
    }

    /**
     * 設定 value 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setValue(StringDt value) {
        this.value = value;
    }

    /**
     * 取得 use 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ContactPointUse }
     *     
     */
    public ContactPointUse getUse() {
        return use;
    }

    /**
     * 設定 use 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPointUse }
     *     
     */
    public void setUse(ContactPointUse value) {
        this.use = value;
    }

    /**
     * 取得 rank 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getRank() {
        return rank;
    }

    /**
     * 設定 rank 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setRank(PositiveInt value) {
        this.rank = value;
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
