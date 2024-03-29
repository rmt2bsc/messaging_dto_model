//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.24 at 04:55:19 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for inventory_detail_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inventory_detail_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inv_item" type="{}inventory_item_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inv_item_status" type="{}inventory_item_status_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inv_item_type" type="{}inventory_itemtype_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inv_item_status_hist" type="{}inventory_status_history_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vendor_item" type="{}vendor_item_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventory_detail_group", propOrder = {
    "invItem",
    "invItemStatus",
    "invItemType",
    "invItemStatusHist",
    "vendorItem"
})
public class InventoryDetailGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "inv_item")
    protected List<InventoryItemType> invItem;
    @XmlElement(name = "inv_item_status")
    protected List<InventoryItemStatusType> invItemStatus;
    @XmlElement(name = "inv_item_type")
    protected List<InventoryItemtypeType> invItemType;
    @XmlElement(name = "inv_item_status_hist")
    protected List<InventoryStatusHistoryType> invItemStatusHist;
    @XmlElement(name = "vendor_item")
    protected List<VendorItemType> vendorItem;

    /**
     * Gets the value of the invItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryItemType }
     * 
     * 
     */
    public List<InventoryItemType> getInvItem() {
        if (invItem == null) {
            invItem = new ArrayList<InventoryItemType>();
        }
        return this.invItem;
    }

    /**
     * Gets the value of the invItemStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invItemStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvItemStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryItemStatusType }
     * 
     * 
     */
    public List<InventoryItemStatusType> getInvItemStatus() {
        if (invItemStatus == null) {
            invItemStatus = new ArrayList<InventoryItemStatusType>();
        }
        return this.invItemStatus;
    }

    /**
     * Gets the value of the invItemType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invItemType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvItemType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryItemtypeType }
     * 
     * 
     */
    public List<InventoryItemtypeType> getInvItemType() {
        if (invItemType == null) {
            invItemType = new ArrayList<InventoryItemtypeType>();
        }
        return this.invItemType;
    }

    /**
     * Gets the value of the invItemStatusHist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invItemStatusHist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvItemStatusHist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryStatusHistoryType }
     * 
     * 
     */
    public List<InventoryStatusHistoryType> getInvItemStatusHist() {
        if (invItemStatusHist == null) {
            invItemStatusHist = new ArrayList<InventoryStatusHistoryType>();
        }
        return this.invItemStatusHist;
    }

    /**
     * Gets the value of the vendorItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorItemType }
     * 
     * 
     */
    public List<VendorItemType> getVendorItem() {
        if (vendorItem == null) {
            vendorItem = new ArrayList<VendorItemType>();
        }
        return this.vendorItem;
    }

}
