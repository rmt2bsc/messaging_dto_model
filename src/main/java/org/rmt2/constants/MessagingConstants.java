package org.rmt2.constants;

/**
 * 
 * @author roy.terrell
 *
 */
public class MessagingConstants {

    /**
     * The JAXB package for RMT2 binding classes.  Serves as the JAXB context.
     */
    public static final String JAXB_RMT2_PKG = "org.rmt2.jaxb";
    
    /**
     * Successful return code.
     */
    public static final int RETURN_CODE_SUCCESS = 1;
    
    /**
     * Failure return code.
     */
    public static final int RETURN_CODE_FAILURE = -1;
    
    /**
     * 
     */
    public static final String MSG_TRANSPORT_MODE_SYNC = "SYNC";

    /**
     * 
     */
    public static final String MSG_MODE_REQUEST = "REQUEST";

    /**
     * 
     */
    public static final String MSG_MODE_RESPONSE = "RESPONSE";

    /**
     * 
     */
    
    public static final String MSG_TRANSPORT_MODE_ASYNC = "ASYNC";

    /**
     * 
     */
    public static final String RETURN_STATUS_SUCCESS = "200";

    /**
     * 
     */
    public static final String RETURN_STATUS_BAD_REQUEST = "400";

    /**
     * 
     */
    public static final String XACT_CUSTOM_CRITERIA_LEVEL_BASE = "BASE";
    
    /**
     * 
     */
    public static final String XACT_CUSTOM_CRITERIA_LEVEL_LINEITEM = "LINEITEM";
    
    /**
     * 
     */
    public static final String XACT_CUSTOM_CRITERIA_LEVEL_OTHER = "OTHER";
    
    /**
     * 
     */
    public MessagingConstants() {

    }

}
