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
 * <p>Timing.Repeat complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Timing.Repeat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="boundsQuantity" type="{http://hl7.org/fhir}Duration"/>
 *           &lt;element name="boundsRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="boundsPeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;element name="count" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="durationMax" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="durationUnits" type="{http://hl7.org/fhir}UnitsOfTime" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="frequencyMax" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="periodMax" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="periodUnits" type="{http://hl7.org/fhir}UnitsOfTime" minOccurs="0"/>
 *         &lt;element name="when" type="{http://hl7.org/fhir}EventTiming" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timing.Repeat", propOrder = {
    "boundsQuantity",
    "boundsRange",
    "boundsPeriod",
    "count",
    "duration",
    "durationMax",
    "durationUnits",
    "frequency",
    "frequencyMax",
    "period",
    "periodMax",
    "periodUnits",
    "when"
})
public class TimingRepeat
    extends Element
{

    protected Duration boundsQuantity;
    protected Range boundsRange;
    protected Period boundsPeriod;
    protected IntegerDt count;
    protected Decimal duration;
    protected Decimal durationMax;
    protected UnitsOfTime durationUnits;
    protected IntegerDt frequency;
    protected IntegerDt frequencyMax;
    protected Decimal period;
    protected Decimal periodMax;
    protected UnitsOfTime periodUnits;
    protected EventTiming when;

    /**
     * 取得 boundsQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBoundsQuantity() {
        return boundsQuantity;
    }

    /**
     * 設定 boundsQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBoundsQuantity(Duration value) {
        this.boundsQuantity = value;
    }

    /**
     * 取得 boundsRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getBoundsRange() {
        return boundsRange;
    }

    /**
     * 設定 boundsRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setBoundsRange(Range value) {
        this.boundsRange = value;
    }

    /**
     * 取得 boundsPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getBoundsPeriod() {
        return boundsPeriod;
    }

    /**
     * 設定 boundsPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setBoundsPeriod(Period value) {
        this.boundsPeriod = value;
    }

    /**
     * 取得 count 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getCount() {
        return count;
    }

    /**
     * 設定 count 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setCount(IntegerDt value) {
        this.count = value;
    }

    /**
     * 取得 duration 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getDuration() {
        return duration;
    }

    /**
     * 設定 duration 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setDuration(Decimal value) {
        this.duration = value;
    }

    /**
     * 取得 durationMax 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getDurationMax() {
        return durationMax;
    }

    /**
     * 設定 durationMax 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setDurationMax(Decimal value) {
        this.durationMax = value;
    }

    /**
     * 取得 durationUnits 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnitsOfTime }
     *     
     */
    public UnitsOfTime getDurationUnits() {
        return durationUnits;
    }

    /**
     * 設定 durationUnits 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsOfTime }
     *     
     */
    public void setDurationUnits(UnitsOfTime value) {
        this.durationUnits = value;
    }

    /**
     * 取得 frequency 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getFrequency() {
        return frequency;
    }

    /**
     * 設定 frequency 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setFrequency(IntegerDt value) {
        this.frequency = value;
    }

    /**
     * 取得 frequencyMax 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getFrequencyMax() {
        return frequencyMax;
    }

    /**
     * 設定 frequencyMax 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setFrequencyMax(IntegerDt value) {
        this.frequencyMax = value;
    }

    /**
     * 取得 period 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPeriod() {
        return period;
    }

    /**
     * 設定 period 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPeriod(Decimal value) {
        this.period = value;
    }

    /**
     * 取得 periodMax 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPeriodMax() {
        return periodMax;
    }

    /**
     * 設定 periodMax 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPeriodMax(Decimal value) {
        this.periodMax = value;
    }

    /**
     * 取得 periodUnits 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnitsOfTime }
     *     
     */
    public UnitsOfTime getPeriodUnits() {
        return periodUnits;
    }

    /**
     * 設定 periodUnits 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsOfTime }
     *     
     */
    public void setPeriodUnits(UnitsOfTime value) {
        this.periodUnits = value;
    }

    /**
     * 取得 when 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link EventTiming }
     *     
     */
    public EventTiming getWhen() {
        return when;
    }

    /**
     * 設定 when 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTiming }
     *     
     */
    public void setWhen(EventTiming value) {
        this.when = value;
    }

}
