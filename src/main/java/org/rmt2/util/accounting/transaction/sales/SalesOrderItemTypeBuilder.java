package org.rmt2.util.accounting.transaction.sales;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.rmt2.jaxb.InventoryItemType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.SalesOrderItemType;

import com.api.util.assistants.Verifier;

/**
 * SalesOrderItemType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class SalesOrderItemTypeBuilder {

    private SalesOrderItemType subject;

    /**
     * Create a SalesOrderItemTypeBuilder
     */
    private SalesOrderItemTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createSalesOrderItemType();
        subject.setSalesOrderItemId(builder.salesOrderItemId);
        subject.setSalesOrderId(builder.salesOrderId);
        subject.setItem(builder.item);
        subject.setItemNameOverride(builder.itemNameOverride);
        subject.setBackOrderQty(builder.backOrderQty);
        subject.setMarkup(builder.markup);
        subject.setUnitCost(builder.unitCost);
        subject.setOrderQty(builder.orderQty);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link SalesOrderItemType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger salesOrderItemId;
        private BigInteger salesOrderId;
        private InventoryItemType item;
        private String itemNameOverride;
        private BigDecimal backOrderQty;
        private BigDecimal markup;
        private BigDecimal unitCost;
        private BigInteger orderQty;
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
         * Set up salesOrderItemId.
         * 
         * @param salesOrderItemId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSalesOrderItemId(int salesOrderItemId) {
            this.salesOrderItemId = BigInteger.valueOf(salesOrderItemId);
            return this;
        }

        /**
         * Set up salesOrderId.
         * 
         * @param salesOrderId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSalesOrderId(int salesOrderId) {
            this.salesOrderId = BigInteger.valueOf(salesOrderId);
            return this;
        }

        /**
         * Set up orderQty.
         * 
         * @param orderQty
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withOrderQty(int orderQty) {
            this.orderQty = BigInteger.valueOf(orderQty);
            return this;
        }

        /**
         * Set up inventory item.
         * 
         * @param item
         *            InventoryItemType
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSalesOrderType(InventoryItemType item) {
            this.item = item;
            return this;
        }

        /**
         * Set up backOrderQty.
         * 
         * @param backOrderQty
         *            BigDecimal
         * @return Non-null Builder used to continue building the object
         */
        public Builder withBackOrderQty(double backOrderQty) {
            this.backOrderQty = BigDecimal.valueOf(backOrderQty);
            return this;
        }

        /**
         * Set up unitCost.
         * 
         * @param unitCost
         *            BigDecimal
         * @return Non-null Builder used to continue building the object
         */
        public Builder withUnitCost(double unitCost) {
            this.unitCost = BigDecimal.valueOf(unitCost);
            return this;
        }

        /**
         * Set up markup.
         * 
         * @param markup
         *            BigDecimal
         * @return Non-null Builder used to continue building the object
         */
        public Builder withMarkup(double markup) {
            this.markup = BigDecimal.valueOf(markup);
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
         * Completes the building of the SalesOrderItemType
         * 
         * @return an instance of {@link SalesOrderItemType}
         */
        public SalesOrderItemType build() {
            SalesOrderItemTypeBuilder obj = new SalesOrderItemTypeBuilder(this);
            return obj.subject;
        }
    }
}
