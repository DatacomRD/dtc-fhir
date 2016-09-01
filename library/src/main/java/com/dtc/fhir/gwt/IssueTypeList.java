//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IssueType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="IssueType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="invalid"/>
 *     &lt;enumeration value="structure"/>
 *     &lt;enumeration value="required"/>
 *     &lt;enumeration value="value"/>
 *     &lt;enumeration value="invariant"/>
 *     &lt;enumeration value="security"/>
 *     &lt;enumeration value="login"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="expired"/>
 *     &lt;enumeration value="forbidden"/>
 *     &lt;enumeration value="suppressed"/>
 *     &lt;enumeration value="processing"/>
 *     &lt;enumeration value="not-supported"/>
 *     &lt;enumeration value="duplicate"/>
 *     &lt;enumeration value="not-found"/>
 *     &lt;enumeration value="too-long"/>
 *     &lt;enumeration value="code-invalid"/>
 *     &lt;enumeration value="extension"/>
 *     &lt;enumeration value="too-costly"/>
 *     &lt;enumeration value="business-rule"/>
 *     &lt;enumeration value="conflict"/>
 *     &lt;enumeration value="incomplete"/>
 *     &lt;enumeration value="transient"/>
 *     &lt;enumeration value="lock-error"/>
 *     &lt;enumeration value="no-store"/>
 *     &lt;enumeration value="exception"/>
 *     &lt;enumeration value="timeout"/>
 *     &lt;enumeration value="throttled"/>
 *     &lt;enumeration value="informational"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IssueType-list")
@XmlEnum
public enum IssueTypeList {


    /**
     * Content invalid against the specification or a profile.
     * 
     */
    @XmlEnumValue("invalid")
    INVALID("invalid"),

    /**
     * A structural issue in the content such as wrong namespace, or unable to parse the content completely, or invalid json syntax.
     * 
     */
    @XmlEnumValue("structure")
    STRUCTURE("structure"),

    /**
     * A required element is missing.
     * 
     */
    @XmlEnumValue("required")
    REQUIRED("required"),

    /**
     * An element value is invalid.
     * 
     */
    @XmlEnumValue("value")
    VALUE("value"),

    /**
     * A content validation rule failed - e.g. a schematron rule.
     * 
     */
    @XmlEnumValue("invariant")
    INVARIANT("invariant"),

    /**
     * An authentication/authorization/permissions issue of some kind.
     * 
     */
    @XmlEnumValue("security")
    SECURITY("security"),

    /**
     * The client needs to initiate an authentication process.
     * 
     */
    @XmlEnumValue("login")
    LOGIN("login"),

    /**
     * The user or system was not able to be authenticated (either there is no process, or the proferred token is unacceptable).
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * User session expired; a login may be required.
     * 
     */
    @XmlEnumValue("expired")
    EXPIRED("expired"),

    /**
     * The user does not have the rights to perform this action.
     * 
     */
    @XmlEnumValue("forbidden")
    FORBIDDEN("forbidden"),

    /**
     * Some information was not or may not have been returned due to business rules, consent or privacy rules, or access permission constraints.  This information may be accessible through alternate processes.
     * 
     */
    @XmlEnumValue("suppressed")
    SUPPRESSED("suppressed"),

    /**
     * Processing issues. These are expected to be final e.g. there is no point resubmitting the same content unchanged.
     * 
     */
    @XmlEnumValue("processing")
    PROCESSING("processing"),

    /**
     * The resource or profile is not supported.
     * 
     */
    @XmlEnumValue("not-supported")
    NOT_SUPPORTED("not-supported"),

    /**
     * An attempt was made to create a duplicate record.
     * 
     */
    @XmlEnumValue("duplicate")
    DUPLICATE("duplicate"),

    /**
     * The reference provided was not found. In a pure RESTful environment, this would be an HTTP 404 error, but this code may be used where the content is not found further into the application architecture.
     * 
     */
    @XmlEnumValue("not-found")
    NOT_FOUND("not-found"),

    /**
     * Provided content is too long (typically, this is a denial of service protection type of error).
     * 
     */
    @XmlEnumValue("too-long")
    TOO_LONG("too-long"),

    /**
     * The code or system could not be understood, or it was not valid in the context of a particular ValueSet.code.
     * 
     */
    @XmlEnumValue("code-invalid")
    CODE_INVALID("code-invalid"),

    /**
     * An extension was found that was not acceptable, could not be resolved, or a modifierExtension was not recognized.
     * 
     */
    @XmlEnumValue("extension")
    EXTENSION("extension"),

    /**
     * The operation was stopped to protect server resources; e.g. a request for a value set expansion on all of SNOMED CT.
     * 
     */
    @XmlEnumValue("too-costly")
    TOO_COSTLY("too-costly"),

    /**
     * The content/operation failed to pass some business rule, and so could not proceed.
     * 
     */
    @XmlEnumValue("business-rule")
    BUSINESS_RULE("business-rule"),

    /**
     * Content could not be accepted because of an edit conflict (i.e. version aware updates) (In a pure RESTful environment, this would be an HTTP 404 error, but this code may be used where the conflict is discovered further into the application architecture.)
     * 
     */
    @XmlEnumValue("conflict")
    CONFLICT("conflict"),

    /**
     * Not all data sources typically accessed could be reached, or responded in time, so the returned information may not be complete.
     * 
     */
    @XmlEnumValue("incomplete")
    INCOMPLETE("incomplete"),

    /**
     * Transient processing issues. The system receiving the error may be able to resubmit the same content once an underlying issue is resolved.
     * 
     */
    @XmlEnumValue("transient")
    TRANSIENT("transient"),

    /**
     * A resource/record locking failure (usually in an underlying database).
     * 
     */
    @XmlEnumValue("lock-error")
    LOCK_ERROR("lock-error"),

    /**
     * The persistent store is unavailable; e.g. the database is down for maintenance or similar action.
     * 
     */
    @XmlEnumValue("no-store")
    NO_STORE("no-store"),

    /**
     * An unexpected internal error has occurred.
     * 
     */
    @XmlEnumValue("exception")
    EXCEPTION("exception"),

    /**
     * An internal timeout has occurred.
     * 
     */
    @XmlEnumValue("timeout")
    TIMEOUT("timeout"),

    /**
     * The system is not prepared to handle this request due to load management.
     * 
     */
    @XmlEnumValue("throttled")
    THROTTLED("throttled"),

    /**
     * A message unrelated to the processing success of the completed operation (examples of the latter include things like reminders of password expiry, system maintenance times, etc.).
     * 
     */
    @XmlEnumValue("informational")
    INFORMATIONAL("informational");
    private final String value;

    IssueTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IssueTypeList fromValue(String v) {
        for (IssueTypeList c: IssueTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
