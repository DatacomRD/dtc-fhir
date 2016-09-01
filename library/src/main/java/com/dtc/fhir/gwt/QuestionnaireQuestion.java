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
 * A structured set of questions intended to guide the collection of answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 * 
 * <p>Questionnaire.Question complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Questionnaire.Question">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="linkId" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="concept" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="text" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}AnswerFormat" minOccurs="0"/>
 *         &lt;element name="required" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="repeats" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="options" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="option" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="group" type="{http://hl7.org/fhir}Questionnaire.Group" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Questionnaire.Question", propOrder = {
    "linkId",
    "concept",
    "text",
    "type",
    "required",
    "repeats",
    "options",
    "option",
    "group"
})
public class QuestionnaireQuestion
    extends BackboneElement
{

    protected StringDt linkId;
    protected List<Coding> concept;
    protected StringDt text;
    protected AnswerFormat type;
    protected BooleanDt required;
    protected BooleanDt repeats;
    protected Reference options;
    protected List<Coding> option;
    protected List<QuestionnaireGroup> group;

    /**
     * 取得 linkId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getLinkId() {
        return linkId;
    }

    /**
     * 設定 linkId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setLinkId(StringDt value) {
        this.linkId = value;
    }

    /**
     * Gets the value of the concept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getConcept() {
        if (concept == null) {
            concept = new ArrayList<Coding>();
        }
        return this.concept;
    }

    /**
     * 取得 text 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getText() {
        return text;
    }

    /**
     * 設定 text 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setText(StringDt value) {
        this.text = value;
    }

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link AnswerFormat }
     *     
     */
    public AnswerFormat getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerFormat }
     *     
     */
    public void setType(AnswerFormat value) {
        this.type = value;
    }

    /**
     * 取得 required 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getRequired() {
        return required;
    }

    /**
     * 設定 required 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setRequired(BooleanDt value) {
        this.required = value;
    }

    /**
     * 取得 repeats 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getRepeats() {
        return repeats;
    }

    /**
     * 設定 repeats 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setRepeats(BooleanDt value) {
        this.repeats = value;
    }

    /**
     * 取得 options 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOptions() {
        return options;
    }

    /**
     * 設定 options 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOptions(Reference value) {
        this.options = value;
    }

    /**
     * Gets the value of the option property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getOption() {
        if (option == null) {
            option = new ArrayList<Coding>();
        }
        return this.option;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionnaireGroup }
     * 
     * 
     */
    public List<QuestionnaireGroup> getGroup() {
        if (group == null) {
            group = new ArrayList<QuestionnaireGroup>();
        }
        return this.group;
    }

}
