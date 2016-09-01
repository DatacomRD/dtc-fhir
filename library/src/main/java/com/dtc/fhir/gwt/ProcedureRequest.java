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
 * <p>ProcedureRequest complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ProcedureRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="reasonCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="reasonReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="scheduledDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="scheduledPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="scheduledTiming" type="{http://hl7.org/fhir}Timing"/>
 *         &lt;/choice>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="performer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}ProcedureRequestStatus" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="asNeededBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="asNeededCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;/choice>
 *         &lt;element name="orderedOn" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="orderer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://hl7.org/fhir}ProcedureRequestPriority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedureRequest", propOrder = {
    "identifier",
    "subject",
    "code",
    "bodySite",
    "reasonCodeableConcept",
    "reasonReference",
    "scheduledDateTime",
    "scheduledPeriod",
    "scheduledTiming",
    "encounter",
    "performer",
    "status",
    "notes",
    "asNeededBoolean",
    "asNeededCodeableConcept",
    "orderedOn",
    "orderer",
    "priority"
})
public class ProcedureRequest
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected Reference subject;
    @XmlElement(required = true)
    protected CodeableConcept code;
    protected List<CodeableConcept> bodySite;
    protected CodeableConcept reasonCodeableConcept;
    protected Reference reasonReference;
    protected DateTime scheduledDateTime;
    protected Period scheduledPeriod;
    protected Timing scheduledTiming;
    protected Reference encounter;
    protected Reference performer;
    protected ProcedureRequestStatus status;
    protected List<Annotation> notes;
    protected BooleanDt asNeededBoolean;
    protected CodeableConcept asNeededCodeableConcept;
    protected DateTime orderedOn;
    protected Reference orderer;
    protected ProcedureRequestPriority priority;

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
     * Gets the value of the bodySite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodySite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodySite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getBodySite() {
        if (bodySite == null) {
            bodySite = new ArrayList<CodeableConcept>();
        }
        return this.bodySite;
    }

    /**
     * 取得 reasonCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReasonCodeableConcept() {
        return reasonCodeableConcept;
    }

    /**
     * 設定 reasonCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReasonCodeableConcept(CodeableConcept value) {
        this.reasonCodeableConcept = value;
    }

    /**
     * 取得 reasonReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReasonReference() {
        return reasonReference;
    }

    /**
     * 設定 reasonReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReasonReference(Reference value) {
        this.reasonReference = value;
    }

    /**
     * 取得 scheduledDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getScheduledDateTime() {
        return scheduledDateTime;
    }

    /**
     * 設定 scheduledDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setScheduledDateTime(DateTime value) {
        this.scheduledDateTime = value;
    }

    /**
     * 取得 scheduledPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getScheduledPeriod() {
        return scheduledPeriod;
    }

    /**
     * 設定 scheduledPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setScheduledPeriod(Period value) {
        this.scheduledPeriod = value;
    }

    /**
     * 取得 scheduledTiming 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getScheduledTiming() {
        return scheduledTiming;
    }

    /**
     * 設定 scheduledTiming 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setScheduledTiming(Timing value) {
        this.scheduledTiming = value;
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
     * 取得 performer 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPerformer() {
        return performer;
    }

    /**
     * 設定 performer 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPerformer(Reference value) {
        this.performer = value;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureRequestStatus }
     *     
     */
    public ProcedureRequestStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureRequestStatus }
     *     
     */
    public void setStatus(ProcedureRequestStatus value) {
        this.status = value;
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
     * {@link Annotation }
     * 
     * 
     */
    public List<Annotation> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Annotation>();
        }
        return this.notes;
    }

    /**
     * 取得 asNeededBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getAsNeededBoolean() {
        return asNeededBoolean;
    }

    /**
     * 設定 asNeededBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setAsNeededBoolean(BooleanDt value) {
        this.asNeededBoolean = value;
    }

    /**
     * 取得 asNeededCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getAsNeededCodeableConcept() {
        return asNeededCodeableConcept;
    }

    /**
     * 設定 asNeededCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAsNeededCodeableConcept(CodeableConcept value) {
        this.asNeededCodeableConcept = value;
    }

    /**
     * 取得 orderedOn 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getOrderedOn() {
        return orderedOn;
    }

    /**
     * 設定 orderedOn 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setOrderedOn(DateTime value) {
        this.orderedOn = value;
    }

    /**
     * 取得 orderer 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOrderer() {
        return orderer;
    }

    /**
     * 設定 orderer 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOrderer(Reference value) {
        this.orderer = value;
    }

    /**
     * 取得 priority 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureRequestPriority }
     *     
     */
    public ProcedureRequestPriority getPriority() {
        return priority;
    }

    /**
     * 設定 priority 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureRequestPriority }
     *     
     */
    public void setPriority(ProcedureRequestPriority value) {
        this.priority = value;
    }

}
