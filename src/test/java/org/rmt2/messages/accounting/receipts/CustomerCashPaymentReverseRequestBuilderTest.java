package org.rmt2.messages.accounting.receipts;

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
import org.rmt2.jaxb.CustomerType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.TransactionDetailGroup;
import org.rmt2.jaxb.XactLineitemListType;
import org.rmt2.jaxb.XactListType;
import org.rmt2.jaxb.XactType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.accounting.subsidiary.CustomerTypeBuilder;
import org.rmt2.util.accounting.transaction.XacttypeTypeBuilder;
import org.rmt2.util.addressbook.BusinessTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.util.RMT2Date;
import com.api.xml.jaxb.JaxbUtil;

public class CustomerCashPaymentReverseRequestBuilderTest {

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
                .withApplication("accounting")
                .withModule("transaction")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.ACCOUNTING_CASHRECEIPT_REVERSE)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        TransactionDetailGroup data = fact.createTransactionDetailGroup();
        XactListType xlt = fact.createXactListType();
        data.setTransactions(xlt);
        XactType xt = fact.createXactType();
        xlt.getTransaction().add(xt);
        XactLineitemListType xlilt = fact.createXactLineitemListType();
        xt.setLineitems(xlilt);
        
        xt.setXactId(BigInteger.valueOf(9999));
        xt.setXactType(XacttypeTypeBuilder.Builder.create().withXactTypeId(2).build());
        xt.setXactAmount(BigDecimal.valueOf(100.00));
        xt.setXactDate(RMT2Date.toXmlDate("2018-12-01"));
        xt.setXactReason("Test creating a reerse customer cash payment transaction via message handler");
        xt.setConfirmNo("ADB-49384343");
        xt.setNegInstrNo("1111-1111-1111-1111");
        xt.setTenderId(BigInteger.valueOf(11));

        CustomerType customer = CustomerTypeBuilder.Builder.create()
                .withCustomerId(3333)
                .build();
        
        xt.setCustomer(customer);
        
        req.setProfile(data);
        
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.ACCOUNTING_CASHRECEIPT_REVERSE));
    }
  }
