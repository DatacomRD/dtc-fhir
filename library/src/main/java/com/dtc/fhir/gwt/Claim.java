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
 * <p>Claim complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Claim">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}ClaimType"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ruleset" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="originalRuleset" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="created" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="target" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="provider" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="use" type="{http://hl7.org/fhir}Use" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="fundsReserve" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="enterer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="facility" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="prescription" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="originalPrescription" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="payee" type="{http://hl7.org/fhir}Claim.Payee" minOccurs="0"/>
 *         &lt;element name="referral" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="diagnosis" type="{http://hl7.org/fhir}Claim.Diagnosis" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="coverage" type="{http://hl7.org/fhir}Claim.Coverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exception" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="school" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="accident" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="accidentType" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="interventionException" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="item" type="{http://hl7.org/fhir}Claim.Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalMaterials" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="missingTeeth" type="{http://hl7.org/fhir}Claim.MissingTeeth" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Claim", propOrder = {
    "type",
    "identifier",
    "ruleset",
    "originalRuleset",
    "created",
    "target",
    "provider",
    "organization",
    "use",
    "priority",
    "fundsReserve",
    "enterer",
    "facility",
    "prescription",
    "originalPrescription",
    "payee",
    "referral",
    "diagnosis",
    "condition",
    "patient",
    "coverage",
    "exception",
    "school",
    "accident",
    "accidentType",
    "interventionException",
    "item",
    "additionalMaterials",
    "missingTeeth"
})
public class Claim
    extends DomainResource
{

    @XmlElement(required = true)
    protected ClaimType type;
    protected List<Identifier> identifier;
    protected Coding ruleset;
    protected Coding originalRuleset;
    protected DateTime created;
    protected Reference target;
    protected Reference provider;
    protected Reference organization;
    protected Use use;
    protected Coding priority;
    protected Coding fundsReserve;
    protected Reference enterer;
    protected Reference facility;
    protected Reference prescription;
    protected Reference originalPrescription;
    protected ClaimPayee payee;
    protected Reference referral;
    protected List<ClaimDiagnosis> diagnosis;
    protected List<Coding> condition;
    @XmlElement(required = true)
    protected Reference patient;
    protected List<ClaimCoverage> coverage;
    protected List<Coding> exception;
    protected StringDt school;
    protected Date accident;
    protected Coding accidentType;
    protected List<Coding> interventionException;
    protected List<ClaimItem> item;
    protected List<Coding> additionalMaterials;
    protected List<ClaimMissingTeeth> missingTeeth;

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ClaimType }
     *     
     */
    public ClaimType getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimType }
     *     
     */
    public void setType(ClaimType value) {
        this.type = value;
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
     * 取得 ruleset 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getRuleset() {
        return ruleset;
    }

    /**
     * 設定 ruleset 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setRuleset(Coding value) {
        this.ruleset = value;
    }

    /**
     * 取得 originalRuleset 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getOriginalRuleset() {
        return originalRuleset;
    }

    /**
     * 設定 originalRuleset 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setOriginalRuleset(Coding value) {
        this.originalRuleset = value;
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
     * 取得 target 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getTarget() {
        return target;
    }

    /**
     * 設定 target 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setTarget(Reference value) {
        this.target = value;
    }

    /**
     * 取得 provider 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getProvider() {
        return provider;
    }

    /**
     * 設定 provider 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setProvider(Reference value) {
        this.provider = value;
    }

    /**
     * 取得 organization 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOrganization() {
        return organization;
    }

    /**
     * 設定 organization 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOrganization(Reference value) {
        this.organization = value;
    }

    /**
     * 取得 use 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Use }
     *     
     */
    public Use getUse() {
        return use;
    }

    /**
     * 設定 use 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Use }
     *     
     */
    public void setUse(Use value) {
        this.use = value;
    }

    /**
     * 取得 priority 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getPriority() {
        return priority;
    }

    /**
     * 設定 priority 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setPriority(Coding value) {
        this.priority = value;
    }

    /**
     * 取得 fundsReserve 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getFundsReserve() {
        return fundsReserve;
    }

    /**
     * 設定 fundsReserve 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setFundsReserve(Coding value) {
        this.fundsReserve = value;
    }

    /**
     * 取得 enterer 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getEnterer() {
        return enterer;
    }

    /**
     * 設定 enterer 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setEnterer(Reference value) {
        this.enterer = value;
    }

    /**
     * 取得 facility 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getFacility() {
        return facility;
    }

    /**
     * 設定 facility 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setFacility(Reference value) {
        this.facility = value;
    }

    /**
     * 取得 prescription 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPrescription() {
        return prescription;
    }

    /**
     * 設定 prescription 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPrescription(Reference value) {
        this.prescription = value;
    }

    /**
     * 取得 originalPrescription 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOriginalPrescription() {
        return originalPrescription;
    }

    /**
     * 設定 originalPrescription 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOriginalPrescription(Reference value) {
        this.originalPrescription = value;
    }

    /**
     * 取得 payee 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ClaimPayee }
     *     
     */
    public ClaimPayee getPayee() {
        return payee;
    }

    /**
     * 設定 payee 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimPayee }
     *     
     */
    public void setPayee(ClaimPayee value) {
        this.payee = value;
    }

    /**
     * 取得 referral 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReferral() {
        return referral;
    }

    /**
     * 設定 referral 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReferral(Reference value) {
        this.referral = value;
    }

    /**
     * Gets the value of the diagnosis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimDiagnosis }
     * 
     * 
     */
    public List<ClaimDiagnosis> getDiagnosis() {
        if (diagnosis == null) {
            diagnosis = new ArrayList<ClaimDiagnosis>();
        }
        return this.diagnosis;
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
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getCondition() {
        if (condition == null) {
            condition = new ArrayList<Coding>();
        }
        return this.condition;
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
     * Gets the value of the coverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimCoverage }
     * 
     * 
     */
    public List<ClaimCoverage> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<ClaimCoverage>();
        }
        return this.coverage;
    }

    /**
     * Gets the value of the exception property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exception property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getException() {
        if (exception == null) {
            exception = new ArrayList<Coding>();
        }
        return this.exception;
    }

    /**
     * 取得 school 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getSchool() {
        return school;
    }

    /**
     * 設定 school 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setSchool(StringDt value) {
        this.school = value;
    }

    /**
     * 取得 accident 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getAccident() {
        return accident;
    }

    /**
     * 設定 accident 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setAccident(Date value) {
        this.accident = value;
    }

    /**
     * 取得 accidentType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getAccidentType() {
        return accidentType;
    }

    /**
     * 設定 accidentType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setAccidentType(Coding value) {
        this.accidentType = value;
    }

    /**
     * Gets the value of the interventionException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interventionException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterventionException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getInterventionException() {
        if (interventionException == null) {
            interventionException = new ArrayList<Coding>();
        }
        return this.interventionException;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimItem }
     * 
     * 
     */
    public List<ClaimItem> getItem() {
        if (item == null) {
            item = new ArrayList<ClaimItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the additionalMaterials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalMaterials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalMaterials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getAdditionalMaterials() {
        if (additionalMaterials == null) {
            additionalMaterials = new ArrayList<Coding>();
        }
        return this.additionalMaterials;
    }

    /**
     * Gets the value of the missingTeeth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missingTeeth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissingTeeth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimMissingTeeth }
     * 
     * 
     */
    public List<ClaimMissingTeeth> getMissingTeeth() {
        if (missingTeeth == null) {
            missingTeeth = new ArrayList<ClaimMissingTeeth>();
        }
        return this.missingTeeth;
    }

}
