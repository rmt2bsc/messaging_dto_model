package org.rmt2.util;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.RMT2Date;

/**
 * HeaderType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class RecordTrackingTypeBuilder {

    private RecordTrackingType subject;
    

    private RecordTrackingTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createRecordTrackingType();
        subject.setDateCreated(builder.dateCreated);
        subject.setDateUpdated(builder.dateUpdated);
        subject.setIpCreated(builder.ipCreated);
        subject.setIpUpdated(builder.ipUpdated);
        subject.setUserId(builder.userId);
    }

    /**
     * Builder for {@link RecordTrackingType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private XMLGregorianCalendar dateCreated;
        private XMLGregorianCalendar dateUpdated;
        private String userId;
        private String ipCreated;
        private String ipUpdated;
        
        
        private Builder() {
            this.dateCreated = null;
            this.dateUpdated = null;
            this.userId = null;
            this.ipCreated = null;
            this.ipUpdated = null;
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
         * @param dateString
         * @return
         */
        public Builder withDateCreated(String dateString) {
            this.dateCreated = RMT2Date.toXmlDate(dateString);
            return this;
        }

        /**
         * 
         * @param dateString
         * @return
         */
        public Builder withDateUpdate(String dateString) {
            this.dateUpdated = RMT2Date.toXmlDate(dateString);
            return this;
        }

        /**
         * 
         * @param ip
         * @return
         */
        public Builder withIpCreated(String ip) {
            this.ipCreated = ip;
            return this;
        }

        /**
         * 
         * @param ip
         * @return
         */
        public Builder withIpUpdate(String ip) {
            this.ipUpdated = ip;
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
         * Completes the building of the RecordTrackingType
         * 
         * @return an instance of {@link RecordTrackingType}
         */
        public RecordTrackingType build() {
            RecordTrackingTypeBuilder obj = new RecordTrackingTypeBuilder(this);
            return obj.subject;
        }
    }

}
