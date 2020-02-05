package org.rmt2.messages.accounting.sales;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AccountingTransactionRequest;
import org.rmt2.jaxb.AccountingTransactionResponse;
import org.rmt2.jaxb.BusinessType;
import org.rmt2.jaxb.CustomerCriteriaType;
import org.rmt2.jaxb.CustomerType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.SalesInvoiceType;
import org.rmt2.jaxb.SalesOrderCriteria;
import org.rmt2.jaxb.SalesOrderItemType;
import org.rmt2.jaxb.SalesOrderType;
import org.rmt2.jaxb.TransactionCriteriaGroup;
import org.rmt2.jaxb.TransactionDetailGroup;
import org.rmt2.jaxb.XactBasicCriteriaType;
import org.rmt2.jaxb.XactCriteriaType;
import org.rmt2.jaxb.XactType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.RecordTrackingTypeBuilder;
import org.rmt2.util.accounting.subsidiary.CustomerTypeBuilder;
import org.rmt2.util.accounting.transaction.XactTypeBuilder;
import org.rmt2.util.accounting.transaction.sales.SalesInvoiceTypeBuilder;
import org.rmt2.util.accounting.transaction.sales.SalesOrderItemTypeBuilder;
import org.rmt2.util.accounting.transaction.sales.SalesOrderTypeBuilder;
import org.rmt2.util.addressbook.BusinessTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.util.RMT2Date;
import com.api.xml.jaxb.JaxbUtil;

public class SalesOrderPrintRequestBuilderTest {

    private JaxbUtil jaxb;
    private static final String CUSTOMER_NAME = "ABC Company";
    private static final int CUSTOMER_ID = 111111;
    private static final int SALES_ORDER_ID = 222222;
    private static final int XACT_ID = 333333;
    private static final int INVOICE_ID = 444444;

    @Before
    public void setUp() throws Exception {
        try {
            jaxb = SystemConfigurator.getJaxb(ConfigConstants.JAXB_CONTEXNAME_DEFAULT);
        } catch (Exception e) {
            jaxb = new JaxbUtil(MessagingConstants.JAXB_RMT2_PKG);
        }
    }

    @Test
    public void testBuildRequest() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionRequest req = fact.createAccountingTransactionRequest();

        HeaderType head = HeaderTypeBuilder.Builder.create().withApplication("accounting").withModule("transaction")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.ACCOUNTING_SALESORDER_PRINT).withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        // Build transaction criteria group
        TransactionCriteriaGroup criteria = fact.createTransactionCriteriaGroup();
        SalesOrderCriteria soCriteria = fact.createSalesOrderCriteria();
        CustomerCriteriaType custCriteria = fact.createCustomerCriteriaType();
        XactCriteriaType xactCriteria = fact.createXactCriteriaType();

        CustomerType custType = fact.createCustomerType();
        custCriteria.setCustomer(custType);
        XactBasicCriteriaType xbct = fact.createXactBasicCriteriaType();
        xactCriteria.setBasicCriteria(xbct);

        criteria.setCustomerCriteria(custCriteria);
        criteria.setSalesCriteria(soCriteria);
        criteria.setXactCriteria(xactCriteria);

        soCriteria.setSalesOrderId(BigInteger.valueOf(SALES_ORDER_ID));
        custType.setCustomerId(BigInteger.valueOf(CUSTOMER_ID));
        xbct.setXactId(BigInteger.valueOf(XACT_ID));

        req.setCriteria(criteria);

        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.ACCOUNTING_SALESORDER_PRINT));
    }


    @Test
    public void testBuildResponse() {
        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionResponse res = fact.createAccountingTransactionResponse();

        HeaderType head = HeaderTypeBuilder.Builder.create().withApplication("accounting").withModule("transaction")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.ACCOUNTING_SALESORDER_PRINT).withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        RecordTrackingType tracking = RecordTrackingTypeBuilder.Builder.create()
                .withDateCreated(RMT2Date.stringToDate("2020-01-01"))
                .withDateUpdate(RMT2Date.stringToDate("2020-01-01"))
                .withUserId("testuser")
                .build();

        SalesOrderItemType item1 = SalesOrderItemTypeBuilder.Builder.create()
                .withSalesOrderItemId(4321)
                .withSalesOrderId(SALES_ORDER_ID)
                .withBackOrderQty(0)
                .withMarkup(2)
                .withUnitCost(100.00)
                .withOrderQty(3)
                .withRecordTracking(tracking)
                .build();
        SalesOrderItemType item2 = SalesOrderItemTypeBuilder.Builder.create()
                .withSalesOrderItemId(5432)
                .withSalesOrderId(SALES_ORDER_ID)
                .withBackOrderQty(0)
                .withMarkup(2)
                .withUnitCost(100.00)
                .withOrderQty(2)
                .withRecordTracking(tracking)
                .build();

        RecordTrackingType tracking2 = RecordTrackingTypeBuilder.Builder.create()
                .withDateCreated(RMT2Date.stringToDate("2020-01-01"))
                .withDateUpdate(RMT2Date.stringToDate("2020-02-01"))
                .withUserId("testuser")
                .build();
        
        XactType xt = XactTypeBuilder.Builder.create()
                .withXactId(XACT_ID)
                .withBankTransInd("Trans_Ind")
                .withConfirmNo("12345BDC93839")
                .withDocumentId(102)
                .withItemTotal(1000.00)
                .withPostedDate("2020-01-01")
                .withReason("Invoiced sales order")
                .withTenderId(100)
                .withXactAmount(1000.00)
                .withXactDate("2020-01-01")
                .withXactCodeGroupId(1)
                .withXactCodeGroupDescription("Transaction Types")
                .withXactCodeId(4)
                .withXactCodeDescription("CASH RECEIPTS")
                .withXactTypeId(2)
                .withXactTypeDescription("CASH RECEIPTS")
                .build();
        
        RecordTrackingType tracking3 = RecordTrackingTypeBuilder.Builder.create()
                .withDateCreated(RMT2Date.stringToDate("2020-01-01"))
                .withDateUpdate(RMT2Date.stringToDate("2020-02-01"))
                .withUserId("testuser")
                .build();

        SalesInvoiceType sit = SalesInvoiceTypeBuilder.Builder.create()
                .withInvoiceId(INVOICE_ID)
                .withInvoiceNo("INVOICE_NUMBER")
                .withSalesOrderId(SALES_ORDER_ID)
                .withInvoiceTotal(1000.00)
                .withItemCount(2)
                .withTransaction(xt)
                .withRecordTracking(tracking3)
                .build();
        
        SalesOrderType so = SalesOrderTypeBuilder.Builder.create()
                .withCustomerAcctNo("111-111-111")
                .withInvoiced(false)
                .withSalesOrderId(SALES_ORDER_ID)
                .withCustomerId(CUSTOMER_ID)
                .withCustomerName(CUSTOMER_NAME)
                .withOrderTotal(1000.00)
                .withEffectiveDate(RMT2Date.stringToDate("2020-01-15"))
                .withStatusId(1)
                .withStatusDescription("Quote")
                .withSalesOrderItem(item1)
                .withSalesOrderItem(item2)
                .withSalesInvoiceType(sit)
                .withRecordTracking(tracking2)
                .build();

        BusinessType bt = BusinessTypeBuilder.Builder.create()
                .withBusinessId(111000)
                .withContactFirstname("Frank")
                .withContactLastname("Good")
                .withContactPhone("999.999.9999")
                .withLongname(CUSTOMER_NAME)
                .withTaxId("75-0001234")
                .withWebsite("www.abc.com")
                .withContactEmail("frank.good@gte.net")
                .build();
        
        CustomerType cust = CustomerTypeBuilder.Builder.create()
                .withCustomerId(CUSTOMER_ID)
                .withBusinessType(bt)
                .build();
        
        BusinessType btMainCompany = BusinessTypeBuilder.Builder.create()
                .withBusinessId(111000)
                .withContactFirstname("Roy")
                .withContactLastname("Terrell")
                .withContactPhone("999.999.9999")
                .withLongname("RMT2 Business Systems Corp")
                .withTaxId("75-3331234")
                .withWebsite("www.rmt2bsc.com")
                .withContactEmail("roy.terrell@rmt2.net")
                .build();

        // Build transaction criteria group
        TransactionDetailGroup profile = fact.createTransactionDetailGroup();
        profile.setCompany(btMainCompany);
        profile.setSalesOrders(fact.createSalesOrderListType());
        profile.getSalesOrders().getSalesOrder().add(so);
        profile.setCustomers(fact.createCustomerListType());
        profile.getCustomers().getCustomer().add(cust);

        res.setProfile(profile);
        res.setHeader(head);

        String xml = jaxb.marshalJsonMessage(res);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.ACCOUNTING_SALESORDER_PRINT));
    }
}
