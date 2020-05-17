package org.rmt2.util.projecttracker.admin;

import java.math.BigInteger;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.jaxb.TaskType;

import com.api.util.assistants.Verifier;

/**
 * TaskType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class TaskTypeBuilder {

    private TaskType subject;
    
    /**
     * Create a TaskTypeBuilder
     */
    private TaskTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createTaskType();
        subject.setTaskId(builder.taskId);
        subject.setDescription(builder.description);
        subject.setBillable(builder.billable);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link ProjectTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger taskId;
        private BigInteger billable;
        private String description;
        private RecordTrackingType tracking;

        private Builder() {
            this.tracking = null;
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
         * Set up task id.
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTaskId(int value) {
            this.taskId = BigInteger.valueOf(value);
            return this;
        }

        /**
         * Set up billable flag
         * 
         * @param value
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withBillableFlag(int value) {
            this.billable = BigInteger.valueOf(value);
            return this;
        }

        /**
         * Set up task name
         * 
         * @param value
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withTaskName(String value) {
            this.description = value;
            return this;
        }

        /**
         * Set up Record Tracking Info.
         * 
         * @param tracking
         *            an instance of {@link RecordTrackingType} value that must
         *            not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withRecordTracking(RecordTrackingType tracking) {
            Verifier.verifyNotNull(tracking, "Tracking info cannot be null");
            this.tracking = tracking;
            return this;
        }

        /**
         * Completes the building of the TaskType
         * 
         * @return an instance of {@link TaskType}
         */
        public TaskType build() {
            TaskTypeBuilder obj = new TaskTypeBuilder(this);
            return obj.subject;
        }
    }
}
