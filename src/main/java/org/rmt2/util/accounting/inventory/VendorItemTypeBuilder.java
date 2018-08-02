package org.rmt2.util.accounting.inventory;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.rmt2.jaxb.CreditorType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.VendorItemType;

import com.api.util.assistants.Verifier;

/**
 * VendorItemType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class VendorItemTypeBuilder {

    private VendorItemType subject;
    
    /**
     * Create a VendorItemType
     */
    private VendorItemTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createVendorItemType();
        subject.setItemId(builder.itemId);
        subject.setDescription(builder.description);
        subject.setCreditor(builder.creditor);
        subject.setVendorItemNo(builder.vendorItemNo);
        subject.setItemSerialNo(builder.itemSerialNo);
        subject.setUnitCost(builder.unitCost);
    }

    /**
     * Builder for {@link VendorItemType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger itemId;
        private CreditorType creditor;
        private String description;
        private String vendorItemNo;
        private String itemSerialNo;
        private BigDecimal unitCost;

        private Builder() {
            this.itemId = null;
            this.creditor = null;
            this.description = null;
            this.vendorItemNo = null;
            this.itemSerialNo = null;
            this.unitCost = null;
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
         * Set up creditor.
         * 
         * @param creditorId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCreditorId(int creditorId) {
            Verifier.verifyNotNegative(itemId, "Creditor id must not be a negative value");
            ObjectFactory f = new ObjectFactory();
            CreditorType ct = f.createCreditorType();
            ct.setCreditorId(BigInteger.valueOf(creditorId));
            this.creditor = ct;
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
         * Set up vendor item number.
         * 
         * @param vendorItemNo
         *            the vendor's item noumber.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withVendorItemNo(String vendorItemNo) {
            this.vendorItemNo = vendorItemNo;
            return this;
        }
        
        /**
         * Set up vendor item serial number.
         * 
         * @param itemSerialNo
         *            the vendor item's serial number.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withItemSerialNo(String itemSerialNo) {
            this.itemSerialNo = itemSerialNo;
            return this;
        }
        
        /**
         * Set up unit cost.
         * 
         * @param unitCost
         *            the vendor item's unit cost value that must not
         *            be null
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withUnitCost(double unitCost) {
            Verifier.verifyNotNull(unitCost, "Vendor item unit cost cannot be null");
            this.unitCost = BigDecimal.valueOf(unitCost);
            return this;
        }

        /**
         * Completes the building of the VendorItemType
         * 
         * @return an instance of {@link VendorItemType}
         */
        public VendorItemType build() {
            VendorItemTypeBuilder obj = new VendorItemTypeBuilder(this);
            return obj.subject;
        }
    }

}
