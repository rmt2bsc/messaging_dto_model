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
import org.rmt2.jaxb.BusinessType;
import org.rmt2.jaxb.CreditorCriteriaType;
import org.rmt2.jaxb.CreditorType;
import org.rmt2.jaxb.CreditortypeCriteriaType;
import org.rmt2.jaxb.CreditortypeType;
import org.rmt2.jaxb.CustomerCriteriaType;
import org.rmt2.jaxb.CustomerType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.TransactionCriteriaGroup;
import org.rmt2.jaxb.TransactionDetailGroup;
import org.rmt2.jaxb.XactCustomCriteriaTargetType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.RecordTrackingTypeBuilder;
import org.rmt2.util.accounting.subsidiary.CreditorTypeBuilder;
import org.rmt2.util.accounting.subsidiary.CreditortypeTypeBuilder;
import org.rmt2.util.accounting.subsidiary.CustomerTypeBuilder;
import org.rmt2.util.addressbook.BusinessTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class SubsidiaryRequestBuilderTest {

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
    public void testBuildCustomerQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("subsidiary")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.SUBSIDIARY_CUSTOMER_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        BusinessType busType = BusinessTypeBuilder.Builder.create()
                .withBusinessId(1351)
                .withLongname("Business Type Description").build();
        
        CustomerType custType = CustomerTypeBuilder.Builder.create()
                .withCustomerId(3333)
                .withAcctId(1234567)
                .withPersonType(null)
                .withAccountNo("ACCT-NO-8888")
                .withCreditLimit(1234.55)
                .withAcctDescription("ACCOUNT DESCRIPTION")
                .withBalance(50000)
                .withActive(1).build();
                
        CustomerCriteriaType criteria = fact.createCustomerCriteriaType();
        criteria.setTargetLevel(XactCustomCriteriaTargetType.FULL);
        
        criteria.setCustomer(custType);
        criteria.setContactDetails(busType);

        TransactionCriteriaGroup criteriaGroup = fact.createTransactionCriteriaGroup();
        criteriaGroup.setCustomerCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.SUBSIDIARY_CUSTOMER_GET));
    }
  
    @Test
    public void testBuildCustomerUpdateRequest() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("subsidiary")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.SUBSIDIARY_CUSTOMER_UPDATE)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        BusinessType busType = BusinessTypeBuilder.Builder.create()
                .withBusinessId(1351)
                .withLongname("Business Type Description").build();
        
        CustomerType custType = CustomerTypeBuilder.Builder.create()
                .withCustomerId(3333)
                .withAcctId(1234567)
                .withBusinessType(busType)
                .withPersonType(null)
                .withAccountNo("ACCT-NO-8888")
                .withCreditLimit(1234.55)
                .withAcctDescription("ACCOUNT DESCRIPTION")
                .withBalance(50000)
                .withActive(1).build();
                
        TransactionDetailGroup profileGroup = fact.createTransactionDetailGroup();
        profileGroup.setCustomers(fact.createCustomerListType());
        profileGroup.getCustomers().getCustomer().add(custType);
        req.setHeader(head);
        req.setProfile(profileGroup);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.SUBSIDIARY_CUSTOMER_UPDATE));
    }
    
    @Test
    public void testBuildCustomerTranHistoryQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("subsidiary")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.SUBSIDIARY_CUSTOMER_TRAN_HIST_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        CustomerType custType = CustomerTypeBuilder.Builder.create()
                .withCustomerId(3333).build();
                
        CustomerCriteriaType criteria = fact.createCustomerCriteriaType();
        
        criteria.setCustomer(custType);

        TransactionCriteriaGroup criteriaGroup = fact.createTransactionCriteriaGroup();
        criteriaGroup.setCustomerCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.SUBSIDIARY_CUSTOMER_TRAN_HIST_GET));
    }
    
    @Test
    public void testBuildCustomerDeleteRequest() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("subsidiary")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.SUBSIDIARY_CUSTOMER_DELETE)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        
        CustomerType custType = CustomerTypeBuilder.Builder.create()
                .withCustomerId(3333).build();
                
        CustomerCriteriaType criteria = fact.createCustomerCriteriaType();
        
        criteria.setCustomer(custType);

        TransactionCriteriaGroup criteriaGroup = fact.createTransactionCriteriaGroup();
        criteriaGroup.setCustomerCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.SUBSIDIARY_CUSTOMER_DELETE));
    }
    
    @Test
    public void testBuildCreditorQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("subsidiary")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.SUBSIDIARY_CREDITOR_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        CreditorCriteriaType criteria = fact.createCreditorCriteriaType();
        criteria.setTargetLevel(XactCustomCriteriaTargetType.FULL);
        criteria.setCreditorId(BigInteger.valueOf(3333));
        criteria.setAcctId(BigInteger.valueOf(1234567));
        criteria.setBusinessId(BigInteger.valueOf(1351));
        criteria.setCreditorTypeId(BigInteger.valueOf(4444));
        criteria.setBusinessName("Business Type Description");
        criteria.setAccountNo("ACCT-NO-8888");
        criteria.setExtAccountNo("43A-567-989");
        
        TransactionCriteriaGroup criteriaGroup = fact.createTransactionCriteriaGroup();
        criteriaGroup.setCreditorCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.SUBSIDIARY_CREDITOR_GET));
    }
    
    @Test
    public void testBuildCreditorTranHistoryQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("subsidiary")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.SUBSIDIARY_CREDITOR_TRAN_HIST_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        CreditorCriteriaType criteria = fact.createCreditorCriteriaType();
        criteria.setCreditorId(BigInteger.valueOf(3333));

        TransactionCriteriaGroup criteriaGroup = fact.createTransactionCriteriaGroup();
        criteriaGroup.setCreditorCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.SUBSIDIARY_CREDITOR_TRAN_HIST_GET));
    }
    
    @Test
    public void testBuildCreditorTypeQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("subsidiary")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.SUBSIDIARY_CREDITOR_TYPE_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        CreditortypeCriteriaType criteria = fact.createCreditortypeCriteriaType();
        criteria.setCreditorTypeId(BigInteger.valueOf(3333));
        criteria.setDecription("Creditor Type Description");

        TransactionCriteriaGroup criteriaGroup = fact.createTransactionCriteriaGroup();
        criteriaGroup.setCreditortypeCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.SUBSIDIARY_CREDITOR_TYPE_GET));
    }
    
    @Test
    public void testBuildCreditorUpdateRequest() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("subsidiary")
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
        
        BusinessType busType = BusinessTypeBuilder.Builder.create()
                .withBusinessId(1351)
                .withLongname("Business Type Description").build();
        
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
    
    
    @Test
    public void testBuildCreditorDeleteRequest() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("subsidiary")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.SUBSIDIARY_CREDITOR_DELETE)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        CreditorCriteriaType criteria = fact.createCreditorCriteriaType();
        criteria.setCreditorId(BigInteger.valueOf(3333));
        
        TransactionCriteriaGroup criteriaGroup = fact.createTransactionCriteriaGroup();
        criteriaGroup.setCreditorCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.SUBSIDIARY_CREDITOR_DELETE));
    }
}
