package org.rmt2.util.addressbook;

import java.math.BigInteger;

import org.rmt2.jaxb.AddressType;
import org.rmt2.jaxb.BusinessType;
import org.rmt2.jaxb.CodeDetailType;
import org.rmt2.jaxb.CodeGroupType;
import org.rmt2.jaxb.ObjectFactory;

import com.api.util.assistants.Verifier;

/**
 * BusinessType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class BusinessTypeBuilder {

    private BusinessType subject;
    
    /**
     * Create a BusinessTypeBuilder
     */
    private BusinessTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createBusinessType();
        subject.setBusinessId(BigInteger.valueOf(builder.businessId));
        subject.setLongName(builder.longName);
        subject.setShortName(builder.shortName);
        subject.setContactFirstname(builder.contactFirstname);
        subject.setContactLastname(builder.contactLastname);
        subject.setContactPhone(builder.contactPhone);
        subject.setContactExt(builder.contactExt);
        subject.setContactEmail(builder.contactEmail);
        subject.setTaxId(builder.taxId);
        subject.setWebsite(builder.website);
        subject.setEntityType(builder.entityType);
        subject.setServiceType(builder.serviceType);
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
        private int businessId;
        private String longName;
        private String shortName;
        private String contactFirstname;
        private String contactLastname;
        private String contactPhone;
        private String contactExt;
        private String contactEmail;
        private String taxId;
        private String website;
        private CodeDetailType entityType;
        private CodeDetailType serviceType;
        private CodeGroupType category;
        private AddressType address;

        private Builder() {
            this.businessId = 0;
            this.longName = null;
            this.shortName = null;
            this.contactFirstname = null;
            this.contactLastname = null;
            this.contactPhone = null;
            this.contactExt = null;
            this.contactEmail = null;
            this.taxId = null;
            this.website = null;
            this.entityType = null;
            this.serviceType = null;
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
         * Set up business id.
         * 
         * @param businessId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withBusinessId(int businessId) {
            Verifier.verifyNotNegative(businessId, "Business id must not be a negative value");
            this.businessId = businessId;
            return this;
        }


        /**
         * Set up business long name.
         * 
         * @param longName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLongname(String longName) {
            Verifier.verifyNotBlank(longName, "Business long name description cannot be blank");
            this.longName = longName;
            return this;
        }

        /**
         * Set up business short name.
         * 
         * @param shortName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withShortname(String shortName) {
            Verifier.verifyNotBlank(shortName, "Business short name description cannot be blank");
            this.shortName = shortName;
            return this;
        }

        /**
         * Set up contact first name.
         * 
         * @param contactFirstname
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withContactFirstname(String contactFirstname) {
            Verifier.verifyNotBlank(contactFirstname, "Contact first name cannot be blank");
            this.contactFirstname = contactFirstname;
            return this;
        }

        /**
         * Set up contact last name.
         * 
         * @param contactLastname
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withContactLastname(String contactLastname) {
            Verifier.verifyNotBlank(contactLastname, "Contact last name cannot be blank");
            this.contactLastname = contactLastname;
            return this;
        }

        /**
         * Set up contact phone.
         * 
         * @param contactPhone
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withContactPhone(String contactPhone) {
            Verifier.verifyNotBlank(contactPhone, "Contact phone cannot be blank");
            this.contactPhone = contactPhone;
            return this;
        }

        /**
         * Set up contact phone extension.
         * 
         * @param contactExt
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withContactPhoneExt(String contactExt) {
            Verifier.verifyNotBlank(contactExt, "Contact phone extension cannot be blank");
            this.contactExt = contactExt;
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
         * Set up tax id.
         * 
         * @param taxId
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTaxId(String taxId) {
            Verifier.verifyNotBlank(taxId, "Contact tax id cannot be blank");
            this.taxId = taxId;
            return this;
        }

        /**
         * Set up web site.
         * 
         * @param website
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withWebsite(String website) {
            Verifier.verifyNotBlank(website, "Web site cannot be blank");
            this.website = website;
            return this;
        }

        /**
         * Set up entity type.
         * 
         * @param entityType
         *            an instance of {@link CodeDetailType} value that must not
         *            be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEntityType(CodeDetailType entityType) {
            Verifier.verifyNotNull(website, "Entity type object cannot be null");
            this.entityType = entityType;
            return this;
        }

        /**
         * Set up servcie type.
         * 
         * @param serviceType
         *            an instance of {@link CodeDetailType} value that must not
         *            be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withServiceType(CodeDetailType serviceType) {
            Verifier.verifyNotNull(serviceType, "Service type object cannot be null");
            this.serviceType = serviceType;
            return this;
        }

        /**
         * Set up category.
         * 
         * @param category
         *            an instance of {@link CodeGroupType} value that must not
         *            be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCategory(CodeGroupType category) {
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
        public BusinessType build() {
            BusinessTypeBuilder obj = new BusinessTypeBuilder(this);
            return obj.subject;
        }
    }

}
