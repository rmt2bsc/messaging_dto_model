//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.23 at 04:36:54 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for gl_criteria_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gl_criteria_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gl_criteria" type="{}gl_criteria_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gl_criteria_group", propOrder = {
    "glCriteria"
})
public class GlCriteriaGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "gl_criteria", required = true)
    protected GlCriteriaType glCriteria;

    /**
     * Gets the value of the glCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link GlCriteriaType }
     *     
     */
    public GlCriteriaType getGlCriteria() {
        return glCriteria;
    }

    /**
     * Sets the value of the glCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlCriteriaType }
     *     
     */
    public void setGlCriteria(GlCriteriaType value) {
        this.glCriteria = value;
    }

}
