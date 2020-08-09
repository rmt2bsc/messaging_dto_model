package org.rmt2.util.mime;

import org.rmt2.jaxb.MediatypeType;
import org.rmt2.jaxb.ObjectFactory;

/**
 * MediatypeType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class MediatypeTypeBuilder {

    private MediatypeType subject;
    
    /**
     * Create a MediatypeTypeBuilder
     */
    private MediatypeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createMediatypeType();
        subject.setMediaTypeId(builder.uid);
        subject.setMediaTypeName(builder.name);
    }

    /**
     * Builder for {@link MediatypeTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int uid;
        private String name;


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
         * Set up genre name
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withName(String value) {
            this.name = value;
            return this;
        }

        /**
         * Completes the building of the MediatypeType
         * 
         * @return an instance of {@link MediatypeType}
         */
        public MediatypeType build() {
            MediatypeTypeBuilder obj = new MediatypeTypeBuilder(this);
            return obj.subject;
        }
    }
}
