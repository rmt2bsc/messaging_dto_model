package org.rmt2.util.accounting.inventory;

import java.math.BigInteger;

import org.rmt2.jaxb.InventoryItemtypeType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.assistants.Verifier;

/**
 * InventoryItemStatusType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class InventoryItemtypeTypeBuilder {

    private InventoryItemtypeType subject;
    
    /**
     * Create a InventoryItemtypeType
     */
    private InventoryItemtypeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createInventoryItemtypeType();
        subject.setItemTypeId(builder.itemTypeId);
        subject.setDescription(builder.description);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link InventoryItemtypeType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger itemTypeId;
        private String description;
        private RecordTrackingType tracking;

        private Builder() {
            this.itemTypeId = null;
            this.description = null;
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
         * Set up item type id.
         * 
         * @param itemTypeId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withItemTypeId(int itemTypeId) {
            Verifier.verifyNotNegative(itemTypeId, "Inventory item type id must not be a negative value");
            this.itemTypeId = BigInteger.valueOf(itemTypeId);
            return this;
        }

        
        /**
         * Set up vendor item number.
         * 
         * @param description
         *            the description for the item's status.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withDescription(String description) {
            this.description = description;
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
         * Completes the building of the InventoryItemtypeType
         * 
         * @return an instance of {@link InventoryItemtypeType}
         */
        public InventoryItemtypeType build() {
            InventoryItemtypeTypeBuilder obj = new InventoryItemtypeTypeBuilder(this);
            return obj.subject;
        }
    }

}
