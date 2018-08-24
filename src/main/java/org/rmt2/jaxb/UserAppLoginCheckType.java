//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.24 at 02:17:56 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * This is the document that manages user's  login credentials.
 * 
 * <p>Java class for user_app_login_check_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user_app_login_check_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="app_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="session_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signed_on" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="session_token" type="{}user_session_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user_app_login_check_type", propOrder = {
    "uid",
    "appCode",
    "sessionId",
    "signedOn",
    "sessionToken"
})
public class UserAppLoginCheckType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, defaultValue = "0")
    protected String uid;
    @XmlElement(name = "app_code", required = true)
    protected String appCode;
    @XmlElement(name = "session_id", required = true)
    protected String sessionId;
    @XmlElement(name = "signed_on")
    protected boolean signedOn;
    @XmlElement(name = "session_token", required = true)
    protected UserSessionType sessionToken;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
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
     * Gets the value of the signedOn property.
     * 
     */
    public boolean isSignedOn() {
        return signedOn;
    }

    /**
     * Sets the value of the signedOn property.
     * 
     */
    public void setSignedOn(boolean value) {
        this.signedOn = value;
    }

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link UserSessionType }
     *     
     */
    public UserSessionType getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSessionType }
     *     
     */
    public void setSessionToken(UserSessionType value) {
        this.sessionToken = value;
    }

}
