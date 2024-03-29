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
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for mime_detail_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mime_detail_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audio_video_content" type="{}mime_content_type" minOccurs="0"/>
 *         &lt;element name="audio_video_details" type="{}audio_video_type" minOccurs="0"/>
 *         &lt;element name="batch_import_results" type="{}batch_import_type" minOccurs="0"/>
 *         &lt;element name="media_file_listener_details" type="{}media_file_listener_details_type" minOccurs="0"/>
 *         &lt;element name="genres" type="{}genres_type" minOccurs="0"/>
 *         &lt;element name="mediatypes" type="{}media_types" minOccurs="0"/>
 *         &lt;element name="projecttypes" type="{}project_types" minOccurs="0"/>
 *         &lt;element name="mimetypes" type="{}mime_types" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mime_detail_group", propOrder = {
    "audioVideoContent",
    "audioVideoDetails",
    "batchImportResults",
    "mediaFileListenerDetails",
    "genres",
    "mediatypes",
    "projecttypes",
    "mimetypes"
})
public class MimeDetailGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "audio_video_content")
    protected MimeContentType audioVideoContent;
    @XmlElement(name = "audio_video_details")
    protected AudioVideoType audioVideoDetails;
    @XmlElement(name = "batch_import_results")
    protected BatchImportType batchImportResults;
    @XmlElement(name = "media_file_listener_details")
    protected MediaFileListenerDetailsType mediaFileListenerDetails;
    protected GenresType genres;
    protected MediaTypes mediatypes;
    protected ProjectTypes projecttypes;
    protected MimeTypes mimetypes;

    /**
     * Gets the value of the audioVideoContent property.
     * 
     * @return
     *     possible object is
     *     {@link MimeContentType }
     *     
     */
    public MimeContentType getAudioVideoContent() {
        return audioVideoContent;
    }

    /**
     * Sets the value of the audioVideoContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeContentType }
     *     
     */
    public void setAudioVideoContent(MimeContentType value) {
        this.audioVideoContent = value;
    }

    /**
     * Gets the value of the audioVideoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVideoType }
     *     
     */
    public AudioVideoType getAudioVideoDetails() {
        return audioVideoDetails;
    }

    /**
     * Sets the value of the audioVideoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVideoType }
     *     
     */
    public void setAudioVideoDetails(AudioVideoType value) {
        this.audioVideoDetails = value;
    }

    /**
     * Gets the value of the batchImportResults property.
     * 
     * @return
     *     possible object is
     *     {@link BatchImportType }
     *     
     */
    public BatchImportType getBatchImportResults() {
        return batchImportResults;
    }

    /**
     * Sets the value of the batchImportResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchImportType }
     *     
     */
    public void setBatchImportResults(BatchImportType value) {
        this.batchImportResults = value;
    }

    /**
     * Gets the value of the mediaFileListenerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MediaFileListenerDetailsType }
     *     
     */
    public MediaFileListenerDetailsType getMediaFileListenerDetails() {
        return mediaFileListenerDetails;
    }

    /**
     * Sets the value of the mediaFileListenerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaFileListenerDetailsType }
     *     
     */
    public void setMediaFileListenerDetails(MediaFileListenerDetailsType value) {
        this.mediaFileListenerDetails = value;
    }

    /**
     * Gets the value of the genres property.
     * 
     * @return
     *     possible object is
     *     {@link GenresType }
     *     
     */
    public GenresType getGenres() {
        return genres;
    }

    /**
     * Sets the value of the genres property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenresType }
     *     
     */
    public void setGenres(GenresType value) {
        this.genres = value;
    }

    /**
     * Gets the value of the mediatypes property.
     * 
     * @return
     *     possible object is
     *     {@link MediaTypes }
     *     
     */
    public MediaTypes getMediatypes() {
        return mediatypes;
    }

    /**
     * Sets the value of the mediatypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTypes }
     *     
     */
    public void setMediatypes(MediaTypes value) {
        this.mediatypes = value;
    }

    /**
     * Gets the value of the projecttypes property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTypes }
     *     
     */
    public ProjectTypes getProjecttypes() {
        return projecttypes;
    }

    /**
     * Sets the value of the projecttypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTypes }
     *     
     */
    public void setProjecttypes(ProjectTypes value) {
        this.projecttypes = value;
    }

    /**
     * Gets the value of the mimetypes property.
     * 
     * @return
     *     possible object is
     *     {@link MimeTypes }
     *     
     */
    public MimeTypes getMimetypes() {
        return mimetypes;
    }

    /**
     * Sets the value of the mimetypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeTypes }
     *     
     */
    public void setMimetypes(MimeTypes value) {
        this.mimetypes = value;
    }

}
