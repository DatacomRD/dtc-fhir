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
 * This special resource type is used to represent an operation request and response (operations.html). It has no other use, and there is no RESTful endpoint associated with it.
 * 
 * <p>Parameters.Parameter complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Parameters.Parameter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="valueBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="valueInteger" type="{http://hl7.org/fhir}integer"/>
 *           &lt;element name="valueDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="valueBase64Binary" type="{http://hl7.org/fhir}base64Binary"/>
 *           &lt;element name="valueInstant" type="{http://hl7.org/fhir}instant"/>
 *           &lt;element name="valueString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="valueUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="valueDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="valueDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="valueTime" type="{http://hl7.org/fhir}time"/>
 *           &lt;element name="valueCode" type="{http://hl7.org/fhir}code"/>
 *           &lt;element name="valueOid" type="{http://hl7.org/fhir}oid"/>
 *           &lt;element name="valueUuid" type="{http://hl7.org/fhir}uuid"/>
 *           &lt;element name="valueId" type="{http://hl7.org/fhir}id"/>
 *           &lt;element name="valueUnsignedInt" type="{http://hl7.org/fhir}unsignedInt"/>
 *           &lt;element name="valuePositiveInt" type="{http://hl7.org/fhir}positiveInt"/>
 *           &lt;element name="valueMarkdown" type="{http://hl7.org/fhir}markdown"/>
 *           &lt;element name="valueAnnotation" type="{http://hl7.org/fhir}Annotation"/>
 *           &lt;element name="valueAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="valueIdentifier" type="{http://hl7.org/fhir}Identifier"/>
 *           &lt;element name="valueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="valueCoding" type="{http://hl7.org/fhir}Coding"/>
 *           &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="valueRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="valuePeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="valueRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="valueReference" type="{http://hl7.org/fhir}Reference"/>
 *           &lt;element name="valueSampledData" type="{http://hl7.org/fhir}SampledData"/>
 *           &lt;element name="valueSignature" type="{http://hl7.org/fhir}Signature"/>
 *           &lt;element name="valueHumanName" type="{http://hl7.org/fhir}HumanName"/>
 *           &lt;element name="valueAddress" type="{http://hl7.org/fhir}Address"/>
 *           &lt;element name="valueContactPoint" type="{http://hl7.org/fhir}ContactPoint"/>
 *           &lt;element name="valueTiming" type="{http://hl7.org/fhir}Timing"/>
 *           &lt;element name="valueMeta" type="{http://hl7.org/fhir}Meta"/>
 *           &lt;element name="valueElementDefinition" type="{http://hl7.org/fhir}ElementDefinition"/>
 *         &lt;/choice>
 *         &lt;element name="resource" type="{http://hl7.org/fhir}ResourceContainer" minOccurs="0"/>
 *         &lt;element name="part" type="{http://hl7.org/fhir}Parameters.Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameters.Parameter", propOrder = {
    "name",
    "valueBoolean",
    "valueInteger",
    "valueDecimal",
    "valueBase64Binary",
    "valueInstant",
    "valueString",
    "valueUri",
    "valueDate",
    "valueDateTime",
    "valueTime",
    "valueCode",
    "valueOid",
    "valueUuid",
    "valueId",
    "valueUnsignedInt",
    "valuePositiveInt",
    "valueMarkdown",
    "valueAnnotation",
    "valueAttachment",
    "valueIdentifier",
    "valueCodeableConcept",
    "valueCoding",
    "valueQuantity",
    "valueRange",
    "valuePeriod",
    "valueRatio",
    "valueReference",
    "valueSampledData",
    "valueSignature",
    "valueHumanName",
    "valueAddress",
    "valueContactPoint",
    "valueTiming",
    "valueMeta",
    "valueElementDefinition",
    "resource",
    "part"
})
public class ParametersParameter
    extends BackboneElement
{

    @XmlElement(required = true)
    protected StringDt name;
    protected BooleanDt valueBoolean;
    protected IntegerDt valueInteger;
    protected Decimal valueDecimal;
    protected Base64Binary valueBase64Binary;
    protected Instant valueInstant;
    protected StringDt valueString;
    protected Uri valueUri;
    protected Date valueDate;
    protected DateTime valueDateTime;
    protected Time valueTime;
    protected Code valueCode;
    protected Oid valueOid;
    protected Uuid valueUuid;
    protected Id valueId;
    protected UnsignedInt valueUnsignedInt;
    protected PositiveInt valuePositiveInt;
    protected Markdown valueMarkdown;
    protected Annotation valueAnnotation;
    protected Attachment valueAttachment;
    protected Identifier valueIdentifier;
    protected CodeableConcept valueCodeableConcept;
    protected Coding valueCoding;
    protected Quantity valueQuantity;
    protected Range valueRange;
    protected Period valuePeriod;
    protected Ratio valueRatio;
    protected Reference valueReference;
    protected SampledData valueSampledData;
    protected Signature valueSignature;
    protected HumanName valueHumanName;
    protected Address valueAddress;
    protected ContactPoint valueContactPoint;
    protected Timing valueTiming;
    protected Meta valueMeta;
    protected ElementDefinition valueElementDefinition;
    protected ResourceContainer resource;
    protected List<ParametersParameter> part;

    /**
     * 取得 name 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getName() {
        return name;
    }

    /**
     * 設定 name 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setName(StringDt value) {
        this.name = value;
    }

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
     * 取得 valueBase64Binary 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getValueBase64Binary() {
        return valueBase64Binary;
    }

    /**
     * 設定 valueBase64Binary 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setValueBase64Binary(Base64Binary value) {
        this.valueBase64Binary = value;
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
     * 取得 valueCode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getValueCode() {
        return valueCode;
    }

    /**
     * 設定 valueCode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setValueCode(Code value) {
        this.valueCode = value;
    }

    /**
     * 取得 valueOid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getValueOid() {
        return valueOid;
    }

    /**
     * 設定 valueOid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setValueOid(Oid value) {
        this.valueOid = value;
    }

    /**
     * 取得 valueUuid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uuid }
     *     
     */
    public Uuid getValueUuid() {
        return valueUuid;
    }

    /**
     * 設定 valueUuid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uuid }
     *     
     */
    public void setValueUuid(Uuid value) {
        this.valueUuid = value;
    }

    /**
     * 取得 valueId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getValueId() {
        return valueId;
    }

    /**
     * 設定 valueId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setValueId(Id value) {
        this.valueId = value;
    }

    /**
     * 取得 valueUnsignedInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getValueUnsignedInt() {
        return valueUnsignedInt;
    }

    /**
     * 設定 valueUnsignedInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setValueUnsignedInt(UnsignedInt value) {
        this.valueUnsignedInt = value;
    }

    /**
     * 取得 valuePositiveInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getValuePositiveInt() {
        return valuePositiveInt;
    }

    /**
     * 設定 valuePositiveInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setValuePositiveInt(PositiveInt value) {
        this.valuePositiveInt = value;
    }

    /**
     * 取得 valueMarkdown 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getValueMarkdown() {
        return valueMarkdown;
    }

    /**
     * 設定 valueMarkdown 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setValueMarkdown(Markdown value) {
        this.valueMarkdown = value;
    }

    /**
     * 取得 valueAnnotation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getValueAnnotation() {
        return valueAnnotation;
    }

    /**
     * 設定 valueAnnotation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setValueAnnotation(Annotation value) {
        this.valueAnnotation = value;
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
     * 取得 valueIdentifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getValueIdentifier() {
        return valueIdentifier;
    }

    /**
     * 設定 valueIdentifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setValueIdentifier(Identifier value) {
        this.valueIdentifier = value;
    }

    /**
     * 取得 valueCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    /**
     * 設定 valueCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setValueCodeableConcept(CodeableConcept value) {
        this.valueCodeableConcept = value;
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
     * 取得 valueRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getValueRange() {
        return valueRange;
    }

    /**
     * 設定 valueRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setValueRange(Range value) {
        this.valueRange = value;
    }

    /**
     * 取得 valuePeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getValuePeriod() {
        return valuePeriod;
    }

    /**
     * 設定 valuePeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setValuePeriod(Period value) {
        this.valuePeriod = value;
    }

    /**
     * 取得 valueRatio 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getValueRatio() {
        return valueRatio;
    }

    /**
     * 設定 valueRatio 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setValueRatio(Ratio value) {
        this.valueRatio = value;
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
     * 取得 valueSampledData 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SampledData }
     *     
     */
    public SampledData getValueSampledData() {
        return valueSampledData;
    }

    /**
     * 設定 valueSampledData 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledData }
     *     
     */
    public void setValueSampledData(SampledData value) {
        this.valueSampledData = value;
    }

    /**
     * 取得 valueSignature 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getValueSignature() {
        return valueSignature;
    }

    /**
     * 設定 valueSignature 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setValueSignature(Signature value) {
        this.valueSignature = value;
    }

    /**
     * 取得 valueHumanName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getValueHumanName() {
        return valueHumanName;
    }

    /**
     * 設定 valueHumanName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setValueHumanName(HumanName value) {
        this.valueHumanName = value;
    }

    /**
     * 取得 valueAddress 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getValueAddress() {
        return valueAddress;
    }

    /**
     * 設定 valueAddress 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setValueAddress(Address value) {
        this.valueAddress = value;
    }

    /**
     * 取得 valueContactPoint 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ContactPoint }
     *     
     */
    public ContactPoint getValueContactPoint() {
        return valueContactPoint;
    }

    /**
     * 設定 valueContactPoint 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPoint }
     *     
     */
    public void setValueContactPoint(ContactPoint value) {
        this.valueContactPoint = value;
    }

    /**
     * 取得 valueTiming 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getValueTiming() {
        return valueTiming;
    }

    /**
     * 設定 valueTiming 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setValueTiming(Timing value) {
        this.valueTiming = value;
    }

    /**
     * 取得 valueMeta 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getValueMeta() {
        return valueMeta;
    }

    /**
     * 設定 valueMeta 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setValueMeta(Meta value) {
        this.valueMeta = value;
    }

    /**
     * 取得 valueElementDefinition 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ElementDefinition }
     *     
     */
    public ElementDefinition getValueElementDefinition() {
        return valueElementDefinition;
    }

    /**
     * 設定 valueElementDefinition 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementDefinition }
     *     
     */
    public void setValueElementDefinition(ElementDefinition value) {
        this.valueElementDefinition = value;
    }

    /**
     * 取得 resource 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ResourceContainer }
     *     
     */
    public ResourceContainer getResource() {
        return resource;
    }

    /**
     * 設定 resource 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceContainer }
     *     
     */
    public void setResource(ResourceContainer value) {
        this.resource = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametersParameter }
     * 
     * 
     */
    public List<ParametersParameter> getPart() {
        if (part == null) {
            part = new ArrayList<ParametersParameter>();
        }
        return this.part;
    }

}
