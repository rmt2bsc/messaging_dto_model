package org.rmt2.util.media;

import java.util.Date;

import org.rmt2.jaxb.BatchImportType;
import org.rmt2.jaxb.ObjectFactory;

import com.api.util.ElapsedTime;
import com.api.util.RMT2Date;

/**
 * AudioBatchImportType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class BatchImportTypeBuilder {

    private BatchImportType subject;
    
    /**
     * Create a AudioBatchImportType
     */
    private BatchImportTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createBatchImportType();
        if (builder.startTime != null && builder.endTime != null) {
            subject.setStartTime(RMT2Date.toXmlDate(builder.startTime));
            subject.setEndTime(RMT2Date.toXmlDate(builder.endTime));
            ElapsedTime results = RMT2Date.getDateDiff(builder.startTime, builder.endTime);
            StringBuilder buf = new StringBuilder();
            buf.append(results.getHours());
            buf.append(":");
            buf.append(results.getMins());
            buf.append(":");
            buf.append(results.getSecs());
            subject.setDuration(buf.toString());
        }
        subject.setTotalProcessed(builder.totalProcessed);
        subject.setTotalSuccess(builder.totalSuccess);
        subject.setTotalFailure(builder.totalFailure);
        subject.setTotalNonAvFiles(builder.totalNonAvFiles);
    }

    /**
     * Builder for {@link ProjecttypeTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private Date startTime;
        private Date endTime;
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
            this.startTime = value;
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
            this.endTime = value;
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
         * Completes the building of the BatchImportType
         * 
         * @return an instance of {@link BatchImportType}
         */
        public BatchImportType build() {
            BatchImportTypeBuilder obj = new BatchImportTypeBuilder(this);
            return obj.subject;
        }
    }
}
