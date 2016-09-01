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
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * 
 * <p>TestScript.Action2 complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="TestScript.Action2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{http://hl7.org/fhir}TestScript.Operation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestScript.Action2", propOrder = {
    "operation"
})
public class TestScriptAction2
    extends BackboneElement
{

    protected TestScriptOperation operation;

    /**
     * 取得 operation 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link TestScriptOperation }
     *     
     */
    public TestScriptOperation getOperation() {
        return operation;
    }

    /**
     * 設定 operation 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link TestScriptOperation }
     *     
     */
    public void setOperation(TestScriptOperation value) {
        this.operation = value;
    }

}
