package org.rmt2.messages.addressbook.contacts;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AddressBookRequest;
import org.rmt2.jaxb.AddressType;
import org.rmt2.jaxb.BusinessType;
import org.rmt2.jaxb.ContactDetailGroup;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ZipcodeType;
import org.rmt2.util.HeaderTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class BusinessContactUpdateRequestBuilderTest {

    private JaxbUtil jaxb;
    
    @Before
    public void setUp() throws Exception {
        try {
            jaxb = SystemConfigurator.getJaxb(ConfigConstants.JAXB_CONTEXNAME_DEFAULT);
        }
        catch (Exception e) {
            jaxb = new JaxbUtil(MessagingConstants.JAXB_RMT2_PKG);
        }
    }
   
    @Test
    public void testBuildRequest() {
        ObjectFactory fact = new ObjectFactory();
        AddressBookRequest req = fact.createAddressBookRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication(ApiTransactionCodes.APP_ADDRESSBOOK)
                .withModule(ApiTransactionCodes.MODULE_ADDRESSBOOK_PROFILE)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.CONTACTS_UPDATE)
                .withRouting(ApiTransactionCodes.ROUTE_ADDRESSBOOK)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        ContactDetailGroup cdg = fact.createContactDetailGroup();
        
        BusinessType obj = fact.createBusinessType();
        obj.setBusinessId(BigInteger.valueOf(1350));
        obj.setLongName("ABC Company");
        obj.setContactFirstname("john");
        obj.setContactLastname("smith");
        obj.setContactEmail("johnn.smith@gte.net");
        obj.setContactPhone("2149999999");
        obj.setTaxId("88-8888888");
        
        AddressType addr = fact.createAddressType();
        addr.setAddrId(BigInteger.valueOf(1000));
        addr.setAddr1("Address Line 1");
        addr.setAddr2("Address Line 2");
        addr.setAddr3("Address Line 3");
        addr.setAddr4("Address Line 4");
        addr.setPhoneMain("2147777777");
        
        ZipcodeType zip = fact.createZipcodeType();
        zip.setCity("Dallas");
        zip.setState("Tx");
        zip.setZipcode(BigInteger.valueOf(75232));
        
        addr.setZip(zip);
        obj.setAddress(addr);
        
        cdg.getBusinessContacts().add(obj);
        
        req.setProfile(cdg);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.CONTACTS_UPDATE));
    }
}
