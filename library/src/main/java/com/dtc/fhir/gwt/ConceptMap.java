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
 * <p>ConceptMap complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ConceptMap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}ConceptMap.Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="useContext" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requirements" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="copyright" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="sourceUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="sourceReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="targetUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="targetReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="element" type="{http://hl7.org/fhir}ConceptMap.Element" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMap", propOrder = {
    "url",
    "identifier",
    "version",
    "name",
    "status",
    "experimental",
    "publisher",
    "contact",
    "date",
    "description",
    "useContext",
    "requirements",
    "copyright",
    "sourceUri",
    "sourceReference",
    "targetUri",
    "targetReference",
    "element"
})
public class ConceptMap
    extends DomainResource
{

    protected Uri url;
    protected Identifier identifier;
    protected StringDt version;
    protected StringDt name;
    @XmlElement(required = true)
    protected Code status;
    protected BooleanDt experimental;
    protected StringDt publisher;
    protected List<ConceptMapContact> contact;
    protected DateTime date;
    protected StringDt description;
    protected List<CodeableConcept> useContext;
    protected StringDt requirements;
    protected StringDt copyright;
    protected Uri sourceUri;
    protected Reference sourceReference;
    protected Uri targetUri;
    protected Reference targetReference;
    protected List<ConceptMapElement> element;

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
     * 取得 identifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * 設定 identifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
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
     * {@link ConceptMapContact }
     * 
     * 
     */
    public List<ConceptMapContact> getContact() {
        if (contact == null) {
            contact = new ArrayList<ConceptMapContact>();
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
     * Gets the value of the useContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getUseContext() {
        if (useContext == null) {
            useContext = new ArrayList<CodeableConcept>();
        }
        return this.useContext;
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
     * 取得 sourceUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getSourceUri() {
        return sourceUri;
    }

    /**
     * 設定 sourceUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setSourceUri(Uri value) {
        this.sourceUri = value;
    }

    /**
     * 取得 sourceReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSourceReference() {
        return sourceReference;
    }

    /**
     * 設定 sourceReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSourceReference(Reference value) {
        this.sourceReference = value;
    }

    /**
     * 取得 targetUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getTargetUri() {
        return targetUri;
    }

    /**
     * 設定 targetUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setTargetUri(Uri value) {
        this.targetUri = value;
    }

    /**
     * 取得 targetReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getTargetReference() {
        return targetReference;
    }

    /**
     * 設定 targetReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setTargetReference(Reference value) {
        this.targetReference = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptMapElement }
     * 
     * 
     */
    public List<ConceptMapElement> getElement() {
        if (element == null) {
            element = new ArrayList<ConceptMapElement>();
        }
        return this.element;
    }

}
