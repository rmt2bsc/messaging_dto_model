//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.14 at 04:37:19 AM CDT 
//


package org.rmt2.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for string_search_pattern_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="string_search_pattern_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BEGIN"/>
 *     &lt;enumeration value="END"/>
 *     &lt;enumeration value="CONTAIN"/>
 *     &lt;enumeration value="EXACT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "string_search_pattern_type")
@XmlEnum
public enum StringSearchPatternType {

    BEGIN,
    END,
    CONTAIN,
    EXACT;

    public String value() {
        return name();
    }

    public static StringSearchPatternType fromValue(String v) {
        return valueOf(v);
    }

}
