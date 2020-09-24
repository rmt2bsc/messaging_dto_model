//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.24 at 04:08:24 PM CDT 
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
 * The criteria type used for audio/video requests.
 * 
 * <p>Java class for audio_video_criteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audio_video_criteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="project_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="project_type_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="genre_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="media_type_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ripped" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="project_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="project_year" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="artist_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="artist_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="track_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="track_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="track_hours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="track_minutes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audio_video_criteria", propOrder = {
    "projectId",
    "projectTypeId",
    "genreId",
    "mediaTypeId",
    "ripped",
    "projectTitle",
    "projectYear",
    "artistId",
    "artistName",
    "trackId",
    "trackTitle",
    "trackHours",
    "trackMinutes"
})
public class AudioVideoCriteria
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "project_id")
    protected BigInteger projectId;
    @XmlElement(name = "project_type_id")
    protected BigInteger projectTypeId;
    @XmlElement(name = "genre_id")
    protected BigInteger genreId;
    @XmlElement(name = "media_type_id")
    protected BigInteger mediaTypeId;
    protected BigInteger ripped;
    @XmlElement(name = "project_title", required = true)
    protected String projectTitle;
    @XmlElement(name = "project_year")
    protected BigInteger projectYear;
    @XmlElement(name = "artist_id")
    protected BigInteger artistId;
    @XmlElement(name = "artist_name")
    protected String artistName;
    @XmlElement(name = "track_id")
    protected BigInteger trackId;
    @XmlElement(name = "track_title")
    protected String trackTitle;
    @XmlElement(name = "track_hours")
    protected BigInteger trackHours;
    @XmlElement(name = "track_minutes")
    protected BigInteger trackMinutes;

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
     * Gets the value of the projectTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectTypeId() {
        return projectTypeId;
    }

    /**
     * Sets the value of the projectTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectTypeId(BigInteger value) {
        this.projectTypeId = value;
    }

    /**
     * Gets the value of the genreId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGenreId() {
        return genreId;
    }

    /**
     * Sets the value of the genreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGenreId(BigInteger value) {
        this.genreId = value;
    }

    /**
     * Gets the value of the mediaTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMediaTypeId() {
        return mediaTypeId;
    }

    /**
     * Sets the value of the mediaTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMediaTypeId(BigInteger value) {
        this.mediaTypeId = value;
    }

    /**
     * Gets the value of the ripped property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRipped() {
        return ripped;
    }

    /**
     * Sets the value of the ripped property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRipped(BigInteger value) {
        this.ripped = value;
    }

    /**
     * Gets the value of the projectTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectTitle() {
        return projectTitle;
    }

    /**
     * Sets the value of the projectTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectTitle(String value) {
        this.projectTitle = value;
    }

    /**
     * Gets the value of the projectYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectYear() {
        return projectYear;
    }

    /**
     * Sets the value of the projectYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectYear(BigInteger value) {
        this.projectYear = value;
    }

    /**
     * Gets the value of the artistId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArtistId() {
        return artistId;
    }

    /**
     * Sets the value of the artistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArtistId(BigInteger value) {
        this.artistId = value;
    }

    /**
     * Gets the value of the artistName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * Sets the value of the artistName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtistName(String value) {
        this.artistName = value;
    }

    /**
     * Gets the value of the trackId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrackId() {
        return trackId;
    }

    /**
     * Sets the value of the trackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrackId(BigInteger value) {
        this.trackId = value;
    }

    /**
     * Gets the value of the trackTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackTitle() {
        return trackTitle;
    }

    /**
     * Sets the value of the trackTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackTitle(String value) {
        this.trackTitle = value;
    }

    /**
     * Gets the value of the trackHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrackHours() {
        return trackHours;
    }

    /**
     * Sets the value of the trackHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrackHours(BigInteger value) {
        this.trackHours = value;
    }

    /**
     * Gets the value of the trackMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrackMinutes() {
        return trackMinutes;
    }

    /**
     * Sets the value of the trackMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrackMinutes(BigInteger value) {
        this.trackMinutes = value;
    }

}
