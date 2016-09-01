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
 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
 * 
 * <p>ConceptMap.Target complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ConceptMap.Target">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="codeSystem" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="equivalence" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="comments" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="dependsOn" type="{http://hl7.org/fhir}ConceptMap.DependsOn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="product" type="{http://hl7.org/fhir}ConceptMap.DependsOn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMap.Target", propOrder = {
    "codeSystem",
    "code",
    "equivalence",
    "comments",
    "dependsOn",
    "product"
})
public class ConceptMapTarget
    extends BackboneElement
{

    protected Uri codeSystem;
    protected Code code;
    @XmlElement(required = true)
    protected Code equivalence;
    protected StringDt comments;
    protected List<ConceptMapDependsOn> dependsOn;
    protected List<ConceptMapDependsOn> product;

    /**
     * 取得 codeSystem 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getCodeSystem() {
        return codeSystem;
    }

    /**
     * 設定 codeSystem 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setCodeSystem(Uri value) {
        this.codeSystem = value;
    }

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
     * 取得 equivalence 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getEquivalence() {
        return equivalence;
    }

    /**
     * 設定 equivalence 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setEquivalence(Code value) {
        this.equivalence = value;
    }

    /**
     * 取得 comments 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getComments() {
        return comments;
    }

    /**
     * 設定 comments 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setComments(StringDt value) {
        this.comments = value;
    }

    /**
     * Gets the value of the dependsOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependsOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependsOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptMapDependsOn }
     * 
     * 
     */
    public List<ConceptMapDependsOn> getDependsOn() {
        if (dependsOn == null) {
            dependsOn = new ArrayList<ConceptMapDependsOn>();
        }
        return this.dependsOn;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptMapDependsOn }
     * 
     * 
     */
    public List<ConceptMapDependsOn> getProduct() {
        if (product == null) {
            product = new ArrayList<ConceptMapDependsOn>();
        }
        return this.product;
    }

}
