package org.rmt2.util.media;

import org.rmt2.jaxb.GenreType;
import org.rmt2.jaxb.ObjectFactory;

/**
 * GenreType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class GenreTypeBuilder {

    private GenreType subject;
    
    /**
     * Create a GenreTypeBuilder
     */
    private GenreTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createGenreType();
        subject.setGenreId(builder.uid);
        subject.setGenreName(builder.name);

    }

    /**
     * Builder for {@link GenreTypeBuilder}
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
         * Completes the building of the GenreType
         * 
         * @return an instance of {@link GenreType}
         */
        public GenreType build() {
            GenreTypeBuilder obj = new GenreTypeBuilder(this);
            return obj.subject;
        }
    }
}
