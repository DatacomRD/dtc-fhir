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
 * <p>Device complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Device">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}DeviceStatus" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="manufactureDate" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="expiry" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="udi" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="lotNumber" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}ContactPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device", propOrder = {
    "identifier",
    "type",
    "note",
    "status",
    "manufacturer",
    "model",
    "version",
    "manufactureDate",
    "expiry",
    "udi",
    "lotNumber",
    "owner",
    "location",
    "patient",
    "contact",
    "url"
})
public class Device
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected CodeableConcept type;
    protected List<Annotation> note;
    protected DeviceStatus status;
    protected StringDt manufacturer;
    protected StringDt model;
    protected StringDt version;
    protected DateTime manufactureDate;
    protected DateTime expiry;
    protected StringDt udi;
    protected StringDt lotNumber;
    protected Reference owner;
    protected Reference location;
    protected Reference patient;
    protected List<ContactPoint> contact;
    protected Uri url;

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
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * 
     * 
     */
    public List<Annotation> getNote() {
        if (note == null) {
            note = new ArrayList<Annotation>();
        }
        return this.note;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setStatus(DeviceStatus value) {
        this.status = value;
    }

    /**
     * 取得 manufacturer 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getManufacturer() {
        return manufacturer;
    }

    /**
     * 設定 manufacturer 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setManufacturer(StringDt value) {
        this.manufacturer = value;
    }

    /**
     * 取得 model 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getModel() {
        return model;
    }

    /**
     * 設定 model 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setModel(StringDt value) {
        this.model = value;
    }

    /**
     * 取得 version 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getVersion() {
        return version;
    }

    /**
     * 設定 version 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setVersion(StringDt value) {
        this.version = value;
    }

    /**
     * 取得 manufactureDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getManufactureDate() {
        return manufactureDate;
    }

    /**
     * 設定 manufactureDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setManufactureDate(DateTime value) {
        this.manufactureDate = value;
    }

    /**
     * 取得 expiry 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getExpiry() {
        return expiry;
    }

    /**
     * 設定 expiry 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setExpiry(DateTime value) {
        this.expiry = value;
    }

    /**
     * 取得 udi 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getUdi() {
        return udi;
    }

    /**
     * 設定 udi 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setUdi(StringDt value) {
        this.udi = value;
    }

    /**
     * 取得 lotNumber 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getLotNumber() {
        return lotNumber;
    }

    /**
     * 設定 lotNumber 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setLotNumber(StringDt value) {
        this.lotNumber = value;
    }

    /**
     * 取得 owner 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOwner() {
        return owner;
    }

    /**
     * 設定 owner 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOwner(Reference value) {
        this.owner = value;
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
     * {@link ContactPoint }
     * 
     * 
     */
    public List<ContactPoint> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactPoint>();
        }
        return this.contact;
    }

    /**
     * 取得 url 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getUrl() {
        return url;
    }

    /**
     * 設定 url 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setUrl(Uri value) {
        this.url = value;
    }

}
