package org.rmt2.messages.authentication;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AuthCriteriaGroupType;
import org.rmt2.jaxb.AuthProfileGroupType;
import org.rmt2.jaxb.AuthenticationRequest;
import org.rmt2.jaxb.AuthenticationResponse;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.UserCriteriaType;
import org.rmt2.jaxb.UserGroupType;
import org.rmt2.jaxb.UserType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.authentication.UserGroupTypeBuilder;
import org.rmt2.util.authentication.UserTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.util.RMT2Date;
import com.api.xml.jaxb.JaxbUtil;

public class UserQueryRequestBuilderTest {

    private JaxbUtil jaxb;
    
    @Before
    public void setUp() throws Exception {
        try {
            jaxb = SystemConfigurator.getJaxb(ConfigConstants.JAXB_CONTEXNAME_DEFAULT);
        }
        catch (Exception e) {
            jaxb = new JaxbUtil(MessagingConstants.JAXB_RMT2_PKG);
        }
    }
    
    @Test
    public void testBuildRequest() {
        ObjectFactory fact = new ObjectFactory();
        AuthenticationRequest req = fact.createAuthenticationRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication(ApiHeaderNames.APP_NAME_AUTHENTICATION)
                .withModule("admin")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.AUTH_USER_GET)
                .withRouting(ApiTransactionCodes.ROUTE_AUTHENTICATION)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .build();

        AuthCriteriaGroupType apgt = fact.createAuthCriteriaGroupType();
        UserCriteriaType criteria = fact.createUserCriteriaType();
        
        criteria.setLoginId(10);
        criteria.setGroupId(10);
        criteria.setGroupName("Group Name");
        criteria.setFirstName("roy");
        criteria.setUserName("username");
        criteria.setLastName("terrell");
        criteria.setEmail("royterrell@hotmail.com");
        criteria.setDob(RMT2Date.toXmlDate("1989-01-01"));
        criteria.setStartDate(RMT2Date.toXmlDate("1989-01-01"));
        criteria.setTermDate(RMT2Date.toXmlDate("1989-01-01"));
        criteria.setSsn("999-99-9999");
        
        apgt.setUserCriteria(criteria);

        req.setCriteria(apgt);
        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.AUTH_USER_GET));
    }

    @Test
    public void testBuildRespones() {
        ObjectFactory fact = new ObjectFactory();
        AuthenticationResponse resp = fact.createAuthenticationResponse();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication(ApiHeaderNames.APP_NAME_AUTHENTICATION)
                .withModule("admin")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.AUTH_USER_GET)
                .withRouting(ApiTransactionCodes.ROUTE_AUTHENTICATION)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .build();

        
        UserGroupType ugt = UserGroupTypeBuilder.Builder.create()
                .withGroupId(1)
                .withDescription("Group Description 1")
                .build();

        UserType ut = UserTypeBuilder.Builder.create()
                .withLoginId(10)
                .withGroupInfo(ugt)
                .withUsername("username")
                .withFirstname("roy")
                .withLastname("terrell")
                .withBirthDate(RMT2Date.stringToDate("1989-01-01"))
                .withSsn("999-99-9999")
                .withStartDate(RMT2Date.stringToDate("2015-01-01"))
                .withTermDate(RMT2Date.stringToDate("2020-01-01"))
                .withDescription("description")
                .withPassword("kfdsd8e3k3893kds9sds")
                .withTotalLogins(100)
                .withEmail("royterrell@hotmail.com")
                .withActiveFlag(true)
                .build();

        UserType ut2 = UserTypeBuilder.Builder.create()
                .withLoginId(10)
                .withGroupInfo(ugt)
                .withUsername("username")
                .withFirstname("dione")
                .withLastname("terrell")
                .withBirthDate(RMT2Date.stringToDate("1993-01-01"))
                .withSsn("999-99-9999")
                .withStartDate(RMT2Date.stringToDate("2015-01-01"))
                .withTermDate(RMT2Date.stringToDate("2020-01-01"))
                .withDescription("description")
                .withPassword("kfdsd8e3k3893kds9sds")
                .withTotalLogins(100)
                .withEmail("dioneterrell@hotmail.com")
                .withActiveFlag(true)
                .build();

        AuthProfileGroupType apgt = fact.createAuthProfileGroupType();
       
        apgt.getUserInfo().add(ut);
        apgt.getUserInfo().add(ut2);
        resp.setProfile(apgt);
        resp.setHeader(head);

        String xml = jaxb.marshalJsonMessage(resp);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.AUTH_USER_GET));
    }

 }
