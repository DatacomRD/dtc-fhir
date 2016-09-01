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
 * A value set specifies a set of codes drawn from one or more code systems.
 * 
 * <p>ValueSet.Concept complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Concept">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="abstract" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="display" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="definition" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="designation" type="{http://hl7.org/fhir}ValueSet.Designation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="concept" type="{http://hl7.org/fhir}ValueSet.Concept" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Concept", propOrder = {
    "code",
    "_abstract",
    "display",
    "definition",
    "designation",
    "concept"
})
public class ValueSetConcept
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Code code;
    @XmlElement(name = "abstract")
    protected BooleanDt _abstract;
    protected StringDt display;
    protected StringDt definition;
    protected List<ValueSetDesignation> designation;
    protected List<ValueSetConcept> concept;

    /**
     * 取得 code 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCode() {
        return code;
    }

    /**
     * 設定 code 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCode(Code value) {
        this.code = value;
    }

    /**
     * 取得 abstract 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getAbstract() {
        return _abstract;
    }

    /**
     * 設定 abstract 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setAbstract(BooleanDt value) {
        this._abstract = value;
    }

    /**
     * 取得 display 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDisplay() {
        return display;
    }

    /**
     * 設定 display 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDisplay(StringDt value) {
        this.display = value;
    }

    /**
     * 取得 definition 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDefinition() {
        return definition;
    }

    /**
     * 設定 definition 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDefinition(StringDt value) {
        this.definition = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetDesignation }
     * 
     * 
     */
    public List<ValueSetDesignation> getDesignation() {
        if (designation == null) {
            designation = new ArrayList<ValueSetDesignation>();
        }
        return this.designation;
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
     * {@link ValueSetConcept }
     * 
     * 
     */
    public List<ValueSetConcept> getConcept() {
        if (concept == null) {
            concept = new ArrayList<ValueSetConcept>();
        }
        return this.concept;
    }

}
