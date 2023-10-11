package org.rmt2.messages.authentication;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AuthProfileGroupType;
import org.rmt2.jaxb.AuthenticationRequest;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.ResourceType;
import org.rmt2.jaxb.ResourcesInfoType;
import org.rmt2.jaxb.ResourcesubtypeType;
import org.rmt2.jaxb.ResourcetypeType;
import org.rmt2.messages.CommonMessagingConst;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.RecordTrackingTypeBuilder;
import org.rmt2.util.authentication.ResourceSubtypeTypeBuilder;
import org.rmt2.util.authentication.ResourceTypeBuilder;
import org.rmt2.util.authentication.ResourcesInfoTypeBuilder;
import org.rmt2.util.authentication.ResourcetypeTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.util.RMT2Date;
import com.api.xml.jaxb.JaxbUtil;

public class ResourcesInfoTypeBuilderTest {

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
                .withTransaction(CommonMessagingConst.TRANSACTION_CODE_DUMMY)
                .withRouting(ApiTransactionCodes.ROUTE_AUTHENTICATION)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .build();

        RecordTrackingType tracking = RecordTrackingTypeBuilder.Builder.create()
                .withDateCreated(RMT2Date.stringToDate("2020-01-01"))
                .withDateUpdate(RMT2Date.stringToDate("2020-01-01"))
                .withUserId("testuser")
                .build();

        AuthProfileGroupType apgt = fact.createAuthProfileGroupType();
        ResourcetypeType rt = ResourcetypeTypeBuilder.Builder.create()
                .withTypeId(11)
                .withDescription("rsrouce type Name 1")
                .withRecordTrackingType(tracking)
                .build();
        ResourcetypeType rt2 = ResourcetypeTypeBuilder.Builder.create()
                .withTypeId(22)
                .withDescription("rsrouce type Name 2")
                .withRecordTrackingType(tracking)
                .build();

        ResourcesubtypeType rst1 = ResourceSubtypeTypeBuilder.Builder.create()
                .withSubTypeId(111)
                .withType(rt)
                .withName("Resource sub type name 1")
                .withDescription("Resource sub type description 1")
                .withRecordTrackingType(tracking)
                .build();

        ResourcesubtypeType rst2 = ResourceSubtypeTypeBuilder.Builder.create()
                .withSubTypeId(222)
                .withType(rt2)
                .withName("Resource sub type name 2")
                .withDescription("Resource sub type description 2")
                .withRecordTrackingType(tracking)
                .build();

        ResourceType r1 = ResourceTypeBuilder.Builder.create()
                .withResourceId(1)
                .withName("Resource Name 1")
                .withDescription("Resource Description 1")
                .withHost("Host 1")
                .withUrl("URL")
                .withType(rt)
                .withSubType(rst1)
                .withSecuredFlag(1)
                .withRecordTrackingType(tracking)
                .build();

        ResourceType r2 = ResourceTypeBuilder.Builder.create()
                .withResourceId(2)
                .withName("Resource Name 2")
                .withDescription("Resource Description 2")
                .withHost("Host 2")
                .withUrl("URL")
                .withType(rt2)
                .withSubType(rst2)
                .withSecuredFlag(1)
                .withRecordTrackingType(tracking)
                .build();

        ResourcesInfoType rit = ResourcesInfoTypeBuilder.Builder.create()
                .addResource(r1)
                .addResource(r2)
                .addResourceType(rt)
                .addResourceType(rt2)
                .addResourceSubType(rst1)
                .addResourceSubType(rst2)
                .build();

        apgt.setResourcesInfo(rit);
        req.setProfile(apgt);
        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(CommonMessagingConst.TRANSACTION_CODE_DUMMY));
    }

 }
