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
 * Measurements and simple assertions made about a patient, device or other subject.
 * 
 * <p>Observation.Component complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Observation.Component">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="valueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="valueString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="valueRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="valueRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="valueSampledData" type="{http://hl7.org/fhir}SampledData"/>
 *           &lt;element name="valueAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="valueTime" type="{http://hl7.org/fhir}time"/>
 *           &lt;element name="valueDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="valuePeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;element name="dataAbsentReason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="referenceRange" type="{http://hl7.org/fhir}Observation.ReferenceRange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Observation.Component", propOrder = {
    "code",
    "valueQuantity",
    "valueCodeableConcept",
    "valueString",
    "valueRange",
    "valueRatio",
    "valueSampledData",
    "valueAttachment",
    "valueTime",
    "valueDateTime",
    "valuePeriod",
    "dataAbsentReason",
    "referenceRange"
})
public class ObservationComponent
    extends BackboneElement
{

    @XmlElement(required = true)
    protected CodeableConcept code;
    protected Quantity valueQuantity;
    protected CodeableConcept valueCodeableConcept;
    protected StringDt valueString;
    protected Range valueRange;
    protected Ratio valueRatio;
    protected SampledData valueSampledData;
    protected Attachment valueAttachment;
    protected Time valueTime;
    protected DateTime valueDateTime;
    protected Period valuePeriod;
    protected CodeableConcept dataAbsentReason;
    protected List<ObservationReferenceRange> referenceRange;

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
     * 取得 valueQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * 設定 valueQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setValueQuantity(Quantity value) {
        this.valueQuantity = value;
    }

    /**
     * 取得 valueCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    /**
     * 設定 valueCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setValueCodeableConcept(CodeableConcept value) {
        this.valueCodeableConcept = value;
    }

    /**
     * 取得 valueString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getValueString() {
        return valueString;
    }

    /**
     * 設定 valueString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setValueString(StringDt value) {
        this.valueString = value;
    }

    /**
     * 取得 valueRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getValueRange() {
        return valueRange;
    }

    /**
     * 設定 valueRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setValueRange(Range value) {
        this.valueRange = value;
    }

    /**
     * 取得 valueRatio 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getValueRatio() {
        return valueRatio;
    }

    /**
     * 設定 valueRatio 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setValueRatio(Ratio value) {
        this.valueRatio = value;
    }

    /**
     * 取得 valueSampledData 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SampledData }
     *     
     */
    public SampledData getValueSampledData() {
        return valueSampledData;
    }

    /**
     * 設定 valueSampledData 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledData }
     *     
     */
    public void setValueSampledData(SampledData value) {
        this.valueSampledData = value;
    }

    /**
     * 取得 valueAttachment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getValueAttachment() {
        return valueAttachment;
    }

    /**
     * 設定 valueAttachment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setValueAttachment(Attachment value) {
        this.valueAttachment = value;
    }

    /**
     * 取得 valueTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getValueTime() {
        return valueTime;
    }

    /**
     * 設定 valueTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setValueTime(Time value) {
        this.valueTime = value;
    }

    /**
     * 取得 valueDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getValueDateTime() {
        return valueDateTime;
    }

    /**
     * 設定 valueDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setValueDateTime(DateTime value) {
        this.valueDateTime = value;
    }

    /**
     * 取得 valuePeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getValuePeriod() {
        return valuePeriod;
    }

    /**
     * 設定 valuePeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setValuePeriod(Period value) {
        this.valuePeriod = value;
    }

    /**
     * 取得 dataAbsentReason 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDataAbsentReason() {
        return dataAbsentReason;
    }

    /**
     * 設定 dataAbsentReason 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDataAbsentReason(CodeableConcept value) {
        this.dataAbsentReason = value;
    }

    /**
     * Gets the value of the referenceRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationReferenceRange }
     * 
     * 
     */
    public List<ObservationReferenceRange> getReferenceRange() {
        if (referenceRange == null) {
            referenceRange = new ArrayList<ObservationReferenceRange>();
        }
        return this.referenceRange;
    }

}
