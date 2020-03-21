package org.rmt2.util.projecttracker.employee;

import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.CodeDetailType;
import org.rmt2.jaxb.EmployeeTitleType;
import org.rmt2.jaxb.EmployeeType;
import org.rmt2.jaxb.EmployeetypeType;
import org.rmt2.jaxb.GenerationType;
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
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link BusinessType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private Integer employeeId;
        private EmployeetypeType employeeType;
        private boolean isManager;
        private Integer managerId;
        private EmployeeTitleType employeeTitle;
        private Integer loginId;
        private String loginName;
        private PersonType contactDetails;
        private XMLGregorianCalendar startDate;
        private XMLGregorianCalendar termDate;
        private RecordTrackingType tracking;

        private Builder() {
            this.employeeId = null;
            this.employeeType = null;
            this.isManager = false;
            this.managerId = null;
            this.employeeTitle = null;
            this.loginId = null;
            this.loginName = null;
            this.contactDetails = null;
            this.startDate = null;
            this.termDate = null;
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
         * Set up person id.
         * 
         * @param employeeId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withPersonId(int personId) {
            Verifier.verifyNotNegative(personId, "Person id must not be a negative value");
            this.employeeId = personId;
            return this;
        }


        /**
         * Set up first name.
         * 
         * @param employeeType
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withFirstName(String firstName) {
            Verifier.verifyNotBlank(firstName, "First name cannot be blank");
            this.employeeType = firstName;
            return this;
        }

        /**
         * Set up middle name.
         * 
         * @param isManager
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withMiddleName(String midName) {
            Verifier.verifyNotBlank(midName, "Middle name cannot be blank");
            this.isManager = midName;
            return this;
        }

        /**
         * Set up last name.
         * 
         * @param lastName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLastName(String lastName) {
            Verifier.verifyNotBlank(lastName, "Last name cannot be blank");
            this.managerId = lastName;
            return this;
        }


        /**
         * Set up maiden name.
         * 
         * @param employeeTitle
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withMaidenName(String maidenName) {
            Verifier.verifyNotBlank(maidenName, "Maiden name cannot be blank");
            this.employeeTitle = maidenName;
            return this;
        }

        /**
         * Set up short name.
         * 
         * @param shortName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withShortName(String shortName) {
            Verifier.verifyNotBlank(shortName, "Short name cannot be blank");
            this.loginId = shortName;
            return this;
        }

        /**
         * Set up birth date.
         * 
         * @param loginName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withBirthDate(Date birthDate) {
            Verifier.verifyNotNull(birthDate, "Birth day cannot be null");
            String dateStr = RMT2Date.formatDate(birthDate, "MM/dd/yyyy");
            this.loginName = dateStr;
            return this;
        }

        /**
         * Set up SSN.
         * 
         * @param contactDetails
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withSocialSecurityNumber(String ssn) {
            Verifier.verifyNotBlank(ssn, "Social Security Number cannot be blank");
            this.contactDetails = ssn;
            return this;
        }

        /**
         * Set up Email.
         * 
         * @param startDate
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEmail(String email) {
            Verifier.verifyNotBlank(contactDetails, "Email cannot be blank");
            this.startDate = email;
            return this;
        }

        /**
         * Set up termDate.
         * 
         * @param termDate
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withGeneration(String generation) {
            Verifier.verifyNotBlank(contactDetails, "Generation cannot be blank");
            GenerationType genType = null;
            try {
                genType = GenerationType.fromValue(generation);
            } catch (IllegalArgumentException e) {
                Verifier.verifyNotNull(genType, "Invalid value passed as Generation");
            }
            this.termDate = genType;
            return this;
        }

        /**
         * Set up title.
         * 
         * @param title
         *            an instance of {@link CodeDetailType} value that must not
         *            be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTitle(CodeDetailType title) {
            Verifier.verifyNotNull(title, "Name title object cannot be null");
            this.title = title;
            return this;
        }

        /**
         * Set up gender.
         * 
         * @param gender
         *            an instance of {@link CodeDetailType} value that must not
         *            be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withGender(CodeDetailType gender) {
            Verifier.verifyNotNull(gender, "Gender object cannot be null");
            this.gender = gender;
            return this;
        }

        /**
         * Set up Marital Status.
         * 
         * @param maritalStatus
         *            an instance of {@link CodeDetailType} value that must not
         *            be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withMaritalStatus(CodeDetailType maritalStatus) {
            Verifier.verifyNotNull(gender, "Gender object cannot be null");
            this.maritalStatus = maritalStatus;
            return this;
        }

        /**
         * Set up race.
         * 
         * @param race
         *            an instance of {@link CodeDetailType} value that must not
         *            be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRace(CodeDetailType race) {
            Verifier.verifyNotNull(race, "Race object cannot be null");
            this.race = race;
            return this;
        }

        /**
         * Set up category.
         * 
         * @param category
         *            an instance of {@link CodeDetailType} value that must not
         *            be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCategory(CodeDetailType category) {
            Verifier.verifyNotNull(category, "Category object cannot be null");
            this.category = category;
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
