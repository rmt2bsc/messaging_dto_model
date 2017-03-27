package org.rmt2.util.addressbook;

import java.math.BigInteger;

import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ZipcodeType;

import com.util.assistants.Verifier;

/**
 * ZipcodeType Builder.
 * 
 * @author Roy Terrell
 *
 */
public class ZipcodeTypeBuilder {

    /**
     * Create a ZipcodeTypeBuilder
     */
    public ZipcodeTypeBuilder() {
        return;
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
            Verifier.verifyNotNegative(zipId, "Zip must not be a negative value");
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
            Verifier.verifyPositive(zipcode, "Zipcode must be a positive non-zero value");
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
            Verifier.verifyNotBlank(city, "City cannot be blank");
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
            Verifier.verifyNotBlank(state, "State cannot be blank");
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
            Verifier.verifyNotBlank(areaCode, "Area Code cannot be blank");
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
            Verifier.verifyNotBlank(cityAliasName, "Area Code cannot be blank");
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
            Verifier.verifyNotBlank(cityAliasAbbr, "Area Code cannot be blank");
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
            Verifier.verifyNotBlank(countyName, "Area Code cannot be blank");
            this.countyName = countyName;
            return this;
        }

        /**
         * Completes the building of the ZipcodeType
         * 
         * @return an instance of {@link ZipcodeType}
         */
        public ZipcodeType build() {
            ObjectFactory f = new ObjectFactory();
            ZipcodeType subject = f.createZipcodeType();
            subject.setZipId(BigInteger.valueOf(this.zipId));
            subject.setZipcode(BigInteger.valueOf(this.zipcode));
            subject.setCity(this.city);
            subject.setCityAliasAbbr(this.cityAliasAbbr);
            subject.setCityAliasName(this.cityAliasName);
            subject.setCountyName(this.countyName);
            subject.setState(this.state);
            subject.setAreaCode(this.areaCode);
            return subject;
        }
    }

}
