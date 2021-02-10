package org.rmt2.util.accounting.transaction.sales;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.rmt2.jaxb.CustomerPaymentConfirmation.SalesOrderData;
import org.rmt2.jaxb.ObjectFactory;

/**
 * SalesOrderData Builder.
 * 
 * @author Roy Terrell
 *
 */
public class PayConfirmSalesOrderBuilder {

    private SalesOrderData subject;

    /**
     * Create a PayConfirmCustomerBuilder
     */
    private PayConfirmSalesOrderBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createCustomerPaymentConfirmationSalesOrderData();
        subject.setSoId(builder.saleOrderId);
        subject.setEffectiveDate(builder.effectiveDate);
        subject.setCustomerId(builder.customerId);
        subject.setOrderTotal(builder.orderTotal);
        subject.setInvoiced(builder.invoiced);
    }

    /**
     * Builder for {@link SalesOrderData}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int saleOrderId;
        private BigInteger customerId;
        private BigDecimal orderTotal;
        private BigInteger invoiced;
        private String effectiveDate;


        private Builder() {
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
         * Set up saleOrderId.
         * 
         * @param saleOrderId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withBusinessId(int saleOrderId) {
            this.saleOrderId = saleOrderId;
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
         * Set up invoiced.
         * 
         * @param invoiced
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withInvoiced(int invoiced) {
            this.invoiced = BigInteger.valueOf(invoiced);
            return this;
        }

        /**
         * Set up accountNo
         * 
         * @param accountNo
         * @return
         */
        public Builder withEffectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * Set up orderTotal.
         * 
         * @param orderTotal
         *            Customer's sales order total
         * @return Non-null Builder used to continue building the object
         */
        public Builder withOrderTotal(double orderTotal) {
            this.orderTotal = BigDecimal.valueOf(orderTotal);
            return this;
        }

        /**
         * Completes the building of the SalesOrderData
         * 
         * @return an instance of {@link SalesOrderData}
         */
        public SalesOrderData build() {
            PayConfirmSalesOrderBuilder obj = new PayConfirmSalesOrderBuilder(this);
            return obj.subject;
        }
    }
}
