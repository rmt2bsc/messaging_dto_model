package org.rmt2.util.authentication;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.ResourceType;

/**
 * Resource Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ResourceTypeBuilder {

    private ResourceType subject;
    
    /**
     * Create a ResourceTypeBuilder
     */
    private ResourceTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createResourceType();
        subject.setRsrcId(builder.resourceId);
        subject.setRsrcTypeId(builder.resourceTypeId);
        subject.setRsrcSubtypeId(builder.resourceSubTypeId);
        subject.setRsrcSubtypeName(builder.name);
        subject.setRsrcSubtypeDescription(builder.description);
        subject.setUrl(builder.url);
        subject.setHost(builder.host);
        subject.setSecured(builder.secured);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link ResourceType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int resourceId;
        private int resourceTypeId;
        private int resourceSubTypeId;
        private String name;
        private String description;
        private String url;
        private String host;
        private int secured;
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
         * Set up resource id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withResourceId(int value) {
            this.resourceId = value;
            return this;
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
         * Set URL.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withUrl(String value) {
            this.url = value;
            return this;
        }

        /**
         * Set host.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withHost(String value) {
            this.host = value;
            return this;
        }

        /**
         * Set secured flag.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withSecuredFlag(boolean value) {
            this.secured = value ? 1 : 0;
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
            ResourceTypeBuilder obj = new ResourceTypeBuilder(this);
            return obj.subject;
        }
    }

}
