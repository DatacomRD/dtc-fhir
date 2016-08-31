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
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
 * 
 * <p>Immunization.VaccinationProtocol complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Immunization.VaccinationProtocol">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="doseSequence" type="{http://hl7.org/fhir}positiveInt"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="authority" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="series" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="seriesDoses" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="targetDisease" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded"/>
 *         &lt;element name="doseStatus" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="doseStatusReason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Immunization.VaccinationProtocol", propOrder = {
    "doseSequence",
    "description",
    "authority",
    "series",
    "seriesDoses",
    "targetDisease",
    "doseStatus",
    "doseStatusReason"
})
public class ImmunizationVaccinationProtocol
    extends BackboneElement
{

    @XmlElement(required = true)
    protected PositiveInt doseSequence;
    protected StringDt description;
    protected Reference authority;
    protected StringDt series;
    protected PositiveInt seriesDoses;
    @XmlElement(required = true)
    protected List<CodeableConcept> targetDisease;
    @XmlElement(required = true)
    protected CodeableConcept doseStatus;
    protected CodeableConcept doseStatusReason;

    /**
     * 取得 doseSequence 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getDoseSequence() {
        return doseSequence;
    }

    /**
     * 設定 doseSequence 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setDoseSequence(PositiveInt value) {
        this.doseSequence = value;
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
     * 取得 authority 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getAuthority() {
        return authority;
    }

    /**
     * 設定 authority 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setAuthority(Reference value) {
        this.authority = value;
    }

    /**
     * 取得 series 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getSeries() {
        return series;
    }

    /**
     * 設定 series 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setSeries(StringDt value) {
        this.series = value;
    }

    /**
     * 取得 seriesDoses 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getSeriesDoses() {
        return seriesDoses;
    }

    /**
     * 設定 seriesDoses 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setSeriesDoses(PositiveInt value) {
        this.seriesDoses = value;
    }

    /**
     * Gets the value of the targetDisease property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetDisease property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetDisease().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getTargetDisease() {
        if (targetDisease == null) {
            targetDisease = new ArrayList<CodeableConcept>();
        }
        return this.targetDisease;
    }

    /**
     * 取得 doseStatus 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDoseStatus() {
        return doseStatus;
    }

    /**
     * 設定 doseStatus 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDoseStatus(CodeableConcept value) {
        this.doseStatus = value;
    }

    /**
     * 取得 doseStatusReason 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDoseStatusReason() {
        return doseStatusReason;
    }

    /**
     * 設定 doseStatusReason 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDoseStatusReason(CodeableConcept value) {
        this.doseStatusReason = value;
    }

}
