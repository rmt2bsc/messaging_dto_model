package org.rmt2.util.authentication;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.ApplicationAccessType;
import org.rmt2.jaxb.ApplicationType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.UserType;

import com.api.util.RMT2Date;

/**
 * ApplicationAccessType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ApplicationAccessTypeBuilder {

    private ApplicationAccessType subject;
    
    /**
     * Create a ApplicationAccessType
     */
    private ApplicationAccessTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createApplicationAccessType();
        subject.setAppAccessId(builder.appAccessId);
        subject.setAppInfo(builder.appInfo);
        subject.setUserInfo(builder.userInfo);
        subject.setLoggedIn(builder.loggedIn);
        subject.setLoginDate(builder.loginDate);
        subject.setLastLoginDate(builder.lastLoginDate);
        subject.setSessionId(builder.sessionId);
    }

    /**
     * Builder for {@link ApplicationAccessType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private Integer appAccessId;
        private ApplicationType appInfo;
        private UserType userInfo;
        private Integer loggedIn;
        private XMLGregorianCalendar loginDate;
        private XMLGregorianCalendar lastLoginDate;
        private String sessionId;


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
         * Set up application access id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAppAccessId(Integer value) {
            this.appAccessId = value;
            return this;
        }

        /**
         * Set up application object.
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
         * Set up user object.
         * 
         * @param value
         *            an instance of {@link UserType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withUser(UserType value) {
            this.userInfo = value;
            return this;
        }

        /**
         * Set login id
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLoginId(int value) {
            if (this.userInfo == null) {
                this.userInfo = UserTypeBuilder.Builder.create()
                        .withLoginId(value)
                        .build();
            }
            else {
                this.userInfo.setLoginId(value);
            }
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
        public Builder withUserName(String value) {
            if (this.userInfo == null) {
                this.userInfo = UserTypeBuilder.Builder.create()
                        .withUsername(value)
                        .build();
            }
            else {
                this.userInfo.setUserName(value);
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
            if (this.userInfo == null) {
                this.userInfo = UserTypeBuilder.Builder.create()
                        .withPassword(value)
                        .build();
            }
            else {
                this.userInfo.setPassword(value);
            }
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
        public Builder withFirstName(String value) {
            if (this.userInfo == null) {
                this.userInfo = UserTypeBuilder.Builder.create()
                        .withFirstname(value)
                        .build();
            }
            else {
                this.userInfo.setFirstName(value);
            }
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
        public Builder withLastName(String value) {
            if (this.userInfo == null) {
                this.userInfo = UserTypeBuilder.Builder.create()
                        .withLastname(value)
                        .build();
            }
            else {
                this.userInfo.setLastName(value);
            }
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
        public Builder withLoginInFlag(Boolean value) {
            if (value != null) {
                this.loggedIn = value ? 1 : 0;    
            }
            return this;
        }

        /**
         * Set user's session id or security token.
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
         * Set logged in date.
         * 
         * @param value
         *            a {@link Date}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLoginDate(Date value) {
            this.loginDate = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set last logged in date.
         * 
         * @param value
         *            a {@link Date}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLastLoginDate(Date value) {
            this.lastLoginDate = RMT2Date.toXmlDate(value);
            return this;
        }
        
        /**
         * Completes the building of the ApplicationAccessType
         * 
         * @return an instance of {@link ApplicationAccessType}
         */
        public ApplicationAccessType build() {
            ApplicationAccessTypeBuilder obj = new ApplicationAccessTypeBuilder(this);
            return obj.subject;
        }
    }

}
