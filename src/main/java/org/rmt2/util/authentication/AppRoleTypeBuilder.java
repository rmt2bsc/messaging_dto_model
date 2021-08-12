package org.rmt2.util.authentication;

import org.rmt2.jaxb.AppRoleType;
import org.rmt2.jaxb.ApplicationType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.RoleType;

/**
 * AppAppRoleType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class AppRoleTypeBuilder {

    private AppRoleType subject;
    
    /**
     * Create a AppRoleType
     */
    private AppRoleTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createAppRoleType();

        if (builder.AppRoleId != null && builder.AppRoleId > 0) {
            subject.setAppRoleId(builder.AppRoleId);
        }

        if (builder.appInfo != null && builder.appInfo.getAppId() > 0) {
            subject.setAppInfo(builder.appInfo);
        }
        if (builder.roleInfo != null && builder.roleInfo.getRoleId() > 0) {
            subject.setRoleInfo(builder.roleInfo);
        }
        subject.setAppRoleCode(builder.code);
        subject.setAppRoleName(builder.name);
        subject.setAppRoleDesc(builder.description);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link AppRoleType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private Integer AppRoleId;
        private ApplicationType appInfo;
        private RoleType roleInfo;
        private String code;
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
         * Set application role id.
         * 
         * @param value
         *            an int
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAppRoleId(Integer value) {
            this.AppRoleId = value;
            return this;
        }

        /**
         * Set application object.
         * 
         * @param value
         *            an instance of {@link ApplicationType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withApplication(ApplicationType value) {
            this.appInfo = value;
            return this;
        }

        /**
         * Set role object.
         * 
         * @param value
         *            an instance of {@link RoleType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRole(RoleType value) {
            this.roleInfo = value;
            return this;
        }

        /**
         * Set code.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCode(String value) {
            this.code = value;
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
         * Completes the building of the AppRoleType
         * 
         * @return an instance of {@link AppRoleType}
         */
        public AppRoleType build() {
            AppRoleTypeBuilder obj = new AppRoleTypeBuilder(this);
            return obj.subject;
        }
    }

}
