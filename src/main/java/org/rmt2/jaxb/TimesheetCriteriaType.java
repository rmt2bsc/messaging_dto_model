//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.24 at 04:55:19 PM CST 
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
 * <p>Java class for timesheet_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timesheet_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timesheet_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="status_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="employee_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="client_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="project_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="period_begin" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="period_begin2" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="period_end" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="period_end2" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timesheet_criteria_type", propOrder = {
    "timesheetId",
    "statusId",
    "employeeId",
    "clientId",
    "projectId",
    "periodBegin",
    "periodBegin2",
    "periodEnd",
    "periodEnd2"
})
public class TimesheetCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "timesheet_id", required = true)
    protected BigInteger timesheetId;
    @XmlElement(name = "status_id", required = true)
    protected BigInteger statusId;
    @XmlElement(name = "employee_id", required = true)
    protected BigInteger employeeId;
    @XmlElement(name = "client_id", required = true)
    protected BigInteger clientId;
    @XmlElement(name = "project_id", required = true)
    protected BigInteger projectId;
    @XmlElement(name = "period_begin", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodBegin;
    @XmlElement(name = "period_begin2", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodBegin2;
    @XmlElement(name = "period_end", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodEnd;
    @XmlElement(name = "period_end2", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodEnd2;

    /**
     * Gets the value of the timesheetId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimesheetId() {
        return timesheetId;
    }

    /**
     * Sets the value of the timesheetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimesheetId(BigInteger value) {
        this.timesheetId = value;
    }

    /**
     * Gets the value of the statusId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusId(BigInteger value) {
        this.statusId = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeeId(BigInteger value) {
        this.employeeId = value;
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
     * Gets the value of the periodBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodBegin() {
        return periodBegin;
    }

    /**
     * Sets the value of the periodBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodBegin(XMLGregorianCalendar value) {
        this.periodBegin = value;
    }

    /**
     * Gets the value of the periodBegin2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodBegin2() {
        return periodBegin2;
    }

    /**
     * Sets the value of the periodBegin2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodBegin2(XMLGregorianCalendar value) {
        this.periodBegin2 = value;
    }

    /**
     * Gets the value of the periodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodEnd() {
        return periodEnd;
    }

    /**
     * Sets the value of the periodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodEnd(XMLGregorianCalendar value) {
        this.periodEnd = value;
    }

    /**
     * Gets the value of the periodEnd2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodEnd2() {
        return periodEnd2;
    }

    /**
     * Sets the value of the periodEnd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodEnd2(XMLGregorianCalendar value) {
        this.periodEnd2 = value;
    }

}
