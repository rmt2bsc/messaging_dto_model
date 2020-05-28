package org.rmt2.util.projecttracker.timesheet;

import java.math.BigInteger;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.TimesheetStatusType;

/**
 * TimesheetStatusTypeBuilder Builder.
 * 
 * @author Roy Terrell
 *
 */
public class TimesheetStatusTypeBuilder {

    private TimesheetStatusType subject;
    
    /**
     * Create a TimesheetStatusTypeBuilder
     */
    private TimesheetStatusTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createTimesheetStatusType();
        subject.setTimesheetStatusId(builder.statusId);
        subject.setName(builder.name);
        subject.setDescription(builder.description);
    }

    /**
     * Builder for {@link TimesheetStatusTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger statusId;
        private String name;
        private String description;

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
         * Set up timesheet status id.
         * 
         * @param value
         *            an int
         * @return Non-null Builder used to continue building the object
         */
        public Builder withStatusId(int value) {
            this.statusId = BigInteger.valueOf(value);
            return this;
        }



        /**
         * Set up description
         * 
         * @param value
         *            an String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDescription(String value) {
            this.description = value;
            return this;
        }

        /**
         * Set up name
         * 
         * @param value
         *            an String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withName(String value) {
            this.name = value;
            return this;
        }


        /**
         * Completes the building of the TimesheetStatusType
         * 
         * @return an instance of {@link TimesheetStatusType}
         */
        public TimesheetStatusType build() {
            TimesheetStatusTypeBuilder obj = new TimesheetStatusTypeBuilder(this);
            return obj.subject;
        }
    }
}
