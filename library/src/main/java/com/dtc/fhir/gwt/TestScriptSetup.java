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
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * 
 * <p>TestScript.Setup complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="TestScript.Setup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="metadata" type="{http://hl7.org/fhir}TestScript.Metadata" minOccurs="0"/>
 *         &lt;element name="action" type="{http://hl7.org/fhir}TestScript.Action" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestScript.Setup", propOrder = {
    "metadata",
    "action"
})
public class TestScriptSetup
    extends BackboneElement
{

    protected TestScriptMetadata metadata;
    @XmlElement(required = true)
    protected List<TestScriptAction> action;

    /**
     * 取得 metadata 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link TestScriptMetadata }
     *     
     */
    public TestScriptMetadata getMetadata() {
        return metadata;
    }

    /**
     * 設定 metadata 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link TestScriptMetadata }
     *     
     */
    public void setMetadata(TestScriptMetadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestScriptAction }
     * 
     * 
     */
    public List<TestScriptAction> getAction() {
        if (action == null) {
            action = new ArrayList<TestScriptAction>();
        }
        return this.action;
    }

}
