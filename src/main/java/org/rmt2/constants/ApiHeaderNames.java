package org.rmt2.constants;

/**
 * Constant names contained in the header of the a typical RMT2 Message model
 * 
 * @author royterrell
 *
 */
public class ApiHeaderNames {
    public static final String APPLICATION = "application";

    public static final String MODULE = "module";

    public static final String TRANSACTION = "transaction";
    
    public static final String MESSAGE_MODE_REQUEST = "REQUEST";
    
    public static final String MESSAGE_MODE_RESPONSE = "RESPONSE";
    
    public static final String DUMMY_HEADER_VALUE = "XXXXXXX";
    
    public static final String DELIVERY_MODE_SYNC = "SYNC";
    
    public static final String DELIVERY_MODE_ASYNC = "ASYNC";

    /**
     * Application name for accounting
     */
    public static final String APP_NAME_ACCOUNTING = "accounting";

    /**
     * Application name for addressbook
     */
    public static final String APP_NAME_ADDRESSBOOK = "addressbook";

    /**
     * Application name for authentication
     */
    public static final String APP_NAME_AUTHENTICATION = "authentication";

    /**
     * Application name for media
     */
    public static final String APP_NAME_MEDIA = "media";

    /**
     * Application name for projecttracker
     */
    public static final String APP_NAME_PROJECTTRACKER = "projecttracker";
}
