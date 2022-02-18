package org.rmt2.messages.projecttracker.admin;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ProjectDetailGroup;
import org.rmt2.jaxb.ProjectProfileRequest;
import org.rmt2.jaxb.ProjectType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.projecttracker.admin.ProjectTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.util.RMT2Date;
import com.api.xml.jaxb.JaxbUtil;

public class ProjectUdateRequestBuilderTest {

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
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("projecttracker")
                .withModule("admin")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.PROJTRACK_PROJECT_UPDATE)
                .withRouting(ApiTransactionCodes.ROUTE_PROJECTTRACKER)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        ProjectType client = ProjectTypeBuilder.Builder.create()
                .withClientId(200)
                .withClientName("ProjectTracker Client Name")
                .withClientBusinessId(7777)
                .withBillRate(120.00)
                .withOvertimeBillRate(130.00)
                .withProjectId(10000)
                .withProjectName("Test Project for Business Server")
                .withEffectiveDate(RMT2Date.stringToDate("2020/1/01"))
                .withEndDate(RMT2Date.stringToDate("2020/5/01"))
                .build();

        ProjectDetailGroup pdg = fact.createProjectDetailGroup();
        pdg.getProject().add(client);
        req.setProfile(pdg);
        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.PROJTRACK_PROJECT_UPDATE));
    }

}
