package org.rmt2.util.accounting.transaction.sales;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.SalesInvoiceType;
import org.rmt2.jaxb.XactType;

import com.api.util.RMT2Date;
import com.api.util.assistants.Verifier;

/**
 * SalesInvoiceType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class SalesInvoiceTypeBuilder {

    private SalesInvoiceType subject;

    /**
     * Create a SalesInvoiceTypeBuilder
     */
    private SalesInvoiceTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createSalesInvoiceType();
        subject.setInvoiceId(builder.invoiceId);
        subject.setSalesOrderId(builder.salesOrder);
        subject.setTransaction(builder.transaction);
        subject.setInvoiceNo(builder.invoiceNo);
        subject.setInvoiceDate(builder.invoiceDate);
        subject.setItemCount(builder.itemCount);
        subject.setInvoiceTotal(builder.invoiceTotal);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link SalesInvoiceType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger invoiceId;
        private BigInteger salesOrder;
        private XactType transaction;
        private String invoiceNo;
        private XMLGregorianCalendar invoiceDate;
        private BigInteger itemCount;
        private BigDecimal invoiceTotal;
        private RecordTrackingType tracking;

        private Builder() {
            this.tracking = null;
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
         * Set up invoiceId.
         * 
         * @param invoiceId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withInvoiceId(int invoiceId) {
            this.invoiceId = BigInteger.valueOf(invoiceId);
            return this;
        }

        /**
         * Set up salesOrder.
         * 
         * @param salesOrderId
         *            Sales Order Id
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSalesOrderId(int salesOrderId) {
            this.salesOrder = BigInteger.valueOf(salesOrderId);
            return this;
        }

        /**
         * Set up transaction.
         * 
         * @param transaction
         *            XactType
         * @return Non-null Builder used to continue building the object
         */
        public Builder withTransaction(XactType transaction) {
            this.transaction = transaction;
            return this;
        }

        /**
         * Set up invoiceNo.
         * 
         * @param invoiceNo
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withInvoiceNo(String invoiceNo) {
            this.invoiceNo = (invoiceNo);
            return this;
        }

        /**
         * Set up xactDate.
         * 
         * @param invoiceDate
         *            a Date value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withInvoiceDate(Date invoiceDate) {
            this.invoiceDate = RMT2Date.toXmlDate(invoiceDate);
            return this;
        }

        /**
         * Set up xactDate.
         * 
         * @param invoiceDate
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withInvoiceDate(String invoiceDate) {
            this.invoiceDate = RMT2Date.toXmlDate(invoiceDate);
            return this;
        }

        /**
         * Set up itemCount.
         * 
         * @param itemCount
         *            BigInteger
         * @return Non-null Builder used to continue building the object
         */
        public Builder withItemCount(int itemCount) {
            this.itemCount = BigInteger.valueOf(itemCount);
            return this;
        }

        /**
         * Set up invoiceTotal.
         * 
         * @param invoiceTotal
         *            BigDecimal
         * @return Non-null Builder used to continue building the object
         */
        public Builder withInvoiceTotal(double invoiceTotal) {
            this.invoiceTotal = BigDecimal.valueOf(invoiceTotal);
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
         * Completes the building of the SalesInvoiceType
         * 
         * @return an instance of {@link SalesInvoiceType}
         */
        public SalesInvoiceType build() {
            SalesInvoiceTypeBuilder obj = new SalesInvoiceTypeBuilder(this);
            return obj.subject;
        }
    }
}
