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
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * 
 * <p>NutritionOrder.EnteralFormula complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="NutritionOrder.EnteralFormula">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="baseFormulaType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="baseFormulaProductName" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="additiveType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="additiveProductName" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="caloricDensity" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="routeofAdministration" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="administration" type="{http://hl7.org/fhir}NutritionOrder.Administration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxVolumeToDeliver" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="administrationInstruction" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutritionOrder.EnteralFormula", propOrder = {
    "baseFormulaType",
    "baseFormulaProductName",
    "additiveType",
    "additiveProductName",
    "caloricDensity",
    "routeofAdministration",
    "administration",
    "maxVolumeToDeliver",
    "administrationInstruction"
})
public class NutritionOrderEnteralFormula
    extends BackboneElement
{

    protected CodeableConcept baseFormulaType;
    protected StringDt baseFormulaProductName;
    protected CodeableConcept additiveType;
    protected StringDt additiveProductName;
    protected SimpleQuantity caloricDensity;
    protected CodeableConcept routeofAdministration;
    protected List<NutritionOrderAdministration> administration;
    protected SimpleQuantity maxVolumeToDeliver;
    protected StringDt administrationInstruction;

    /**
     * 取得 baseFormulaType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getBaseFormulaType() {
        return baseFormulaType;
    }

    /**
     * 設定 baseFormulaType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setBaseFormulaType(CodeableConcept value) {
        this.baseFormulaType = value;
    }

    /**
     * 取得 baseFormulaProductName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getBaseFormulaProductName() {
        return baseFormulaProductName;
    }

    /**
     * 設定 baseFormulaProductName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setBaseFormulaProductName(StringDt value) {
        this.baseFormulaProductName = value;
    }

    /**
     * 取得 additiveType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getAdditiveType() {
        return additiveType;
    }

    /**
     * 設定 additiveType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAdditiveType(CodeableConcept value) {
        this.additiveType = value;
    }

    /**
     * 取得 additiveProductName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getAdditiveProductName() {
        return additiveProductName;
    }

    /**
     * 設定 additiveProductName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setAdditiveProductName(StringDt value) {
        this.additiveProductName = value;
    }

    /**
     * 取得 caloricDensity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getCaloricDensity() {
        return caloricDensity;
    }

    /**
     * 設定 caloricDensity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setCaloricDensity(SimpleQuantity value) {
        this.caloricDensity = value;
    }

    /**
     * 取得 routeofAdministration 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getRouteofAdministration() {
        return routeofAdministration;
    }

    /**
     * 設定 routeofAdministration 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRouteofAdministration(CodeableConcept value) {
        this.routeofAdministration = value;
    }

    /**
     * Gets the value of the administration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionOrderAdministration }
     * 
     * 
     */
    public List<NutritionOrderAdministration> getAdministration() {
        if (administration == null) {
            administration = new ArrayList<NutritionOrderAdministration>();
        }
        return this.administration;
    }

    /**
     * 取得 maxVolumeToDeliver 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getMaxVolumeToDeliver() {
        return maxVolumeToDeliver;
    }

    /**
     * 設定 maxVolumeToDeliver 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setMaxVolumeToDeliver(SimpleQuantity value) {
        this.maxVolumeToDeliver = value;
    }

    /**
     * 取得 administrationInstruction 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getAdministrationInstruction() {
        return administrationInstruction;
    }

    /**
     * 設定 administrationInstruction 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setAdministrationInstruction(StringDt value) {
        this.administrationInstruction = value;
    }

}
