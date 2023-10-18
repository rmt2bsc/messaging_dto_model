package org.rmt2.messages.accounting.generalledger;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AccountingGeneralLedgerRequest;
import org.rmt2.jaxb.GlAccountType;
import org.rmt2.jaxb.GlAccountcatgType;
import org.rmt2.jaxb.GlAccounttypeType;
import org.rmt2.jaxb.GlBalancetypeType;
import org.rmt2.jaxb.GlDetailGroup;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RecordTrackingType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.RecordTrackingTypeBuilder;
import org.rmt2.util.accounting.generalledger.GlAccountBalanceTypeBuilder;
import org.rmt2.util.accounting.generalledger.GlAccountCategoryTypeBuilder;
import org.rmt2.util.accounting.generalledger.GlAccounttypeTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class GLAccountUpdateRequestBuilderTest {

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
        AccountingGeneralLedgerRequest req = fact.createAccountingGeneralLedgerRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication(ApiTransactionCodes.APP_ACCOUNTING)
                .withModule(ApiTransactionCodes.MODULE_ACCOUNTING_GL)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.GL_ACCOUNT_UPDATE)
                .withRouting(ApiTransactionCodes.ROUTE_ACCOUNTING)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        
        
        GlAccountType rec = fact.createGlAccountType();
        rec.setAcctId(BigInteger.valueOf(200));
        rec.setAccountDescription("GL ACcount Description Test");
        rec.setAccountName("GL Account Name Test");
        rec.setAccountNo("GL Account Number Test");

        GlBalancetypeType gbtt = GlAccountBalanceTypeBuilder.Builder.create()
                .withAcctBalanceTypeId(1).build();
        GlAccounttypeType gatt = GlAccounttypeTypeBuilder.Builder.create()
                .withAcctTypeId(111)
                .withDescription("GL Account Type Description Test").build();
        GlAccountcatgType gact = GlAccountCategoryTypeBuilder.Builder.create()
                .withAcctCatgId(300).withAccountType(gatt)
                .withDescription("GL Account Category Test").build();
        RecordTrackingType tracking = RecordTrackingTypeBuilder.Builder.create()
                .withDateCreated("2018-01-01 10:10:44").build();
        rec.setAcctType(gatt);
        rec.setAcctCatg(gact);
        rec.setBalanceType(gbtt);
        rec.setTracking(tracking);
        
        List<GlAccountType> acctList = new ArrayList<GlAccountType>();
        acctList.add(rec);
        
        GlDetailGroup details = fact.createGlDetailGroup();
        details.getAccount().addAll(acctList);
        req.setProfile(details);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.GL_ACCOUNT_UPDATE));
    }
}
