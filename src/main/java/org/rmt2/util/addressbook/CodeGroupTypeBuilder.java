package org.rmt2.util.addressbook;

import java.math.BigInteger;

import org.rmt2.jaxb.CodeGroupType;
import org.rmt2.jaxb.ObjectFactory;

import com.api.util.assistants.Verifier;

/**
 * CodeGroupType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class CodeGroupTypeBuilder {

    private CodeGroupType subject;
    
    /**
     * Create a CodeGroupTypeBuilder
     */
    private CodeGroupTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        CodeGroupType subject = f.createCodeGroupType();
        subject.setGroupId(BigInteger.valueOf(builder.groupId));
        subject.setGroupDesc(builder.groupDesc);
    }

    /**
     * Builder for {@link CodeGroupType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int groupId;
        private String groupDesc;

        private Builder() {
            this.groupId = 0;
            this.groupDesc = null;
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
         * Set up group id.
         * 
         * @param groupId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withGroupId(int groupId) {
            Verifier.verifyNotNegative(groupId, "Group id must not be a negative value");
            this.groupId = groupId;
            return this;
        }


        /**
         * Set up group description.
         * 
         * @param groupDesc
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withGroupDescription(String groupDesc) {
            Verifier.verifyNotBlank(groupDesc, "Group description cannot be blank");
            this.groupDesc = groupDesc;
            return this;
        }

        /**
         * Completes the building of the CodeGroupType
         * 
         * @return an instance of {@link CodeGroupType}
         */
        public CodeGroupType build() {
            CodeGroupTypeBuilder obj = new CodeGroupTypeBuilder(this);
            return obj.subject;
        }
    }

}
