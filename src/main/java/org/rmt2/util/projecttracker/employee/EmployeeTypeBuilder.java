package org.rmt2.util.projecttracker.employee;

import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.EmployeeTitleType;
import org.rmt2.jaxb.EmployeeType;
import org.rmt2.jaxb.EmployeetypeType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.PersonType;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.RMT2Date;
import com.api.util.assistants.Verifier;

/**
 * EmployeeType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class EmployeeTypeBuilder {

    private EmployeeType subject;
    
    /**
     * Create a EmployeeTypeBuilder
     */
    private EmployeeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createEmployeeType();
        subject.setEmployeeId(BigInteger.valueOf(builder.employeeId));
        subject.setEmployeeType(builder.employeeType);
        subject.setIsManager(builder.isManager);
        subject.setManagerId(BigInteger.valueOf(builder.managerId));
        subject.setEmployeeTitle(builder.employeeTitle);
        subject.setLoginId(BigInteger.valueOf(builder.loginId));
        subject.setLoginName(builder.loginName);
        subject.setContactDetails(builder.contactDetails);
        subject.setStartDate(builder.startDate);
        subject.setTerminationDate(builder.termDate);
        subject.setProjectCount(BigInteger.valueOf(builder.projectCount));
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link EmployeeTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int employeeId;
        private EmployeetypeType employeeType;
        private boolean isManager;
        private int managerId;
        private EmployeeTitleType employeeTitle;
        private int loginId;
        private String loginName;
        private PersonType contactDetails;
        private XMLGregorianCalendar startDate;
        private XMLGregorianCalendar termDate;
        private int projectCount;
        private RecordTrackingType tracking;

        private Builder() {
            this.employeeId = 0;
            this.employeeType = null;
            this.isManager = false;
            this.managerId = 0;
            this.employeeTitle = null;
            this.loginId = 0;
            this.loginName = null;
            this.contactDetails = null;
            this.startDate = null;
            this.termDate = null;
            this.projectCount = 0;
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
         * Set up employee id.
         * 
         * @param employeeId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEmployeeId(int employeeId) {
            Verifier.verifyNotNegative(employeeId, "Employee id must not be a negative value");
            this.employeeId = employeeId;
            return this;
        }


        /**
         * Set up first name.
         * 
         * @param employeeType
         *            an EmployeetypeType value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEmployeeType(EmployeetypeType employeeType) {
            this.employeeType = employeeType;
            return this;
        }

        /**
         * Set up manager indicator.
         * 
         * @param managerFlag
         *            an boolean value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withManagerFlag(boolean managerFlag) {
            this.isManager = managerFlag;
            return this;
        }

        /**
         * Set up manager id.
         * 
         * @param managerId
         *            an int value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withManagerId(int managerId) {
            this.managerId = managerId;
            return this;
        }


        /**
         * Set up employee titlee.
         * 
         * @param employeeTitle
         *            an EmployeeTitleType value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEmployeeTitleType(EmployeeTitleType employeeTitle) {
            this.employeeTitle = employeeTitle;
            return this;
        }

        /**
         * Set up login id.
         * 
         * @param loginId
         *            an int value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLoginId(int loginId) {
            this.loginId = loginId;
            return this;
        }

        /**
         * Set up login name
         * 
         * @param loginName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLoginName(String loginName) {
            Verifier.verifyNotBlank(loginName, "Login Name cannot be blank");
            this.loginName = loginName;
            return this;
        }


                /**
         * Set up contact details
         * 
         * @param contactDetails
         *            an PersonType value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withContactDetails(PersonType contactDetails) {
            this.contactDetails = contactDetails;
            return this;
        }

        /**
         * Set up start date.
         * 
         * @param startDate
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withStartDate(String startDate) {
            Verifier.verifyNotNull(startDate, "Start date String cannot be null");
            this.startDate = RMT2Date.toXmlDate(startDate);
            return this;
        }

        /**
         * Set up start date.
         * 
         * @param startDate
         *            an Date value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withStartDate(Date startDate) {
            this.startDate = RMT2Date.toXmlDate(startDate);
            return this;
        }

        /**
         * Set up termination date.
         * 
         * @param termDate
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTermDate(String termDate) {
            Verifier.verifyNotNull(termDate, "Termination date String cannot be null");
            this.termDate = RMT2Date.toXmlDate(termDate);
            return this;
        }

        /**
         * Set up termination date.
         * 
         * @param termDate
         *            an Date value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTermDate(Date termDate) {
            this.termDate = RMT2Date.toXmlDate(termDate);
            return this;
        }

        /**
         * Set up project count.
         * 
         * @param projectCount
         *            an int value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withProjectCount(int projectCount) {
            this.projectCount = projectCount;
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
         * Completes the building of the EmployeeType
         * 
         * @return an instance of {@link EmployeeType}
         */
        public EmployeeType build() {
            EmployeeTypeBuilder obj = new EmployeeTypeBuilder(this);
            return obj.subject;
        }
    }
}
