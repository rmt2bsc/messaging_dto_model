package org.rmt2.util.authentication;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.UserGroupType;

/**
 * UserGroupType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class UserGroupTypeBuilder {

    private UserGroupType subject;
    
    /**
     * Create a UserGroupType
     */
    private UserGroupTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createUserGroupType();
        subject.setGrpId(builder.grpId);
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
        private int grpId;
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
        public Builder withGroupId(int value) {
            this.grpId = value;
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
         * Completes the building of the UserGroupType
         * 
         * @return an instance of {@link UserGroupType}
         */
        public UserGroupType build() {
            UserGroupTypeBuilder obj = new UserGroupTypeBuilder(this);
            return obj.subject;
        }
    }

}
