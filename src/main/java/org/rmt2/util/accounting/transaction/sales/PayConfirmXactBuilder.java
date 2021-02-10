package org.rmt2.util.accounting.transaction.sales;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.rmt2.jaxb.CustomerPaymentConfirmation.XactData;
import org.rmt2.jaxb.ObjectFactory;

/**
 * XactData Builder.
 * 
 * @author Roy Terrell
 *
 */
public class PayConfirmXactBuilder {

    private XactData subject;

    /**
     * Create a PayConfirmXactBuilder
     */
    private PayConfirmXactBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createCustomerPaymentConfirmationXactData();
        subject.setXactId(builder.xactId);
        subject.setXactDate(builder.xactDate);
        subject.setXactTypeId(builder.xactTypeId);
        subject.setXactAmount(builder.xactAmount);
        subject.setTenderId(builder.tender);
        subject.setReason(builder.reason);
        subject.setConfirmNo(builder.confirmNo);
    }

    /**
     * Builder for {@link XactData}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger xactId;
        private BigInteger xactTypeId;
        private BigDecimal xactAmount;
        private String tender;
        private String xactDate;
        private String reason;
        private String confirmNo;


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
         * Set up xactId.
         * 
         * @param xactId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactId(int xactId) {
            this.xactId = BigInteger.valueOf(xactId);
            return this;
        }

        /**
         * Set up xactTypeId.
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
         * Set up tender.
         * 
         * @param tender
         * @return Non-null Builder used to continue building the object
         */
        public Builder withTender(String tender) {
            this.tender = tender;
            return this;
        }

        /**
         * Set up xactDate
         * 
         * @param xactDate
         * @return
         */
        public Builder withXactDate(String xactDate) {
            this.xactDate = xactDate;
            return this;
        }

        /**
         * Set up xact reason
         * 
         * @param reason
         * @return
         */
        public Builder withXactReason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Set up xact confirmNo
         * 
         * @param confirmNo
         * @return
         */
        public Builder withConfirmNo(String confirmNo) {
            this.confirmNo = confirmNo;
            return this;
        }

        /**
         * Set up xactAmount.
         * 
         * @param xactAmount
         *            Transaction amount
         * @return Non-null Builder used to continue building the object
         */
        public Builder withOrderTotal(double xactAmount) {
            this.xactAmount = BigDecimal.valueOf(xactAmount);
            return this;
        }

        /**
         * Completes the building of the XactData
         * 
         * @return an instance of {@link XactData}
         */
        public XactData build() {
            PayConfirmXactBuilder obj = new PayConfirmXactBuilder(this);
            return obj.subject;
        }
    }
}
