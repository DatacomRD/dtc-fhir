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
 * <p>Conformance complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Conformance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}Conformance.Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="requirements" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="copyright" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://hl7.org/fhir}ConformanceStatementKind"/>
 *         &lt;element name="software" type="{http://hl7.org/fhir}Conformance.Software" minOccurs="0"/>
 *         &lt;element name="implementation" type="{http://hl7.org/fhir}Conformance.Implementation" minOccurs="0"/>
 *         &lt;element name="fhirVersion" type="{http://hl7.org/fhir}id"/>
 *         &lt;element name="acceptUnknown" type="{http://hl7.org/fhir}UnknownContentCode"/>
 *         &lt;element name="format" type="{http://hl7.org/fhir}code" maxOccurs="unbounded"/>
 *         &lt;element name="profile" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rest" type="{http://hl7.org/fhir}Conformance.Rest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="messaging" type="{http://hl7.org/fhir}Conformance.Messaging" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="document" type="{http://hl7.org/fhir}Conformance.Document" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance", propOrder = {
    "url",
    "version",
    "name",
    "status",
    "experimental",
    "publisher",
    "contact",
    "date",
    "description",
    "requirements",
    "copyright",
    "kind",
    "software",
    "implementation",
    "fhirVersion",
    "acceptUnknown",
    "format",
    "profile",
    "rest",
    "messaging",
    "document"
})
public class Conformance
    extends DomainResource
{

    protected Uri url;
    protected StringDt version;
    protected StringDt name;
    protected Code status;
    protected BooleanDt experimental;
    protected StringDt publisher;
    protected List<ConformanceContact> contact;
    @XmlElement(required = true)
    protected DateTime date;
    protected StringDt description;
    protected StringDt requirements;
    protected StringDt copyright;
    @XmlElement(required = true)
    protected ConformanceStatementKind kind;
    protected ConformanceSoftware software;
    protected ConformanceImplementation implementation;
    @XmlElement(required = true)
    protected Id fhirVersion;
    @XmlElement(required = true)
    protected UnknownContentCode acceptUnknown;
    @XmlElement(required = true)
    protected List<Code> format;
    protected List<Reference> profile;
    protected List<ConformanceRest> rest;
    protected List<ConformanceMessaging> messaging;
    protected List<ConformanceDocument> document;

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
     * 取得 name 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getName() {
        return name;
    }

    /**
     * 設定 name 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setName(StringDt value) {
        this.name = value;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setStatus(Code value) {
        this.status = value;
    }

    /**
     * 取得 experimental 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getExperimental() {
        return experimental;
    }

    /**
     * 設定 experimental 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setExperimental(BooleanDt value) {
        this.experimental = value;
    }

    /**
     * 取得 publisher 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getPublisher() {
        return publisher;
    }

    /**
     * 設定 publisher 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setPublisher(StringDt value) {
        this.publisher = value;
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
     * {@link ConformanceContact }
     * 
     * 
     */
    public List<ConformanceContact> getContact() {
        if (contact == null) {
            contact = new ArrayList<ConformanceContact>();
        }
        return this.contact;
    }

    /**
     * 取得 date 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * 設定 date 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
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
     * 取得 requirements 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getRequirements() {
        return requirements;
    }

    /**
     * 設定 requirements 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setRequirements(StringDt value) {
        this.requirements = value;
    }

    /**
     * 取得 copyright 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getCopyright() {
        return copyright;
    }

    /**
     * 設定 copyright 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setCopyright(StringDt value) {
        this.copyright = value;
    }

    /**
     * 取得 kind 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceStatementKind }
     *     
     */
    public ConformanceStatementKind getKind() {
        return kind;
    }

    /**
     * 設定 kind 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceStatementKind }
     *     
     */
    public void setKind(ConformanceStatementKind value) {
        this.kind = value;
    }

    /**
     * 取得 software 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceSoftware }
     *     
     */
    public ConformanceSoftware getSoftware() {
        return software;
    }

    /**
     * 設定 software 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceSoftware }
     *     
     */
    public void setSoftware(ConformanceSoftware value) {
        this.software = value;
    }

    /**
     * 取得 implementation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceImplementation }
     *     
     */
    public ConformanceImplementation getImplementation() {
        return implementation;
    }

    /**
     * 設定 implementation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceImplementation }
     *     
     */
    public void setImplementation(ConformanceImplementation value) {
        this.implementation = value;
    }

    /**
     * 取得 fhirVersion 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getFhirVersion() {
        return fhirVersion;
    }

    /**
     * 設定 fhirVersion 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setFhirVersion(Id value) {
        this.fhirVersion = value;
    }

    /**
     * 取得 acceptUnknown 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnknownContentCode }
     *     
     */
    public UnknownContentCode getAcceptUnknown() {
        return acceptUnknown;
    }

    /**
     * 設定 acceptUnknown 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownContentCode }
     *     
     */
    public void setAcceptUnknown(UnknownContentCode value) {
        this.acceptUnknown = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the format property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Code }
     * 
     * 
     */
    public List<Code> getFormat() {
        if (format == null) {
            format = new ArrayList<Code>();
        }
        return this.format;
    }

    /**
     * Gets the value of the profile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getProfile() {
        if (profile == null) {
            profile = new ArrayList<Reference>();
        }
        return this.profile;
    }

    /**
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceRest }
     * 
     * 
     */
    public List<ConformanceRest> getRest() {
        if (rest == null) {
            rest = new ArrayList<ConformanceRest>();
        }
        return this.rest;
    }

    /**
     * Gets the value of the messaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceMessaging }
     * 
     * 
     */
    public List<ConformanceMessaging> getMessaging() {
        if (messaging == null) {
            messaging = new ArrayList<ConformanceMessaging>();
        }
        return this.messaging;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceDocument }
     * 
     * 
     */
    public List<ConformanceDocument> getDocument() {
        if (document == null) {
            document = new ArrayList<ConformanceDocument>();
        }
        return this.document;
    }

}
