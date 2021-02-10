package org.rmt2.util;

import java.util.Date;

import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;

import com.api.util.RMT2Date;

/**
 * HeaderType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class HeaderTypeBuilder {

    private HeaderType subject;
    

    private HeaderTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createHeaderType();
        subject.setApplication(builder.appName);
        subject.setDeliveryMode(builder.deliveryMode);
        subject.setMessageMode(builder.messageMode);
        subject.setModule(builder.moduleName);
        subject.setRouting(builder.routing);
        if (builder.deliveryDate != null) {
            subject.setDeliveryDate(RMT2Date.formatDate(builder.deliveryDate, "MM/dd/yyyy HH:mm:ss"));    
        }
        subject.setSessionId(builder.sessionId);
        subject.setTransaction(builder.transId);
        subject.setUserId(builder.userId);
    }

    /**
     * Builder for {@link HeaderType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private String appName;
        private String moduleName;
        private String transId;
        private Date deliveryDate;
        private String deliveryMode;
        private String messageMode;
        private String sessionId;
        private String routing;
        private String userId;
        
        
        private Builder() {
            this.appName = null;
            this.moduleName = null;
            this.transId = null;
            this.deliveryDate = null;
            this.deliveryMode = null;
            this.messageMode = null;
            this.routing = null;
            this.userId = null;
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
         * @param appName
         * @return
         */
        public Builder withApplication(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * 
         * @param moduleName
         * @return
         */
        public Builder withModule(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        /**
         * 
         * @param transId
         * @return
         */
        public Builder withTransaction(String transId) {
            this.transId = transId;
            return this;
        }

        /**
         * 
         * @param sessionId
         * @return
         */
        public Builder withSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * 
         * @param deliveryDate
         * @return
         */
        public Builder withDeliveryDate(Date deliveryDate) {
            this.deliveryDate = deliveryDate;
            return this;
        }

        /**
         * 
         * @param deliveryMode
         * @return
         */
        public Builder withDeliveryMode(String deliveryMode) {
            this.deliveryMode = deliveryMode;
            return this;
        }

        /**
         * 
         * @param messageMode
         * @return
         */
        public Builder withMessageMode(String messageMode) {
            this.messageMode = messageMode;
            return this;
        }

        /**
         * 
         * @param routing
         * @return
         */
        public Builder withRouting(String routing) {
            this.routing = routing;
            return this;
        }

        /**
         * 
         * @param userId
         * @return
         */
        public Builder withUserId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Completes the building of the HeaderType
         * 
         * @return an instance of {@link HeaderType}
         */
        public HeaderType build() {
            HeaderTypeBuilder obj = new HeaderTypeBuilder(this);
            return obj.subject;
        }
    }

}
