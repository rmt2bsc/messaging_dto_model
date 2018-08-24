//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.24 at 02:17:56 PM CDT 
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
 * This is the document that manages resource types.
 * 
 * <p>Java class for resourcetype_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourcetype_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsrc_type_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="rsrc_type_descr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourcetype_type", propOrder = {
    "rsrcTypeId",
    "rsrcTypeDescr"
})
public class ResourcetypeType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "rsrc_type_id", required = true)
    protected BigInteger rsrcTypeId;
    @XmlElement(name = "rsrc_type_descr", required = true)
    protected String rsrcTypeDescr;

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
     * Gets the value of the rsrcTypeDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcTypeDescr() {
        return rsrcTypeDescr;
    }

    /**
     * Sets the value of the rsrcTypeDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcTypeDescr(String value) {
        this.rsrcTypeDescr = value;
    }

}
