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
 * <p>AppointmentResponse complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="AppointmentResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appointment" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="start" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *         &lt;element name="end" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *         &lt;element name="participantType" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="actor" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="participantStatus" type="{http://hl7.org/fhir}ParticipantStatus"/>
 *         &lt;element name="comment" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentResponse", propOrder = {
    "identifier",
    "appointment",
    "start",
    "end",
    "participantType",
    "actor",
    "participantStatus",
    "comment"
})
public class AppointmentResponse
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected Reference appointment;
    protected Instant start;
    protected Instant end;
    protected List<CodeableConcept> participantType;
    protected Reference actor;
    @XmlElement(required = true)
    protected ParticipantStatus participantStatus;
    protected StringDt comment;

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
     * 取得 appointment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getAppointment() {
        return appointment;
    }

    /**
     * 設定 appointment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setAppointment(Reference value) {
        this.appointment = value;
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
     * Gets the value of the participantType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getParticipantType() {
        if (participantType == null) {
            participantType = new ArrayList<CodeableConcept>();
        }
        return this.participantType;
    }

    /**
     * 取得 actor 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getActor() {
        return actor;
    }

    /**
     * 設定 actor 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setActor(Reference value) {
        this.actor = value;
    }

    /**
     * 取得 participantStatus 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantStatus }
     *     
     */
    public ParticipantStatus getParticipantStatus() {
        return participantStatus;
    }

    /**
     * 設定 participantStatus 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantStatus }
     *     
     */
    public void setParticipantStatus(ParticipantStatus value) {
        this.participantStatus = value;
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

}
