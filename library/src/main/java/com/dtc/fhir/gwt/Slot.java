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
 * <p>Slot complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Slot">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="schedule" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="freeBusyType" type="{http://hl7.org/fhir}SlotStatus"/>
 *         &lt;element name="start" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="end" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="overbooked" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Slot", propOrder = {
    "identifier",
    "type",
    "schedule",
    "freeBusyType",
    "start",
    "end",
    "overbooked",
    "comment"
})
public class Slot
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected CodeableConcept type;
    @XmlElement(required = true)
    protected Reference schedule;
    @XmlElement(required = true)
    protected SlotStatus freeBusyType;
    @XmlElement(required = true)
    protected Instant start;
    @XmlElement(required = true)
    protected Instant end;
    protected BooleanDt overbooked;
    protected StringDt comment;

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
     * 取得 schedule 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSchedule() {
        return schedule;
    }

    /**
     * 設定 schedule 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSchedule(Reference value) {
        this.schedule = value;
    }

    /**
     * 取得 freeBusyType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SlotStatus }
     *     
     */
    public SlotStatus getFreeBusyType() {
        return freeBusyType;
    }

    /**
     * 設定 freeBusyType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotStatus }
     *     
     */
    public void setFreeBusyType(SlotStatus value) {
        this.freeBusyType = value;
    }

    /**
     * 取得 start 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getStart() {
        return start;
    }

    /**
     * 設定 start 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setStart(Instant value) {
        this.start = value;
    }

    /**
     * 取得 end 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getEnd() {
        return end;
    }

    /**
     * 設定 end 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setEnd(Instant value) {
        this.end = value;
    }

    /**
     * 取得 overbooked 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getOverbooked() {
        return overbooked;
    }

    /**
     * 設定 overbooked 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setOverbooked(BooleanDt value) {
        this.overbooked = value;
    }

    /**
     * 取得 comment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getComment() {
        return comment;
    }

    /**
     * 設定 comment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setComment(StringDt value) {
        this.comment = value;
    }

}
