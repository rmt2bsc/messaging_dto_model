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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.RMT2Base;


/**
 * The profile of a user
 * 
 * <p>Java class for user_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="group_info" type="{}user_group_type" minOccurs="0"/>
 *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="short_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logged_in" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="total_logons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="term_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="session_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="granted_app_roles" type="{}user_app_roles_type" minOccurs="0"/>
 *         &lt;element name="revoked_app_roles" type="{}user_app_roles_type" minOccurs="0"/>
 *         &lt;element name="granted_resources" type="{}user_resource_access_list_type" minOccurs="0"/>
 *         &lt;element name="revoked_resources" type="{}user_resource_access_list_type" minOccurs="0"/>
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
@XmlType(name = "user_type", propOrder = {
    "loginId",
    "groupInfo",
    "userName",
    "firstName",
    "lastName",
    "shortName",
    "email",
    "loggedIn",
    "dob",
    "totalLogons",
    "ssn",
    "startDate",
    "termDate",
    "active",
    "description",
    "password",
    "sessionId",
    "grantedAppRoles",
    "revokedAppRoles",
    "grantedResources",
    "revokedResources",
    "tracking"
})
public class UserType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "login_id")
    protected Integer loginId;
    @XmlElement(name = "group_info")
    protected UserGroupType groupInfo;
    @XmlElement(name = "user_name")
    protected String userName;
    @XmlElement(name = "first_name")
    protected String firstName;
    @XmlElement(name = "last_name")
    protected String lastName;
    @XmlElement(name = "short_name")
    protected String shortName;
    protected String email;
    @XmlElement(name = "logged_in")
    protected Integer loggedIn;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlElement(name = "total_logons")
    protected Integer totalLogons;
    protected String ssn;
    @XmlElement(name = "start_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "term_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termDate;
    protected Integer active;
    protected String description;
    protected String password;
    @XmlElement(name = "session_id")
    protected String sessionId;
    @XmlElement(name = "granted_app_roles")
    protected UserAppRolesType grantedAppRoles;
    @XmlElement(name = "revoked_app_roles")
    protected UserAppRolesType revokedAppRoles;
    @XmlElement(name = "granted_resources")
    protected UserResourceAccessListType grantedResources;
    @XmlElement(name = "revoked_resources")
    protected UserResourceAccessListType revokedResources;
    protected RecordTrackingType tracking;

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
     * Gets the value of the groupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserGroupType }
     *     
     */
    public UserGroupType getGroupInfo() {
        return groupInfo;
    }

    /**
     * Sets the value of the groupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGroupType }
     *     
     */
    public void setGroupInfo(UserGroupType value) {
        this.groupInfo = value;
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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the loggedIn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoggedIn() {
        return loggedIn;
    }

    /**
     * Sets the value of the loggedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoggedIn(Integer value) {
        this.loggedIn = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDob(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the totalLogons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalLogons() {
        return totalLogons;
    }

    /**
     * Sets the value of the totalLogons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalLogons(Integer value) {
        this.totalLogons = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the termDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermDate() {
        return termDate;
    }

    /**
     * Sets the value of the termDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermDate(XMLGregorianCalendar value) {
        this.termDate = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActive(Integer value) {
        this.active = value;
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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the grantedAppRoles property.
     * 
     * @return
     *     possible object is
     *     {@link UserAppRolesType }
     *     
     */
    public UserAppRolesType getGrantedAppRoles() {
        return grantedAppRoles;
    }

    /**
     * Sets the value of the grantedAppRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAppRolesType }
     *     
     */
    public void setGrantedAppRoles(UserAppRolesType value) {
        this.grantedAppRoles = value;
    }

    /**
     * Gets the value of the revokedAppRoles property.
     * 
     * @return
     *     possible object is
     *     {@link UserAppRolesType }
     *     
     */
    public UserAppRolesType getRevokedAppRoles() {
        return revokedAppRoles;
    }

    /**
     * Sets the value of the revokedAppRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAppRolesType }
     *     
     */
    public void setRevokedAppRoles(UserAppRolesType value) {
        this.revokedAppRoles = value;
    }

    /**
     * Gets the value of the grantedResources property.
     * 
     * @return
     *     possible object is
     *     {@link UserResourceAccessListType }
     *     
     */
    public UserResourceAccessListType getGrantedResources() {
        return grantedResources;
    }

    /**
     * Sets the value of the grantedResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserResourceAccessListType }
     *     
     */
    public void setGrantedResources(UserResourceAccessListType value) {
        this.grantedResources = value;
    }

    /**
     * Gets the value of the revokedResources property.
     * 
     * @return
     *     possible object is
     *     {@link UserResourceAccessListType }
     *     
     */
    public UserResourceAccessListType getRevokedResources() {
        return revokedResources;
    }

    /**
     * Sets the value of the revokedResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserResourceAccessListType }
     *     
     */
    public void setRevokedResources(UserResourceAccessListType value) {
        this.revokedResources = value;
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
