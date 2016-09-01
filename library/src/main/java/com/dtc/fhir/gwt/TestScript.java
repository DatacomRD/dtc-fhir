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
 * <p>TestScript complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="TestScript">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}TestScript.Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="useContext" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requirements" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="copyright" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="metadata" type="{http://hl7.org/fhir}TestScript.Metadata" minOccurs="0"/>
 *         &lt;element name="multiserver" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="fixture" type="{http://hl7.org/fhir}TestScript.Fixture" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="profile" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="variable" type="{http://hl7.org/fhir}TestScript.Variable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="setup" type="{http://hl7.org/fhir}TestScript.Setup" minOccurs="0"/>
 *         &lt;element name="test" type="{http://hl7.org/fhir}TestScript.Test" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="teardown" type="{http://hl7.org/fhir}TestScript.Teardown" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestScript", propOrder = {
    "url",
    "version",
    "name",
    "status",
    "identifier",
    "experimental",
    "publisher",
    "contact",
    "date",
    "description",
    "useContext",
    "requirements",
    "copyright",
    "metadata",
    "multiserver",
    "fixture",
    "profile",
    "variable",
    "setup",
    "test",
    "teardown"
})
public class TestScript
    extends DomainResource
{

    @XmlElement(required = true)
    protected Uri url;
    protected StringDt version;
    @XmlElement(required = true)
    protected StringDt name;
    @XmlElement(required = true)
    protected Code status;
    protected Identifier identifier;
    protected BooleanDt experimental;
    protected StringDt publisher;
    protected List<TestScriptContact> contact;
    protected DateTime date;
    protected StringDt description;
    protected List<CodeableConcept> useContext;
    protected StringDt requirements;
    protected StringDt copyright;
    protected TestScriptMetadata metadata;
    protected BooleanDt multiserver;
    protected List<TestScriptFixture> fixture;
    protected List<Reference> profile;
    protected List<TestScriptVariable> variable;
    protected TestScriptSetup setup;
    protected List<TestScriptTest> test;
    protected TestScriptTeardown teardown;

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
     * 取得 version 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getVersion() {
        return version;
    }

    /**
     * 設定 version 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setVersion(StringDt value) {
        this.version = value;
    }

    /**
     * 取得 name 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getName() {
        return name;
    }

    /**
     * 設定 name 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setName(StringDt value) {
        this.name = value;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setStatus(Code value) {
        this.status = value;
    }

    /**
     * 取得 identifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * 設定 identifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * 取得 experimental 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getExperimental() {
        return experimental;
    }

    /**
     * 設定 experimental 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setExperimental(BooleanDt value) {
        this.experimental = value;
    }

    /**
     * 取得 publisher 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getPublisher() {
        return publisher;
    }

    /**
     * 設定 publisher 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setPublisher(StringDt value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestScriptContact }
     * 
     * 
     */
    public List<TestScriptContact> getContact() {
        if (contact == null) {
            contact = new ArrayList<TestScriptContact>();
        }
        return this.contact;
    }

    /**
     * 取得 date 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * 設定 date 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
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
     * Gets the value of the useContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getUseContext() {
        if (useContext == null) {
            useContext = new ArrayList<CodeableConcept>();
        }
        return this.useContext;
    }

    /**
     * 取得 requirements 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getRequirements() {
        return requirements;
    }

    /**
     * 設定 requirements 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setRequirements(StringDt value) {
        this.requirements = value;
    }

    /**
     * 取得 copyright 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link StringDt }
     *     
     */
    public StringDt getCopyright() {
        return copyright;
    }

    /**
     * 設定 copyright 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link StringDt }
     *     
     */
    public void setCopyright(StringDt value) {
        this.copyright = value;
    }

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
     * 取得 multiserver 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDt }
     *     
     */
    public BooleanDt getMultiserver() {
        return multiserver;
    }

    /**
     * 設定 multiserver 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDt }
     *     
     */
    public void setMultiserver(BooleanDt value) {
        this.multiserver = value;
    }

    /**
     * Gets the value of the fixture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestScriptFixture }
     * 
     * 
     */
    public List<TestScriptFixture> getFixture() {
        if (fixture == null) {
            fixture = new ArrayList<TestScriptFixture>();
        }
        return this.fixture;
    }

    /**
     * Gets the value of the profile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getProfile() {
        if (profile == null) {
            profile = new ArrayList<Reference>();
        }
        return this.profile;
    }

    /**
     * Gets the value of the variable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestScriptVariable }
     * 
     * 
     */
    public List<TestScriptVariable> getVariable() {
        if (variable == null) {
            variable = new ArrayList<TestScriptVariable>();
        }
        return this.variable;
    }

    /**
     * 取得 setup 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link TestScriptSetup }
     *     
     */
    public TestScriptSetup getSetup() {
        return setup;
    }

    /**
     * 設定 setup 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link TestScriptSetup }
     *     
     */
    public void setSetup(TestScriptSetup value) {
        this.setup = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the test property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestScriptTest }
     * 
     * 
     */
    public List<TestScriptTest> getTest() {
        if (test == null) {
            test = new ArrayList<TestScriptTest>();
        }
        return this.test;
    }

    /**
     * 取得 teardown 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link TestScriptTeardown }
     *     
     */
    public TestScriptTeardown getTeardown() {
        return teardown;
    }

    /**
     * 設定 teardown 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link TestScriptTeardown }
     *     
     */
    public void setTeardown(TestScriptTeardown value) {
        this.teardown = value;
    }

}
