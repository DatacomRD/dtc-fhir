//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>QuestionnaireResponse complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="QuestionnaireResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="questionnaire" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}QuestionnaireResponseStatus"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="author" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="authored" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="group" type="{http://hl7.org/fhir}QuestionnaireResponse.Group" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionnaireResponse", propOrder = {
    "identifier",
    "questionnaire",
    "status",
    "subject",
    "author",
    "authored",
    "source",
    "encounter",
    "group"
})
public class QuestionnaireResponse
    extends DomainResource
{

    protected Identifier identifier;
    protected Reference questionnaire;
    @XmlElement(required = true)
    protected QuestionnaireResponseStatus status;
    protected Reference subject;
    protected Reference author;
    protected DateTime authored;
    protected Reference source;
    protected Reference encounter;
    protected QuestionnaireResponseGroup group;

    /**
     * 取得 identifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * 設定 identifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * 取得 questionnaire 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getQuestionnaire() {
        return questionnaire;
    }

    /**
     * 設定 questionnaire 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setQuestionnaire(Reference value) {
        this.questionnaire = value;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link QuestionnaireResponseStatus }
     *     
     */
    public QuestionnaireResponseStatus getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionnaireResponseStatus }
     *     
     */
    public void setStatus(QuestionnaireResponseStatus value) {
        this.status = value;
    }

    /**
     * 取得 subject 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSubject() {
        return subject;
    }

    /**
     * 設定 subject 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSubject(Reference value) {
        this.subject = value;
    }

    /**
     * 取得 author 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getAuthor() {
        return author;
    }

    /**
     * 設定 author 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setAuthor(Reference value) {
        this.author = value;
    }

    /**
     * 取得 authored 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getAuthored() {
        return authored;
    }

    /**
     * 設定 authored 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setAuthored(DateTime value) {
        this.authored = value;
    }

    /**
     * 取得 source 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSource() {
        return source;
    }

    /**
     * 設定 source 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSource(Reference value) {
        this.source = value;
    }

    /**
     * 取得 encounter 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * 設定 encounter 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setEncounter(Reference value) {
        this.encounter = value;
    }

    /**
     * 取得 group 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link QuestionnaireResponseGroup }
     *     
     */
    public QuestionnaireResponseGroup getGroup() {
        return group;
    }

    /**
     * 設定 group 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionnaireResponseGroup }
     *     
     */
    public void setGroup(QuestionnaireResponseGroup value) {
        this.group = value;
    }

}
