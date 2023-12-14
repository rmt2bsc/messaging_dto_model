package org.rmt2.messages.accounting.sales;

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
import org.rmt2.jaxb.CustomerCriteriaType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.SalesOrderCriteria;
import org.rmt2.jaxb.TransactionCriteriaGroup;
import org.rmt2.jaxb.XactCriteriaType;
import org.rmt2.jaxb.XactCustomCriteriaTargetType;
import org.rmt2.util.HeaderTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.util.RMT2Date;
import com.api.xml.jaxb.JaxbUtil;

public class CustomerSalesOrderQueryRequestBuilderTest {

    private JaxbUtil jaxb;

    @Before
    public void setUp() throws Exception {
        try {
            jaxb = SystemConfigurator.getJaxb(ConfigConstants.JAXB_CONTEXNAME_DEFAULT);
        } catch (Exception e) {
            jaxb = new JaxbUtil(MessagingConstants.JAXB_RMT2_PKG);
        }
    }

    @Test
    public void testBuildRequestSalesOrderHeader() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication(ApiTransactionCodes.APP_ACCOUNTING)
                .withModule(ApiTransactionCodes.MODULE_ACCOUNTING_XACT)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.ACCOUNTING_SALESORDER_GET_CUSTOMER_SPECIFIC)
                .withRouting(ApiTransactionCodes.ROUTE_ACCOUNTING)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        // Build transaction criteria group
        TransactionCriteriaGroup criteria = fact.createTransactionCriteriaGroup();

        // SalesORderCriteria object is requried.
        SalesOrderCriteria soCriteria = fact.createSalesOrderCriteria();
        // This is the only property of SalesORderCriteria that is required.
        soCriteria.setCustomerId(BigInteger.valueOf(222222));

        soCriteria.setAccountNo("ACCTNO-1234");
        soCriteria.setBusinessId(BigInteger.valueOf(11111));
        soCriteria.setBusinessName("ABC Company");
        soCriteria.setXactId(123);
        soCriteria.setInvoiceId(4444);
        soCriteria.setSalesOrderDate(RMT2Date.toXmlDate("2020-01-01-06:00"));
        soCriteria.setSalesOrderId(BigInteger.valueOf(33333));
        soCriteria.setTargetLevel(XactCustomCriteriaTargetType.HEADER);
        soCriteria.setSalesOrderTotal(BigDecimal.valueOf(1000.00));

        // These two criteria objects are no longer required or needed.
        CustomerCriteriaType custCriteria = fact.createCustomerCriteriaType();
        XactCriteriaType xactCriteria = fact.createXactCriteriaType();

        criteria.setSalesCriteria(soCriteria);
        criteria.setXactCriteria(xactCriteria);
        criteria.setCustomerCriteria(custCriteria);
        req.setCriteria(criteria);

        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.ACCOUNTING_SALESORDER_GET_CUSTOMER_SPECIFIC));
        Assert.assertTrue(xml.contains("<target_level>HEADER</target_level>"));
    }

    @Test
    public void testBuildRequestSalesOrderDetails() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication(ApiTransactionCodes.APP_ACCOUNTING)
                .withModule(ApiTransactionCodes.MODULE_ACCOUNTING_XACT)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.ACCOUNTING_SALESORDER_GET_CUSTOMER_SPECIFIC)
                .withRouting(ApiTransactionCodes.ROUTE_ACCOUNTING)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        // Build transaction criteria group
        TransactionCriteriaGroup criteria = fact.createTransactionCriteriaGroup();

        // SalesORderCriteria object is requried.
        SalesOrderCriteria soCriteria = fact.createSalesOrderCriteria();
        // This is the only property of SalesORderCriteria that is required.
        soCriteria.setCustomerId(BigInteger.valueOf(222222));

        soCriteria.setAccountNo("ACCTNO-1234");
        soCriteria.setBusinessId(BigInteger.valueOf(11111));
        soCriteria.setBusinessName("ABC Company");
        soCriteria.setXactId(123);
        soCriteria.setInvoiceId(4444);
        soCriteria.setSalesOrderDate(RMT2Date.toXmlDate("2020-01-01-06:00"));
        soCriteria.setSalesOrderId(BigInteger.valueOf(33333));
        soCriteria.setTargetLevel(XactCustomCriteriaTargetType.DETAILS);
        soCriteria.setSalesOrderTotal(BigDecimal.valueOf(1000.00));

        // These two criteria objects are no longer required or needed.
        CustomerCriteriaType custCriteria = fact.createCustomerCriteriaType();
        XactCriteriaType xactCriteria = fact.createXactCriteriaType();

        criteria.setSalesCriteria(soCriteria);
        criteria.setXactCriteria(xactCriteria);
        criteria.setCustomerCriteria(custCriteria);
        req.setCriteria(criteria);

        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.ACCOUNTING_SALESORDER_GET_CUSTOMER_SPECIFIC));
        Assert.assertTrue(xml.contains("<target_level>DETAILS</target_level>"));
    }

    @Test
    public void testBuildRequestSalesOrderFull() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication(ApiTransactionCodes.APP_ACCOUNTING)
                .withModule(ApiTransactionCodes.MODULE_ACCOUNTING_XACT)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.ACCOUNTING_SALESORDER_GET_CUSTOMER_SPECIFIC)
                .withRouting(ApiTransactionCodes.ROUTE_ACCOUNTING)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        // Build transaction criteria group
        TransactionCriteriaGroup criteria = fact.createTransactionCriteriaGroup();

        // SalesORderCriteria object is requried.
        SalesOrderCriteria soCriteria = fact.createSalesOrderCriteria();
        // This is the only property of SalesORderCriteria that is required.
        soCriteria.setCustomerId(BigInteger.valueOf(222222));

        soCriteria.setAccountNo("ACCTNO-1234");
        soCriteria.setBusinessId(BigInteger.valueOf(11111));
        soCriteria.setBusinessName("ABC Company");
        soCriteria.setXactId(123);
        soCriteria.setInvoiceId(4444);
        soCriteria.setSalesOrderDate(RMT2Date.toXmlDate("2020-01-01-06:00"));
        soCriteria.setSalesOrderId(BigInteger.valueOf(33333));
        soCriteria.setTargetLevel(XactCustomCriteriaTargetType.FULL);
        soCriteria.setSalesOrderTotal(BigDecimal.valueOf(1000.00));

        // These two criteria objects are no longer required or needed.
        CustomerCriteriaType custCriteria = fact.createCustomerCriteriaType();
        XactCriteriaType xactCriteria = fact.createXactCriteriaType();

        criteria.setSalesCriteria(soCriteria);
        criteria.setXactCriteria(xactCriteria);
        criteria.setCustomerCriteria(custCriteria);
        req.setCriteria(criteria);

        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.ACCOUNTING_SALESORDER_GET_CUSTOMER_SPECIFIC));
        Assert.assertTrue(xml.contains("<target_level>FULL</target_level>"));
    }


}
