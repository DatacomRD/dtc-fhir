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
 * <p>Count complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Count">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://hl7.org/fhir}Quantity">
 *       &lt;sequence>
 *         &lt;element name="extension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="value" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="comparator" type="{http://hl7.org/fhir}QuantityComparator" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://hl7.org/fhir}id-primitive" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Count")
public class Count
    extends Quantity
{


}
