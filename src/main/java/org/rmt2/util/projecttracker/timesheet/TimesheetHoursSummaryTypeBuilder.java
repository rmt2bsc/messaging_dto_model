package org.rmt2.util.projecttracker.timesheet;

import java.math.BigDecimal;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.TimesheetHoursSummaryType;

/**
 * TimesheetHoursSummaryType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class TimesheetHoursSummaryTypeBuilder {

    private TimesheetHoursSummaryType subject;
    
    /**
     * Create a TimesheetHoursSummaryTypeBuilder
     */
    private TimesheetHoursSummaryTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createTimesheetHoursSummaryType();
        subject.setDay1Hrs(builder.day1Hours);
        subject.setDay2Hrs(builder.day2Hours);
        subject.setDay3Hrs(builder.day3Hours);
        subject.setDay4Hrs(builder.day4Hours);
        subject.setDay5Hrs(builder.day5Hours);
        subject.setDay6Hrs(builder.day6Hours);
        subject.setDay7Hrs(builder.day7Hours);
        subject.setHoursTotal(builder.totalHours);
    }

    /**
     * Builder for {@link TimesheetHoursSummaryTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigDecimal day1Hours;
        private BigDecimal day2Hours;
        private BigDecimal day3Hours;
        private BigDecimal day4Hours;
        private BigDecimal day5Hours;
        private BigDecimal day6Hours;
        private BigDecimal day7Hours;
        private BigDecimal totalHours;

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
         * Set up timesheet day #1 hours
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDay1Hours(double value) {
            this.day1Hours = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Set up timesheet day #2 hours
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDay2Hours(double value) {
            this.day2Hours = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Set up timesheet day #3 hours
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDay3Hours(double value) {
            this.day3Hours = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Set up timesheet day #4 hours
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDay4Hours(double value) {
            this.day4Hours = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Set up timesheet day #5 hours
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDay5Hours(double value) {
            this.day5Hours = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Set up timesheet day #6 hours
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDay6Hours(double value) {
            this.day6Hours = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Set up timesheet day #7 hours
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDay7Hours(double value) {
            this.day7Hours = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Set up timesheet total hours
         * 
         * @param value
         *            an double
         * @return Non-null Builder used to continue building the object
         */
        public Builder withTotalHours(double value) {
            this.totalHours = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Completes the building of the TimesheetHoursSummaryType
         * 
         * @return an instance of {@link TimesheetHoursSummaryType}
         */
        public TimesheetHoursSummaryType build() {
            TimesheetHoursSummaryTypeBuilder obj = new TimesheetHoursSummaryTypeBuilder(this);
            return obj.subject;
        }
    }
}
