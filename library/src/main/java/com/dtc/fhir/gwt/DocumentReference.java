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
 * <p>DocumentReference complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="DocumentReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="masterIdentifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="class" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="author" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="custodian" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="authenticator" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="created" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="indexed" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="docStatus" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="relatesTo" type="{http://hl7.org/fhir}DocumentReference.RelatesTo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="securityLabel" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="content" type="{http://hl7.org/fhir}DocumentReference.Content" maxOccurs="unbounded"/>
 *         &lt;element name="context" type="{http://hl7.org/fhir}DocumentReference.Context" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReference", propOrder = {
    "masterIdentifier",
    "identifier",
    "subject",
    "type",
    "clazz",
    "author",
    "custodian",
    "authenticator",
    "created",
    "indexed",
    "status",
    "docStatus",
    "relatesTo",
    "description",
    "securityLabel",
    "content",
    "context"
})
public class DocumentReference
    extends DomainResource
{

    protected Identifier masterIdentifier;
    protected List<Identifier> identifier;
    protected Reference subject;
    @XmlElement(required = true)
    protected CodeableConcept type;
    @XmlElement(name = "class")
    protected CodeableConcept clazz;
    protected List<Reference> author;
    protected Reference custodian;
    protected Reference authenticator;
    protected DateTime created;
    @XmlElement(required = true)
    protected Instant indexed;
    @XmlElement(required = true)
    protected Code status;
    protected CodeableConcept docStatus;
    protected List<DocumentReferenceRelatesTo> relatesTo;
    protected StringDt description;
    protected List<CodeableConcept> securityLabel;
    @XmlElement(required = true)
    protected List<DocumentReferenceContent> content;
    protected DocumentReferenceContext context;

    /**
     * 取得 masterIdentifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getMasterIdentifier() {
        return masterIdentifier;
    }

    /**
     * 設定 masterIdentifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setMasterIdentifier(Identifier value) {
        this.masterIdentifier = value;
    }

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
     * 取得 clazz 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getClazz() {
        return clazz;
    }

    /**
     * 設定 clazz 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setClazz(CodeableConcept value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getAuthor() {
        if (author == null) {
            author = new ArrayList<Reference>();
        }
        return this.author;
    }

    /**
     * 取得 custodian 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getCustodian() {
        return custodian;
    }

    /**
     * 設定 custodian 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setCustodian(Reference value) {
        this.custodian = value;
    }

    /**
     * 取得 authenticator 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getAuthenticator() {
        return authenticator;
    }

    /**
     * 設定 authenticator 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setAuthenticator(Reference value) {
        this.authenticator = value;
    }

    /**
     * 取得 created 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCreated() {
        return created;
    }

    /**
     * 設定 created 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreated(DateTime value) {
        this.created = value;
    }

    /**
     * 取得 indexed 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getIndexed() {
        return indexed;
    }

    /**
     * 設定 indexed 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setIndexed(Instant value) {
        this.indexed = value;
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
     * 取得 docStatus 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDocStatus() {
        return docStatus;
    }

    /**
     * 設定 docStatus 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDocStatus(CodeableConcept value) {
        this.docStatus = value;
    }

    /**
     * Gets the value of the relatesTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatesTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatesTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceRelatesTo }
     * 
     * 
     */
    public List<DocumentReferenceRelatesTo> getRelatesTo() {
        if (relatesTo == null) {
            relatesTo = new ArrayList<DocumentReferenceRelatesTo>();
        }
        return this.relatesTo;
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
     * Gets the value of the securityLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSecurityLabel() {
        if (securityLabel == null) {
            securityLabel = new ArrayList<CodeableConcept>();
        }
        return this.securityLabel;
    }

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceContent }
     * 
     * 
     */
    public List<DocumentReferenceContent> getContent() {
        if (content == null) {
            content = new ArrayList<DocumentReferenceContent>();
        }
        return this.content;
    }

    /**
     * 取得 context 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceContext }
     *     
     */
    public DocumentReferenceContext getContext() {
        return context;
    }

    /**
     * 設定 context 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceContext }
     *     
     */
    public void setContext(DocumentReferenceContext value) {
        this.context = value;
    }

}
