package org.rmt2.util.accounting.subsidiary;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.rmt2.jaxb.BusinessType;
import org.rmt2.jaxb.CustomerActivityType;
import org.rmt2.jaxb.CustomerType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.PersonType;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.assistants.Verifier;

/**
 * CustomerType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class CustomerTypeBuilder {

    private CustomerType subject;
    
    /**
     * Create a PersonTypeBuilder
     */
    private CustomerTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createCustomerType();
        subject.setCustomerId(builder.customerId);
        subject.setAcctId(builder.acctId);
        subject.setBusinessContactDetails(builder.businessContactDetails);
        subject.setPersonContactDetails(builder.personContactDetails);
        subject.setAccountNo(builder.accountNo);
        subject.setCreditLimit(builder.creditLimit);
        subject.setAcctDescription(builder.acctDescription);
        subject.setBalance(builder.balance);
        subject.setActive(builder.active);
        if (builder.transactions != null) {
            subject.getTransactions().addAll(builder.transactions);    
        }
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link CustomerType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger customerId;
        private BigInteger acctId;
        private BusinessType businessContactDetails;
        private PersonType personContactDetails;
        private String accountNo;
        private BigDecimal creditLimit;
        private String acctDescription;
        private BigDecimal balance;
        private BigInteger active;
        private List<CustomerActivityType> transactions;
        private RecordTrackingType tracking;

        private Builder() {
            this.customerId = null;
            this.acctId = null;
            this.businessContactDetails = null;
            this.personContactDetails = null;
            this.accountNo = null;
            this.creditLimit = null;
            this.acctDescription = null;
            this.balance = null;
            this.active = null;
            this.transactions = null;
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
         * Set up customer id.
         * 
         * @param customerId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCustomerId(int customerId) {
            Verifier.verifyNotNegative(customerId, "Customer id must not be a negative value");
            this.customerId = BigInteger.valueOf(customerId);
            return this;
        }

        /**
         * Set up acct id.
         * 
         * @param acctId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAcctId(int acctId) {
            Verifier.verifyNotNegative(acctId, "Acct id must not be a negative value");
            this.acctId = BigInteger.valueOf(acctId);
            return this;
        }
        
        /**
         * Set up BusinessType.
         * 
         * @param businessContactDetails
         *            an instance of BusinessType
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withBusinessType(BusinessType businessContactDetails) {
            this.businessContactDetails = businessContactDetails;
            return this;
        }
        
        /**
         * Set up PersonType.
         * 
         * @param personContactDetails
         *            an instance of PersonType
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withPersonType(PersonType personContactDetails) {
            this.personContactDetails = personContactDetails;
            return this;
        }
        
        /**
         * Set up account number.
         * 
         * @param accountNo
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAccountNo(String accountNo) {
            Verifier.verifyNotBlank(accountNo, "AccountNo cannot be blank");
            this.accountNo = accountNo;
            return this;
        }
        
        /**
         * Set up Credit limit.
         * 
         * @param creditLimit
         *            an double value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCreditLimit(double creditLimit) {
            this.creditLimit = BigDecimal.valueOf(creditLimit);
            return this;
        }

        /**
         * Set up Account description.
         * 
         * @param acctDescription
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAcctDescription(String acctDescription) {
            Verifier.verifyNotBlank(acctDescription, "Account description cannot be blank");
            this.acctDescription = acctDescription;
            return this;
        }

        /**
         * Set up balance.
         * 
         * @param balance
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withBalance(double balance) {
            this.balance = BigDecimal.valueOf(balance);
            return this;
        }


        /**
         * Set up active flag.
         * 
         * @param active
         *            int value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withActive(int active) {
            Verifier.verifyTrue(active >= 0 && active <= 1, "Active flag must be 0 or 1");
            this.active = BigInteger.valueOf(active);
            return this;
        }

        /**
         * Set up transactions.
         * 
         * @param transactions
         *            List<CustomerActivityType>
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTransactions(List<CustomerActivityType> transactions) {
            Verifier.verifyNotNull(transactions, "Transactions cannot be blank");
            this.transactions = transactions;
            return this;
        }

        /**
         * Set up Record Tracking Info.
         * 
         * @param tracking
         *            an instance of {@link RecordTrackingType} value that must not be
         *            blank
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
         * Completes the building of the CustomerType
         * 
         * @return an instance of {@link CustomerType}
         */
        public CustomerType build() {
            CustomerTypeBuilder obj = new CustomerTypeBuilder(this);
            return obj.subject;
        }
    }
}
