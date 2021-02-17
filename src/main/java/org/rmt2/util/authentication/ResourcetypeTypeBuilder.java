package org.rmt2.util.authentication;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.ResourceType;

/**
 * Resource Type Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ResourcetypeTypeBuilder {

    private ResourceType subject;
    
    /**
     * Create a ResourcetypeTypeBuilder
     */
    private ResourcetypeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createResourceType();
        subject.setRsrcTypeId(builder.resourceTypeId);
        subject.setRsrcTypeName(builder.description);
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
         * Completes the building of the ResourceType
         * 
         * @return an instance of {@link ResourceType}
         */
        public ResourceType build() {
            ResourcetypeTypeBuilder obj = new ResourcetypeTypeBuilder(this);
            return obj.subject;
        }
    }

}
