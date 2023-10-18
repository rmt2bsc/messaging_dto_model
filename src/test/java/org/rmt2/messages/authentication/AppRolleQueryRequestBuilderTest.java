package org.rmt2.messages.authentication;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AppRoleType;
import org.rmt2.jaxb.ApplicationType;
import org.rmt2.jaxb.AuthCriteriaGroupType;
import org.rmt2.jaxb.AuthProfileGroupType;
import org.rmt2.jaxb.AuthenticationRequest;
import org.rmt2.jaxb.AuthenticationResponse;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RoleType;
import org.rmt2.jaxb.UserAppRolesCriteriaType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.authentication.AppRoleTypeBuilder;
import org.rmt2.util.authentication.ApplicationTypeBuilder;
import org.rmt2.util.authentication.RoleTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class AppRolleQueryRequestBuilderTest {

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
                .withApplication(ApiTransactionCodes.APP_SECURITY)
                .withModule(ApiTransactionCodes.MODULE_SECURITY_ADMIN)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.AUTH_APP_ROLE_GET)
                .withRouting(ApiTransactionCodes.ROUTE_AUTHENTICATION)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .build();

        AuthCriteriaGroupType apgt = fact.createAuthCriteriaGroupType();
        UserAppRolesCriteriaType criteria = fact.createUserAppRolesCriteriaType();
        criteria.setAppRoleId(1);
        criteria.setAppRoleCode("ARCode");
        criteria.setAppRoleName("AppRoleName");
        criteria.setAppRoleDescription("App Role Descritpion");
        criteria.setAppId(10);
        criteria.setAppDescription("Application Description");
        criteria.setRoleId(100);
        criteria.setRoleName("Role Name");
        
        apgt.setUserAppRolesCriteria(criteria);

        req.setCriteria(apgt);
        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.AUTH_APP_ROLE_GET));
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
                .withTransaction(ApiTransactionCodes.AUTH_APP_ROLE_GET)
                .withRouting(ApiTransactionCodes.ROUTE_AUTHENTICATION)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .build();

        
        AuthProfileGroupType apgt = fact.createAuthProfileGroupType();
        ApplicationType at = ApplicationTypeBuilder.Builder.create()
                .withAppId(10)
                .withDescription("Application  REcords")
                .build();
        RoleType rt = RoleTypeBuilder.Builder.create()
                .withRoleId(20)
                .withDescription("Role description")
                .withName("Role Name")
                .build();

        AppRoleType art = AppRoleTypeBuilder.Builder.create()
                .withAppRoleId(0)
                .withCode("AppCode")
                .withName("App Role Name")
                .withDescription("App Role Description")
                .withApplication(at)
                .withRole(rt)
                .build();

        apgt.getAppRoleInfo().add(art);
        
        at = ApplicationTypeBuilder.Builder.create()
                .withAppId(10)
                .withDescription("Application  REcords")
                .build();
        rt = RoleTypeBuilder.Builder.create()
                .withRoleId(20)
                .withDescription("Role description")
                .withName("Role Name")
                .build();

        art = AppRoleTypeBuilder.Builder.create()
                .withAppRoleId(0)
                .withCode("AppCode")
                .withName("App Role Name")
                .withDescription("App Role Description")
                .withApplication(at)
                .withRole(rt)
                .build();
        
        apgt.getAppRoleInfo().add(art);
        
        resp.setProfile(apgt);
        resp.setHeader(head);

        String xml = jaxb.marshalJsonMessage(resp);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.AUTH_APP_ROLE_GET));
    }

 }
