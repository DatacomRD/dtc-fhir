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
 * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification.
 * 
 * <p>ImmunizationRecommendation.Recommendation complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ImmunizationRecommendation.Recommendation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;element name="vaccineCode" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="doseNumber" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="forecastStatus" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="dateCriterion" type="{http://hl7.org/fhir}ImmunizationRecommendation.DateCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://hl7.org/fhir}ImmunizationRecommendation.Protocol" minOccurs="0"/>
 *         &lt;element name="supportingImmunization" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supportingPatientInformation" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmunizationRecommendation.Recommendation", propOrder = {
    "date",
    "vaccineCode",
    "doseNumber",
    "forecastStatus",
    "dateCriterion",
    "protocol",
    "supportingImmunization",
    "supportingPatientInformation"
})
public class ImmunizationRecommendationRecommendation
    extends BackboneElement
{

    @XmlElement(required = true)
    protected DateTime date;
    @XmlElement(required = true)
    protected CodeableConcept vaccineCode;
    protected PositiveInt doseNumber;
    @XmlElement(required = true)
    protected CodeableConcept forecastStatus;
    protected List<ImmunizationRecommendationDateCriterion> dateCriterion;
    protected ImmunizationRecommendationProtocol protocol;
    protected List<Reference> supportingImmunization;
    protected List<Reference> supportingPatientInformation;

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
     * 取得 doseNumber 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getDoseNumber() {
        return doseNumber;
    }

    /**
     * 設定 doseNumber 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setDoseNumber(PositiveInt value) {
        this.doseNumber = value;
    }

    /**
     * 取得 forecastStatus 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getForecastStatus() {
        return forecastStatus;
    }

    /**
     * 設定 forecastStatus 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setForecastStatus(CodeableConcept value) {
        this.forecastStatus = value;
    }

    /**
     * Gets the value of the dateCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationRecommendationDateCriterion }
     * 
     * 
     */
    public List<ImmunizationRecommendationDateCriterion> getDateCriterion() {
        if (dateCriterion == null) {
            dateCriterion = new ArrayList<ImmunizationRecommendationDateCriterion>();
        }
        return this.dateCriterion;
    }

    /**
     * 取得 protocol 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ImmunizationRecommendationProtocol }
     *     
     */
    public ImmunizationRecommendationProtocol getProtocol() {
        return protocol;
    }

    /**
     * 設定 protocol 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmunizationRecommendationProtocol }
     *     
     */
    public void setProtocol(ImmunizationRecommendationProtocol value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the supportingImmunization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingImmunization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingImmunization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSupportingImmunization() {
        if (supportingImmunization == null) {
            supportingImmunization = new ArrayList<Reference>();
        }
        return this.supportingImmunization;
    }

    /**
     * Gets the value of the supportingPatientInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingPatientInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingPatientInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSupportingPatientInformation() {
        if (supportingPatientInformation == null) {
            supportingPatientInformation = new ArrayList<Reference>();
        }
        return this.supportingPatientInformation;
    }

}
