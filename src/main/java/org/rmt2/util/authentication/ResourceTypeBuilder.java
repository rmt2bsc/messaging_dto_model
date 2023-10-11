package org.rmt2.util.authentication;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.ResourceType;
import org.rmt2.jaxb.ResourcesubtypeType;
import org.rmt2.jaxb.ResourcetypeType;

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
        subject.setUid(builder.resourceId);
        subject.setTypeInfo(builder.typeInfo == null ? null : builder.typeInfo);
        subject.setSubtypeInfo(builder.subTypeInfo == null ? null : builder.subTypeInfo);
        subject.setCode(builder.name);
        subject.setDescription(builder.description);
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
        private ResourcetypeType typeInfo;
        private ResourcesubtypeType subTypeInfo;
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
        public Builder withSubType(ResourcesubtypeType value) {
            this.subTypeInfo = value;
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
        public Builder withType(ResourcetypeType value) {
            this.typeInfo = value;
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
        public Builder withSecuredFlag(Integer value) {
            this.secured = value == null ? -1 : value;
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
