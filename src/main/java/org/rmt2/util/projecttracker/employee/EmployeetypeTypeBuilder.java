package org.rmt2.util.projecttracker.employee;

import java.math.BigInteger;

import org.rmt2.jaxb.EmployeetypeType;
import org.rmt2.jaxb.ObjectFactory;

/**
 * EmployeetypeTypeBuilder Builder.
 * 
 * @author Roy Terrell
 *
 */
public class EmployeetypeTypeBuilder {

    private EmployeetypeType subject;
    
    /**
     * Create a EmployeetypeTypeBuilder
     */
    private EmployeetypeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createEmployeetypeType();
        subject.setEmployeeTypeId(BigInteger.valueOf(builder.employeeTypeId));
        subject.setDescription(builder.description);
    }

    /**
     * Builder for {@link EmployeetypeTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int employeeTypeId;
        private String description;

        private Builder() {
            this.employeeTypeId = 0;
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
         * Set up employee type id.
         * 
         * @param employeeTypeId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withEmployeeId(int employeeTypeId) {
            this.employeeTypeId = employeeTypeId;
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
         * Completes the building of the EmployeetypeType
         * 
         * @return an instance of {@link EmployeetypeType}
         */
        public EmployeetypeType build() {
            EmployeetypeTypeBuilder obj = new EmployeetypeTypeBuilder(this);
            return obj.subject;
        }
    }
}
