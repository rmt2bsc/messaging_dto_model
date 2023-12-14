//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 11:37:22 AM CST 
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
 * <p>Java class for project_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="project_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="project_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="project_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="client_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="client_business_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="client_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="project_effective_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="project_end_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "project_criteria_type", propOrder = {
    "projectId",
    "projectName",
    "clientId",
    "clientBusinessId",
    "clientName",
    "projectEffectiveDate",
    "projectEndDate"
})
public class ProjectCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "project_id", required = true)
    protected BigInteger projectId;
    @XmlElement(name = "project_name", required = true)
    protected String projectName;
    @XmlElement(name = "client_id", required = true)
    protected BigInteger clientId;
    @XmlElement(name = "client_business_id", required = true)
    protected BigInteger clientBusinessId;
    @XmlElement(name = "client_name", required = true)
    protected String clientName;
    @XmlElement(name = "project_effective_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar projectEffectiveDate;
    @XmlElement(name = "project_end_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar projectEndDate;

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectId(BigInteger value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClientId(BigInteger value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientBusinessId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClientBusinessId() {
        return clientBusinessId;
    }

    /**
     * Sets the value of the clientBusinessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClientBusinessId(BigInteger value) {
        this.clientBusinessId = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the projectEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectEffectiveDate() {
        return projectEffectiveDate;
    }

    /**
     * Sets the value of the projectEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectEffectiveDate(XMLGregorianCalendar value) {
        this.projectEffectiveDate = value;
    }

    /**
     * Gets the value of the projectEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectEndDate() {
        return projectEndDate;
    }

    /**
     * Sets the value of the projectEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectEndDate(XMLGregorianCalendar value) {
        this.projectEndDate = value;
    }

}
