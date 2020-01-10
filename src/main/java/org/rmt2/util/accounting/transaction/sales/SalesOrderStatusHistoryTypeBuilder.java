package org.rmt2.util.accounting.transaction.sales;

import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.SalesOrderStatusHistoryType;
import org.rmt2.jaxb.SalesOrderStatusType;
import org.rmt2.jaxb.SalesOrderType;

import com.api.util.RMT2Date;
import com.api.util.assistants.Verifier;

/**
 * SalesOrderStatusHistoryType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class SalesOrderStatusHistoryTypeBuilder {

    private SalesOrderStatusHistoryType subject;

    /**
     * Create a SalesOrderTypeBuilder
     */
    private SalesOrderStatusHistoryTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createSalesOrderStatusHistoryType();
        subject.setStatusHistId(builder.statusHistId);
        subject.setSalesOrder(builder.salesOrder);
        subject.setStatus(builder.status);
        subject.setEffectiveDate(builder.effectiveDate);
        subject.setEndDate(builder.endDate);
        subject.setReason(builder.reason);
        subject.setActive(builder.active);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link SalesOrderStatusHistoryType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger statusHistId;
        private SalesOrderType salesOrder;
        private SalesOrderStatusType status;
        private XMLGregorianCalendar effectiveDate;
        private XMLGregorianCalendar endDate;
        protected String reason;
        protected BigInteger active;
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
         * Set up statusHistId.
         * 
         * @param statusHistId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withStatusHistId(int statusHistId) {
            this.statusHistId = BigInteger.valueOf(statusHistId);
            return this;
        }

        /**
         * Set up salesOrder.
         * 
         * @param salesOrder
         *            Sales Order Type
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSalesOrderType(SalesOrderType salesOrder) {
            this.salesOrder = salesOrder;
            return this;
        }

        /**
         * Set up status.
         * 
         * @param status
         *            Sales Order Status Type
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSalesOrderStatusType(SalesOrderStatusType status) {
            this.status = status;
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
         * Set up endDate.
         * 
         * @param endDate
         *            End Date
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEndDate(Date endDate) {
            this.endDate = RMT2Date.toXmlDate(endDate);
            return this;
        }

        /**
         * Set up reason.
         * 
         * @param reason
         *            String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSalesOrderStatusHistoryItem(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Set up active.
         * 
         * @param this.active = BigInteger.ONE; boolean
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSalesOrderItem(boolean isActive) {
            if (isActive) {
                this.active = BigInteger.ONE;
            }
            else {
                this.active = BigInteger.ZERO;
            }
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
         * Completes the building of the SalesOrderStatusHistoryType
         * 
         * @return an instance of {@link SalesOrderStatusHistoryType}
         */
        public SalesOrderStatusHistoryType build() {
            SalesOrderStatusHistoryTypeBuilder obj = new SalesOrderStatusHistoryTypeBuilder(this);
            return obj.subject;
        }
    }
}
