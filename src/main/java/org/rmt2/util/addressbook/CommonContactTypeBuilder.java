package org.rmt2.util.addressbook;

import java.math.BigInteger;

import org.rmt2.jaxb.AddressType;
import org.rmt2.jaxb.CommonContactType;
import org.rmt2.jaxb.ContacttypeType;
import org.rmt2.jaxb.ObjectFactory;

import com.util.assistants.Verifier;

/**
 * CommonContactType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class CommonContactTypeBuilder {

    /**
     * Create a CommonContactTypeBuilder
     */
    public CommonContactTypeBuilder() {
        return;
    }

    /**
     * Builder for {@link CodeGroupType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int contactId;
        private String contactName;
        private String contactEmail;
        private ContacttypeType contactType;
        private AddressType address;

        private Builder() {
            this.contactId = 0;
            this.contactName = null;
            this.contactEmail = null;
            this.contactType = null;
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
         * Set up contact id.
         * 
         * @param contactId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withContactId(int contactId) {
            Verifier.verifyNotNegative(contactId, "Contact id must not be a negative value");
            this.contactId = contactId;
            return this;
        }


        /**
         * Set up contact name.
         * 
         * @param contactName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withContactName(String contactName) {
            Verifier.verifyNotBlank(contactName, "Contact Name cannot be blank");
            this.contactName = contactName;
            return this;
        }

        /**
         * Set up contact email.
         * 
         * @param contactEmail
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withContactEmail(String contactEmail) {
            Verifier.verifyNotBlank(contactEmail, "Contact email cannot be blank");
            this.contactEmail = contactEmail;
            return this;
        }

        /**
         * Set up contact type.
         * 
         * @param contactEmail
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withContactType(ContacttypeType contactType) {
            Verifier.verifyNotNull(contactType, "Contact type object cannot be blank");
            this.contactType = contactType;
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
         * Completes the building of the CommonContactType
         * 
         * @return an instance of {@link CommonContactType}
         */
        public CommonContactType build() {
            ObjectFactory f = new ObjectFactory();
            CommonContactType subject = f.createCommonContactType();
            subject.setContactId(BigInteger.valueOf(this.contactId));
            subject.setContactName(this.contactName);
            subject.setContactEmail(this.contactEmail);
            subject.setContactType(this.contactType);
            subject.setAddress(this.address);
            return subject;
        }
    }

}
