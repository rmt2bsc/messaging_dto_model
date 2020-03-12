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
import org.rmt2.jaxb.XactCodeGroupType;
import org.rmt2.jaxb.XactCodeType;
import org.rmt2.jaxb.XactLineitemType;
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
        subject.setXactSubtype(builder.xactSubtype);
        subject.setXactId(builder.xactId);
        subject.setCustomer(builder.customer);
        subject.setCreditor(builder.creditor);
        subject.setXactCode(builder.xactCode);
        subject.setXactCodeGroup(builder.xactCodeGrp);
        subject.setXactAmount(builder.xactAmount);
        subject.setXactDate(builder.xactDate);
        subject.setPostedDate(builder.postedDate);
        subject.setXactReason(builder.xactReason);
        subject.setAccountNo(builder.accountNo);
        subject.setEntityRefNo(builder.entityRefNo);
        subject.setNegInstrNo(builder.negInstrNo);
        subject.setBankTransInd(builder.bankTransInd);
        subject.setTenderId(builder.tenderId);
        subject.setConfirmNo(builder.confirmNo);
        subject.setDocumentId(builder.documentId);
        subject.setInvoiceNo(builder.invoiceNo);
        subject.setItemTotal(builder.itemTotal);
        if (builder.items != null) {
            subject.setLineitems(f.createXactLineitemListType());
            subject.getLineitems().getLineitem().addAll(builder.items);    
        }
        subject.setTracking(builder.tracking);

        /* Adding new fields for generic transactions */
        subject.setParentEntityId(builder.parentEntityId);
        subject.setSpecialXactLevel1Id(builder.specialXactLevel1Id);
        subject.setSpecialXactLevel1Date(builder.specialXactLevel1Date);
        subject.setSpecialXactLevel2Id(builder.specialXactLevel2Id);
        subject.setSpecialXactLevel2Date(builder.specialXactLevel2Date);
        subject.setBusinessId(builder.businessId);
        subject.setBusinessName(builder.businessName);
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
        private XacttypeType xactSubtype;
        private CustomerType customer;
        private CreditorType creditor;
        private XactCodeType xactCode;
        private XactCodeGroupType xactCodeGrp;
        private BigDecimal xactAmount;
        private XMLGregorianCalendar xactDate;
        private XMLGregorianCalendar postedDate;
        private String xactReason;
        private String businessName;
        private BigInteger businessId;
        private String confirmNo;
        private String entityRefNo;
        private String negInstrNo;
        private String accountNo;
        private BigInteger tenderId;
        private String bankTransInd;
        private BigInteger documentId;
        private String invoiceNo;
        private BigDecimal itemTotal;
        private List<XactLineitemType> items;
        private RecordTrackingType tracking;
        
        /* Adding new fields for generic transactions */
        private BigInteger parentEntityId;
        private BigInteger specialXactLevel1Id;
        private XMLGregorianCalendar specialXactLevel1Date;
        private BigInteger specialXactLevel2Id;
        private XMLGregorianCalendar specialXactLevel2Date;

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
         * Set up transactoin type object.
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
         * Set up Transaction Type id.
         * 
         * @param xactType
         *            transaction type id
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactTypeId(int xactTypeId) {
            if (this.xactType == null) {
                this.xactType = XacttypeTypeBuilder.Builder.create().withXactTypeId(xactTypeId).build();
            } else {
                this.xactType.setXactTypeId(BigInteger.valueOf(xactTypeId));
            }
            return this;
        }
        
        /**
         * Set up transaction type code.
         * 
         * @param code
         *            transaction type code
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactTypeCode(String code) {
            if (this.xactType == null) {
                this.xactType = XacttypeTypeBuilder.Builder.create().withCode(code).build();
            } else {
                this.xactType.setCode(code);
            }
            return this;
        }

        /**
         * Set up transaction type description.
         * 
         * @param description
         *            transaction type description
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactTypeDescription(String description) {
            if (this.xactType == null) {
                this.xactType = XacttypeTypeBuilder.Builder.create().withDescription(description).build();
            } else {
                this.xactType.setDescription(description);
            }
            return this;
        }
        
        /**
         * Set up transacton sub type.
         * 
         * @param xactSubtype
         *            XacttypeType value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactSubtype(XacttypeType xactSubtype) {
            this.xactSubtype = xactSubtype;
            return this;
        }
        
        /**
         * Set up transacton sub type id.
         * 
         * @param xactSubtypeId
         *            XacttypeType value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactSubtypeId(int xactSubtypeId) {
            if (this.xactSubtype == null) {
                this.xactSubtype = XacttypeTypeBuilder.Builder.create().withXactTypeId(xactSubtypeId).build();    
            } else {
                this.xactSubtype.setXactTypeId(BigInteger.valueOf(xactSubtypeId));
            }
            return this;
        }
        
        /**
         * Set up transacton sub type code.
         * 
         * @param code
         *            transaction sub type code
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactSubtypeCode(String code) {
            if (this.xactSubtype == null) {
                this.xactSubtype = XacttypeTypeBuilder.Builder.create().withCode(code).build();
            } else {
                this.xactSubtype.setCode(code);
            }
            return this;
        }
        
        /**
         * Set up transacton sub type description.
         * 
         * @param description
         *            transaction sub type description
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactSubtypeDescription(String description) {
            if (this.xactSubtype == null) {
                this.xactSubtype = XacttypeTypeBuilder.Builder.create().withDescription(description).build();
            } else {
                this.xactSubtype.setDescription(description);
            }
            return this;
        }
        
        /**
         * Set up tranasction code object.
         * 
         * @param xactCode
         *            XactCodeType value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactCode(XactCodeType xactCode) {
            this.xactCode = xactCode;
            return this;
        }
        
        /**
         * Setup transaction code id.
         * 
         * @param xactCodeId
         *            the transaction code id
         * @return
         */
        public Builder withXactCodeId(int xactCodeId) {
            if (this.xactCode == null) {
                this.xactCode = XactCodeTypeBuilder.Builder.create()
                        .withXactCodeId(xactCodeId).build();   
            } else {
                this.xactCode.setXactCodeId(BigInteger.valueOf(xactCodeId));
            }
            return this;
        }
        
        /**
         * Setup transaction code description.
         * 
         * @param description
         *            the transaction code description
         * @return
         */
        public Builder withXactCodeDescription(String description) {
            if (this.xactCode == null) {
                this.xactCode = XactCodeTypeBuilder.Builder.create()
                        .withDescription(description).build();   
            } else {
                this.xactCode.setDescription(description);
            }
            return this;
        }
        
        /**
         * Set up transaction group object.
         * 
         * @param XactCodeGroupType
         *            XactCodeType value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactCodeGroup(XactCodeGroupType xactCodeGrp) {
            this.xactCodeGrp = xactCodeGrp;
            return this;
        }
        
        /**
         * Set up transaction group id.
         * 
         * @param xactCodeGrpId
         *            transaction group id
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactCodeGroupId(int xactGrpId) {
            if (this.xactCodeGrp == null) {
                this.xactCodeGrp = XactCodeGroupTypeBuilder.Builder.create()
                        .withGroupId(xactGrpId).build();    
            } else {
                this.xactCodeGrp.setXactCodeGrpId(BigInteger.valueOf(xactGrpId));
            }
            return this;
        }
        
        /**
         * Set up transaction group description.
         * 
         * @param description
         *            transaction group description
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactCodeGroupDescription(String description) {
            if (this.xactCodeGrp == null) {
                this.xactCodeGrp = XactCodeGroupTypeBuilder.Builder.create()
                        .withDescription(description).build();    
            } else {
                this.xactCodeGrp.setDescription(description);;
            }
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
         * Set up posted Date.
         * 
         * @param xactDate
         *            an Date value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withPostedDate(Date postedDate) {
            this.postedDate = RMT2Date.toXmlDate(postedDate);
            return this;
        }
        
        /**
         * Set up  posted Date.
         * 
         * @param postedDate
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withPostedDate(String postedDate) {
            this.postedDate = RMT2Date.toXmlDate(postedDate);
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
         * Set up Account No.
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
         * Set up entity ref No.
         * 
         * @param entityRefNo
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEntityRefNo(String entityRefNo) {
            this.entityRefNo = entityRefNo;
            return this;
        }
        
        /**
         * Set up entity ref No.
         * 
         * @param negInstrNo
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withNegInstrNo(String negInstrNo) {
            this.negInstrNo = negInstrNo;
            return this;
        }
        
        /**
         * Set up bank Trans Ind
         * 
         * @param bankTransInd
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withBankTransInd(String bankTransInd) {
            this.bankTransInd = bankTransInd;
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
         * Set up tender Id.
         * 
         * @param tenderId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withTenderId(int tenderId) {
            this.tenderId = BigInteger.valueOf(tenderId);
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
         * Set up transaction line items.
         * 
         * @param items
         *            an List<XactLineitemType> value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withXactItems(List<XactLineitemType> items) {
            this.items = items;
            return this;
        }
        
        /**
         * Set up Business Id.
         * 
         * @param businessId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withBusinessId(int businessId) {
            this.businessId = BigInteger.valueOf(businessId);
            return this;
        }

        /**
         * Set up Business Name
         * 
         * @param businessName
         *            an String value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }

        /**
         * Set up Parent Entity Id.
         * 
         * @param parentEntityId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withParentEntityId(int parentEntityId) {
            this.parentEntityId = BigInteger.valueOf(parentEntityId);
            return this;
        }

        /**
         * Set up Special Xact Level 1 Id.
         * 
         * @param specialXactLevel1Id
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSpecialXactLevel1Id(int specialXactLevel1Id) {
            this.parentEntityId = BigInteger.valueOf(specialXactLevel1Id);
            return this;
        }

        /**
         * Set up Special Xact Level 1 Date.
         * 
         * @param specialXactLevel1Date
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSpecialXactLevel1Date(Date specialXactLevel1Date) {
            this.specialXactLevel1Date = RMT2Date.toXmlDate(specialXactLevel1Date);
            return this;
        }

        /**
         * Set up Special Xact Level 2 Id.
         * 
         * @param specialXactLevel2Id
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSpecialXactLevel2Id(int specialXactLevel2Id) {
            this.parentEntityId = BigInteger.valueOf(specialXactLevel2Id);
            return this;
        }

        /**
         * Set up Special Xact Level 2 Date.
         * 
         * @param specialXactLevel2Date
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSpecialXactLevel2Date(Date specialXactLevel2Date) {
            this.specialXactLevel2Date = RMT2Date.toXmlDate(specialXactLevel2Date);
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
