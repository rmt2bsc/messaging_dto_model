//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.24 at 04:55:19 PM CST 
//


package org.rmt2.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for relational_operator_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="relational_operator_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="NOT EQUAL"/>
 *     &lt;enumeration value="GREATER THAN"/>
 *     &lt;enumeration value="LESS THAN"/>
 *     &lt;enumeration value="LESS THAN OR EQUAL"/>
 *     &lt;enumeration value="GREATER THAN OR EQUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "relational_operator_type")
@XmlEnum
public enum RelationalOperatorType {

    EQUALS("EQUALS"),
    @XmlEnumValue("NOT EQUAL")
    NOT_EQUAL("NOT EQUAL"),
    @XmlEnumValue("GREATER THAN")
    GREATER_THAN("GREATER THAN"),
    @XmlEnumValue("LESS THAN")
    LESS_THAN("LESS THAN"),
    @XmlEnumValue("LESS THAN OR EQUAL")
    LESS_THAN_OR_EQUAL("LESS THAN OR EQUAL"),
    @XmlEnumValue("GREATER THAN OR EQUAL")
    GREATER_THAN_OR_EQUAL("GREATER THAN OR EQUAL");
    private final String value;

    RelationalOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationalOperatorType fromValue(String v) {
        for (RelationalOperatorType c: RelationalOperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
