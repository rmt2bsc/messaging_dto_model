package org.rmt2.util.accounting.inventory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.rmt2.jaxb.CreditorType;
import org.rmt2.jaxb.InventoryItemType;
import org.rmt2.jaxb.InventoryItemtypeType;
import org.rmt2.jaxb.InventoryStatusHistoryType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.assistants.Verifier;

/**
 * InventoryItemType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class InventoryItemTypeBuilder {

    private InventoryItemType subject;
    
    /**
     * Create a InventoryItemType
     */
    private InventoryItemTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createInventoryItemType();
        subject.setActive(builder.active);
        subject.setDescription(builder.description);
        subject.setCreditor(builder.creditor);
        subject.setItemId(builder.itemId);
        subject.setItemSerialNo(builder.itemSerialNo);
        subject.setItemType(builder.itemType);
        subject.setMarkup(builder.markup);
        subject.setOverrideRetail(builder.overrideRetail);
        subject.setQtyOnHand(builder.qtyOnHand);
        subject.setRetailPrice(builder.retailPrice);
        subject.setTracking(builder.tracking);
        subject.setUnitCost(builder.unitCost);
        subject.setVendorItemNo(builder.vendorItemNo);
    }

    /**
     * Builder for {@link InventoryItemType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger itemId;
        private InventoryItemtypeType itemType;
        private CreditorType creditor;
        private String description;
        private String vendorItemNo;
        private String itemSerialNo;
        private BigInteger qtyOnHand;
        private BigDecimal unitCost;
        private BigDecimal markup;
        private BigDecimal retailPrice;
        private BigInteger overrideRetail;
        private BigInteger active;
        private List<InventoryStatusHistoryType> statusHistory;
        private RecordTrackingType tracking;

        private Builder() {
            this.itemId = null;
            this.itemType = null;
            this.creditor = null;
            this.description = null;
            this.vendorItemNo = null;
            this.itemSerialNo = null;
            this.qtyOnHand = null;
            this.unitCost = null;
            this.markup = null;
            this.retailPrice = null;
            this.overrideRetail = null;
            this.active = null;
            this.statusHistory = null;
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
         * Set up item id.
         * 
         * @param itemId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withItemId(int itemId) {
            Verifier.verifyNotNegative(itemId, "Inventory item id must not be a negative value");
            this.itemId = BigInteger.valueOf(itemId);
            return this;
        }

        /**
         * Set up item type id.
         * 
         * @param itemTypeId
         *            an int value that must be greater than zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withItemTypeId(int itemTypeId) {
            Verifier.verifyPositive(itemTypeId, "Inventory item type id must be greater than zero");
            ObjectFactory f = new ObjectFactory();
            InventoryItemtypeType o = f.createInventoryItemtypeType();
            o.setItemTypeId(BigInteger.valueOf(itemTypeId));
            this.itemType = o;
            return this;
        }

        
        /**
         * Set up item creditor id.
         * 
         * @param creditorId
         *            an int value that must be greater than zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCreditorId(int creditorId) {
            Verifier.verifyPositive(creditorId, "Inventory creditor id must be greater than zero");
            ObjectFactory f = new ObjectFactory();
            CreditorType o = f.createCreditorType();
            o.setCreditorId(BigInteger.valueOf(creditorId));
            this.creditor = o;
            return this;
        }
        
        /**
         * Set up item name.
         * 
         * @param itemName
         *            the item's name or description. Cannot be null.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withItemName(String itemName) {
            Verifier.verifyNotNull(itemName, "Inventory item name can not be a null");
            this.description = itemName;
            return this;
        }
        
        /**
         * Set up vendor item number.
         * 
         * @param vendorItemNo
         *            the item's vendor item number. Cannot be null.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withVendorItemNo(String vendorItemNo) {
            Verifier.verifyNotNull(vendorItemNo, "Inventory vendor item number can not be a null");
            this.vendorItemNo = vendorItemNo;
            return this;
        }
        
        /**
         * Set up item serial number.
         * 
         * @param itemSerialNo
         *            the item's serial number. Cannot be null.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withItemSerialNo(String itemSerialNo) {
            Verifier.verifyNotNull(itemSerialNo, "Inventory item serial number can not be a null");
            this.itemSerialNo = itemSerialNo;
            return this;
        }
        
        /**
         * Set up item quantity on hand
         * 
         * @param qtyOnHand
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withQtyOnHand(int qtyOnHand) {
            Verifier.verifyNotNegative(qtyOnHand, "Inventory item quantity on hand must not be a negative value");
            this.qtyOnHand = BigInteger.valueOf(qtyOnHand);
            return this;
        }
        
        /**
         * Set up item override retail indicator
         * 
         * @param overrideRetail
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withOverrideRetail(int overrideRetail) {
            Verifier.verifyNotNegative(overrideRetail, "Inventory item override reatil indicator must not be a negative value");
            this.overrideRetail = BigInteger.valueOf(overrideRetail);
            return this;
        }
        
        /**
         * Set up item active indicator
         * 
         * @param active
         *            boolean set to 1 when true, and 0 when false.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withActive(boolean active) {
            this.active = (active ? BigInteger.ONE : BigInteger.ZERO);
            return this;
        }
        
        /**
         * Set up item override retail indicator
         * 
         * @param unitCost
         *            the item's unit cost.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withUnitCost(double unitCost) {
            this.unitCost = BigDecimal.valueOf(unitCost);
            return this;
        }
        
        /**
         * Set up item mark up
         * 
         * @param markup
         *            the item's mark up.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withMarkup(double markup) {
            this.markup = BigDecimal.valueOf(markup);
            return this;
        }
        
        /**
         * Set up item retail price
         * 
         * @param retailPrice
         *            the item's mark up.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRetailPrice(double retailPrice) {
            this.retailPrice = BigDecimal.valueOf(retailPrice);
            return this;
        }
        
        /**
         * Add item status history.
         * 
         * @param statusHist
         *            an instance of {@link InventoryStatusHistoryType} value that must not
         *            be null
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withStatusHistory(InventoryStatusHistoryType  statusHist) {
            Verifier.verifyNotNull(statusHist, "Inventory status history objec cannot be null");
            if (this.statusHistory == null) {
                this.statusHistory = new ArrayList<InventoryStatusHistoryType>();
            }
            this.statusHistory.add(statusHist);
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
            Verifier.verifyNotNull(tracking, "Inventory record tracking object cannot be null");
            this.tracking = tracking;
            return this;
        }

        /**
         * Completes the building of the InventoryItemType
         * 
         * @return an instance of {@link InventoryItemType}
         */
        public InventoryItemType build() {
            InventoryItemTypeBuilder obj = new InventoryItemTypeBuilder(this);
            return obj.subject;
        }
    }

}
