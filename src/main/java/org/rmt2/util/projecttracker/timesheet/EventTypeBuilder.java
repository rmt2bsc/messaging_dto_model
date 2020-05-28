package org.rmt2.util.projecttracker.timesheet;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.EventType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ProjectTaskType;
import org.rmt2.jaxb.RecordTrackingType;

import com.api.util.RMT2Date;

/**
 * EventTypeBuilder Builder.
 * 
 * @author Roy Terrell
 *
 */
public class EventTypeBuilder {

    private EventType subject;
    
    /**
     * Create a EventTypeBuilder
     */
    private EventTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createEventType();
        subject.setEventId(builder.eventId);
        subject.setProjectTask(builder.projectTask);
        subject.setEventDate(builder.eventDate);
        subject.setHours(builder.hours);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link EventTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger eventId;
        private ProjectTaskType projectTask;
        private XMLGregorianCalendar eventDate;
        private BigDecimal hours;
        private RecordTrackingType tracking;

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
         * Set up timesheet event id.
         * 
         * @param value
         *            an int
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEventId(int value) {
            this.eventId = BigInteger.valueOf(value);
            return this;
        }

        /**
         * Set up timesheet project task data.
         * 
         * @param value
         *            an instance of {@link ProjectTaskType}
         * @return Non-null Builder used to continue building the object
         */
        public Builder withProjectTask(ProjectTaskType value) {
            this.projectTask = value;
            return this;
        }

        /**
         * Set up event date
         * 
         * @param value
         *            an Date
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEventDate(Date value) {
            this.eventDate = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set up event date
         * 
         * @param value
         *            an String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withEventDate(String value) {
            this.eventDate = RMT2Date.toXmlDate(value);
            return this;
        }

        /**
         * Set up description
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withHours(double value) {
            this.hours = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Set up Record Tracking Info.
         * 
         * @param tracking
         *            an instance of {@link RecordTrackingType} not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withRecordTracking(RecordTrackingType tracking) {
            this.tracking = tracking;
            return this;
        }

        /**
         * Completes the building of the EventType
         * 
         * @return an instance of {@link EventType}
         */
        public EventType build() {
            EventTypeBuilder obj = new EventTypeBuilder(this);
            return obj.subject;
        }
    }
}
