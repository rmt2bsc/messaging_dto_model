package org.rmt2.util.authentication;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.ResourcesubtypeType;

/**
 * Resource Sub Type Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ResourceSubtypeTypeBuilder {

    private ResourcesubtypeType subject;
    
    /**
     * Create a ResourcetypeTypeBuilder
     */
    private ResourceSubtypeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createResourcesubtypeType();
        subject.setUid(builder.resourceSubTypeId);
        subject.setResourceTypeId(builder.resourceTypeId);
        subject.setCode(builder.name);
        subject.setDescription(builder.description);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link ResourceType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int resourceSubTypeId;
        private int resourceTypeId;
        private String name;
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
         * Set up resource sub type id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withSubTypeId(int value) {
            this.resourceSubTypeId = value;
            return this;
        }

        /**
         * Set up resource type id
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
         * Completes the building of the ResourcesubtypeType
         * 
         * @return an instance of {@link ResourcesubtypeType}
         */
        public ResourcesubtypeType build() {
            ResourceSubtypeTypeBuilder obj = new ResourceSubtypeTypeBuilder(this);
            return obj.subject;
        }
    }

}
