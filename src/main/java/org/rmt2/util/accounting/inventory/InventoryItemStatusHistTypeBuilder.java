package org.rmt2.util.accounting.inventory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.rmt2.jaxb.InventoryItemStatusType;
import org.rmt2.jaxb.InventoryItemType;
import org.rmt2.jaxb.InventoryStatusHistoryType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;

import com.SystemException;
import com.api.util.RMT2Date;

/**
 * InventoryStatusHistoryType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class InventoryItemStatusHistTypeBuilder {

    private static final Logger LOGGER = Logger.getLogger(InventoryItemStatusHistTypeBuilder.class);
    private InventoryStatusHistoryType subject;
    
    /**
     * Create a InventoryStatusHistoryType
     */
    private InventoryItemStatusHistTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createInventoryStatusHistoryType();
        subject.setActive(builder.active);
        subject.setReason(builder.reason);
        subject.setEffectiveDate(builder.effectiveDate);
        subject.setEndDate(builder.endDate);
        subject.setItem(builder.item);
        subject.setMarkup(builder.markup);
        subject.setStatus(builder.status);
        subject.setStatusHistId(builder.statusHistId);
        subject.setTracking(builder.tracking);
        subject.setUnitCost(builder.unitCost);
    }

    /**
     * Builder for {@link InventoryStatusHistoryType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger statusHistId;
        private InventoryItemType item;
        private InventoryItemStatusType status;
        private BigDecimal unitCost;
        private BigDecimal markup;
        private XMLGregorianCalendar effectiveDate;
        private XMLGregorianCalendar endDate;
        private String reason;
        private BigInteger active;
        private RecordTrackingType tracking;

        private Builder() {
            this.statusHistId = null;
            this.item = null;
            this.status = null;
            this.unitCost = null;
            this.markup = null;
            this.effectiveDate = null;
            this.endDate = null;
            this.reason = null;
            this.markup = null;
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
         * Set up item status history id.
         * 
         * @param statusHistId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withStatusHistId(int statusHistId) {
            this.statusHistId = BigInteger.valueOf(statusHistId);
            return this;
        }

        /**
         * Set up item id.
         * 
         * @param itemId
         *            an int value that must be greater than zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withItemId(int itemId) {
            ObjectFactory f = new ObjectFactory();
            InventoryItemType o = f.createInventoryItemType();
            o.setItemId(BigInteger.valueOf(itemId));
            this.item = o;
            return this;
        }

        
        /**
         * Set up item status id.
         * 
         * @param statusId
         *            an int value that must be greater than zero
         * @param statusDescription
         *            the description of the item status.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withItemStatusId(int statusId, String statusDescription) {
            ObjectFactory f = new ObjectFactory();
            InventoryItemStatusType o = f.createInventoryItemStatusType();
            o.setItemStatusId(BigInteger.valueOf(statusId));
            o.setDescription(statusDescription);
            this.status = o;
            return this;
        }
        
        /**
         * Set up item status effective date.
         * 
         * @param effectiveDate
         *            the effective date of the item's status. Cannot be null.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEffectiveDate(String effectiveDate) {
            try {
                XMLGregorianCalendar dt = RMT2Date.toXmlDate(effectiveDate);
                this.effectiveDate = dt;    
            }
            catch (SystemException e) {
                LOGGER.warn("Unable to conver inventory item status effective date, " + effectiveDate + ", to XMLGregorianCalendar");
            }
            return this;
        }
        
        /**
         * Set up item status effective date.
         * 
         * @param effectiveDate
         *            the effective date of the item's status. Cannot be null.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEffectiveDate(Date effectiveDate) {
            try {
                XMLGregorianCalendar dt = RMT2Date.toXmlDate(effectiveDate);
                this.effectiveDate = dt;    
            }
            catch (SystemException e) {
                LOGGER.warn("Unable to conver inventory item status effective date, " + effectiveDate + ", to XMLGregorianCalendar");
            }
            return this;
        }
        
        /**
         * Set up item status end date.
         * 
         * @param endDate
         *            the end date of the item's status. Cannot be null.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEndDate(String endDate) {
            try {
                XMLGregorianCalendar dt = RMT2Date.toXmlDate(endDate);
                this.endDate = dt;    
            }
            catch (SystemException e) {
                LOGGER.warn("Unable to conver inventory item status end date, " + endDate + ", to XMLGregorianCalendar");
            }
            return this;
        }
         
        /**
         * Set up item status end date.
         * 
         * @param endDate
         *            the end date of the item's status. Cannot be null.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEndDate(Date endDate) {
            try {
                XMLGregorianCalendar dt = RMT2Date.toXmlDate(endDate);
                this.endDate = dt;    
            }
            catch (SystemException e) {
                LOGGER.warn("Unable to conver inventory item status end date, " + endDate + ", to XMLGregorianCalendar");
            }
            return this;
        }
        
        /**
         * Set up vendor item number.
         * 
         * @param reason
         *            the reason for the item's status.
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withReason(String reason) {
            this.reason = reason;
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
         * Completes the building of the InventoryStatusHistoryType
         * 
         * @return an instance of {@link InventoryStatusHistoryType}
         */
        public InventoryStatusHistoryType build() {
            InventoryItemStatusHistTypeBuilder obj = new InventoryItemStatusHistTypeBuilder(this);
            return obj.subject;
        }
    }

}
