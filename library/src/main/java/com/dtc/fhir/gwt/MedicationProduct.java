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
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 * 
 * <p>Medication.Product complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Medication.Product">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="form" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="ingredient" type="{http://hl7.org/fhir}Medication.Ingredient" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="batch" type="{http://hl7.org/fhir}Medication.Batch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Medication.Product", propOrder = {
    "form",
    "ingredient",
    "batch"
})
public class MedicationProduct
    extends BackboneElement
{

    protected CodeableConcept form;
    protected List<MedicationIngredient> ingredient;
    protected List<MedicationBatch> batch;

    /**
     * 取得 form 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getForm() {
        return form;
    }

    /**
     * 設定 form 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setForm(CodeableConcept value) {
        this.form = value;
    }

    /**
     * Gets the value of the ingredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationIngredient }
     * 
     * 
     */
    public List<MedicationIngredient> getIngredient() {
        if (ingredient == null) {
            ingredient = new ArrayList<MedicationIngredient>();
        }
        return this.ingredient;
    }

    /**
     * Gets the value of the batch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationBatch }
     * 
     * 
     */
    public List<MedicationBatch> getBatch() {
        if (batch == null) {
            batch = new ArrayList<MedicationBatch>();
        }
        return this.batch;
    }

}
