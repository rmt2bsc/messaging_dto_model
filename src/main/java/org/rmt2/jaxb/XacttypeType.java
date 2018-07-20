//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:06:07 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.RMT2Base;


/**
 * <p>Java class for xacttype_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xacttype_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xact_type_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_multiplier" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="to_acct_type_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="from_multiplier" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="has_subsidiary" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="from_acct_type_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="to_acct_catg_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="xact_catg_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="from_acct_catg_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xacttype_type", propOrder = {
    "xactTypeId",
    "code",
    "description",
    "toMultiplier",
    "toAcctTypeId",
    "fromMultiplier",
    "hasSubsidiary",
    "fromAcctTypeId",
    "toAcctCatgId",
    "xactCatgId",
    "fromAcctCatgId"
})
public class XacttypeType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "xact_type_id", required = true)
    protected BigInteger xactTypeId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String code;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "to_multiplier", required = true)
    protected BigInteger toMultiplier;
    @XmlElement(name = "to_acct_type_id", required = true)
    protected BigInteger toAcctTypeId;
    @XmlElement(name = "from_multiplier", required = true)
    protected BigInteger fromMultiplier;
    @XmlElement(name = "has_subsidiary", required = true)
    protected BigInteger hasSubsidiary;
    @XmlElement(name = "from_acct_type_id", required = true)
    protected BigInteger fromAcctTypeId;
    @XmlElement(name = "to_acct_catg_id", required = true)
    protected BigInteger toAcctCatgId;
    @XmlElement(name = "xact_catg_id", required = true)
    protected BigInteger xactCatgId;
    @XmlElement(name = "from_acct_catg_id", required = true)
    protected BigInteger fromAcctCatgId;

    /**
     * Gets the value of the xactTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXactTypeId() {
        return xactTypeId;
    }

    /**
     * Sets the value of the xactTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXactTypeId(BigInteger value) {
        this.xactTypeId = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     * Gets the value of the toMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToMultiplier() {
        return toMultiplier;
    }

    /**
     * Sets the value of the toMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToMultiplier(BigInteger value) {
        this.toMultiplier = value;
    }

    /**
     * Gets the value of the toAcctTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToAcctTypeId() {
        return toAcctTypeId;
    }

    /**
     * Sets the value of the toAcctTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToAcctTypeId(BigInteger value) {
        this.toAcctTypeId = value;
    }

    /**
     * Gets the value of the fromMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromMultiplier() {
        return fromMultiplier;
    }

    /**
     * Sets the value of the fromMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFromMultiplier(BigInteger value) {
        this.fromMultiplier = value;
    }

    /**
     * Gets the value of the hasSubsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHasSubsidiary() {
        return hasSubsidiary;
    }

    /**
     * Sets the value of the hasSubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHasSubsidiary(BigInteger value) {
        this.hasSubsidiary = value;
    }

    /**
     * Gets the value of the fromAcctTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromAcctTypeId() {
        return fromAcctTypeId;
    }

    /**
     * Sets the value of the fromAcctTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFromAcctTypeId(BigInteger value) {
        this.fromAcctTypeId = value;
    }

    /**
     * Gets the value of the toAcctCatgId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToAcctCatgId() {
        return toAcctCatgId;
    }

    /**
     * Sets the value of the toAcctCatgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToAcctCatgId(BigInteger value) {
        this.toAcctCatgId = value;
    }

    /**
     * Gets the value of the xactCatgId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXactCatgId() {
        return xactCatgId;
    }

    /**
     * Sets the value of the xactCatgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXactCatgId(BigInteger value) {
        this.xactCatgId = value;
    }

    /**
     * Gets the value of the fromAcctCatgId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromAcctCatgId() {
        return fromAcctCatgId;
    }

    /**
     * Sets the value of the fromAcctCatgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFromAcctCatgId(BigInteger value) {
        this.fromAcctCatgId = value;
    }

}
