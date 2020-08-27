package org.rmt2.util.media;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.TrackType;

/**
 * AvProjectType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class TrackTypeBuilder {

    private TrackType subject;
    
    /**
     * Create a TrackTypeBuilder
     */
    private TrackTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createTrackType();
        subject.setTrackId(builder.trackId);
        subject.setProjectId(builder.projectId);
        subject.setGenreId(builder.genreId);
        subject.setDiscNumber(builder.discNumber);
        subject.setTrackNumber(builder.trackNumber);
        subject.setTrackName(builder.trackName);
        subject.setHours(builder.hours);
        subject.setMinutes(builder.minutes);
        subject.setSeconds(builder.seconds);
        subject.setProducer(builder.producer);
        subject.setComposer(builder.composer);
        subject.setLyricist(builder.lyricist);
        subject.setLocationServername(builder.locationServername);
        subject.setLocationSharename(builder.locationSharename);
        subject.setLocationRootPath(builder.locationRootPath);
        subject.setLocationPath(builder.locationPath);
        subject.setLocationFilename(builder.locationFilename);
        subject.setComments(builder.comments);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link TrackTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {

        private int trackId;
        private int projectId;
        private int genreId;
        private int discNumber;
        private int trackNumber;
        private String trackName;
        private int hours;
        private int minutes;
        private int seconds;
        private String producer;
        private String composer;
        private String lyricist;
        private String locationServername;
        private String locationSharename;
        private String locationRootPath;
        private String locationPath;
        private String locationFilename;
        private String comments;
        private RecordTrackingType tracking;

        private Builder() {
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
         * Set up track id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         */
        public Builder withTrackId(int value) {
            this.trackId = value;
            return this;
        }

        /**
         * Set up project id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         */
        public Builder withProjectId(int value) {
            this.projectId = value;
            return this;
        }

        /**
         * Set up genre id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         */
        public Builder withGenreId(int value) {
            this.genreId = value;
            return this;
        }

        /**
         * Set up disc number.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDiscNumber(int value) {
            this.discNumber = value;
            return this;
        }

        /**
         * Set up tarck number.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         */
        public Builder withTrackNumber(int value) {
            this.trackNumber = value;
            return this;
        }

        /**
         * Set up tarck name.
         * 
         * @param value
         *            an String value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         */
        public Builder withTrackName(String value) {
            this.trackName = value;
            return this;
        }

        /**
         * Set up hours.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         */
        public Builder withHours(int value) {
            this.hours = value;
            return this;
        }

        /**
         * Set up minutes.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         */
        public Builder withMinutes(int value) {
            this.minutes = value;
            return this;
        }

        /**
         * Set up seconds.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         */
        public Builder withSeconds(int value) {
            this.seconds = value;
            return this;
        }


        /**
         * Set up producer.
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withProducer(String value) {
            this.producer = value;
            return this;
        }


        /**
         * Set up composer.
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withComposer(String value) {
            this.composer = value;
            return this;
        }

        /**
         * Set up lyrisist.
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withLyrisist(String value) {
            this.lyricist = value;
            return this;
        }

        /**
         * Set up location server name.
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withLocationServerName(String value) {
            this.locationServername = value;
            return this;
        }

        /**
         * Set up location share name.
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withLocationShareName(String value) {
            this.locationSharename = value;
            return this;
        }

        /**
         * Set up location root path.
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withLocationRootPath(String value) {
            this.locationRootPath = value;
            return this;
        }

        /**
         * Set up location path.
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withLocationPath(String value) {
            this.locationPath = value;
            return this;
        }

        /**
         * Set up location file name.
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withLocationFilename(String value) {
            this.locationFilename = value;
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
         * Completes the building of the TrackType
         * 
         * @return an instance of {@link TrackType}
         */
        public TrackType build() {
            TrackTypeBuilder obj = new TrackTypeBuilder(this);
            return obj.subject;
        }
    }
}
