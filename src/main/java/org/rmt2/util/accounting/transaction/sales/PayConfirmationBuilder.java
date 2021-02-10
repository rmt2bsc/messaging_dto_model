package org.rmt2.util.accounting.transaction.sales;

import org.rmt2.jaxb.CustomerPaymentConfirmation;
import org.rmt2.jaxb.CustomerPaymentConfirmation.CustomerData;
import org.rmt2.jaxb.CustomerPaymentConfirmation.SalesOrderData;
import org.rmt2.jaxb.CustomerPaymentConfirmation.XactData;
import org.rmt2.jaxb.ObjectFactory;

/**
 * CustomerPaymentConfirmation Builder.
 * 
 * @author Roy Terrell
 *
 */
public class PayConfirmationBuilder {

    private CustomerPaymentConfirmation subject;

    /**
     * Create a PayConfirmXactBuilder
     */
    private PayConfirmationBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createCustomerPaymentConfirmation();
        subject.setAppRoot(builder.appRoot);
        subject.setPageTitle(builder.pageTitle);
        subject.setCustomerData(builder.customer);
        subject.setSalesOrderData(builder.salesOrder);
        subject.setXactData(builder.xact);
    }

    /**
     * Builder for {@link CustomerPaymentConfirmation}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private String appRoot;
        private String pageTitle;
        private CustomerData customer;
        private SalesOrderData salesOrder;
        private XactData xact;


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
         * Set up appRoot.
         * 
         * @param appRoot
         * @return Non-null Builder used to continue building the object
         */
        public Builder withAppRoot(String appRoot) {
            this.appRoot = appRoot;
            return this;
        }

        /**
         * Set up pageTitle.
         * 
         * @param pageTitle
         * @return Non-null Builder used to continue building the object
         */
        public Builder withPageTitle(String pageTitle) {
            this.pageTitle = pageTitle;
            return this;
        }

        /**
         * Set up customer.
         * 
         * @param customer
         * @return Non-null Builder used to continue building the object
         */
        public Builder withCustomer(CustomerData customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Set up salesOrder
         * 
         * @param salesOrder
         * @return
         */
        public Builder withSalesOrder(SalesOrderData salesOrder) {
            this.salesOrder = salesOrder;
            return this;
        }

        /**
         * Set up xact.
         * 
         * @param xact
         *            Transaction
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXact(XactData xact) {
            this.xact = xact;
            return this;
        }

        /**
         * Completes the building of the CustomerPaymentConfirmation
         * 
         * @return an instance of {@link CustomerPaymentConfirmation}
         */
        public CustomerPaymentConfirmation build() {
            PayConfirmationBuilder obj = new PayConfirmationBuilder(this);
            return obj.subject;
        }
    }
}
