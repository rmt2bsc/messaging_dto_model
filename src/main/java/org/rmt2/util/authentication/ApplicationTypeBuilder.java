package org.rmt2.util.authentication;

import org.rmt2.jaxb.ApplicationType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;

/**
 * ApplicationType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ApplicationTypeBuilder {

    private ApplicationType subject;
    
    /**
     * Create a ApplicationType
     */
    private ApplicationTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createApplicationType();
        if (builder.appId != null && builder.appId > 0) {
            subject.setAppId(builder.appId);
        }
        subject.setAppCode(builder.name);
        subject.setDescription(builder.description);

        if (builder.active != null) {
            subject.setActive(builder.active);
        }

        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link ApplicationType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private Integer appId;
        private String name;
        private String description;
        private Integer active;
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
         * Set up application id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAppId(Integer value) {
            this.appId = value;
            return this;
        }


        /**
         * Set name.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withName(String value) {
            this.name = value;
            return this;
        }
        
        /**
         * Set description.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withDescription(String value) {
            this.description = value;
            return this;
        }

        /**
         * Set up account active indicator.
         * 
         * @param value
         *            an int value that must be 1 or 0
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withActive(Integer value) {
            this.active = value;
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
            this.tracking = tracking;
            return this;
        }

        /**
         * Completes the building of the ApplicationType
         * 
         * @return an instance of {@link ApplicationType}
         */
        public ApplicationType build() {
            ApplicationTypeBuilder obj = new ApplicationTypeBuilder(this);
            return obj.subject;
        }
    }

}
