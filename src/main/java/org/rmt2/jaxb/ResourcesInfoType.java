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
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * This is the document that manages user resource, resource type and resource sub type elements.
 * 
 * <p>Java class for resources_info_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resources_info_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resource" type="{}resource_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resourcetype" type="{}resourcetype_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resourcesubtype" type="{}resourcesubtype_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resources_info_type", propOrder = {
    "resource",
    "resourcetype",
    "resourcesubtype"
})
public class ResourcesInfoType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<ResourceType> resource;
    protected List<ResourcetypeType> resourcetype;
    protected List<ResourcesubtypeType> resourcesubtype;

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceType }
     * 
     * 
     */
    public List<ResourceType> getResource() {
        if (resource == null) {
            resource = new ArrayList<ResourceType>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the resourcetype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourcetype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourcetype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourcetypeType }
     * 
     * 
     */
    public List<ResourcetypeType> getResourcetype() {
        if (resourcetype == null) {
            resourcetype = new ArrayList<ResourcetypeType>();
        }
        return this.resourcetype;
    }

    /**
     * Gets the value of the resourcesubtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourcesubtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourcesubtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourcesubtypeType }
     * 
     * 
     */
    public List<ResourcesubtypeType> getResourcesubtype() {
        if (resourcesubtype == null) {
            resourcesubtype = new ArrayList<ResourcesubtypeType>();
        }
        return this.resourcesubtype;
    }

}
