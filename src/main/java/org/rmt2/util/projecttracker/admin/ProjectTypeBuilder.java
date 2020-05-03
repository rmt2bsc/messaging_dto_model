package org.rmt2.util.projecttracker.admin;

import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.rmt2.jaxb.BusinessType;
import org.rmt2.jaxb.ClientType;
import org.rmt2.jaxb.CustomerType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ProjectType;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.util.accounting.subsidiary.CustomerTypeBuilder;
import org.rmt2.util.addressbook.BusinessTypeBuilder;

import com.api.util.RMT2Date;
import com.api.util.assistants.Verifier;

/**
 * ProjectType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ProjectTypeBuilder {

    private ProjectType subject;
    
    /**
     * Create a ProjectTypeBuilder
     */
    private ProjectTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createProjectType();

        BusinessType bt = BusinessTypeBuilder.Builder.create()
                .withBusinessId(builder.clientBusinessId)
                .build();

        CustomerType ct1 = CustomerTypeBuilder.Builder.create()
                .withBusinessType(bt)
                .build();

        ClientType ct2 = ClientTypeBuilder.Builder.create()
                .withClientId(builder.clientId)
                .withClientName(builder.clientName)
                .withCustomerData(ct1)
                .withBillRate(builder.billRate)
                .withOvertimeBillRate(builder.otBillRate)
                .build();
        subject.setClient(ct2);

        subject.setProjectId(builder.projectId);
        subject.setDescription(builder.projectName);
        subject.setEffectiveDate(builder.effectiveDate);
        subject.setTracking(builder.tracking);
    }

    /**
     * Builder for {@link ProjectTypeBuilder}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int clientId;
        private int clientBusinessId;
        private String clientName;
        private BigInteger projectId;
        private String projectName;
        private XMLGregorianCalendar effectiveDate;
        private XMLGregorianCalendar endDate;
        private double billRate;
        private double otBillRate;
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
         * Set up client id.
         * 
         * @param clientId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withClientId(int clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Set up client business id.
         * 
         * @param businessId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withClientBusinessId(int businessId) {
            this.clientBusinessId = businessId;
            return this;
        }

        /**
         * Set up client name
         * 
         * @param name
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withClientName(String name) {
            this.clientName = name;
            return this;
        }

        /**
         * Set up project id.
         * 
         * @param projectId
         *            an int value
         * @return Non-null Builder used to continue building the object
         */
        public Builder withProjectId(int projectId) {
            this.projectId = BigInteger.valueOf(projectId);
            return this;
        }

        /**
         * Set up project name
         * 
         * @param name
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withProjectName(String name) {
            this.projectName = name;
            return this;
        }

        /**
         * Set up effective date
         * 
         * @param effectiveDate
         * @return
         */
        public Builder withEffectiveDate(Date effectiveDate) {
            this.effectiveDate = RMT2Date.toXmlDate(effectiveDate);
            return this;
        }

        /**
         * Set up end date
         * 
         * @param endDate
         * @return
         */
        public Builder withEndDate(Date endDate) {
            this.endDate = RMT2Date.toXmlDate(endDate);
            return this;
        }

        /**
         * Set up bill rate.
         * 
         * @param billRate
         *            an double value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withBillRate(double billRate) {
            this.billRate = billRate;
            return this;
        }

        /**
         * Set up overtime bill rate.
         * 
         * @param otBillRate
         *            an double value that must not be blank
         * @return Non-null Builder used to continue building the object
         */
        public Builder withOvertimeBillRate(double otBillRate) {
            this.otBillRate = otBillRate;
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
         * Completes the building of the ProjectType
         * 
         * @return an instance of {@link ProjectType}
         */
        public ProjectType build() {
            ProjectTypeBuilder obj = new ProjectTypeBuilder(this);
            return obj.subject;
        }
    }
}
