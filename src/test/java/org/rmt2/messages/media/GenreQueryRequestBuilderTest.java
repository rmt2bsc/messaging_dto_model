package org.rmt2.messages.media;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AudioVisualCriteriaType;
import org.rmt2.jaxb.GenreType;
import org.rmt2.jaxb.GenresType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.MimeCriteriaGroup;
import org.rmt2.jaxb.MimeDetailGroup;
import org.rmt2.jaxb.MultimediaRequest;
import org.rmt2.jaxb.MultimediaResponse;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.media.GenreTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class GenreQueryRequestBuilderTest {

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
                .withModule(ConfigConstants.API_APP_MODULE_VALUE)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.MEDIA_GENRE_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        AudioVisualCriteriaType cgt = fact.createAudioVisualCriteriaType();
        cgt.setGenreId(120);
        cgt.setGenreName("Jazz");

        MimeCriteriaGroup mcg = fact.createMimeCriteriaGroup();
        mcg.setAudioVisualCriteria(cgt);
        req.setCriteria(mcg);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.MEDIA_GENRE_GET));
    }
 
    @Test
    public void testBuildResponse() {
        ObjectFactory fact = new ObjectFactory();
        MultimediaResponse req = fact.createMultimediaResponse();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication("media")
                .withModule(ConfigConstants.API_APP_MODULE_VALUE)
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.MEDIA_GENRE_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        MimeDetailGroup cgt = fact.createMimeDetailGroup();
        GenresType g2t = fact.createGenresType();
        
        GenreType g = GenreTypeBuilder.Builder.create()
                .withUID(55)
                .withName("Jazz")
                .build();
        g2t.getGenre().add(g);        

        g = GenreTypeBuilder.Builder.create()
                .withUID(56)
                .withName("Rock")
                .build();
        g2t.getGenre().add(g);
        
        cgt.setGenres(g2t);

        req.setProfile(cgt);
        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.MEDIA_GENRE_GET));
    }
}