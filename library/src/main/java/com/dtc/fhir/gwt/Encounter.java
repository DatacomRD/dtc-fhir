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
 * <p>Encounter complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Encounter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}EncounterState"/>
 *         &lt;element name="statusHistory" type="{http://hl7.org/fhir}Encounter.StatusHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="class" type="{http://hl7.org/fhir}EncounterClass" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="episodeOfCare" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="incomingReferral" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="participant" type="{http://hl7.org/fhir}Encounter.Participant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appointment" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="length" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="indication" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hospitalization" type="{http://hl7.org/fhir}Encounter.Hospitalization" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}Encounter.Location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceProvider" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="partOf" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Encounter", propOrder = {
    "identifier",
    "status",
    "statusHistory",
    "clazz",
    "type",
    "priority",
    "patient",
    "episodeOfCare",
    "incomingReferral",
    "participant",
    "appointment",
    "period",
    "length",
    "reason",
    "indication",
    "hospitalization",
    "location",
    "serviceProvider",
    "partOf"
})
public class Encounter
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected EncounterState status;
    protected List<EncounterStatusHistory> statusHistory;
    @XmlElement(name = "class")
    protected EncounterClass clazz;
    protected List<CodeableConcept> type;
    protected CodeableConcept priority;
    protected Reference patient;
    protected List<Reference> episodeOfCare;
    protected List<Reference> incomingReferral;
    protected List<EncounterParticipant> participant;
    protected Reference appointment;
    protected Period period;
    protected Duration length;
    protected List<CodeableConcept> reason;
    protected List<Reference> indication;
    protected EncounterHospitalization hospitalization;
    protected List<EncounterLocation> location;
    protected Reference serviceProvider;
    protected Reference partOf;

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
     *     {@link EncounterState }
     *     
     */
    public EncounterState getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link EncounterState }
     *     
     */
    public void setStatus(EncounterState value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncounterStatusHistory }
     * 
     * 
     */
    public List<EncounterStatusHistory> getStatusHistory() {
        if (statusHistory == null) {
            statusHistory = new ArrayList<EncounterStatusHistory>();
        }
        return this.statusHistory;
    }

    /**
     * 取得 clazz 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link EncounterClass }
     *     
     */
    public EncounterClass getClazz() {
        return clazz;
    }

    /**
     * 設定 clazz 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link EncounterClass }
     *     
     */
    public void setClazz(EncounterClass value) {
        this.clazz = value;
    }

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
     * 取得 priority 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getPriority() {
        return priority;
    }

    /**
     * 設定 priority 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setPriority(CodeableConcept value) {
        this.priority = value;
    }

    /**
     * 取得 patient 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPatient() {
        return patient;
    }

    /**
     * 設定 patient 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPatient(Reference value) {
        this.patient = value;
    }

    /**
     * Gets the value of the episodeOfCare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the episodeOfCare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEpisodeOfCare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getEpisodeOfCare() {
        if (episodeOfCare == null) {
            episodeOfCare = new ArrayList<Reference>();
        }
        return this.episodeOfCare;
    }

    /**
     * Gets the value of the incomingReferral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomingReferral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomingReferral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getIncomingReferral() {
        if (incomingReferral == null) {
            incomingReferral = new ArrayList<Reference>();
        }
        return this.incomingReferral;
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
     * {@link EncounterParticipant }
     * 
     * 
     */
    public List<EncounterParticipant> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<EncounterParticipant>();
        }
        return this.participant;
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

    /**
     * 取得 length 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLength() {
        return length;
    }

    /**
     * 設定 length 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLength(Duration value) {
        this.length = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getReason() {
        if (reason == null) {
            reason = new ArrayList<CodeableConcept>();
        }
        return this.reason;
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
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getIndication() {
        if (indication == null) {
            indication = new ArrayList<Reference>();
        }
        return this.indication;
    }

    /**
     * 取得 hospitalization 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link EncounterHospitalization }
     *     
     */
    public EncounterHospitalization getHospitalization() {
        return hospitalization;
    }

    /**
     * 設定 hospitalization 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link EncounterHospitalization }
     *     
     */
    public void setHospitalization(EncounterHospitalization value) {
        this.hospitalization = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncounterLocation }
     * 
     * 
     */
    public List<EncounterLocation> getLocation() {
        if (location == null) {
            location = new ArrayList<EncounterLocation>();
        }
        return this.location;
    }

    /**
     * 取得 serviceProvider 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getServiceProvider() {
        return serviceProvider;
    }

    /**
     * 設定 serviceProvider 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setServiceProvider(Reference value) {
        this.serviceProvider = value;
    }

    /**
     * 取得 partOf 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPartOf() {
        return partOf;
    }

    /**
     * 設定 partOf 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPartOf(Reference value) {
        this.partOf = value;
    }

}
