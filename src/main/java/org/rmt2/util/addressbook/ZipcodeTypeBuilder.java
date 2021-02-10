package org.rmt2.util.addressbook;

import java.math.BigInteger;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ZipcodeType;

/**
 * ZipcodeType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ZipcodeTypeBuilder {

    private ZipcodeType subject;
    
    /**
     * Create a ZipcodeTypeBuilder
     */
    private ZipcodeTypeBuilder(Builder builder) {
        ObjectFactory f = new ObjectFactory();
        subject = f.createZipcodeType();
        subject.setZipId(BigInteger.valueOf(builder.zipId));
        subject.setZipcode(BigInteger.valueOf(builder.zipcode));
        subject.setCity(builder.city);
        subject.setCityAliasAbbr(builder.cityAliasAbbr);
        subject.setCityAliasName(builder.cityAliasName);
        subject.setCountyName(builder.countyName);
        subject.setState(builder.state);
        subject.setAreaCode(builder.areaCode);
    }

    /**
     * Builder for {@link ZipcodeType}
     * 
     * @author Roy Terrell
     *
     */
    public static final class Builder {
        private int zipId;
        private int zipcode;
        private String city;
        private String state;
        private String areaCode;
        private String cityAliasName;
        private String cityAliasAbbr;
        private String countyName;

        private Builder() {
            this.zipId = 0;
            this.zipcode = 0;
            this.city = null;
            this.state = null;
            this.areaCode = null;
            this.cityAliasName = null;
            this.cityAliasAbbr = null;
            this.countyName = null;
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
         * Set up zip id.
         * 
         * @param zipId
         *            an int value that must be greater than or equal to zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withZipId(int zipId) {
            this.zipId = zipId;
            return this;
        }

        /**
         * Set up zip code.
         * 
         * @param zipcode
         *            an int value that must be greater than zero
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withZipcode(int zipcode) {
            this.zipcode = zipcode;
            return this;
        }

        /**
         * Set up city.
         * 
         * @param city
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        /**
         * Set up state.
         * 
         * @param state
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withState(String state) {
            this.state = state;
            return this;
        }

        /**
         * Set up area code.
         * 
         * @param areaCode
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }

        /**
         * Set up city alias name
         * 
         * @param cityAliasName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCityAliasName(String cityAliasName) {
            this.cityAliasName = cityAliasName;
            return this;
        }

        /**
         * Set up city alias abbreviation.
         * 
         * @param cityAliasAbbr
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCityAliasAbbr(String cityAliasAbbr) {
            this.cityAliasAbbr = cityAliasAbbr;
            return this;
        }

        /**
         * Set up county name.
         * 
         * @param countyName
         *            an String value that must not be blank
         * @return Non-null Builder used to continue building the object
         * @throws VerifyException
         *             if the parameter conditions are not met.
         */
        public Builder withCountyName(String countyName) {
            this.countyName = countyName;
            return this;
        }

        /**
         * Completes the building of the ZipcodeType
         * 
         * @return an instance of {@link ZipcodeType}
         */
        public ZipcodeType build() {
            ZipcodeTypeBuilder obj = new ZipcodeTypeBuilder(this);
            return obj.subject;
        }
    }

}
