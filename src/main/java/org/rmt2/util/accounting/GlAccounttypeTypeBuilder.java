package org.rmt2.util.accounting;

import java.math.BigInteger;

import org.rmt2.jaxb.GlAccounttypeType;
import org.rmt2.jaxb.GlBalancetypeType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.assistants.Verifier;

/**
 * GlAccounttypeType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class GlAccounttypeTypeBuilder {

    private GlAccounttypeType subject;
    
    /**
     * Create a GlAccounttypeType
     */
    private GlAccounttypeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createGlAccounttypeType();
        subject.setAcctTypeId(builder.acctTypeId);
        subject.setDescription(builder.description);
        subject.setBalanceType(builder.balanceType);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link GlAccounttypeType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger acctTypeId;
        private String description;
        private GlBalancetypeType balanceType;
        private RecordTrackingType tracking;

        private Builder() {
            this.acctTypeId = null;
            this.description = null;
            this.balanceType = null;
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
         * Set up account type id.
         * 
         * @param acctTypeId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAcctTypeId(int acctTypeId) {
            Verifier.verifyNotNegative(acctTypeId, "Account Type id must not be a negative value");
            this.acctTypeId = BigInteger.valueOf(acctTypeId);
            return this;
        }

        /**
         * Set up balance type.
         * 
         * @param balType
         *            an instance of {@link GlBalancetypeType} value that must not be null
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withBalanceType(GlBalancetypeType balType) {
            Verifier.verifyNotNull(balType, "Balance Type cannot be null");
            this.balanceType = balType;
            return this;
        }

        
        /**
         * Set up account type description.
         * 
         * @param description
         *            an String value that must not be empty
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withDescription(String description) {
            Verifier.verifyNotEmpty(description, "Account Type description cannot be empty");
            this.description = description;
            return this;
        }
        
 
        /**
         * Set up record tracking details.
         * 
         * @param tracking
         *            an instance of {@link RecordTrackingType} value that must not
         *            be null
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRecordTrackingType(RecordTrackingType tracking) {
            Verifier.verifyNotNull(tracking, "GL Account record tracking object cannot be null");
            this.tracking = tracking;
            return this;
        }

        /**
         * Completes the building of the GlAccounttypeType
         * 
         * @return an instance of {@link GlAccounttypeType}
         */
        public GlAccounttypeType build() {
            GlAccounttypeTypeBuilder obj = new GlAccounttypeTypeBuilder(this);
            return obj.subject;
        }
    }

}
