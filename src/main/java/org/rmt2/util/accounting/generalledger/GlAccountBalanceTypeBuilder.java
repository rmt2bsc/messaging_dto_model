package org.rmt2.util.accounting.generalledger;

import java.math.BigInteger;

import org.rmt2.jaxb.GlBalancetypeType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.assistants.Verifier;

/**
 * GlBalancetypeType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class GlAccountBalanceTypeBuilder {

    private GlBalancetypeType subject;
    
    /**
     * Create a GlBalancetypeType
     */
    private GlAccountBalanceTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createGlBalancetypeType();
        subject.setAccountBaltypeId(builder.accountBaltypeId);
        subject.setLongDescription(builder.longDescription);
        subject.setShortDescription(builder.shortDescription);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link GlBalancetypeType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger accountBaltypeId;
        private String longDescription;
        private String shortDescription;
        private RecordTrackingType tracking;

        private Builder() {
            this.accountBaltypeId = null;
            this.longDescription = null;
            this.shortDescription = null;
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
         * Set up account balance type id.
         * 
         * @param acctTypeId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAcctBalanceTypeId(int accountBaltypeId) {
            Verifier.verifyNotNegative(accountBaltypeId, "Account Balance Type id must not be a negative value");
            this.accountBaltypeId = BigInteger.valueOf(accountBaltypeId);
            return this;
        }


        /**
         * Set up account type long description.
         * 
         * @param longDescription
         *            an String value that must not be empty
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLongDescription(String longDescription) {
            Verifier.verifyNotEmpty(longDescription, "Account Balance Type long description cannot be empty");
            this.longDescription = longDescription;
            return this;
        }
        
        /**
         * Set up account type short description.
         * 
         * @param shortDescription
         *            an String value that must not be empty
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withShortDescription(String shortDescription) {
            Verifier.verifyNotEmpty(shortDescription, "Account Balance Type long description cannot be empty");
            this.shortDescription = shortDescription;
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
         * Completes the building of the GlBalancetypeType
         * 
         * @return an instance of {@link GlBalancetypeType}
         */
        public GlBalancetypeType build() {
            GlAccountBalanceTypeBuilder obj = new GlAccountBalanceTypeBuilder(this);
            return obj.subject;
        }
    }

}
