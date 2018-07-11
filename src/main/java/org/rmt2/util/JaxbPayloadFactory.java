package org.rmt2.util;

import java.math.BigInteger;
import java.util.Date;

import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RSCommonReply;
import org.rmt2.jaxb.ReplyStatusType;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.util.RMT2Date;
import com.api.xml.jaxb.JaxbUtil;

/**
 * A factory for creating common message payload components.
 * 
 * @author Roy Terrell
 * 
 */
public class JaxbPayloadFactory {

    /**
     * Creates a JaxbPayloadFactory object.
     */
    JaxbPayloadFactory() {
        return;
    }

    /**
     * Creates a JAXB HeaderType using <i>msgId</i>, <i>delivMode</i>,
     * <i>msgType</i>, and <i>userId</i>.
     * 
     * @param msgId
     *            the message id
     * @param delivMode
     *            the deliver mode. Valid values are "SYNC" and "ASYNC".
     * @param msgType
     *            the message mode. Valid values are "REQUEST" and "RESPONSE".
     * @param userId
     *            the user id.
     * @return an instance of {@link com.xml.schema.bindings.HeaderType
     *         HeaderType}
     */
    public static final HeaderType createHeader(String routing, String app,
            String module, String transaction, String delivMode,
            String msgType, String userId) {
        ObjectFactory f = new ObjectFactory();
        HeaderType header = f.createHeaderType();
        header.setRouting(routing);
        header.setApplication(app);
        header.setModule(module);
        header.setTransaction(transaction);
        header.setDeliveryMode(delivMode);
        header.setMessageMode(msgType);
        String delivDate = RMT2Date.formatDate(new Date(),
                "MM/dd/yyyy HH:mm:ss");
        header.setDeliveryDate(delivDate);
        header.setUserId(userId);
        return header;
    }
    
    /**
     * Create a reply status type object.
     * 
     * @param returnCode
     * @param statusCode
     * @param message
     * @param extMessage
     * @return
     */
    public static final ReplyStatusType createReplyStatus(int returnCode, String statusCode, String message, String extMessage) {
        ReplyStatusType rs = ReplyStatusTypeBuilder.Builder.create()
                .withReturnCode(returnCode)
                .withStatus(statusCode)
                .withMessage(message)
                .withDetailMessage(extMessage)
                .build();
        return rs;
    }

    /**
     * Creates a JAXB ReplyStatusType using <i>successfull</i>, <i>msg</i>,
     * <i>detailMsg</i>, and <i>returnCode</i>.
     * 
     * @param successfull
     *            boolean indicating true for SUCCESS and false for ERROR.
     * @param msg
     *            the message text
     * @param detailMsg
     *            extended message text
     * @param returnCode
     *            an int value which its meaning is significant to the
     *            implementor.
     * @return an instance of {@link ReplyStatusType}
     */
    public static final ReplyStatusType createReplyStatus(boolean successfull,
            String msg, String detailMsg, int returnCode) {
        ObjectFactory f = new ObjectFactory();
        ReplyStatusType replyStat = f.createReplyStatusType();
        String status = null;

        if (successfull) {
            status = "SUCCESS";
        }
        else {
            status = "ERROR";
        }
        replyStat.setReturnStatus(status);

        if (msg == null) {
            msg = status;
        }
        if (detailMsg == null) {
            detailMsg = status;
        }
        replyStat.setMessage(msg);
        replyStat.setExtMessage(detailMsg);
        replyStat.setReturnCode(BigInteger.valueOf(returnCode));
        return replyStat;
    }

    /**
     * Build a common response reply which will represent an error message.
     * 
     * @param errMsg
     * @param errCode
     * @param app
     * @param module
     * @param trans
     * @return an instance of {@link RSCommonReply}
     */
    public static final RSCommonReply buildCommonErrorResponseMessage(String errMsg, String extErrMsg, 
            int errCode, String app, String module, String trans) {
        ObjectFactory fact = new ObjectFactory();
        HeaderType header = HeaderTypeBuilder.Builder.create()
                .withApplication(app).withModule(module).withTransaction(trans)
                .withDeliveryDate(new Date()).withRouting("Busiess Server")
                .build();
        
        ReplyStatusType rs = createReplyStatus(errCode, MessagingConstants.RETURN_STATUS_SUCCESS, errMsg, extErrMsg);
        RSCommonReply reply = fact.createRSCommonReply();
        reply.setReplyStatus(rs);
        reply.setHeader(header);
        return reply;
    }
    
    /**
     * Build a common response reply, which will represent an error message, and
     * return as an XML String.
     * 
     * @param errMsg
     * @param errCode
     * @param app
     * @param module
     * @param trans
     * @return XML String equivalent of {@link RSCommonReply}
     */
    public static final String buildCommonErrorResponseMessageXml(String errMsg, String extErrMsg, 
            int errCode, String app, String module, String trans) {
        RSCommonReply reply = buildCommonErrorResponseMessage(errMsg, extErrMsg,
                errCode, app, module, trans);
        JaxbUtil jaxb = SystemConfigurator.getJaxb(ConfigConstants.JAXB_CONTEXNAME_DEFAULT);
        String xml = jaxb.marshalJsonMessage(reply);
        return xml;
    }
    
    
    /**
     * Produces a common web service reply representing a successful invocation.
     * 
     * @param entityId
     *            a unique id representing the the entity impacted.
     * @param message
     *            the message text describing the successful invocation
     * @param userId
     *            the login id of the responsible user.
     * @return XML document as the reply
     * @throws DataServiceException
     *             general errors.
     */
    public static final String buildCommonPayload(int entityId, String message, String userId) {
        ObjectFactory f = new ObjectFactory();
        RSCommonReply ws = f.createRSCommonReply();

        HeaderType header = JaxbPayloadFactory.createHeader("routing",
                "application", "module", "RS_common_reply", "SYNC", "RESPONSE",
                userId);
        ws.setHeader(header);
        ReplyStatusType rst = JaxbPayloadFactory.createReplyStatus(true,
                "Web service invocation was successful", message, entityId);
        ws.setReplyStatus(rst);

        JaxbUtil util = new JaxbUtil(MessagingConstants.JAXB_RMT2_PKG);
        String rawXml = util.marshalMessage(ws);
        return rawXml;
    }

    /**
     * Produces a common web service reply representing a failed invocation.
     * 
     * @param errorCode
     *            the error code
     * @param message
     *            the message text describing why the web service failed
     * @param userId
     *            the login id of the responsible user.
     * @return XML document as the reply
     * @throws DataServiceException
     *             general errors
     */
    public static final String buildCommonErrorPayload(int errorCode,
            String message, String userId) {
        ObjectFactory f = new ObjectFactory();
        RSCommonReply ws = f.createRSCommonReply();

        HeaderType header = JaxbPayloadFactory.createHeader("routing",
                "application", "module", "RS_common_reply", "SYNC", "RESPONSE",
                userId);
        ws.setHeader(header);
        ReplyStatusType rst = JaxbPayloadFactory.createReplyStatus(false,
                "Web service invocation failed", message, errorCode);
        ws.setReplyStatus(rst);

        JaxbUtil util = new JaxbUtil("org.rmt2.jaxb");
        String rawXml = util.marshalMessage(ws);
        return rawXml;
    }
}
