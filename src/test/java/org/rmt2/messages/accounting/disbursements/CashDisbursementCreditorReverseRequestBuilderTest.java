package org.rmt2.messages.accounting.disbursements;

import java.math.BigDecimal;
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
import org.rmt2.jaxb.CreditorType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.TransactionDetailGroup;
import org.rmt2.jaxb.XactLineitemListType;
import org.rmt2.jaxb.XactListType;
import org.rmt2.jaxb.XactType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.accounting.subsidiary.CreditorTypeBuilder;
import org.rmt2.util.accounting.transaction.XactItemTypeBuilder;
import org.rmt2.util.accounting.transaction.XacttypeTypeBuilder;
import org.rmt2.util.addressbook.BusinessTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.util.RMT2Date;
import com.api.xml.jaxb.JaxbUtil;

public class CashDisbursementCreditorReverseRequestBuilderTest {

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
                .withModule("transaction")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.ACCOUNTING_CASHDISBURSE_CREDITOR_REVERSE)
                .withRouting(ApiTransactionCodes.ROUTE_ACCOUNTING)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        TransactionDetailGroup data = fact.createTransactionDetailGroup();
        XactListType xlt = fact.createXactListType();
        data.setTransactions(xlt);
        XactType xt = fact.createXactType();
        xlt.getTransaction().add(xt);
        XactLineitemListType xlilt = fact.createXactLineitemListType();
        xt.setLineitems(xlilt);
        
        xt.setXactId(BigInteger.valueOf(0));
        xt.setXactType(XacttypeTypeBuilder.Builder.create().withXactTypeId(60).build());
        xt.setXactAmount(BigDecimal.valueOf(100.00));
        xt.setXactDate(RMT2Date.toXmlDate("2018-12-01"));
        xt.setXactReason("Test creating a cash disbursement transaction via message handler");
        xt.setConfirmNo("ADB-49384343");
        xt.setNegInstrNo("1111-1111-1111-1111");
        xt.setTenderId(BigInteger.valueOf(100));

        xt.getLineitems().getLineitem()
                .add(XactItemTypeBuilder.Builder.create().withXactTypeItemActvId(0).withAmount(20)
                        .withXactId(0).withItemId(601).withItemTypeId(7001)
                        .withDescription("item1").build());
        xt.getLineitems().getLineitem()
        .add(XactItemTypeBuilder.Builder.create().withXactTypeItemActvId(0).withAmount(20)
                .withXactId(0).withItemId(602).withItemTypeId(7002)
                .withDescription("item2").build());
        xt.getLineitems().getLineitem()
        .add(XactItemTypeBuilder.Builder.create().withXactTypeItemActvId(0).withAmount(20)
                .withXactId(0).withItemId(603).withItemTypeId(7003)
                .withDescription("item3").build());
        xt.getLineitems().getLineitem()
        .add(XactItemTypeBuilder.Builder.create().withXactTypeItemActvId(0).withAmount(20)
                .withXactId(0).withItemId(604).withItemTypeId(7004)
                .withDescription("item4").build());
        xt.getLineitems().getLineitem()
        .add(XactItemTypeBuilder.Builder.create().withXactTypeItemActvId(0).withAmount(20)
                .withXactId(0).withItemId(605).withItemTypeId(7005)
                .withDescription("item5").build());
        
        // Create creditor object
        BusinessType bt = BusinessTypeBuilder.Builder.create()
                .withBusinessId(1351)
                .withLongname("ABC Company")
                .withContactEmail("ABCCompany@gte.net")
                .withContactPhoneExt("1234")
                .withContactFirstname("Roy")
                .withContactLastname("Terrell")
                .withContactPhone("2141234567").build();
                
        CreditorType creditor = CreditorTypeBuilder.Builder.create()
                .withAccountNo("ACCT-NO-8888") 
                .withAcctId(1234567)
                .withCreditorId(3333)
                .withExtAccountNo("43A-567-989")
                .withBusinessType(bt).build();
        
        xt.setCreditor(creditor);
        
        req.setProfile(data);
        
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.ACCOUNTING_CASHDISBURSE_CREDITOR_REVERSE));
    }
  }
