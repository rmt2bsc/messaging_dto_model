//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.24 at 04:55:19 PM CST 
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
 * <p>Java class for project_task_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="project_task_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="project_task_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="project_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="project_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="task_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="task_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="delete_project_task" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="daily_hours" type="{}event_type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "project_task_type", propOrder = {
    "projectTaskId",
    "projectId",
    "projectName",
    "taskId",
    "taskName",
    "deleteProjectTask",
    "dailyHours"
})
public class ProjectTaskType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "project_task_id", required = true)
    protected BigInteger projectTaskId;
    @XmlElement(name = "project_id", required = true)
    protected BigInteger projectId;
    @XmlElement(name = "project_name", required = true)
    protected String projectName;
    @XmlElement(name = "task_id", required = true)
    protected BigInteger taskId;
    @XmlElement(name = "task_name", required = true)
    protected String taskName;
    @XmlElement(name = "delete_project_task", defaultValue = "false")
    protected boolean deleteProjectTask;
    @XmlElement(name = "daily_hours", required = true)
    protected List<EventType> dailyHours;

    /**
     * Gets the value of the projectTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectTaskId() {
        return projectTaskId;
    }

    /**
     * Sets the value of the projectTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectTaskId(BigInteger value) {
        this.projectTaskId = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectId(BigInteger value) {
        this.projectId = value;
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
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaskId(BigInteger value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the taskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Sets the value of the taskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskName(String value) {
        this.taskName = value;
    }

    /**
     * Gets the value of the deleteProjectTask property.
     * 
     */
    public boolean isDeleteProjectTask() {
        return deleteProjectTask;
    }

    /**
     * Sets the value of the deleteProjectTask property.
     * 
     */
    public void setDeleteProjectTask(boolean value) {
        this.deleteProjectTask = value;
    }

    /**
     * Gets the value of the dailyHours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dailyHours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDailyHours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * 
     * 
     */
    public List<EventType> getDailyHours() {
        if (dailyHours == null) {
            dailyHours = new ArrayList<EventType>();
        }
        return this.dailyHours;
    }

}
