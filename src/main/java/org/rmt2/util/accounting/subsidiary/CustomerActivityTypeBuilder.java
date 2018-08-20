package org.rmt2.util.accounting.subsidiary;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.rmt2.jaxb.CustomerActivityType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.XactType;

import com.api.util.assistants.Verifier;

/**
 * CustomerActivityType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class CustomerActivityTypeBuilder {

    private CustomerActivityType subject;
    
    /**
     * Create a CustomerActivityType
     */
    private CustomerActivityTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createCustomerActivityType();
        subject.setCustomerId(builder.customerId);
        subject.setCustomerActivityId(builder.customerActivityId);
        subject.setXactId(builder.xactId);
        subject.setAmount(builder.amount);
        subject.setXactDetails(builder.xactDetails);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link CustomerActivityType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger customerActivityId;
        private BigInteger customerId;
        private BigInteger xactId;
        private BigDecimal amount;
        private XactType xactDetails;
        private RecordTrackingType tracking;

        private Builder() {
            this.customerId = null;
            this.customerActivityId = null;
            this.xactId = null;
            this.amount = null;
            this.xactDetails = null;
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
         * Set up customer id.
         * 
         * @param customerId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCustomerId(int customerId) {
            Verifier.verifyNotNegative(customerId, "Customer id must not be a negative value");
            this.customerId = BigInteger.valueOf(customerId);
            return this;
        }

        /**
         * Set up Customer Activity Id.
         * 
         * @param customerActivityId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCustomerActivityId(int customerActivityId) {
            Verifier.verifyNotNegative(customerActivityId, "Acct id must not be a negative value");
            this.customerActivityId = BigInteger.valueOf(customerActivityId);
            return this;
        }
        
        /**
         * Set up transaction id.
         * 
         * @param xactId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withXactId(int xactId) {
            Verifier.verifyNotNegative(customerActivityId, "Xact id must not be a negative value");
            this.xactId = BigInteger.valueOf(xactId);;
            return this;
        }
        
      

        /**
         * Set up transaction details
         * 
         * @param xactDetails
         *            
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withXactDetails(XactType xactDetails) {
            this.xactDetails = xactDetails;
            return this;
        }

        /**
         * Set up amount.
         * 
         * @param amount
         *            an double value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAmount(double amount) {
            this.amount = BigDecimal.valueOf(amount);
            return this;
        }

        /**
         * Set up Record Tracking Info.
         * 
         * @param tracking
         *            an instance of {@link RecordTrackingType} value that must not be
         *            blank
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
         * Completes the building of the CustomerActivityType
         * 
         * @return an instance of {@link CustomerActivityType}
         */
        public CustomerActivityType build() {
            CustomerActivityTypeBuilder obj = new CustomerActivityTypeBuilder(this);
            return obj.subject;
        }
    }
}
