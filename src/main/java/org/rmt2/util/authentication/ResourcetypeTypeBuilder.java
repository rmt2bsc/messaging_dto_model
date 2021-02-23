package org.rmt2.util.authentication;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.ResourcetypeType;

/**
 * Resource Type Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ResourcetypeTypeBuilder {

    private ResourcetypeType subject;
    
    /**
     * Create a ResourcetypeTypeBuilder
     */
    private ResourcetypeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createResourcetypeType();
        subject.setUid(builder.resourceTypeId);
        subject.setDescription(builder.description);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link UserGroupType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int resourceTypeId;
        private String description;
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
         * Set up user group id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTypeId(int value) {
            this.resourceTypeId = value;
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
         * Completes the building of the ResourcetypeType
         * 
         * @return an instance of {@link ResourcetypeType}
         */
        public ResourcetypeType build() {
            ResourcetypeTypeBuilder obj = new ResourcetypeTypeBuilder(this);
            return obj.subject;
        }
    }

}
