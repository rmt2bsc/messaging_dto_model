package org.rmt2.util;

import java.math.BigInteger;
import java.util.Date;

import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.RSCommonReply;
import org.rmt2.jaxb.ReplyStatusType;

import com.api.xml.jaxb.JaxbUtil;
import com.util.RMT2Date;

/**
 * A factory for creating message payload components.
 * 
 * @author Roy Terrell
 * 
 */
public class JaxbPayloadFactory {

    /**
     * Creates a JaxbPayloadFactory object.
     */
    private JaxbPayloadFactory() {
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
    public static HeaderType createHeader(String routing, String app,
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
    public static ReplyStatusType createReplyStatus(boolean successfull,
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
    public static final String buildCommonPayload(int entityId, String message,
            String userId) {
        ObjectFactory f = new ObjectFactory();
        RSCommonReply ws = f.createRSCommonReply();

        HeaderType header = JaxbPayloadFactory.createHeader("routing",
                "application", "module", "RS_common_reply", "SYNC", "RESPONSE",
                userId);
        ws.setHeader(header);
        ReplyStatusType rst = JaxbPayloadFactory.createReplyStatus(true,
                "Web service invocation was successful", message, entityId);
        ws.setReplyStatus(rst);

        JaxbUtil util = new JaxbUtil("org.rmt2.jaxb");
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
