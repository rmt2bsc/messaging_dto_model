package org.rmt2.util.addressbook;

import java.math.BigInteger;

import org.rmt2.jaxb.CodeDetailType;
import org.rmt2.jaxb.ObjectFactory;

/**
 * CodeDetailType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class CodeDetailTypeBuilder {

    private CodeDetailType subject;
    
    /**
     * Create a CodeDetailTypeBuilder
     */
    private CodeDetailTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createCodeDetailType();
        subject.setCodeId(BigInteger.valueOf(builder.codeId));
        subject.setShortdesc(builder.shortdesc);
        subject.setLongdesc(builder.longdesc);
        subject.setLabel(builder.label);
    }

    /**
     * Builder for {@link CodeDetailType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int codeId;
        private String shortdesc;
        private String longdesc;
        private String label;

        private Builder() {
            this.codeId = 0;
            this.shortdesc = null;
            this.longdesc = null;
            this.label = null;
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
         * Set up code id.
         * 
         * @param codeId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCodeId(int codeId) {
            this.codeId = codeId;
            return this;
        }


        /**
         * Set up short description.
         * 
         * @param shortdesc
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withShortDescription(String shortdesc) {
            this.shortdesc = shortdesc;
            return this;
        }

        /**
         * Set up long description.
         * 
         * @param longdesc
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLongDescription(String longdesc) {
            this.longdesc = longdesc;
            return this;
        }

        /**
         * Set up label.
         * 
         * @param label
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withLabel(String label) {
            this.label = label;
            return this;
        }

        /**
         * Completes the building of the CodeDetailType
         * 
         * @return an instance of {@link CodeDetailType}
         */
        public CodeDetailType build() {
            CodeDetailTypeBuilder obj = new CodeDetailTypeBuilder(this);
            return obj.subject;
        }
    }

}
