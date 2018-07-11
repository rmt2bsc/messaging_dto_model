package org.rmt2.util;

import java.math.BigInteger;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ReplyStatusType;

/**
 * ReplyStatusType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ReplyStatusTypeBuilder {

    private ReplyStatusType subject;
    
    /**
     * Create ReplyStatusTypeBuilder
     */
    private ReplyStatusTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createReplyStatusType();
        subject.setReturnStatus(builder.status);
        subject.setMessage(builder.message);
        subject.setExtMessage(builder.detailMessage);
        subject.setReturnCode(BigInteger.valueOf(builder.returnCode));
    }

    /**
     * Builder for {@link ReplyStatusType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private String status;
        private String message;
        private String detailMessage;
        private int returnCode;
        
        private Builder() {
            this.status = null;
            this.message = null;
            this.detailMessage = null;
            this.returnCode = 0;
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
         * @param status
         * @return
         */
        public Builder withStatus(String status) {
            this.status = status;
            return this;
        }

        /**
         * 
         * @param message
         * @return
         */
        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        /**
         * 
         * @param detailMessage
         * @return
         */
        public Builder withDetailMessage(String detailMessage) {
            this.detailMessage = detailMessage;
            return this;
        }

        /**
         * 
         * @param returnCode
         * @return
         */
        public Builder withReturnCode(int returnCode) {
            this.returnCode = returnCode;
            return this;
        }

        /**
         * Completes the building of the ReplyStatusType
         * 
         * @return an instance of {@link ReplyStatusType}
         */
        public ReplyStatusType build() {
            ReplyStatusTypeBuilder obj = new ReplyStatusTypeBuilder(this);
            return obj.subject;
        }
    }

}
