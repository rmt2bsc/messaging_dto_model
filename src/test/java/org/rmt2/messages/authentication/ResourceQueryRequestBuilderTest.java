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
import org.rmt2.jaxb.ResourceCriteriaType;
import org.rmt2.jaxb.ResourceType;
import org.rmt2.jaxb.ResourcesInfoType;
import org.rmt2.jaxb.ResourcesubtypeType;
import org.rmt2.jaxb.ResourcetypeType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.authentication.ResourceSubtypeTypeBuilder;
import org.rmt2.util.authentication.ResourceTypeBuilder;
import org.rmt2.util.authentication.ResourcesInfoTypeBuilder;
import org.rmt2.util.authentication.ResourcetypeTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class ResourceQueryRequestBuilderTest {

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
                .withTransaction(ApiTransactionCodes.AUTH_RESOURCE_GET)
                .withRouting(ApiTransactionCodes.ROUTE_AUTHENTICATION)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .build();

        AuthCriteriaGroupType apgt = fact.createAuthCriteriaGroupType();
        ResourceCriteriaType criteria = fact.createResourceCriteriaType();
        criteria.setRsrcId(1);
        criteria.setRsrcName("Resource Name");
        criteria.setRsrcDescription("Resource Description");
        criteria.setRsrcTypeId(10);
        criteria.setRsrcSubtypeId(100);
        criteria.setSecured(1);

        apgt.setResourceCriteria(criteria);

        req.setCriteria(apgt);
        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.AUTH_RESOURCE_GET));
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
                .withTransaction(ApiTransactionCodes.AUTH_RESOURCE_GET)
                .withRouting(ApiTransactionCodes.ROUTE_AUTHENTICATION)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .build();

        AuthProfileGroupType apgt = fact.createAuthProfileGroupType();

        ResourcetypeType rtt = ResourcetypeTypeBuilder.Builder.create()
                .withTypeId(777)
                .withDescription("rsrouce type Name7")
                .build();

        ResourcesubtypeType rst = ResourceSubtypeTypeBuilder.Builder.create()
                .withSubTypeId(0)
                .build();

        ResourceType rt1 = ResourceTypeBuilder.Builder.create()
                .withResourceId(1)
                .withType(rtt)
                .withSubType(rst)
                .withName("Resource Name 1")
                .withDescription("rsrouce Description 1")
                .withUrl("Resource URL 1")
                .withHost("Rsource HOst 1")
                .withSecuredFlag(1)
                .build();

        ResourceType rt2 = ResourceTypeBuilder.Builder.create()
                .withResourceId(1)
                .withType(rtt)
                .withSubType(rst)
                .withName("Resource Name 2")
                .withDescription("rsrouce Description 2")
                .withUrl("Resource URL 2")
                .withHost("Rsource HOst 2")
                .withSecuredFlag(1)
                .build();

        ResourcesInfoType rit = ResourcesInfoTypeBuilder.Builder.create()
                .addResource(rt1)
                .addResource(rt2)
                .build();

        apgt.setResourcesInfo(rit);
        resp.setProfile(apgt);
        resp.setHeader(head);

        String xml = jaxb.marshalJsonMessage(resp);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.AUTH_RESOURCE_GET));
    }

 }
