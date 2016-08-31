//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
 * 
 * <p>Location.Position complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Location.Position">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="longitude" type="{http://hl7.org/fhir}decimal"/>
 *         &lt;element name="latitude" type="{http://hl7.org/fhir}decimal"/>
 *         &lt;element name="altitude" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location.Position", propOrder = {
    "longitude",
    "latitude",
    "altitude"
})
public class LocationPosition
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Decimal longitude;
    @XmlElement(required = true)
    protected Decimal latitude;
    protected Decimal altitude;

    /**
     * 取得 longitude 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getLongitude() {
        return longitude;
    }

    /**
     * 設定 longitude 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setLongitude(Decimal value) {
        this.longitude = value;
    }

    /**
     * 取得 latitude 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getLatitude() {
        return latitude;
    }

    /**
     * 設定 latitude 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setLatitude(Decimal value) {
        this.latitude = value;
    }

    /**
     * 取得 altitude 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getAltitude() {
        return altitude;
    }

    /**
     * 設定 altitude 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setAltitude(Decimal value) {
        this.altitude = value;
    }

}
