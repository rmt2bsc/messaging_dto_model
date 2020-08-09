package org.rmt2.util.mime;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ProjecttypeType;

/**
 * ProjecttypeType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ProjecttypeTypeBuilder {

    private ProjecttypeType subject;
    
    /**
     * Create a ProjecttypeTypeBuilder
     */
    private ProjecttypeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createProjecttypeType();
        subject.setProjectTypeId(builder.uid);
        subject.setProjectTypeName(builder.name);
    }

    /**
     * Builder for {@link ProjecttypeTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int uid;
        private String name;


        private Builder() {
            return;
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
         * Set up genre id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withUID(int value) {
            this.uid = value;
            return this;
        }


        /**
         * Set up genre name
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withName(String value) {
            this.name = value;
            return this;
        }

        /**
         * Completes the building of the ProjecttypeType
         * 
         * @return an instance of {@link ProjecttypeType}
         */
        public ProjecttypeType build() {
            ProjecttypeTypeBuilder obj = new ProjecttypeTypeBuilder(this);
            return obj.subject;
        }
    }
}
