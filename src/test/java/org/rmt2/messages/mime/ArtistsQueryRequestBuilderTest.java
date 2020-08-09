package org.rmt2.messages.mime;

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
import org.rmt2.jaxb.CodeGroupType;
import org.rmt2.jaxb.GenreType;
import org.rmt2.jaxb.GenresType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.LookupCodesRequest;
import org.rmt2.jaxb.MimeDetailGroup;
import org.rmt2.jaxb.MultimediaResponse;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.TrackType;
import org.rmt2.util.HeaderTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class ArtistsQueryRequestBuilderTest {

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
        cgt.setAudioVideoDetails(fact.createAudioVisualType());

        AvProjectType pt = fact.createAvProjectType();
        pt.setProjectId(300);
        pt.setArtistId(200);
        pt.setCost(12.99);
        pt.setComments("sommoth jazz");
        pt.setYear(1984);
        pt.setTitle("Title #1");
        pt.setRipped(1);

        TrackType tt1 = fact.createTrackType();
        tt1.setTrackId(1000);
        tt1.setTrackName("Track Name 1");
        tt1.setDiscNumber(1);
        tt1.setHours(0);
        tt1.setMinutes(3);
        tt1.setSeconds(10);
        pt.getTrack().add(tt1);

        tt1 = fact.createTrackType();
        tt1.setTrackId(1001);
        tt1.setTrackName("Track Name 2");
        tt1.setDiscNumber(1);
        tt1.setHours(0);
        tt1.setMinutes(4);
        tt1.setSeconds(30);
        pt.getTrack().add(tt1);

        fact.createTrackType();
        tt1.setTrackId(1002);
        tt1.setTrackName("Track Name 3");
        tt1.setDiscNumber(1);
        tt1.setHours(0);
        tt1.setMinutes(6);
        tt1.setSeconds(44);
        pt.getTrack().add(tt1);

        ArtistType at = fact.createArtistType();
        at.getProject().add(pt);
        cgt.getAudioVideoDetails().getArtist().add(at);

        GenreType g = fact.createGenreType();
        g.setGenreId(55);
        g.setGenreName("Jazz");
        GenresType g2t = fact.createGenresType();
        g2t.getGenre().add(g);
        cgt.setGenres(g2t);

        g = fact.createGenreType();
        g.setGenreId(56);
        g.setGenreName("Rock");
        // g2t = fact.createGenresType();
        g2t.getGenre().add(g);
        cgt.setGenres(g2t);

        req.setProfile(cgt);
        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.LOOKUP_GROUP_UPDATE));
    }
}
