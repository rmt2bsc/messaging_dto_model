package org.rmt2.messages.accounting;

import java.math.BigDecimal;
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
import org.rmt2.jaxb.InventoryDetailGroup;
import org.rmt2.jaxb.InventoryItemType;
import org.rmt2.jaxb.InventoryItemtypeType;
import org.rmt2.jaxb.InventoryRequest;
import org.rmt2.jaxb.ItemCriteriaType;
import org.rmt2.jaxb.ItemStatusHistoryCriteriaType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.RecordTrackingTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class InventoryRequestBuilderTest {

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
    public void testBuildItemMasterQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        InventoryRequest req = fact.createInventoryRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("inventory")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.INVENTORY_ITEM_MASTER_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        
        ItemCriteriaType criteria = fact.createItemCriteriaType();
        criteria.setItemId(BigInteger.valueOf(100));
        criteria.setActive(BigInteger.valueOf(1));
        criteria.setItemName("Dell Computer");
        criteria.setItemSerialNo("11111111");
        criteria.setMarkup(BigDecimal.valueOf(3));
        criteria.setUnitCost(BigDecimal.valueOf(150.89));
        criteria.setQtyOnHand(BigInteger.valueOf(10));
        criteria.setVendorItemNo("1234-4839");
        
        InventoryItemtypeType iit = fact.createInventoryItemtypeType();
        iit.setItemTypeId(BigInteger.valueOf(222));
        criteria.setItemType(iit);
        
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
        Assert.assertTrue(xml.contains(ApiTransactionCodes.INVENTORY_ITEM_MASTER_GET));
    }
    
    @Test
    public void testBuildItemMasterUpdateRequest() {
        ObjectFactory fact = new ObjectFactory();
        InventoryRequest req = fact.createInventoryRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("inventory")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.INVENTORY_ITEM_MASTER_UPDATE)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        
        InventoryItemType item = fact.createInventoryItemType();
        item.setItemId(BigInteger.valueOf(100));
        item.setActive(BigInteger.valueOf(1));
        item.setDescription("Dell Computer");
        item.setItemSerialNo("11111111");
        item.setMarkup(BigDecimal.valueOf(3));
        item.setUnitCost(BigDecimal.valueOf(150.99));
        item.setQtyOnHand(BigInteger.valueOf(10));
        item.setVendorItemNo("1234-4839");
        
        InventoryItemtypeType iit = fact.createInventoryItemtypeType();
        iit.setItemTypeId(BigInteger.valueOf(222));
        item.setItemType(iit);
        
        CreditorType cred = fact.createCreditorType();
        cred.setCreditorId(BigInteger.valueOf(1234567));
        item.setCreditor(cred);
        
        RecordTrackingType tracking = RecordTrackingTypeBuilder.Builder.create()
                .withDateCreated("2018-01-01 10:10:44").build();
        
        item.setTracking(tracking);
        InventoryDetailGroup detailGroup = fact.createInventoryDetailGroup();
        detailGroup.getInvItem().add(item);
        req.setProfile(detailGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.INVENTORY_ITEM_MASTER_UPDATE));
    }
    
    @Test
    public void testBuildItemMasterDeleteRequest() {
        ObjectFactory fact = new ObjectFactory();
        InventoryRequest req = fact.createInventoryRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("inventory")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.INVENTORY_ITEM_MASTER_DELETE)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        
        ItemCriteriaType criteria = fact.createItemCriteriaType();
        criteria.setItemId(BigInteger.valueOf(100));
        
        InventoryCriteriaGroup criteriaGroup = fact.createInventoryCriteriaGroup();
        criteriaGroup.setItemCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.INVENTORY_ITEM_MASTER_DELETE));
    }
    
    @Test
    public void testBuildItemStatusHistoryQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        InventoryRequest req = fact.createInventoryRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("inventory")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.INVENTORY_ITEM_STATUS_HIST_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        
        ItemStatusHistoryCriteriaType criteria = fact.createItemStatusHistoryCriteriaType();
        criteria.setItemStatusHistId(BigInteger.valueOf(200));
        criteria.setItemId(BigInteger.valueOf(1000));
        criteria.setItemStatusId(BigInteger.valueOf(3000));

        InventoryCriteriaGroup criteriaGroup = fact.createInventoryCriteriaGroup();
        criteriaGroup.setItemStatusHistCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.INVENTORY_ITEM_STATUS_HIST_GET));
    }
 
    @Test
    public void testBuildCurrentItemStatusHistoryQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        InventoryRequest req = fact.createInventoryRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("inventory")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.INVENTORY_ITEM_CURRENT_STATUS_HIST_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        
        ItemStatusHistoryCriteriaType criteria = fact.createItemStatusHistoryCriteriaType();
        criteria.setItemId(BigInteger.valueOf(1000));

        InventoryCriteriaGroup criteriaGroup = fact.createInventoryCriteriaGroup();
        criteriaGroup.setItemStatusHistCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.INVENTORY_ITEM_CURRENT_STATUS_HIST_GET));
    }
}
