package org.rmt2.messages.accounting.generalledger;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AccountingGeneralLedgerRequest;
import org.rmt2.jaxb.GlAccountcatgType;
import org.rmt2.jaxb.GlDetailGroup;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.accounting.generalledger.GlAccountCategoryTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class GLAccountCategoryDeleteRequestBuilderTest {

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
                .withModule(ApiTransactionCodes.MOODULE_GL)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.GL_ACCOUNT_CATG_DELETE)
                .withRouting(ApiTransactionCodes.ROUTE_ACCOUNTING)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        
        GlAccountcatgType gact = GlAccountCategoryTypeBuilder.Builder.create()
                .withAcctCatgId(300).build();
        
        GlDetailGroup detailGroup = fact.createGlDetailGroup();
        detailGroup.getAccountCategory().add(gact);
        req.setProfile(detailGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.GL_ACCOUNT_CATG_DELETE));
    }
}
