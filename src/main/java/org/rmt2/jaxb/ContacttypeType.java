//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.31 at 09:59:55 AM CDT 
//


package org.rmt2.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contacttype_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contacttype_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="per"/>
 *     &lt;enumeration value="bus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contacttype_type")
@XmlEnum
public enum ContacttypeType {

    @XmlEnumValue("per")
    PER("per"),
    @XmlEnumValue("bus")
    BUS("bus");
    private final String value;

    ContacttypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContacttypeType fromValue(String v) {
        for (ContacttypeType c: ContacttypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
