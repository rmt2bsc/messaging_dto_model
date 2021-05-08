package org.rmt2.util.authentication;

import org.rmt2.jaxb.AppRoleType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.UserAppRoleType;
import org.rmt2.jaxb.UserType;

/**
 * UserAppRoleType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class UserAppRoleTypeBuilder {

    private UserAppRoleType subject;
    
    /**
     * Create a UserAppRoleType
     */
    private UserAppRoleTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createUserAppRoleType();
        subject.setUserAppRoleId(builder.userAppRoleId);
        subject.setAppRoleInfo(builder.appRoleInfo);
        subject.setUserInfo(builder.userInfo);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link UserAppRoleType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int userAppRoleId;
        private AppRoleType appRoleInfo;
        private UserType userInfo;
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
         * Set user application role id.
         * 
         * @param value
         *            an int
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withUserApplicationRoleId(int value) {
            this.userAppRoleId = value;
            return this;
        }

        /**
         * Set application role object.
         * 
         * @param value
         *            an instance of {@link AppRoleType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withApplicationRoleInfo(AppRoleType value) {
            this.appRoleInfo = value;
            return this;
        }

        /**
         * Set user type object.
         * 
         * @param value
         *            an instance of {@link UserType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withUserInfo(UserType value) {
            this.userInfo = value;
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
         * Completes the building of the UserAppRoleType
         * 
         * @return an instance of {@link UserAppRoleType}
         */
        public UserAppRoleType build() {
            UserAppRoleTypeBuilder obj = new UserAppRoleTypeBuilder(this);
            return obj.subject;
        }
    }

}
