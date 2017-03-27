package org.rmt2.util;

import java.util.Date;

import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;

import com.util.RMT2Date;

/**
 * HeaderType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class HeaderTypeBuilder {

    /**
     * Create HeaderTypeBuilder
     */
    public HeaderTypeBuilder() {
        return;
    }

    private HeaderTypeBuilder(Builder builder) {
        return;
    }

    public static final class Builder {
        private HeaderType subject;

        private Builder() {
            ObjectFactory f = new ObjectFactory();
            this.subject = f.createHeaderType();
        }

        public static Builder create() {
            return new Builder();
        }

        public Builder withApplication(String appName) {
            this.subject.setApplication(appName);
            return this;
        }

        public Builder withModule(String moduleName) {
            this.subject.setModule(moduleName);
            return this;
        }

        public Builder withTransaction(String transId) {
            this.subject.setTransaction(transId);
            return this;
        }

        public Builder withDeliveryDate(Date deliveryDate) {
            String dateStr = RMT2Date.formatDate(deliveryDate, "MM/dd/yyyy HH:mm:ss");
            this.subject.setDeliveryDate(dateStr);
            return this;
        }

        public Builder withDeliveryMode(String deliveryMode) {
            this.subject.setDeliveryMode(deliveryMode);
            return this;
        }

        public Builder withMessageMode(String messageMode) {
            this.subject.setMessageMode(messageMode);
            return this;
        }

        public Builder withRouting(String routing) {
            this.subject.setRouting(routing);
            return this;
        }

        public Builder withUserId(String userId) {
            this.subject.setUserId(userId);
            return this;
        }

        public HeaderType build() {
            return this.subject;
        }
    }

}
