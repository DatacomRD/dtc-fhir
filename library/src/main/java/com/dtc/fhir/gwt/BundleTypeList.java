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
 * <p>BundleType-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="BundleType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="document"/>
 *     &lt;enumeration value="message"/>
 *     &lt;enumeration value="transaction"/>
 *     &lt;enumeration value="transaction-response"/>
 *     &lt;enumeration value="batch"/>
 *     &lt;enumeration value="batch-response"/>
 *     &lt;enumeration value="history"/>
 *     &lt;enumeration value="searchset"/>
 *     &lt;enumeration value="collection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BundleType-list")
@XmlEnum
public enum BundleTypeList {


    /**
     * The bundle is a document. The first resource is a Composition.
     * 
     */
    @XmlEnumValue("document")
    DOCUMENT("document"),

    /**
     * The bundle is a message. The first resource is a MessageHeader.
     * 
     */
    @XmlEnumValue("message")
    MESSAGE("message"),

    /**
     * The bundle is a transaction - intended to be processed by a server as an atomic commit.
     * 
     */
    @XmlEnumValue("transaction")
    TRANSACTION("transaction"),

    /**
     * The bundle is a transaction response. Because the response is a transaction response, the transactionhas succeeded, and all responses are error free.
     * 
     */
    @XmlEnumValue("transaction-response")
    TRANSACTION_RESPONSE("transaction-response"),

    /**
     * The bundle is a transaction - intended to be processed by a server as a group of actions.
     * 
     */
    @XmlEnumValue("batch")
    BATCH("batch"),

    /**
     * The bundle is a batch response. Note that as a batch, some responses may indicate failure and others success.
     * 
     */
    @XmlEnumValue("batch-response")
    BATCH_RESPONSE("batch-response"),

    /**
     * The bundle is a list of resources from a history interaction on a server.
     * 
     */
    @XmlEnumValue("history")
    HISTORY("history"),

    /**
     * The bundle is a list of resources returned as a result of a search/query interaction, operation, or message.
     * 
     */
    @XmlEnumValue("searchset")
    SEARCHSET("searchset"),

    /**
     * The bundle is a set of resources collected into a single document for ease of distribution.
     * 
     */
    @XmlEnumValue("collection")
    COLLECTION("collection");
    private final String value;

    BundleTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BundleTypeList fromValue(String v) {
        for (BundleTypeList c: BundleTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
