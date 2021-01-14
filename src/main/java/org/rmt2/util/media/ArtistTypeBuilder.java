package org.rmt2.util.media;

import java.util.ArrayList;
import java.util.List;

import org.rmt2.jaxb.ArtistType;
import org.rmt2.jaxb.AvProjectType;
import org.rmt2.jaxb.ObjectFactory;

/**
 * ArtistType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ArtistTypeBuilder {

    private ArtistType subject;
    
    /**
     * Create a ArtistTypeBuilder
     */
    private ArtistTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createArtistType();
        if (builder.projects != null) {
            subject.setProjects(f.createAvProjectsType());
        }
        subject.setArtistId(builder.artistId);
        subject.setArtistName(builder.name);
        if (builder.projects != null && builder.projects.size() > 0) {
            subject.getProjects().getProject().addAll(builder.projects);
        }
    }

    /**
     * Builder for {@link ArtistTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int artistId;
        private String name;
        private List<AvProjectType> projects;

        private Builder() {
            this.projects = null;
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
         * Set up artist name
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withArtistName(String value) {
            this.name = value;
            return this;
        }

        /**
         * Add a project.
         * 
         * @param value
         *            an instance of {@link AvProjectType} value that must not
         *            be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withProject(AvProjectType value) {
            if (value == null) {
                return this;
            }
            if (this.projects == null) {
                this.projects = new ArrayList<>();
            }
            this.projects.add(value);
            return this;
        }

        /**
         * Completes the building of the ArtistType
         * 
         * @return an instance of {@link ArtistType}
         */
        public ArtistType build() {
            ArtistTypeBuilder obj = new ArtistTypeBuilder(this);
            return obj.subject;
        }
    }
}
