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
import javax.xml.bind.annotation.XmlType;


/**
 * A container for a collection of resources.
 * 
 * <p>Bundle.Entry complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Bundle.Entry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="link" type="{http://hl7.org/fhir}Bundle.Link" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fullUrl" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://hl7.org/fhir}ResourceContainer" minOccurs="0"/>
 *         &lt;element name="search" type="{http://hl7.org/fhir}Bundle.Search" minOccurs="0"/>
 *         &lt;element name="request" type="{http://hl7.org/fhir}Bundle.Request" minOccurs="0"/>
 *         &lt;element name="response" type="{http://hl7.org/fhir}Bundle.Response" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bundle.Entry", propOrder = {
    "link",
    "fullUrl",
    "resource",
    "search",
    "request",
    "response"
})
public class BundleEntry
    extends BackboneElement
{

    protected List<BundleLink> link;
    protected Uri fullUrl;
    protected ResourceContainer resource;
    protected BundleSearch search;
    protected BundleRequest request;
    protected BundleResponse response;

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BundleLink }
     * 
     * 
     */
    public List<BundleLink> getLink() {
        if (link == null) {
            link = new ArrayList<BundleLink>();
        }
        return this.link;
    }

    /**
     * 取得 fullUrl 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getFullUrl() {
        return fullUrl;
    }

    /**
     * 設定 fullUrl 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setFullUrl(Uri value) {
        this.fullUrl = value;
    }

    /**
     * 取得 resource 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link ResourceContainer }
     *     
     */
    public ResourceContainer getResource() {
        return resource;
    }

    /**
     * 設定 resource 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceContainer }
     *     
     */
    public void setResource(ResourceContainer value) {
        this.resource = value;
    }

    /**
     * 取得 search 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BundleSearch }
     *     
     */
    public BundleSearch getSearch() {
        return search;
    }

    /**
     * 設定 search 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleSearch }
     *     
     */
    public void setSearch(BundleSearch value) {
        this.search = value;
    }

    /**
     * 取得 request 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BundleRequest }
     *     
     */
    public BundleRequest getRequest() {
        return request;
    }

    /**
     * 設定 request 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleRequest }
     *     
     */
    public void setRequest(BundleRequest value) {
        this.request = value;
    }

    /**
     * 取得 response 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BundleResponse }
     *     
     */
    public BundleResponse getResponse() {
        return response;
    }

    /**
     * 設定 response 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleResponse }
     *     
     */
    public void setResponse(BundleResponse value) {
        this.response = value;
    }

}
