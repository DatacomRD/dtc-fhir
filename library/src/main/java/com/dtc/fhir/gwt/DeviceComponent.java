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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>DeviceComponent complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="DeviceComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier"/>
 *         &lt;element name="lastSystemChange" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="operationalStatus" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parameterGroup" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="measurementPrinciple" type="{http://hl7.org/fhir}Measmnt-Principle" minOccurs="0"/>
 *         &lt;element name="productionSpecification" type="{http://hl7.org/fhir}DeviceComponent.ProductionSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceComponent", propOrder = {
    "type",
    "identifier",
    "lastSystemChange",
    "source",
    "parent",
    "operationalStatus",
    "parameterGroup",
    "measurementPrinciple",
    "productionSpecification",
    "languageCode"
})
public class DeviceComponent
    extends DomainResource
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    @XmlElement(required = true)
    protected Identifier identifier;
    @XmlElement(required = true)
    protected Instant lastSystemChange;
    protected Reference source;
    protected Reference parent;
    protected List<CodeableConcept> operationalStatus;
    protected CodeableConcept parameterGroup;
    protected MeasmntPrinciple measurementPrinciple;
    protected List<DeviceComponentProductionSpecification> productionSpecification;
    protected CodeableConcept languageCode;

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

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
     * 取得 lastSystemChange 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getLastSystemChange() {
        return lastSystemChange;
    }

    /**
     * 設定 lastSystemChange 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setLastSystemChange(Instant value) {
        this.lastSystemChange = value;
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
     * 取得 parent 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getParent() {
        return parent;
    }

    /**
     * 設定 parent 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setParent(Reference value) {
        this.parent = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationalStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getOperationalStatus() {
        if (operationalStatus == null) {
            operationalStatus = new ArrayList<CodeableConcept>();
        }
        return this.operationalStatus;
    }

    /**
     * 取得 parameterGroup 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getParameterGroup() {
        return parameterGroup;
    }

    /**
     * 設定 parameterGroup 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setParameterGroup(CodeableConcept value) {
        this.parameterGroup = value;
    }

    /**
     * 取得 measurementPrinciple 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link MeasmntPrinciple }
     *     
     */
    public MeasmntPrinciple getMeasurementPrinciple() {
        return measurementPrinciple;
    }

    /**
     * 設定 measurementPrinciple 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasmntPrinciple }
     *     
     */
    public void setMeasurementPrinciple(MeasmntPrinciple value) {
        this.measurementPrinciple = value;
    }

    /**
     * Gets the value of the productionSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceComponentProductionSpecification }
     * 
     * 
     */
    public List<DeviceComponentProductionSpecification> getProductionSpecification() {
        if (productionSpecification == null) {
            productionSpecification = new ArrayList<DeviceComponentProductionSpecification>();
        }
        return this.productionSpecification;
    }

    /**
     * 取得 languageCode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getLanguageCode() {
        return languageCode;
    }

    /**
     * 設定 languageCode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setLanguageCode(CodeableConcept value) {
        this.languageCode = value;
    }

}
