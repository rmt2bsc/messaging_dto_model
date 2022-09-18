package org.rmt2.util.authentication;

import java.util.ArrayList;
import java.util.List;

import org.rmt2.jaxb.UserAppRoleType;
import org.rmt2.jaxb.UserType;

import com.api.security.User;
import com.api.security.UserVo;

/**
 * UserType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class CoreUserBuilder {

    private User subject;
    
    /**
     * Create a User
     */
    private CoreUserBuilder(Builder builder) {
        subject = new UserVo();
        subject.setUid(builder.userType.getLoginId());
        subject.setLoginId(builder.userType.getUserName());
        subject.setFirstname(builder.userType.getFirstName());
        subject.setLastname(builder.userType.getLastName());
        subject.setShortname(builder.userType.getShortName());
        subject.setEmail(builder.userType.getEmail());
        subject.setSsn(builder.userType.getSsn());
        subject.setLoggedIn(builder.userType.getLoggedIn());
        subject.setTotalLogons(builder.userType.getTotalLogons());
        subject.setActive(builder.userType.getActive());
        subject.setUserDescription(builder.userType.getDescription());
        // subject.setPassword(builder.userType.getPassword());

        if (builder.userType.getDob() != null) {
            subject.setBirthDate(builder.userType.getDob().toGregorianCalendar().getTime());
        }
        if (builder.userType.getStartDate() != null) {
            subject.setStartDate(builder.userType.getStartDate().toGregorianCalendar().getTime());
        }
        if (builder.userType.getTermDate() != null) {
            subject.setTerminationDate(builder.userType.getTermDate().toGregorianCalendar().getTime());
        }

        if (builder.userType.getGroupInfo() != null) {
            if (builder.userType.getGroupInfo().getGrpId() != null) {
                subject.setGrp(builder.userType.getGroupInfo().getGrpId().toString());
            }
            subject.setGrpDescription(builder.userType.getGroupInfo().getDescription());
        }
        if (builder.userType.getGrantedAppRoles() != null) {
            List<UserAppRoleType> orig = builder.userType.getGrantedAppRoles().getUserAppRole();
            List<String> roles = new ArrayList<>();
            for (int ndx = 0; ndx < orig.size(); ndx++) {
                if (orig.get(ndx).getAppRoleInfo() != null) {
                    roles.add(orig.get(ndx).getAppRoleInfo().getAppRoleCode());    
                }
            }
            subject.setRoles(roles);
        }
    }

    /**
     * Builder for {@link User}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private UserType userType;

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
         * Set up login id.
         * 
         * @param value
         *            an instance of {@link UserType}
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withJaxbUser(UserType value) {
            this.userType = value;
            return this;
        }

        /**
         * Completes the building of the User
         * 
         * @return an instance of {@link User}
         */
        public User build() {
            CoreUserBuilder obj = new CoreUserBuilder(this);
            return obj.subject;
        }
    }

}
