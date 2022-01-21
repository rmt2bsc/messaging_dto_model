//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.20 at 10:01:05 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.RMT2Base;


/**
 * <p>Java class for timesheet_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timesheet_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timesheet_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="proj_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="service_provider" type="{}business_type"/>
 *         &lt;element name="client" type="{}client_type"/>
 *         &lt;element name="employee" type="{}employee_type" minOccurs="0"/>
 *         &lt;element name="hourly_rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="overtime_hourly_rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="display_value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="period_begin" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="period_end" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="status" type="{}timesheet_status_type" minOccurs="0"/>
 *         &lt;element name="status_history_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="status_effective_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="status_end_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="invoice_ref_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="external_ref_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="document_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billable_hours" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="non_billable_hours" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="work_log_summary" type="{}timesheet_hours_summary_type" minOccurs="0"/>
 *         &lt;element name="work_log" type="{}project_task_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status_history" type="{}timesheet_status_history_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tracking" type="{}record_tracking_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timesheet_type", propOrder = {
    "timesheetId",
    "projId",
    "serviceProvider",
    "client",
    "employee",
    "hourlyRate",
    "overtimeHourlyRate",
    "displayValue",
    "periodBegin",
    "periodEnd",
    "status",
    "statusHistoryId",
    "statusEffectiveDate",
    "statusEndDate",
    "invoiceRefNo",
    "externalRefNo",
    "documentId",
    "comments",
    "billableHours",
    "nonBillableHours",
    "workLogSummary",
    "workLog",
    "statusHistory",
    "tracking"
})
public class TimesheetType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "timesheet_id", required = true)
    protected BigInteger timesheetId;
    @XmlElement(name = "proj_id", required = true)
    protected BigInteger projId;
    @XmlElement(name = "service_provider", required = true)
    protected BusinessType serviceProvider;
    @XmlElement(required = true)
    protected ClientType client;
    protected EmployeeType employee;
    @XmlElement(name = "hourly_rate")
    protected BigDecimal hourlyRate;
    @XmlElement(name = "overtime_hourly_rate")
    protected BigDecimal overtimeHourlyRate;
    @XmlElement(name = "display_value")
    protected String displayValue;
    @XmlElement(name = "period_begin")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodBegin;
    @XmlElement(name = "period_end")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodEnd;
    protected TimesheetStatusType status;
    @XmlElement(name = "status_history_id")
    protected BigInteger statusHistoryId;
    @XmlElement(name = "status_effective_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statusEffectiveDate;
    @XmlElement(name = "status_end_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statusEndDate;
    @XmlElement(name = "invoice_ref_no")
    protected String invoiceRefNo;
    @XmlElement(name = "external_ref_no")
    protected String externalRefNo;
    @XmlElement(name = "document_id")
    protected BigInteger documentId;
    protected String comments;
    @XmlElement(name = "billable_hours")
    protected BigDecimal billableHours;
    @XmlElement(name = "non_billable_hours")
    protected BigDecimal nonBillableHours;
    @XmlElement(name = "work_log_summary")
    protected TimesheetHoursSummaryType workLogSummary;
    @XmlElement(name = "work_log")
    protected List<ProjectTaskType> workLog;
    @XmlElement(name = "status_history")
    protected List<TimesheetStatusHistoryType> statusHistory;
    protected RecordTrackingType tracking;

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
     * Gets the value of the projId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjId() {
        return projId;
    }

    /**
     * Sets the value of the projId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjId(BigInteger value) {
        this.projId = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessType }
     *     
     */
    public BusinessType getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessType }
     *     
     */
    public void setServiceProvider(BusinessType value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ClientType }
     *     
     */
    public ClientType getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientType }
     *     
     */
    public void setClient(ClientType value) {
        this.client = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeType }
     *     
     */
    public EmployeeType getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeType }
     *     
     */
    public void setEmployee(EmployeeType value) {
        this.employee = value;
    }

    /**
     * Gets the value of the hourlyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Sets the value of the hourlyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHourlyRate(BigDecimal value) {
        this.hourlyRate = value;
    }

    /**
     * Gets the value of the overtimeHourlyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOvertimeHourlyRate() {
        return overtimeHourlyRate;
    }

    /**
     * Sets the value of the overtimeHourlyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOvertimeHourlyRate(BigDecimal value) {
        this.overtimeHourlyRate = value;
    }

    /**
     * Gets the value of the displayValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * Sets the value of the displayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayValue(String value) {
        this.displayValue = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TimesheetStatusType }
     *     
     */
    public TimesheetStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimesheetStatusType }
     *     
     */
    public void setStatus(TimesheetStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusHistoryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusHistoryId() {
        return statusHistoryId;
    }

    /**
     * Sets the value of the statusHistoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusHistoryId(BigInteger value) {
        this.statusHistoryId = value;
    }

    /**
     * Gets the value of the statusEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusEffectiveDate() {
        return statusEffectiveDate;
    }

    /**
     * Sets the value of the statusEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusEffectiveDate(XMLGregorianCalendar value) {
        this.statusEffectiveDate = value;
    }

    /**
     * Gets the value of the statusEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusEndDate() {
        return statusEndDate;
    }

    /**
     * Sets the value of the statusEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusEndDate(XMLGregorianCalendar value) {
        this.statusEndDate = value;
    }

    /**
     * Gets the value of the invoiceRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceRefNo() {
        return invoiceRefNo;
    }

    /**
     * Sets the value of the invoiceRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceRefNo(String value) {
        this.invoiceRefNo = value;
    }

    /**
     * Gets the value of the externalRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRefNo() {
        return externalRefNo;
    }

    /**
     * Sets the value of the externalRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRefNo(String value) {
        this.externalRefNo = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentId(BigInteger value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the billableHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillableHours() {
        return billableHours;
    }

    /**
     * Sets the value of the billableHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillableHours(BigDecimal value) {
        this.billableHours = value;
    }

    /**
     * Gets the value of the nonBillableHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonBillableHours() {
        return nonBillableHours;
    }

    /**
     * Sets the value of the nonBillableHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonBillableHours(BigDecimal value) {
        this.nonBillableHours = value;
    }

    /**
     * Gets the value of the workLogSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TimesheetHoursSummaryType }
     *     
     */
    public TimesheetHoursSummaryType getWorkLogSummary() {
        return workLogSummary;
    }

    /**
     * Sets the value of the workLogSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimesheetHoursSummaryType }
     *     
     */
    public void setWorkLogSummary(TimesheetHoursSummaryType value) {
        this.workLogSummary = value;
    }

    /**
     * Gets the value of the workLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectTaskType }
     * 
     * 
     */
    public List<ProjectTaskType> getWorkLog() {
        if (workLog == null) {
            workLog = new ArrayList<ProjectTaskType>();
        }
        return this.workLog;
    }

    /**
     * Gets the value of the statusHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetStatusHistoryType }
     * 
     * 
     */
    public List<TimesheetStatusHistoryType> getStatusHistory() {
        if (statusHistory == null) {
            statusHistory = new ArrayList<TimesheetStatusHistoryType>();
        }
        return this.statusHistory;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTrackingType }
     *     
     */
    public RecordTrackingType getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTrackingType }
     *     
     */
    public void setTracking(RecordTrackingType value) {
        this.tracking = value;
    }

}
