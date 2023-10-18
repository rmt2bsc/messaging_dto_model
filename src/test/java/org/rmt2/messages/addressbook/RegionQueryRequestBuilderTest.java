package org.rmt2.messages.addressbook;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.PostalRequest;
import org.rmt2.jaxb.PostalRequest.PostalCriteria;
import org.rmt2.jaxb.StatesCriteriaType;
import org.rmt2.util.HeaderTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class RegionQueryRequestBuilderTest {

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
    public void testBuildRegionQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        PostalRequest req = fact.createPostalRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication(ApiTransactionCodes.APP_ADDRESSBOOK)
                .withModule(ApiTransactionCodes.MODULE_ADDRESSBOOK_POSTAL)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.REGION_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        PostalCriteria postalCriteria = fact.createPostalRequestPostalCriteria();
        StatesCriteriaType criteria = fact.createStatesCriteriaType();
        criteria.setCountryId(BigInteger.valueOf(12345));
        criteria.setStateId(BigInteger.valueOf(2222));
        criteria.setStateName("Texas");
        criteria.setStateCode("TX");
        postalCriteria.setProvince(criteria);
        req.setPostalCriteria(postalCriteria);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.REGION_GET));
    }
}
