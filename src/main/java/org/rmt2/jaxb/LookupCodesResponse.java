//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.27 at 03:58:47 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{}header_type"/>
 *         &lt;element name="reply_status" type="{}reply_status_type" minOccurs="0"/>
 *         &lt;element name="group_codes" type="{}code_group_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detail_codes" type="{}code_detail_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "replyStatus",
    "groupCodes",
    "detailCodes"
})
@XmlRootElement(name = "LookupCodesResponse")
public class LookupCodesResponse
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected HeaderType header;
    @XmlElement(name = "reply_status")
    protected ReplyStatusType replyStatus;
    @XmlElement(name = "group_codes")
    protected List<CodeGroupType> groupCodes;
    @XmlElement(name = "detail_codes")
    protected List<CodeDetailType> detailCodes;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the replyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyStatusType }
     *     
     */
    public ReplyStatusType getReplyStatus() {
        return replyStatus;
    }

    /**
     * Sets the value of the replyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyStatusType }
     *     
     */
    public void setReplyStatus(ReplyStatusType value) {
        this.replyStatus = value;
    }

    /**
     * Gets the value of the groupCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeGroupType }
     * 
     * 
     */
    public List<CodeGroupType> getGroupCodes() {
        if (groupCodes == null) {
            groupCodes = new ArrayList<CodeGroupType>();
        }
        return this.groupCodes;
    }

    /**
     * Gets the value of the detailCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeDetailType }
     * 
     * 
     */
    public List<CodeDetailType> getDetailCodes() {
        if (detailCodes == null) {
            detailCodes = new ArrayList<CodeDetailType>();
        }
        return this.detailCodes;
    }

}
