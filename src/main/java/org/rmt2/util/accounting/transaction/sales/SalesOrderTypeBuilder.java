package org.rmt2.util.accounting.transaction.sales;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.SalesInvoiceType;
import org.rmt2.jaxb.SalesOrderItemListType;
import org.rmt2.jaxb.SalesOrderItemType;
import org.rmt2.jaxb.SalesOrderStatusHistoryType;
import org.rmt2.jaxb.SalesOrderStatusType;
import org.rmt2.jaxb.SalesOrderType;

import com.api.util.RMT2Date;
import com.api.util.assistants.Verifier;

/**
 * SalesOrderType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class SalesOrderTypeBuilder {

    private SalesOrderType subject;

    /**
     * Create a SalesOrderTypeBuilder
     */
    private SalesOrderTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createSalesOrderType();
        subject.setSalesOrderId(builder.salesOrderId);
        subject.setCustomerId(builder.customerId);
        subject.setCustomerName(builder.customerName);
        subject.setCustomerAccountNo(builder.customerAcctNo);
        subject.setInvoiced(builder.invoiced);
        subject.setOrderTotal(builder.orderTotal);
        subject.setEffectiveDate(builder.effectiveDate);

        // Setup sales order status object
        SalesOrderStatusType sost = f.createSalesOrderStatusType();
        sost.setStatusId(builder.statusId);
        sost.setDescription(builder.statusDescription);
        subject.setStatus(sost);

        // Ensure every sales order status history item points to this sales
        // order object
        for (SalesOrderStatusHistoryType item : builder.statusHist) {
            item.setSalesOrder(subject);
        }
        subject.getStatusHistory().addAll(builder.statusHist);
        subject.setSalesOrderItems(builder.salesOrderItems);

        // Ensure Invoice Details object is assigned the sales order object
        if (builder.invoiceDetails != null) {
            builder.invoiceDetails.setSalesOrder(subject);
        }
        subject.setInvoiceDetails(builder.invoiceDetails);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link SalesOrderType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger salesOrderId;
        private BigInteger customerId;
        private String customerName;
        private String customerAcctNo;
        private boolean invoiced;
        private BigDecimal orderTotal;
        private BigInteger statusId;
        private String statusDescription;
        private XMLGregorianCalendar effectiveDate;
        private List<SalesOrderStatusHistoryType> statusHist;
        private SalesOrderItemListType salesOrderItems;
        private SalesInvoiceType invoiceDetails;
        private RecordTrackingType tracking;

        private Builder() {
            this.tracking = null;
            this.statusHist = new ArrayList<SalesOrderStatusHistoryType>();
        }

        /**
         * Creates a new Builder.
         * <p>
         * Declared private to prevent direct instantiation by external
         * consumers.
         */
        public static Builder create() {
            return new Builder();
        }

        /**
         * Set up salesOrderId.
         * 
         * @param salesOrderId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSalesOrderId(int salesOrderId) {
            this.salesOrderId = BigInteger.valueOf(salesOrderId);
            return this;
        }

        /**
         * Set up customerId.
         * 
         * @param customerId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withCustomerId(int customerId) {
            this.customerId = BigInteger.valueOf(customerId);
            return this;
        }

        /**
         * Set up statusId.
         * 
         * @param statusId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withStatusId(int statusId) {
            this.statusId = BigInteger.valueOf(statusId);
            return this;
        }

        /**
         * Set up status description
         * 
         * @param statusDescription
         * @return
         */
        public Builder withStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }

        /**
         * Set up customerName.
         * 
         * @param customerName
         *            customer name
         * @return Non-null Builder used to continue building the object
         */
        public Builder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        /**
         * Set up customerAcctNo.
         * 
         * @param customerAcctNo
         *            customer account number
         * @return Non-null Builder used to continue building the object
         */
        public Builder withCustomerAcctNo(String customerAcctNo) {
            this.customerAcctNo = customerAcctNo;
            return this;
        }


        /**
         * Set up orderTotal.
         * 
         * @param orderTotal
         *            Order Total
         * @return Non-null Builder used to continue building the object
         */
        public Builder withOrderTotal(double orderTotal) {
            this.orderTotal = BigDecimal.valueOf(orderTotal);
            return this;
        }

        /**
         * Set up effectiveDate.
         * 
         * @param effectiveDate
         *            Effective Date
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEffectiveDate(Date effectiveDate) {
            this.effectiveDate = RMT2Date.toXmlDate(effectiveDate);
            return this;
        }

        /**
         * Set up statusHist.
         * 
         * @param statusHistItem
         *            Sales Order Status History item
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSalesOrderStatusHistoryItem(SalesOrderStatusHistoryType statusHistItem) {
            this.statusHist.add(statusHistItem);
            return this;
        }

        /**
         * Set up salesOrderItems.
         * 
         * @param item
         *            Sales Order Items Object
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSalesOrderItem(SalesOrderItemType item) {
            if (this.salesOrderItems == null) {
                ObjectFactory f = new ObjectFactory();
                this.salesOrderItems = f.createSalesOrderItemListType();
            }
            this.salesOrderItems.getSalesOrderItem().add(item);
            return this;
        }

        /**
         * Set up salesOrderItems.
         * 
         * @param item
         *            Sales Order Items Object
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSalesInvoiceType(SalesInvoiceType item) {
            this.invoiceDetails = item;
            return this;
        }

        /**
         * Set up invoiced.
         * 
         * @param invoiced
         *            boolean
         * @return Non-null Builder used to continue building the object
         */
        public Builder withInvoiced(boolean invoiced) {
            this.invoiced = invoiced;
            return this;
        }

        /**
         * Set up Record Tracking Info.
         * 
         * @param tracking
         *            an instance of {@link RecordTrackingType} value that must
         *            not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRecordTracking(RecordTrackingType tracking) {
            Verifier.verifyNotNull(tracking, "Tracking info cannot be null");
            this.tracking = tracking;
            return this;
        }

        /**
         * Completes the building of the SalesOrderType
         * 
         * @return an instance of {@link SalesOrderType}
         */
        public SalesOrderType build() {
            SalesOrderTypeBuilder obj = new SalesOrderTypeBuilder(this);
            return obj.subject;
        }
    }
}
