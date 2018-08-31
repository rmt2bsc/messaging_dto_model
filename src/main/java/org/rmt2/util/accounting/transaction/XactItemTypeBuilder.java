package org.rmt2.util.accounting.transaction;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.XactLineitemType;

import com.api.util.assistants.Verifier;

/**
 * XactLineitemType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class XactItemTypeBuilder {

    private XactLineitemType subject;
    
    /**
     * Create a XacttypeTypeBuilder
     */
    private XactItemTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createXactLineitemType();
        subject.setItemId(builder.itemId);
        subject.setName(builder.name);
        subject.setXactId(builder.xactId);
        subject.setItemtypeId(builder.itemtypeId);
        subject.setAmount(builder.amount);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link XactLineitemType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger itemId;
        private BigInteger xactId;
        private BigInteger itemtypeId;
        private String name;
        private BigDecimal amount;
        private RecordTrackingType tracking;

        private Builder() {
            this.itemId = null;
            this.xactId = null;
            this.itemtypeId = null;
            this.name = null;
            this.amount = null;
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
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withItemId(int itemId) {
            this.itemId = BigInteger.valueOf(itemId);
            return this;
        }

        /**
         * Set up transaction id.
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
         * Set up item type Id.
         * 
         * @param itemtypeId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withItemtypeId(int itemtypeId) {
            this.itemtypeId = BigInteger.valueOf(itemtypeId);
            return this;
        }
        
       
        /**
         * Set up name.
         * 
         * @param name
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withCode(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Set up amount.
         * 
         * @param amount
         *            an double value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withAmount(double amount) {
            this.amount = BigDecimal.valueOf(amount);
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
         * Completes the building of the XactLineitemType
         * 
         * @return an instance of {@link XactLineitemType}
         */
        public XactLineitemType build() {
            XactItemTypeBuilder obj = new XactItemTypeBuilder(this);
            return obj.subject;
        }
    }
}
