package org.rmt2.util.accounting.transaction;

import java.math.BigInteger;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.XacttypeType;

/**
 * XacttypeType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class XacttypeTypeBuilder {

    private XacttypeType subject;
    
    /**
     * Create a XacttypeTypeBuilder
     */
    private XacttypeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createXacttypeType();
        subject.setXactTypeId(builder.xactTypeId);
        subject.setCode(builder.code);
        subject.setDescription(builder.description);
        subject.setToMultiplier(builder.toMultiplier);
        subject.setToAcctTypeId(builder.toAcctTypeId);
        subject.setFromMultiplier(builder.fromMultiplier);
        subject.setHasSubsidiary(builder.hasSubsidiary);
        subject.setFromAcctTypeId(builder.fromAcctTypeId);
        subject.setToAcctCatgId(builder.toAcctCatgId);
        subject.setXactCatgId(builder.xactCatgId);
        subject.setFromAcctCatgId(builder.fromAcctCatgId);
    }

    /**
     * Builder for {@link XacttypeType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger xactTypeId;
        private String code;
        private String description;
        private BigInteger toMultiplier;
        private BigInteger toAcctTypeId;
        private BigInteger fromMultiplier;
        private BigInteger hasSubsidiary;
        private BigInteger fromAcctTypeId;
        private BigInteger toAcctCatgId;
        private BigInteger xactCatgId;
        private BigInteger fromAcctCatgId;

        private Builder() {
            this.xactTypeId = null;
            this.code = null;
            this.description = null;
            this.toMultiplier = null;
            this.toAcctTypeId = null;
            this.fromMultiplier = null;
            this.hasSubsidiary = null;
            this.fromAcctTypeId = null;
            this.toAcctCatgId = null;
            this.xactCatgId = null;
            this.fromAcctCatgId = null;
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
         * Set up transaction type id.
         * 
         * @param xactTypeId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactTypeId(int xactTypeId) {
            this.xactTypeId = BigInteger.valueOf(xactTypeId);
            return this;
        }

        /**
         * Set up To Multiplier.
         * 
         * @param acctId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withToMultiplier(int toMultiplier) {
            this.toMultiplier = BigInteger.valueOf(toMultiplier);
            return this;
        }
        
        /**
         * Set up To AcctTypeId.
         * 
         * @param toAcctTypeId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withtoAcctTypeId(int toAcctTypeId) {
            this.toAcctTypeId = BigInteger.valueOf(toAcctTypeId);
            return this;
        }
        
        /**
         * Set up From Multiplier.
         * 
         * @param fromMultiplier
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withCreditorytypeType(int fromMultiplier) {
            this.fromMultiplier = BigInteger.valueOf(fromMultiplier);
            return this;
        }
        
        /**
         * Set up transaction code.
         * 
         * @param code
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withCode(String code) {
            this.code = code;
            return this;
        }
        
        /**
         * Set up description.
         * 
         * @param description
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }
        
        /**
         * Set up Credit limit.
         * 
         * @param creditLimit
         *            an double value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withHasSubsidiary(boolean hasSubsidiary) {
            this.hasSubsidiary = (hasSubsidiary ? BigInteger.valueOf(1) : BigInteger.valueOf(0));
            return this;
        }

        /**
         * Set up fromAcctTypeId.
         * 
         * @param fromAcctTypeId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withFromAcctTypeId(int fromAcctTypeId) {
            this.fromAcctTypeId = BigInteger.valueOf(fromAcctTypeId);
            return this;
        }

        /**
         * Set up To AcctCatgId.
         * 
         * @param toAcctCatgId
         *            an double value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withToAcctCatgId(int toAcctCatgId) {
            this.toAcctCatgId = BigInteger.valueOf(toAcctCatgId);
            return this;
        }
        
        /**
         * Set up transaction Catg Id.
         * 
         * @param xactCatgId
         *            int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactCatgId(int xactCatgId) {
            this.xactCatgId = BigInteger.valueOf(xactCatgId);
            return this;
        }

        /**
         * Set up From AcctCatgId.
         * 
         * @param fromAcctCatgId
         *            int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withFromAcctCatgId(int fromAcctCatgId) {
            this.fromAcctCatgId = BigInteger.valueOf(fromAcctCatgId);
            return this;
        }


        /**
         * Completes the building of the XacttypeType
         * 
         * @return an instance of {@link XacttypeType}
         */
        public XacttypeType build() {
            XacttypeTypeBuilder obj = new XacttypeTypeBuilder(this);
            return obj.subject;
        }
    }
}
