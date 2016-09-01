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
 * <p>NutritionOrder.OralDiet complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="NutritionOrder.OralDiet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="schedule" type="{http://hl7.org/fhir}Timing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nutrient" type="{http://hl7.org/fhir}NutritionOrder.Nutrient" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="texture" type="{http://hl7.org/fhir}NutritionOrder.Texture" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fluidConsistencyType" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instruction" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutritionOrder.OralDiet", propOrder = {
    "type",
    "schedule",
    "nutrient",
    "texture",
    "fluidConsistencyType",
    "instruction"
})
public class NutritionOrderOralDiet
    extends BackboneElement
{

    protected List<CodeableConcept> type;
    protected List<Timing> schedule;
    protected List<NutritionOrderNutrient> nutrient;
    protected List<NutritionOrderTexture> texture;
    protected List<CodeableConcept> fluidConsistencyType;
    protected StringDt instruction;

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getType() {
        if (type == null) {
            type = new ArrayList<CodeableConcept>();
        }
        return this.type;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Timing }
     * 
     * 
     */
    public List<Timing> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<Timing>();
        }
        return this.schedule;
    }

    /**
     * Gets the value of the nutrient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutrient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutrient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionOrderNutrient }
     * 
     * 
     */
    public List<NutritionOrderNutrient> getNutrient() {
        if (nutrient == null) {
            nutrient = new ArrayList<NutritionOrderNutrient>();
        }
        return this.nutrient;
    }

    /**
     * Gets the value of the texture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the texture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTexture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionOrderTexture }
     * 
     * 
     */
    public List<NutritionOrderTexture> getTexture() {
        if (texture == null) {
            texture = new ArrayList<NutritionOrderTexture>();
        }
        return this.texture;
    }

    /**
     * Gets the value of the fluidConsistencyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fluidConsistencyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFluidConsistencyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getFluidConsistencyType() {
        if (fluidConsistencyType == null) {
            fluidConsistencyType = new ArrayList<CodeableConcept>();
        }
        return this.fluidConsistencyType;
    }

    /**
     * 取得 instruction 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getInstruction() {
        return instruction;
    }

    /**
     * 設定 instruction 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setInstruction(StringDt value) {
        this.instruction = value;
    }

}
