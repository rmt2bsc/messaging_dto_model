//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.06 at 01:50:09 AM CST 
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
 * <p>Java class for sales_invoice_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sales_invoice_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoice_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="sales_order" type="{}sales_order_type"/>
 *         &lt;element name="transaction" type="{}xact_type"/>
 *         &lt;element name="invoice_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item_count" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="invoice_total" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "sales_invoice_type", propOrder = {
    "invoiceId",
    "salesOrder",
    "transaction",
    "invoiceNo",
    "itemCount",
    "invoiceTotal",
    "tracking"
})
public class SalesInvoiceType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "invoice_id", required = true)
    protected BigInteger invoiceId;
    @XmlElement(name = "sales_order", required = true)
    protected SalesOrderType salesOrder;
    @XmlElement(required = true)
    protected XactType transaction;
    @XmlElement(name = "invoice_no", required = true)
    protected String invoiceNo;
    @XmlElement(name = "item_count", required = true, defaultValue = "0")
    protected BigInteger itemCount;
    @XmlElement(name = "invoice_total", required = true, defaultValue = "0")
    protected BigDecimal invoiceTotal;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInvoiceId(BigInteger value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the salesOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderType }
     *     
     */
    public SalesOrderType getSalesOrder() {
        return salesOrder;
    }

    /**
     * Sets the value of the salesOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderType }
     *     
     */
    public void setSalesOrder(SalesOrderType value) {
        this.salesOrder = value;
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
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemCount(BigInteger value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the invoiceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceTotal() {
        return invoiceTotal;
    }

    /**
     * Sets the value of the invoiceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceTotal(BigDecimal value) {
        this.invoiceTotal = value;
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
