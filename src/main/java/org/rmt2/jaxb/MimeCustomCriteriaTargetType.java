//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.23 at 09:00:45 AM CST 
//


package org.rmt2.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mime_custom_criteria_target_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mime_custom_criteria_target_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HEADER"/>
 *     &lt;enumeration value="DETAILS"/>
 *     &lt;enumeration value="FULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mime_custom_criteria_target_type")
@XmlEnum
public enum MimeCustomCriteriaTargetType {


    /**
     * Retrieve only the level the client is searching.  Example, a client is requesting artist info:  HEADER would fetch on artist data.
     * 
     */
    HEADER,

    /**
     * Retrieve the entire graph but include basic data only.  Example, a client is requesting artist info: DETAILS would fetch artist id and name, project id and name, and track id, track name, track no.
     * 
     */
    DETAILS,

    /**
     * Retrieve the entire graph with verbose information.  Example, a client is requesting artist info: FULL would fetch the full graph - every piece of infomation under each section is fetched.
     * 
     */
    FULL;

    public String value() {
        return name();
    }

    public static MimeCustomCriteriaTargetType fromValue(String v) {
        return valueOf(v);
    }

}
