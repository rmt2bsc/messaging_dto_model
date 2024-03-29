//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.24 at 04:55:19 PM CST 
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
 * <p>Java class for xacttype_item_activity_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xacttype_item_activity_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xact_type_item_actv_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="xact" type="{}xact_type"/>
 *         &lt;element name="xact_item" type="{}xacttype_item_type"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "xacttype_item_activity_type", propOrder = {
    "xactTypeItemActvId",
    "xact",
    "xactItem",
    "amount",
    "description",
    "tracking"
})
public class XacttypeItemActivityType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "xact_type_item_actv_id", required = true)
    protected BigInteger xactTypeItemActvId;
    @XmlElement(required = true)
    protected XactType xact;
    @XmlElement(name = "xact_item", required = true)
    protected XacttypeItemType xactItem;
    @XmlElement(required = true)
    protected BigDecimal amount;
    @XmlElement(required = true)
    protected String description;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the xactTypeItemActvId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXactTypeItemActvId() {
        return xactTypeItemActvId;
    }

    /**
     * Sets the value of the xactTypeItemActvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXactTypeItemActvId(BigInteger value) {
        this.xactTypeItemActvId = value;
    }

    /**
     * Gets the value of the xact property.
     * 
     * @return
     *     possible object is
     *     {@link XactType }
     *     
     */
    public XactType getXact() {
        return xact;
    }

    /**
     * Sets the value of the xact property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactType }
     *     
     */
    public void setXact(XactType value) {
        this.xact = value;
    }

    /**
     * Gets the value of the xactItem property.
     * 
     * @return
     *     possible object is
     *     {@link XacttypeItemType }
     *     
     */
    public XacttypeItemType getXactItem() {
        return xactItem;
    }

    /**
     * Sets the value of the xactItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link XacttypeItemType }
     *     
     */
    public void setXactItem(XacttypeItemType value) {
        this.xactItem = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
