package org.rmt2.util.authentication;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.RoleType;

/**
 * RoleType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class RoleTypeBuilder {

    private RoleType subject;
    
    /**
     * Create a RoleType
     */
    private RoleTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createRoleType();
        subject.setRoleId(builder.roleId);
        subject.setRoleName(builder.name);
        subject.setRoleDescription(builder.description);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link RoleType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int roleId;
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
         * Set up role id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRoleId(int value) {
            this.roleId = value;
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
         * Completes the building of the RoleType
         * 
         * @return an instance of {@link RoleType}
         */
        public RoleType build() {
            RoleTypeBuilder obj = new RoleTypeBuilder(this);
            return obj.subject;
        }
    }

}
