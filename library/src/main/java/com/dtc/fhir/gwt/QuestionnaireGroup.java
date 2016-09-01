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
 * <p>Questionnaire.Group complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Questionnaire.Group">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="linkId" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="concept" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="text" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="required" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="repeats" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="group" type="{http://hl7.org/fhir}Questionnaire.Group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="question" type="{http://hl7.org/fhir}Questionnaire.Question" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Questionnaire.Group", propOrder = {
    "linkId",
    "title",
    "concept",
    "text",
    "required",
    "repeats",
    "group",
    "question"
})
public class QuestionnaireGroup
    extends BackboneElement
{

    protected StringDt linkId;
    protected StringDt title;
    protected List<Coding> concept;
    protected StringDt text;
    protected BooleanDt required;
    protected BooleanDt repeats;
    protected List<QuestionnaireGroup> group;
    protected List<QuestionnaireQuestion> question;

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
     * 取得 title 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getTitle() {
        return title;
    }

    /**
     * 設定 title 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setTitle(StringDt value) {
        this.title = value;
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

    /**
     * Gets the value of the question property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the question property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionnaireQuestion }
     * 
     * 
     */
    public List<QuestionnaireQuestion> getQuestion() {
        if (question == null) {
            question = new ArrayList<QuestionnaireQuestion>();
        }
        return this.question;
    }

}
