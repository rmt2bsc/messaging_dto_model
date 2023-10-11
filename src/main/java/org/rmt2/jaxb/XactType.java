//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.11 at 12:09:01 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.RMT2Base;


/**
 * <p>Java class for xact_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xact_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xact_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="xact_type" type="{}xacttype_type"/>
 *         &lt;element name="xact_subtype" type="{}xacttype_type" minOccurs="0"/>
 *         &lt;element name="customer" type="{}customer_type" minOccurs="0"/>
 *         &lt;element name="creditor" type="{}creditor_type" minOccurs="0"/>
 *         &lt;element name="xact_code_group" type="{}xact_code_group_type" minOccurs="0"/>
 *         &lt;element name="xact_code" type="{}xact_code_type" minOccurs="0"/>
 *         &lt;element name="xact_amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="xact_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="posted_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="xact_reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entity_ref_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="neg_instr_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tender_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="confirm_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="document_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="invoice_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bank_trans_ind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item_total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lineitems" type="{}xact_lineitem_list_type" minOccurs="0"/>
 *         &lt;element name="account_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="business_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="business_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent_entity_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="special_xact_level_1_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="special_xact_level_1_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="special_xact_level_2_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="special_xact_level_2_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tracking" type="{}record_tracking_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xact_type", propOrder = {
    "xactId",
    "xactType",
    "xactSubtype",
    "customer",
    "creditor",
    "xactCodeGroup",
    "xactCode",
    "xactAmount",
    "xactDate",
    "postedDate",
    "xactReason",
    "entityRefNo",
    "negInstrNo",
    "tenderId",
    "confirmNo",
    "documentId",
    "invoiceNo",
    "bankTransInd",
    "itemTotal",
    "lineitems",
    "accountNo",
    "businessId",
    "businessName",
    "parentEntityId",
    "specialXactLevel1Id",
    "specialXactLevel1Date",
    "specialXactLevel2Id",
    "specialXactLevel2Date",
    "tracking"
})
public class XactType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "xact_id", required = true)
    protected BigInteger xactId;
    @XmlElement(name = "xact_type", required = true)
    protected XacttypeType xactType;
    @XmlElement(name = "xact_subtype")
    protected XacttypeType xactSubtype;
    protected CustomerType customer;
    protected CreditorType creditor;
    @XmlElement(name = "xact_code_group")
    protected XactCodeGroupType xactCodeGroup;
    @XmlElement(name = "xact_code")
    protected XactCodeType xactCode;
    @XmlElement(name = "xact_amount", required = true)
    protected BigDecimal xactAmount;
    @XmlElement(name = "xact_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xactDate;
    @XmlElement(name = "posted_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postedDate;
    @XmlElement(name = "xact_reason")
    protected String xactReason;
    @XmlElement(name = "entity_ref_no")
    protected String entityRefNo;
    @XmlElement(name = "neg_instr_no")
    protected String negInstrNo;
    @XmlElement(name = "tender_id")
    protected BigInteger tenderId;
    @XmlElement(name = "confirm_no")
    protected String confirmNo;
    @XmlElement(name = "document_id")
    protected BigInteger documentId;
    @XmlElement(name = "invoice_no")
    protected String invoiceNo;
    @XmlElement(name = "bank_trans_ind")
    protected String bankTransInd;
    @XmlElement(name = "item_total")
    protected BigDecimal itemTotal;
    protected XactLineitemListType lineitems;
    @XmlElement(name = "account_no")
    protected String accountNo;
    @XmlElement(name = "business_id")
    protected BigInteger businessId;
    @XmlElement(name = "business_name")
    protected String businessName;
    @XmlElement(name = "parent_entity_id")
    protected BigInteger parentEntityId;
    @XmlElement(name = "special_xact_level_1_id")
    protected BigInteger specialXactLevel1Id;
    @XmlElement(name = "special_xact_level_1_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specialXactLevel1Date;
    @XmlElement(name = "special_xact_level_2_id")
    protected BigInteger specialXactLevel2Id;
    @XmlElement(name = "special_xact_level_2_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specialXactLevel2Date;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the xactId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXactId() {
        return xactId;
    }

    /**
     * Sets the value of the xactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXactId(BigInteger value) {
        this.xactId = value;
    }

    /**
     * Gets the value of the xactType property.
     * 
     * @return
     *     possible object is
     *     {@link XacttypeType }
     *     
     */
    public XacttypeType getXactType() {
        return xactType;
    }

    /**
     * Sets the value of the xactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XacttypeType }
     *     
     */
    public void setXactType(XacttypeType value) {
        this.xactType = value;
    }

    /**
     * Gets the value of the xactSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link XacttypeType }
     *     
     */
    public XacttypeType getXactSubtype() {
        return xactSubtype;
    }

    /**
     * Sets the value of the xactSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link XacttypeType }
     *     
     */
    public void setXactSubtype(XacttypeType value) {
        this.xactSubtype = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the creditor property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorType }
     *     
     */
    public CreditorType getCreditor() {
        return creditor;
    }

    /**
     * Sets the value of the creditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorType }
     *     
     */
    public void setCreditor(CreditorType value) {
        this.creditor = value;
    }

    /**
     * Gets the value of the xactCodeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XactCodeGroupType }
     *     
     */
    public XactCodeGroupType getXactCodeGroup() {
        return xactCodeGroup;
    }

    /**
     * Sets the value of the xactCodeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCodeGroupType }
     *     
     */
    public void setXactCodeGroup(XactCodeGroupType value) {
        this.xactCodeGroup = value;
    }

    /**
     * Gets the value of the xactCode property.
     * 
     * @return
     *     possible object is
     *     {@link XactCodeType }
     *     
     */
    public XactCodeType getXactCode() {
        return xactCode;
    }

    /**
     * Sets the value of the xactCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCodeType }
     *     
     */
    public void setXactCode(XactCodeType value) {
        this.xactCode = value;
    }

    /**
     * Gets the value of the xactAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXactAmount() {
        return xactAmount;
    }

    /**
     * Sets the value of the xactAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXactAmount(BigDecimal value) {
        this.xactAmount = value;
    }

    /**
     * Gets the value of the xactDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXactDate() {
        return xactDate;
    }

    /**
     * Sets the value of the xactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXactDate(XMLGregorianCalendar value) {
        this.xactDate = value;
    }

    /**
     * Gets the value of the postedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostedDate() {
        return postedDate;
    }

    /**
     * Sets the value of the postedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostedDate(XMLGregorianCalendar value) {
        this.postedDate = value;
    }

    /**
     * Gets the value of the xactReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXactReason() {
        return xactReason;
    }

    /**
     * Sets the value of the xactReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXactReason(String value) {
        this.xactReason = value;
    }

    /**
     * Gets the value of the entityRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityRefNo() {
        return entityRefNo;
    }

    /**
     * Sets the value of the entityRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityRefNo(String value) {
        this.entityRefNo = value;
    }

    /**
     * Gets the value of the negInstrNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegInstrNo() {
        return negInstrNo;
    }

    /**
     * Sets the value of the negInstrNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegInstrNo(String value) {
        this.negInstrNo = value;
    }

    /**
     * Gets the value of the tenderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTenderId() {
        return tenderId;
    }

    /**
     * Sets the value of the tenderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTenderId(BigInteger value) {
        this.tenderId = value;
    }

    /**
     * Gets the value of the confirmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmNo() {
        return confirmNo;
    }

    /**
     * Sets the value of the confirmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmNo(String value) {
        this.confirmNo = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentId(BigInteger value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the invoiceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Sets the value of the invoiceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

    /**
     * Gets the value of the bankTransInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransInd() {
        return bankTransInd;
    }

    /**
     * Sets the value of the bankTransInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransInd(String value) {
        this.bankTransInd = value;
    }

    /**
     * Gets the value of the itemTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemTotal() {
        return itemTotal;
    }

    /**
     * Sets the value of the itemTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemTotal(BigDecimal value) {
        this.itemTotal = value;
    }

    /**
     * Gets the value of the lineitems property.
     * 
     * @return
     *     possible object is
     *     {@link XactLineitemListType }
     *     
     */
    public XactLineitemListType getLineitems() {
        return lineitems;
    }

    /**
     * Sets the value of the lineitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactLineitemListType }
     *     
     */
    public void setLineitems(XactLineitemListType value) {
        this.lineitems = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the businessId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessId() {
        return businessId;
    }

    /**
     * Sets the value of the businessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessId(BigInteger value) {
        this.businessId = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the parentEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentEntityId() {
        return parentEntityId;
    }

    /**
     * Sets the value of the parentEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentEntityId(BigInteger value) {
        this.parentEntityId = value;
    }

    /**
     * Gets the value of the specialXactLevel1Id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecialXactLevel1Id() {
        return specialXactLevel1Id;
    }

    /**
     * Sets the value of the specialXactLevel1Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecialXactLevel1Id(BigInteger value) {
        this.specialXactLevel1Id = value;
    }

    /**
     * Gets the value of the specialXactLevel1Date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecialXactLevel1Date() {
        return specialXactLevel1Date;
    }

    /**
     * Sets the value of the specialXactLevel1Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecialXactLevel1Date(XMLGregorianCalendar value) {
        this.specialXactLevel1Date = value;
    }

    /**
     * Gets the value of the specialXactLevel2Id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecialXactLevel2Id() {
        return specialXactLevel2Id;
    }

    /**
     * Sets the value of the specialXactLevel2Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecialXactLevel2Id(BigInteger value) {
        this.specialXactLevel2Id = value;
    }

    /**
     * Gets the value of the specialXactLevel2Date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecialXactLevel2Date() {
        return specialXactLevel2Date;
    }

    /**
     * Sets the value of the specialXactLevel2Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecialXactLevel2Date(XMLGregorianCalendar value) {
        this.specialXactLevel2Date = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTrackingType }
     *     
     */
    public RecordTrackingType getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTrackingType }
     *     
     */
    public void setTracking(RecordTrackingType value) {
        this.tracking = value;
    }

}
