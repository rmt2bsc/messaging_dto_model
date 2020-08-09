package org.rmt2.util.mime;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.AudioBatchImportType;
import org.rmt2.jaxb.ObjectFactory;

import com.api.util.RMT2Date;

/**
 * AudioBatchImportType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class AudioBatchImportTypeBuilder {

    private AudioBatchImportType subject;
    
    /**
     * Create a AudioBatchImportTypeBuilder
     */
    private AudioBatchImportTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createAudioBatchImportType();
        subject.setStartTime(builder.startTime);
        subject.setEndTime(builder.endTime);
        subject.setTotalProcessed(builder.totalProcessed);
        subject.setTotalSuccess(builder.totalSuccess);
        subject.setTotalFailure(builder.totalFailure);
        subject.setTotalNonAvFiles(builder.totalNonAvFiles);
    }

    /**
     * Builder for {@link AudioBatchImportTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private XMLGregorianCalendar startTime;
        private XMLGregorianCalendar endTime;
        private int totalProcessed;
        private int totalSuccess;
        private int totalFailure;
        private int totalNonAvFiles;


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
         * Set up start datetime.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withStartTime(Date value) {
            this.startTime = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set up end datetime.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEndTime(Date value) {
            this.endTime = RMT2Date.toXmlDate(value);
            return this;
        }
        
        /**
         * Set up total processed file count
         * 
         * @param value
         *            an int value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withProcessTotal(int value) {
            this.totalProcessed = value;
            return this;
        }
        
        /**
         * Set up total files successfully processed count
         * 
         * @param value
         *            an int value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withSuccessTotal(int value) {
            this.totalSuccess = value;
            return this;
        }

        /**
         * Set up total files unsuccessfully processed count
         * 
         * @param value
         *            an int value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withFailureTotal(int value) {
            this.totalSuccess = value;
            return this;
        }
        
        /**
         * Set up total non-audio files encountered count
         * 
         * @param value
         *            an int value
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withNonAudioFilesEncountered(int value) {
            this.totalSuccess = value;
            return this;
        }
        
        
        /**
         * Completes the building of the AudioBatchImportType
         * 
         * @return an instance of {@link AudioBatchImportType}
         */
        public AudioBatchImportType build() {
            AudioBatchImportTypeBuilder obj = new AudioBatchImportTypeBuilder(this);
            return obj.subject;
        }
    }
}
