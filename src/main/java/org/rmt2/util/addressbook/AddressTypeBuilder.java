package org.rmt2.util.addressbook;

import java.math.BigInteger;

import org.rmt2.jaxb.AddressType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ZipcodeType;

/**
 * AddressType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class AddressTypeBuilder {
    
    private AddressType subject;

    /**
     * Create an AddressTypeBuilder
     */
    private AddressTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        this.subject = f.createAddressType();
        subject.setAddrId(BigInteger.valueOf(builder.addrId));
        subject.setPersonId(BigInteger.valueOf(builder.personId));
        subject.setBusinessId(BigInteger.valueOf(builder.businessId));
        subject.setAddr1(builder.addr1);
        subject.setAddr2(builder.addr2);
        subject.setAddr3(builder.addr3);
        subject.setAddr4(builder.addr4);
        subject.setZip(builder.zip);
        subject.setZipExt(BigInteger.valueOf(builder.zipExt));
        subject.setPhoneCell(builder.phoneCell);
        subject.setPhoneFax(builder.phoneFax);
        subject.setPhoneHome(builder.phoneHome);
        subject.setPhoneMain(builder.phoneMain);
        subject.setPhonePager(builder.phonePager);
        subject.setPhoneWork(builder.phoneWork);
        subject.setPhoneWorkExt(builder.phoneWorkExt);
    }

    /**
     * Builder for {@link AddressType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int addrId;
        private int personId;
        private int businessId;
        private String addr1;
        private String addr2;
        private String addr3;
        private String addr4;
        private ZipcodeType zip;
        private int zipExt;
        private String phoneHome;
        private String phoneWork;
        private String phoneWorkExt;
        private String phoneMain;
        private String phoneCell;
        private String phoneFax;
        private String phonePager;


        private Builder() {
            this.addrId = 0;
            this.personId = 0;
            this.businessId = 0;
            this.addr1 = null;
            this.addr2 = null;
            this.addr3 = null;
            this.addr4 = null;
            this.zip = null;
            this.zipExt = 0;
            this.phoneHome = null;
            this.phoneWork = null;
            this.phoneWorkExt = null;
            this.phoneMain = null;
            this.phoneCell = null;
            this.phoneFax = null;
            this.phonePager = null;
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
         * Set up address id.
         * 
         * @param addrId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAddrId(int addrId) {
            this.addrId = addrId;
            return this;
        }

        /**
         * Set up person id.
         * 
         * @param personId
         *            an int value that must be greater than zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withPersonId(int personId) {
            this.personId = personId;
            return this;
        }

        /**
         * Set up business id.
         * 
         * @param businessId
         *            an int value that must be greater than zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withBusinessId(int businessId) {
            this.businessId = businessId;
            return this;
        }

        /**
         * Set up address line 1.
         * 
         * @param addressLine
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAddressLine1(String addressLine) {
            this.addr1 = addressLine;
            return this;
        }

        /**
         * Set up address line 2.
         * 
         * @param addressLine
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAddressLine2(String addressLine) {
            this.addr2 = addressLine;
            return this;
        }

        /**
         * Set up address line 3.
         * 
         * @param addressLine
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAddressLine3(String addressLine) {
            this.addr3 = addressLine;
            return this;
        }

        /**
         * Set up address line 4.
         * 
         * @param addressLine
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAddressLine4(String addressLine) {
            this.addr4 = addressLine;
            return this;
        }

        /**
         * Set up zip code object.
         * 
         * @param zipcode
         *            an instance of {@link ZipcodeType} value that must not be
         *            null
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withZipcode(ZipcodeType zipcode) {
            this.zip = zipcode;
            return this;
        }

        /**
         * Set up zip code extension.
         * 
         * @param zipExt
         *            an int value that must be greater than zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withZipcodeExtension(int zipExt) {
            this.zipExt = zipExt;
            return this;
        }

        /**
         * Set up home phone.
         * 
         * @param phoneNo
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withPhoneHome(String phoneNo) {
            this.phoneHome = phoneNo;
            return this;
        }

        /**
         * Set up work phone.
         * 
         * @param phoneNo
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withPhoneWork(String phoneNo) {
            this.phoneWork = phoneNo;
            return this;
        }

        /**
         * Set up work phone extension.
         * 
         * @param phoneNo
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withPhoneWorkExt(String phoneNo) {
            this.phoneWorkExt = phoneNo;
            return this;
        }


        /**
         * Set up main phone.
         * 
         * @param phoneNo
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withPhoneMain(String phoneNo) {
            this.phoneMain = phoneNo;
            return this;
        }

        /**
         * Set up mobile phone.
         * 
         * @param phoneNo
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withPhoneMobile(String phoneNo) {
            this.phoneCell = phoneNo;
            return this;
        }

        /**
         * Set up fax phone.
         * 
         * @param phoneNo
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withPhoneFax(String phoneNo) {
            this.phoneFax = phoneNo;
            return this;
        }

        /**
         * Set up pager number.
         * 
         * @param phoneNo
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withPhonePager(String phoneNo) {
            this.phonePager = phoneNo;
            return this;
        }

        /**
         * Completes the building of the AddressType
         * 
         * @return an instance of {@link AddressType}
         */
        public AddressType build() {
            AddressTypeBuilder obj = new AddressTypeBuilder(this);
            return obj.subject;
        }
    }
}
