package org.rmt2.util.accounting.transaction;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.CreditorType;
import org.rmt2.jaxb.CustomerType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.XactItemType;
import org.rmt2.jaxb.XactType;
import org.rmt2.jaxb.XacttypeType;

import com.api.util.RMT2Date;
import com.api.util.assistants.Verifier;

/**
 * XactType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class XactTypeBuilder {

    private XactType subject;
    
    /**
     * Create a XactTypeBuilder
     */
    private XactTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createXactType();
        subject.setXactType(builder.xactType);
        subject.setXactSubtypeId(builder.xactSubtypeId);
        subject.setXactId(builder.xactId);
        subject.setCustomer(builder.customer);
        subject.setCreditor(builder.creditor);
        subject.setXactAmount(builder.xactAmount);
        subject.setXactDate(builder.xactDate);
        subject.setXactReason(builder.xactReason);
        subject.setAccountNo(builder.accountNo);
        subject.setConfirmNo(builder.confirmNo);
        subject.setDocumentId(builder.documentId);
        subject.setInvoiceNo(builder.invoiceNo);
        subject.setItemTotal(builder.itemTotal);
        if (builder.items != null) {
            subject.getItems().addAll(builder.items);    
        }
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link XactType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger xactId;
        private XacttypeType xactType;
        private XacttypeType xactSubtypeId;
        private CustomerType customer;
        private CreditorType creditor;
        private BigDecimal xactAmount;
        private XMLGregorianCalendar xactDate;
        private String xactReason;
        private String accountNo;
        private String confirmNo;
        private BigInteger documentId;
        private String invoiceNo;
        private BigDecimal itemTotal;
        private List<XactItemType> items;
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
         * Set up xactType.
         * 
         * @param xactType
         *            XacttypeType value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactType(XacttypeType xactType) {
            this.xactType = xactType;
            return this;
        }

        /**
         * Set up xactSubtypeId.
         * 
         * @param xactSubtypeId
         *            XacttypeType value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactSubtypeId(XacttypeType xactSubtypeId) {
            this.xactSubtypeId = xactSubtypeId;
            return this;
        }
        
        /**
         * Set up customer.
         * 
         * @param customer
         *            CustomerType value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withCustomer(CustomerType customer) {
            this.customer = customer;
            return this;
        }
        
        /**
         * Set up creditor.
         * 
         * @param creditor
         *            CreditorType value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withCreditor(CreditorType creditor) {
            this.creditor = creditor;
            return this;
        }
        
        /**
         * Set up xactDate.
         * 
         * @param xactDate
         *            an Date value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactDate(Date xactDate) {
            this.xactDate = RMT2Date.toXmlDate(xactDate);
            return this;
        }
        
        /**
         * Set up xactDate.
         * 
         * @param xactDate
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactDate(String xactDate) {
            this.xactDate = RMT2Date.toXmlDate(xactDate);
            return this;
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
         * Set up xactAmount.
         * 
         * @param xactAmount
         *            an double value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactAmount(double xactAmount) {
            this.xactAmount = BigDecimal.valueOf(xactAmount);
            return this;
        }
        
        /**
         * Set up reason.
         * 
         * @param xactReason
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withReason(String xactReason) {
            this.xactReason = xactReason;
            return this;
        }
        
        /**
         * Set up account No.
         * 
         * @param accountNo
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withAccountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }
        
        /**
         * Set up confirmation no.
         * 
         * @param confirmNo
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withConfirmNo(String confirmNo) {
            this.confirmNo = confirmNo;
            return this;
        }
        
        /**
         * Set up documentId.
         * 
         * @param documentId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDocumentId(int documentId) {
            this.documentId = BigInteger.valueOf(documentId);
            return this;
        }
        
        /**
         * Set up invoice No.
         * 
         * @param invoiceNo
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        
        /**
         * Set up item Total.
         * 
         * @param itemTotal
         *            an double value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withItemTotal(double itemTotal) {
            this.itemTotal = BigDecimal.valueOf(itemTotal);
            return this;
        }
        
        /**
         * Set up transaction items.
         * 
         * @param items
         *            an List<XactItemType> value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactItems(List<XactItemType> items) {
            this.items = items;
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
         * Completes the building of the XactType
         * 
         * @return an instance of {@link XactType}
         */
        public XactType build() {
            XactTypeBuilder obj = new XactTypeBuilder(this);
            return obj.subject;
        }
    }
}
