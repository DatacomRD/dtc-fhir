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
 * A conformance statement is a set of capabilities of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * 
 * <p>Conformance.Resource complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Resource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="profile" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="interaction" type="{http://hl7.org/fhir}Conformance.Interaction" maxOccurs="unbounded"/>
 *         &lt;element name="versioning" type="{http://hl7.org/fhir}ResourceVersionPolicy" minOccurs="0"/>
 *         &lt;element name="readHistory" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="updateCreate" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="conditionalCreate" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="conditionalUpdate" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="conditionalDelete" type="{http://hl7.org/fhir}ConditionalDeleteStatus" minOccurs="0"/>
 *         &lt;element name="searchInclude" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="searchRevInclude" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="searchParam" type="{http://hl7.org/fhir}Conformance.SearchParam" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Resource", propOrder = {
    "type",
    "profile",
    "interaction",
    "versioning",
    "readHistory",
    "updateCreate",
    "conditionalCreate",
    "conditionalUpdate",
    "conditionalDelete",
    "searchInclude",
    "searchRevInclude",
    "searchParam"
})
public class ConformanceResource
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Code type;
    protected Reference profile;
    @XmlElement(required = true)
    protected List<ConformanceInteraction> interaction;
    protected ResourceVersionPolicy versioning;
    protected BooleanDt readHistory;
    protected BooleanDt updateCreate;
    protected BooleanDt conditionalCreate;
    protected BooleanDt conditionalUpdate;
    protected ConditionalDeleteStatus conditionalDelete;
    protected List<StringDt> searchInclude;
    protected List<StringDt> searchRevInclude;
    protected List<ConformanceSearchParam> searchParam;

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
     * Gets the value of the interaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteraction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceInteraction }
     * 
     * 
     */
    public List<ConformanceInteraction> getInteraction() {
        if (interaction == null) {
            interaction = new ArrayList<ConformanceInteraction>();
        }
        return this.interaction;
    }

    /**
     * 取得 versioning 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ResourceVersionPolicy }
     *     
     */
    public ResourceVersionPolicy getVersioning() {
        return versioning;
    }

    /**
     * 設定 versioning 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceVersionPolicy }
     *     
     */
    public void setVersioning(ResourceVersionPolicy value) {
        this.versioning = value;
    }

    /**
     * 取得 readHistory 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getReadHistory() {
        return readHistory;
    }

    /**
     * 設定 readHistory 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setReadHistory(BooleanDt value) {
        this.readHistory = value;
    }

    /**
     * 取得 updateCreate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getUpdateCreate() {
        return updateCreate;
    }

    /**
     * 設定 updateCreate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setUpdateCreate(BooleanDt value) {
        this.updateCreate = value;
    }

    /**
     * 取得 conditionalCreate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getConditionalCreate() {
        return conditionalCreate;
    }

    /**
     * 設定 conditionalCreate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setConditionalCreate(BooleanDt value) {
        this.conditionalCreate = value;
    }

    /**
     * 取得 conditionalUpdate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getConditionalUpdate() {
        return conditionalUpdate;
    }

    /**
     * 設定 conditionalUpdate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setConditionalUpdate(BooleanDt value) {
        this.conditionalUpdate = value;
    }

    /**
     * 取得 conditionalDelete 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalDeleteStatus }
     *     
     */
    public ConditionalDeleteStatus getConditionalDelete() {
        return conditionalDelete;
    }

    /**
     * 設定 conditionalDelete 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalDeleteStatus }
     *     
     */
    public void setConditionalDelete(ConditionalDeleteStatus value) {
        this.conditionalDelete = value;
    }

    /**
     * Gets the value of the searchInclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchInclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDt }
     * 
     * 
     */
    public List<StringDt> getSearchInclude() {
        if (searchInclude == null) {
            searchInclude = new ArrayList<StringDt>();
        }
        return this.searchInclude;
    }

    /**
     * Gets the value of the searchRevInclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchRevInclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchRevInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDt }
     * 
     * 
     */
    public List<StringDt> getSearchRevInclude() {
        if (searchRevInclude == null) {
            searchRevInclude = new ArrayList<StringDt>();
        }
        return this.searchRevInclude;
    }

    /**
     * Gets the value of the searchParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceSearchParam }
     * 
     * 
     */
    public List<ConformanceSearchParam> getSearchParam() {
        if (searchParam == null) {
            searchParam = new ArrayList<ConformanceSearchParam>();
        }
        return this.searchParam;
    }

}
