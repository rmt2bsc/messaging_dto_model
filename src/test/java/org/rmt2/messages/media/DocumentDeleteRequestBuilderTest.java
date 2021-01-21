package org.rmt2.messages.media;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.ContentCriteriaType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.MimeCriteriaGroup;
import org.rmt2.jaxb.MultimediaRequest;
import org.rmt2.jaxb.MultimediaResponse;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ReplyStatusType;
import org.rmt2.util.HeaderTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.util.RMT2File;
import com.api.xml.jaxb.JaxbUtil;

public class DocumentDeleteRequestBuilderTest {

    private JaxbUtil jaxb;
    private static final String TEST_FILENAME = "MsWord.docx";
    private static String TEST_FILE_DIR;
    private byte[] fileContent;
    
    @Before
    public void setUp() throws Exception {
        try {
            jaxb = SystemConfigurator.getJaxb(ConfigConstants.JAXB_CONTEXNAME_DEFAULT);
        }
        catch (Exception e) {
            jaxb = new JaxbUtil(MessagingConstants.JAXB_RMT2_PKG);
        }
    }

    private String getSourceDirectory() throws Exception {
        String OS = System.getProperty("os.name").toLowerCase();
        boolean win = (OS.indexOf("win") >= 0);
        String srcDir = RMT2File.getCurrentDirectory();
        if (win) {
            srcDir += "\\src\\test\\resources\\media\\document\\";
        }
        else {
            srcDir += "/src/test/resources/media/document/";
        }
        return srcDir;
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
                .withTransaction(ApiTransactionCodes.MEDIA_CONTENT_DELETE)
                .withRouting(ApiTransactionCodes.ROUTE_MULTIMEDIA)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        MimeCriteriaGroup mdg = fact.createMimeCriteriaGroup();
        ContentCriteriaType mct = fact.createContentCriteriaType();
        mct.setContentId(9865);

        mdg.setContentCriteria(mct);
        req.setCriteria(mdg);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.MEDIA_CONTENT_DELETE));
    }
 
    @Test
    public void testBuildResponse() {
        // Get test file contents
        try {
            TEST_FILE_DIR = this.getSourceDirectory();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Unable to fetch file contents");
        }
        this.fileContent = RMT2File.getFileContentsAsBytes(TEST_FILE_DIR + TEST_FILENAME);

        ObjectFactory fact = new ObjectFactory();
        MultimediaResponse resp = fact.createMultimediaResponse();

        HeaderType head = HeaderTypeBuilder.Builder.create()
                .withApplication("media")
                .withModule("maint")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())

                // Set these header elements with dummy values in order to be
                // properly assigned later.
                .withTransaction(ApiTransactionCodes.MEDIA_CONTENT_DELETE)
                .withRouting(ApiTransactionCodes.ROUTE_MULTIMEDIA)
                .withSessionId(ConfigConstants.API_DUMMY_SESSION_ID)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();

        ReplyStatusType rst = fact.createReplyStatusType();
        rst.setRecordCount(BigInteger.ONE);
        rst.setReturnCode(BigInteger.ONE);
        rst.setReturnStatus("200");
        rst.setMessage("Document, " + TEST_FILENAME + ", was deleted successfully");
        resp.setReplyStatus(rst);

        resp.setHeader(head);

        String xml = jaxb.marshalJsonMessage(resp);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.MEDIA_CONTENT_DELETE));
    }
}
