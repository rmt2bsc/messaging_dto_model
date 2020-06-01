package org.rmt2.util.projecttracker.timesheet;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.rmt2.jaxb.EventType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ProjectTaskType;

/**
 * ProjectTaskTypeBuilder Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ProjectTaskTypeBuilder {

    private ProjectTaskType subject;
    
    /**
     * Create a ProjectTaskTypeBuilder
     */
    private ProjectTaskTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createProjectTaskType();
        subject.setProjectTaskId(builder.projectTaskId);
        subject.setTaskId(builder.taskId);
        subject.setTaskName(builder.taskName);
        subject.setProjectId(builder.projId);
        subject.setProjectName(builder.projName);
        subject.setDeleteProjectTask(builder.deleteProjectTask);
        if (builder.hours != null) {
            subject.getDailyHours().addAll(builder.hours);
        }
    }

    /**
     * Builder for {@link ProjectTaskTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private BigInteger projectTaskId;
        private BigInteger projId;
        private String projName;
        private BigInteger taskId;
        private String taskName;
        private boolean deleteProjectTask;
        private List<EventType> hours;

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
         * Set up timesheet task id.
         * 
         * @param value
         *            an int
         * @return Non-null Builder used to continue building the object
         */
        public Builder withProjectTaskId(int value) {
            this.projectTaskId = BigInteger.valueOf(value);
            return this;
        }

        /**
         * Set up timesheet task id
         * 
         * @param value
         *            int
         * @return Non-null Builder used to continue building the object
         */
        public Builder withTaskId(int value) {
            this.taskId = BigInteger.valueOf(value);
            return this;
        }

        /**
         * Set up task name
         * 
         * @param value
         *            String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withTaskName(String value) {
            this.taskName = value;
            return this;
        }

        /**
         * Set up project id
         * 
         * @param value
         *            int
         * @return Non-null Builder used to continue building the object
         */
        public Builder withProjectId(int value) {
            this.projId = BigInteger.valueOf(value);
            return this;
        }

        /**
         * Set up project name
         * 
         * @param value
         *            String
         * @return Non-null Builder used to continue building the object
         */
        public Builder withProjectName(String value) {
            this.projName = value;
            return this;
        }

        /**
         * Set up delet project task flag
         * 
         * @param value
         *            boolean
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDeleteProjectTask(boolean value) {
            this.deleteProjectTask = value;
            return this;
        }

        /**
         * Adds an {@link EventType} to the work log for a project task.
         * 
         * @param event
         *            an instance of {@link EventType}
         * @return Non-null Builder used to continue building the object
         */
        public Builder addHours(EventType event) {
            if (event == null) {
                return this;
            }
            if (this.hours == null) {
                this.hours = new ArrayList<>();
            }
            this.hours.add(event);
            return this;
        }

        /**
         * Completes the building of the ProjectTaskType
         * 
         * @return an instance of {@link ProjectTaskType}
         */
        public ProjectTaskType build() {
            ProjectTaskTypeBuilder obj = new ProjectTaskTypeBuilder(this);
            return obj.subject;
        }
    }
}
