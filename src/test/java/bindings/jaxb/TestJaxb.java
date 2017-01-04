package bindings.jaxb;

import javax.naming.spi.ObjectFactory;

/**
 * @author rterrell
 * 
 */
public class TestJaxb {

    private ObjectFactory f;

    // /**
    // * @throws java.lang.Exception
    // */
    // @Before
    // public void setUp() throws Exception {
    // this.f = new ObjectFactory();
    // }
    //
    // /**
    // * @throws java.lang.Exception
    // */
    // @After
    // public void tearDown() throws Exception {
    // this.f = null;
    // }
    //
    // @Test
    // public void testXmlMessageIntrospection() {
    // String msgId = null;
    // RQBusinessContactSearch msg = this.f.createRQBusinessContactSearch();
    // HeaderType ht = this.f.createHeaderType();
    // ht.setMessageId("TestMsg");
    // ht.setDeliveryMode("SYNC");
    // ht.setMessageMode("REQUEST");
    // ht.setUserId("rterrell");
    // msg.setHeader(ht);
    //
    // // logic to convert RMI results to SOAP response.
    // String xml;
    // try {
    // xml = MessagingResourceFactory.getJaxbMessageBinder()
    // .marshalMessage(msg);
    // } catch (Exception e) {
    // e.printStackTrace();
    // return;
    // }
    //
    // DaoApi api = XmlApiFactory.createXmlDao(xml);
    // String query = "//header";
    // try {
    // Object result[] = api.retrieve(query);
    // int rows = ((Integer) result[0]).intValue();
    // while (api.nextRow()) {
    // String name;
    // try {
    // name = api.getColumnValue("message_id");
    // System.out.println("Message Id: " + name);
    // } catch (NotFoundException e) {
    // e.printStackTrace();
    // }
    // } // Go to next element
    // } catch (Exception e) {
    // e.printStackTrace();
    // return;
    // }
    // System.out.println(xml);
    // }
    //
    // @Test
    // public void testMessageIntrospection() {
    // String msgId = null;
    // RQBusinessContactSearch msg = this.f.createRQBusinessContactSearch();
    // HeaderType ht = this.f.createHeaderType();
    // ht.setMessageId("TestMsg");
    // ht.setDeliveryMode("SYNC");
    // ht.setMessageMode("REQUEST");
    // ht.setUserId("rterrell");
    // msg.setHeader(ht);
    //
    // RMT2BeanUtility util = new RMT2BeanUtility(msg);
    // Object obj = null;
    // try {
    // obj = util.getPropertyValue("header");
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // if (obj instanceof HeaderType) {
    // HeaderType ht2 = (HeaderType) obj;
    // msgId = ht2.getMessageId();
    // }
    // }
    //
    // @Test
    // public void unmarshallData() {
    // String xml =
    // "<RS_personal_contact_search><person_list><first_name>Roy</first_name><last_name>Terrell</last_name><birth_date>1966-2-23</birth_date><ssn>444-55-5432</ssn><address><addr_id>32</addr_id><addr1>4329 Harbor St</addr1><addr2>P.O. Box 1234</addr2><addr3>Building 324-a</addr3><addr4>Room 432</addr4><zip><zipcode>71106</zipcode><city>Sheveport</city><state>LA</state></zip><phone_home>318-321-5432</phone_home></address></person_list></RS_personal_contact_search>";
    // Object obj = MessagingResourceFactory.getJaxbMessageBinder()
    // .unMarshalMessage(xml);
    // Assert.assertNotNull(obj);
    // Assert.assertTrue(obj instanceof RSPersonalContactSearch);
    // return;
    // }
    //
    // @Test
    // public void marshallData() {
    // try {
    // RSPersonalContactSearch obj = this.f
    // .createRSPersonalContactSearch();
    // ZipcodeType z = f.createZipcodeType();
    // z.setCity("Sheveport");
    // z.setState("LA");
    // z.setZipcode(BigInteger.valueOf(71106));
    //
    // AddressType at = f.createAddressType();
    // at.setAddr1("4329 Harbor St");
    // at.setAddr2("P.O. Box 1234");
    // at.setAddr3("Building 324-a");
    // at.setAddr4("Room 432");
    // at.setAddrId(BigInteger.valueOf(32));
    // at.setPhoneHome("318-321-5432");
    // at.setZip(z);
    //
    // PersonType pt = f.createPersonType();
    // pt.setBirthDate("1966-2-23");
    // pt.setFirstName("Roy");
    // pt.setLastName("Terrell");
    // pt.setSsn("444-55-5432");
    // pt.setAddress(at);
    //
    // obj.getPersonList().add(pt);
    // String msg = MessagingResourceFactory.getJaxbMessageBinder()
    // .marshalMessage(obj);
    // Assert.assertNotNull(msg);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

}
