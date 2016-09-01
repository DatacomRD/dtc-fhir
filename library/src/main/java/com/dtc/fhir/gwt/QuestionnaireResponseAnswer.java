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
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 * 
 * <p>QuestionnaireResponse.Answer complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="QuestionnaireResponse.Answer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="valueBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="valueDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="valueInteger" type="{http://hl7.org/fhir}integer"/>
 *           &lt;element name="valueDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="valueDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="valueInstant" type="{http://hl7.org/fhir}instant"/>
 *           &lt;element name="valueTime" type="{http://hl7.org/fhir}time"/>
 *           &lt;element name="valueString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="valueUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="valueAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="valueCoding" type="{http://hl7.org/fhir}Coding"/>
 *           &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="valueReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="group" type="{http://hl7.org/fhir}QuestionnaireResponse.Group" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionnaireResponse.Answer", propOrder = {
    "valueBoolean",
    "valueDecimal",
    "valueInteger",
    "valueDate",
    "valueDateTime",
    "valueInstant",
    "valueTime",
    "valueString",
    "valueUri",
    "valueAttachment",
    "valueCoding",
    "valueQuantity",
    "valueReference",
    "group"
})
public class QuestionnaireResponseAnswer
    extends BackboneElement
{

    protected BooleanDt valueBoolean;
    protected Decimal valueDecimal;
    protected IntegerDt valueInteger;
    protected Date valueDate;
    protected DateTime valueDateTime;
    protected Instant valueInstant;
    protected Time valueTime;
    protected StringDt valueString;
    protected Uri valueUri;
    protected Attachment valueAttachment;
    protected Coding valueCoding;
    protected Quantity valueQuantity;
    protected Reference valueReference;
    protected List<QuestionnaireResponseGroup> group;

    /**
     * 取得 valueBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getValueBoolean() {
        return valueBoolean;
    }

    /**
     * 設定 valueBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setValueBoolean(BooleanDt value) {
        this.valueBoolean = value;
    }

    /**
     * 取得 valueDecimal 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getValueDecimal() {
        return valueDecimal;
    }

    /**
     * 設定 valueDecimal 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setValueDecimal(Decimal value) {
        this.valueDecimal = value;
    }

    /**
     * 取得 valueInteger 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getValueInteger() {
        return valueInteger;
    }

    /**
     * 設定 valueInteger 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setValueInteger(IntegerDt value) {
        this.valueInteger = value;
    }

    /**
     * 取得 valueDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getValueDate() {
        return valueDate;
    }

    /**
     * 設定 valueDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setValueDate(Date value) {
        this.valueDate = value;
    }

    /**
     * 取得 valueDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getValueDateTime() {
        return valueDateTime;
    }

    /**
     * 設定 valueDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setValueDateTime(DateTime value) {
        this.valueDateTime = value;
    }

    /**
     * 取得 valueInstant 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getValueInstant() {
        return valueInstant;
    }

    /**
     * 設定 valueInstant 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setValueInstant(Instant value) {
        this.valueInstant = value;
    }

    /**
     * 取得 valueTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getValueTime() {
        return valueTime;
    }

    /**
     * 設定 valueTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setValueTime(Time value) {
        this.valueTime = value;
    }

    /**
     * 取得 valueString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getValueString() {
        return valueString;
    }

    /**
     * 設定 valueString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setValueString(StringDt value) {
        this.valueString = value;
    }

    /**
     * 取得 valueUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getValueUri() {
        return valueUri;
    }

    /**
     * 設定 valueUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setValueUri(Uri value) {
        this.valueUri = value;
    }

    /**
     * 取得 valueAttachment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getValueAttachment() {
        return valueAttachment;
    }

    /**
     * 設定 valueAttachment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setValueAttachment(Attachment value) {
        this.valueAttachment = value;
    }

    /**
     * 取得 valueCoding 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getValueCoding() {
        return valueCoding;
    }

    /**
     * 設定 valueCoding 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setValueCoding(Coding value) {
        this.valueCoding = value;
    }

    /**
     * 取得 valueQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * 設定 valueQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setValueQuantity(Quantity value) {
        this.valueQuantity = value;
    }

    /**
     * 取得 valueReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getValueReference() {
        return valueReference;
    }

    /**
     * 設定 valueReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setValueReference(Reference value) {
        this.valueReference = value;
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
     * {@link QuestionnaireResponseGroup }
     * 
     * 
     */
    public List<QuestionnaireResponseGroup> getGroup() {
        if (group == null) {
            group = new ArrayList<QuestionnaireResponseGroup>();
        }
        return this.group;
    }

}
