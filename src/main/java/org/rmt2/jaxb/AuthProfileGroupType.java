//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.20 at 04:52:08 PM CDT 
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
 * <p>Java class for auth_profile_group_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auth_profile_group_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="application_info" type="{}application_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="role_info" type="{}role_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="app_role_info" type="{}app_role_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="user_group_info" type="{}user_group_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="user_app_role_info" type="{}user_app_role_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="user_info" type="{}user_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resources_info" type="{}resources_info_type" minOccurs="0"/>
 *         &lt;element name="application_access_info" type="{}application_access_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auth_profile_group_type", propOrder = {
    "applicationInfo",
    "roleInfo",
    "appRoleInfo",
    "userGroupInfo",
    "userAppRoleInfo",
    "userInfo",
    "resourcesInfo",
    "applicationAccessInfo"
})
public class AuthProfileGroupType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "application_info")
    protected List<ApplicationType> applicationInfo;
    @XmlElement(name = "role_info")
    protected List<RoleType> roleInfo;
    @XmlElement(name = "app_role_info")
    protected List<AppRoleType> appRoleInfo;
    @XmlElement(name = "user_group_info")
    protected List<UserGroupType> userGroupInfo;
    @XmlElement(name = "user_app_role_info")
    protected List<UserAppRoleType> userAppRoleInfo;
    @XmlElement(name = "user_info")
    protected List<UserType> userInfo;
    @XmlElement(name = "resources_info")
    protected ResourcesInfoType resourcesInfo;
    @XmlElement(name = "application_access_info")
    protected List<ApplicationAccessType> applicationAccessInfo;

    /**
     * Gets the value of the applicationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationType }
     * 
     * 
     */
    public List<ApplicationType> getApplicationInfo() {
        if (applicationInfo == null) {
            applicationInfo = new ArrayList<ApplicationType>();
        }
        return this.applicationInfo;
    }

    /**
     * Gets the value of the roleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleType }
     * 
     * 
     */
    public List<RoleType> getRoleInfo() {
        if (roleInfo == null) {
            roleInfo = new ArrayList<RoleType>();
        }
        return this.roleInfo;
    }

    /**
     * Gets the value of the appRoleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appRoleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppRoleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppRoleType }
     * 
     * 
     */
    public List<AppRoleType> getAppRoleInfo() {
        if (appRoleInfo == null) {
            appRoleInfo = new ArrayList<AppRoleType>();
        }
        return this.appRoleInfo;
    }

    /**
     * Gets the value of the userGroupInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userGroupInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserGroupInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserGroupType }
     * 
     * 
     */
    public List<UserGroupType> getUserGroupInfo() {
        if (userGroupInfo == null) {
            userGroupInfo = new ArrayList<UserGroupType>();
        }
        return this.userGroupInfo;
    }

    /**
     * Gets the value of the userAppRoleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAppRoleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserAppRoleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAppRoleType }
     * 
     * 
     */
    public List<UserAppRoleType> getUserAppRoleInfo() {
        if (userAppRoleInfo == null) {
            userAppRoleInfo = new ArrayList<UserAppRoleType>();
        }
        return this.userAppRoleInfo;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserType }
     * 
     * 
     */
    public List<UserType> getUserInfo() {
        if (userInfo == null) {
            userInfo = new ArrayList<UserType>();
        }
        return this.userInfo;
    }

    /**
     * Gets the value of the resourcesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcesInfoType }
     *     
     */
    public ResourcesInfoType getResourcesInfo() {
        return resourcesInfo;
    }

    /**
     * Sets the value of the resourcesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcesInfoType }
     *     
     */
    public void setResourcesInfo(ResourcesInfoType value) {
        this.resourcesInfo = value;
    }

    /**
     * Gets the value of the applicationAccessInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationAccessInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationAccessInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationAccessType }
     * 
     * 
     */
    public List<ApplicationAccessType> getApplicationAccessInfo() {
        if (applicationAccessInfo == null) {
            applicationAccessInfo = new ArrayList<ApplicationAccessType>();
        }
        return this.applicationAccessInfo;
    }

}
