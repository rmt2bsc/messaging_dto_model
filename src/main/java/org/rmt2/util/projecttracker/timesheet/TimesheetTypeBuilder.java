package org.rmt2.util.projecttracker.timesheet;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.ClientType;
import org.rmt2.jaxb.EmployeeType;
import org.rmt2.jaxb.EventType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.TimesheetStatusHistoryType;
import org.rmt2.jaxb.TimesheetStatusType;
import org.rmt2.jaxb.TimesheetType;

import com.api.util.RMT2Date;

/**
 * TimesheetTypeBuilder Builder.
 * 
 * @author Roy Terrell
 *
 */
public class TimesheetTypeBuilder {

    private TimesheetType subject;
    
    /**
     * Create a TimesheetTypeBuilder
     */
    private TimesheetTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createTimesheetType();

        subject.setTimesheetId(builder.timesheetId);
        subject.setProjId(builder.projectId);
        subject.setDisplayValue(builder.displayTimesheetId);
        subject.setPeriodBegin(builder.beginPeriod);
        subject.setPeriodEnd(builder.endPeriod);
        subject.setInvoiceRefNo(builder.invoiceRefNo);
        subject.setExternalRefNo(builder.extRef);
        subject.setComments(builder.comments);
        subject.setDocumentId(builder.documentId);
        subject.setHourlyRate(builder.hourlyRate);
        subject.setOvertimeHourlyRate(builder.overtimeRate);
        subject.setStatusHistoryId(builder.statusHistId);
        subject.setStatusEffectiveDate(builder.statusEffectiveDate);
        subject.setStatusEndDate(builder.statusEndDate);
        subject.setBillableHours(builder.billableHours);
        subject.setNonBillableHours(builder.nonBillableHours);
        subject.setClient(builder.client);
        subject.setEmployee(builder.employee);
        subject.setStatus(builder.status);

        if (builder.timeLog != null && builder.timeLog.size() > 0) {
            subject.getTimeLog().addAll(builder.timeLog);
        }
        if (builder.statusHistory != null && builder.statusHistory.size() > 0) {
            subject.getStatusHistory().addAll(builder.statusHistory);
        }
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link TimesheetTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger timesheetId;
        private BigInteger projectId;
        private String displayTimesheetId;
        private XMLGregorianCalendar beginPeriod;
        private XMLGregorianCalendar endPeriod;
        private String employeeFullName;
        private String invoiceRefNo;
        private String extRef;
        private String comments;
        private BigInteger documentId;
        private BigDecimal hourlyRate;
        private BigDecimal overtimeRate;
        private BigInteger statusHistId;
        private XMLGregorianCalendar statusEffectiveDate;
        private XMLGregorianCalendar statusEndDate;
        private BigDecimal billableHours;
        private BigDecimal nonBillableHours;

        private ClientType client;
        private EmployeeType employee;
        private TimesheetStatusType status;
        private List<EventType> timeLog;
        private List<TimesheetStatusHistoryType> statusHistory;
        private RecordTrackingType tracking;

        private Builder() {
            this.client = null;
            this.employee = null;
            this.status = null;
            this.timeLog = null;
            this.statusHistory = null;
            this.tracking = null;
            return;
        }

        /**
         * Creates a new Builder.
         * <p>
         * Declared private to prevent direct instantiation by external
         * consumers.
         */
        public static Builder create() {
            return new Builder();
        }

        /**
         * Set up timesheet id.
         * 
         * @param value
         *            an int
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTimesheetId(int value) {
            this.timesheetId = BigInteger.valueOf(value);
            return this;
        }

        /**
         * Set up client data
         * 
         * @param value
         *            an {@link ClientType}
         * @return Non-null Builder used to continue building the object
         */
        public Builder withClient(ClientType value) {
            this.client = value;
            return this;
        }

        /**
         * Set up employee data
         * 
         * @param value
         *            an {@link EmployeeType}
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEmployee(EmployeeType value) {
            this.employee = value;
            return this;
        }

        /**
         * Set up current timesheet status data
         * 
         * @param value
         *            an {@link TimesheetStatusType}
         * @return Non-null Builder used to continue building the object
         */
        public Builder withStatus(TimesheetStatusType value) {
            this.status = value;
            return this;
        }

        /**
         * Set up project id.
         * 
         * @param value
         *            an int
         * @return Non-null Builder used to continue building the object
         */
        public Builder withProjectId(int value) {
            this.projectId = BigInteger.valueOf(value);
            return this;
        }

        /**
         * Set up timesheet id display value
         * 
         * @param value
         *            an String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDisplayTimesheetId(String value) {
            this.displayTimesheetId = value;
            return this;
        }

        /**
         * Set up timesheet begin period
         * 
         * @param value
         *            an String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withBeginPeriod(String value) {
            this.beginPeriod = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set up timesheet begin period
         * 
         * @param value
         *            an Date
         * @return Non-null Builder used to continue building the object
         */
        public Builder withBeginPeriod(Date value) {
            this.beginPeriod = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set up timesheet end period
         * 
         * @param value
         *            an String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEndPeriod(String value) {
            this.endPeriod = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set up timesheet end period
         * 
         * @param value
         *            an Date
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEndPeriod(Date value) {
            this.endPeriod = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set up invoice reference number
         * 
         * @param value
         *            an String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withInvoiceRefNo(String value) {
            this.invoiceRefNo = value;
            return this;
        }

        /**
         * Set up external reference number
         * 
         * @param value
         *            an String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withExternalRefNo(String value) {
            this.extRef = value;
            return this;
        }

        /**
         * Set up timesheet comments
         * 
         * @param value
         *            an String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withComments(String value) {
            this.comments = value;
            return this;
        }

        /**
         * Set up timesheet document id
         * 
         * @param value
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDocumentId(int value) {
            this.documentId = BigInteger.valueOf(value);
            return this;
        }

        /**
         * Set up employee hourly rate
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withHourlyRate(double value) {
            this.hourlyRate = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Set up employee overtime hourly rate
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withHourlyOvertimeRate(double value) {
            this.overtimeRate = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Set up timesheet status history id
         * 
         * @param value
         *            an int
         * @return Non-null Builder used to continue building the object
         */
        public Builder withStatusHistoryId(int value) {
            this.statusHistId = BigInteger.valueOf(value);
            return this;
        }

        /**
         * Set up effective date of timesheet status
         * 
         * @param value
         *            an String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withStatusEffectiveDate(String value) {
            this.statusEffectiveDate = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set up effective date of timesheet status
         * 
         * @param value
         *            an Date
         * @return Non-null Builder used to continue building the object
         */
        public Builder withStatusEffectiveDate(Date value) {
            this.statusEffectiveDate = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set up end date of timesheet status
         * 
         * @param value
         *            an String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withStatusEndDate(String value) {
            this.statusEndDate = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set up end date of timesheet status
         * 
         * @param value
         *            an Date
         * @return Non-null Builder used to continue building the object
         */
        public Builder withStatusEndDate(Date value) {
            this.statusEndDate = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set up employee's billable hours for timesheet
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEmployeeBillableHours(double value) {
            this.billableHours = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Set up employee's non-billable hours for timesheet
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEmployeeNonBillableHours(double value) {
            this.nonBillableHours = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Adds an event type (time for a given day) to the Set up employee's
         * non-billable hours for timesheet
         * 
         * @param value
         *            an instance of {@link EventType}
         * @return Non-null Builder used to continue building the object
         */
        public Builder addTimeLog(EventType value) {
            if (value == null) {
                return this;
            }
            if (this.timeLog == null) {
                this.timeLog = new ArrayList<>();
            }
            this.timeLog.add(value);
            return this;
        }

        /**
         * Adds a status history item to the timesheet
         * 
         * @param value
         *            an instance of {@link TimesheetStatusHistoryType}
         * @return Non-null Builder used to continue building the object
         */
        public Builder addStatusHistory(TimesheetStatusHistoryType value) {
            if (value == null) {
                return this;
            }
            if (this.statusHistory == null) {
                this.statusHistory = new ArrayList<>();
            }
            this.statusHistory.add(value);
            return this;
        }

        /**
         * Set up Record Tracking Info.
         * 
         * @param tracking
         *            an instance of {@link RecordTrackingType} not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withRecordTracking(RecordTrackingType tracking) {
            this.tracking = tracking;
            return this;
        }

        /**
         * Completes the building of the TimesheetType
         * 
         * @return an instance of {@link TimesheetType}
         */
        public TimesheetType build() {
            TimesheetTypeBuilder obj = new TimesheetTypeBuilder(this);
            return obj.subject;
        }
    }
}
