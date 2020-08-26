package org.rmt2.messages.media;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AudioBatchImportCriteriaType;
import org.rmt2.jaxb.BatchImportType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.MimeDetailGroup;
import org.rmt2.jaxb.MultimediaRequest;
import org.rmt2.jaxb.MultimediaResponse;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.media.BatchImportTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.util.RMT2Date;
import com.api.xml.jaxb.JaxbUtil;

public class AudioMetadataImportBatchRequestBuilderTest {
    private static final String TEST_AUDIO_PATH = "//rmtdalmedia01/multimedia/audio";
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
                .withTransaction(ApiTransactionCodes.MEDIA_AUDIO_METADATA_IMPORT_BATCH)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        AudioBatchImportCriteriaType cgt = fact.createAudioBatchImportCriteriaType();
        cgt.setLocation(TEST_AUDIO_PATH);

        req.setCriteria(fact.createMimeCriteriaGroup());
        req.getCriteria().setAudioBatchImportCriteria(cgt);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.MEDIA_AUDIO_METADATA_IMPORT_BATCH));
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
                .withTransaction(ApiTransactionCodes.MEDIA_AUDIO_METADATA_IMPORT_BATCH)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        BatchImportType bit = BatchImportTypeBuilder.Builder.create()
                .withStartTime(RMT2Date.stringToDate("2020-01-01 03:00:00"))
                .withEndTime(RMT2Date.stringToDate("2020-01-01 05:03:45"))
                .withSuccessTotal(1000)
                .withFailureTotal(4)
                .withProcessTotal(1004)
                .withNonAudioFilesEncountered(0)
                .build();
        
        
        MimeDetailGroup cgt = fact.createMimeDetailGroup();
        cgt.setBatchImportResults(bit);
        req.setProfile(cgt);
        req.setHeader(head);

        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.MEDIA_AUDIO_METADATA_IMPORT_BATCH));

        // Verify that duration calculation is working properly as well as
        // padding the minutes and seconds properties with the accurate number
        // of zeroes.
        Assert.assertEquals("2:03:45", bit.getDuration());
    }
}
