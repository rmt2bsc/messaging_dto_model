//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.23 at 09:00:45 AM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for transaction_criteria_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction_criteria_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gl_criteria" type="{}gl_criteria_type" minOccurs="0"/>
 *         &lt;element name="customer_criteria" type="{}customer_criteria_type" minOccurs="0"/>
 *         &lt;element name="creditor_criteria" type="{}creditor_criteria_type" minOccurs="0"/>
 *         &lt;element name="creditortype_criteria" type="{}creditortype_criteria_type" minOccurs="0"/>
 *         &lt;element name="sales_criteria" type="{}sales_order_criteria" minOccurs="0"/>
 *         &lt;element name="purchases_criteria" type="{}purchase_order_criteria" minOccurs="0"/>
 *         &lt;element name="xact_criteria" type="{}xact_criteria_type" minOccurs="0"/>
 *         &lt;element name="xact_category_criteria" type="{}xact_category_criteria_type" minOccurs="0"/>
 *         &lt;element name="xact_code_group_criteria" type="{}xact_code_group_criteria_type" minOccurs="0"/>
 *         &lt;element name="xact_code_criteria" type="{}xact_code_criteria_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction_criteria_group", propOrder = {
    "glCriteria",
    "customerCriteria",
    "creditorCriteria",
    "creditortypeCriteria",
    "salesCriteria",
    "purchasesCriteria",
    "xactCriteria",
    "xactCategoryCriteria",
    "xactCodeGroupCriteria",
    "xactCodeCriteria"
})
public class TransactionCriteriaGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "gl_criteria")
    protected GlCriteriaType glCriteria;
    @XmlElement(name = "customer_criteria")
    protected CustomerCriteriaType customerCriteria;
    @XmlElement(name = "creditor_criteria")
    protected CreditorCriteriaType creditorCriteria;
    @XmlElement(name = "creditortype_criteria")
    protected CreditortypeCriteriaType creditortypeCriteria;
    @XmlElement(name = "sales_criteria")
    protected SalesOrderCriteria salesCriteria;
    @XmlElement(name = "purchases_criteria")
    protected PurchaseOrderCriteria purchasesCriteria;
    @XmlElement(name = "xact_criteria")
    protected XactCriteriaType xactCriteria;
    @XmlElement(name = "xact_category_criteria")
    protected XactCategoryCriteriaType xactCategoryCriteria;
    @XmlElement(name = "xact_code_group_criteria")
    protected XactCodeGroupCriteriaType xactCodeGroupCriteria;
    @XmlElement(name = "xact_code_criteria")
    protected XactCodeCriteriaType xactCodeCriteria;

    /**
     * Gets the value of the glCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link GlCriteriaType }
     *     
     */
    public GlCriteriaType getGlCriteria() {
        return glCriteria;
    }

    /**
     * Sets the value of the glCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlCriteriaType }
     *     
     */
    public void setGlCriteria(GlCriteriaType value) {
        this.glCriteria = value;
    }

    /**
     * Gets the value of the customerCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCriteriaType }
     *     
     */
    public CustomerCriteriaType getCustomerCriteria() {
        return customerCriteria;
    }

    /**
     * Sets the value of the customerCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCriteriaType }
     *     
     */
    public void setCustomerCriteria(CustomerCriteriaType value) {
        this.customerCriteria = value;
    }

    /**
     * Gets the value of the creditorCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorCriteriaType }
     *     
     */
    public CreditorCriteriaType getCreditorCriteria() {
        return creditorCriteria;
    }

    /**
     * Sets the value of the creditorCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorCriteriaType }
     *     
     */
    public void setCreditorCriteria(CreditorCriteriaType value) {
        this.creditorCriteria = value;
    }

    /**
     * Gets the value of the creditortypeCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link CreditortypeCriteriaType }
     *     
     */
    public CreditortypeCriteriaType getCreditortypeCriteria() {
        return creditortypeCriteria;
    }

    /**
     * Sets the value of the creditortypeCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditortypeCriteriaType }
     *     
     */
    public void setCreditortypeCriteria(CreditortypeCriteriaType value) {
        this.creditortypeCriteria = value;
    }

    /**
     * Gets the value of the salesCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderCriteria }
     *     
     */
    public SalesOrderCriteria getSalesCriteria() {
        return salesCriteria;
    }

    /**
     * Sets the value of the salesCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderCriteria }
     *     
     */
    public void setSalesCriteria(SalesOrderCriteria value) {
        this.salesCriteria = value;
    }

    /**
     * Gets the value of the purchasesCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderCriteria }
     *     
     */
    public PurchaseOrderCriteria getPurchasesCriteria() {
        return purchasesCriteria;
    }

    /**
     * Sets the value of the purchasesCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderCriteria }
     *     
     */
    public void setPurchasesCriteria(PurchaseOrderCriteria value) {
        this.purchasesCriteria = value;
    }

    /**
     * Gets the value of the xactCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link XactCriteriaType }
     *     
     */
    public XactCriteriaType getXactCriteria() {
        return xactCriteria;
    }

    /**
     * Sets the value of the xactCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCriteriaType }
     *     
     */
    public void setXactCriteria(XactCriteriaType value) {
        this.xactCriteria = value;
    }

    /**
     * Gets the value of the xactCategoryCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link XactCategoryCriteriaType }
     *     
     */
    public XactCategoryCriteriaType getXactCategoryCriteria() {
        return xactCategoryCriteria;
    }

    /**
     * Sets the value of the xactCategoryCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCategoryCriteriaType }
     *     
     */
    public void setXactCategoryCriteria(XactCategoryCriteriaType value) {
        this.xactCategoryCriteria = value;
    }

    /**
     * Gets the value of the xactCodeGroupCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link XactCodeGroupCriteriaType }
     *     
     */
    public XactCodeGroupCriteriaType getXactCodeGroupCriteria() {
        return xactCodeGroupCriteria;
    }

    /**
     * Sets the value of the xactCodeGroupCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCodeGroupCriteriaType }
     *     
     */
    public void setXactCodeGroupCriteria(XactCodeGroupCriteriaType value) {
        this.xactCodeGroupCriteria = value;
    }

    /**
     * Gets the value of the xactCodeCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link XactCodeCriteriaType }
     *     
     */
    public XactCodeCriteriaType getXactCodeCriteria() {
        return xactCodeCriteria;
    }

    /**
     * Sets the value of the xactCodeCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCodeCriteriaType }
     *     
     */
    public void setXactCodeCriteria(XactCodeCriteriaType value) {
        this.xactCodeCriteria = value;
    }

}
