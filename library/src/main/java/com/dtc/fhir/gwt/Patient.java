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
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Patient complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Patient">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="active" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}HumanName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}ContactPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="deceasedBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="deceasedDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;/choice>
 *         &lt;element name="address" type="{http://hl7.org/fhir}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="multipleBirthBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="multipleBirthInteger" type="{http://hl7.org/fhir}integer"/>
 *         &lt;/choice>
 *         &lt;element name="photo" type="{http://hl7.org/fhir}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}Patient.Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="animal" type="{http://hl7.org/fhir}Patient.Animal" minOccurs="0"/>
 *         &lt;element name="communication" type="{http://hl7.org/fhir}Patient.Communication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="careProvider" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="managingOrganization" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="link" type="{http://hl7.org/fhir}Patient.Link" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient", propOrder = {
    "identifier",
    "active",
    "name",
    "telecom",
    "gender",
    "birthDate",
    "deceasedBoolean",
    "deceasedDateTime",
    "address",
    "maritalStatus",
    "multipleBirthBoolean",
    "multipleBirthInteger",
    "photo",
    "contact",
    "animal",
    "communication",
    "careProvider",
    "managingOrganization",
    "link"
})
public class Patient
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected BooleanDt active;
    protected List<HumanName> name;
    protected List<ContactPoint> telecom;
    protected Code gender;
    protected Date birthDate;
    protected BooleanDt deceasedBoolean;
    protected DateTime deceasedDateTime;
    protected List<Address> address;
    protected CodeableConcept maritalStatus;
    protected BooleanDt multipleBirthBoolean;
    protected IntegerDt multipleBirthInteger;
    protected List<Attachment> photo;
    protected List<PatientContact> contact;
    protected PatientAnimal animal;
    protected List<PatientCommunication> communication;
    protected List<Reference> careProvider;
    protected Reference managingOrganization;
    protected List<PatientLink> link;

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
     * 取得 active 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getActive() {
        return active;
    }

    /**
     * 設定 active 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setActive(BooleanDt value) {
        this.active = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HumanName }
     * 
     * 
     */
    public List<HumanName> getName() {
        if (name == null) {
            name = new ArrayList<HumanName>();
        }
        return this.name;
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
     * 取得 gender 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getGender() {
        return gender;
    }

    /**
     * 設定 gender 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setGender(Code value) {
        this.gender = value;
    }

    /**
     * 取得 birthDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * 設定 birthDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBirthDate(Date value) {
        this.birthDate = value;
    }

    /**
     * 取得 deceasedBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getDeceasedBoolean() {
        return deceasedBoolean;
    }

    /**
     * 設定 deceasedBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setDeceasedBoolean(BooleanDt value) {
        this.deceasedBoolean = value;
    }

    /**
     * 取得 deceasedDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDeceasedDateTime() {
        return deceasedDateTime;
    }

    /**
     * 設定 deceasedDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDeceasedDateTime(DateTime value) {
        this.deceasedDateTime = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * 取得 maritalStatus 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 設定 maritalStatus 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMaritalStatus(CodeableConcept value) {
        this.maritalStatus = value;
    }

    /**
     * 取得 multipleBirthBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getMultipleBirthBoolean() {
        return multipleBirthBoolean;
    }

    /**
     * 設定 multipleBirthBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setMultipleBirthBoolean(BooleanDt value) {
        this.multipleBirthBoolean = value;
    }

    /**
     * 取得 multipleBirthInteger 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getMultipleBirthInteger() {
        return multipleBirthInteger;
    }

    /**
     * 設定 multipleBirthInteger 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setMultipleBirthInteger(IntegerDt value) {
        this.multipleBirthInteger = value;
    }

    /**
     * Gets the value of the photo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the photo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getPhoto() {
        if (photo == null) {
            photo = new ArrayList<Attachment>();
        }
        return this.photo;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientContact }
     * 
     * 
     */
    public List<PatientContact> getContact() {
        if (contact == null) {
            contact = new ArrayList<PatientContact>();
        }
        return this.contact;
    }

    /**
     * 取得 animal 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PatientAnimal }
     *     
     */
    public PatientAnimal getAnimal() {
        return animal;
    }

    /**
     * 設定 animal 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientAnimal }
     *     
     */
    public void setAnimal(PatientAnimal value) {
        this.animal = value;
    }

    /**
     * Gets the value of the communication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientCommunication }
     * 
     * 
     */
    public List<PatientCommunication> getCommunication() {
        if (communication == null) {
            communication = new ArrayList<PatientCommunication>();
        }
        return this.communication;
    }

    /**
     * Gets the value of the careProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getCareProvider() {
        if (careProvider == null) {
            careProvider = new ArrayList<Reference>();
        }
        return this.careProvider;
    }

    /**
     * 取得 managingOrganization 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getManagingOrganization() {
        return managingOrganization;
    }

    /**
     * 設定 managingOrganization 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setManagingOrganization(Reference value) {
        this.managingOrganization = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientLink }
     * 
     * 
     */
    public List<PatientLink> getLink() {
        if (link == null) {
            link = new ArrayList<PatientLink>();
        }
        return this.link;
    }

}
