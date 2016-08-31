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
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Contract complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Contract">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="issued" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="applies" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="authority" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="subType" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="action" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="actionReason" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="actor" type="{http://hl7.org/fhir}Contract.Actor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valuedItem" type="{http://hl7.org/fhir}Contract.ValuedItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signer" type="{http://hl7.org/fhir}Contract.Signer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="term" type="{http://hl7.org/fhir}Contract.Term" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="bindingAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="bindingReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="friendly" type="{http://hl7.org/fhir}Contract.Friendly" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="legal" type="{http://hl7.org/fhir}Contract.Legal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rule" type="{http://hl7.org/fhir}Contract.Rule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract", propOrder = {
    "identifier",
    "issued",
    "applies",
    "subject",
    "authority",
    "domain",
    "type",
    "subType",
    "action",
    "actionReason",
    "actor",
    "valuedItem",
    "signer",
    "term",
    "bindingAttachment",
    "bindingReference",
    "friendly",
    "legal",
    "rule"
})
public class Contract
    extends DomainResource
{

    protected Identifier identifier;
    protected DateTime issued;
    protected Period applies;
    protected List<Reference> subject;
    protected List<Reference> authority;
    protected List<Reference> domain;
    protected CodeableConcept type;
    protected List<CodeableConcept> subType;
    protected List<CodeableConcept> action;
    protected List<CodeableConcept> actionReason;
    protected List<ContractActor> actor;
    protected List<ContractValuedItem> valuedItem;
    protected List<ContractSigner> signer;
    protected List<ContractTerm> term;
    protected Attachment bindingAttachment;
    protected Reference bindingReference;
    protected List<ContractFriendly> friendly;
    protected List<ContractLegal> legal;
    protected List<ContractRule> rule;

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
     * 取得 issued 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getIssued() {
        return issued;
    }

    /**
     * 設定 issued 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setIssued(DateTime value) {
        this.issued = value;
    }

    /**
     * 取得 applies 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getApplies() {
        return applies;
    }

    /**
     * 設定 applies 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setApplies(Period value) {
        this.applies = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSubject() {
        if (subject == null) {
            subject = new ArrayList<Reference>();
        }
        return this.subject;
    }

    /**
     * Gets the value of the authority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getAuthority() {
        if (authority == null) {
            authority = new ArrayList<Reference>();
        }
        return this.authority;
    }

    /**
     * Gets the value of the domain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getDomain() {
        if (domain == null) {
            domain = new ArrayList<Reference>();
        }
        return this.domain;
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
     * Gets the value of the subType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSubType() {
        if (subType == null) {
            subType = new ArrayList<CodeableConcept>();
        }
        return this.subType;
    }

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getAction() {
        if (action == null) {
            action = new ArrayList<CodeableConcept>();
        }
        return this.action;
    }

    /**
     * Gets the value of the actionReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getActionReason() {
        if (actionReason == null) {
            actionReason = new ArrayList<CodeableConcept>();
        }
        return this.actionReason;
    }

    /**
     * Gets the value of the actor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractActor }
     * 
     * 
     */
    public List<ContractActor> getActor() {
        if (actor == null) {
            actor = new ArrayList<ContractActor>();
        }
        return this.actor;
    }

    /**
     * Gets the value of the valuedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValuedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractValuedItem }
     * 
     * 
     */
    public List<ContractValuedItem> getValuedItem() {
        if (valuedItem == null) {
            valuedItem = new ArrayList<ContractValuedItem>();
        }
        return this.valuedItem;
    }

    /**
     * Gets the value of the signer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSigner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractSigner }
     * 
     * 
     */
    public List<ContractSigner> getSigner() {
        if (signer == null) {
            signer = new ArrayList<ContractSigner>();
        }
        return this.signer;
    }

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractTerm }
     * 
     * 
     */
    public List<ContractTerm> getTerm() {
        if (term == null) {
            term = new ArrayList<ContractTerm>();
        }
        return this.term;
    }

    /**
     * 取得 bindingAttachment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getBindingAttachment() {
        return bindingAttachment;
    }

    /**
     * 設定 bindingAttachment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setBindingAttachment(Attachment value) {
        this.bindingAttachment = value;
    }

    /**
     * 取得 bindingReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getBindingReference() {
        return bindingReference;
    }

    /**
     * 設定 bindingReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setBindingReference(Reference value) {
        this.bindingReference = value;
    }

    /**
     * Gets the value of the friendly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the friendly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFriendly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractFriendly }
     * 
     * 
     */
    public List<ContractFriendly> getFriendly() {
        if (friendly == null) {
            friendly = new ArrayList<ContractFriendly>();
        }
        return this.friendly;
    }

    /**
     * Gets the value of the legal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractLegal }
     * 
     * 
     */
    public List<ContractLegal> getLegal() {
        if (legal == null) {
            legal = new ArrayList<ContractLegal>();
        }
        return this.legal;
    }

    /**
     * Gets the value of the rule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractRule }
     * 
     * 
     */
    public List<ContractRule> getRule() {
        if (rule == null) {
            rule = new ArrayList<ContractRule>();
        }
        return this.rule;
    }

}
