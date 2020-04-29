package org.rmt2.util.projecttracker.admin;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.rmt2.jaxb.ClientType;
import org.rmt2.jaxb.CustomerType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.assistants.Verifier;

/**
 * ClientType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ClientTypeBuilder {

    private ClientType subject;
    
    /**
     * Create a ClientTypeBuilder
     */
    private ClientTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createClientType();
        subject.setClientId(builder.clientId);
        subject.setName(builder.name);
        subject.setCustomer(builder.customer);
        subject.setBillRate(builder.billRate);
        subject.setOtBillRate(builder.otBillRate);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link ClientTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger clientId;
        private String name;
        private CustomerType customer;
        private BigDecimal billRate;
        private BigDecimal otBillRate;
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
         * Set up client id.
         * 
         * @param clientId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withClientId(int clientId) {
            this.clientId = BigInteger.valueOf(clientId);
            return this;
        }

        /**
         * Set up client name
         * 
         * @param name
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withClientName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set up customer data.
         * 
         * @param customer
         *            an CustomerType value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withCustomerData(CustomerType customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Set up bill rate.
         * 
         * @param billRate
         *            an double value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withBillRate(double billRate) {
            this.billRate = BigDecimal.valueOf(billRate);
            return this;
        }

        /**
         * Set up overtime bill rate.
         * 
         * @param otBillRate
         *            an double value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withOvertimeBillRate(double otBillRate) {
            this.otBillRate = BigDecimal.valueOf(otBillRate);
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
         * Completes the building of the ClientType
         * 
         * @return an instance of {@link ClientType}
         */
        public ClientType build() {
            ClientTypeBuilder obj = new ClientTypeBuilder(this);
            return obj.subject;
        }
    }
}
