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
 * <p>Java class for gl_detail_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gl_detail_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account_type" type="{}gl_accounttype_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="account_category" type="{}gl_accountcatg_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="account" type="{}gl_account_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gl_detail_group", propOrder = {
    "accountType",
    "accountCategory",
    "account"
})
public class GlDetailGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "account_type")
    protected List<GlAccounttypeType> accountType;
    @XmlElement(name = "account_category")
    protected List<GlAccountcatgType> accountCategory;
    protected List<GlAccountType> account;

    /**
     * Gets the value of the accountType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlAccounttypeType }
     * 
     * 
     */
    public List<GlAccounttypeType> getAccountType() {
        if (accountType == null) {
            accountType = new ArrayList<GlAccounttypeType>();
        }
        return this.accountType;
    }

    /**
     * Gets the value of the accountCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlAccountcatgType }
     * 
     * 
     */
    public List<GlAccountcatgType> getAccountCategory() {
        if (accountCategory == null) {
            accountCategory = new ArrayList<GlAccountcatgType>();
        }
        return this.accountCategory;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlAccountType }
     * 
     * 
     */
    public List<GlAccountType> getAccount() {
        if (account == null) {
            account = new ArrayList<GlAccountType>();
        }
        return this.account;
    }

}
