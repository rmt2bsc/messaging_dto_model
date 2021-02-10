package org.rmt2.util.projecttracker.employee;

import java.math.BigInteger;

import org.rmt2.jaxb.EmployeeTitleType;
import org.rmt2.jaxb.ObjectFactory;

/**
 * EmployeeTitleType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class EmployeeTitleTypeBuilder {

    private EmployeeTitleType subject;
    
    /**
     * Create a EmployeeTitleType
     */
    private EmployeeTitleTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createEmployeeTitleType();
        subject.setEmployeeTitleId(BigInteger.valueOf(builder.employeeTitleId));
        subject.setDescription(builder.description);
    }

    /**
     * Builder for {@link EmployeeTitleType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int employeeTitleId;
        private String description;

        private Builder() {
            this.employeeTitleId = 0;
            this.description = null;
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
         * Set up employee title id.
         * 
         * @param employeeTitleId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEmployeeTitleId(int employeeTitleId) {
            this.employeeTitleId = employeeTitleId;
            return this;
        }



        /**
         * Set up description
         * 
         * @param description
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Completes the building of the EmployeeTitleType
         * 
         * @return an instance of {@link EmployeeTitleType}
         */
        public EmployeeTitleType build() {
            EmployeeTitleTypeBuilder obj = new EmployeeTitleTypeBuilder(this);
            return obj.subject;
        }
    }
}
