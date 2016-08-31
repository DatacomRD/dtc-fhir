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
 * A collection of error, warning or information messages that result from a system action.
 * 
 * <p>OperationOutcome.Issue complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="OperationOutcome.Issue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="severity" type="{http://hl7.org/fhir}IssueSeverity"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}IssueType"/>
 *         &lt;element name="details" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="diagnostics" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationOutcome.Issue", propOrder = {
    "severity",
    "code",
    "details",
    "diagnostics",
    "location"
})
public class OperationOutcomeIssue
    extends BackboneElement
{

    @XmlElement(required = true)
    protected IssueSeverity severity;
    @XmlElement(required = true)
    protected IssueType code;
    protected CodeableConcept details;
    protected StringDt diagnostics;
    protected List<StringDt> location;

    /**
     * 取得 severity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IssueSeverity }
     *     
     */
    public IssueSeverity getSeverity() {
        return severity;
    }

    /**
     * 設定 severity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueSeverity }
     *     
     */
    public void setSeverity(IssueSeverity value) {
        this.severity = value;
    }

    /**
     * 取得 code 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IssueType }
     *     
     */
    public IssueType getCode() {
        return code;
    }

    /**
     * 設定 code 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueType }
     *     
     */
    public void setCode(IssueType value) {
        this.code = value;
    }

    /**
     * 取得 details 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDetails() {
        return details;
    }

    /**
     * 設定 details 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDetails(CodeableConcept value) {
        this.details = value;
    }

    /**
     * 取得 diagnostics 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDiagnostics() {
        return diagnostics;
    }

    /**
     * 設定 diagnostics 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDiagnostics(StringDt value) {
        this.diagnostics = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDt }
     * 
     * 
     */
    public List<StringDt> getLocation() {
        if (location == null) {
            location = new ArrayList<StringDt>();
        }
        return this.location;
    }

}
