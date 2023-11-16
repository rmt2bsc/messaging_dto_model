package org.rmt2.util.accounting.subsidiary;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.rmt2.jaxb.BusinessType;
import org.rmt2.jaxb.CreditorActivityType;
import org.rmt2.jaxb.CreditorType;
import org.rmt2.jaxb.CreditortypeType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.assistants.Verifier;

/**
 * CreditorType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class CreditorTypeBuilder {

    private CreditorType subject;
    
    /**
     * Create a CreditorTypeBuilder
     */
    private CreditorTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createCreditorType();
        subject.setCreditorId(builder.creditorId);
        subject.setAcctId(builder.acctId);
        subject.setContactDetails(builder.businessContactDetails);
        subject.setCreditorType(builder.creditorType);
        subject.setAccountNo(builder.accountNo);
        subject.setCreditLimit(builder.creditLimit);
        subject.setExtAccountNo(builder.extAccountNo);
        subject.setBalance(builder.balance);
        subject.setActive(builder.active);
        subject.setApr(builder.apr);
        
        // Always create a transactions node.
        subject.setTransactions(f.createCreditorActivityListType());
        if (builder.transactions != null) {
            subject.getTransactions().getTransaction().addAll(builder.transactions);    
        }
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link CreditorType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger creditorId;
        private BigInteger acctId;
        private BusinessType businessContactDetails;
        private CreditortypeType creditorType;
        private String accountNo;
        private String extAccountNo;
        private BigDecimal apr;
        private BigDecimal creditLimit;
        private BigDecimal balance;
        private BigInteger active;
        private List<CreditorActivityType> transactions;
        private RecordTrackingType tracking;

        private Builder() {
            this.creditorId = null;
            this.acctId = null;
            this.businessContactDetails = null;
            this.creditorType = null;
            this.accountNo = null;
            this.extAccountNo = null;
            this.apr = null;
            this.creditLimit = null;
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
         * Set up creditor id.
         * 
         * @param creditorId
         *            an int value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCreditorId(int creditorId) {
            this.creditorId = BigInteger.valueOf(creditorId);
            return this;
        }

        /**
         * Set up acct id.
         * 
         * @param acctId
         *            an int value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAcctId(int acctId) {
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
         * Set up Creditor Type.
         * 
         * @param creditorType
         *            an instance of CreditortypeType
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCreditorytypeType(CreditortypeType creditorType) {
            this.creditorType = creditorType;
            return this;
        }
        
        /**
         * Set up account number.
         * 
         * @param accountNo
         *            an String value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAccountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }
        
        /**
         * Set up external account number.
         * 
         * @param extAccountNo
         *            an String value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withExtAccountNo(String extAccountNo) {
            this.extAccountNo = extAccountNo;
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
         * Set up balance.
         * 
         * @param balance
         *            an Double value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withBalance(Double balance) {
            this.balance = (balance == null ? BigDecimal.ZERO : BigDecimal.valueOf(balance));
            return this;
        }

        /**
         * Set up annual percentage rate.
         * 
         * @param apr
         *            an double value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withApr(double apr) {
            this.apr = BigDecimal.valueOf(apr);
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
         *            List<CreditorActivityType>
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTransactions(List<CreditorActivityType> transactions) {
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
         * Completes the building of the CreditorType
         * 
         * @return an instance of {@link CreditorType}
         */
        public CreditorType build() {
            CreditorTypeBuilder obj = new CreditorTypeBuilder(this);
            return obj.subject;
        }
    }
}
