package org.rmt2.constants;

public class ApiTransactionCodes {

    // AddressBook
    public static final String CONTACTS_GET = "GET_CONTACT";
    public static final String CONTACTS_UPDATE = "UPDATE_CONTACT";
    public static final String CONTACTS_DELETE = "DELETE_CONTACT";
    public static final String LOOKUP_GROUP_GET = "GET_LOOKUP_GROUP";
    public static final String LOOKUP_GROUP_UPDATE = "UPDATE_LOOKUP_GROUP";
    public static final String LOOKUP_GROUP_DELETE = "DELETE_LOOKUP_GROUP";
    public static final String LOOKUP_CODE_GET = "GET_LOOKUP_CODE";
    public static final String LOOKUP_CODE_UPDATE = "UPDATE_LOOKUP_CODE";
    public static final String LOOKUP_CODE_DELETE = "DELETE_LOOKUP_CODE";
    public static final String ZIPCODE_GET = "GET_ZIPCODE";
    public static final String COUNTRY_GET = "GET_COUNTRY";
    public static final String REGION_GET = "GET_REGION";
    public static final String IP_INFO_GET = "GET_IP_INFO";
    public static final String TIMEZONE_GET = "GET_TIMEZONE";

    // MultiMedia
    public static final String MEDIA_GET_CONTENT = "GET_CONTENT_ATTACHMENT";
    public static final String MEDIA_SAVE_CONTENT = "SAVE_CONTENT_ATTACHMENT";
    public static final String MEDIA_CONTENT_APP_LINK = "LINK_CONTENT_TO_APPLICATION";

    // Accounting - General Ledger
    public static final String GL_ACCOUNT_GET = "GET_GL_ACCOUNT";
    public static final String GL_ACCOUNT_UPDATE = "UPDATE_GL_ACCOUNT";
    public static final String GL_ACCOUNT_DELETE = "DELETE_GL_ACCOUNT";
    public static final String GL_ACCOUNT_TYPE_GET = "GET_GL_ACCOUNT_TYPE";
    public static final String GL_ACCOUNT_CATG_GET = "GET_GL_ACCOUNT_CATG";
    public static final String GL_ACCOUNT_CATG_UPDATE = "UPDATE_GL_ACCOUNT_CATG";
    public static final String GL_ACCOUNT_CATG_DELETE = "DELETE_GL_ACCOUNT_CATG";
    
    // Accounting - Inventory
    public static final String INVENTORY_ITEM_STATUS_HIST_GET = "GET_ITEM_STATUS_HIST";
    public static final String INVENTORY_ITEM_CURRENT_STATUS_HIST_GET = "GET_CURRENT_ITEM_STATUS_HIST";
    public static final String INVENTORY_ITEM_MASTER_GET = "GET_ITEM_MASTER";
    public static final String INVENTORY_ITEM_MASTER_UPDATE = "UPDATE_ITEM_MASTER";
    public static final String INVENTORY_ITEM_MASTER_DELETE = "DELETE_ITEM_MASTER";
    public static final String INVENTORY_ITEM_MASTER_ACTIVATE = "ACTIVATE_ITEM_MASTER";
    public static final String INVENTORY_ITEM_MASTER_DEACTIVATE = "DEACTIVATE_ITEM_MASTER";
    
    public static final String ACCOUNTING_SALESORDER_CREATE = "CREATE_SALES_ORDER";
    
    public ApiTransactionCodes() {
        // TODO Auto-generated constructor stub
    }

}
