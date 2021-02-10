package org.rmt2.util.media;

import org.rmt2.jaxb.MimetypeType;
import org.rmt2.jaxb.ObjectFactory;

/**
 * MimetypeType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class MimetypeTypeBuilder {

    private MimetypeType subject;
    
    /**
     * Create a MimetypeTypeBuilder
     */
    private MimetypeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createMimetypeType();
        subject.setMimeTypeId(builder.uid);
        subject.setFileExt(builder.fileExt);
        subject.setMediaType(builder.mediaType);
    }

    /**
     * Builder for {@link MimetypeTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int uid;
        private String fileExt;
        private String mediaType;

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
         * Set up genre id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withUID(int value) {
            this.uid = value;
            return this;
        }


        /**
         * Set up file extension
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withFileExt(String value) {
            this.fileExt = value;
            return this;
        }
        
        /**
         * Set up media type
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withMediaType(String value) {
            this.mediaType = value;
            return this;
        }

        /**
         * Completes the building of the MimetypeType
         * 
         * @return an instance of {@link MimetypeType}
         */
        public MimetypeType build() {
            MimetypeTypeBuilder obj = new MimetypeTypeBuilder(this);
            return obj.subject;
        }
    }
}
