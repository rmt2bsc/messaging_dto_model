//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.20 at 01:38:53 AM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for purchase_order_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchase_order_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchase_order_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="transaction" type="{}xact_type"/>
 *         &lt;element name="creditor" type="{}creditor_type"/>
 *         &lt;element name="reference_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="purchase_order_items" type="{}purchase_order_item_list_type" minOccurs="0"/>
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
@XmlType(name = "purchase_order_type", propOrder = {
    "purchaseOrderId",
    "transaction",
    "creditor",
    "referenceNo",
    "total",
    "purchaseOrderItems",
    "tracking"
})
public class PurchaseOrderType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "purchase_order_id", required = true)
    protected BigInteger purchaseOrderId;
    @XmlElement(required = true)
    protected XactType transaction;
    @XmlElement(required = true)
    protected CreditorType creditor;
    @XmlElement(name = "reference_no")
    protected String referenceNo;
    @XmlElement(required = true)
    protected BigDecimal total;
    @XmlElement(name = "purchase_order_items")
    protected PurchaseOrderItemListType purchaseOrderItems;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the purchaseOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurchaseOrderId() {
        return purchaseOrderId;
    }

    /**
     * Sets the value of the purchaseOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurchaseOrderId(BigInteger value) {
        this.purchaseOrderId = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link XactType }
     *     
     */
    public XactType getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactType }
     *     
     */
    public void setTransaction(XactType value) {
        this.transaction = value;
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
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the purchaseOrderItems property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderItemListType }
     *     
     */
    public PurchaseOrderItemListType getPurchaseOrderItems() {
        return purchaseOrderItems;
    }

    /**
     * Sets the value of the purchaseOrderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderItemListType }
     *     
     */
    public void setPurchaseOrderItems(PurchaseOrderItemListType value) {
        this.purchaseOrderItems = value;
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
