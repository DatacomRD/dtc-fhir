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
 * <p>Specimen complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Specimen">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}SpecimenStatus" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="accessionIdentifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="receivedTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="collection" type="{http://hl7.org/fhir}Specimen.Collection" minOccurs="0"/>
 *         &lt;element name="treatment" type="{http://hl7.org/fhir}Specimen.Treatment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="container" type="{http://hl7.org/fhir}Specimen.Container" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specimen", propOrder = {
    "identifier",
    "status",
    "type",
    "parent",
    "subject",
    "accessionIdentifier",
    "receivedTime",
    "collection",
    "treatment",
    "container"
})
public class Specimen
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected SpecimenStatus status;
    protected CodeableConcept type;
    protected List<Reference> parent;
    @XmlElement(required = true)
    protected Reference subject;
    protected Identifier accessionIdentifier;
    protected DateTime receivedTime;
    protected SpecimenCollection collection;
    protected List<SpecimenTreatment> treatment;
    protected List<SpecimenContainer> container;

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
     *     {@link SpecimenStatus }
     *     
     */
    public SpecimenStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecimenStatus }
     *     
     */
    public void setStatus(SpecimenStatus value) {
        this.status = value;
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
     * Gets the value of the parent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getParent() {
        if (parent == null) {
            parent = new ArrayList<Reference>();
        }
        return this.parent;
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
     * 取得 accessionIdentifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getAccessionIdentifier() {
        return accessionIdentifier;
    }

    /**
     * 設定 accessionIdentifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setAccessionIdentifier(Identifier value) {
        this.accessionIdentifier = value;
    }

    /**
     * 取得 receivedTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getReceivedTime() {
        return receivedTime;
    }

    /**
     * 設定 receivedTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setReceivedTime(DateTime value) {
        this.receivedTime = value;
    }

    /**
     * 取得 collection 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SpecimenCollection }
     *     
     */
    public SpecimenCollection getCollection() {
        return collection;
    }

    /**
     * 設定 collection 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecimenCollection }
     *     
     */
    public void setCollection(SpecimenCollection value) {
        this.collection = value;
    }

    /**
     * Gets the value of the treatment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treatment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTreatment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecimenTreatment }
     * 
     * 
     */
    public List<SpecimenTreatment> getTreatment() {
        if (treatment == null) {
            treatment = new ArrayList<SpecimenTreatment>();
        }
        return this.treatment;
    }

    /**
     * Gets the value of the container property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the container property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecimenContainer }
     * 
     * 
     */
    public List<SpecimenContainer> getContainer() {
        if (container == null) {
            container = new ArrayList<SpecimenContainer>();
        }
        return this.container;
    }

}
