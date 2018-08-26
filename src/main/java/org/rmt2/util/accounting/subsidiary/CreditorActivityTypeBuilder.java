package org.rmt2.util.accounting.subsidiary;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.rmt2.jaxb.CreditorActivityType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.XactType;

import com.api.util.assistants.Verifier;

/**
 * CreditorActivityType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class CreditorActivityTypeBuilder {

    private CreditorActivityType subject;
    
    /**
     * Create a CreditorActivityType
     */
    private CreditorActivityTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createCreditorActivityType();
        subject.setCreditorId(builder.creditorId);
        subject.setCreditorActivityId(builder.creditorActivityId);
        subject.setAmount(builder.amount);
        subject.setXactDetails(builder.xactDetails);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link CreditorActivityType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger creditorActivityId;
        private BigInteger creditorId;
        private BigDecimal amount;
        private XactType xactDetails;
        private RecordTrackingType tracking;

        private Builder() {
            this.creditorId = null;
            this.creditorActivityId = null;
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
         * Set up creditor id.
         * 
         * @param creditorId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCreditorId(int creditorId) {
            Verifier.verifyNotNegative(creditorId, "Creditor id must not be a negative value");
            this.creditorId = BigInteger.valueOf(creditorId);
            return this;
        }

        /**
         * Set up Creditor Activity Id.
         * 
         * @param creditorActivityId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCreditorActivityId(int creditorActivityId) {
            this.creditorActivityId = BigInteger.valueOf(creditorActivityId);
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
            ObjectFactory f = new ObjectFactory();
            this.xactDetails = f.createXactType();
            this.xactDetails.setXactId(BigInteger.valueOf(xactId));
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
         * Completes the building of the CreditorActivityType
         * 
         * @return an instance of {@link CreditorActivityType}
         */
        public CreditorActivityType build() {
            CreditorActivityTypeBuilder obj = new CreditorActivityTypeBuilder(this);
            return obj.subject;
        }
    }
}
