package org.rmt2.messages.media;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.ArtistType;
import org.rmt2.jaxb.AvProjectType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.MimeDetailGroup;
import org.rmt2.jaxb.MultimediaRequest;
import org.rmt2.jaxb.MultimediaResponse;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ReplyStatusType;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.media.AVProjectTypeBuilder;
import org.rmt2.util.media.ArtistTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class ProjectUpdateRequestBuilderTest {

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
                .withApplication("media")
                .withModule("maint")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.MEDIA_ARTIST_PROJECT_UPDATE)
                .withRouting(ApiTransactionCodes.ROUTE_MULTIMEDIA)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        MimeDetailGroup cgt = fact.createMimeDetailGroup();
        cgt.setAudioVideoDetails(fact.createAudioVideoType());

        AvProjectType pt = AVProjectTypeBuilder.Builder.create()
                .withProjectId(300)
                .withArtistId(222)
                .withProjectTypeId(33)
                .withGenreTypeId(125)
                .withMediaTypeId(1)
                .withContentId(9576)
                .withMasterDupId(0)
                .withCost(12.99)
                .withComments("Comments #1")
                .withYear(1984)
                .withTitle("Title #1")
                .withRipped(1)
                .withTotalTime(16)
                .withProducer("Producer #1")
                .withContentPath("/multimedia/audio/ripped/artists/Title #1")
                .withContentFilename(null)
                .withArtWorkPath("/multimedia/audio/ripped/artists/Title #1")
                .withArtWorkFilename("folder.jpg")
                .build();

        ArtistType at = ArtistTypeBuilder.Builder.create()
                .withArtistId(222)
                .withArtistName("Artist Name")
                .withProject(pt)
                .build();

        cgt.getAudioVideoDetails().getArtist().add(at);
        req.setProfile(cgt);
        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.MEDIA_ARTIST_PROJECT_UPDATE));
    }

    @Test
    public void testBuildResponse() {
        ObjectFactory fact = new ObjectFactory();
        MultimediaResponse resp = fact.createMultimediaResponse();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication("media")
                .withModule("maint")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.MEDIA_ARTIST_PROJECT_UPDATE)
                .withRouting(ApiTransactionCodes.ROUTE_MULTIMEDIA)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        ReplyStatusType rst = fact.createReplyStatusType();
        rst.setRecordCount(BigInteger.ONE);
        rst.setReturnCode(BigInteger.ONE);
        rst.setReturnStatus("200");
        rst.setMessage("Artist project, 300, was updated successfully");
        resp.setReplyStatus(rst);
        resp.setHeader(head);

        String xml = jaxb.marshalJsonMessage(resp);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.MEDIA_ARTIST_PROJECT_UPDATE));
    }
}
