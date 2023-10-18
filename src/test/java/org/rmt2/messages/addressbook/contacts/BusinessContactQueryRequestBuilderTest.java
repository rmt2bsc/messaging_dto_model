package org.rmt2.messages.addressbook.contacts;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AddressBookRequest;
import org.rmt2.jaxb.AddressBookResponse;
import org.rmt2.jaxb.AddressType;
import org.rmt2.jaxb.BusinessContactCriteria;
import org.rmt2.jaxb.BusinessType;
import org.rmt2.jaxb.ContactCriteriaGroup;
import org.rmt2.jaxb.ContactDetailGroup;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ReplyStatusType;
import org.rmt2.jaxb.ZipcodeType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.ReplyStatusTypeBuilder;
import org.rmt2.util.addressbook.AddressTypeBuilder;
import org.rmt2.util.addressbook.BusinessTypeBuilder;
import org.rmt2.util.addressbook.ZipcodeTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class BusinessContactQueryRequestBuilderTest {

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
                .withTransaction(ApiTransactionCodes.CONTACTS_GET)
                .withRouting(ApiTransactionCodes.ROUTE_ADDRESSBOOK)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        ContactCriteriaGroup ccg = fact.createContactCriteriaGroup();
        BusinessContactCriteria criteria = fact.createBusinessContactCriteria();
        criteria.setBusinessName("ABC Company");
        criteria.setContactFname("john");
        criteria.setContactLname("smith");
        criteria.setContactEmail("johnn.smith@gte.net");
        ccg.setBusinessCriteria(criteria);
        req.setCriteria(ccg);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.CONTACTS_GET));
    }
 
    @Test
    public void testBuildResponse() {
        ObjectFactory fact = new ObjectFactory();
        AddressBookResponse resp = fact.createAddressBookResponse();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication("App Name")
                .withModule(ConfigConstants.API_APP_MODULE_VALUE)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.CONTACTS_GET)
                .withRouting(ApiTransactionCodes.ROUTE_ADDRESSBOOK)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        ReplyStatusType rs = ReplyStatusTypeBuilder.Builder.create()
                .withStatus("200")
                .withReturnCode(1)
                .withRecordCount(1)
                .withMessage("Business contact records found")
                .build();

        ZipcodeType zt = ZipcodeTypeBuilder.Builder.create()
                .withCity("Dallas")
                .withState("Tx")
                .withZipcode(75232)
                .build();
        AddressType at = AddressTypeBuilder.Builder.create()
                .withAddrId(1234)
                .withAddressLine1("9432 Hall Ave")
                .withAddressLine2("Building 1")
                .withAddressLine3("Suite 100")
                .withAddressLine4("Room 50")
                .withZipcode(zt)
                .build();
        BusinessType bt = BusinessTypeBuilder.Builder.create()
                .withBusinessId(1343)
                .withContactFirstname("john")
                .withContactLastname("smith")
                .withContactPhone("9725555555")
                .withLongname("ABC Company")
                .withTaxId("756969504")
                .withWebsite("rmt2.com")
                .withContactEmail("johnn.smith@gte.net")
                .withAddress(at)
                .build();

        ContactDetailGroup cdg = fact.createContactDetailGroup();
        cdg.getBusinessContacts().add(bt);

        resp.setProfile(cdg);
        resp.setHeader(head);
        resp.setReplyStatus(rs);

        String xml = jaxb.marshalJsonMessage(resp);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.CONTACTS_GET));
    }

}
