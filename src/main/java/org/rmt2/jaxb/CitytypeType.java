//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.17 at 01:06:13 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for citytype_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citytype_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city_type_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city_type_desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citytype_type", propOrder = {
    "cityTypeId",
    "cityTypeDesc"
})
public class CitytypeType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "city_type_id", required = true, defaultValue = "0")
    protected String cityTypeId;
    @XmlElement(name = "city_type_desc", required = true)
    protected String cityTypeDesc;

    /**
     * Gets the value of the cityTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityTypeId() {
        return cityTypeId;
    }

    /**
     * Sets the value of the cityTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityTypeId(String value) {
        this.cityTypeId = value;
    }

    /**
     * Gets the value of the cityTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityTypeDesc() {
        return cityTypeDesc;
    }

    /**
     * Sets the value of the cityTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityTypeDesc(String value) {
        this.cityTypeDesc = value;
    }

}
