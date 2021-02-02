package org.rmt2.messages.media;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.MediaApplicationLinkRequest;
import org.rmt2.jaxb.MediaAttachmentDetailsType;
import org.rmt2.jaxb.MediaAttachmentType;
import org.rmt2.jaxb.MediaLinkGroup;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.util.HeaderTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class MediaApplicationLinkRequestBuilderTest {

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
        MediaApplicationLinkRequest req = fact.createMediaApplicationLinkRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("media")
                .withModule("maint")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.MEDIA_CONTENT_APP_LINK)
                .withRouting(ApiTransactionCodes.ROUTE_MEDIA_LINK)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        MediaLinkGroup mlg = fact.createMediaLinkGroup();
        MediaAttachmentType mat = fact.createMediaAttachmentType();
        MediaAttachmentDetailsType madt = fact.createMediaAttachmentDetailsType();
        madt.setContentId(100);
        madt.setProjectName("Accounting");
        madt.setModuleName("transaction");
        madt.setPropertyName("xact_id");

        mat.setAttachment(madt);
        mlg.setMediaLinkData(mat);
        req.setProfile(mlg);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.MEDIA_CONTENT_APP_LINK));
    }

}
