//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.24 at 04:55:19 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for auth_criteria_group_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auth_criteria_group_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_criteria" type="{}user_criteria_type" minOccurs="0"/>
 *         &lt;element name="user_app_roles_criteria" type="{}user_app_roles_criteria_type" minOccurs="0"/>
 *         &lt;element name="resource_criteria" type="{}resource_criteria_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auth_criteria_group_type", propOrder = {
    "userCriteria",
    "userAppRolesCriteria",
    "resourceCriteria"
})
public class AuthCriteriaGroupType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "user_criteria")
    protected UserCriteriaType userCriteria;
    @XmlElement(name = "user_app_roles_criteria")
    protected UserAppRolesCriteriaType userAppRolesCriteria;
    @XmlElement(name = "resource_criteria")
    protected ResourceCriteriaType resourceCriteria;

    /**
     * Gets the value of the userCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link UserCriteriaType }
     *     
     */
    public UserCriteriaType getUserCriteria() {
        return userCriteria;
    }

    /**
     * Sets the value of the userCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCriteriaType }
     *     
     */
    public void setUserCriteria(UserCriteriaType value) {
        this.userCriteria = value;
    }

    /**
     * Gets the value of the userAppRolesCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link UserAppRolesCriteriaType }
     *     
     */
    public UserAppRolesCriteriaType getUserAppRolesCriteria() {
        return userAppRolesCriteria;
    }

    /**
     * Sets the value of the userAppRolesCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAppRolesCriteriaType }
     *     
     */
    public void setUserAppRolesCriteria(UserAppRolesCriteriaType value) {
        this.userAppRolesCriteria = value;
    }

    /**
     * Gets the value of the resourceCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCriteriaType }
     *     
     */
    public ResourceCriteriaType getResourceCriteria() {
        return resourceCriteria;
    }

    /**
     * Sets the value of the resourceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCriteriaType }
     *     
     */
    public void setResourceCriteria(ResourceCriteriaType value) {
        this.resourceCriteria = value;
    }

}
