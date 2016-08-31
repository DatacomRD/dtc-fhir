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
 * <p>Immunization complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Immunization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="vaccineCode" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="wasNotGiven" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="reported" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="performer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="requester" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="lotNumber" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="site" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="route" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="doseQuantity" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="explanation" type="{http://hl7.org/fhir}Immunization.Explanation" minOccurs="0"/>
 *         &lt;element name="reaction" type="{http://hl7.org/fhir}Immunization.Reaction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vaccinationProtocol" type="{http://hl7.org/fhir}Immunization.VaccinationProtocol" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Immunization", propOrder = {
    "identifier",
    "status",
    "date",
    "vaccineCode",
    "patient",
    "wasNotGiven",
    "reported",
    "performer",
    "requester",
    "encounter",
    "manufacturer",
    "location",
    "lotNumber",
    "expirationDate",
    "site",
    "route",
    "doseQuantity",
    "note",
    "explanation",
    "reaction",
    "vaccinationProtocol"
})
public class Immunization
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected Code status;
    protected DateTime date;
    @XmlElement(required = true)
    protected CodeableConcept vaccineCode;
    @XmlElement(required = true)
    protected Reference patient;
    @XmlElement(required = true)
    protected BooleanDt wasNotGiven;
    @XmlElement(required = true)
    protected BooleanDt reported;
    protected Reference performer;
    protected Reference requester;
    protected Reference encounter;
    protected Reference manufacturer;
    protected Reference location;
    protected StringDt lotNumber;
    protected Date expirationDate;
    protected CodeableConcept site;
    protected CodeableConcept route;
    protected SimpleQuantity doseQuantity;
    protected List<Annotation> note;
    protected ImmunizationExplanation explanation;
    protected List<ImmunizationReaction> reaction;
    protected List<ImmunizationVaccinationProtocol> vaccinationProtocol;

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
     * 取得 vaccineCode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getVaccineCode() {
        return vaccineCode;
    }

    /**
     * 設定 vaccineCode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setVaccineCode(CodeableConcept value) {
        this.vaccineCode = value;
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
     * 取得 wasNotGiven 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getWasNotGiven() {
        return wasNotGiven;
    }

    /**
     * 設定 wasNotGiven 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setWasNotGiven(BooleanDt value) {
        this.wasNotGiven = value;
    }

    /**
     * 取得 reported 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getReported() {
        return reported;
    }

    /**
     * 設定 reported 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setReported(BooleanDt value) {
        this.reported = value;
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
     * 取得 requester 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRequester() {
        return requester;
    }

    /**
     * 設定 requester 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRequester(Reference value) {
        this.requester = value;
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
     * 取得 manufacturer 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getManufacturer() {
        return manufacturer;
    }

    /**
     * 設定 manufacturer 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setManufacturer(Reference value) {
        this.manufacturer = value;
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
     * 取得 expirationDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * 設定 expirationDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExpirationDate(Date value) {
        this.expirationDate = value;
    }

    /**
     * 取得 site 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSite() {
        return site;
    }

    /**
     * 設定 site 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSite(CodeableConcept value) {
        this.site = value;
    }

    /**
     * 取得 route 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getRoute() {
        return route;
    }

    /**
     * 設定 route 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRoute(CodeableConcept value) {
        this.route = value;
    }

    /**
     * 取得 doseQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * 設定 doseQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setDoseQuantity(SimpleQuantity value) {
        this.doseQuantity = value;
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
     * 取得 explanation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ImmunizationExplanation }
     *     
     */
    public ImmunizationExplanation getExplanation() {
        return explanation;
    }

    /**
     * 設定 explanation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmunizationExplanation }
     *     
     */
    public void setExplanation(ImmunizationExplanation value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the reaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationReaction }
     * 
     * 
     */
    public List<ImmunizationReaction> getReaction() {
        if (reaction == null) {
            reaction = new ArrayList<ImmunizationReaction>();
        }
        return this.reaction;
    }

    /**
     * Gets the value of the vaccinationProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vaccinationProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVaccinationProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationVaccinationProtocol }
     * 
     * 
     */
    public List<ImmunizationVaccinationProtocol> getVaccinationProtocol() {
        if (vaccinationProtocol == null) {
            vaccinationProtocol = new ArrayList<ImmunizationVaccinationProtocol>();
        }
        return this.vaccinationProtocol;
    }

}
