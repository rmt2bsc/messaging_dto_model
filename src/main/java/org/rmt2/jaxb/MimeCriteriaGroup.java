//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.12 at 03:56:31 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for mime_criteria_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mime_criteria_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="content_criteria" type="{}content_criteria_type" minOccurs="0"/>
 *         &lt;element name="audio_video_criteria" type="{}audio_video_criteria_type" minOccurs="0"/>
 *         &lt;element name="audio_batch_import_criteria" type="{}audio_batch_import_criteria_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mime_criteria_group", propOrder = {
    "contentCriteria",
    "audioVideoCriteria",
    "audioBatchImportCriteria"
})
public class MimeCriteriaGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "content_criteria")
    protected ContentCriteriaType contentCriteria;
    @XmlElement(name = "audio_video_criteria")
    protected AudioVideoCriteriaType audioVideoCriteria;
    @XmlElement(name = "audio_batch_import_criteria")
    protected AudioBatchImportCriteriaType audioBatchImportCriteria;

    /**
     * Gets the value of the contentCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ContentCriteriaType }
     *     
     */
    public ContentCriteriaType getContentCriteria() {
        return contentCriteria;
    }

    /**
     * Sets the value of the contentCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentCriteriaType }
     *     
     */
    public void setContentCriteria(ContentCriteriaType value) {
        this.contentCriteria = value;
    }

    /**
     * Gets the value of the audioVideoCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVideoCriteriaType }
     *     
     */
    public AudioVideoCriteriaType getAudioVideoCriteria() {
        return audioVideoCriteria;
    }

    /**
     * Sets the value of the audioVideoCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVideoCriteriaType }
     *     
     */
    public void setAudioVideoCriteria(AudioVideoCriteriaType value) {
        this.audioVideoCriteria = value;
    }

    /**
     * Gets the value of the audioBatchImportCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AudioBatchImportCriteriaType }
     *     
     */
    public AudioBatchImportCriteriaType getAudioBatchImportCriteria() {
        return audioBatchImportCriteria;
    }

    /**
     * Sets the value of the audioBatchImportCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioBatchImportCriteriaType }
     *     
     */
    public void setAudioBatchImportCriteria(AudioBatchImportCriteriaType value) {
        this.audioBatchImportCriteria = value;
    }

}
