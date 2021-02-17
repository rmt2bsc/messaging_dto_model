//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.17 at 01:06:13 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for user_app_roles_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user_app_roles_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="app_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="app_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="app_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="app_active" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="role_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="role_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="role_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="app_role_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="app_role_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="app_role_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="app_role_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user_app_roles_criteria_type", propOrder = {
    "loginId",
    "userName",
    "appId",
    "appCode",
    "appDescription",
    "appActive",
    "roleId",
    "roleName",
    "roleDescription",
    "appRoleId",
    "appRoleCode",
    "appRoleName",
    "appRoleDescription"
})
public class UserAppRolesCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "login_id")
    protected Integer loginId;
    @XmlElement(name = "user_name")
    protected String userName;
    @XmlElement(name = "app_id")
    protected Integer appId;
    @XmlElement(name = "app_code")
    protected String appCode;
    @XmlElement(name = "app_description")
    protected String appDescription;
    @XmlElement(name = "app_active")
    protected Integer appActive;
    @XmlElement(name = "role_id")
    protected int roleId;
    @XmlElement(name = "role_name")
    protected String roleName;
    @XmlElement(name = "role_description")
    protected String roleDescription;
    @XmlElement(name = "app_role_id")
    protected int appRoleId;
    @XmlElement(name = "app_role_code")
    protected String appRoleCode;
    @XmlElement(name = "app_role_name")
    protected String appRoleName;
    @XmlElement(name = "app_role_description")
    protected String appRoleDescription;

    /**
     * Gets the value of the loginId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoginId() {
        return loginId;
    }

    /**
     * Sets the value of the loginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoginId(Integer value) {
        this.loginId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppId(Integer value) {
        this.appId = value;
    }

    /**
     * Gets the value of the appCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * Sets the value of the appCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppCode(String value) {
        this.appCode = value;
    }

    /**
     * Gets the value of the appDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppDescription() {
        return appDescription;
    }

    /**
     * Sets the value of the appDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppDescription(String value) {
        this.appDescription = value;
    }

    /**
     * Gets the value of the appActive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppActive() {
        return appActive;
    }

    /**
     * Sets the value of the appActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppActive(Integer value) {
        this.appActive = value;
    }

    /**
     * Gets the value of the roleId property.
     * 
     */
    public int getRoleId() {
        return roleId;
    }

    /**
     * Sets the value of the roleId property.
     * 
     */
    public void setRoleId(int value) {
        this.roleId = value;
    }

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the roleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * Sets the value of the roleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleDescription(String value) {
        this.roleDescription = value;
    }

    /**
     * Gets the value of the appRoleId property.
     * 
     */
    public int getAppRoleId() {
        return appRoleId;
    }

    /**
     * Sets the value of the appRoleId property.
     * 
     */
    public void setAppRoleId(int value) {
        this.appRoleId = value;
    }

    /**
     * Gets the value of the appRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRoleCode() {
        return appRoleCode;
    }

    /**
     * Sets the value of the appRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRoleCode(String value) {
        this.appRoleCode = value;
    }

    /**
     * Gets the value of the appRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRoleName() {
        return appRoleName;
    }

    /**
     * Sets the value of the appRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRoleName(String value) {
        this.appRoleName = value;
    }

    /**
     * Gets the value of the appRoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRoleDescription() {
        return appRoleDescription;
    }

    /**
     * Sets the value of the appRoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRoleDescription(String value) {
        this.appRoleDescription = value;
    }

}
