package org.rmt2.messages;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.AccountingTransactionResponse;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.ReportAttachmentType;
import org.rmt2.jaxb.TransactionDetailGroup;
import org.rmt2.util.HeaderTypeBuilder;
import org.rmt2.util.ReportAttachmentTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.util.RMT2File;
import com.api.util.RMT2String;
import com.api.xml.jaxb.JaxbUtil;

public class ReportAttachmentBuilderTest {
    private final static String TEST_FILE = "files/1581283879785-SalesOrderInvoiceReport.pdf";
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
    public void testBuildResponse() {
        byte[] fileContents = RMT2File.getFileContentsAsBytes(TEST_FILE);
        String dir = RMT2File.getCurrentDirectory();
        // This call will return a valid reference to the file if it exists.
        // Otherwise, null is returned.
        InputStream is = fileContents.getClass().getResourceAsStream(TEST_FILE);
        if (is == null) {
            Assert.fail("Unexpected error occurred:  Test file, " + TEST_FILE + ", was not found");
        }

        String absolutePath = dir + "src/tes/resources/" + TEST_FILE;
        List<String> fileParts = RMT2String.getTokens(TEST_FILE, ".");
        ByteArrayOutputStream baos = RMT2File.createOutputByteStream(is, 1024);

        ObjectFactory fact = new ObjectFactory();
        AccountingTransactionResponse req = fact.createAccountingTransactionResponse();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("transaction")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.ACCOUNTING_SALESORDER_PRINT)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        
        TransactionDetailGroup detailGroup = fact.createTransactionDetailGroup();
        ReportAttachmentType rat = ReportAttachmentTypeBuilder.Builder.create()
                .withFilePath(absolutePath)
                .withFileSize(fileContents.length)
                .withMimeType(fileParts.get(1))
                .withReportId(fileParts.get(0))
                .withReportContent(baos)
                .build();

        detailGroup.setAttachment(rat);
        req.setProfile(detailGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.ACCOUNTING_SALESORDER_PRINT));

        // Test that byte array will produce that same file contents after
        // persisting to disk.
        RMT2File.outputFile(rat.getContent(), "/tmp/unit_test.pdf");
        File test = new File("/tmp/unit_test.pdf");
        Assert.assertTrue(test.exists());
        RMT2File.deleteFile(test);
        test = new File("/tmp/unit_test.pdf");
        Assert.assertFalse(test.exists());
    }
  }
