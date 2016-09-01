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
 * <p>Appointment complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Appointment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}AppointmentStatus"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://hl7.org/fhir}unsignedInt" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="start" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *         &lt;element name="end" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *         &lt;element name="minutesDuration" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="slot" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="participant" type="{http://hl7.org/fhir}Appointment.Participant" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appointment", propOrder = {
    "identifier",
    "status",
    "type",
    "reason",
    "priority",
    "description",
    "start",
    "end",
    "minutesDuration",
    "slot",
    "comment",
    "participant"
})
public class Appointment
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected AppointmentStatus status;
    protected CodeableConcept type;
    protected CodeableConcept reason;
    protected UnsignedInt priority;
    protected StringDt description;
    protected Instant start;
    protected Instant end;
    protected PositiveInt minutesDuration;
    protected List<Reference> slot;
    protected StringDt comment;
    @XmlElement(required = true)
    protected List<AppointmentParticipant> participant;

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
     *     {@link AppointmentStatus }
     *     
     */
    public AppointmentStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentStatus }
     *     
     */
    public void setStatus(AppointmentStatus value) {
        this.status = value;
    }

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * 取得 reason 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReason() {
        return reason;
    }

    /**
     * 設定 reason 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReason(CodeableConcept value) {
        this.reason = value;
    }

    /**
     * 取得 priority 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getPriority() {
        return priority;
    }

    /**
     * 設定 priority 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setPriority(UnsignedInt value) {
        this.priority = value;
    }

    /**
     * 取得 description 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDescription() {
        return description;
    }

    /**
     * 設定 description 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDescription(StringDt value) {
        this.description = value;
    }

    /**
     * 取得 start 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getStart() {
        return start;
    }

    /**
     * 設定 start 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setStart(Instant value) {
        this.start = value;
    }

    /**
     * 取得 end 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getEnd() {
        return end;
    }

    /**
     * 設定 end 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setEnd(Instant value) {
        this.end = value;
    }

    /**
     * 取得 minutesDuration 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getMinutesDuration() {
        return minutesDuration;
    }

    /**
     * 設定 minutesDuration 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setMinutesDuration(PositiveInt value) {
        this.minutesDuration = value;
    }

    /**
     * Gets the value of the slot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSlot() {
        if (slot == null) {
            slot = new ArrayList<Reference>();
        }
        return this.slot;
    }

    /**
     * 取得 comment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getComment() {
        return comment;
    }

    /**
     * 設定 comment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setComment(StringDt value) {
        this.comment = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppointmentParticipant }
     * 
     * 
     */
    public List<AppointmentParticipant> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<AppointmentParticipant>();
        }
        return this.participant;
    }

}
