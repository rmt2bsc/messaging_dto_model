package org.rmt2.util.projecttracker.employee;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.EmployeeProjectType;
import org.rmt2.jaxb.EmployeeType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ProjectType;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.util.projecttracker.admin.ProjectTypeBuilder;

import com.api.util.RMT2Date;
import com.api.util.assistants.Verifier;

/**
 * EmployeeProjectType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class EmployeeProjectTypeBuilder {

    private EmployeeProjectType subject;
    
    /**
     * Create a EmployeeProjectTypeBuilder
     */
    private EmployeeProjectTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createEmployeeProjectType();

        EmployeeType et = EmployeeTypeBuilder.Builder.create()
                .withEmployeeId(builder.employeeId)
                .build();
        
        ProjectType ept = ProjectTypeBuilder.Builder.create()
                .withProjectId(builder.projectId == null ? 0 : builder.projectId)
                .withProjectName(builder.projectName)
                .withEffectiveDate(builder.projEffectiveDate)
                .withEndDate(builder.projEndDate)
                .withClientId(builder.clientId)
                .withClientName(builder.clientName)
                .withBillRate(builder.clientBillRate == null ? 0 : builder.clientBillRate)
                .withOvertimeBillRate(builder.clientOverTimeBillRate == null ? 0 : builder.clientOverTimeBillRate)
                .withClientBusinessId(builder.clientBusinessId)
                .withClientAccountNo(builder.clientAccountNo)
                .build();

        if (builder.employeeProjectId != null) {
            subject.setEmployeeProjectId(BigInteger.valueOf(builder.employeeProjectId));
        }

        subject.setEffectiveDate(builder.empProjEffectiveDate);
        subject.setEndDate(builder.empProjEndDate);

        if (builder.houlyRate != null) {
            subject.setHourlyRate(BigDecimal.valueOf(builder.houlyRate));
        }
        if (builder.houlyOverTimeRate != null) {
            subject.setHourlyOvertimeRate(BigDecimal.valueOf(builder.houlyOverTimeRate));
        }
        if (builder.flatRate != null) {
            subject.setFlatRate(BigDecimal.valueOf(builder.flatRate));
        }

        subject.setComments(builder.comments);
        subject.setTracking(builder.tracking);
        subject.setEmployee(et);
        subject.setProject(ept);
    }

    /**
     * Builder for {@link EmployeeProjectTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private Integer employeeProjectId;
        private int employeeId;
        private XMLGregorianCalendar empProjEffectiveDate;
        private XMLGregorianCalendar empProjEndDate;
        private Double houlyRate;
        private Double houlyOverTimeRate;
        private Double flatRate;
        String comments;

        private Integer projectId;
        private String projectName;
        private Date projEffectiveDate;
        private Date projEndDate;

        private int clientId;
        private int clientBusinessId;
        private String clientName;
        private String clientAccountNo;
        private Double clientBillRate;
        private Double clientOverTimeBillRate;

        private RecordTrackingType tracking;

        private Builder() {
            this.tracking = null;
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
         * Set up employee project id.
         * 
         * @param employeeProjectId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEmpProjId(int employeeProjectId) {
            this.employeeProjectId = employeeProjectId;
            return this;
        }

        /**
         * Set up employee id.
         * 
         * @param employeeId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEmployeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        /**
         * Set up employee project effective date.
         * 
         * @param startDate
         *            an Date value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEmpProjEffectiveDate(Date startDate) {
            this.empProjEffectiveDate = RMT2Date.toXmlDate(startDate);
            return this;
        }

        /**
         * Set up employee project effective date.
         * 
         * @param termDate
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEmpProjEffectiveDate(String startDate) {
            this.empProjEffectiveDate = RMT2Date.toXmlDate(startDate);
            return this;
        }

        /**
         * Set up employee project end date.
         * 
         * @param termDate
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEmpProjEndDate(String termDate) {
            this.empProjEndDate = RMT2Date.toXmlDate(termDate);
            return this;
        }

        /**
         * Set up employee project end date.
         * 
         * @param termDate
         *            a Date value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEmpProjEndDate(Date termDate) {
            this.empProjEndDate = RMT2Date.toXmlDate(termDate);
            return this;
        }

        /**
         * Set up hourly rate.
         * 
         * @param hourlyRate
         *            an boolean value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEmpProjHourlyRate(double hourlyRate) {
            this.houlyRate = Double.valueOf(hourlyRate);
            return this;
        }

        /**
         * Set up hourly over time rate.
         * 
         * @param hourlyOverRate
         *            an boolean value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEmpProjHourlyOvertimeRate(double hourlyOverRate) {
            this.houlyOverTimeRate = Double.valueOf(hourlyOverRate);
            return this;
        }

        /**
         * Set up flat rate.
         * 
         * @param flatRate
         *            an boolean value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEmpProjFlatRate(double flatRate) {
            this.flatRate = Double.valueOf(flatRate);
            return this;
        }

        /**
         * Set up comments.
         * 
         * @param comments
         *            an int value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEmpProjComments(String comments) {
            this.comments = comments;
            return this;
        }

        /**
         * Set up client id.
         * 
         * @param clientId
         * 
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withClientId(int clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Set up client business id.
         * 
         * @param businessId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withClientBusinessId(int businessId) {
            this.clientBusinessId = businessId;
            return this;
        }

        /**
         * Set up client effective date.
         * 
         * @param startDate
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withClientName(String name) {
            this.clientName = name;
            return this;
        }

        /**
         * Set up client account number.
         * 
         * @param acctNo
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withClientAccountNo(String acctNo) {
            this.clientAccountNo = acctNo;
            return this;
        }

        /**
         * Set up hourly rate.
         * 
         * @param hourlyRate
         *            an boolean value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withClientBillRate(double hourlyRate) {
            this.clientBillRate = Double.valueOf(hourlyRate);
            return this;
        }

        /**
         * Set up hourly over time rate.
         * 
         * @param hourlyOverRate
         *            an boolean value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withClientOvertimeBillRate(double hourlyOverRate) {
            this.clientOverTimeBillRate = Double.valueOf(hourlyOverRate);
            return this;
        }

        /**
         * Set up project id.
         * 
         * @param projectId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withProjectId(int projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * Set up project name.
         * 
         * @param projectName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * Set up project effective date.
         * 
         * @param startDate
         *            an Date value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withProjectEffectiveDate(Date startDate) {
            this.projEffectiveDate = startDate;
            return this;
        }

        /**
         * Set up project effective date.
         * 
         * @param startDate
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withProjectEffectiveDate(String startDate) {
            this.projEffectiveDate = RMT2Date.stringToDate(startDate);
            return this;
        }

        /**
         * Set up project end date.
         * 
         * @param termDate
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withProjectEndDate(String termDate) {
            this.projEndDate = RMT2Date.stringToDate(termDate);
            ;
            return this;
        }

        /**
         * Set up project end date.
         * 
         * @param termDate
         *            a Date value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withProjectEndDate(Date termDate) {
            this.projEndDate = termDate;
            return this;
        }


        /**
         * Set up Record Tracking Info.
         * 
         * @param tracking
         *            an instance of {@link RecordTrackingType} value that must
         *            not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRecordTracking(RecordTrackingType tracking) {
            Verifier.verifyNotNull(tracking, "Tracking info cannot be null");
            this.tracking = tracking;
            return this;
        }

        /**
         * Completes the building of the EmployeeProjectType
         * 
         * @return an instance of {@link EmployeeProjectType}
         */
        public EmployeeProjectType build() {
            EmployeeProjectTypeBuilder obj = new EmployeeProjectTypeBuilder(this);
            return obj.subject;
        }
    }
}
