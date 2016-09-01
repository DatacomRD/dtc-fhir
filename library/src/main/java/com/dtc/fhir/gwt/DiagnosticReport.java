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
 * <p>DiagnosticReport complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}DiagnosticReportStatus"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="effectiveDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="effectivePeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;element name="issued" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="performer" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="request" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specimen" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="result" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="imagingStudy" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="image" type="{http://hl7.org/fhir}DiagnosticReport.Image" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conclusion" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="codedDiagnosis" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="presentedForm" type="{http://hl7.org/fhir}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticReport", propOrder = {
    "identifier",
    "status",
    "category",
    "code",
    "subject",
    "encounter",
    "effectiveDateTime",
    "effectivePeriod",
    "issued",
    "performer",
    "request",
    "specimen",
    "result",
    "imagingStudy",
    "image",
    "conclusion",
    "codedDiagnosis",
    "presentedForm"
})
public class DiagnosticReport
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected DiagnosticReportStatus status;
    protected CodeableConcept category;
    @XmlElement(required = true)
    protected CodeableConcept code;
    @XmlElement(required = true)
    protected Reference subject;
    protected Reference encounter;
    protected DateTime effectiveDateTime;
    protected Period effectivePeriod;
    @XmlElement(required = true)
    protected Instant issued;
    @XmlElement(required = true)
    protected Reference performer;
    protected List<Reference> request;
    protected List<Reference> specimen;
    protected List<Reference> result;
    protected List<Reference> imagingStudy;
    protected List<DiagnosticReportImage> image;
    protected StringDt conclusion;
    protected List<CodeableConcept> codedDiagnosis;
    protected List<Attachment> presentedForm;

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
     *     {@link DiagnosticReportStatus }
     *     
     */
    public DiagnosticReportStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticReportStatus }
     *     
     */
    public void setStatus(DiagnosticReportStatus value) {
        this.status = value;
    }

    /**
     * 取得 category 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * 設定 category 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCategory(CodeableConcept value) {
        this.category = value;
    }

    /**
     * 取得 code 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * 設定 code 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
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
     * 取得 effectiveDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * 設定 effectiveDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEffectiveDateTime(DateTime value) {
        this.effectiveDateTime = value;
    }

    /**
     * 取得 effectivePeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * 設定 effectivePeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setEffectivePeriod(Period value) {
        this.effectivePeriod = value;
    }

    /**
     * 取得 issued 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getIssued() {
        return issued;
    }

    /**
     * 設定 issued 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setIssued(Instant value) {
        this.issued = value;
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
     * Gets the value of the request property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the request property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getRequest() {
        if (request == null) {
            request = new ArrayList<Reference>();
        }
        return this.request;
    }

    /**
     * Gets the value of the specimen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specimen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecimen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSpecimen() {
        if (specimen == null) {
            specimen = new ArrayList<Reference>();
        }
        return this.specimen;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getResult() {
        if (result == null) {
            result = new ArrayList<Reference>();
        }
        return this.result;
    }

    /**
     * Gets the value of the imagingStudy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagingStudy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagingStudy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getImagingStudy() {
        if (imagingStudy == null) {
            imagingStudy = new ArrayList<Reference>();
        }
        return this.imagingStudy;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticReportImage }
     * 
     * 
     */
    public List<DiagnosticReportImage> getImage() {
        if (image == null) {
            image = new ArrayList<DiagnosticReportImage>();
        }
        return this.image;
    }

    /**
     * 取得 conclusion 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getConclusion() {
        return conclusion;
    }

    /**
     * 設定 conclusion 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setConclusion(StringDt value) {
        this.conclusion = value;
    }

    /**
     * Gets the value of the codedDiagnosis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codedDiagnosis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodedDiagnosis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getCodedDiagnosis() {
        if (codedDiagnosis == null) {
            codedDiagnosis = new ArrayList<CodeableConcept>();
        }
        return this.codedDiagnosis;
    }

    /**
     * Gets the value of the presentedForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentedForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentedForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getPresentedForm() {
        if (presentedForm == null) {
            presentedForm = new ArrayList<Attachment>();
        }
        return this.presentedForm;
    }

}
