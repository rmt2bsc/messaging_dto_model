package org.rmt2.util.accounting.generalledger;

import java.math.BigInteger;

import org.rmt2.jaxb.GlAccountType;
import org.rmt2.jaxb.GlAccountcatgType;
import org.rmt2.jaxb.GlAccounttypeType;
import org.rmt2.jaxb.GlBalancetypeType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.assistants.Verifier;

/**
 * GlAccountType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class GlAccountTypeBuilder {

    private GlAccountType subject;
    
    /**
     * Create a GlAccountType
     */
    private GlAccountTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createGlAccountType();
        subject.setAcctId(builder.acctId);
        subject.setAcctType(builder.acctType);
        subject.setAcctCatg(builder.acctCatg);
        subject.setAcctSeq(builder.acctSeq);
        subject.setAccountNo(builder.accountNo);
        subject.setAccountName(builder.accountName);
        subject.setAccountCode(builder.accountCode);
        subject.setAccountDescription(builder.accountDescription);
        subject.setBalanceType(builder.balanceType);
        subject.setActive(builder.active);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link GlAccountType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger acctId;
        private GlAccounttypeType acctType;
        private GlAccountcatgType acctCatg;
        private BigInteger acctSeq;
        private String accountNo;
        private String accountName;
        private String accountCode;
        private String accountDescription;
        private GlBalancetypeType balanceType;
        private BigInteger active;
        private RecordTrackingType tracking;

        private Builder() {
            this.acctId = null;
            this.acctType = null;
            this.acctCatg = null;
            this.acctSeq = null;
            this.accountNo = null;
            this.accountName = null;
            this.accountCode = null;
            this.accountDescription = null;
            this.balanceType = null;
            this.active = null;
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
         * Set up account id.
         * 
         * @param acctId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAcctId(int acctId) {
            this.acctId = BigInteger.valueOf(acctId);
            return this;
        }


        /**
         * Set up account type long name.
         * 
         * @param acctType
         *            an instance of {@link GlAccounttypeType} value that must not be null
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAccountType(GlAccounttypeType acctType) {
            this.acctType = acctType;
            return this;
        }

        /**
         * Set up account category.
         * 
         * @param acctCatg
         *            an instance of {@link GlAccountcatgType} value that must not be null
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAccountCategory(GlAccountcatgType acctCatg) {
            this.acctCatg = acctCatg;
            return this;
        }

        /**
         * Set up balance type.
         * 
         * @param balType
         *            an instance of {@link GlBalancetypeType} value that must not be null
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withBalanceType(GlBalancetypeType balType) {
            this.balanceType = balType;
            return this;
        }

        /**
         * Set up account sequence number.
         * 
         * @param acctSeq
         *            an int value that must be positive
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAcctSeq(int acctSeq) {
            this.acctSeq = BigInteger.valueOf(acctSeq);
            return this;
        }

        /**
         * Set up account number.
         * 
         * @param accountNo
         *            an String value that must not be empty
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAccountNumber(String accountNo) {
            Verifier.verifyNotEmpty(accountNo, "Account number cannot be empty");
            this.accountNo = accountNo;
            return this;
        }
        
        /**
         * Set up account name.
         * 
         * @param accountName
         *            an String value that must not be empty
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAccountName(String accountName) {
            Verifier.verifyNotEmpty(accountName, "Account name cannot be empty");
            this.accountName = accountName;
            return this;
        }

        /**
         * Set up account code.
         * 
         * @param accountCode
         *            an String value that must not be empty
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAccountCode(String accountCode) {
            this.accountCode = accountCode;
            return this;
        }
        
        /**
         * Set up account description.
         * 
         * @param accountDescription
         *            an String value that must not be empty
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        
        /**
         * Set up account active indicator.
         * 
         * @param activeInd
         *            an int value that must be 1 or 0
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withActive(int activeInd) {
            this.active = BigInteger.valueOf(activeInd);
            return this;
        }
        
 
        /**
         * Set up record tracking details.
         * 
         * @param tracking
         *            an instance of {@link RecordTrackingType} value that must not
         *            be null
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRecordTrackingType(RecordTrackingType tracking) {
            this.tracking = tracking;
            return this;
        }

        /**
         * Completes the building of the GlAccountType
         * 
         * @return an instance of {@link GlAccountType}
         */
        public GlAccountType build() {
            GlAccountTypeBuilder obj = new GlAccountTypeBuilder(this);
            return obj.subject;
        }
    }

}
