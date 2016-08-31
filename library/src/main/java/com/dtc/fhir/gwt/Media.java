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
 * <p>Media complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Media">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}DigitalMediaType"/>
 *         &lt;element name="subtype" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="view" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="deviceName" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="height" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="width" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="frames" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://hl7.org/fhir}unsignedInt" minOccurs="0"/>
 *         &lt;element name="content" type="{http://hl7.org/fhir}Attachment"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Media", propOrder = {
    "type",
    "subtype",
    "identifier",
    "subject",
    "operator",
    "view",
    "deviceName",
    "height",
    "width",
    "frames",
    "duration",
    "content"
})
public class Media
    extends DomainResource
{

    @XmlElement(required = true)
    protected DigitalMediaType type;
    protected CodeableConcept subtype;
    protected List<Identifier> identifier;
    protected Reference subject;
    protected Reference operator;
    protected CodeableConcept view;
    protected StringDt deviceName;
    protected PositiveInt height;
    protected PositiveInt width;
    protected PositiveInt frames;
    protected UnsignedInt duration;
    @XmlElement(required = true)
    protected Attachment content;

    /**
     * 取得 type 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DigitalMediaType }
     *     
     */
    public DigitalMediaType getType() {
        return type;
    }

    /**
     * 設定 type 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalMediaType }
     *     
     */
    public void setType(DigitalMediaType value) {
        this.type = value;
    }

    /**
     * 取得 subtype 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSubtype() {
        return subtype;
    }

    /**
     * 設定 subtype 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSubtype(CodeableConcept value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
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
     * 取得 operator 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOperator() {
        return operator;
    }

    /**
     * 設定 operator 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOperator(Reference value) {
        this.operator = value;
    }

    /**
     * 取得 view 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getView() {
        return view;
    }

    /**
     * 設定 view 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setView(CodeableConcept value) {
        this.view = value;
    }

    /**
     * 取得 deviceName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDeviceName() {
        return deviceName;
    }

    /**
     * 設定 deviceName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDeviceName(StringDt value) {
        this.deviceName = value;
    }

    /**
     * 取得 height 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getHeight() {
        return height;
    }

    /**
     * 設定 height 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setHeight(PositiveInt value) {
        this.height = value;
    }

    /**
     * 取得 width 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getWidth() {
        return width;
    }

    /**
     * 設定 width 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setWidth(PositiveInt value) {
        this.width = value;
    }

    /**
     * 取得 frames 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getFrames() {
        return frames;
    }

    /**
     * 設定 frames 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setFrames(PositiveInt value) {
        this.frames = value;
    }

    /**
     * 取得 duration 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getDuration() {
        return duration;
    }

    /**
     * 設定 duration 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setDuration(UnsignedInt value) {
        this.duration = value;
    }

    /**
     * 取得 content 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getContent() {
        return content;
    }

    /**
     * 設定 content 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setContent(Attachment value) {
        this.content = value;
    }

}
