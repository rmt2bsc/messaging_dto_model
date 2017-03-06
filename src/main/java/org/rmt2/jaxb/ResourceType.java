//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.06 at 01:50:09 AM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * This is the document that manages user resource types minus resource type and resource sub type elements.
 * 
 * <p>Java class for resource_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsrc_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="rsrc_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secured" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rsrc_type_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="rsrc_type_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rsrc_subtype_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="rsrc_subtype_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource_type", propOrder = {
    "rsrcId",
    "rsrcName",
    "url",
    "host",
    "description",
    "secured",
    "rsrcTypeId",
    "rsrcTypeName",
    "rsrcSubtypeId",
    "rsrcSubtypeName"
})
public class ResourceType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "rsrc_id", required = true, nillable = true)
    protected BigInteger rsrcId;
    @XmlElement(name = "rsrc_name", required = true, nillable = true)
    protected String rsrcName;
    @XmlElement(required = true, nillable = true)
    protected String url;
    @XmlElement(required = true, nillable = true)
    protected String host;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, type = Boolean.class, defaultValue = "false", nillable = true)
    protected Boolean secured;
    @XmlElement(name = "rsrc_type_id", required = true, nillable = true)
    protected BigInteger rsrcTypeId;
    @XmlElement(name = "rsrc_type_name", required = true, nillable = true)
    protected String rsrcTypeName;
    @XmlElement(name = "rsrc_subtype_id", required = true, nillable = true)
    protected BigInteger rsrcSubtypeId;
    @XmlElement(name = "rsrc_subtype_name", required = true, nillable = true)
    protected String rsrcSubtypeName;

    /**
     * Gets the value of the rsrcId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRsrcId() {
        return rsrcId;
    }

    /**
     * Sets the value of the rsrcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRsrcId(BigInteger value) {
        this.rsrcId = value;
    }

    /**
     * Gets the value of the rsrcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcName() {
        return rsrcName;
    }

    /**
     * Sets the value of the rsrcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcName(String value) {
        this.rsrcName = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
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
     * Gets the value of the secured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecured() {
        return secured;
    }

    /**
     * Sets the value of the secured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecured(Boolean value) {
        this.secured = value;
    }

    /**
     * Gets the value of the rsrcTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRsrcTypeId() {
        return rsrcTypeId;
    }

    /**
     * Sets the value of the rsrcTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRsrcTypeId(BigInteger value) {
        this.rsrcTypeId = value;
    }

    /**
     * Gets the value of the rsrcTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcTypeName() {
        return rsrcTypeName;
    }

    /**
     * Sets the value of the rsrcTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcTypeName(String value) {
        this.rsrcTypeName = value;
    }

    /**
     * Gets the value of the rsrcSubtypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRsrcSubtypeId() {
        return rsrcSubtypeId;
    }

    /**
     * Sets the value of the rsrcSubtypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRsrcSubtypeId(BigInteger value) {
        this.rsrcSubtypeId = value;
    }

    /**
     * Gets the value of the rsrcSubtypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcSubtypeName() {
        return rsrcSubtypeName;
    }

    /**
     * Sets the value of the rsrcSubtypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcSubtypeName(String value) {
        this.rsrcSubtypeName = value;
    }

}
