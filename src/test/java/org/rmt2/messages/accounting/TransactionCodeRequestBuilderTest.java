package org.rmt2.messages.accounting;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AccountingTransactionRequest;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.TransactionCriteriaGroup;
import org.rmt2.jaxb.XactCodeCriteriaType;
import org.rmt2.jaxb.XactCodeGroupType;
import org.rmt2.util.HeaderTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class TransactionCodeRequestBuilderTest {

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
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication(ApiTransactionCodes.APP_ACCOUNTING)
                .withModule(ApiTransactionCodes.MODULE_ACCOUNTING_XACT)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.ACCOUNTING_TRANSACTION_CODE_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withSessionId("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        XactCodeCriteriaType criteria = fact.createXactCodeCriteriaType();
        XactCodeGroupType grp = fact.createXactCodeGroupType();
        grp.setXactCodeGrpId(BigInteger.valueOf(101));
        criteria.setXactCodeGrp(grp);
        criteria.setXactCodeId(BigInteger.valueOf(201));
        criteria.setDescription("Test code description");
        
        TransactionCriteriaGroup criteriaGroup = fact.createTransactionCriteriaGroup();
        criteriaGroup.setXactCodeCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.ACCOUNTING_TRANSACTION_CODE_GET));
    }
  }
