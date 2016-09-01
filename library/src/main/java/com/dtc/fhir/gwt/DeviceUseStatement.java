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
 * <p>DeviceUseStatement complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="DeviceUseStatement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="bodySiteCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="bodySiteReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="whenUsed" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="device" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="indication" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordedOn" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="timingTiming" type="{http://hl7.org/fhir}Timing"/>
 *           &lt;element name="timingPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="timingDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceUseStatement", propOrder = {
    "bodySiteCodeableConcept",
    "bodySiteReference",
    "whenUsed",
    "device",
    "identifier",
    "indication",
    "notes",
    "recordedOn",
    "subject",
    "timingTiming",
    "timingPeriod",
    "timingDateTime"
})
public class DeviceUseStatement
    extends DomainResource
{

    protected CodeableConcept bodySiteCodeableConcept;
    protected Reference bodySiteReference;
    protected Period whenUsed;
    @XmlElement(required = true)
    protected Reference device;
    protected List<Identifier> identifier;
    protected List<CodeableConcept> indication;
    protected List<StringDt> notes;
    protected DateTime recordedOn;
    @XmlElement(required = true)
    protected Reference subject;
    protected Timing timingTiming;
    protected Period timingPeriod;
    protected DateTime timingDateTime;

    /**
     * 取得 bodySiteCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getBodySiteCodeableConcept() {
        return bodySiteCodeableConcept;
    }

    /**
     * 設定 bodySiteCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setBodySiteCodeableConcept(CodeableConcept value) {
        this.bodySiteCodeableConcept = value;
    }

    /**
     * 取得 bodySiteReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getBodySiteReference() {
        return bodySiteReference;
    }

    /**
     * 設定 bodySiteReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setBodySiteReference(Reference value) {
        this.bodySiteReference = value;
    }

    /**
     * 取得 whenUsed 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getWhenUsed() {
        return whenUsed;
    }

    /**
     * 設定 whenUsed 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setWhenUsed(Period value) {
        this.whenUsed = value;
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
     * Gets the value of the indication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getIndication() {
        if (indication == null) {
            indication = new ArrayList<CodeableConcept>();
        }
        return this.indication;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDt }
     * 
     * 
     */
    public List<StringDt> getNotes() {
        if (notes == null) {
            notes = new ArrayList<StringDt>();
        }
        return this.notes;
    }

    /**
     * 取得 recordedOn 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getRecordedOn() {
        return recordedOn;
    }

    /**
     * 設定 recordedOn 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setRecordedOn(DateTime value) {
        this.recordedOn = value;
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
     * 取得 timingTiming 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getTimingTiming() {
        return timingTiming;
    }

    /**
     * 設定 timingTiming 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setTimingTiming(Timing value) {
        this.timingTiming = value;
    }

    /**
     * 取得 timingPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getTimingPeriod() {
        return timingPeriod;
    }

    /**
     * 設定 timingPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setTimingPeriod(Period value) {
        this.timingPeriod = value;
    }

    /**
     * 取得 timingDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTimingDateTime() {
        return timingDateTime;
    }

    /**
     * 設定 timingDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTimingDateTime(DateTime value) {
        this.timingDateTime = value;
    }

}
