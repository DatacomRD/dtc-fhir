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
 * <p>FamilyMemberHistory complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="FamilyMemberHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}FamilyHistoryStatus"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="relationship" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="gender" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="bornPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="bornDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="bornString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ageQuantity" type="{http://hl7.org/fhir}Age"/>
 *           &lt;element name="ageRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="ageString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="deceasedBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="deceasedQuantity" type="{http://hl7.org/fhir}Age"/>
 *           &lt;element name="deceasedRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="deceasedDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="deceasedString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://hl7.org/fhir}FamilyMemberHistory.Condition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyMemberHistory", propOrder = {
    "identifier",
    "patient",
    "date",
    "status",
    "name",
    "relationship",
    "gender",
    "bornPeriod",
    "bornDate",
    "bornString",
    "ageQuantity",
    "ageRange",
    "ageString",
    "deceasedBoolean",
    "deceasedQuantity",
    "deceasedRange",
    "deceasedDate",
    "deceasedString",
    "note",
    "condition"
})
public class FamilyMemberHistory
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected Reference patient;
    protected DateTime date;
    @XmlElement(required = true)
    protected FamilyHistoryStatus status;
    protected StringDt name;
    @XmlElement(required = true)
    protected CodeableConcept relationship;
    protected Code gender;
    protected Period bornPeriod;
    protected Date bornDate;
    protected StringDt bornString;
    protected Age ageQuantity;
    protected Range ageRange;
    protected StringDt ageString;
    protected BooleanDt deceasedBoolean;
    protected Age deceasedQuantity;
    protected Range deceasedRange;
    protected Date deceasedDate;
    protected StringDt deceasedString;
    protected Annotation note;
    protected List<FamilyMemberHistoryCondition> condition;

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
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link FamilyHistoryStatus }
     *     
     */
    public FamilyHistoryStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyHistoryStatus }
     *     
     */
    public void setStatus(FamilyHistoryStatus value) {
        this.status = value;
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
     * 取得 relationship 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getRelationship() {
        return relationship;
    }

    /**
     * 設定 relationship 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRelationship(CodeableConcept value) {
        this.relationship = value;
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
     * 取得 bornPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getBornPeriod() {
        return bornPeriod;
    }

    /**
     * 設定 bornPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setBornPeriod(Period value) {
        this.bornPeriod = value;
    }

    /**
     * 取得 bornDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getBornDate() {
        return bornDate;
    }

    /**
     * 設定 bornDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBornDate(Date value) {
        this.bornDate = value;
    }

    /**
     * 取得 bornString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getBornString() {
        return bornString;
    }

    /**
     * 設定 bornString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setBornString(StringDt value) {
        this.bornString = value;
    }

    /**
     * 取得 ageQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    public Age getAgeQuantity() {
        return ageQuantity;
    }

    /**
     * 設定 ageQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setAgeQuantity(Age value) {
        this.ageQuantity = value;
    }

    /**
     * 取得 ageRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getAgeRange() {
        return ageRange;
    }

    /**
     * 設定 ageRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setAgeRange(Range value) {
        this.ageRange = value;
    }

    /**
     * 取得 ageString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getAgeString() {
        return ageString;
    }

    /**
     * 設定 ageString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setAgeString(StringDt value) {
        this.ageString = value;
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
     * 取得 deceasedQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    public Age getDeceasedQuantity() {
        return deceasedQuantity;
    }

    /**
     * 設定 deceasedQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setDeceasedQuantity(Age value) {
        this.deceasedQuantity = value;
    }

    /**
     * 取得 deceasedRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getDeceasedRange() {
        return deceasedRange;
    }

    /**
     * 設定 deceasedRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setDeceasedRange(Range value) {
        this.deceasedRange = value;
    }

    /**
     * 取得 deceasedDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDeceasedDate() {
        return deceasedDate;
    }

    /**
     * 設定 deceasedDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDeceasedDate(Date value) {
        this.deceasedDate = value;
    }

    /**
     * 取得 deceasedString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDeceasedString() {
        return deceasedString;
    }

    /**
     * 設定 deceasedString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDeceasedString(StringDt value) {
        this.deceasedString = value;
    }

    /**
     * 取得 note 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getNote() {
        return note;
    }

    /**
     * 設定 note 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setNote(Annotation value) {
        this.note = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyMemberHistoryCondition }
     * 
     * 
     */
    public List<FamilyMemberHistoryCondition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<FamilyMemberHistoryCondition>();
        }
        return this.condition;
    }

}
