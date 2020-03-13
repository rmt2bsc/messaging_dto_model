package org.rmt2.util.accounting.transaction;

import java.math.BigInteger;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.XactCodeGroupType;

import com.api.util.assistants.Verifier;

/**
 * XactCodeGroupType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class XactCodeGroupTypeBuilder {

    private XactCodeGroupType subject;
    
    /**
     * Create a XactCodeGroupTypeBuilder
     */
    private XactCodeGroupTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createXactCodeGroupType();
        subject.setXactCodeGrpId(builder.xactCodeGrpId);
        subject.setDescription(builder.description);
         subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link XactCodeGroupType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        protected BigInteger xactCodeGrpId;
        protected String description;
        protected RecordTrackingType tracking;

        private Builder() {
            this.description = null;
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
         * Set up transaction group id.
         * 
         * @param xactCodeGrpId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withGroupId(int xactCodeGrpId) {
            this.xactCodeGrpId = BigInteger.valueOf(xactCodeGrpId);
            return this;
        }
 
        /**
         * Set up description.
         * 
         * @param description
         *            an String value
         * @return Non-null Builder used to continue building the object
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
         * Completes the building of the XactCodeGroupType
         * 
         * @return an instance of {@link XactCodeGroupType}
         */
        public XactCodeGroupType build() {
            XactCodeGroupTypeBuilder obj = new XactCodeGroupTypeBuilder(this);
            return obj.subject;
        }
    }
}
