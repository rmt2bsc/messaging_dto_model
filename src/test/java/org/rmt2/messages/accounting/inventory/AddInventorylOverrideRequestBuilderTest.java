package org.rmt2.messages.accounting.inventory;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.CreditorType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.InventoryCriteriaGroup;
import org.rmt2.jaxb.InventoryRequest;
import org.rmt2.jaxb.ItemCriteriaType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.SimpleItemListType;
import org.rmt2.jaxb.SimpleItemType;
import org.rmt2.util.HeaderTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class AddInventorylOverrideRequestBuilderTest {

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
        InventoryRequest req = fact.createInventoryRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("inventory")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.INVENTORY_ITEM_RETAIL_OVERRIDE_ADD)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        
        ItemCriteriaType criteria = fact.createItemCriteriaType();
        SimpleItemListType itemList = fact.createSimpleItemListType();
        SimpleItemType item = fact.createSimpleItemType();
        item.setItemId(BigInteger.valueOf(100));
        item.setItemName("Iten Name 1");
        itemList.getItem().add(item);
        
        item = fact.createSimpleItemType();
        item.setItemId(BigInteger.valueOf(200));
        item.setItemName("Iten Name 2");
        itemList.getItem().add(item);
        
        item = fact.createSimpleItemType();
        item.setItemId(BigInteger.valueOf(300));
        item.setItemName("Iten Name 3");
        itemList.getItem().add(item);
        
        criteria.setItems(itemList);
        
        CreditorType cred = fact.createCreditorType();
        cred.setCreditorId(BigInteger.valueOf(1234567));
        criteria.setVendor(cred);
        
        InventoryCriteriaGroup criteriaGroup = fact.createInventoryCriteriaGroup();
        criteriaGroup.setItemCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.INVENTORY_ITEM_RETAIL_OVERRIDE_ADD));
    }
 
}
