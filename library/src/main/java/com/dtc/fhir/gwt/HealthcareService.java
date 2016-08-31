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
 * <p>HealthcareService complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="HealthcareService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="providedBy" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="serviceCategory" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://hl7.org/fhir}HealthcareService.ServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="serviceName" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="extraDetails" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://hl7.org/fhir}Attachment" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}ContactPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coverageArea" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceProvisionCode" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eligibility" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="eligibilityNote" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="programName" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="characteristic" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="referralMethod" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="publicKey" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="appointmentRequired" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="availableTime" type="{http://hl7.org/fhir}HealthcareService.AvailableTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notAvailable" type="{http://hl7.org/fhir}HealthcareService.NotAvailable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="availabilityExceptions" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthcareService", propOrder = {
    "identifier",
    "providedBy",
    "serviceCategory",
    "serviceType",
    "location",
    "serviceName",
    "comment",
    "extraDetails",
    "photo",
    "telecom",
    "coverageArea",
    "serviceProvisionCode",
    "eligibility",
    "eligibilityNote",
    "programName",
    "characteristic",
    "referralMethod",
    "publicKey",
    "appointmentRequired",
    "availableTime",
    "notAvailable",
    "availabilityExceptions"
})
public class HealthcareService
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected Reference providedBy;
    protected CodeableConcept serviceCategory;
    protected List<HealthcareServiceServiceType> serviceType;
    @XmlElement(required = true)
    protected Reference location;
    protected StringDt serviceName;
    protected StringDt comment;
    protected StringDt extraDetails;
    protected Attachment photo;
    protected List<ContactPoint> telecom;
    protected List<Reference> coverageArea;
    protected List<CodeableConcept> serviceProvisionCode;
    protected CodeableConcept eligibility;
    protected StringDt eligibilityNote;
    protected List<StringDt> programName;
    protected List<CodeableConcept> characteristic;
    protected List<CodeableConcept> referralMethod;
    protected StringDt publicKey;
    protected BooleanDt appointmentRequired;
    protected List<HealthcareServiceAvailableTime> availableTime;
    protected List<HealthcareServiceNotAvailable> notAvailable;
    protected StringDt availabilityExceptions;

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
     * 取得 providedBy 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getProvidedBy() {
        return providedBy;
    }

    /**
     * 設定 providedBy 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setProvidedBy(Reference value) {
        this.providedBy = value;
    }

    /**
     * 取得 serviceCategory 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getServiceCategory() {
        return serviceCategory;
    }

    /**
     * 設定 serviceCategory 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setServiceCategory(CodeableConcept value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthcareServiceServiceType }
     * 
     * 
     */
    public List<HealthcareServiceServiceType> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<HealthcareServiceServiceType>();
        }
        return this.serviceType;
    }

    /**
     * 取得 location 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getLocation() {
        return location;
    }

    /**
     * 設定 location 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setLocation(Reference value) {
        this.location = value;
    }

    /**
     * 取得 serviceName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getServiceName() {
        return serviceName;
    }

    /**
     * 設定 serviceName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setServiceName(StringDt value) {
        this.serviceName = value;
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
     * 取得 extraDetails 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getExtraDetails() {
        return extraDetails;
    }

    /**
     * 設定 extraDetails 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setExtraDetails(StringDt value) {
        this.extraDetails = value;
    }

    /**
     * 取得 photo 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getPhoto() {
        return photo;
    }

    /**
     * 設定 photo 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setPhoto(Attachment value) {
        this.photo = value;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPoint }
     * 
     * 
     */
    public List<ContactPoint> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<ContactPoint>();
        }
        return this.telecom;
    }

    /**
     * Gets the value of the coverageArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getCoverageArea() {
        if (coverageArea == null) {
            coverageArea = new ArrayList<Reference>();
        }
        return this.coverageArea;
    }

    /**
     * Gets the value of the serviceProvisionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProvisionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProvisionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getServiceProvisionCode() {
        if (serviceProvisionCode == null) {
            serviceProvisionCode = new ArrayList<CodeableConcept>();
        }
        return this.serviceProvisionCode;
    }

    /**
     * 取得 eligibility 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getEligibility() {
        return eligibility;
    }

    /**
     * 設定 eligibility 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setEligibility(CodeableConcept value) {
        this.eligibility = value;
    }

    /**
     * 取得 eligibilityNote 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getEligibilityNote() {
        return eligibilityNote;
    }

    /**
     * 設定 eligibilityNote 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setEligibilityNote(StringDt value) {
        this.eligibilityNote = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDt }
     * 
     * 
     */
    public List<StringDt> getProgramName() {
        if (programName == null) {
            programName = new ArrayList<StringDt>();
        }
        return this.programName;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<CodeableConcept>();
        }
        return this.characteristic;
    }

    /**
     * Gets the value of the referralMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referralMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferralMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getReferralMethod() {
        if (referralMethod == null) {
            referralMethod = new ArrayList<CodeableConcept>();
        }
        return this.referralMethod;
    }

    /**
     * 取得 publicKey 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getPublicKey() {
        return publicKey;
    }

    /**
     * 設定 publicKey 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setPublicKey(StringDt value) {
        this.publicKey = value;
    }

    /**
     * 取得 appointmentRequired 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getAppointmentRequired() {
        return appointmentRequired;
    }

    /**
     * 設定 appointmentRequired 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setAppointmentRequired(BooleanDt value) {
        this.appointmentRequired = value;
    }

    /**
     * Gets the value of the availableTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthcareServiceAvailableTime }
     * 
     * 
     */
    public List<HealthcareServiceAvailableTime> getAvailableTime() {
        if (availableTime == null) {
            availableTime = new ArrayList<HealthcareServiceAvailableTime>();
        }
        return this.availableTime;
    }

    /**
     * Gets the value of the notAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthcareServiceNotAvailable }
     * 
     * 
     */
    public List<HealthcareServiceNotAvailable> getNotAvailable() {
        if (notAvailable == null) {
            notAvailable = new ArrayList<HealthcareServiceNotAvailable>();
        }
        return this.notAvailable;
    }

    /**
     * 取得 availabilityExceptions 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getAvailabilityExceptions() {
        return availabilityExceptions;
    }

    /**
     * 設定 availabilityExceptions 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setAvailabilityExceptions(StringDt value) {
        this.availabilityExceptions = value;
    }

}
