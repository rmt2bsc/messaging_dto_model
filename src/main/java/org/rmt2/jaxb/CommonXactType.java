//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.03 at 12:03:48 AM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.RMT2Base;


/**
 * <p>Java class for common_xact_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="common_xact_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xact" type="{}xact_type"/>
 *         &lt;element name="parent_entity_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="spec_xact_level1_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="spec_xact_level1_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="spec_xact_level2_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="spec_xact_level2_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "common_xact_type", propOrder = {
    "xact",
    "parentEntityId",
    "specXactLevel1Id",
    "specXactLevel1Date",
    "specXactLevel2Id",
    "specXactLevel2Date"
})
public class CommonXactType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected XactType xact;
    @XmlElement(name = "parent_entity_id", required = true)
    protected BigInteger parentEntityId;
    @XmlElement(name = "spec_xact_level1_id", required = true)
    protected BigInteger specXactLevel1Id;
    @XmlElement(name = "spec_xact_level1_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specXactLevel1Date;
    @XmlElement(name = "spec_xact_level2_id", required = true)
    protected BigInteger specXactLevel2Id;
    @XmlElement(name = "spec_xact_level2_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specXactLevel2Date;

    /**
     * Gets the value of the xact property.
     * 
     * @return
     *     possible object is
     *     {@link XactType }
     *     
     */
    public XactType getXact() {
        return xact;
    }

    /**
     * Sets the value of the xact property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactType }
     *     
     */
    public void setXact(XactType value) {
        this.xact = value;
    }

    /**
     * Gets the value of the parentEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentEntityId() {
        return parentEntityId;
    }

    /**
     * Sets the value of the parentEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentEntityId(BigInteger value) {
        this.parentEntityId = value;
    }

    /**
     * Gets the value of the specXactLevel1Id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecXactLevel1Id() {
        return specXactLevel1Id;
    }

    /**
     * Sets the value of the specXactLevel1Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecXactLevel1Id(BigInteger value) {
        this.specXactLevel1Id = value;
    }

    /**
     * Gets the value of the specXactLevel1Date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecXactLevel1Date() {
        return specXactLevel1Date;
    }

    /**
     * Sets the value of the specXactLevel1Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecXactLevel1Date(XMLGregorianCalendar value) {
        this.specXactLevel1Date = value;
    }

    /**
     * Gets the value of the specXactLevel2Id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecXactLevel2Id() {
        return specXactLevel2Id;
    }

    /**
     * Sets the value of the specXactLevel2Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecXactLevel2Id(BigInteger value) {
        this.specXactLevel2Id = value;
    }

    /**
     * Gets the value of the specXactLevel2Date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecXactLevel2Date() {
        return specXactLevel2Date;
    }

    /**
     * Sets the value of the specXactLevel2Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecXactLevel2Date(XMLGregorianCalendar value) {
        this.specXactLevel2Date = value;
    }

}
