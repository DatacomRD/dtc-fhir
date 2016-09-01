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
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
 * 
 * <p>Appointment.Participant complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Appointment.Participant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="actor" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="required" type="{http://hl7.org/fhir}ParticipantRequired" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}ParticipationStatus"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appointment.Participant", propOrder = {
    "type",
    "actor",
    "required",
    "status"
})
public class AppointmentParticipant
    extends BackboneElement
{

    protected List<CodeableConcept> type;
    protected Reference actor;
    protected ParticipantRequired required;
    @XmlElement(required = true)
    protected ParticipationStatus status;

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getType() {
        if (type == null) {
            type = new ArrayList<CodeableConcept>();
        }
        return this.type;
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
     * 取得 required 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRequired }
     *     
     */
    public ParticipantRequired getRequired() {
        return required;
    }

    /**
     * 設定 required 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRequired }
     *     
     */
    public void setRequired(ParticipantRequired value) {
        this.required = value;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationStatus }
     *     
     */
    public ParticipationStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationStatus }
     *     
     */
    public void setStatus(ParticipationStatus value) {
        this.status = value;
    }

}
