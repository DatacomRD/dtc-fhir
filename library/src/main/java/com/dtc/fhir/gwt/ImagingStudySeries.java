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
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 * 
 * <p>ImagingStudy.Series complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ImagingStudy.Series">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://hl7.org/fhir}unsignedInt" minOccurs="0"/>
 *         &lt;element name="modality" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="uid" type="{http://hl7.org/fhir}oid"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="numberOfInstances" type="{http://hl7.org/fhir}unsignedInt"/>
 *         &lt;element name="availability" type="{http://hl7.org/fhir}InstanceAvailability" minOccurs="0"/>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="laterality" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="started" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="instance" type="{http://hl7.org/fhir}ImagingStudy.Instance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingStudy.Series", propOrder = {
    "number",
    "modality",
    "uid",
    "description",
    "numberOfInstances",
    "availability",
    "url",
    "bodySite",
    "laterality",
    "started",
    "instance"
})
public class ImagingStudySeries
    extends BackboneElement
{

    protected UnsignedInt number;
    @XmlElement(required = true)
    protected Coding modality;
    @XmlElement(required = true)
    protected Oid uid;
    protected StringDt description;
    @XmlElement(required = true)
    protected UnsignedInt numberOfInstances;
    protected InstanceAvailability availability;
    protected Uri url;
    protected Coding bodySite;
    protected Coding laterality;
    protected DateTime started;
    protected List<ImagingStudyInstance> instance;

    /**
     * 取得 number 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getNumber() {
        return number;
    }

    /**
     * 設定 number 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setNumber(UnsignedInt value) {
        this.number = value;
    }

    /**
     * 取得 modality 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getModality() {
        return modality;
    }

    /**
     * 設定 modality 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setModality(Coding value) {
        this.modality = value;
    }

    /**
     * 取得 uid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getUid() {
        return uid;
    }

    /**
     * 設定 uid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setUid(Oid value) {
        this.uid = value;
    }

    /**
     * 取得 description 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getDescription() {
        return description;
    }

    /**
     * 設定 description 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setDescription(StringDt value) {
        this.description = value;
    }

    /**
     * 取得 numberOfInstances 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getNumberOfInstances() {
        return numberOfInstances;
    }

    /**
     * 設定 numberOfInstances 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setNumberOfInstances(UnsignedInt value) {
        this.numberOfInstances = value;
    }

    /**
     * 取得 availability 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link InstanceAvailability }
     *     
     */
    public InstanceAvailability getAvailability() {
        return availability;
    }

    /**
     * 設定 availability 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceAvailability }
     *     
     */
    public void setAvailability(InstanceAvailability value) {
        this.availability = value;
    }

    /**
     * 取得 url 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getUrl() {
        return url;
    }

    /**
     * 設定 url 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setUrl(Uri value) {
        this.url = value;
    }

    /**
     * 取得 bodySite 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getBodySite() {
        return bodySite;
    }

    /**
     * 設定 bodySite 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setBodySite(Coding value) {
        this.bodySite = value;
    }

    /**
     * 取得 laterality 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getLaterality() {
        return laterality;
    }

    /**
     * 設定 laterality 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setLaterality(Coding value) {
        this.laterality = value;
    }

    /**
     * 取得 started 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getStarted() {
        return started;
    }

    /**
     * 設定 started 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setStarted(DateTime value) {
        this.started = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagingStudyInstance }
     * 
     * 
     */
    public List<ImagingStudyInstance> getInstance() {
        if (instance == null) {
            instance = new ArrayList<ImagingStudyInstance>();
        }
        return this.instance;
    }

}
