package org.rmt2.util.authentication;

import java.util.ArrayList;
import java.util.List;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ResourceType;
import org.rmt2.jaxb.ResourcesInfoType;
import org.rmt2.jaxb.ResourcesubtypeType;
import org.rmt2.jaxb.ResourcetypeType;

/**
 * Resource Info Type Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ResourcesInfoTypeBuilder {

    private ResourcesInfoType subject;
    
    /**
     * Create a ResourcetypeTypeBuilder
     */
    private ResourcesInfoTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createResourcesInfoType();

        if (builder.resource != null) {
            subject.getResource().addAll(builder.resource);
        }
        if (builder.resourcetype != null) {
            subject.getResourcetype().addAll(builder.resourcetype);
        }
        if (builder.resourcesubtype != null) {
            subject.getResourcesubtype().addAll(builder.resourcesubtype);
        }
    }

    /**
     * Builder for {@link UserGroupType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        protected List<ResourceType> resource;
        protected List<ResourcetypeType> resourcetype;
        protected List<ResourcesubtypeType> resourcesubtype;

        private Builder() {
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
         * Set up resources
         * 
         * @param value
         *            a List of {@link ResourceType} instances
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withResources(List<ResourceType> value) {
            this.resource = value;
            return this;
        }

        /**
         * Add a resource.
         * 
         * @param value
         *            an instance of {@link ResourceType}
         * @return Non-null Builder used to continue building the object
         */
        public Builder addResource(ResourceType value) {
            if (this.resource == null) {
                this.resource = new ArrayList<>();
            }
            this.resource.add(value);
            return this;
        }

        /**
         * Set up resource types
         * 
         * @param value
         *            a List of {@link ResourcetypeType} instances
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withResourceTypes(List<ResourcetypeType> value) {
            this.resourcetype = value;
            return this;
        }

        /**
         * Add a resource type.
         * 
         * @param value
         *            an instance of {@link ResourcetypeType}
         * @return Non-null Builder used to continue building the object
         */
        public Builder addResourceType(ResourcetypeType value) {
            if (this.resourcetype == null) {
                this.resourcetype = new ArrayList<>();
            }
            this.resourcetype.add(value);
            return this;
        }

        /**
         * Set up resource sub types
         * 
         * @param value
         *            a List of {@link ResourcesubtypeType} instances
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withResourceSubTypes(List<ResourcesubtypeType> value) {
            this.resourcesubtype = value;
            return this;
        }

        /**
         * Add a resource sub type.
         * 
         * @param value
         *            an instance of {@link ResourcesubtypeType}
         * @return Non-null Builder used to continue building the object
         */
        public Builder addResourceSubType(ResourcesubtypeType value) {
            if (this.resourcesubtype == null) {
                this.resourcesubtype = new ArrayList<>();
            }
            this.resourcesubtype.add(value);
            return this;
        }

        /**
         * Completes the building of the ResourcesInfoType
         * 
         * @return an instance of {@link ResourcesInfoType}
         */
        public ResourcesInfoType build() {
            ResourcesInfoTypeBuilder obj = new ResourcesInfoTypeBuilder(this);
            return obj.subject;
        }
    }

}
