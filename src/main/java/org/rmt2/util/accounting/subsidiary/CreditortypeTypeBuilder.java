package org.rmt2.util.accounting.subsidiary;

import java.math.BigInteger;

import org.rmt2.jaxb.CreditortypeType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.assistants.Verifier;

/**
 * CreditortypeType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class CreditortypeTypeBuilder {

    private CreditortypeType subject;
    
    /**
     * Create a CreditorTypeBuilder
     */
    private CreditortypeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createCreditortypeType();
        subject.setCreditorTypeId(builder.creditorTypeId);
        subject.setDescription(builder.description);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link CreditortypeType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger creditorTypeId;
        private String description;
        private RecordTrackingType tracking;

        private Builder() {
            this.creditorTypeId = null;
            this.description = null;
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
         * Set up creditor type id.
         * 
         * @param creditorTypeId
         *            an int value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCreditorTypeId(int creditorTypeId) {
            this.creditorTypeId = BigInteger.valueOf(creditorTypeId);
            return this;
        }
        
        /**
         * Set up description.
         * 
         * @param description
         *            an String value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withDescription(String description) {
            this.description = description;
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
         * Completes the building of the CreditortypeType
         * 
         * @return an instance of {@link CreditortypeType}
         */
        public CreditortypeType build() {
            CreditortypeTypeBuilder obj = new CreditortypeTypeBuilder(this);
            return obj.subject;
        }
    }
}
