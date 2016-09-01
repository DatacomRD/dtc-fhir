//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A container for a collection of resources.
 * 
 * <p>Bundle.Search complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Bundle.Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{http://hl7.org/fhir}SearchEntryMode" minOccurs="0"/>
 *         &lt;element name="score" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bundle.Search", propOrder = {
    "mode",
    "score"
})
public class BundleSearch
    extends BackboneElement
{

    protected SearchEntryMode mode;
    protected Decimal score;

    /**
     * 取得 mode 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SearchEntryMode }
     *     
     */
    public SearchEntryMode getMode() {
        return mode;
    }

    /**
     * 設定 mode 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEntryMode }
     *     
     */
    public void setMode(SearchEntryMode value) {
        this.mode = value;
    }

    /**
     * 取得 score 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getScore() {
        return score;
    }

    /**
     * 設定 score 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setScore(Decimal value) {
        this.score = value;
    }

}
