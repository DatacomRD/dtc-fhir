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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>ElementDefinition complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ElementDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="path" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="representation" type="{http://hl7.org/fhir}PropertyRepresentation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="label" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="slicing" type="{http://hl7.org/fhir}ElementDefinition.Slicing" minOccurs="0"/>
 *         &lt;element name="short" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="definition" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="requirements" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="min" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="max" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="base" type="{http://hl7.org/fhir}ElementDefinition.Base" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}ElementDefinition.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nameReference" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="defaultValueBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="defaultValueInteger" type="{http://hl7.org/fhir}integer"/>
 *           &lt;element name="defaultValueDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="defaultValueBase64Binary" type="{http://hl7.org/fhir}base64Binary"/>
 *           &lt;element name="defaultValueInstant" type="{http://hl7.org/fhir}instant"/>
 *           &lt;element name="defaultValueString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="defaultValueUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="defaultValueDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="defaultValueDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="defaultValueTime" type="{http://hl7.org/fhir}time"/>
 *           &lt;element name="defaultValueCode" type="{http://hl7.org/fhir}code"/>
 *           &lt;element name="defaultValueOid" type="{http://hl7.org/fhir}oid"/>
 *           &lt;element name="defaultValueUuid" type="{http://hl7.org/fhir}uuid"/>
 *           &lt;element name="defaultValueId" type="{http://hl7.org/fhir}id"/>
 *           &lt;element name="defaultValueUnsignedInt" type="{http://hl7.org/fhir}unsignedInt"/>
 *           &lt;element name="defaultValuePositiveInt" type="{http://hl7.org/fhir}positiveInt"/>
 *           &lt;element name="defaultValueMarkdown" type="{http://hl7.org/fhir}markdown"/>
 *           &lt;element name="defaultValueAnnotation" type="{http://hl7.org/fhir}Annotation"/>
 *           &lt;element name="defaultValueAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="defaultValueIdentifier" type="{http://hl7.org/fhir}Identifier"/>
 *           &lt;element name="defaultValueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="defaultValueCoding" type="{http://hl7.org/fhir}Coding"/>
 *           &lt;element name="defaultValueQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="defaultValueRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="defaultValuePeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="defaultValueRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="defaultValueReference" type="{http://hl7.org/fhir}Reference"/>
 *           &lt;element name="defaultValueSampledData" type="{http://hl7.org/fhir}SampledData"/>
 *           &lt;element name="defaultValueSignature" type="{http://hl7.org/fhir}Signature"/>
 *           &lt;element name="defaultValueHumanName" type="{http://hl7.org/fhir}HumanName"/>
 *           &lt;element name="defaultValueAddress" type="{http://hl7.org/fhir}Address"/>
 *           &lt;element name="defaultValueContactPoint" type="{http://hl7.org/fhir}ContactPoint"/>
 *           &lt;element name="defaultValueTiming" type="{http://hl7.org/fhir}Timing"/>
 *           &lt;element name="defaultValueMeta" type="{http://hl7.org/fhir}Meta"/>
 *         &lt;/choice>
 *         &lt;element name="meaningWhenMissing" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="fixedBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="fixedInteger" type="{http://hl7.org/fhir}integer"/>
 *           &lt;element name="fixedDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="fixedBase64Binary" type="{http://hl7.org/fhir}base64Binary"/>
 *           &lt;element name="fixedInstant" type="{http://hl7.org/fhir}instant"/>
 *           &lt;element name="fixedString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="fixedUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="fixedDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="fixedDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="fixedTime" type="{http://hl7.org/fhir}time"/>
 *           &lt;element name="fixedCode" type="{http://hl7.org/fhir}code"/>
 *           &lt;element name="fixedOid" type="{http://hl7.org/fhir}oid"/>
 *           &lt;element name="fixedUuid" type="{http://hl7.org/fhir}uuid"/>
 *           &lt;element name="fixedId" type="{http://hl7.org/fhir}id"/>
 *           &lt;element name="fixedUnsignedInt" type="{http://hl7.org/fhir}unsignedInt"/>
 *           &lt;element name="fixedPositiveInt" type="{http://hl7.org/fhir}positiveInt"/>
 *           &lt;element name="fixedMarkdown" type="{http://hl7.org/fhir}markdown"/>
 *           &lt;element name="fixedAnnotation" type="{http://hl7.org/fhir}Annotation"/>
 *           &lt;element name="fixedAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="fixedIdentifier" type="{http://hl7.org/fhir}Identifier"/>
 *           &lt;element name="fixedCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="fixedCoding" type="{http://hl7.org/fhir}Coding"/>
 *           &lt;element name="fixedQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="fixedRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="fixedPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="fixedRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="fixedReference" type="{http://hl7.org/fhir}Reference"/>
 *           &lt;element name="fixedSampledData" type="{http://hl7.org/fhir}SampledData"/>
 *           &lt;element name="fixedSignature" type="{http://hl7.org/fhir}Signature"/>
 *           &lt;element name="fixedHumanName" type="{http://hl7.org/fhir}HumanName"/>
 *           &lt;element name="fixedAddress" type="{http://hl7.org/fhir}Address"/>
 *           &lt;element name="fixedContactPoint" type="{http://hl7.org/fhir}ContactPoint"/>
 *           &lt;element name="fixedTiming" type="{http://hl7.org/fhir}Timing"/>
 *           &lt;element name="fixedMeta" type="{http://hl7.org/fhir}Meta"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="patternBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="patternInteger" type="{http://hl7.org/fhir}integer"/>
 *           &lt;element name="patternDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="patternBase64Binary" type="{http://hl7.org/fhir}base64Binary"/>
 *           &lt;element name="patternInstant" type="{http://hl7.org/fhir}instant"/>
 *           &lt;element name="patternString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="patternUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="patternDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="patternDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="patternTime" type="{http://hl7.org/fhir}time"/>
 *           &lt;element name="patternCode" type="{http://hl7.org/fhir}code"/>
 *           &lt;element name="patternOid" type="{http://hl7.org/fhir}oid"/>
 *           &lt;element name="patternUuid" type="{http://hl7.org/fhir}uuid"/>
 *           &lt;element name="patternId" type="{http://hl7.org/fhir}id"/>
 *           &lt;element name="patternUnsignedInt" type="{http://hl7.org/fhir}unsignedInt"/>
 *           &lt;element name="patternPositiveInt" type="{http://hl7.org/fhir}positiveInt"/>
 *           &lt;element name="patternMarkdown" type="{http://hl7.org/fhir}markdown"/>
 *           &lt;element name="patternAnnotation" type="{http://hl7.org/fhir}Annotation"/>
 *           &lt;element name="patternAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="patternIdentifier" type="{http://hl7.org/fhir}Identifier"/>
 *           &lt;element name="patternCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="patternCoding" type="{http://hl7.org/fhir}Coding"/>
 *           &lt;element name="patternQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="patternRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="patternPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="patternRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="patternReference" type="{http://hl7.org/fhir}Reference"/>
 *           &lt;element name="patternSampledData" type="{http://hl7.org/fhir}SampledData"/>
 *           &lt;element name="patternSignature" type="{http://hl7.org/fhir}Signature"/>
 *           &lt;element name="patternHumanName" type="{http://hl7.org/fhir}HumanName"/>
 *           &lt;element name="patternAddress" type="{http://hl7.org/fhir}Address"/>
 *           &lt;element name="patternContactPoint" type="{http://hl7.org/fhir}ContactPoint"/>
 *           &lt;element name="patternTiming" type="{http://hl7.org/fhir}Timing"/>
 *           &lt;element name="patternMeta" type="{http://hl7.org/fhir}Meta"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="exampleBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="exampleInteger" type="{http://hl7.org/fhir}integer"/>
 *           &lt;element name="exampleDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="exampleBase64Binary" type="{http://hl7.org/fhir}base64Binary"/>
 *           &lt;element name="exampleInstant" type="{http://hl7.org/fhir}instant"/>
 *           &lt;element name="exampleString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="exampleUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="exampleDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="exampleDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="exampleTime" type="{http://hl7.org/fhir}time"/>
 *           &lt;element name="exampleCode" type="{http://hl7.org/fhir}code"/>
 *           &lt;element name="exampleOid" type="{http://hl7.org/fhir}oid"/>
 *           &lt;element name="exampleUuid" type="{http://hl7.org/fhir}uuid"/>
 *           &lt;element name="exampleId" type="{http://hl7.org/fhir}id"/>
 *           &lt;element name="exampleUnsignedInt" type="{http://hl7.org/fhir}unsignedInt"/>
 *           &lt;element name="examplePositiveInt" type="{http://hl7.org/fhir}positiveInt"/>
 *           &lt;element name="exampleMarkdown" type="{http://hl7.org/fhir}markdown"/>
 *           &lt;element name="exampleAnnotation" type="{http://hl7.org/fhir}Annotation"/>
 *           &lt;element name="exampleAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="exampleIdentifier" type="{http://hl7.org/fhir}Identifier"/>
 *           &lt;element name="exampleCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="exampleCoding" type="{http://hl7.org/fhir}Coding"/>
 *           &lt;element name="exampleQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="exampleRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="examplePeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="exampleRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="exampleReference" type="{http://hl7.org/fhir}Reference"/>
 *           &lt;element name="exampleSampledData" type="{http://hl7.org/fhir}SampledData"/>
 *           &lt;element name="exampleSignature" type="{http://hl7.org/fhir}Signature"/>
 *           &lt;element name="exampleHumanName" type="{http://hl7.org/fhir}HumanName"/>
 *           &lt;element name="exampleAddress" type="{http://hl7.org/fhir}Address"/>
 *           &lt;element name="exampleContactPoint" type="{http://hl7.org/fhir}ContactPoint"/>
 *           &lt;element name="exampleTiming" type="{http://hl7.org/fhir}Timing"/>
 *           &lt;element name="exampleMeta" type="{http://hl7.org/fhir}Meta"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="minValueBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="minValueInteger" type="{http://hl7.org/fhir}integer"/>
 *           &lt;element name="minValueDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="minValueBase64Binary" type="{http://hl7.org/fhir}base64Binary"/>
 *           &lt;element name="minValueInstant" type="{http://hl7.org/fhir}instant"/>
 *           &lt;element name="minValueString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="minValueUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="minValueDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="minValueDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="minValueTime" type="{http://hl7.org/fhir}time"/>
 *           &lt;element name="minValueCode" type="{http://hl7.org/fhir}code"/>
 *           &lt;element name="minValueOid" type="{http://hl7.org/fhir}oid"/>
 *           &lt;element name="minValueUuid" type="{http://hl7.org/fhir}uuid"/>
 *           &lt;element name="minValueId" type="{http://hl7.org/fhir}id"/>
 *           &lt;element name="minValueUnsignedInt" type="{http://hl7.org/fhir}unsignedInt"/>
 *           &lt;element name="minValuePositiveInt" type="{http://hl7.org/fhir}positiveInt"/>
 *           &lt;element name="minValueMarkdown" type="{http://hl7.org/fhir}markdown"/>
 *           &lt;element name="minValueAnnotation" type="{http://hl7.org/fhir}Annotation"/>
 *           &lt;element name="minValueAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="minValueIdentifier" type="{http://hl7.org/fhir}Identifier"/>
 *           &lt;element name="minValueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="minValueCoding" type="{http://hl7.org/fhir}Coding"/>
 *           &lt;element name="minValueQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="minValueRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="minValuePeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="minValueRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="minValueReference" type="{http://hl7.org/fhir}Reference"/>
 *           &lt;element name="minValueSampledData" type="{http://hl7.org/fhir}SampledData"/>
 *           &lt;element name="minValueSignature" type="{http://hl7.org/fhir}Signature"/>
 *           &lt;element name="minValueHumanName" type="{http://hl7.org/fhir}HumanName"/>
 *           &lt;element name="minValueAddress" type="{http://hl7.org/fhir}Address"/>
 *           &lt;element name="minValueContactPoint" type="{http://hl7.org/fhir}ContactPoint"/>
 *           &lt;element name="minValueTiming" type="{http://hl7.org/fhir}Timing"/>
 *           &lt;element name="minValueMeta" type="{http://hl7.org/fhir}Meta"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="maxValueBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="maxValueInteger" type="{http://hl7.org/fhir}integer"/>
 *           &lt;element name="maxValueDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="maxValueBase64Binary" type="{http://hl7.org/fhir}base64Binary"/>
 *           &lt;element name="maxValueInstant" type="{http://hl7.org/fhir}instant"/>
 *           &lt;element name="maxValueString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="maxValueUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="maxValueDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="maxValueDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="maxValueTime" type="{http://hl7.org/fhir}time"/>
 *           &lt;element name="maxValueCode" type="{http://hl7.org/fhir}code"/>
 *           &lt;element name="maxValueOid" type="{http://hl7.org/fhir}oid"/>
 *           &lt;element name="maxValueUuid" type="{http://hl7.org/fhir}uuid"/>
 *           &lt;element name="maxValueId" type="{http://hl7.org/fhir}id"/>
 *           &lt;element name="maxValueUnsignedInt" type="{http://hl7.org/fhir}unsignedInt"/>
 *           &lt;element name="maxValuePositiveInt" type="{http://hl7.org/fhir}positiveInt"/>
 *           &lt;element name="maxValueMarkdown" type="{http://hl7.org/fhir}markdown"/>
 *           &lt;element name="maxValueAnnotation" type="{http://hl7.org/fhir}Annotation"/>
 *           &lt;element name="maxValueAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="maxValueIdentifier" type="{http://hl7.org/fhir}Identifier"/>
 *           &lt;element name="maxValueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="maxValueCoding" type="{http://hl7.org/fhir}Coding"/>
 *           &lt;element name="maxValueQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="maxValueRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="maxValuePeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="maxValueRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="maxValueReference" type="{http://hl7.org/fhir}Reference"/>
 *           &lt;element name="maxValueSampledData" type="{http://hl7.org/fhir}SampledData"/>
 *           &lt;element name="maxValueSignature" type="{http://hl7.org/fhir}Signature"/>
 *           &lt;element name="maxValueHumanName" type="{http://hl7.org/fhir}HumanName"/>
 *           &lt;element name="maxValueAddress" type="{http://hl7.org/fhir}Address"/>
 *           &lt;element name="maxValueContactPoint" type="{http://hl7.org/fhir}ContactPoint"/>
 *           &lt;element name="maxValueTiming" type="{http://hl7.org/fhir}Timing"/>
 *           &lt;element name="maxValueMeta" type="{http://hl7.org/fhir}Meta"/>
 *         &lt;/choice>
 *         &lt;element name="maxLength" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://hl7.org/fhir}id" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="constraint" type="{http://hl7.org/fhir}ElementDefinition.Constraint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mustSupport" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="isModifier" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="isSummary" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="binding" type="{http://hl7.org/fhir}ElementDefinition.Binding" minOccurs="0"/>
 *         &lt;element name="mapping" type="{http://hl7.org/fhir}ElementDefinition.Mapping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementDefinition", propOrder = {
    "path",
    "representation",
    "name",
    "label",
    "code",
    "slicing",
    "_short",
    "definition",
    "comments",
    "requirements",
    "alias",
    "min",
    "max",
    "base",
    "type",
    "nameReference",
    "defaultValueBoolean",
    "defaultValueInteger",
    "defaultValueDecimal",
    "defaultValueBase64Binary",
    "defaultValueInstant",
    "defaultValueString",
    "defaultValueUri",
    "defaultValueDate",
    "defaultValueDateTime",
    "defaultValueTime",
    "defaultValueCode",
    "defaultValueOid",
    "defaultValueUuid",
    "defaultValueId",
    "defaultValueUnsignedInt",
    "defaultValuePositiveInt",
    "defaultValueMarkdown",
    "defaultValueAnnotation",
    "defaultValueAttachment",
    "defaultValueIdentifier",
    "defaultValueCodeableConcept",
    "defaultValueCoding",
    "defaultValueQuantity",
    "defaultValueRange",
    "defaultValuePeriod",
    "defaultValueRatio",
    "defaultValueReference",
    "defaultValueSampledData",
    "defaultValueSignature",
    "defaultValueHumanName",
    "defaultValueAddress",
    "defaultValueContactPoint",
    "defaultValueTiming",
    "defaultValueMeta",
    "meaningWhenMissing",
    "fixedBoolean",
    "fixedInteger",
    "fixedDecimal",
    "fixedBase64Binary",
    "fixedInstant",
    "fixedString",
    "fixedUri",
    "fixedDate",
    "fixedDateTime",
    "fixedTime",
    "fixedCode",
    "fixedOid",
    "fixedUuid",
    "fixedId",
    "fixedUnsignedInt",
    "fixedPositiveInt",
    "fixedMarkdown",
    "fixedAnnotation",
    "fixedAttachment",
    "fixedIdentifier",
    "fixedCodeableConcept",
    "fixedCoding",
    "fixedQuantity",
    "fixedRange",
    "fixedPeriod",
    "fixedRatio",
    "fixedReference",
    "fixedSampledData",
    "fixedSignature",
    "fixedHumanName",
    "fixedAddress",
    "fixedContactPoint",
    "fixedTiming",
    "fixedMeta",
    "patternBoolean",
    "patternInteger",
    "patternDecimal",
    "patternBase64Binary",
    "patternInstant",
    "patternString",
    "patternUri",
    "patternDate",
    "patternDateTime",
    "patternTime",
    "patternCode",
    "patternOid",
    "patternUuid",
    "patternId",
    "patternUnsignedInt",
    "patternPositiveInt",
    "patternMarkdown",
    "patternAnnotation",
    "patternAttachment",
    "patternIdentifier",
    "patternCodeableConcept",
    "patternCoding",
    "patternQuantity",
    "patternRange",
    "patternPeriod",
    "patternRatio",
    "patternReference",
    "patternSampledData",
    "patternSignature",
    "patternHumanName",
    "patternAddress",
    "patternContactPoint",
    "patternTiming",
    "patternMeta",
    "exampleBoolean",
    "exampleInteger",
    "exampleDecimal",
    "exampleBase64Binary",
    "exampleInstant",
    "exampleString",
    "exampleUri",
    "exampleDate",
    "exampleDateTime",
    "exampleTime",
    "exampleCode",
    "exampleOid",
    "exampleUuid",
    "exampleId",
    "exampleUnsignedInt",
    "examplePositiveInt",
    "exampleMarkdown",
    "exampleAnnotation",
    "exampleAttachment",
    "exampleIdentifier",
    "exampleCodeableConcept",
    "exampleCoding",
    "exampleQuantity",
    "exampleRange",
    "examplePeriod",
    "exampleRatio",
    "exampleReference",
    "exampleSampledData",
    "exampleSignature",
    "exampleHumanName",
    "exampleAddress",
    "exampleContactPoint",
    "exampleTiming",
    "exampleMeta",
    "minValueBoolean",
    "minValueInteger",
    "minValueDecimal",
    "minValueBase64Binary",
    "minValueInstant",
    "minValueString",
    "minValueUri",
    "minValueDate",
    "minValueDateTime",
    "minValueTime",
    "minValueCode",
    "minValueOid",
    "minValueUuid",
    "minValueId",
    "minValueUnsignedInt",
    "minValuePositiveInt",
    "minValueMarkdown",
    "minValueAnnotation",
    "minValueAttachment",
    "minValueIdentifier",
    "minValueCodeableConcept",
    "minValueCoding",
    "minValueQuantity",
    "minValueRange",
    "minValuePeriod",
    "minValueRatio",
    "minValueReference",
    "minValueSampledData",
    "minValueSignature",
    "minValueHumanName",
    "minValueAddress",
    "minValueContactPoint",
    "minValueTiming",
    "minValueMeta",
    "maxValueBoolean",
    "maxValueInteger",
    "maxValueDecimal",
    "maxValueBase64Binary",
    "maxValueInstant",
    "maxValueString",
    "maxValueUri",
    "maxValueDate",
    "maxValueDateTime",
    "maxValueTime",
    "maxValueCode",
    "maxValueOid",
    "maxValueUuid",
    "maxValueId",
    "maxValueUnsignedInt",
    "maxValuePositiveInt",
    "maxValueMarkdown",
    "maxValueAnnotation",
    "maxValueAttachment",
    "maxValueIdentifier",
    "maxValueCodeableConcept",
    "maxValueCoding",
    "maxValueQuantity",
    "maxValueRange",
    "maxValuePeriod",
    "maxValueRatio",
    "maxValueReference",
    "maxValueSampledData",
    "maxValueSignature",
    "maxValueHumanName",
    "maxValueAddress",
    "maxValueContactPoint",
    "maxValueTiming",
    "maxValueMeta",
    "maxLength",
    "condition",
    "constraint",
    "mustSupport",
    "isModifier",
    "isSummary",
    "binding",
    "mapping"
})
public class ElementDefinition
    extends Element
{

    @XmlElement(required = true)
    protected StringDt path;
    protected List<PropertyRepresentation> representation;
    protected StringDt name;
    protected StringDt label;
    protected List<Coding> code;
    protected ElementDefinitionSlicing slicing;
    @XmlElement(name = "short")
    protected StringDt _short;
    protected Markdown definition;
    protected Markdown comments;
    protected Markdown requirements;
    protected List<StringDt> alias;
    protected IntegerDt min;
    protected StringDt max;
    protected ElementDefinitionBase base;
    protected List<ElementDefinitionType> type;
    protected StringDt nameReference;
    protected BooleanDt defaultValueBoolean;
    protected IntegerDt defaultValueInteger;
    protected Decimal defaultValueDecimal;
    protected Base64Binary defaultValueBase64Binary;
    protected Instant defaultValueInstant;
    protected StringDt defaultValueString;
    protected Uri defaultValueUri;
    protected Date defaultValueDate;
    protected DateTime defaultValueDateTime;
    protected Time defaultValueTime;
    protected Code defaultValueCode;
    protected Oid defaultValueOid;
    protected Uuid defaultValueUuid;
    protected Id defaultValueId;
    protected UnsignedInt defaultValueUnsignedInt;
    protected PositiveInt defaultValuePositiveInt;
    protected Markdown defaultValueMarkdown;
    protected Annotation defaultValueAnnotation;
    protected Attachment defaultValueAttachment;
    protected Identifier defaultValueIdentifier;
    protected CodeableConcept defaultValueCodeableConcept;
    protected Coding defaultValueCoding;
    protected Quantity defaultValueQuantity;
    protected Range defaultValueRange;
    protected Period defaultValuePeriod;
    protected Ratio defaultValueRatio;
    protected Reference defaultValueReference;
    protected SampledData defaultValueSampledData;
    protected Signature defaultValueSignature;
    protected HumanName defaultValueHumanName;
    protected Address defaultValueAddress;
    protected ContactPoint defaultValueContactPoint;
    protected Timing defaultValueTiming;
    protected Meta defaultValueMeta;
    protected Markdown meaningWhenMissing;
    protected BooleanDt fixedBoolean;
    protected IntegerDt fixedInteger;
    protected Decimal fixedDecimal;
    protected Base64Binary fixedBase64Binary;
    protected Instant fixedInstant;
    protected StringDt fixedString;
    protected Uri fixedUri;
    protected Date fixedDate;
    protected DateTime fixedDateTime;
    protected Time fixedTime;
    protected Code fixedCode;
    protected Oid fixedOid;
    protected Uuid fixedUuid;
    protected Id fixedId;
    protected UnsignedInt fixedUnsignedInt;
    protected PositiveInt fixedPositiveInt;
    protected Markdown fixedMarkdown;
    protected Annotation fixedAnnotation;
    protected Attachment fixedAttachment;
    protected Identifier fixedIdentifier;
    protected CodeableConcept fixedCodeableConcept;
    protected Coding fixedCoding;
    protected Quantity fixedQuantity;
    protected Range fixedRange;
    protected Period fixedPeriod;
    protected Ratio fixedRatio;
    protected Reference fixedReference;
    protected SampledData fixedSampledData;
    protected Signature fixedSignature;
    protected HumanName fixedHumanName;
    protected Address fixedAddress;
    protected ContactPoint fixedContactPoint;
    protected Timing fixedTiming;
    protected Meta fixedMeta;
    protected BooleanDt patternBoolean;
    protected IntegerDt patternInteger;
    protected Decimal patternDecimal;
    protected Base64Binary patternBase64Binary;
    protected Instant patternInstant;
    protected StringDt patternString;
    protected Uri patternUri;
    protected Date patternDate;
    protected DateTime patternDateTime;
    protected Time patternTime;
    protected Code patternCode;
    protected Oid patternOid;
    protected Uuid patternUuid;
    protected Id patternId;
    protected UnsignedInt patternUnsignedInt;
    protected PositiveInt patternPositiveInt;
    protected Markdown patternMarkdown;
    protected Annotation patternAnnotation;
    protected Attachment patternAttachment;
    protected Identifier patternIdentifier;
    protected CodeableConcept patternCodeableConcept;
    protected Coding patternCoding;
    protected Quantity patternQuantity;
    protected Range patternRange;
    protected Period patternPeriod;
    protected Ratio patternRatio;
    protected Reference patternReference;
    protected SampledData patternSampledData;
    protected Signature patternSignature;
    protected HumanName patternHumanName;
    protected Address patternAddress;
    protected ContactPoint patternContactPoint;
    protected Timing patternTiming;
    protected Meta patternMeta;
    protected BooleanDt exampleBoolean;
    protected IntegerDt exampleInteger;
    protected Decimal exampleDecimal;
    protected Base64Binary exampleBase64Binary;
    protected Instant exampleInstant;
    protected StringDt exampleString;
    protected Uri exampleUri;
    protected Date exampleDate;
    protected DateTime exampleDateTime;
    protected Time exampleTime;
    protected Code exampleCode;
    protected Oid exampleOid;
    protected Uuid exampleUuid;
    protected Id exampleId;
    protected UnsignedInt exampleUnsignedInt;
    protected PositiveInt examplePositiveInt;
    protected Markdown exampleMarkdown;
    protected Annotation exampleAnnotation;
    protected Attachment exampleAttachment;
    protected Identifier exampleIdentifier;
    protected CodeableConcept exampleCodeableConcept;
    protected Coding exampleCoding;
    protected Quantity exampleQuantity;
    protected Range exampleRange;
    protected Period examplePeriod;
    protected Ratio exampleRatio;
    protected Reference exampleReference;
    protected SampledData exampleSampledData;
    protected Signature exampleSignature;
    protected HumanName exampleHumanName;
    protected Address exampleAddress;
    protected ContactPoint exampleContactPoint;
    protected Timing exampleTiming;
    protected Meta exampleMeta;
    protected BooleanDt minValueBoolean;
    protected IntegerDt minValueInteger;
    protected Decimal minValueDecimal;
    protected Base64Binary minValueBase64Binary;
    protected Instant minValueInstant;
    protected StringDt minValueString;
    protected Uri minValueUri;
    protected Date minValueDate;
    protected DateTime minValueDateTime;
    protected Time minValueTime;
    protected Code minValueCode;
    protected Oid minValueOid;
    protected Uuid minValueUuid;
    protected Id minValueId;
    protected UnsignedInt minValueUnsignedInt;
    protected PositiveInt minValuePositiveInt;
    protected Markdown minValueMarkdown;
    protected Annotation minValueAnnotation;
    protected Attachment minValueAttachment;
    protected Identifier minValueIdentifier;
    protected CodeableConcept minValueCodeableConcept;
    protected Coding minValueCoding;
    protected Quantity minValueQuantity;
    protected Range minValueRange;
    protected Period minValuePeriod;
    protected Ratio minValueRatio;
    protected Reference minValueReference;
    protected SampledData minValueSampledData;
    protected Signature minValueSignature;
    protected HumanName minValueHumanName;
    protected Address minValueAddress;
    protected ContactPoint minValueContactPoint;
    protected Timing minValueTiming;
    protected Meta minValueMeta;
    protected BooleanDt maxValueBoolean;
    protected IntegerDt maxValueInteger;
    protected Decimal maxValueDecimal;
    protected Base64Binary maxValueBase64Binary;
    protected Instant maxValueInstant;
    protected StringDt maxValueString;
    protected Uri maxValueUri;
    protected Date maxValueDate;
    protected DateTime maxValueDateTime;
    protected Time maxValueTime;
    protected Code maxValueCode;
    protected Oid maxValueOid;
    protected Uuid maxValueUuid;
    protected Id maxValueId;
    protected UnsignedInt maxValueUnsignedInt;
    protected PositiveInt maxValuePositiveInt;
    protected Markdown maxValueMarkdown;
    protected Annotation maxValueAnnotation;
    protected Attachment maxValueAttachment;
    protected Identifier maxValueIdentifier;
    protected CodeableConcept maxValueCodeableConcept;
    protected Coding maxValueCoding;
    protected Quantity maxValueQuantity;
    protected Range maxValueRange;
    protected Period maxValuePeriod;
    protected Ratio maxValueRatio;
    protected Reference maxValueReference;
    protected SampledData maxValueSampledData;
    protected Signature maxValueSignature;
    protected HumanName maxValueHumanName;
    protected Address maxValueAddress;
    protected ContactPoint maxValueContactPoint;
    protected Timing maxValueTiming;
    protected Meta maxValueMeta;
    protected IntegerDt maxLength;
    protected List<Id> condition;
    protected List<ElementDefinitionConstraint> constraint;
    protected BooleanDt mustSupport;
    protected BooleanDt isModifier;
    protected BooleanDt isSummary;
    protected ElementDefinitionBinding binding;
    protected List<ElementDefinitionMapping> mapping;

    /**
     * 取得 path 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getPath() {
        return path;
    }

    /**
     * 設定 path 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setPath(StringDt value) {
        this.path = value;
    }

    /**
     * Gets the value of the representation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the representation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepresentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyRepresentation }
     * 
     * 
     */
    public List<PropertyRepresentation> getRepresentation() {
        if (representation == null) {
            representation = new ArrayList<PropertyRepresentation>();
        }
        return this.representation;
    }

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
     * 取得 label 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getLabel() {
        return label;
    }

    /**
     * 設定 label 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setLabel(StringDt value) {
        this.label = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getCode() {
        if (code == null) {
            code = new ArrayList<Coding>();
        }
        return this.code;
    }

    /**
     * 取得 slicing 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ElementDefinitionSlicing }
     *     
     */
    public ElementDefinitionSlicing getSlicing() {
        return slicing;
    }

    /**
     * 設定 slicing 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementDefinitionSlicing }
     *     
     */
    public void setSlicing(ElementDefinitionSlicing value) {
        this.slicing = value;
    }

    /**
     * 取得 short 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getShort() {
        return _short;
    }

    /**
     * 設定 short 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setShort(StringDt value) {
        this._short = value;
    }

    /**
     * 取得 definition 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getDefinition() {
        return definition;
    }

    /**
     * 設定 definition 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setDefinition(Markdown value) {
        this.definition = value;
    }

    /**
     * 取得 comments 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getComments() {
        return comments;
    }

    /**
     * 設定 comments 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setComments(Markdown value) {
        this.comments = value;
    }

    /**
     * 取得 requirements 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getRequirements() {
        return requirements;
    }

    /**
     * 設定 requirements 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setRequirements(Markdown value) {
        this.requirements = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDt }
     * 
     * 
     */
    public List<StringDt> getAlias() {
        if (alias == null) {
            alias = new ArrayList<StringDt>();
        }
        return this.alias;
    }

    /**
     * 取得 min 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getMin() {
        return min;
    }

    /**
     * 設定 min 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setMin(IntegerDt value) {
        this.min = value;
    }

    /**
     * 取得 max 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getMax() {
        return max;
    }

    /**
     * 設定 max 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setMax(StringDt value) {
        this.max = value;
    }

    /**
     * 取得 base 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ElementDefinitionBase }
     *     
     */
    public ElementDefinitionBase getBase() {
        return base;
    }

    /**
     * 設定 base 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementDefinitionBase }
     *     
     */
    public void setBase(ElementDefinitionBase value) {
        this.base = value;
    }

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
     * {@link ElementDefinitionType }
     * 
     * 
     */
    public List<ElementDefinitionType> getType() {
        if (type == null) {
            type = new ArrayList<ElementDefinitionType>();
        }
        return this.type;
    }

    /**
     * 取得 nameReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getNameReference() {
        return nameReference;
    }

    /**
     * 設定 nameReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setNameReference(StringDt value) {
        this.nameReference = value;
    }

    /**
     * 取得 defaultValueBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getDefaultValueBoolean() {
        return defaultValueBoolean;
    }

    /**
     * 設定 defaultValueBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setDefaultValueBoolean(BooleanDt value) {
        this.defaultValueBoolean = value;
    }

    /**
     * 取得 defaultValueInteger 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getDefaultValueInteger() {
        return defaultValueInteger;
    }

    /**
     * 設定 defaultValueInteger 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setDefaultValueInteger(IntegerDt value) {
        this.defaultValueInteger = value;
    }

    /**
     * 取得 defaultValueDecimal 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getDefaultValueDecimal() {
        return defaultValueDecimal;
    }

    /**
     * 設定 defaultValueDecimal 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setDefaultValueDecimal(Decimal value) {
        this.defaultValueDecimal = value;
    }

    /**
     * 取得 defaultValueBase64Binary 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getDefaultValueBase64Binary() {
        return defaultValueBase64Binary;
    }

    /**
     * 設定 defaultValueBase64Binary 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setDefaultValueBase64Binary(Base64Binary value) {
        this.defaultValueBase64Binary = value;
    }

    /**
     * 取得 defaultValueInstant 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getDefaultValueInstant() {
        return defaultValueInstant;
    }

    /**
     * 設定 defaultValueInstant 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setDefaultValueInstant(Instant value) {
        this.defaultValueInstant = value;
    }

    /**
     * 取得 defaultValueString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDefaultValueString() {
        return defaultValueString;
    }

    /**
     * 設定 defaultValueString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDefaultValueString(StringDt value) {
        this.defaultValueString = value;
    }

    /**
     * 取得 defaultValueUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getDefaultValueUri() {
        return defaultValueUri;
    }

    /**
     * 設定 defaultValueUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setDefaultValueUri(Uri value) {
        this.defaultValueUri = value;
    }

    /**
     * 取得 defaultValueDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDefaultValueDate() {
        return defaultValueDate;
    }

    /**
     * 設定 defaultValueDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDefaultValueDate(Date value) {
        this.defaultValueDate = value;
    }

    /**
     * 取得 defaultValueDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDefaultValueDateTime() {
        return defaultValueDateTime;
    }

    /**
     * 設定 defaultValueDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDefaultValueDateTime(DateTime value) {
        this.defaultValueDateTime = value;
    }

    /**
     * 取得 defaultValueTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getDefaultValueTime() {
        return defaultValueTime;
    }

    /**
     * 設定 defaultValueTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setDefaultValueTime(Time value) {
        this.defaultValueTime = value;
    }

    /**
     * 取得 defaultValueCode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getDefaultValueCode() {
        return defaultValueCode;
    }

    /**
     * 設定 defaultValueCode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setDefaultValueCode(Code value) {
        this.defaultValueCode = value;
    }

    /**
     * 取得 defaultValueOid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getDefaultValueOid() {
        return defaultValueOid;
    }

    /**
     * 設定 defaultValueOid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setDefaultValueOid(Oid value) {
        this.defaultValueOid = value;
    }

    /**
     * 取得 defaultValueUuid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uuid }
     *     
     */
    public Uuid getDefaultValueUuid() {
        return defaultValueUuid;
    }

    /**
     * 設定 defaultValueUuid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uuid }
     *     
     */
    public void setDefaultValueUuid(Uuid value) {
        this.defaultValueUuid = value;
    }

    /**
     * 取得 defaultValueId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getDefaultValueId() {
        return defaultValueId;
    }

    /**
     * 設定 defaultValueId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setDefaultValueId(Id value) {
        this.defaultValueId = value;
    }

    /**
     * 取得 defaultValueUnsignedInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getDefaultValueUnsignedInt() {
        return defaultValueUnsignedInt;
    }

    /**
     * 設定 defaultValueUnsignedInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setDefaultValueUnsignedInt(UnsignedInt value) {
        this.defaultValueUnsignedInt = value;
    }

    /**
     * 取得 defaultValuePositiveInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getDefaultValuePositiveInt() {
        return defaultValuePositiveInt;
    }

    /**
     * 設定 defaultValuePositiveInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setDefaultValuePositiveInt(PositiveInt value) {
        this.defaultValuePositiveInt = value;
    }

    /**
     * 取得 defaultValueMarkdown 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getDefaultValueMarkdown() {
        return defaultValueMarkdown;
    }

    /**
     * 設定 defaultValueMarkdown 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setDefaultValueMarkdown(Markdown value) {
        this.defaultValueMarkdown = value;
    }

    /**
     * 取得 defaultValueAnnotation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getDefaultValueAnnotation() {
        return defaultValueAnnotation;
    }

    /**
     * 設定 defaultValueAnnotation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setDefaultValueAnnotation(Annotation value) {
        this.defaultValueAnnotation = value;
    }

    /**
     * 取得 defaultValueAttachment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getDefaultValueAttachment() {
        return defaultValueAttachment;
    }

    /**
     * 設定 defaultValueAttachment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setDefaultValueAttachment(Attachment value) {
        this.defaultValueAttachment = value;
    }

    /**
     * 取得 defaultValueIdentifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getDefaultValueIdentifier() {
        return defaultValueIdentifier;
    }

    /**
     * 設定 defaultValueIdentifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setDefaultValueIdentifier(Identifier value) {
        this.defaultValueIdentifier = value;
    }

    /**
     * 取得 defaultValueCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDefaultValueCodeableConcept() {
        return defaultValueCodeableConcept;
    }

    /**
     * 設定 defaultValueCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDefaultValueCodeableConcept(CodeableConcept value) {
        this.defaultValueCodeableConcept = value;
    }

    /**
     * 取得 defaultValueCoding 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getDefaultValueCoding() {
        return defaultValueCoding;
    }

    /**
     * 設定 defaultValueCoding 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setDefaultValueCoding(Coding value) {
        this.defaultValueCoding = value;
    }

    /**
     * 取得 defaultValueQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getDefaultValueQuantity() {
        return defaultValueQuantity;
    }

    /**
     * 設定 defaultValueQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setDefaultValueQuantity(Quantity value) {
        this.defaultValueQuantity = value;
    }

    /**
     * 取得 defaultValueRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getDefaultValueRange() {
        return defaultValueRange;
    }

    /**
     * 設定 defaultValueRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setDefaultValueRange(Range value) {
        this.defaultValueRange = value;
    }

    /**
     * 取得 defaultValuePeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getDefaultValuePeriod() {
        return defaultValuePeriod;
    }

    /**
     * 設定 defaultValuePeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setDefaultValuePeriod(Period value) {
        this.defaultValuePeriod = value;
    }

    /**
     * 取得 defaultValueRatio 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getDefaultValueRatio() {
        return defaultValueRatio;
    }

    /**
     * 設定 defaultValueRatio 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setDefaultValueRatio(Ratio value) {
        this.defaultValueRatio = value;
    }

    /**
     * 取得 defaultValueReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getDefaultValueReference() {
        return defaultValueReference;
    }

    /**
     * 設定 defaultValueReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setDefaultValueReference(Reference value) {
        this.defaultValueReference = value;
    }

    /**
     * 取得 defaultValueSampledData 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SampledData }
     *     
     */
    public SampledData getDefaultValueSampledData() {
        return defaultValueSampledData;
    }

    /**
     * 設定 defaultValueSampledData 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledData }
     *     
     */
    public void setDefaultValueSampledData(SampledData value) {
        this.defaultValueSampledData = value;
    }

    /**
     * 取得 defaultValueSignature 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getDefaultValueSignature() {
        return defaultValueSignature;
    }

    /**
     * 設定 defaultValueSignature 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setDefaultValueSignature(Signature value) {
        this.defaultValueSignature = value;
    }

    /**
     * 取得 defaultValueHumanName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getDefaultValueHumanName() {
        return defaultValueHumanName;
    }

    /**
     * 設定 defaultValueHumanName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setDefaultValueHumanName(HumanName value) {
        this.defaultValueHumanName = value;
    }

    /**
     * 取得 defaultValueAddress 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDefaultValueAddress() {
        return defaultValueAddress;
    }

    /**
     * 設定 defaultValueAddress 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDefaultValueAddress(Address value) {
        this.defaultValueAddress = value;
    }

    /**
     * 取得 defaultValueContactPoint 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ContactPoint }
     *     
     */
    public ContactPoint getDefaultValueContactPoint() {
        return defaultValueContactPoint;
    }

    /**
     * 設定 defaultValueContactPoint 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPoint }
     *     
     */
    public void setDefaultValueContactPoint(ContactPoint value) {
        this.defaultValueContactPoint = value;
    }

    /**
     * 取得 defaultValueTiming 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getDefaultValueTiming() {
        return defaultValueTiming;
    }

    /**
     * 設定 defaultValueTiming 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setDefaultValueTiming(Timing value) {
        this.defaultValueTiming = value;
    }

    /**
     * 取得 defaultValueMeta 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getDefaultValueMeta() {
        return defaultValueMeta;
    }

    /**
     * 設定 defaultValueMeta 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setDefaultValueMeta(Meta value) {
        this.defaultValueMeta = value;
    }

    /**
     * 取得 meaningWhenMissing 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getMeaningWhenMissing() {
        return meaningWhenMissing;
    }

    /**
     * 設定 meaningWhenMissing 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setMeaningWhenMissing(Markdown value) {
        this.meaningWhenMissing = value;
    }

    /**
     * 取得 fixedBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getFixedBoolean() {
        return fixedBoolean;
    }

    /**
     * 設定 fixedBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setFixedBoolean(BooleanDt value) {
        this.fixedBoolean = value;
    }

    /**
     * 取得 fixedInteger 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getFixedInteger() {
        return fixedInteger;
    }

    /**
     * 設定 fixedInteger 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setFixedInteger(IntegerDt value) {
        this.fixedInteger = value;
    }

    /**
     * 取得 fixedDecimal 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getFixedDecimal() {
        return fixedDecimal;
    }

    /**
     * 設定 fixedDecimal 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setFixedDecimal(Decimal value) {
        this.fixedDecimal = value;
    }

    /**
     * 取得 fixedBase64Binary 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getFixedBase64Binary() {
        return fixedBase64Binary;
    }

    /**
     * 設定 fixedBase64Binary 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setFixedBase64Binary(Base64Binary value) {
        this.fixedBase64Binary = value;
    }

    /**
     * 取得 fixedInstant 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getFixedInstant() {
        return fixedInstant;
    }

    /**
     * 設定 fixedInstant 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setFixedInstant(Instant value) {
        this.fixedInstant = value;
    }

    /**
     * 取得 fixedString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getFixedString() {
        return fixedString;
    }

    /**
     * 設定 fixedString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setFixedString(StringDt value) {
        this.fixedString = value;
    }

    /**
     * 取得 fixedUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getFixedUri() {
        return fixedUri;
    }

    /**
     * 設定 fixedUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setFixedUri(Uri value) {
        this.fixedUri = value;
    }

    /**
     * 取得 fixedDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFixedDate() {
        return fixedDate;
    }

    /**
     * 設定 fixedDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFixedDate(Date value) {
        this.fixedDate = value;
    }

    /**
     * 取得 fixedDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getFixedDateTime() {
        return fixedDateTime;
    }

    /**
     * 設定 fixedDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setFixedDateTime(DateTime value) {
        this.fixedDateTime = value;
    }

    /**
     * 取得 fixedTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getFixedTime() {
        return fixedTime;
    }

    /**
     * 設定 fixedTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setFixedTime(Time value) {
        this.fixedTime = value;
    }

    /**
     * 取得 fixedCode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getFixedCode() {
        return fixedCode;
    }

    /**
     * 設定 fixedCode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setFixedCode(Code value) {
        this.fixedCode = value;
    }

    /**
     * 取得 fixedOid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getFixedOid() {
        return fixedOid;
    }

    /**
     * 設定 fixedOid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setFixedOid(Oid value) {
        this.fixedOid = value;
    }

    /**
     * 取得 fixedUuid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uuid }
     *     
     */
    public Uuid getFixedUuid() {
        return fixedUuid;
    }

    /**
     * 設定 fixedUuid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uuid }
     *     
     */
    public void setFixedUuid(Uuid value) {
        this.fixedUuid = value;
    }

    /**
     * 取得 fixedId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getFixedId() {
        return fixedId;
    }

    /**
     * 設定 fixedId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setFixedId(Id value) {
        this.fixedId = value;
    }

    /**
     * 取得 fixedUnsignedInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getFixedUnsignedInt() {
        return fixedUnsignedInt;
    }

    /**
     * 設定 fixedUnsignedInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setFixedUnsignedInt(UnsignedInt value) {
        this.fixedUnsignedInt = value;
    }

    /**
     * 取得 fixedPositiveInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getFixedPositiveInt() {
        return fixedPositiveInt;
    }

    /**
     * 設定 fixedPositiveInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setFixedPositiveInt(PositiveInt value) {
        this.fixedPositiveInt = value;
    }

    /**
     * 取得 fixedMarkdown 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getFixedMarkdown() {
        return fixedMarkdown;
    }

    /**
     * 設定 fixedMarkdown 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setFixedMarkdown(Markdown value) {
        this.fixedMarkdown = value;
    }

    /**
     * 取得 fixedAnnotation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getFixedAnnotation() {
        return fixedAnnotation;
    }

    /**
     * 設定 fixedAnnotation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setFixedAnnotation(Annotation value) {
        this.fixedAnnotation = value;
    }

    /**
     * 取得 fixedAttachment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getFixedAttachment() {
        return fixedAttachment;
    }

    /**
     * 設定 fixedAttachment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setFixedAttachment(Attachment value) {
        this.fixedAttachment = value;
    }

    /**
     * 取得 fixedIdentifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getFixedIdentifier() {
        return fixedIdentifier;
    }

    /**
     * 設定 fixedIdentifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setFixedIdentifier(Identifier value) {
        this.fixedIdentifier = value;
    }

    /**
     * 取得 fixedCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getFixedCodeableConcept() {
        return fixedCodeableConcept;
    }

    /**
     * 設定 fixedCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setFixedCodeableConcept(CodeableConcept value) {
        this.fixedCodeableConcept = value;
    }

    /**
     * 取得 fixedCoding 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getFixedCoding() {
        return fixedCoding;
    }

    /**
     * 設定 fixedCoding 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setFixedCoding(Coding value) {
        this.fixedCoding = value;
    }

    /**
     * 取得 fixedQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getFixedQuantity() {
        return fixedQuantity;
    }

    /**
     * 設定 fixedQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setFixedQuantity(Quantity value) {
        this.fixedQuantity = value;
    }

    /**
     * 取得 fixedRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getFixedRange() {
        return fixedRange;
    }

    /**
     * 設定 fixedRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setFixedRange(Range value) {
        this.fixedRange = value;
    }

    /**
     * 取得 fixedPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getFixedPeriod() {
        return fixedPeriod;
    }

    /**
     * 設定 fixedPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setFixedPeriod(Period value) {
        this.fixedPeriod = value;
    }

    /**
     * 取得 fixedRatio 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getFixedRatio() {
        return fixedRatio;
    }

    /**
     * 設定 fixedRatio 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setFixedRatio(Ratio value) {
        this.fixedRatio = value;
    }

    /**
     * 取得 fixedReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getFixedReference() {
        return fixedReference;
    }

    /**
     * 設定 fixedReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setFixedReference(Reference value) {
        this.fixedReference = value;
    }

    /**
     * 取得 fixedSampledData 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SampledData }
     *     
     */
    public SampledData getFixedSampledData() {
        return fixedSampledData;
    }

    /**
     * 設定 fixedSampledData 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledData }
     *     
     */
    public void setFixedSampledData(SampledData value) {
        this.fixedSampledData = value;
    }

    /**
     * 取得 fixedSignature 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getFixedSignature() {
        return fixedSignature;
    }

    /**
     * 設定 fixedSignature 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setFixedSignature(Signature value) {
        this.fixedSignature = value;
    }

    /**
     * 取得 fixedHumanName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getFixedHumanName() {
        return fixedHumanName;
    }

    /**
     * 設定 fixedHumanName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setFixedHumanName(HumanName value) {
        this.fixedHumanName = value;
    }

    /**
     * 取得 fixedAddress 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getFixedAddress() {
        return fixedAddress;
    }

    /**
     * 設定 fixedAddress 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setFixedAddress(Address value) {
        this.fixedAddress = value;
    }

    /**
     * 取得 fixedContactPoint 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ContactPoint }
     *     
     */
    public ContactPoint getFixedContactPoint() {
        return fixedContactPoint;
    }

    /**
     * 設定 fixedContactPoint 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPoint }
     *     
     */
    public void setFixedContactPoint(ContactPoint value) {
        this.fixedContactPoint = value;
    }

    /**
     * 取得 fixedTiming 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getFixedTiming() {
        return fixedTiming;
    }

    /**
     * 設定 fixedTiming 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setFixedTiming(Timing value) {
        this.fixedTiming = value;
    }

    /**
     * 取得 fixedMeta 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getFixedMeta() {
        return fixedMeta;
    }

    /**
     * 設定 fixedMeta 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setFixedMeta(Meta value) {
        this.fixedMeta = value;
    }

    /**
     * 取得 patternBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getPatternBoolean() {
        return patternBoolean;
    }

    /**
     * 設定 patternBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setPatternBoolean(BooleanDt value) {
        this.patternBoolean = value;
    }

    /**
     * 取得 patternInteger 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getPatternInteger() {
        return patternInteger;
    }

    /**
     * 設定 patternInteger 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setPatternInteger(IntegerDt value) {
        this.patternInteger = value;
    }

    /**
     * 取得 patternDecimal 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPatternDecimal() {
        return patternDecimal;
    }

    /**
     * 設定 patternDecimal 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPatternDecimal(Decimal value) {
        this.patternDecimal = value;
    }

    /**
     * 取得 patternBase64Binary 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getPatternBase64Binary() {
        return patternBase64Binary;
    }

    /**
     * 設定 patternBase64Binary 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setPatternBase64Binary(Base64Binary value) {
        this.patternBase64Binary = value;
    }

    /**
     * 取得 patternInstant 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getPatternInstant() {
        return patternInstant;
    }

    /**
     * 設定 patternInstant 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setPatternInstant(Instant value) {
        this.patternInstant = value;
    }

    /**
     * 取得 patternString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getPatternString() {
        return patternString;
    }

    /**
     * 設定 patternString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setPatternString(StringDt value) {
        this.patternString = value;
    }

    /**
     * 取得 patternUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getPatternUri() {
        return patternUri;
    }

    /**
     * 設定 patternUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setPatternUri(Uri value) {
        this.patternUri = value;
    }

    /**
     * 取得 patternDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getPatternDate() {
        return patternDate;
    }

    /**
     * 設定 patternDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setPatternDate(Date value) {
        this.patternDate = value;
    }

    /**
     * 取得 patternDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getPatternDateTime() {
        return patternDateTime;
    }

    /**
     * 設定 patternDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setPatternDateTime(DateTime value) {
        this.patternDateTime = value;
    }

    /**
     * 取得 patternTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getPatternTime() {
        return patternTime;
    }

    /**
     * 設定 patternTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setPatternTime(Time value) {
        this.patternTime = value;
    }

    /**
     * 取得 patternCode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPatternCode() {
        return patternCode;
    }

    /**
     * 設定 patternCode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPatternCode(Code value) {
        this.patternCode = value;
    }

    /**
     * 取得 patternOid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getPatternOid() {
        return patternOid;
    }

    /**
     * 設定 patternOid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setPatternOid(Oid value) {
        this.patternOid = value;
    }

    /**
     * 取得 patternUuid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uuid }
     *     
     */
    public Uuid getPatternUuid() {
        return patternUuid;
    }

    /**
     * 設定 patternUuid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uuid }
     *     
     */
    public void setPatternUuid(Uuid value) {
        this.patternUuid = value;
    }

    /**
     * 取得 patternId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getPatternId() {
        return patternId;
    }

    /**
     * 設定 patternId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setPatternId(Id value) {
        this.patternId = value;
    }

    /**
     * 取得 patternUnsignedInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getPatternUnsignedInt() {
        return patternUnsignedInt;
    }

    /**
     * 設定 patternUnsignedInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setPatternUnsignedInt(UnsignedInt value) {
        this.patternUnsignedInt = value;
    }

    /**
     * 取得 patternPositiveInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getPatternPositiveInt() {
        return patternPositiveInt;
    }

    /**
     * 設定 patternPositiveInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setPatternPositiveInt(PositiveInt value) {
        this.patternPositiveInt = value;
    }

    /**
     * 取得 patternMarkdown 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getPatternMarkdown() {
        return patternMarkdown;
    }

    /**
     * 設定 patternMarkdown 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setPatternMarkdown(Markdown value) {
        this.patternMarkdown = value;
    }

    /**
     * 取得 patternAnnotation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getPatternAnnotation() {
        return patternAnnotation;
    }

    /**
     * 設定 patternAnnotation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setPatternAnnotation(Annotation value) {
        this.patternAnnotation = value;
    }

    /**
     * 取得 patternAttachment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getPatternAttachment() {
        return patternAttachment;
    }

    /**
     * 設定 patternAttachment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setPatternAttachment(Attachment value) {
        this.patternAttachment = value;
    }

    /**
     * 取得 patternIdentifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getPatternIdentifier() {
        return patternIdentifier;
    }

    /**
     * 設定 patternIdentifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setPatternIdentifier(Identifier value) {
        this.patternIdentifier = value;
    }

    /**
     * 取得 patternCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getPatternCodeableConcept() {
        return patternCodeableConcept;
    }

    /**
     * 設定 patternCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setPatternCodeableConcept(CodeableConcept value) {
        this.patternCodeableConcept = value;
    }

    /**
     * 取得 patternCoding 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getPatternCoding() {
        return patternCoding;
    }

    /**
     * 設定 patternCoding 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setPatternCoding(Coding value) {
        this.patternCoding = value;
    }

    /**
     * 取得 patternQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getPatternQuantity() {
        return patternQuantity;
    }

    /**
     * 設定 patternQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setPatternQuantity(Quantity value) {
        this.patternQuantity = value;
    }

    /**
     * 取得 patternRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getPatternRange() {
        return patternRange;
    }

    /**
     * 設定 patternRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setPatternRange(Range value) {
        this.patternRange = value;
    }

    /**
     * 取得 patternPeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPatternPeriod() {
        return patternPeriod;
    }

    /**
     * 設定 patternPeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPatternPeriod(Period value) {
        this.patternPeriod = value;
    }

    /**
     * 取得 patternRatio 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getPatternRatio() {
        return patternRatio;
    }

    /**
     * 設定 patternRatio 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setPatternRatio(Ratio value) {
        this.patternRatio = value;
    }

    /**
     * 取得 patternReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPatternReference() {
        return patternReference;
    }

    /**
     * 設定 patternReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPatternReference(Reference value) {
        this.patternReference = value;
    }

    /**
     * 取得 patternSampledData 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SampledData }
     *     
     */
    public SampledData getPatternSampledData() {
        return patternSampledData;
    }

    /**
     * 設定 patternSampledData 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledData }
     *     
     */
    public void setPatternSampledData(SampledData value) {
        this.patternSampledData = value;
    }

    /**
     * 取得 patternSignature 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getPatternSignature() {
        return patternSignature;
    }

    /**
     * 設定 patternSignature 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setPatternSignature(Signature value) {
        this.patternSignature = value;
    }

    /**
     * 取得 patternHumanName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getPatternHumanName() {
        return patternHumanName;
    }

    /**
     * 設定 patternHumanName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setPatternHumanName(HumanName value) {
        this.patternHumanName = value;
    }

    /**
     * 取得 patternAddress 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getPatternAddress() {
        return patternAddress;
    }

    /**
     * 設定 patternAddress 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPatternAddress(Address value) {
        this.patternAddress = value;
    }

    /**
     * 取得 patternContactPoint 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ContactPoint }
     *     
     */
    public ContactPoint getPatternContactPoint() {
        return patternContactPoint;
    }

    /**
     * 設定 patternContactPoint 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPoint }
     *     
     */
    public void setPatternContactPoint(ContactPoint value) {
        this.patternContactPoint = value;
    }

    /**
     * 取得 patternTiming 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getPatternTiming() {
        return patternTiming;
    }

    /**
     * 設定 patternTiming 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setPatternTiming(Timing value) {
        this.patternTiming = value;
    }

    /**
     * 取得 patternMeta 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getPatternMeta() {
        return patternMeta;
    }

    /**
     * 設定 patternMeta 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setPatternMeta(Meta value) {
        this.patternMeta = value;
    }

    /**
     * 取得 exampleBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getExampleBoolean() {
        return exampleBoolean;
    }

    /**
     * 設定 exampleBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setExampleBoolean(BooleanDt value) {
        this.exampleBoolean = value;
    }

    /**
     * 取得 exampleInteger 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getExampleInteger() {
        return exampleInteger;
    }

    /**
     * 設定 exampleInteger 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setExampleInteger(IntegerDt value) {
        this.exampleInteger = value;
    }

    /**
     * 取得 exampleDecimal 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getExampleDecimal() {
        return exampleDecimal;
    }

    /**
     * 設定 exampleDecimal 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setExampleDecimal(Decimal value) {
        this.exampleDecimal = value;
    }

    /**
     * 取得 exampleBase64Binary 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getExampleBase64Binary() {
        return exampleBase64Binary;
    }

    /**
     * 設定 exampleBase64Binary 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setExampleBase64Binary(Base64Binary value) {
        this.exampleBase64Binary = value;
    }

    /**
     * 取得 exampleInstant 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getExampleInstant() {
        return exampleInstant;
    }

    /**
     * 設定 exampleInstant 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setExampleInstant(Instant value) {
        this.exampleInstant = value;
    }

    /**
     * 取得 exampleString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getExampleString() {
        return exampleString;
    }

    /**
     * 設定 exampleString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setExampleString(StringDt value) {
        this.exampleString = value;
    }

    /**
     * 取得 exampleUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getExampleUri() {
        return exampleUri;
    }

    /**
     * 設定 exampleUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setExampleUri(Uri value) {
        this.exampleUri = value;
    }

    /**
     * 取得 exampleDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getExampleDate() {
        return exampleDate;
    }

    /**
     * 設定 exampleDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExampleDate(Date value) {
        this.exampleDate = value;
    }

    /**
     * 取得 exampleDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getExampleDateTime() {
        return exampleDateTime;
    }

    /**
     * 設定 exampleDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setExampleDateTime(DateTime value) {
        this.exampleDateTime = value;
    }

    /**
     * 取得 exampleTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getExampleTime() {
        return exampleTime;
    }

    /**
     * 設定 exampleTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setExampleTime(Time value) {
        this.exampleTime = value;
    }

    /**
     * 取得 exampleCode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getExampleCode() {
        return exampleCode;
    }

    /**
     * 設定 exampleCode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setExampleCode(Code value) {
        this.exampleCode = value;
    }

    /**
     * 取得 exampleOid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getExampleOid() {
        return exampleOid;
    }

    /**
     * 設定 exampleOid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setExampleOid(Oid value) {
        this.exampleOid = value;
    }

    /**
     * 取得 exampleUuid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uuid }
     *     
     */
    public Uuid getExampleUuid() {
        return exampleUuid;
    }

    /**
     * 設定 exampleUuid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uuid }
     *     
     */
    public void setExampleUuid(Uuid value) {
        this.exampleUuid = value;
    }

    /**
     * 取得 exampleId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getExampleId() {
        return exampleId;
    }

    /**
     * 設定 exampleId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setExampleId(Id value) {
        this.exampleId = value;
    }

    /**
     * 取得 exampleUnsignedInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getExampleUnsignedInt() {
        return exampleUnsignedInt;
    }

    /**
     * 設定 exampleUnsignedInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setExampleUnsignedInt(UnsignedInt value) {
        this.exampleUnsignedInt = value;
    }

    /**
     * 取得 examplePositiveInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getExamplePositiveInt() {
        return examplePositiveInt;
    }

    /**
     * 設定 examplePositiveInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setExamplePositiveInt(PositiveInt value) {
        this.examplePositiveInt = value;
    }

    /**
     * 取得 exampleMarkdown 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getExampleMarkdown() {
        return exampleMarkdown;
    }

    /**
     * 設定 exampleMarkdown 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setExampleMarkdown(Markdown value) {
        this.exampleMarkdown = value;
    }

    /**
     * 取得 exampleAnnotation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getExampleAnnotation() {
        return exampleAnnotation;
    }

    /**
     * 設定 exampleAnnotation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setExampleAnnotation(Annotation value) {
        this.exampleAnnotation = value;
    }

    /**
     * 取得 exampleAttachment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getExampleAttachment() {
        return exampleAttachment;
    }

    /**
     * 設定 exampleAttachment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setExampleAttachment(Attachment value) {
        this.exampleAttachment = value;
    }

    /**
     * 取得 exampleIdentifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getExampleIdentifier() {
        return exampleIdentifier;
    }

    /**
     * 設定 exampleIdentifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setExampleIdentifier(Identifier value) {
        this.exampleIdentifier = value;
    }

    /**
     * 取得 exampleCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getExampleCodeableConcept() {
        return exampleCodeableConcept;
    }

    /**
     * 設定 exampleCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setExampleCodeableConcept(CodeableConcept value) {
        this.exampleCodeableConcept = value;
    }

    /**
     * 取得 exampleCoding 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getExampleCoding() {
        return exampleCoding;
    }

    /**
     * 設定 exampleCoding 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setExampleCoding(Coding value) {
        this.exampleCoding = value;
    }

    /**
     * 取得 exampleQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getExampleQuantity() {
        return exampleQuantity;
    }

    /**
     * 設定 exampleQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setExampleQuantity(Quantity value) {
        this.exampleQuantity = value;
    }

    /**
     * 取得 exampleRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getExampleRange() {
        return exampleRange;
    }

    /**
     * 設定 exampleRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setExampleRange(Range value) {
        this.exampleRange = value;
    }

    /**
     * 取得 examplePeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getExamplePeriod() {
        return examplePeriod;
    }

    /**
     * 設定 examplePeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setExamplePeriod(Period value) {
        this.examplePeriod = value;
    }

    /**
     * 取得 exampleRatio 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getExampleRatio() {
        return exampleRatio;
    }

    /**
     * 設定 exampleRatio 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setExampleRatio(Ratio value) {
        this.exampleRatio = value;
    }

    /**
     * 取得 exampleReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getExampleReference() {
        return exampleReference;
    }

    /**
     * 設定 exampleReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setExampleReference(Reference value) {
        this.exampleReference = value;
    }

    /**
     * 取得 exampleSampledData 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SampledData }
     *     
     */
    public SampledData getExampleSampledData() {
        return exampleSampledData;
    }

    /**
     * 設定 exampleSampledData 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledData }
     *     
     */
    public void setExampleSampledData(SampledData value) {
        this.exampleSampledData = value;
    }

    /**
     * 取得 exampleSignature 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getExampleSignature() {
        return exampleSignature;
    }

    /**
     * 設定 exampleSignature 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setExampleSignature(Signature value) {
        this.exampleSignature = value;
    }

    /**
     * 取得 exampleHumanName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getExampleHumanName() {
        return exampleHumanName;
    }

    /**
     * 設定 exampleHumanName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setExampleHumanName(HumanName value) {
        this.exampleHumanName = value;
    }

    /**
     * 取得 exampleAddress 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getExampleAddress() {
        return exampleAddress;
    }

    /**
     * 設定 exampleAddress 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setExampleAddress(Address value) {
        this.exampleAddress = value;
    }

    /**
     * 取得 exampleContactPoint 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ContactPoint }
     *     
     */
    public ContactPoint getExampleContactPoint() {
        return exampleContactPoint;
    }

    /**
     * 設定 exampleContactPoint 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPoint }
     *     
     */
    public void setExampleContactPoint(ContactPoint value) {
        this.exampleContactPoint = value;
    }

    /**
     * 取得 exampleTiming 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getExampleTiming() {
        return exampleTiming;
    }

    /**
     * 設定 exampleTiming 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setExampleTiming(Timing value) {
        this.exampleTiming = value;
    }

    /**
     * 取得 exampleMeta 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getExampleMeta() {
        return exampleMeta;
    }

    /**
     * 設定 exampleMeta 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setExampleMeta(Meta value) {
        this.exampleMeta = value;
    }

    /**
     * 取得 minValueBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getMinValueBoolean() {
        return minValueBoolean;
    }

    /**
     * 設定 minValueBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setMinValueBoolean(BooleanDt value) {
        this.minValueBoolean = value;
    }

    /**
     * 取得 minValueInteger 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getMinValueInteger() {
        return minValueInteger;
    }

    /**
     * 設定 minValueInteger 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setMinValueInteger(IntegerDt value) {
        this.minValueInteger = value;
    }

    /**
     * 取得 minValueDecimal 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getMinValueDecimal() {
        return minValueDecimal;
    }

    /**
     * 設定 minValueDecimal 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setMinValueDecimal(Decimal value) {
        this.minValueDecimal = value;
    }

    /**
     * 取得 minValueBase64Binary 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getMinValueBase64Binary() {
        return minValueBase64Binary;
    }

    /**
     * 設定 minValueBase64Binary 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setMinValueBase64Binary(Base64Binary value) {
        this.minValueBase64Binary = value;
    }

    /**
     * 取得 minValueInstant 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getMinValueInstant() {
        return minValueInstant;
    }

    /**
     * 設定 minValueInstant 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setMinValueInstant(Instant value) {
        this.minValueInstant = value;
    }

    /**
     * 取得 minValueString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getMinValueString() {
        return minValueString;
    }

    /**
     * 設定 minValueString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setMinValueString(StringDt value) {
        this.minValueString = value;
    }

    /**
     * 取得 minValueUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getMinValueUri() {
        return minValueUri;
    }

    /**
     * 設定 minValueUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setMinValueUri(Uri value) {
        this.minValueUri = value;
    }

    /**
     * 取得 minValueDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getMinValueDate() {
        return minValueDate;
    }

    /**
     * 設定 minValueDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setMinValueDate(Date value) {
        this.minValueDate = value;
    }

    /**
     * 取得 minValueDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getMinValueDateTime() {
        return minValueDateTime;
    }

    /**
     * 設定 minValueDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setMinValueDateTime(DateTime value) {
        this.minValueDateTime = value;
    }

    /**
     * 取得 minValueTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getMinValueTime() {
        return minValueTime;
    }

    /**
     * 設定 minValueTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setMinValueTime(Time value) {
        this.minValueTime = value;
    }

    /**
     * 取得 minValueCode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMinValueCode() {
        return minValueCode;
    }

    /**
     * 設定 minValueCode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMinValueCode(Code value) {
        this.minValueCode = value;
    }

    /**
     * 取得 minValueOid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getMinValueOid() {
        return minValueOid;
    }

    /**
     * 設定 minValueOid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setMinValueOid(Oid value) {
        this.minValueOid = value;
    }

    /**
     * 取得 minValueUuid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uuid }
     *     
     */
    public Uuid getMinValueUuid() {
        return minValueUuid;
    }

    /**
     * 設定 minValueUuid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uuid }
     *     
     */
    public void setMinValueUuid(Uuid value) {
        this.minValueUuid = value;
    }

    /**
     * 取得 minValueId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getMinValueId() {
        return minValueId;
    }

    /**
     * 設定 minValueId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setMinValueId(Id value) {
        this.minValueId = value;
    }

    /**
     * 取得 minValueUnsignedInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getMinValueUnsignedInt() {
        return minValueUnsignedInt;
    }

    /**
     * 設定 minValueUnsignedInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setMinValueUnsignedInt(UnsignedInt value) {
        this.minValueUnsignedInt = value;
    }

    /**
     * 取得 minValuePositiveInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getMinValuePositiveInt() {
        return minValuePositiveInt;
    }

    /**
     * 設定 minValuePositiveInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setMinValuePositiveInt(PositiveInt value) {
        this.minValuePositiveInt = value;
    }

    /**
     * 取得 minValueMarkdown 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getMinValueMarkdown() {
        return minValueMarkdown;
    }

    /**
     * 設定 minValueMarkdown 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setMinValueMarkdown(Markdown value) {
        this.minValueMarkdown = value;
    }

    /**
     * 取得 minValueAnnotation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getMinValueAnnotation() {
        return minValueAnnotation;
    }

    /**
     * 設定 minValueAnnotation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setMinValueAnnotation(Annotation value) {
        this.minValueAnnotation = value;
    }

    /**
     * 取得 minValueAttachment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getMinValueAttachment() {
        return minValueAttachment;
    }

    /**
     * 設定 minValueAttachment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setMinValueAttachment(Attachment value) {
        this.minValueAttachment = value;
    }

    /**
     * 取得 minValueIdentifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getMinValueIdentifier() {
        return minValueIdentifier;
    }

    /**
     * 設定 minValueIdentifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setMinValueIdentifier(Identifier value) {
        this.minValueIdentifier = value;
    }

    /**
     * 取得 minValueCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMinValueCodeableConcept() {
        return minValueCodeableConcept;
    }

    /**
     * 設定 minValueCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMinValueCodeableConcept(CodeableConcept value) {
        this.minValueCodeableConcept = value;
    }

    /**
     * 取得 minValueCoding 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getMinValueCoding() {
        return minValueCoding;
    }

    /**
     * 設定 minValueCoding 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setMinValueCoding(Coding value) {
        this.minValueCoding = value;
    }

    /**
     * 取得 minValueQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getMinValueQuantity() {
        return minValueQuantity;
    }

    /**
     * 設定 minValueQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setMinValueQuantity(Quantity value) {
        this.minValueQuantity = value;
    }

    /**
     * 取得 minValueRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getMinValueRange() {
        return minValueRange;
    }

    /**
     * 設定 minValueRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setMinValueRange(Range value) {
        this.minValueRange = value;
    }

    /**
     * 取得 minValuePeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getMinValuePeriod() {
        return minValuePeriod;
    }

    /**
     * 設定 minValuePeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setMinValuePeriod(Period value) {
        this.minValuePeriod = value;
    }

    /**
     * 取得 minValueRatio 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getMinValueRatio() {
        return minValueRatio;
    }

    /**
     * 設定 minValueRatio 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setMinValueRatio(Ratio value) {
        this.minValueRatio = value;
    }

    /**
     * 取得 minValueReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getMinValueReference() {
        return minValueReference;
    }

    /**
     * 設定 minValueReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setMinValueReference(Reference value) {
        this.minValueReference = value;
    }

    /**
     * 取得 minValueSampledData 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SampledData }
     *     
     */
    public SampledData getMinValueSampledData() {
        return minValueSampledData;
    }

    /**
     * 設定 minValueSampledData 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledData }
     *     
     */
    public void setMinValueSampledData(SampledData value) {
        this.minValueSampledData = value;
    }

    /**
     * 取得 minValueSignature 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getMinValueSignature() {
        return minValueSignature;
    }

    /**
     * 設定 minValueSignature 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setMinValueSignature(Signature value) {
        this.minValueSignature = value;
    }

    /**
     * 取得 minValueHumanName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getMinValueHumanName() {
        return minValueHumanName;
    }

    /**
     * 設定 minValueHumanName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setMinValueHumanName(HumanName value) {
        this.minValueHumanName = value;
    }

    /**
     * 取得 minValueAddress 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getMinValueAddress() {
        return minValueAddress;
    }

    /**
     * 設定 minValueAddress 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setMinValueAddress(Address value) {
        this.minValueAddress = value;
    }

    /**
     * 取得 minValueContactPoint 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ContactPoint }
     *     
     */
    public ContactPoint getMinValueContactPoint() {
        return minValueContactPoint;
    }

    /**
     * 設定 minValueContactPoint 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPoint }
     *     
     */
    public void setMinValueContactPoint(ContactPoint value) {
        this.minValueContactPoint = value;
    }

    /**
     * 取得 minValueTiming 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getMinValueTiming() {
        return minValueTiming;
    }

    /**
     * 設定 minValueTiming 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setMinValueTiming(Timing value) {
        this.minValueTiming = value;
    }

    /**
     * 取得 minValueMeta 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getMinValueMeta() {
        return minValueMeta;
    }

    /**
     * 設定 minValueMeta 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setMinValueMeta(Meta value) {
        this.minValueMeta = value;
    }

    /**
     * 取得 maxValueBoolean 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getMaxValueBoolean() {
        return maxValueBoolean;
    }

    /**
     * 設定 maxValueBoolean 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setMaxValueBoolean(BooleanDt value) {
        this.maxValueBoolean = value;
    }

    /**
     * 取得 maxValueInteger 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getMaxValueInteger() {
        return maxValueInteger;
    }

    /**
     * 設定 maxValueInteger 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setMaxValueInteger(IntegerDt value) {
        this.maxValueInteger = value;
    }

    /**
     * 取得 maxValueDecimal 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getMaxValueDecimal() {
        return maxValueDecimal;
    }

    /**
     * 設定 maxValueDecimal 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setMaxValueDecimal(Decimal value) {
        this.maxValueDecimal = value;
    }

    /**
     * 取得 maxValueBase64Binary 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getMaxValueBase64Binary() {
        return maxValueBase64Binary;
    }

    /**
     * 設定 maxValueBase64Binary 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setMaxValueBase64Binary(Base64Binary value) {
        this.maxValueBase64Binary = value;
    }

    /**
     * 取得 maxValueInstant 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getMaxValueInstant() {
        return maxValueInstant;
    }

    /**
     * 設定 maxValueInstant 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setMaxValueInstant(Instant value) {
        this.maxValueInstant = value;
    }

    /**
     * 取得 maxValueString 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getMaxValueString() {
        return maxValueString;
    }

    /**
     * 設定 maxValueString 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setMaxValueString(StringDt value) {
        this.maxValueString = value;
    }

    /**
     * 取得 maxValueUri 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getMaxValueUri() {
        return maxValueUri;
    }

    /**
     * 設定 maxValueUri 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setMaxValueUri(Uri value) {
        this.maxValueUri = value;
    }

    /**
     * 取得 maxValueDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getMaxValueDate() {
        return maxValueDate;
    }

    /**
     * 設定 maxValueDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setMaxValueDate(Date value) {
        this.maxValueDate = value;
    }

    /**
     * 取得 maxValueDateTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getMaxValueDateTime() {
        return maxValueDateTime;
    }

    /**
     * 設定 maxValueDateTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setMaxValueDateTime(DateTime value) {
        this.maxValueDateTime = value;
    }

    /**
     * 取得 maxValueTime 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getMaxValueTime() {
        return maxValueTime;
    }

    /**
     * 設定 maxValueTime 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setMaxValueTime(Time value) {
        this.maxValueTime = value;
    }

    /**
     * 取得 maxValueCode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMaxValueCode() {
        return maxValueCode;
    }

    /**
     * 設定 maxValueCode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMaxValueCode(Code value) {
        this.maxValueCode = value;
    }

    /**
     * 取得 maxValueOid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getMaxValueOid() {
        return maxValueOid;
    }

    /**
     * 設定 maxValueOid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setMaxValueOid(Oid value) {
        this.maxValueOid = value;
    }

    /**
     * 取得 maxValueUuid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uuid }
     *     
     */
    public Uuid getMaxValueUuid() {
        return maxValueUuid;
    }

    /**
     * 設定 maxValueUuid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uuid }
     *     
     */
    public void setMaxValueUuid(Uuid value) {
        this.maxValueUuid = value;
    }

    /**
     * 取得 maxValueId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getMaxValueId() {
        return maxValueId;
    }

    /**
     * 設定 maxValueId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setMaxValueId(Id value) {
        this.maxValueId = value;
    }

    /**
     * 取得 maxValueUnsignedInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getMaxValueUnsignedInt() {
        return maxValueUnsignedInt;
    }

    /**
     * 設定 maxValueUnsignedInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setMaxValueUnsignedInt(UnsignedInt value) {
        this.maxValueUnsignedInt = value;
    }

    /**
     * 取得 maxValuePositiveInt 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getMaxValuePositiveInt() {
        return maxValuePositiveInt;
    }

    /**
     * 設定 maxValuePositiveInt 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setMaxValuePositiveInt(PositiveInt value) {
        this.maxValuePositiveInt = value;
    }

    /**
     * 取得 maxValueMarkdown 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getMaxValueMarkdown() {
        return maxValueMarkdown;
    }

    /**
     * 設定 maxValueMarkdown 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setMaxValueMarkdown(Markdown value) {
        this.maxValueMarkdown = value;
    }

    /**
     * 取得 maxValueAnnotation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getMaxValueAnnotation() {
        return maxValueAnnotation;
    }

    /**
     * 設定 maxValueAnnotation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setMaxValueAnnotation(Annotation value) {
        this.maxValueAnnotation = value;
    }

    /**
     * 取得 maxValueAttachment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getMaxValueAttachment() {
        return maxValueAttachment;
    }

    /**
     * 設定 maxValueAttachment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setMaxValueAttachment(Attachment value) {
        this.maxValueAttachment = value;
    }

    /**
     * 取得 maxValueIdentifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getMaxValueIdentifier() {
        return maxValueIdentifier;
    }

    /**
     * 設定 maxValueIdentifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setMaxValueIdentifier(Identifier value) {
        this.maxValueIdentifier = value;
    }

    /**
     * 取得 maxValueCodeableConcept 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMaxValueCodeableConcept() {
        return maxValueCodeableConcept;
    }

    /**
     * 設定 maxValueCodeableConcept 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMaxValueCodeableConcept(CodeableConcept value) {
        this.maxValueCodeableConcept = value;
    }

    /**
     * 取得 maxValueCoding 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getMaxValueCoding() {
        return maxValueCoding;
    }

    /**
     * 設定 maxValueCoding 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setMaxValueCoding(Coding value) {
        this.maxValueCoding = value;
    }

    /**
     * 取得 maxValueQuantity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getMaxValueQuantity() {
        return maxValueQuantity;
    }

    /**
     * 設定 maxValueQuantity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setMaxValueQuantity(Quantity value) {
        this.maxValueQuantity = value;
    }

    /**
     * 取得 maxValueRange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getMaxValueRange() {
        return maxValueRange;
    }

    /**
     * 設定 maxValueRange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setMaxValueRange(Range value) {
        this.maxValueRange = value;
    }

    /**
     * 取得 maxValuePeriod 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getMaxValuePeriod() {
        return maxValuePeriod;
    }

    /**
     * 設定 maxValuePeriod 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setMaxValuePeriod(Period value) {
        this.maxValuePeriod = value;
    }

    /**
     * 取得 maxValueRatio 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getMaxValueRatio() {
        return maxValueRatio;
    }

    /**
     * 設定 maxValueRatio 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setMaxValueRatio(Ratio value) {
        this.maxValueRatio = value;
    }

    /**
     * 取得 maxValueReference 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getMaxValueReference() {
        return maxValueReference;
    }

    /**
     * 設定 maxValueReference 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setMaxValueReference(Reference value) {
        this.maxValueReference = value;
    }

    /**
     * 取得 maxValueSampledData 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SampledData }
     *     
     */
    public SampledData getMaxValueSampledData() {
        return maxValueSampledData;
    }

    /**
     * 設定 maxValueSampledData 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledData }
     *     
     */
    public void setMaxValueSampledData(SampledData value) {
        this.maxValueSampledData = value;
    }

    /**
     * 取得 maxValueSignature 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getMaxValueSignature() {
        return maxValueSignature;
    }

    /**
     * 設定 maxValueSignature 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setMaxValueSignature(Signature value) {
        this.maxValueSignature = value;
    }

    /**
     * 取得 maxValueHumanName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getMaxValueHumanName() {
        return maxValueHumanName;
    }

    /**
     * 設定 maxValueHumanName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setMaxValueHumanName(HumanName value) {
        this.maxValueHumanName = value;
    }

    /**
     * 取得 maxValueAddress 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getMaxValueAddress() {
        return maxValueAddress;
    }

    /**
     * 設定 maxValueAddress 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setMaxValueAddress(Address value) {
        this.maxValueAddress = value;
    }

    /**
     * 取得 maxValueContactPoint 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ContactPoint }
     *     
     */
    public ContactPoint getMaxValueContactPoint() {
        return maxValueContactPoint;
    }

    /**
     * 設定 maxValueContactPoint 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPoint }
     *     
     */
    public void setMaxValueContactPoint(ContactPoint value) {
        this.maxValueContactPoint = value;
    }

    /**
     * 取得 maxValueTiming 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getMaxValueTiming() {
        return maxValueTiming;
    }

    /**
     * 設定 maxValueTiming 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setMaxValueTiming(Timing value) {
        this.maxValueTiming = value;
    }

    /**
     * 取得 maxValueMeta 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getMaxValueMeta() {
        return maxValueMeta;
    }

    /**
     * 設定 maxValueMeta 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setMaxValueMeta(Meta value) {
        this.maxValueMeta = value;
    }

    /**
     * 取得 maxLength 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getMaxLength() {
        return maxLength;
    }

    /**
     * 設定 maxLength 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setMaxLength(IntegerDt value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Id }
     * 
     * 
     */
    public List<Id> getCondition() {
        if (condition == null) {
            condition = new ArrayList<Id>();
        }
        return this.condition;
    }

    /**
     * Gets the value of the constraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDefinitionConstraint }
     * 
     * 
     */
    public List<ElementDefinitionConstraint> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<ElementDefinitionConstraint>();
        }
        return this.constraint;
    }

    /**
     * 取得 mustSupport 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getMustSupport() {
        return mustSupport;
    }

    /**
     * 設定 mustSupport 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setMustSupport(BooleanDt value) {
        this.mustSupport = value;
    }

    /**
     * 取得 isModifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getIsModifier() {
        return isModifier;
    }

    /**
     * 設定 isModifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setIsModifier(BooleanDt value) {
        this.isModifier = value;
    }

    /**
     * 取得 isSummary 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getIsSummary() {
        return isSummary;
    }

    /**
     * 設定 isSummary 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setIsSummary(BooleanDt value) {
        this.isSummary = value;
    }

    /**
     * 取得 binding 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ElementDefinitionBinding }
     *     
     */
    public ElementDefinitionBinding getBinding() {
        return binding;
    }

    /**
     * 設定 binding 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementDefinitionBinding }
     *     
     */
    public void setBinding(ElementDefinitionBinding value) {
        this.binding = value;
    }

    /**
     * Gets the value of the mapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDefinitionMapping }
     * 
     * 
     */
    public List<ElementDefinitionMapping> getMapping() {
        if (mapping == null) {
            mapping = new ArrayList<ElementDefinitionMapping>();
        }
        return this.mapping;
    }

}
