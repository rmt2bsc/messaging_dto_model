package org.rmt2.util.authentication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.UserAppRoleType;
import org.rmt2.jaxb.UserGroupType;
import org.rmt2.jaxb.UserResourceAccessType;
import org.rmt2.jaxb.UserType;

import com.api.util.RMT2Date;

/**
 * UserType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class UserTypeBuilder {

    private UserType subject;
    
    /**
     * Create a UserType
     */
    private UserTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createUserType();
        subject.setLoginId(builder.loginId);
        subject.setUserName(builder.userName);
        subject.setFirstName(builder.firstName);
        subject.setLastName(builder.lastName);
        subject.setShortName(builder.shortName);
        subject.setEmail(builder.email);
        subject.setSsn(builder.ssn);
        subject.setLoggedIn(builder.loggedIn);
        subject.setDob(builder.birthDate);
        subject.setStartDate(builder.startDate);
        subject.setTermDate(builder.termDate);
        subject.setGroupInfo(builder.grpInfo);
        if (builder.totalLogins != null) {
            subject.setTotalLogons(builder.totalLogins);    
        }
        if (builder.active != null) {
            subject.setActive(builder.active);    
        }
        subject.setDescription(builder.description);
        subject.setPassword(builder.password);
        subject.setSessionId(builder.sessionId);

        if (builder.grantedAppRoleList != null) {
            subject.setGrantedAppRoles(f.createUserAppRolesType());
            subject.getGrantedAppRoles().getUserAppRole().addAll(builder.grantedAppRoleList);
        }
        if (builder.revokedAppRoleList != null) {
            subject.setRevokedAppRoles(f.createUserAppRolesType());
            subject.getRevokedAppRoles().getUserAppRole().addAll(builder.revokedAppRoleList);
        }
        if (builder.grantedResources != null) {
            subject.setGrantedResources(f.createUserResourceAccessListType());
            subject.getGrantedResources().getUserResourceAccess().addAll(builder.grantedResources);
        }
        if (builder.revokedResources != null) {
            subject.setRevokedResources(f.createUserResourceAccessListType());
            subject.getRevokedResources().getUserResourceAccess().addAll(builder.revokedResources);
        }
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link UserType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private Integer loginId;
        private String userName;
        private String firstName;
        private String lastName;
        private String shortName;
        private String email;
        private String ssn;
        private UserGroupType grpInfo;
        private Integer loggedIn;
        private XMLGregorianCalendar birthDate;
        private XMLGregorianCalendar startDate;
        private XMLGregorianCalendar termDate;
        private Integer totalLogins;
        private Integer active;
        private String description;
        private String password;
        private String sessionId;
        private List<UserAppRoleType> grantedAppRoleList;
        private List<UserAppRoleType> revokedAppRoleList;
        private List<UserResourceAccessType> grantedResources;
        private List<UserResourceAccessType> revokedResources;
        private RecordTrackingType tracking;

        private Builder() {
            this.active = null;
            this.loggedIn = null;
            this.loginId = null;
            this.grantedAppRoleList = null;
            this.revokedAppRoleList = null;
            this.grantedResources = null;
            this.revokedResources = null;
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
         * Set up login id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLoginId(Integer value) {
            this.loginId = value;
            return this;
        }

        /**
         * Set up user group object.
         * 
         * @param value
         *            an instance of {@link UserGroupType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withGroupInfo(UserGroupType value) {
            this.grpInfo = value;
            return this;
        }

        /**
         * Set user name.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withUsername(String value) {
            this.userName = value;
            return this;
        }

        /**
         * Set first name.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withFirstname(String value) {
            this.firstName = value;
            return this;
        }

        /**
         * Set last name.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLastname(String value) {
            this.lastName = value;
            return this;
        }

        /**
         * Set short name.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withShortname(String value) {
            this.shortName = value;
            return this;
        }

        /**
         * Set email.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEmail(String value) {
            this.email = value;
            return this;
        }

        /**
         * Set Description.
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
         * Set SSN.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withSsn(String value) {
            this.ssn = value;
            return this;
        }

        /**
         * Set up logged in flag.
         * 
         * @param value
         *            a boolean
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLoggedInFlag(Boolean value) {
            if (value != null) {
                this.loggedIn = value ? 1 : 0;    
            }
            return this;
        }

        /**
         * Set up total login count
         * 
         * @param value
         *            a int
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTotalLogins(int value) {
            this.totalLogins = value;
            return this;
        }

        /**
         * Set birth date.
         * 
         * @param value
         *            a {@link Date}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withBirthDate(Date value) {
            this.birthDate = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set start or hire date.
         * 
         * @param value
         *            a {@link Date}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withStartDate(Date value) {
            this.startDate = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set termination date.
         * 
         * @param value
         *            a {@link Date}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTermDate(Date value) {
            this.termDate = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set up logged in flag.
         * 
         * @param value
         *            a boolean
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withActiveFlag(Boolean value) {
            if (value != null) {
                this.active = value ? 1 : 0;    
            }
            return this;
        }

        /**
         * Set password.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withPassword(String value) {
            this.password = value;
            return this;
        }

        /**
         * Set session Id.
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withSessionId(String value) {
            this.sessionId = value;
            return this;
        }

        /**
         * Set granted application roles.
         * 
         * @param value
         *            a List of {@link UserAppRoleType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withGrantedAppRoles(List<UserAppRoleType> value) {
            this.grantedAppRoleList = value;
            return this;
        }

        /**
         * Add an application role.
         * 
         * @param value
         *            an instance of {@link UserAppRoleType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder addGrantedAppRole(UserAppRoleType value) {
            if (value == null) {
                return this;
            }
            if (this.grantedAppRoleList == null) {
                this.grantedAppRoleList = new ArrayList<>();
            }
            this.grantedAppRoleList.add(value);
            return this;
        }

        /**
         * Set revoked application roles.
         * 
         * @param value
         *            an List of {@link UserAppRoleType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRevokedAppRoles(List<UserAppRoleType> value) {
            this.revokedAppRoleList = value;
            return this;
        }

        /**
         * Add a revoked application role.
         * 
         * @param value
         *            an instance of {@link UserAppRoleType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder addRevokedAppRole(UserAppRoleType value) {
            if (value == null) {
                return this;
            }
            if (this.revokedAppRoleList == null) {
                this.revokedAppRoleList = new ArrayList<>();
            }
            this.revokedAppRoleList.add(value);
            return this;
        }

        /**
         * Set granted resources.
         * 
         * @param value
         *            a List of {@link UserResourceAccessType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withGrantedResources(List<UserResourceAccessType> value) {
            this.grantedResources = value;
            return this;
        }

        /**
         * Add a resource
         * 
         * @param value
         *            an instance of {@link UserResourceAccessType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder addGrantedResource(UserResourceAccessType value) {
            if (value == null) {
                return this;
            }
            if (this.grantedResources == null) {
                this.grantedResources = new ArrayList<>();
            }
            this.grantedResources.add(value);
            return this;
        }

        /**
         * Set revoked resources
         * 
         * @param value
         *            an List of {@link UserResourceAccessType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRevokedResources(List<UserResourceAccessType> value) {
            this.grantedResources = value;
            return this;
        }

        /**
         * Add a revoked resource.
         * 
         * @param value
         *            an instance of {@link UserResourceAccessType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder addRevokedResource(UserResourceAccessType value) {
            if (value == null) {
                return this;
            }
            if (this.grantedResources == null) {
                this.grantedResources = new ArrayList<>();
            }
            this.grantedResources.add(value);
            return this;
        }

        /**
         * Set up record tracking details.
         * 
         * @param tracking
         *            an instance of {@link RecordTrackingType} value that must
         *            not be null
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRecordTrackingType(RecordTrackingType tracking) {
            this.tracking = tracking;
            return this;
        }

        /**
         * Completes the building of the UserType
         * 
         * @return an instance of {@link UserType}
         */
        public UserType build() {
            UserTypeBuilder obj = new UserTypeBuilder(this);
            return obj.subject;
        }
    }

}
