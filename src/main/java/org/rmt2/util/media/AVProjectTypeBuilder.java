package org.rmt2.util.media;

import java.util.ArrayList;
import java.util.List;

import org.rmt2.jaxb.AvProjectType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.TrackType;

/**
 * AvProjectType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class AVProjectTypeBuilder {

    private AvProjectType subject;
    
    /**
     * Create a AVProjectTypeBuilder
     */
    private AVProjectTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createAvProjectType();
        subject.setTracks(f.createTracksType());
        subject.setProjectId(builder.projectId);
        subject.setArtistId(builder.artistId);
        subject.setProjectTypeId(builder.projectTypeId);
        subject.setGenreId(builder.genreId);
        subject.setContentId(builder.contentId);
        subject.setMediaTypeId(builder.mediaTypeId);
        subject.setTitle(builder.title);
        subject.setYear(builder.year);
        subject.setTotalTime(builder.totalTime);
        subject.setProducer(builder.producer);
        subject.setMasterDupId(builder.masterDupId);
        subject.setRipped(builder.ripped);
        subject.setCost(builder.cost);
        subject.setContentPath(builder.contentPath);
        subject.setContentFilename(builder.contentFilename);
        subject.setArtWorkPath(builder.artWorkPath);
        subject.setArtWorkFilename(builder.artWorkFilename);
        subject.setComments(builder.comments);
        if (builder.tracks != null && builder.tracks.size() > 0) {
            subject.getTracks().getTrack().addAll(builder.tracks);
        }
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link AVProjectTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {

        private int projectId;
        private int artistId;
        private int projectTypeId;
        private int genreId;
        private int contentId;
        private int mediaTypeId;
        private String title;
        private int year;
        private int totalTime;
        private String producer;
        private int masterDupId;
        private int ripped;
        private double cost;
        private String contentPath;
        private String contentFilename;
        private String artWorkPath;
        private String artWorkFilename;
        private String comments;
        private List<TrackType> tracks;
        private RecordTrackingType tracking;

        private Builder() {
            this.tracks = null;
            return;
        }

        /**
         * Creates a new Builder.
         * <p>
         * Declared private to prevent direct instantiation by external
         * consumers.
         */
        public static Builder create() {
            return new Builder();
        }

        /**
         * Set up project id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withProjectId(int value) {
            this.projectId = value;
            return this;
        }

        /**
         * Set up artist id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withArtistId(int value) {
            this.artistId = value;
            return this;
        }

        /**
         * Set up project type id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withProjectTypeId(int value) {
            this.projectTypeId = value;
            return this;
        }

        /**
         * Set up genre id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withGenreTypeId(int value) {
            this.genreId = value;
            return this;
        }

        /**
         * Set up content id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withContentId(int value) {
            this.contentId = value;
            return this;
        }

        /**
         * Set up media type id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withMediaTypeId(int value) {
            this.mediaTypeId = value;
            return this;
        }

        /**
         * Set up project name
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTitle(String value) {
            this.title = value;
            return this;
        }

        /**
         * Setup year.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withYearId(int value) {
            this.year = value;
            return this;
        }

        /**
         * Setup total time in minutes.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTotalTime(int value) {
            this.totalTime = value;
            return this;
        }

        /**
         * Setup producer
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withProducer(String value) {
            this.producer = value;
            return this;
        }

        /**
         * Set up master dup Id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withMasterDupId(int value) {
            this.masterDupId = value;
            return this;
        }

        /**
         * Set up ripped
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRipped(int value) {
            this.ripped = value;
            return this;
        }

        /**
         * Set up cost
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCost(double value) {
            this.cost = value;
            return this;
        }

        /**
         * Set up content path
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withContentPath(String value) {
            this.contentPath = value;
            return this;
        }

        /**
         * Set up content file name
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withContentFilename(String value) {
            this.contentFilename = value;
            return this;
        }

        /**
         * Set up Art Work path
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withArtWorkPath(String value) {
            this.artWorkPath = value;
            return this;
        }

        /**
         * Set up Art Work file name
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withArtWorkFilename(String value) {
            this.artWorkFilename = value;
            return this;
        }

        /**
         * Set up Comments
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withComments(String value) {
            this.comments = value;
            return this;
        }

        /**
         * Add a track.
         * 
         * @param value
         *            an instance of {@link TrackType} value that must not be
         *            blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTrack(TrackType value) {
            if (value == null) {
                return this;
            }
            if (this.tracks == null) {
                this.tracks = new ArrayList<>();
            }
            this.tracks.add(value);
            return this;
        }

        /**
         * Set up Record Tracking Info.
         * 
         * @param tracking
         *            an instance of {@link RecordTrackingType} value that must
         *            not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withRecordTracking(RecordTrackingType tracking) {
            this.tracking = tracking;
            return this;
        }

        /**
         * Completes the building of the AvProjectType
         * 
         * @return an instance of {@link AvProjectType}
         */
        public AvProjectType build() {
            AVProjectTypeBuilder obj = new AVProjectTypeBuilder(this);
            return obj.subject;
        }
    }
}
