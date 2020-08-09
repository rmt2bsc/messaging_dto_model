package org.rmt2.util.mime;

import org.rmt2.jaxb.MimeContentType;
import org.rmt2.jaxb.MimetypeType;
import org.rmt2.jaxb.ObjectFactory;

/**
 * MimeContentType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class MimeContentTypeBuilder {

    private MimeContentType subject;
    
    /**
     * Create a MimeContentTypeBuilder
     */
    private MimeContentTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createMimeContentType();
        subject.setContentId(builder.contentId);
        subject.setMimeType(builder.mimeType);
        subject.setAppCode(builder.appCode);
        subject.setModuleCode(builder.moduleCode);
        subject.setFilename(builder.filename);
        subject.setFilepath(builder.filepath);
        subject.setFilesize(builder.filesize);
        subject.setTextData(builder.textData);
        subject.setBinaryData(builder.binaryData);
    }

    /**
     * Builder for {@link MimeContentTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int contentId;
        private MimetypeType mimeType;
        private String appCode;
        private String moduleCode;
        private String filename;
        private String filepath;
        private int filesize;
        private byte[] binaryData;
        private String textData;


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
         * Set up MIME Type
         * 
         * @param value
         *            a MimetypeType instance
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withMimeType(MimetypeType value) {
            this.mimeType = value;
            return this;
        }
        
        /**
         * Set up applicaltion code
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withApplicationCode(String value) {
            this.appCode = value;
            return this;
        }
        
        /**
         * Set up module code
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withModuleCode(String value) {
            this.moduleCode = value;
            return this;
        }
        
        /**
         * Set up filename
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withFileName(String value) {
            this.filename = value;
            return this;
        }

        /**
         * Set up filename
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withFilePath(String value) {
            this.filepath = value;
            return this;
        }
        
        /**
         * Set up file size
         * 
         * @param value
         *            an int
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withFileSize(int value) {
            this.filesize = value;
            return this;
        }
        
        /**
         * Set up content as text data
         * 
         * @param value
         *            a String
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTextData(String value) {
            this.textData = value;
            return this;
        }
        
        /**
         * Set up content as binary data
         * 
         * @param value
         *            a byte[]
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withBinaryData(byte[] value) {
            this.binaryData = value;
            return this;
        }
        
        /**
         * Completes the building of the MimeContentType
         * 
         * @return an instance of {@link MimeContentType}
         */
        public MimeContentType build() {
            MimeContentTypeBuilder obj = new MimeContentTypeBuilder(this);
            return obj.subject;
        }
    }
}
