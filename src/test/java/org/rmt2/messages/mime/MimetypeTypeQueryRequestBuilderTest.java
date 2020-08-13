package org.rmt2.messages.mime;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.CodeGroupType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.LookupCodesRequest;
import org.rmt2.jaxb.MimeDetailGroup;
import org.rmt2.jaxb.MimeTypes;
import org.rmt2.jaxb.MimetypeType;
import org.rmt2.jaxb.MultimediaResponse;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.media.MimetypeTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class MimetypeTypeQueryRequestBuilderTest {

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
        LookupCodesRequest req = fact.createLookupCodesRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("addressbook")
                .withModule(ConfigConstants.API_APP_MODULE_VALUE)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.LOOKUP_GROUP_UPDATE)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        CodeGroupType cgt = fact.createCodeGroupType();
        cgt.setGroupId(BigInteger.valueOf(200));
        cgt.setGroupDesc("Group Description Test");
        req.getGroupCodes().add(cgt);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.LOOKUP_GROUP_UPDATE));
    }
 
    @Test
    public void testBuildResponse() {
        ObjectFactory fact = new ObjectFactory();
        MultimediaResponse req = fact.createMultimediaResponse();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication("mime")
                .withModule(ConfigConstants.API_APP_MODULE_VALUE)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.LOOKUP_GROUP_UPDATE)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        MimeDetailGroup cgt = fact.createMimeDetailGroup();
        MimeTypes g2t = fact.createMimeTypes();
        
        MimetypeType g = MimetypeTypeBuilder.Builder.create()
                .withUID(55)
                .withFileExt(".pdf")
                .withMediaType("application/pdf")
                .build();
        g2t.getMimeType().add(g);        

        g = MimetypeTypeBuilder.Builder.create()
                .withUID(55)
                .withFileExt(".jpg")
                .withMediaType("image/jpeg")
                .build();
        g2t.getMimeType().add(g);     
        
        cgt.setMimetypes(g2t);

        req.setProfile(cgt);
        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.LOOKUP_GROUP_UPDATE));
    }
}
