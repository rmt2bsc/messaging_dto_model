//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 11:37:22 AM CST 
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
 * <p>Java class for employee_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employee_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="employee_type_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="manager_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="is_manager" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="employee_title_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="company_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="project_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="login_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee_criteria_type", propOrder = {
    "employeeId",
    "employeeTypeId",
    "managerId",
    "isManager",
    "employeeTitleId",
    "firstName",
    "lastName",
    "companyName",
    "projectName",
    "loginName",
    "ssn"
})
public class EmployeeCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "employee_id", required = true)
    protected BigInteger employeeId;
    @XmlElement(name = "employee_type_id", required = true)
    protected BigInteger employeeTypeId;
    @XmlElement(name = "manager_id", required = true)
    protected BigInteger managerId;
    @XmlElement(name = "is_manager")
    protected Boolean isManager;
    @XmlElement(name = "employee_title_id", required = true)
    protected BigInteger employeeTitleId;
    @XmlElement(name = "first_name", required = true)
    protected String firstName;
    @XmlElement(name = "last_name", required = true)
    protected String lastName;
    @XmlElement(name = "company_name", required = true)
    protected String companyName;
    @XmlElement(name = "project_name", required = true)
    protected String projectName;
    @XmlElement(name = "login_name", required = true)
    protected String loginName;
    @XmlElement(required = true)
    protected String ssn;

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeeId(BigInteger value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the employeeTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeeTypeId() {
        return employeeTypeId;
    }

    /**
     * Sets the value of the employeeTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeeTypeId(BigInteger value) {
        this.employeeTypeId = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManagerId(BigInteger value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the isManager property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManager() {
        return isManager;
    }

    /**
     * Sets the value of the isManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManager(Boolean value) {
        this.isManager = value;
    }

    /**
     * Gets the value of the employeeTitleId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeeTitleId() {
        return employeeTitleId;
    }

    /**
     * Sets the value of the employeeTitleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeeTitleId(BigInteger value) {
        this.employeeTitleId = value;
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
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
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

}
