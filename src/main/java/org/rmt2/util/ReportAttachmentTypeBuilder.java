package org.rmt2.util;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ReportAttachmentType;

/**
 * ReportAttachmentType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ReportAttachmentTypeBuilder {

    private ReportAttachmentType subject;
    
    /**
     * Create ReportAttachmentType
     */
    private ReportAttachmentTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createReportAttachmentType();
        subject.setReportId(builder.reportId);
        subject.setFilePath(builder.filePath);
        subject.setMimeType(builder.mimeType);
        subject.setFileSize(builder.fileSize);
        subject.setContent(builder.reportData);
    }

    /**
     * Builder for {@link ReportAttachmentType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private String reportId;
        private String filePath;
        private String mimeType;
        private BigInteger fileSize;
        private byte[] reportData;
        
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
         * 
         * @param reportId
         * @return
         */
        public Builder withReportId(String value) {
            this.reportId = value;
            return this;
        }

        /**
         * 
         * @param filePath
         * @return
         */
        public Builder withFilePath(String value) {
            this.filePath = value;
            return this;
        }

        /**
         * 
         * @param mimeType
         * @return
         */
        public Builder withMimeType(String value) {
            this.mimeType = value;
            return this;
        }

        /**
         * 
         * @param fileSize
         * @return
         */
        public Builder withFileSize(int value) {
            this.fileSize = BigInteger.valueOf(value);
            return this;
        }

        /**
         * 
         * @param returnCode
         * @return
         */
        public Builder withReportContent(OutputStream value) {
            if (value == null) {
                return this;
            }
            if (value instanceof ByteArrayOutputStream) {
                this.reportData = ((ByteArrayOutputStream) value).toByteArray();
            }
            return this;
        }
        
        /**
         * 
         * @param returnCode
         * @return
         */
        public Builder withReportContent(byte[] value) {
            this.reportData = value;
            return this;
        }

        /**
         * Completes the building of the ReportAttachmentType
         * 
         * @return an instance of {@link ReportAttachmentType}
         */
        public ReportAttachmentType build() {
            ReportAttachmentTypeBuilder obj = new ReportAttachmentTypeBuilder(this);
            return obj.subject;
        }
    }

}
