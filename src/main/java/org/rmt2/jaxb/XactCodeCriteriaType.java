//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.30 at 10:41:32 AM CDT 
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
 * <p>Java class for xact_code_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xact_code_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xact_code_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="xact_code_grp" type="{}xact_code_group_type"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xact_code_criteria_type", propOrder = {
    "xactCodeId",
    "xactCodeGrp",
    "description"
})
public class XactCodeCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "xact_code_id", required = true)
    protected BigInteger xactCodeId;
    @XmlElement(name = "xact_code_grp", required = true)
    protected XactCodeGroupType xactCodeGrp;
    @XmlElement(required = true)
    protected String description;

    /**
     * Gets the value of the xactCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXactCodeId() {
        return xactCodeId;
    }

    /**
     * Sets the value of the xactCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXactCodeId(BigInteger value) {
        this.xactCodeId = value;
    }

    /**
     * Gets the value of the xactCodeGrp property.
     * 
     * @return
     *     possible object is
     *     {@link XactCodeGroupType }
     *     
     */
    public XactCodeGroupType getXactCodeGrp() {
        return xactCodeGrp;
    }

    /**
     * Sets the value of the xactCodeGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCodeGroupType }
     *     
     */
    public void setXactCodeGrp(XactCodeGroupType value) {
        this.xactCodeGrp = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
