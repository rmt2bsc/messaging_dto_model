package org.rmt2.messages.accounting.subsidiary;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AccountingTransactionRequest;
import org.rmt2.jaxb.BusinessType;
import org.rmt2.jaxb.CodeDetailType;
import org.rmt2.jaxb.CreditorType;
import org.rmt2.jaxb.CreditortypeType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.TransactionDetailGroup;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.RecordTrackingTypeBuilder;
import org.rmt2.util.accounting.subsidiary.CreditorTypeBuilder;
import org.rmt2.util.accounting.subsidiary.CreditortypeTypeBuilder;
import org.rmt2.util.addressbook.BusinessTypeBuilder;
import org.rmt2.util.addressbook.CodeDetailTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class CreditorUpdateRequestBuilderTest {

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
                .withModule(ApiTransactionCodes.MODULE_ACCOUNTING_SUBSIDIARY)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.SUBSIDIARY_CREDITOR_UPDATE)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        RecordTrackingType rtt = RecordTrackingTypeBuilder.Builder.create()
                .withDateCreated("2018-01-01")
                .withDateUpdate("2018-01-01")
                .withUserId("rterrell")
                .withIpCreated("192.168.0.1")
                .withIpUpdate("192.168.0.1").build();
        
        CodeDetailType cdtEntity = CodeDetailTypeBuilder.Builder.create()
                .withCodeId(200)
                .build();
        
        CodeDetailType cdtServType = CodeDetailTypeBuilder.Builder.create()
                .withCodeId(300)
                .build();
        
        BusinessType busType = BusinessTypeBuilder.Builder.create()
                .withBusinessId(1351)
                .withLongname("Business Type Description")
                .withEntityType(cdtEntity)
                .withServiceType(cdtServType)
                .build();
        
        CreditortypeType creditorType = CreditortypeTypeBuilder.Builder.create()
                .withCreditorTypeId(3456)
                .withDescription("Creditor type description")
                .build();
      
        CreditorType creditor = CreditorTypeBuilder.Builder.create()
                .withCreditorId(3333)
                .withAcctId(1234567)
                .withBusinessType(busType)
                .withCreditorytypeType(creditorType)
                .withAccountNo("ACCT-NO-8888")
                .withExtAccountNo("A943943-349394")
                .withApr(2.456)
                .withCreditLimit(10000.00)
                .withBalance(4000.00)
                .withActive(1)
                .withTransactions(null)
                .withRecordTracking(rtt).build();
                
        TransactionDetailGroup profileGroup = fact.createTransactionDetailGroup();
        profileGroup.setCreditors(fact.createCreditorListType());
        profileGroup.getCreditors().getCreditor().add(creditor);
        req.setHeader(head);
        req.setProfile(profileGroup);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.SUBSIDIARY_CREDITOR_UPDATE));
    }

}
