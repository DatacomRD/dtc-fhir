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
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 * 
 * <p>AllergyIntolerance.Reaction complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="AllergyIntolerance.Reaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="substance" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="certainty" type="{http://hl7.org/fhir}AllergyIntoleranceCertainty" minOccurs="0"/>
 *         &lt;element name="manifestation" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="onset" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://hl7.org/fhir}AllergyIntoleranceSeverity" minOccurs="0"/>
 *         &lt;element name="exposureRoute" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllergyIntolerance.Reaction", propOrder = {
    "substance",
    "certainty",
    "manifestation",
    "description",
    "onset",
    "severity",
    "exposureRoute",
    "note"
})
public class AllergyIntoleranceReaction
    extends BackboneElement
{

    protected CodeableConcept substance;
    protected AllergyIntoleranceCertainty certainty;
    @XmlElement(required = true)
    protected List<CodeableConcept> manifestation;
    protected StringDt description;
    protected DateTime onset;
    protected AllergyIntoleranceSeverity severity;
    protected CodeableConcept exposureRoute;
    protected Annotation note;

    /**
     * 取得 substance 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSubstance() {
        return substance;
    }

    /**
     * 設定 substance 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSubstance(CodeableConcept value) {
        this.substance = value;
    }

    /**
     * 取得 certainty 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AllergyIntoleranceCertainty }
     *     
     */
    public AllergyIntoleranceCertainty getCertainty() {
        return certainty;
    }

    /**
     * 設定 certainty 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AllergyIntoleranceCertainty }
     *     
     */
    public void setCertainty(AllergyIntoleranceCertainty value) {
        this.certainty = value;
    }

    /**
     * Gets the value of the manifestation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manifestation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManifestation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getManifestation() {
        if (manifestation == null) {
            manifestation = new ArrayList<CodeableConcept>();
        }
        return this.manifestation;
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
     * 取得 onset 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getOnset() {
        return onset;
    }

    /**
     * 設定 onset 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setOnset(DateTime value) {
        this.onset = value;
    }

    /**
     * 取得 severity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AllergyIntoleranceSeverity }
     *     
     */
    public AllergyIntoleranceSeverity getSeverity() {
        return severity;
    }

    /**
     * 設定 severity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AllergyIntoleranceSeverity }
     *     
     */
    public void setSeverity(AllergyIntoleranceSeverity value) {
        this.severity = value;
    }

    /**
     * 取得 exposureRoute 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getExposureRoute() {
        return exposureRoute;
    }

    /**
     * 設定 exposureRoute 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setExposureRoute(CodeableConcept value) {
        this.exposureRoute = value;
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

}
