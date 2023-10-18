package org.rmt2.messages.accounting.inventory;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.InventoryCriteriaGroup;
import org.rmt2.jaxb.InventoryRequest;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.SimpleItemListType;
import org.rmt2.jaxb.SimpleItemType;
import org.rmt2.jaxb.VendorItemCriteriaType;
import org.rmt2.util.HeaderTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class AssignVendorItemsUpdateRequestBuilderTest {

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
                .withApplication(ApiTransactionCodes.APP_ACCOUNTING)
                .withModule(ApiTransactionCodes.MODULE_ACCOUNTING_INV)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.INVENTORY_VENDOR_ITEM_ASSIGN)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        
        VendorItemCriteriaType criteria = fact.createVendorItemCriteriaType();
        criteria.setCreditorId(BigInteger.valueOf(1234567));
        
        SimpleItemListType itemList = fact.createSimpleItemListType();
        SimpleItemType item = fact.createSimpleItemType();
        item.setItemId(BigInteger.valueOf(100));
        itemList.getItem().add(item);
        
        item = fact.createSimpleItemType();
        item.setItemId(BigInteger.valueOf(200));
        itemList.getItem().add(item);
        
        item = fact.createSimpleItemType();
        item.setItemId(BigInteger.valueOf(300));
        itemList.getItem().add(item);
        
        criteria.setItems(itemList);
        
        InventoryCriteriaGroup criteriaGroup = fact.createInventoryCriteriaGroup();
        criteriaGroup.setVendorItemCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.INVENTORY_VENDOR_ITEM_ASSIGN));
    }
 
}
