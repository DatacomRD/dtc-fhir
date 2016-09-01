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
 * <p>StructureDefinition complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="StructureDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="display" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}StructureDefinition.Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="useContext" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requirements" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="copyright" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fhirVersion" type="{http://hl7.org/fhir}id" minOccurs="0"/>
 *         &lt;element name="mapping" type="{http://hl7.org/fhir}StructureDefinition.Mapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://hl7.org/fhir}StructureDefinitionKind"/>
 *         &lt;element name="constrainedType" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="abstract" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="contextType" type="{http://hl7.org/fhir}ExtensionContext" minOccurs="0"/>
 *         &lt;element name="context" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="base" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="snapshot" type="{http://hl7.org/fhir}StructureDefinition.Snapshot" minOccurs="0"/>
 *         &lt;element name="differential" type="{http://hl7.org/fhir}StructureDefinition.Differential" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructureDefinition", propOrder = {
    "url",
    "identifier",
    "version",
    "name",
    "display",
    "status",
    "experimental",
    "publisher",
    "contact",
    "date",
    "description",
    "useContext",
    "requirements",
    "copyright",
    "code",
    "fhirVersion",
    "mapping",
    "kind",
    "constrainedType",
    "_abstract",
    "contextType",
    "context",
    "base",
    "snapshot",
    "differential"
})
public class StructureDefinition
    extends DomainResource
{

    @XmlElement(required = true)
    protected Uri url;
    protected List<Identifier> identifier;
    protected StringDt version;
    @XmlElement(required = true)
    protected StringDt name;
    protected StringDt display;
    @XmlElement(required = true)
    protected Code status;
    protected BooleanDt experimental;
    protected StringDt publisher;
    protected List<StructureDefinitionContact> contact;
    protected DateTime date;
    protected StringDt description;
    protected List<CodeableConcept> useContext;
    protected StringDt requirements;
    protected StringDt copyright;
    protected List<Coding> code;
    protected Id fhirVersion;
    protected List<StructureDefinitionMapping> mapping;
    @XmlElement(required = true)
    protected StructureDefinitionKind kind;
    protected Code constrainedType;
    @XmlElement(name = "abstract", required = true)
    protected BooleanDt _abstract;
    protected ExtensionContext contextType;
    protected List<StringDt> context;
    protected Uri base;
    protected StructureDefinitionSnapshot snapshot;
    protected StructureDefinitionDifferential differential;

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
     * 取得 display 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDisplay() {
        return display;
    }

    /**
     * 設定 display 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDisplay(StringDt value) {
        this.display = value;
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
     * {@link StructureDefinitionContact }
     * 
     * 
     */
    public List<StructureDefinitionContact> getContact() {
        if (contact == null) {
            contact = new ArrayList<StructureDefinitionContact>();
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
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getCode() {
        if (code == null) {
            code = new ArrayList<Coding>();
        }
        return this.code;
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
     * Gets the value of the mapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructureDefinitionMapping }
     * 
     * 
     */
    public List<StructureDefinitionMapping> getMapping() {
        if (mapping == null) {
            mapping = new ArrayList<StructureDefinitionMapping>();
        }
        return this.mapping;
    }

    /**
     * 取得 kind 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StructureDefinitionKind }
     *     
     */
    public StructureDefinitionKind getKind() {
        return kind;
    }

    /**
     * 設定 kind 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureDefinitionKind }
     *     
     */
    public void setKind(StructureDefinitionKind value) {
        this.kind = value;
    }

    /**
     * 取得 constrainedType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getConstrainedType() {
        return constrainedType;
    }

    /**
     * 設定 constrainedType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setConstrainedType(Code value) {
        this.constrainedType = value;
    }

    /**
     * 取得 abstract 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getAbstract() {
        return _abstract;
    }

    /**
     * 設定 abstract 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setAbstract(BooleanDt value) {
        this._abstract = value;
    }

    /**
     * 取得 contextType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionContext }
     *     
     */
    public ExtensionContext getContextType() {
        return contextType;
    }

    /**
     * 設定 contextType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionContext }
     *     
     */
    public void setContextType(ExtensionContext value) {
        this.contextType = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the context property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDt }
     * 
     * 
     */
    public List<StringDt> getContext() {
        if (context == null) {
            context = new ArrayList<StringDt>();
        }
        return this.context;
    }

    /**
     * 取得 base 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getBase() {
        return base;
    }

    /**
     * 設定 base 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setBase(Uri value) {
        this.base = value;
    }

    /**
     * 取得 snapshot 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StructureDefinitionSnapshot }
     *     
     */
    public StructureDefinitionSnapshot getSnapshot() {
        return snapshot;
    }

    /**
     * 設定 snapshot 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureDefinitionSnapshot }
     *     
     */
    public void setSnapshot(StructureDefinitionSnapshot value) {
        this.snapshot = value;
    }

    /**
     * 取得 differential 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StructureDefinitionDifferential }
     *     
     */
    public StructureDefinitionDifferential getDifferential() {
        return differential;
    }

    /**
     * 設定 differential 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureDefinitionDifferential }
     *     
     */
    public void setDifferential(StructureDefinitionDifferential value) {
        this.differential = value;
    }

}
