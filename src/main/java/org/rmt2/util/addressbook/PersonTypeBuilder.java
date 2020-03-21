package org.rmt2.util.addressbook;

import java.math.BigInteger;
import java.util.Date;

import org.rmt2.jaxb.AddressType;
import org.rmt2.jaxb.CodeDetailType;
import org.rmt2.jaxb.GenerationType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.PersonType;

import com.api.util.RMT2Date;
import com.api.util.assistants.Verifier;

/**
 * PersonType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class PersonTypeBuilder {

    private PersonType subject;
    
    /**
     * Create a PersonTypeBuilder
     */
    private PersonTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createPersonType();
        subject.setPersonId(BigInteger.valueOf(builder.personId));
        subject.setFirstName(builder.firstName);
        subject.setMidName(builder.midName);
        subject.setLastName(builder.lastName);
        subject.setMaidenName(builder.maidenName);
        subject.setShortName(builder.shortName);
        subject.setBirthDate(builder.birthDate);
        subject.setSsn(builder.ssn);
        subject.setEmail(builder.email);
        subject.setGeneration(builder.generation);
        subject.setTitle(builder.title);
        subject.setGender(builder.gender);
        subject.setMaritalStatus(builder.maritalStatus);
        subject.setRace(builder.race);
        subject.setCategory(builder.category);
        subject.setAddress(builder.address);
    }

    /**
     * Builder for {@link BusinessType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int personId;
        private String firstName;
        private String midName;
        private String lastName;
        private String maidenName;
        private String shortName;
        private String birthDate;
        private String ssn;
        private String email;
        private GenerationType generation;
        private CodeDetailType title;
        private CodeDetailType gender;
        private CodeDetailType maritalStatus;
        private CodeDetailType race;
        private CodeDetailType category;
        private AddressType address;

        private Builder() {
            this.personId = 0;
            this.firstName = null;
            this.midName = null;
            this.lastName = null;
            this.maidenName = null;
            this.shortName = null;
            this.birthDate = null;
            this.ssn = null;
            this.email = null;
            this.generation = null;
            this.title = null;
            this.gender = null;
            this.maritalStatus = null;
            this.race = null;
            this.category = null;
            this.address = null;
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
         * @param personId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withPersonId(int personId) {
            Verifier.verifyNotNegative(personId, "Person id must not be a negative value");
            this.personId = personId;
            return this;
        }


        /**
         * Set up first name.
         * 
         * @param firstName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withFirstName(String firstName) {
            Verifier.verifyNotBlank(firstName, "First name cannot be blank");
            this.firstName = firstName;
            return this;
        }

        /**
         * Set up middle name.
         * 
         * @param midName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withMiddleName(String midName) {
            Verifier.verifyNotBlank(midName, "Middle name cannot be blank");
            this.midName = midName;
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
            this.lastName = lastName;
            return this;
        }


        /**
         * Set up maiden name.
         * 
         * @param maidenName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withMaidenName(String maidenName) {
            Verifier.verifyNotBlank(maidenName, "Maiden name cannot be blank");
            this.maidenName = maidenName;
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
            this.shortName = shortName;
            return this;
        }

        /**
         * Set up birth date.
         * 
         * @param birthDate
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withBirthDate(Date birthDate) {
            Verifier.verifyNotNull(birthDate, "Birth day cannot be null");
            String dateStr = RMT2Date.formatDate(birthDate, "MM/dd/yyyy");
            this.birthDate = dateStr;
            return this;
        }

        /**
         * Set up SSN.
         * 
         * @param ssn
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withSocialSecurityNumber(String ssn) {
            Verifier.verifyNotBlank(ssn, "Social Security Number cannot be blank");
            this.ssn = ssn;
            return this;
        }

        /**
         * Set up Email.
         * 
         * @param email
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEmail(String email) {
            Verifier.verifyNotBlank(email, "Email cannot be blank");
            this.email = email;
            return this;
        }

        /**
         * Set up generation.
         * 
         * @param generation
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withGeneration(String generation) {
            Verifier.verifyNotBlank(ssn, "Generation cannot be blank");
            GenerationType genType = null;
            try {
                genType = GenerationType.fromValue(generation);
            } catch (IllegalArgumentException e) {
                Verifier.verifyNotNull(genType, "Invalid value passed as Generation");
            }
            this.generation = genType;
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
            Verifier.verifyNotNull(maritalStatus, "Gender object cannot be null");
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
         * Set up address.
         * 
         * @param address
         *            an instance of {@link AddressType} value that must not be
         *            blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAddress(AddressType address) {
            Verifier.verifyNotNull(address, "Address object cannot be null");
            this.address = address;
            return this;
        }

        /**
         * Completes the building of the BusinessType
         * 
         * @return an instance of {@link BusinessType}
         */
        public PersonType build() {
            PersonTypeBuilder obj = new PersonTypeBuilder(this);
            return obj.subject;
        }
    }
}
