package org.rmt2.util.accounting;

import java.math.BigInteger;

import org.rmt2.jaxb.GlAccountcatgType;
import org.rmt2.jaxb.GlAccounttypeType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.assistants.Verifier;

/**
 * GlAccountcatgType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class GlAccountCategoryTypeBuilder {

    private GlAccountcatgType subject;
    
    /**
     * Create a GlAccountcatgType
     */
    private GlAccountCategoryTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createGlAccountcatgType();
        subject.setAcctCatgId(builder.acctCatgId);
        subject.setDescription(builder.description);
        subject.setAcctType(builder.acctType);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link GlAccountcatgType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger acctCatgId;
        private GlAccounttypeType acctType;
        private String description;
        private RecordTrackingType tracking;

        private Builder() {
            this.acctCatgId = null;
            this.description = null;
            this.acctType = null;
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
         * Set up account category id.
         * 
         * @param acctCatgId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAcctTypeId(int acctCatgId) {
            Verifier.verifyNotNegative(acctCatgId, "Account Category id must not be a negative value");
            this.acctCatgId = BigInteger.valueOf(acctCatgId);
            return this;
        }

        /**
         * Set up balance type.
         * 
         * @param acctType
         *            an instance of {@link GlAccounttypeType} value that must not be null
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAccountType(GlAccounttypeType acctType) {
            Verifier.verifyNotNull(acctType, "Account Type cannot be null for GL Account Category");
            this.acctType = acctType;
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
         * Completes the building of the GlAccountcatgType
         * 
         * @return an instance of {@link GlAccountcatgType}
         */
        public GlAccountcatgType build() {
            GlAccountCategoryTypeBuilder obj = new GlAccountCategoryTypeBuilder(this);
            return obj.subject;
        }
    }

}
