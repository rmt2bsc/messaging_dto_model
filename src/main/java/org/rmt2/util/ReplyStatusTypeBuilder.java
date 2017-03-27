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

    /**
     * Create ReplyStatusTypeBuilder
     */
    public ReplyStatusTypeBuilder() {
        return;
    }

    public static final class Builder {
        private ReplyStatusType subject;

        private Builder() {
            ObjectFactory f = new ObjectFactory();
            this.subject = f.createReplyStatusType();
        }

        public static Builder create() {
            return new Builder();
        }

        public Builder withStatus(boolean successful) {
            String status = null;
            if (successful) {
                status = "SUCCESS";
            }
            else {
                status = "ERROR";
            }
            this.subject.setReturnStatus(status);
            return this;
        }

        public Builder withMessage(String message) {
            this.subject.setMessage(message);
            return this;
        }

        public Builder withDetailMessage(String detailMessage) {
            this.subject.setExtMessage(detailMessage);
            return this;
        }

        public Builder withReturnCode(int returnCode) {
            this.subject.setReturnCode(BigInteger.valueOf(returnCode));
            return this;
        }

        public ReplyStatusType build() {
            return this.subject;
        }
    }

}
