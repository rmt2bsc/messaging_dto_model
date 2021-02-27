package org.rmt2.constants;

public class ApiTransactionCodes {

    public static final String APP_ADDRESSBOOK = "addressbook";
    public static final String APP_ACCOUNTING = "accounting";
    public static final String APP_MULTIMEDIA = "multimedia";
    public static final String APP_SECURITY = "security";
    public static final String APP_PROJECTTRACKER = "projecttracker";
    public static final String APP_AUTHENTICATION = "authentication";

    public static final String ROUTE_ACCOUNTING = "JMS:rmt2.queue.accounting";
    public static final String ROUTE_ADDRESSBOOK = "JMS:rmt2.queue.addressbook";
    public static final String ROUTE_MULTIMEDIA = "JMS:rmt2.queue.media";
    public static final String ROUTE_PROJECTTRACKER = "JMS:rmt2.queue.projecttracker";
    public static final String ROUTE_AUTHENTICATION = "JMS:rmt2.queue.authentication";
    public static final String ROUTE_MEDIA_LINK = "JMS:rmt2.topic.media";

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

    // Accounting - General Ledger
    public static final String GL_ACCOUNT_GET = "GET_GL_ACCOUNT";
    public static final String GL_ACCOUNT_UPDATE = "UPDATE_GL_ACCOUNT";
    public static final String GL_ACCOUNT_DELETE = "DELETE_GL_ACCOUNT";
    public static final String GL_ACCOUNT_TYPE_GET = "GET_GL_ACCOUNT_TYPE";
    public static final String GL_ACCOUNT_CATG_GET = "GET_GL_ACCOUNT_CATG";
    public static final String GL_ACCOUNT_CATG_UPDATE = "UPDATE_GL_ACCOUNT_CATG";
    public static final String GL_ACCOUNT_CATG_DELETE = "DELETE_GL_ACCOUNT_CATG";

    // Accounting - Inventory
    public static final String INVENTORY_ITEM_STATUS_GET = "GET_ITEM_STATUS";
    public static final String INVENTORY_ITEM_STATUS_HIST_GET = "GET_ITEM_STATUS_HIST";
    public static final String INVENTORY_ITEM_CURRENT_STATUS_HIST_GET = "GET_CURRENT_ITEM_STATUS_HIST";
    public static final String INVENTORY_ITEM_TYPE_GET = "GET_ITEM_TYPE";
    public static final String INVENTORY_ITEM_MASTER_GET = "GET_ITEM_MASTER";
    public static final String INVENTORY_ITEM_MASTER_UPDATE = "UPDATE_ITEM_MASTER";
    public static final String INVENTORY_ITEM_MASTER_DELETE = "DELETE_ITEM_MASTER";
    public static final String INVENTORY_ITEM_MASTER_ACTIVATE = "ACTIVATE_ITEM_MASTER";
    public static final String INVENTORY_ITEM_MASTER_DEACTIVATE = "DEACTIVATE_ITEM_MASTER";
    public static final String INVENTORY_ITEM_RETAIL_OVERRIDE_ADD = "ADD_ITEM_RETAIL_OVERRIDE";
    public static final String INVENTORY_ITEM_RETAIL_OVERRIDE_REMOVE = "REMOVE_ITEM_RETAIL_OVERRIDE";
    public static final String INVENTORY_VENDOR_ITEM_GET = "GET_VENDOR_ITEM";
    public static final String INVENTORY_VENDOR_ASSIGNED_ITEMS_GET = "GET_VENDOR_ASSIGNED_ITEMS";
    public static final String INVENTORY_VENDOR_UNASSIGNED_ITEMS_GET = "GET_VENDOR_UNASSIGNED_ITEMS";
    public static final String INVENTORY_VENDOR_ITEM_ASSIGN = "ASSIGN_VENDOR_ITEM";
    public static final String INVENTORY_VENDOR_ITEM_REMOVE = "REMOVE_VENDOR_ITEM";
    public static final String INVENTORY_VENDOR_ITEM_UPDATE = "UPDATE_VENDOR_ITEM";

    // Accounting - Subsidiary
    public static final String SUBSIDIARY_CUSTOMER_GET = "GET_CUSTOMER";
    public static final String SUBSIDIARY_CUSTOMER_UPDATE = "UPDATE_CUSTOMER";
    public static final String SUBSIDIARY_CUSTOMER_DELETE = "DELETE_CUSTOMER";
    public static final String SUBSIDIARY_CUSTOMER_TRAN_HIST_GET = "GET_CUSTOMER_TRAN_HIST";
    public static final String SUBSIDIARY_CREDITOR_GET = "GET_CREDITOR";
    public static final String SUBSIDIARY_CREDITOR_UPDATE = "UPDATE_CREDITOR";
    public static final String SUBSIDIARY_CREDITOR_DELETE = "DELETE_CREDITOR";
    public static final String SUBSIDIARY_CREDITOR_TRAN_HIST_GET = "GET_CREDITOR_TRAN_HIST";
    public static final String SUBSIDIARY_CREDITOR_TYPE_GET = "GET_CREDITOR_TYPE";

    // Accounting - Transaction Code
    public static final String ACCOUNTING_TRANSACTION_GROUP_GET = "GET_TRANS_GROUP";
    public static final String ACCOUNTING_TRANSACTION_CODE_GET = "GET_TRANS_CODE";

    // Accounting - Basic Transaction
    public static final String ACCOUNTING_GENERIC_TRANSACTION_GET = "GET_GENERIC_TRANSACTION";
    public static final String ACCOUNTING_TRANSACTION_GET = "GET_TRANSACTION";
    public static final String ACCOUNTING_TRANSACTION_CREATE = "CREATE_TRANSACTION";
    public static final String ACCOUNTING_TRANSACTION_REVERSE = "REVERSE_TRANSACTION";
    public static final String ACCOUNTING_CASHDISBURSE_GET = "GET_CASH_DISBURSEMENT";
    public static final String ACCOUNTING_CASHDISBURSE_CREATE = "CREATE_CASH_DISBURSEMENT";
    public static final String ACCOUNTING_CASHDISBURSE_CREDITOR_CREATE = "CREATE_CASH_DISBURSEMENT_CREDITOR";
    public static final String ACCOUNTING_CREDITPURCHASE_GET = "GET_CREDITOR_PURCHASES";
    public static final String ACCOUNTING_CREDITPURCHASE_CREATE = "CREATE_CREDITOR_PURCHASES";
    public static final String ACCOUNTING_CASHRECEIPT_GET = "GET_CASH_RECEIPT";
    public static final String ACCOUNTING_CASHRECEIPT_CREATE = "CREATE_CASH_RECEIPT";

    // Accounting - Sales Order Transactions
    public static final String ACCOUNTING_SALESORDER_GET = "GET_SALES_ORDER";
    public static final String ACCOUNTING_SALESORDER_CREATE = "CREATE_SALES_ORDER";
    public static final String ACCOUNTING_SALESORDER_INVOICE_CREATE = "CREATE_SALES_ORDER_AND_INVOICE";
    public static final String ACCOUNTING_SALESORDER_INVOICE_PAYMENT_CREATE = "CREATE_SALES_ORDER_AND_INVOICE_AND_CASHRECEIPT";
    public static final String ACCOUNTING_SALESORDER_UPDATE = "UPDATE_SALES_ORDER";
    public static final String ACCOUNTING_SALESORDER_INVOICE_UPDATE = "UPDATE_SALES_ORDER_AND_INVOICE";
    public static final String ACCOUNTING_SALESORDER_INVOICE_PAYMENT_UPDATE = "UPDATE_SALES_ORDER_AND_INVOICE_AND_CASHRECEIPT";
    public static final String ACCOUNTING_SALESORDER_CLOSE_WITH_PAYMENT = "CLOSE_SALES_ORDER_WITH_PAYMENT";
    public static final String ACCOUNTING_SALESORDER_DELETE = "DELETE_SALES_ORDER";
    public static final String ACCOUNTING_SALESORDER_CANCEL = "CANCEL_SALES_ORDER";
    public static final String ACCOUNTING_SALESORDER_REFUND = "REFUND_SALES_ORDER";
    public static final String ACCOUNTING_SALESORDER_PRINT = "PRINT_SALES_ORDER";
    public static final String ACCOUNTING_SALESORDER_GET_CUSTOMER_SPECIFIC = "GET_CUSTOMER_SALES_ORDER";
    public static final String ACCOUNTING_TRANSACTION_BY_ID_GET = "GET_TRANS_BY_ID";

    // Project Tracker - Employee Transactions
    public static final String PROJTRACK_CLIENT_GET = "GET_CLIENT";
    public static final String PROJTRACK_PROJECT_GET = "GET_PROJECT";
    public static final String PROJTRACK_PROJECT_UPDATE = "UPDATE_PROJECT";
    public static final String PROJTRACK_PROJECT_DELETE = "DELETE_PROJECT";
    public static final String PROJTRACK_TASK_GET = "GET_TASK";
    public static final String PROJTRACK_TASK_UPDATE = "UPDATE_TASK";
    public static final String PROJTRACK_TASK_DELETE = "DELETE_TASK";
    public static final String PROJTRACK_EMPLOYEE_GET = "GET_EMPLOYEE";
    public static final String PROJTRACK_EMPLOYEE_UPDATE = "UPDATE_EMPLOYEE";
    public static final String PROJTRACK_EMPLOYEE_PROJECT_GET = "GET_EMPLOYEE_PROJECT";
    public static final String PROJTRACK_EMPLOYEE_PROJECT_UPDATE = "UPDATE_EMPLOYEE_PROJECT";
    public static final String PROJTRACK_EMPLOYEE_TITLE_GET = "GET_EMPLOYEE_TITLE";
    public static final String PROJTRACK_EMPLOYEE_TYPE_GET = "GET_EMPLOYEE_TYPE";

    // Project Tracker - Timesheet Transactions
    public static final String PROJTRACK_TIMESHEET_GET = "GET_TIMESHEET";
    public static final String PROJTRACK_TIMESHEET_UPDATE = "UPDATE_TIMESHEET";
    public static final String PROJTRACK_TIMESHEET_DELETE = "DELETE_TIMESHEET";
    public static final String PROJTRACK_TIMESHEET_SUBMIT = "SUBMIT_TIMESHEET";
    public static final String PROJTRACK_TIMESHEET_APPROVE = "APPROVE_TIMESHEET";
    public static final String PROJTRACK_TIMESHEET_DECLINE = "DECLINE_TIMESHEET";
    public static final String PROJTRACK_TIMESHEET_INVOICE = "INVOICE_TIMESHEET";
    public static final String PROJTRACK_TIMESHEET_PRINT_SUMMARY = "PRINT_TIMESHEET_SUMMARY";
    public static final String PROJTRACK_TIMESHEET_PRINT_WORKLOG = "PRINT_TIMESHEET_WORKLOG";
    public static final String PROJTRACK_TIMESHEET_STATUS_GET = "GET_TIMESHEET_STATUS";

    // MultiMedia Transactions
    public static final String MEDIA_GENRE_GET = "GET_GENRE";
    public static final String MEDIA_MEDIATYPE_GET = "GET_MEDIA_TYPE";
    public static final String MEDIA_AUDIO_METADATA_IMPORT_BATCH = "BATCH_AUDIO_METADATA_IMPORT";
    public static final String MEDIA_VIDEO_METADATA_IMPORT_BATCH = "BATCH_VIDEO_METADATA_IMPORT";
    public static final String MEDIA_ARTIST_GET = "GET_ARTIST";
    public static final String MEDIA_ARTIST_UPDATE = "UPDATE_ARTIST";
    public static final String MEDIA_ARTIST_DELETE = "DELETE_ARTIST";
    public static final String MEDIA_ARTIST_PROJECT_GET = "GET_ARTIST_PROJECT";
    public static final String MEDIA_ARTIST_PROJECT_UPDATE = "UPDATE_ARTIST_PROJECT";
    public static final String MEDIA_TRACK_GET = "GET_TRACK";
    public static final String MEDIA_TRACK_UPDATE = "UPDATE_TRACK";
    public static final String MEDIA_CONSOLIDATED_SEARCH = "SEARCH_MEDIA";
    public static final String MEDIA_MANUAL_UPLOAD_CONTENT = "MANUAL_UPLOAD_CONTENT";
    public static final String MEDIA_CONTENT_GET = "GET_CONTENT";
    public static final String MEDIA_CONTENT_DELETE = "DELETE_CONTENT";
    public static final String MEDIA_FILE_LISTENER_START = "START_MEDIA_FILE_LISTENER";
    public static final String MEDIA_FILE_LISTENER_STOP = "STOP_MEDIA_FILE_LISTENER";
    public static final String MEDIA_FILE_LISTENER_HEALTH = "HEALTH_CHECK_MEDIA_FILE_LISTENER";
    public static final String MEDIA_CONTENT_APP_LINK = "LINK_CONTENT_TO_APPLICATION";

    // Authentication / Security transactions
    public static final String AUTH_APPLICATION_GET = "GET_APPLICATION";
    public static final String AUTH_APPLICATION_UPDATE = "UPDATE_APPLICATION";
    public static final String AUTH_APPLICATION_DELETE = "DELETE_APPLICATION";
    public static final String AUTH_ROLE_UPDATE = "UPDATE_ROLE";
    public static final String AUTH_ROLE_GET = "GET_ROLE";
    public static final String AUTH_ROLE_DELETE = "DELETE_ROLE";
    public static final String AUTH_RESOURCE_TYPE_UPDATE = "UPDATE_RESOURCE_TYPE";
    public static final String AUTH_RESOURCE_TYPE_GET = "GET_RESOURCE_TYPE";
    public static final String AUTH_RESOURCE_TYPE_DELETE = "DELETE_RESOURCE_TYPE";
    public static final String AUTH_RESOURCE_SUB_TYPE_UPDATE = "UPDATE_RESOURCE_SUB_TYPE";
    public static final String AUTH_RESOURCE_SUB_TYPE_GET = "GET_RESOURCE_SUB_TYPE";

    public ApiTransactionCodes() {
        // TODO Auto-generated constructor stub
    }

}
