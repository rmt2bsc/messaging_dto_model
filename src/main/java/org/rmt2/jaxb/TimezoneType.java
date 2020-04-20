//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.20 at 01:32:56 AM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for timezone_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timezone_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timezone_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="timeszone_desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timezone_type", propOrder = {
    "timezoneId",
    "timeszoneDesc"
})
public class TimezoneType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "timezone_id", required = true, defaultValue = "0")
    protected BigInteger timezoneId;
    @XmlElement(name = "timeszone_desc", required = true)
    protected String timeszoneDesc;

    /**
     * Gets the value of the timezoneId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimezoneId() {
        return timezoneId;
    }

    /**
     * Sets the value of the timezoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimezoneId(BigInteger value) {
        this.timezoneId = value;
    }

    /**
     * Gets the value of the timeszoneDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeszoneDesc() {
        return timeszoneDesc;
    }

    /**
     * Sets the value of the timeszoneDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeszoneDesc(String value) {
        this.timeszoneDesc = value;
    }

}
