package org.rmt2.messages.projecttracker.employee;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.EmployeeTitleCriteriaType;
import org.rmt2.jaxb.EmployeeTitleType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ProjectCriteriaGroup;
import org.rmt2.jaxb.ProjectDetailGroup;
import org.rmt2.jaxb.ProjectProfileRequest;
import org.rmt2.jaxb.ProjectProfileResponse;
import org.rmt2.jaxb.ReplyStatusType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.ReplyStatusTypeBuilder;
import org.rmt2.util.projecttracker.employee.EmployeeTitleTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class EmployeeTitleQueryRequestBuilderTest {
    private static final String TITLE = "Applications Engineer III";
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
                .withApplication(ApiTransactionCodes.APP_PROJECTTRACKER)
                .withModule(ApiTransactionCodes.MODULE_PROJECTTRACKER_EMPLOYEE)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.PROJTRACK_EMPLOYEE_TITLE_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        EmployeeTitleCriteriaType criteria = fact.createEmployeeTitleCriteriaType();
        criteria.setEmployeeTitleId(BigInteger.valueOf(4));
        criteria.setDescription(TITLE);

        ProjectCriteriaGroup pcg = fact.createProjectCriteriaGroup();
        pcg.setEmployeeTitleCriteria(criteria);
        req.setCriteria(pcg);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.PROJTRACK_EMPLOYEE_TITLE_GET));
    }

    @Test
    public void testBuildResponse() {
        ObjectFactory fact = new ObjectFactory();
        ProjectProfileResponse resp = fact.createProjectProfileResponse();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication(ApiTransactionCodes.APP_PROJECTTRACKER)
                .withModule(ApiTransactionCodes.MODULE_PROJECTTRACKER_EMPLOYEE)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.PROJTRACK_EMPLOYEE_TITLE_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        ReplyStatusType rst = ReplyStatusTypeBuilder.Builder.create()
                .withStatus(MessagingConstants.RETURN_STATUS_SUCCESS)
                .withReturnCode(MessagingConstants.RETURN_CODE_SUCCESS)
                .withMessage("employee title data found")
                .withRecordCount(1)
                .build();

        EmployeeTitleType et = EmployeeTitleTypeBuilder.Builder.create()
                .withEmployeeTitleId(4)
                .withDescription(TITLE)
                .build();

        ProjectDetailGroup profile = fact.createProjectDetailGroup();
        profile.getEmployeeTitle().add(et);

        resp.setProfile(profile);
        resp.setHeader(head);
        resp.setReplyStatus(rst);

        String xml = jaxb.marshalJsonMessage(resp);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.PROJTRACK_EMPLOYEE_TITLE_GET));
    }
}
