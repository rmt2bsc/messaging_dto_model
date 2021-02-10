package org.rmt2.messages.projecttracker.timesheet;

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
import org.rmt2.jaxb.ProjectProfileResponse;
import org.rmt2.jaxb.TimesheetStatusType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.projecttracker.timesheet.TimesheetStatusTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class TimesheetStatusQueryRequestBuilderTest {

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
                .withModule("timesheet")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.PROJTRACK_TIMESHEET_STATUS_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        

        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.PROJTRACK_TIMESHEET_STATUS_GET));
    }

    @Test
    public void testBuildResponse() {
        ObjectFactory fact = new ObjectFactory();
        ProjectProfileResponse resp = fact.createProjectProfileResponse();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication("projecttracker")
                .withModule(ConfigConstants.API_APP_MODULE_VALUE)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.PROJTRACK_TIMESHEET_STATUS_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();


        ProjectDetailGroup profile = fact.createProjectDetailGroup();
        profile.getTimesheetStatus().add(this.createStatus(1, "Draft", "Desctiption 1"));
        profile.getTimesheetStatus().add(this.createStatus(2, "Submitted", "Desctiption 2"));
        profile.getTimesheetStatus().add(this.createStatus(3, "Invoice", "Desctiption 3"));

        resp.setProfile(profile);
        resp.setHeader(head);

        String xml = jaxb.marshalJsonMessage(resp);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.PROJTRACK_TIMESHEET_STATUS_GET));
    }

    private TimesheetStatusType createStatus(int statusId, String statusName, String description) {
        TimesheetStatusType tst = TimesheetStatusTypeBuilder.Builder.create()
                .withStatusId(statusId)
                .withName(statusName)
                .withDescription(description)
                .build();
        return tst;
    }
}
