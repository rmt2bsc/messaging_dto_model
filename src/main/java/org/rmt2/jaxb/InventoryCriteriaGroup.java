//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.02 at 10:53:28 AM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for inventory_criteria_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inventory_criteria_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item_criteria" type="{}item_criteria_type" minOccurs="0"/>
 *         &lt;element name="item_assoc_criteria" type="{}item_association_criteria_type" minOccurs="0"/>
 *         &lt;element name="item_status_criteria" type="{}item_status_criteria_type" minOccurs="0"/>
 *         &lt;element name="item_status_hist_criteria" type="{}item_status_history_criteria_type" minOccurs="0"/>
 *         &lt;element name="item_type_criteria" type="{}itemtype_criteria_type" minOccurs="0"/>
 *         &lt;element name="vendor_item_criteria" type="{}vendor_item_criteria_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventory_criteria_group", propOrder = {
    "itemCriteria",
    "itemAssocCriteria",
    "itemStatusCriteria",
    "itemStatusHistCriteria",
    "itemTypeCriteria",
    "vendorItemCriteria"
})
public class InventoryCriteriaGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "item_criteria")
    protected ItemCriteriaType itemCriteria;
    @XmlElement(name = "item_assoc_criteria")
    protected ItemAssociationCriteriaType itemAssocCriteria;
    @XmlElement(name = "item_status_criteria")
    protected ItemStatusCriteriaType itemStatusCriteria;
    @XmlElement(name = "item_status_hist_criteria")
    protected ItemStatusHistoryCriteriaType itemStatusHistCriteria;
    @XmlElement(name = "item_type_criteria")
    protected ItemtypeCriteriaType itemTypeCriteria;
    @XmlElement(name = "vendor_item_criteria")
    protected VendorItemCriteriaType vendorItemCriteria;

    /**
     * Gets the value of the itemCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCriteriaType }
     *     
     */
    public ItemCriteriaType getItemCriteria() {
        return itemCriteria;
    }

    /**
     * Sets the value of the itemCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCriteriaType }
     *     
     */
    public void setItemCriteria(ItemCriteriaType value) {
        this.itemCriteria = value;
    }

    /**
     * Gets the value of the itemAssocCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ItemAssociationCriteriaType }
     *     
     */
    public ItemAssociationCriteriaType getItemAssocCriteria() {
        return itemAssocCriteria;
    }

    /**
     * Sets the value of the itemAssocCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAssociationCriteriaType }
     *     
     */
    public void setItemAssocCriteria(ItemAssociationCriteriaType value) {
        this.itemAssocCriteria = value;
    }

    /**
     * Gets the value of the itemStatusCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ItemStatusCriteriaType }
     *     
     */
    public ItemStatusCriteriaType getItemStatusCriteria() {
        return itemStatusCriteria;
    }

    /**
     * Sets the value of the itemStatusCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemStatusCriteriaType }
     *     
     */
    public void setItemStatusCriteria(ItemStatusCriteriaType value) {
        this.itemStatusCriteria = value;
    }

    /**
     * Gets the value of the itemStatusHistCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ItemStatusHistoryCriteriaType }
     *     
     */
    public ItemStatusHistoryCriteriaType getItemStatusHistCriteria() {
        return itemStatusHistCriteria;
    }

    /**
     * Sets the value of the itemStatusHistCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemStatusHistoryCriteriaType }
     *     
     */
    public void setItemStatusHistCriteria(ItemStatusHistoryCriteriaType value) {
        this.itemStatusHistCriteria = value;
    }

    /**
     * Gets the value of the itemTypeCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ItemtypeCriteriaType }
     *     
     */
    public ItemtypeCriteriaType getItemTypeCriteria() {
        return itemTypeCriteria;
    }

    /**
     * Sets the value of the itemTypeCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemtypeCriteriaType }
     *     
     */
    public void setItemTypeCriteria(ItemtypeCriteriaType value) {
        this.itemTypeCriteria = value;
    }

    /**
     * Gets the value of the vendorItemCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link VendorItemCriteriaType }
     *     
     */
    public VendorItemCriteriaType getVendorItemCriteria() {
        return vendorItemCriteria;
    }

    /**
     * Sets the value of the vendorItemCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorItemCriteriaType }
     *     
     */
    public void setVendorItemCriteria(VendorItemCriteriaType value) {
        this.vendorItemCriteria = value;
    }

}
