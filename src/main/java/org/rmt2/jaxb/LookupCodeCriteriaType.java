//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.20 at 01:32:56 AM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for lookup_code_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lookup_code_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="groups" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *         &lt;element name="group_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="code_short_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code_long_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codes" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lookup_code_criteria_type", propOrder = {
    "all",
    "group",
    "groups",
    "groupDescription",
    "code",
    "codeShortDescription",
    "codeLongDescription",
    "codes"
})
public class LookupCodeCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected boolean all;
    @XmlElement(required = true)
    protected BigInteger group;
    @XmlElement(required = true)
    protected List<BigInteger> groups;
    @XmlElement(name = "group_description", required = true)
    protected String groupDescription;
    @XmlElement(required = true)
    protected BigInteger code;
    @XmlElement(name = "code_short_description", required = true)
    protected String codeShortDescription;
    @XmlElement(name = "code_long_description", required = true)
    protected String codeLongDescription;
    @XmlElement(required = true)
    protected List<BigInteger> codes;

    /**
     * Gets the value of the all property.
     * 
     */
    public boolean isAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     * 
     */
    public void setAll(boolean value) {
        this.all = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroup(BigInteger value) {
        this.group = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getGroups() {
        if (groups == null) {
            groups = new ArrayList<BigInteger>();
        }
        return this.groups;
    }

    /**
     * Gets the value of the groupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupDescription() {
        return groupDescription;
    }

    /**
     * Sets the value of the groupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupDescription(String value) {
        this.groupDescription = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCode(BigInteger value) {
        this.code = value;
    }

    /**
     * Gets the value of the codeShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeShortDescription() {
        return codeShortDescription;
    }

    /**
     * Sets the value of the codeShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeShortDescription(String value) {
        this.codeShortDescription = value;
    }

    /**
     * Gets the value of the codeLongDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeLongDescription() {
        return codeLongDescription;
    }

    /**
     * Sets the value of the codeLongDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeLongDescription(String value) {
        this.codeLongDescription = value;
    }

    /**
     * Gets the value of the codes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getCodes() {
        if (codes == null) {
            codes = new ArrayList<BigInteger>();
        }
        return this.codes;
    }

}
