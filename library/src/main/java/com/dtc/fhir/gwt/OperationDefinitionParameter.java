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
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 * 
 * <p>OperationDefinition.Parameter complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="OperationDefinition.Parameter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="use" type="{http://hl7.org/fhir}OperationParameterUse"/>
 *         &lt;element name="min" type="{http://hl7.org/fhir}integer"/>
 *         &lt;element name="max" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="profile" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="binding" type="{http://hl7.org/fhir}OperationDefinition.Binding" minOccurs="0"/>
 *         &lt;element name="part" type="{http://hl7.org/fhir}OperationDefinition.Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationDefinition.Parameter", propOrder = {
    "name",
    "use",
    "min",
    "max",
    "documentation",
    "type",
    "profile",
    "binding",
    "part"
})
public class OperationDefinitionParameter
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Code name;
    @XmlElement(required = true)
    protected OperationParameterUse use;
    @XmlElement(required = true)
    protected IntegerDt min;
    @XmlElement(required = true)
    protected StringDt max;
    protected StringDt documentation;
    protected Code type;
    protected Reference profile;
    protected OperationDefinitionBinding binding;
    protected List<OperationDefinitionParameter> part;

    /**
     * 取得 name 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getName() {
        return name;
    }

    /**
     * 設定 name 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setName(Code value) {
        this.name = value;
    }

    /**
     * 取得 use 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link OperationParameterUse }
     *     
     */
    public OperationParameterUse getUse() {
        return use;
    }

    /**
     * 設定 use 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationParameterUse }
     *     
     */
    public void setUse(OperationParameterUse value) {
        this.use = value;
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
     * 取得 documentation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDocumentation() {
        return documentation;
    }

    /**
     * 設定 documentation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDocumentation(StringDt value) {
        this.documentation = value;
    }

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setType(Code value) {
        this.type = value;
    }

    /**
     * 取得 profile 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getProfile() {
        return profile;
    }

    /**
     * 設定 profile 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setProfile(Reference value) {
        this.profile = value;
    }

    /**
     * 取得 binding 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link OperationDefinitionBinding }
     *     
     */
    public OperationDefinitionBinding getBinding() {
        return binding;
    }

    /**
     * 設定 binding 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationDefinitionBinding }
     *     
     */
    public void setBinding(OperationDefinitionBinding value) {
        this.binding = value;
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
     * {@link OperationDefinitionParameter }
     * 
     * 
     */
    public List<OperationDefinitionParameter> getPart() {
        if (part == null) {
            part = new ArrayList<OperationDefinitionParameter>();
        }
        return this.part;
    }

}
