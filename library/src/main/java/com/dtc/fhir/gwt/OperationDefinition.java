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
 * <p>OperationDefinition complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="OperationDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="kind" type="{http://hl7.org/fhir}OperationKind"/>
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}OperationDefinition.Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="requirements" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="idempotent" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="base" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="system" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}code" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instance" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="parameter" type="{http://hl7.org/fhir}OperationDefinition.Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationDefinition", propOrder = {
    "url",
    "version",
    "name",
    "status",
    "kind",
    "experimental",
    "publisher",
    "contact",
    "date",
    "description",
    "requirements",
    "idempotent",
    "code",
    "notes",
    "base",
    "system",
    "type",
    "instance",
    "parameter"
})
public class OperationDefinition
    extends DomainResource
{

    protected Uri url;
    protected StringDt version;
    @XmlElement(required = true)
    protected StringDt name;
    @XmlElement(required = true)
    protected Code status;
    @XmlElement(required = true)
    protected OperationKind kind;
    protected BooleanDt experimental;
    protected StringDt publisher;
    protected List<OperationDefinitionContact> contact;
    protected DateTime date;
    protected StringDt description;
    protected StringDt requirements;
    protected BooleanDt idempotent;
    @XmlElement(required = true)
    protected Code code;
    protected StringDt notes;
    protected Reference base;
    @XmlElement(required = true)
    protected BooleanDt system;
    protected List<Code> type;
    @XmlElement(required = true)
    protected BooleanDt instance;
    protected List<OperationDefinitionParameter> parameter;

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
     * 取得 kind 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link OperationKind }
     *     
     */
    public OperationKind getKind() {
        return kind;
    }

    /**
     * 設定 kind 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationKind }
     *     
     */
    public void setKind(OperationKind value) {
        this.kind = value;
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
     * {@link OperationDefinitionContact }
     * 
     * 
     */
    public List<OperationDefinitionContact> getContact() {
        if (contact == null) {
            contact = new ArrayList<OperationDefinitionContact>();
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
     * 取得 idempotent 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getIdempotent() {
        return idempotent;
    }

    /**
     * 設定 idempotent 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setIdempotent(BooleanDt value) {
        this.idempotent = value;
    }

    /**
     * 取得 code 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCode() {
        return code;
    }

    /**
     * 設定 code 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCode(Code value) {
        this.code = value;
    }

    /**
     * 取得 notes 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getNotes() {
        return notes;
    }

    /**
     * 設定 notes 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setNotes(StringDt value) {
        this.notes = value;
    }

    /**
     * 取得 base 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getBase() {
        return base;
    }

    /**
     * 設定 base 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setBase(Reference value) {
        this.base = value;
    }

    /**
     * 取得 system 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getSystem() {
        return system;
    }

    /**
     * 設定 system 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setSystem(BooleanDt value) {
        this.system = value;
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
     * {@link Code }
     * 
     * 
     */
    public List<Code> getType() {
        if (type == null) {
            type = new ArrayList<Code>();
        }
        return this.type;
    }

    /**
     * 取得 instance 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getInstance() {
        return instance;
    }

    /**
     * 設定 instance 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setInstance(BooleanDt value) {
        this.instance = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationDefinitionParameter }
     * 
     * 
     */
    public List<OperationDefinitionParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<OperationDefinitionParameter>();
        }
        return this.parameter;
    }

}
