package org.rmt2.messages.projecttracker.timesheet;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.EmployeeProjectType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ProjectCriteriaGroup;
import org.rmt2.jaxb.ProjectDetailGroup;
import org.rmt2.jaxb.ProjectProfileRequest;
import org.rmt2.jaxb.ProjectProfileResponse;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.ReplyStatusType;
import org.rmt2.jaxb.TimesheetCriteriaType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.RecordTrackingTypeBuilder;
import org.rmt2.util.ReplyStatusTypeBuilder;
import org.rmt2.util.projecttracker.employee.EmployeeProjectTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.util.RMT2Date;
import com.api.xml.jaxb.JaxbUtil;

public class TimesheetQueryRequestBuilderTest {

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
                .withTransaction(ApiTransactionCodes.PROJTRACK_TIMESHEET_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        TimesheetCriteriaType criteria = fact.createTimesheetCriteriaType();
        criteria.setTimesheetId(BigInteger.valueOf(169));
        criteria.setStatusId(BigInteger.valueOf(2));
        criteria.setProjectId(BigInteger.valueOf(30));
        criteria.setPeriodBegin(RMT2Date.toXmlDate("2020-5-23"));
        criteria.setPeriodEnd(RMT2Date.toXmlDate("2021-6-23"));
        criteria.setEmployeeId(BigInteger.valueOf(2000));
        criteria.setClientId(BigInteger.valueOf(20));

        ProjectCriteriaGroup pcg = fact.createProjectCriteriaGroup();
        pcg.setTimesheetCriteria(criteria);
        req.setCriteria(pcg);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.PROJTRACK_TIMESHEET_GET));
    }

    @Test
    public void testBuildResponse() {
        ObjectFactory fact = new ObjectFactory();
        ProjectProfileResponse resp = fact.createProjectProfileResponse();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication("projecttracker")
                .withModule("timesheet")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.PROJTRACK_EMPLOYEE_PROJECT_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        ReplyStatusType rst = ReplyStatusTypeBuilder.Builder.create()
                .withStatus(MessagingConstants.RETURN_STATUS_SUCCESS)
                .withReturnCode(MessagingConstants.RETURN_CODE_SUCCESS)
                .withMessage("project data found")
                .withRecordCount(1)
                .build();

        RecordTrackingType tracking = RecordTrackingTypeBuilder.Builder.create()
                .withDateCreated(RMT2Date.stringToDate("2020-05-01"))
                .withDateUpdate(RMT2Date.stringToDate("2020-05-01"))
                .withUserId("testuser")
                .build();

        EmployeeProjectType ept = EmployeeProjectTypeBuilder.Builder.create()
                .withEmpProjId(3333)
                .withEmployeeId(200)
                .withProjectId(6789)
                .withEmpProjEffectiveDate(new Date())
                .withEmpProjEndDate("2020-05-31")
                .withEmpProjHourlyRate(100.00)
                .withEmpProjHourlyOvertimeRate(150.00)
                .withEmpProjFlatRate(145000.00)
                .withEmpProjComments("These are comments")
                .withClientId(33)
                .withClientName("Client Name")
                .withClientAccountNo("Client Acccount Number")
                .withClientBusinessId(1431)
                .withClientBillRate(300.00)
                .withClientOvertimeBillRate(400.00)
                .withProjectName("Project Name")
                .withProjectEffectiveDate("2019-01-01")
                .withProjectEndDate("2021-12-31")
                .withRecordTracking(tracking)
                .build();

        ProjectDetailGroup profile = fact.createProjectDetailGroup();
        profile.getEmployeeProject().add(ept);

        resp.setProfile(profile);
        resp.setHeader(head);
        resp.setReplyStatus(rst);

        String xml = jaxb.marshalJsonMessage(resp);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.PROJTRACK_EMPLOYEE_PROJECT_GET));
    }
}
