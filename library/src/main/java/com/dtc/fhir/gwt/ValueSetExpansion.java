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
 * <p>ValueSet.Expansion complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Expansion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}uri"/>
 *         &lt;element name="timestamp" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;element name="total" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="parameter" type="{http://hl7.org/fhir}ValueSet.Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contains" type="{http://hl7.org/fhir}ValueSet.Contains" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Expansion", propOrder = {
    "identifier",
    "timestamp",
    "total",
    "offset",
    "parameter",
    "contains"
})
public class ValueSetExpansion
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Uri identifier;
    @XmlElement(required = true)
    protected DateTime timestamp;
    protected IntegerDt total;
    protected IntegerDt offset;
    protected List<ValueSetParameter> parameter;
    protected List<ValueSetContains> contains;

    /**
     * 取得 identifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getIdentifier() {
        return identifier;
    }

    /**
     * 設定 identifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setIdentifier(Uri value) {
        this.identifier = value;
    }

    /**
     * 取得 timestamp 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTimestamp() {
        return timestamp;
    }

    /**
     * 設定 timestamp 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTimestamp(DateTime value) {
        this.timestamp = value;
    }

    /**
     * 取得 total 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getTotal() {
        return total;
    }

    /**
     * 設定 total 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setTotal(IntegerDt value) {
        this.total = value;
    }

    /**
     * 取得 offset 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDt }
     *     
     */
    public IntegerDt getOffset() {
        return offset;
    }

    /**
     * 設定 offset 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDt }
     *     
     */
    public void setOffset(IntegerDt value) {
        this.offset = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetParameter }
     * 
     * 
     */
    public List<ValueSetParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<ValueSetParameter>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the contains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetContains }
     * 
     * 
     */
    public List<ValueSetContains> getContains() {
        if (contains == null) {
            contains = new ArrayList<ValueSetContains>();
        }
        return this.contains;
    }

}
