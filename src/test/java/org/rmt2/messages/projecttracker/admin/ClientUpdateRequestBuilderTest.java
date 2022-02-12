package org.rmt2.messages.projecttracker.admin;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.BusinessType;
import org.rmt2.jaxb.ClientType;
import org.rmt2.jaxb.CustomerType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ProjectDetailGroup;
import org.rmt2.jaxb.ProjectProfileRequest;
import org.rmt2.jaxb.ProjectProfileResponse;
import org.rmt2.jaxb.ReplyStatusType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.ReplyStatusTypeBuilder;
import org.rmt2.util.accounting.subsidiary.CustomerTypeBuilder;
import org.rmt2.util.addressbook.BusinessTypeBuilder;
import org.rmt2.util.projecttracker.admin.ClientTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class ClientUpdateRequestBuilderTest {

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
        ProjectProfileRequest req = fact.createProjectProfileRequest();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication(ApiHeaderNames.APP_NAME_PROJECTTRACKER)
                .withModule("admin")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.PROJTRACK_CLIENT_UPDATE)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        BusinessType bt1 = BusinessTypeBuilder.Builder.create()
                .withBusinessId(111)
                .withContactFirstname("Roy")
                .withContactLastname("Terrell")
                .withContactPhone("9992228888")
                .withContactEmail("royterrell@gte.net")
                .withContactPhoneExt("123")
                .build();

        CustomerType customer1 = CustomerTypeBuilder.Builder.create()
                .withAccountNo("111-222-111")
                .withCustomerId(4444)
                .withBusinessType(bt1)
                .build();
        
        ClientType client1 = ClientTypeBuilder.Builder.create()
                .withClientId(100)
                .withClientName("ProjectTracker Client Name 1")
                .withCustomerData(customer1)
                .build();

        ProjectDetailGroup pdg = fact.createProjectDetailGroup();
        pdg.getClient().add(client1);
        req.setProfile(pdg);
        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.PROJTRACK_CLIENT_UPDATE));
    }

    @Test
    public void testBuildResponse() {
        ObjectFactory fact = new ObjectFactory();
        ProjectProfileResponse resp = fact.createProjectProfileResponse();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication(ApiHeaderNames.APP_NAME_PROJECTTRACKER)
                .withModule("admin")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.PROJTRACK_CLIENT_UPDATE)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        ReplyStatusType rst = ReplyStatusTypeBuilder.Builder.create()
                .withStatus(MessagingConstants.RETURN_STATUS_SUCCESS)
                .withReturnCode(MessagingConstants.RETURN_CODE_SUCCESS)
                .withMessage("Client updated successfully")
                .withDetailMessage("Client ID: 100")
                .withRecordCount(1)
                .build();
   
        resp.setHeader(head);
        resp.setReplyStatus(rst);

        String xml = jaxb.marshalJsonMessage(resp);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.PROJTRACK_CLIENT_UPDATE));
    }
}
