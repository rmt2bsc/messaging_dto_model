//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.22 at 04:34:54 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * Describes general code details data 
 * 
 * <p>Java class for code_detail_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="code_detail_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="shortdesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longdesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "code_detail_type", propOrder = {
    "codeId",
    "groupId",
    "shortdesc",
    "longdesc"
})
public class CodeDetailType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "code_id", required = true, defaultValue = "0")
    protected BigInteger codeId;
    @XmlElement(name = "group_id", required = true, defaultValue = "0")
    protected BigInteger groupId;
    @XmlElement(required = true)
    protected String shortdesc;
    @XmlElement(required = true)
    protected String longdesc;
    @XmlAttribute(name = "label")
    protected String label;

    /**
     * Gets the value of the codeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodeId() {
        return codeId;
    }

    /**
     * Sets the value of the codeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodeId(BigInteger value) {
        this.codeId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupId(BigInteger value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the shortdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortdesc() {
        return shortdesc;
    }

    /**
     * Sets the value of the shortdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortdesc(String value) {
        this.shortdesc = value;
    }

    /**
     * Gets the value of the longdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongdesc() {
        return longdesc;
    }

    /**
     * Sets the value of the longdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongdesc(String value) {
        this.longdesc = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
