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
 * <p>Observation complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Observation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}ObservationStatus"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="effectiveDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="effectivePeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;element name="issued" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *         &lt;element name="performer" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="interpretation" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="specimen" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="device" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="referenceRange" type="{http://hl7.org/fhir}Observation.ReferenceRange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="related" type="{http://hl7.org/fhir}Observation.Related" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="component" type="{http://hl7.org/fhir}Observation.Component" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Observation", propOrder = {
    "identifier",
    "status",
    "category",
    "code",
    "subject",
    "encounter",
    "effectiveDateTime",
    "effectivePeriod",
    "issued",
    "performer",
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
    "interpretation",
    "comments",
    "bodySite",
    "method",
    "specimen",
    "device",
    "referenceRange",
    "related",
    "component"
})
public class Observation
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected ObservationStatus status;
    protected CodeableConcept category;
    @XmlElement(required = true)
    protected CodeableConcept code;
    protected Reference subject;
    protected Reference encounter;
    protected DateTime effectiveDateTime;
    protected Period effectivePeriod;
    protected Instant issued;
    protected List<Reference> performer;
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
    protected CodeableConcept interpretation;
    protected StringDt comments;
    protected CodeableConcept bodySite;
    protected CodeableConcept method;
    protected Reference specimen;
    protected Reference device;
    protected List<ObservationReferenceRange> referenceRange;
    protected List<ObservationRelated> related;
    protected List<ObservationComponent> component;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ObservationStatus }
     *     
     */
    public ObservationStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationStatus }
     *     
     */
    public void setStatus(ObservationStatus value) {
        this.status = value;
    }

    /**
     * 取得 category 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * 設定 category 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCategory(CodeableConcept value) {
        this.category = value;
    }

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
     * 取得 subject 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSubject() {
        return subject;
    }

    /**
     * 設定 subject 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSubject(Reference value) {
        this.subject = value;
    }

    /**
     * 取得 encounter 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * 設定 encounter 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setEncounter(Reference value) {
        this.encounter = value;
    }

    /**
     * 取得 effectiveDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * 設定 effectiveDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEffectiveDateTime(DateTime value) {
        this.effectiveDateTime = value;
    }

    /**
     * 取得 effectivePeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * 設定 effectivePeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setEffectivePeriod(Period value) {
        this.effectivePeriod = value;
    }

    /**
     * 取得 issued 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getIssued() {
        return issued;
    }

    /**
     * 設定 issued 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setIssued(Instant value) {
        this.issued = value;
    }

    /**
     * Gets the value of the performer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getPerformer() {
        if (performer == null) {
            performer = new ArrayList<Reference>();
        }
        return this.performer;
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
     * 取得 interpretation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getInterpretation() {
        return interpretation;
    }

    /**
     * 設定 interpretation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setInterpretation(CodeableConcept value) {
        this.interpretation = value;
    }

    /**
     * 取得 comments 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getComments() {
        return comments;
    }

    /**
     * 設定 comments 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setComments(StringDt value) {
        this.comments = value;
    }

    /**
     * 取得 bodySite 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getBodySite() {
        return bodySite;
    }

    /**
     * 設定 bodySite 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setBodySite(CodeableConcept value) {
        this.bodySite = value;
    }

    /**
     * 取得 method 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * 設定 method 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMethod(CodeableConcept value) {
        this.method = value;
    }

    /**
     * 取得 specimen 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSpecimen() {
        return specimen;
    }

    /**
     * 設定 specimen 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSpecimen(Reference value) {
        this.specimen = value;
    }

    /**
     * 取得 device 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getDevice() {
        return device;
    }

    /**
     * 設定 device 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setDevice(Reference value) {
        this.device = value;
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

    /**
     * Gets the value of the related property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the related property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationRelated }
     * 
     * 
     */
    public List<ObservationRelated> getRelated() {
        if (related == null) {
            related = new ArrayList<ObservationRelated>();
        }
        return this.related;
    }

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationComponent }
     * 
     * 
     */
    public List<ObservationComponent> getComponent() {
        if (component == null) {
            component = new ArrayList<ObservationComponent>();
        }
        return this.component;
    }

}
