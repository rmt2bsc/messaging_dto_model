package org.rmt2.util.accounting.transaction.sales;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.rmt2.jaxb.CustomerPaymentConfirmation.CustomerData;
import org.rmt2.jaxb.ObjectFactory;

/**
 * CustomerData Builder.
 * 
 * @author Roy Terrell
 *
 */
public class PayConfirmCustomerBuilder {

    private CustomerData subject;

    /**
     * Create a PayConfirmCustomerBuilder
     */
    private PayConfirmCustomerBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createCustomerPaymentConfirmationCustomerData();
        subject.setAccountNo(builder.accountNo);
        subject.setCustomerId(builder.customerId);
        subject.setBalance(builder.balance);
        subject.setBusinessId(builder.businessId);
        subject.setContactEmail(builder.contactEmail);

    }

    /**
     * Builder for {@link CustomerData}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private String accountNo;
        private BigInteger customerId;
        private BigDecimal balance;
        private BigInteger businessId;
        private String contactEmail;
        private BigInteger glAccountId;

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
         * Set up businessId.
         * 
         * @param businessId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withBusinessId(int businessId) {
            this.businessId = BigInteger.valueOf(businessId);
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
         * Set up glAccountId.
         * 
         * @param glAccountId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withGlAccountId(int glAccountId) {
            this.glAccountId = BigInteger.valueOf(glAccountId);
            return this;
        }

        /**
         * Set up accountNo
         * 
         * @param accountNo
         * @return
         */
        public Builder withAccoutNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }

        /**
         * Set up contactEmail.
         * 
         * @param contactEmail
         * @return Non-null Builder used to continue building the object
         */
        public Builder withContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }


        /**
         * Set up balance.
         * 
         * @param balance
         *            Customer's balance
         * @return Non-null Builder used to continue building the object
         */
        public Builder withBalance(double balance) {
            this.balance = BigDecimal.valueOf(balance);
            return this;
        }

        /**
         * Completes the building of the CustomerData
         * 
         * @return an instance of {@link CustomerData}
         */
        public CustomerData build() {
            PayConfirmCustomerBuilder obj = new PayConfirmCustomerBuilder(this);
            return obj.subject;
        }
    }
}
