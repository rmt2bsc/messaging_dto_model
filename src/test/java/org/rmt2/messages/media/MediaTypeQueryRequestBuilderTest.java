package org.rmt2.messages.media;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AudioVideoCriteriaType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.MediaTypes;
import org.rmt2.jaxb.MediatypeType;
import org.rmt2.jaxb.MimeDetailGroup;
import org.rmt2.jaxb.MultimediaRequest;
import org.rmt2.jaxb.MultimediaResponse;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.media.MediatypeTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class MediaTypeQueryRequestBuilderTest {

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
        MultimediaRequest req = fact.createMultimediaRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication(ApiTransactionCodes.APP_MEDIA)
                .withModule(ApiTransactionCodes.MODULE_MEDIA_LOOKUP)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.MEDIA_MEDIATYPE_GET)
                .withRouting(ApiTransactionCodes.ROUTE_MULTIMEDIA)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        AudioVideoCriteriaType cgt = fact.createAudioVideoCriteriaType();
        cgt.setMediaTypeId(200);
        cgt.setMediaTypeName("Media Type Description Test");

        req.setCriteria(fact.createMimeCriteriaGroup());
        req.getCriteria().setAudioVideoCriteria(cgt);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.MEDIA_MEDIATYPE_GET));
    }
 
    @Test
    public void testBuildResponse() {
        ObjectFactory fact = new ObjectFactory();
        MultimediaResponse req = fact.createMultimediaResponse();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication(ApiTransactionCodes.APP_MEDIA)
                .withModule(ApiTransactionCodes.MODULE_MEDIA_LOOKUP)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.MEDIA_MEDIATYPE_GET)
                .withRouting(ApiTransactionCodes.ROUTE_MULTIMEDIA)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        MimeDetailGroup cgt = fact.createMimeDetailGroup();
        MediaTypes g2t = fact.createMediaTypes();
        
        MediatypeType g = MediatypeTypeBuilder.Builder.create()
                .withUID(55)
                .withName("Compact Disc")
                .build();
        g2t.getMediaType().add(g);        

        g = MediatypeTypeBuilder.Builder.create()
                .withUID(56)
                .withName("Blue Ray Disc")
                .build();
        g2t.getMediaType().add(g); 
        
        cgt.setMediatypes(g2t);

        req.setProfile(cgt);
        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.MEDIA_MEDIATYPE_GET));
    }
}
