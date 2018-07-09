//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.09 at 06:17:43 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.RMT2Base;


/**
 * <p>Java class for sales_order_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sales_order_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sales_order_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="customer" type="{}customer_type"/>
 *         &lt;element name="invoiced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="invoice_details" type="{}sales_invoice_type" minOccurs="0"/>
 *         &lt;element name="order_total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="effective_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="status_history" type="{}sales_order_status_history_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="items" type="{}sales_order_item_type" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "sales_order_type", propOrder = {
    "salesOrderId",
    "customer",
    "invoiced",
    "invoiceDetails",
    "orderTotal",
    "effectiveDate",
    "statusHistory",
    "items",
    "tracking"
})
public class SalesOrderType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "sales_order_id", required = true, defaultValue = "0")
    protected BigInteger salesOrderId;
    @XmlElement(required = true)
    protected CustomerType customer;
    protected Boolean invoiced;
    @XmlElement(name = "invoice_details")
    protected SalesInvoiceType invoiceDetails;
    @XmlElement(name = "order_total")
    protected BigDecimal orderTotal;
    @XmlElement(name = "effective_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "status_history")
    protected List<SalesOrderStatusHistoryType> statusHistory;
    protected List<SalesOrderItemType> items;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the salesOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSalesOrderId() {
        return salesOrderId;
    }

    /**
     * Sets the value of the salesOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSalesOrderId(BigInteger value) {
        this.salesOrderId = value;
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
     * Gets the value of the invoiced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvoiced() {
        return invoiced;
    }

    /**
     * Sets the value of the invoiced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvoiced(Boolean value) {
        this.invoiced = value;
    }

    /**
     * Gets the value of the invoiceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SalesInvoiceType }
     *     
     */
    public SalesInvoiceType getInvoiceDetails() {
        return invoiceDetails;
    }

    /**
     * Sets the value of the invoiceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesInvoiceType }
     *     
     */
    public void setInvoiceDetails(SalesInvoiceType value) {
        this.invoiceDetails = value;
    }

    /**
     * Gets the value of the orderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    /**
     * Sets the value of the orderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderTotal(BigDecimal value) {
        this.orderTotal = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the statusHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderStatusHistoryType }
     * 
     * 
     */
    public List<SalesOrderStatusHistoryType> getStatusHistory() {
        if (statusHistory == null) {
            statusHistory = new ArrayList<SalesOrderStatusHistoryType>();
        }
        return this.statusHistory;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderItemType }
     * 
     * 
     */
    public List<SalesOrderItemType> getItems() {
        if (items == null) {
            items = new ArrayList<SalesOrderItemType>();
        }
        return this.items;
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
