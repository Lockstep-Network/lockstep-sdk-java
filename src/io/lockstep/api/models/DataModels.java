/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
 */

package io.lockstep.api;



public class ActivityModel
{
    private String activityId;
    private String groupKey;
    private String companyId;
    private String activityTypeCode;
    private String activityName;
    private String activityDescription;
    private String activityStatus;
    private boolean isOpen;
    private String priority;
    private String userAssignedTo;
    private String dateAssigned;
    private String dateClosed;
    private String snoozeUntilDate;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private Double amountCollected;
    private Double amountPaid;
    private Double creditGiven;
    private boolean isUnread;
    private boolean isArchived;
    private AttachmentModel[] attachments;
    private NoteModel[] notes;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getactivityId() { return this.activityId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setactivityId(String value) { this.activityId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The ID of the company to which this activity belongs.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID of the company to which this activity belongs.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The type code of the activity
     */
    public String getactivityTypeCode() { return this.activityTypeCode; }
    /**
     * The type code of the activity
     */
    public void setactivityTypeCode(String value) { this.activityTypeCode = value; }
    /**
     * The name of the activity.  The name is a short name provided by the
     * person who created the activity that can be displayed in a list.
     */
    public String getactivityName() { return this.activityName; }
    /**
     * The name of the activity.  The name is a short name provided by the
     * person who created the activity that can be displayed in a list.
     */
    public void setactivityName(String value) { this.activityName = value; }
    /**
     * A description of the activity.  This field contains more detailed text about the
     * activity and can be lengthy.
     */
    public String getactivityDescription() { return this.activityDescription; }
    /**
     * A description of the activity.  This field contains more detailed text about the
     * activity and can be lengthy.
     */
    public void setactivityDescription(String value) { this.activityDescription = value; }
    /**
     * The status of the activity.
     */
    public String getactivityStatus() { return this.activityStatus; }
    /**
     * The status of the activity.
     */
    public void setactivityStatus(String value) { this.activityStatus = value; }
    /**
     * True if this activity is currently "open", which indicates that the activitiy is
     * currently in progress.
     */
    public boolean getisOpen() { return this.isOpen; }
    /**
     * True if this activity is currently "open", which indicates that the activitiy is
     * currently in progress.
     */
    public void setisOpen(boolean value) { this.isOpen = value; }
    /**
     * The priority of the activity.
     */
    public String getpriority() { return this.priority; }
    /**
     * The priority of the activity.
     */
    public void setpriority(String value) { this.priority = value; }
    /**
     * The ID of the user the activity is assigned to.
     */
    public String getuserAssignedTo() { return this.userAssignedTo; }
    /**
     * The ID of the user the activity is assigned to.
     */
    public void setuserAssignedTo(String value) { this.userAssignedTo = value; }
    /**
     * The date the activity was assigned.
     */
    public String getdateAssigned() { return this.dateAssigned; }
    /**
     * The date the activity was assigned.
     */
    public void setdateAssigned(String value) { this.dateAssigned = value; }
    /**
     * The date the activity was closed.
     */
    public String getdateClosed() { return this.dateClosed; }
    /**
     * The date the activity was closed.
     */
    public void setdateClosed(String value) { this.dateClosed = value; }
    /**
     * If this activity has been "snoozed", this field will be non-null and will contain
     * the date when the activity will be displayed.  Until that date arrives, the activity
     * will remain hidden.
     */
    public String getsnoozeUntilDate() { return this.snoozeUntilDate; }
    /**
     * If this activity has been "snoozed", this field will be non-null and will contain
     * the date when the activity will be displayed.  Until that date arrives, the activity
     * will remain hidden.
     */
    public void setsnoozeUntilDate(String value) { this.snoozeUntilDate = value; }
    /**
     * The date on which this activity was created.
     */
    public String getcreated() { return this.created; }
    /**
     * The date on which this activity was created.
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID of the user who created this activity.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this activity.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this activity was last modified.
     */
    public String getmodified() { return this.modified; }
    /**
     * The date on which this activity was last modified.
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The ID of the user who last modified this activity.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this activity.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * Amount collected (if any) for the activity.
     */
    public Double getamountCollected() { return this.amountCollected; }
    /**
     * Amount collected (if any) for the activity.
     */
    public void setamountCollected(Double value) { this.amountCollected = value; }
    /**
     * Amount paid (if any) for the activity.
     */
    public Double getamountPaid() { return this.amountPaid; }
    /**
     * Amount paid (if any) for the activity.
     */
    public void setamountPaid(Double value) { this.amountPaid = value; }
    /**
     * Credit given (if any) for the activity.
     */
    public Double getcreditGiven() { return this.creditGiven; }
    /**
     * Credit given (if any) for the activity.
     */
    public void setcreditGiven(Double value) { this.creditGiven = value; }
    /**
     * True if this activity is to be shown in an "unread" state.  When an activity
     * is read by a person it is assigned to, this flag is set to false.
     */
    public boolean getisUnread() { return this.isUnread; }
    /**
     * True if this activity is to be shown in an "unread" state.  When an activity
     * is read by a person it is assigned to, this flag is set to false.
     */
    public void setisUnread(boolean value) { this.isUnread = value; }
    /**
     * Activities may be archived when they should be hidden from the user.  When
     * this flag is true, this activity should be hidden.
     */
    public boolean getisArchived() { return this.isArchived; }
    /**
     * Activities may be archived when they should be hidden from the user.  When
     * this flag is true, this activity should be hidden.
     */
    public void setisArchived(boolean value) { this.isArchived = value; }
    /**
     * All attachments attached to applied activity.
     * 
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to applied activity.
     * 
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All notes attached to this applied activity.
     * 
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this applied activity.
     * 
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All definitions attached to this applied activity.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this applied activity.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this activity.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this activity.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
public class AgingModel
{
    private Integer bucket;
    private String currencyCode;
    private Double outstandingBalance;

    /**
     * Aging bucket of outstanding balance data (days past due date of invoice)
     */
    public Integer getbucket() { return this.bucket; }
    /**
     * Aging bucket of outstanding balance data (days past due date of invoice)
     */
    public void setbucket(Integer value) { this.bucket = value; }
    /**
     * Currency code of aging bucket
     */
    public String getcurrencyCode() { return this.currencyCode; }
    /**
     * Currency code of aging bucket
     */
    public void setcurrencyCode(String value) { this.currencyCode = value; }
    /**
     * Outstanding balance for the given aging bucket
     */
    public Double getoutstandingBalance() { return this.outstandingBalance; }
    /**
     * Outstanding balance for the given aging bucket
     */
    public void setoutstandingBalance(Double value) { this.outstandingBalance = value; }
};
public class ApiKeyModel
{
    private String apiKeyId;
    private String groupKey;
    private String name;
    private String apiKey;
    private String keyPrefix;
    private String created;
    private String createdUserId;
    private String revoked;
    private String revokedUserId;
    private String expires;

    /**
     * The unique identifier for the API key.
     */
    public String getapiKeyId() { return this.apiKeyId; }
    /**
     * The unique identifier for the API key.
     */
    public void setapiKeyId(String value) { this.apiKeyId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The name of the API key.
     */
    public String getname() { return this.name; }
    /**
     * The name of the API key.
     */
    public void setname(String value) { this.name = value; }
    /**
     * The API key to use for authentication. This will only be returned upon creation of the API key.
     * All other times, this value will be `null`.
     * 
     * For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     */
    public String getapiKey() { return this.apiKey; }
    /**
     * The API key to use for authentication. This will only be returned upon creation of the API key.
     * All other times, this value will be `null`.
     * 
     * For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     */
    public void setapiKey(String value) { this.apiKey = value; }
    /**
     * The first 10 characters of the API key.  This information can be used to ensure that you are
     * looking at the correct API Key, but cannot be used for authentication.
     */
    public String getkeyPrefix() { return this.keyPrefix; }
    /**
     * The first 10 characters of the API key.  This information can be used to ensure that you are
     * looking at the correct API Key, but cannot be used for authentication.
     */
    public void setkeyPrefix(String value) { this.keyPrefix = value; }
    /**
     * The date the API key was created.
     */
    public String getcreated() { return this.created; }
    /**
     * The date the API key was created.
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The user that created the API key.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The user that created the API key.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the API key was revoked.
     */
    public String getrevoked() { return this.revoked; }
    /**
     * The date the API key was revoked.
     */
    public void setrevoked(String value) { this.revoked = value; }
    /**
     * The user who revoked the API key.
     */
    public String getrevokedUserId() { return this.revokedUserId; }
    /**
     * The user who revoked the API key.
     */
    public void setrevokedUserId(String value) { this.revokedUserId = value; }
    /**
     * The UTC datetime when the API key expires.
     */
    public String getexpires() { return this.expires; }
    /**
     * The UTC datetime when the API key expires.
     */
    public void setexpires(String value) { this.expires = value; }
};
public class AppEnrollmentCustomFieldModel
{
    private String appEnrollmentId;
    private String appId;
    private String name;
    private String appType;
    private String groupKey;
    private String customFieldDefinitionId;
    private String customFieldLabel;
    private String dataType;
    private Integer sortOrder;
    private String stringValue;
    private Double numericValue;

    /**
     * Unique id for the app enrollment
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * Unique id for the app enrollment
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Id of enrolled app
     */
    public String getappId() { return this.appId; }
    /**
     * Id of enrolled app
     */
    public void setappId(String value) { this.appId = value; }
    /**
     * The name of the application
     */
    public String getname() { return this.name; }
    /**
     * The name of the application
     */
    public void setname(String value) { this.name = value; }
    /**
     * Tag for what type of app the application is
     */
    public String getappType() { return this.appType; }
    /**
     * Tag for what type of app the application is
     */
    public void setappType(String value) { this.appType = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * Unique Id for the custom field definition
     */
    public String getcustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * Unique Id for the custom field definition
     */
    public void setcustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * Text to display in-application for custom field
     */
    public String getcustomFieldLabel() { return this.customFieldLabel; }
    /**
     * Text to display in-application for custom field
     */
    public void setcustomFieldLabel(String value) { this.customFieldLabel = value; }
    /**
     * Data type of the custom field definition
     */
    public String getdataType() { return this.dataType; }
    /**
     * Data type of the custom field definition
     */
    public void setdataType(String value) { this.dataType = value; }
    /**
     * Used for display logic when multiple app enrollment custom fields exist
     */
    public Integer getsortOrder() { return this.sortOrder; }
    /**
     * Used for display logic when multiple app enrollment custom fields exist
     */
    public void setsortOrder(Integer value) { this.sortOrder = value; }
    /**
     * String of data for field
     */
    public String getstringValue() { return this.stringValue; }
    /**
     * String of data for field
     */
    public void setstringValue(String value) { this.stringValue = value; }
    /**
     * Number data for field
     */
    public Double getnumericValue() { return this.numericValue; }
    /**
     * Number data for field
     */
    public void setnumericValue(Double value) { this.numericValue = value; }
};
public class AppEnrollmentModel
{
    private String appEnrollmentId;
    private String appId;
    private String groupKey;
    private boolean isActive;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String cronSettings;
    private boolean syncScheduleIsActive;
    private ApplicationModel app;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;
    private SyncRequestModel lastSync;
    private ConnectorInfoModel connectorInfo;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The ID number of the Application that this enrollment represents.  You can fetch information
     * about this Application object by specifying `App` in the "Include" parameter for your request.
     */
    public String getappId() { return this.appId; }
    /**
     * The ID number of the Application that this enrollment represents.  You can fetch information
     * about this Application object by specifying `App` in the "Include" parameter for your request.
     */
    public void setappId(String value) { this.appId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * Determines whether the app enrollment is in use
     */
    public boolean getisActive() { return this.isActive; }
    /**
     * Determines whether the app enrollment is in use
     */
    public void setisActive(boolean value) { this.isActive = value; }
    /**
     * Created date
     */
    public String getcreated() { return this.created; }
    /**
     * Created date
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * Created user ID
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * Created user ID
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Last modified date
     */
    public String getmodified() { return this.modified; }
    /**
     * Last modified date
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * Last user ID to modify
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * Last user ID to modify
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * Stores schedule information for the application enrollment
     * see https://en.wikipedia.org/wiki/Cron
     */
    public String getcronSettings() { return this.cronSettings; }
    /**
     * Stores schedule information for the application enrollment
     * see https://en.wikipedia.org/wiki/Cron
     */
    public void setcronSettings(String value) { this.cronSettings = value; }
    /**
     * Flag indicating if the Sync process should be ran on the specified schedule
     */
    public boolean getsyncScheduleIsActive() { return this.syncScheduleIsActive; }
    /**
     * Flag indicating if the Sync process should be ran on the specified schedule
     */
    public void setsyncScheduleIsActive(boolean value) { this.syncScheduleIsActive = value; }
    /**
     * The Application to which this AppEnrollment belongs.  Contains general name, description,
     * logo, and other metadata about this application.
     * 
     * To retrieve this object, specify `App` in the "Include" parameter for your query.
     */
    public ApplicationModel getapp() { return this.app; }
    /**
     * The Application to which this AppEnrollment belongs.  Contains general name, description,
     * logo, and other metadata about this application.
     * 
     * To retrieve this object, specify `App` in the "Include" parameter for your query.
     */
    public void setapp(ApplicationModel value) { this.app = value; }
    /**
     * All definitions attached to this app.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this app.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this app.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this app.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Data about the last sync attached to this app enrollment
     * 
     * To retrieve this collection, specify `LastSync` in the "Include" parameter for your query.
     */
    public SyncRequestModel getlastSync() { return this.lastSync; }
    /**
     * Data about the last sync attached to this app enrollment
     * 
     * To retrieve this collection, specify `LastSync` in the "Include" parameter for your query.
     */
    public void setlastSync(SyncRequestModel value) { this.lastSync = value; }
    /**
     * Optional data necessary to create an app enrollment for a supported connector.
     * Only enter relevant fields for the given connector.
     */
    public ConnectorInfoModel getconnectorInfo() { return this.connectorInfo; }
    /**
     * Optional data necessary to create an app enrollment for a supported connector.
     * Only enter relevant fields for the given connector.
     */
    public void setconnectorInfo(ConnectorInfoModel value) { this.connectorInfo = value; }
};
public class ApplicationModel
{
    private String appId;
    private String name;
    private String description;
    private String appType;
    private String ownerId;
    private String projectUrl;
    private String iconUrl;
    private String priceTerms;
    private String createdUserId;
    private String modifiedUserId;
    private String created;
    private String modified;
    private boolean isActive;
    private String wikiURL;
    private String groupKey;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * A unique code identifying this application
     */
    public String getappId() { return this.appId; }
    /**
     * A unique code identifying this application
     */
    public void setappId(String value) { this.appId = value; }
    /**
     * The name of this application
     */
    public String getname() { return this.name; }
    /**
     * The name of this application
     */
    public void setname(String value) { this.name = value; }
    /**
     * Brief summary of this application shown as a subtitle
     */
    public String getdescription() { return this.description; }
    /**
     * Brief summary of this application shown as a subtitle
     */
    public void setdescription(String value) { this.description = value; }
    /**
     * Tag for what type of app this is
     */
    public String getappType() { return this.appType; }
    /**
     * Tag for what type of app this is
     */
    public void setappType(String value) { this.appType = value; }
    /**
     * The ID of the owner
     */
    public String getownerId() { return this.ownerId; }
    /**
     * The ID of the owner
     */
    public void setownerId(String value) { this.ownerId = value; }
    /**
     * The URL to visit for more information about this application
     */
    public String getprojectUrl() { return this.projectUrl; }
    /**
     * The URL to visit for more information about this application
     */
    public void setprojectUrl(String value) { this.projectUrl = value; }
    /**
     * The URL for the icon for this application
     */
    public String geticonUrl() { return this.iconUrl; }
    /**
     * The URL for the icon for this application
     */
    public void seticonUrl(String value) { this.iconUrl = value; }
    /**
     * The description of the price for this application
     */
    public String getpriceTerms() { return this.priceTerms; }
    /**
     * The description of the price for this application
     */
    public void setpriceTerms(String value) { this.priceTerms = value; }
    /**
     * The ID of the user who created this application
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this application
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The ID of the user who last modified this application
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this application
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The date this application was created
     */
    public String getcreated() { return this.created; }
    /**
     * The date this application was created
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The date this application was last modified
     */
    public String getmodified() { return this.modified; }
    /**
     * The date this application was last modified
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * Flag indicating if the application is active.
     */
    public boolean getisActive() { return this.isActive; }
    /**
     * Flag indicating if the application is active.
     */
    public void setisActive(boolean value) { this.isActive = value; }
    /**
     * URL to the Wiki for the Application
     */
    public String getwikiURL() { return this.wikiURL; }
    /**
     * URL to the Wiki for the Application
     */
    public void setwikiURL(String value) { this.wikiURL = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * All notes attached to this app.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this app.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this app.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this app.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
public class ArAgingHeaderInfoModel
{
    private String groupKey;
    private String reportBucket;
    private Integer totalCustomers;
    private Integer totalInvoicesOutstanding;
    private Double totalOutstandingAmount;
    private Double totalArAmount;
    private Double percentageOfTotalAr;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The aging bucket this data belongs to.
     */
    public String getreportBucket() { return this.reportBucket; }
    /**
     * The aging bucket this data belongs to.
     */
    public void setreportBucket(String value) { this.reportBucket = value; }
    /**
     * The total number of customers.
     */
    public Integer gettotalCustomers() { return this.totalCustomers; }
    /**
     * The total number of customers.
     */
    public void settotalCustomers(Integer value) { this.totalCustomers = value; }
    /**
     * The total number of invoices outstanding.
     */
    public Integer gettotalInvoicesOutstanding() { return this.totalInvoicesOutstanding; }
    /**
     * The total number of invoices outstanding.
     */
    public void settotalInvoicesOutstanding(Integer value) { this.totalInvoicesOutstanding = value; }
    /**
     * The total amount outstanding.
     */
    public Double gettotalOutstandingAmount() { return this.totalOutstandingAmount; }
    /**
     * The total amount outstanding.
     */
    public void settotalOutstandingAmount(Double value) { this.totalOutstandingAmount = value; }
    /**
     * The total amount for AR.
     */
    public Double gettotalArAmount() { return this.totalArAmount; }
    /**
     * The total amount for AR.
     */
    public void settotalArAmount(Double value) { this.totalArAmount = value; }
    /**
     * Portion of Total AR this data represents.
     */
    public Double getpercentageOfTotalAr() { return this.percentageOfTotalAr; }
    /**
     * Portion of Total AR this data represents.
     */
    public void setpercentageOfTotalAr(Double value) { this.percentageOfTotalAr = value; }
};
public class ArHeaderInfoModel
{
    private String groupKey;
    private Date reportPeriod;
    private Integer totalCustomers;
    private Integer totalInvoices;
    private Double totalInvoicedAmount;
    private Double totalUnappliedPayments;
    private Double totalCollected;
    private Double totalArAmount;
    private Integer totalInvoicesPaid;
    private Integer totalInvoicesPastDue;
    private Integer totalInvoices90DaysPastDue;
    private Double totalPastDueAmount;
    private Double totalPastDueAmount90Days;
    private Double percentageOfTotalAr;
    private Double dso;
    private Double totalInvoiceAmountCurrentYear;
    private Double totalInvoiceAmountPreviousYear;
    private Double totalPaymentAmountCurrentYear;
    private Integer totalCollectedPastThirtyDays;
    private Integer totalInvoicesPaidPastThirtyDays;
    private Double percentageOfTotalAr90DaysPastDue;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The date of the report
     */
    public Date getreportPeriod() { return this.reportPeriod; }
    /**
     * The date of the report
     */
    public void setreportPeriod(Date value) { this.reportPeriod = value; }
    /**
     * The total number of customers.
     */
    public Integer gettotalCustomers() { return this.totalCustomers; }
    /**
     * The total number of customers.
     */
    public void settotalCustomers(Integer value) { this.totalCustomers = value; }
    /**
     * The total number of invoices.
     */
    public Integer gettotalInvoices() { return this.totalInvoices; }
    /**
     * The total number of invoices.
     */
    public void settotalInvoices(Integer value) { this.totalInvoices = value; }
    /**
     * The total amount invoiced.
     */
    public Double gettotalInvoicedAmount() { return this.totalInvoicedAmount; }
    /**
     * The total amount invoiced.
     */
    public void settotalInvoicedAmount(Double value) { this.totalInvoicedAmount = value; }
    /**
     * The total number of unapplied payments.
     */
    public Double gettotalUnappliedPayments() { return this.totalUnappliedPayments; }
    /**
     * The total number of unapplied payments.
     */
    public void settotalUnappliedPayments(Double value) { this.totalUnappliedPayments = value; }
    /**
     * The total amount of collected payments.
     */
    public Double gettotalCollected() { return this.totalCollected; }
    /**
     * The total amount of collected payments.
     */
    public void settotalCollected(Double value) { this.totalCollected = value; }
    /**
     * The total accounts receivable amount.
     */
    public Double gettotalArAmount() { return this.totalArAmount; }
    /**
     * The total accounts receivable amount.
     */
    public void settotalArAmount(Double value) { this.totalArAmount = value; }
    /**
     * The number of paid invoices.
     */
    public Integer gettotalInvoicesPaid() { return this.totalInvoicesPaid; }
    /**
     * The number of paid invoices.
     */
    public void settotalInvoicesPaid(Integer value) { this.totalInvoicesPaid = value; }
    /**
     * The number of past due invoices.
     */
    public Integer gettotalInvoicesPastDue() { return this.totalInvoicesPastDue; }
    /**
     * The number of past due invoices.
     */
    public void settotalInvoicesPastDue(Integer value) { this.totalInvoicesPastDue = value; }
    /**
     * The number of past due invoices for the last 90 days.
     */
    public Integer gettotalInvoices90DaysPastDue() { return this.totalInvoices90DaysPastDue; }
    /**
     * The number of past due invoices for the last 90 days.
     */
    public void settotalInvoices90DaysPastDue(Integer value) { this.totalInvoices90DaysPastDue = value; }
    /**
     * The total amount past due.
     */
    public Double gettotalPastDueAmount() { return this.totalPastDueAmount; }
    /**
     * The total amount past due.
     */
    public void settotalPastDueAmount(Double value) { this.totalPastDueAmount = value; }
    /**
     * The total past due for the past 90 days.
     */
    public Double gettotalPastDueAmount90Days() { return this.totalPastDueAmount90Days; }
    /**
     * The total past due for the past 90 days.
     */
    public void settotalPastDueAmount90Days(Double value) { this.totalPastDueAmount90Days = value; }
    /**
     * Portion of Total AR that is Past due.
     */
    public Double getpercentageOfTotalAr() { return this.percentageOfTotalAr; }
    /**
     * Portion of Total AR that is Past due.
     */
    public void setpercentageOfTotalAr(Double value) { this.percentageOfTotalAr = value; }
    /**
     * Daily sales outstanding.
     */
    public Double getdso() { return this.dso; }
    /**
     * Daily sales outstanding.
     */
    public void setdso(Double value) { this.dso = value; }
    /**
     * The total amount invoiced, due this year.
     */
    public Double gettotalInvoiceAmountCurrentYear() { return this.totalInvoiceAmountCurrentYear; }
    /**
     * The total amount invoiced, due this year.
     */
    public void settotalInvoiceAmountCurrentYear(Double value) { this.totalInvoiceAmountCurrentYear = value; }
    /**
     * The total amount invoiced, due last year.
     */
    public Double gettotalInvoiceAmountPreviousYear() { return this.totalInvoiceAmountPreviousYear; }
    /**
     * The total amount invoiced, due last year.
     */
    public void settotalInvoiceAmountPreviousYear(Double value) { this.totalInvoiceAmountPreviousYear = value; }
    /**
     * The total of all payments received this year.
     */
    public Double gettotalPaymentAmountCurrentYear() { return this.totalPaymentAmountCurrentYear; }
    /**
     * The total of all payments received this year.
     */
    public void settotalPaymentAmountCurrentYear(Double value) { this.totalPaymentAmountCurrentYear = value; }
    /**
     * The total amount of payments received in the last 30 days
     */
    public Integer gettotalCollectedPastThirtyDays() { return this.totalCollectedPastThirtyDays; }
    /**
     * The total amount of payments received in the last 30 days
     */
    public void settotalCollectedPastThirtyDays(Integer value) { this.totalCollectedPastThirtyDays = value; }
    /**
     * The total amount of Invoices paid in the last 30 days
     */
    public Integer gettotalInvoicesPaidPastThirtyDays() { return this.totalInvoicesPaidPastThirtyDays; }
    /**
     * The total amount of Invoices paid in the last 30 days
     */
    public void settotalInvoicesPaidPastThirtyDays(Integer value) { this.totalInvoicesPaidPastThirtyDays = value; }
    /**
     * Portion of Total AR that is 90+ days Past due.
     */
    public Double getpercentageOfTotalAr90DaysPastDue() { return this.percentageOfTotalAr90DaysPastDue; }
    /**
     * Portion of Total AR that is 90+ days Past due.
     */
    public void setpercentageOfTotalAr90DaysPastDue(Double value) { this.percentageOfTotalAr90DaysPastDue = value; }
};
public class AtRiskInvoiceSummaryModel
{
    private Date reportDate;
    private String groupKey;
    private String customerId;
    private String invoiceId;
    private String invoiceNumber;
    private Date invoiceDate;
    private String customerName;
    private String status;
    private Date paymentDueDate;
    private Double invoiceAmount;
    private Double outstandingBalance;
    private String invoiceTypeCode;
    private Date newestActivity;
    private Integer daysPastDue;
    private String[] paymentNumbers;
    private String[] paymentIds;

    /**
     * The date of the report
     */
    public Date getreportDate() { return this.reportDate; }
    /**
     * The date of the report
     */
    public void setreportDate(Date value) { this.reportDate = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID number of this invoice.
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The unique ID number of this invoice.
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * A reference code that is used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public String getinvoiceNumber() { return this.invoiceNumber; }
    /**
     * A reference code that is used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public void setinvoiceNumber(String value) { this.invoiceNumber = value; }
    /**
     * The reporting date for this invoice.
     */
    public Date getinvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     */
    public void setinvoiceDate(Date value) { this.invoiceDate = value; }
    /**
     * The name of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getcustomerName() { return this.customerName; }
    /**
     * The name of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setcustomerName(String value) { this.customerName = value; }
    /**
     * The status of the invoice.
     */
    public String getstatus() { return this.status; }
    /**
     * The status of the invoice.
     */
    public void setstatus(String value) { this.status = value; }
    /**
     * The due date of the invoice.
     */
    public Date getpaymentDueDate() { return this.paymentDueDate; }
    /**
     * The due date of the invoice.
     */
    public void setpaymentDueDate(Date value) { this.paymentDueDate = value; }
    /**
     * The total amount of the Invoice.
     */
    public Double getinvoiceAmount() { return this.invoiceAmount; }
    /**
     * The total amount of the Invoice.
     */
    public void setinvoiceAmount(Double value) { this.invoiceAmount = value; }
    /**
     * The remaining balance value of this invoice.
     */
    public Double getoutstandingBalance() { return this.outstandingBalance; }
    /**
     * The remaining balance value of this invoice.
     */
    public void setoutstandingBalance(Double value) { this.outstandingBalance = value; }
    /**
     * A code identifying the type of this Invoice.
     */
    public String getinvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this Invoice.
     */
    public void setinvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * The date stamp for the newest Activity on this Invoice.
     */
    public Date getnewestActivity() { return this.newestActivity; }
    /**
     * The date stamp for the newest Activity on this Invoice.
     */
    public void setnewestActivity(Date value) { this.newestActivity = value; }
    /**
     * The number of days this Invoice is past due.
     */
    public Integer getdaysPastDue() { return this.daysPastDue; }
    /**
     * The number of days this Invoice is past due.
     */
    public void setdaysPastDue(Integer value) { this.daysPastDue = value; }
    /**
     * The memo text of the payments associated to this invoice.
     */
    public String[] getpaymentNumbers() { return this.paymentNumbers; }
    /**
     * The memo text of the payments associated to this invoice.
     */
    public void setpaymentNumbers(String[] value) { this.paymentNumbers = value; }
    /**
     * The ids of the payments associated to this invoice.
     */
    public String[] getpaymentIds() { return this.paymentIds; }
    /**
     * The ids of the payments associated to this invoice.
     */
    public void setpaymentIds(String[] value) { this.paymentIds = value; }
};
public class AttachmentModel
{
    private String attachmentId;
    private String groupKey;
    private String tableKey;
    private String objectKey;
    private String fileName;
    private String fileExt;
    private String attachmentTypeId;
    private boolean isArchived;
    private String originAttachmentId;
    private boolean viewInternal;
    private boolean viewExternal;
    private String created;
    private String createdUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getattachmentId() { return this.attachmentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setattachmentId(String value) { this.attachmentId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The name of the table the attachment is associated with
     */
    public String gettableKey() { return this.tableKey; }
    /**
     * The name of the table the attachment is associated with
     */
    public void settableKey(String value) { this.tableKey = value; }
    /**
     * The ID of the object the attachment is associated with
     */
    public String getobjectKey() { return this.objectKey; }
    /**
     * The ID of the object the attachment is associated with
     */
    public void setobjectKey(String value) { this.objectKey = value; }
    /**
     * Name of the file
     */
    public String getfileName() { return this.fileName; }
    /**
     * Name of the file
     */
    public void setfileName(String value) { this.fileName = value; }
    /**
     * Extension type of the file
     */
    public String getfileExt() { return this.fileExt; }
    /**
     * Extension type of the file
     */
    public void setfileExt(String value) { this.fileExt = value; }
    /**
     * Corresponding AttachmentType object to describe this attachment
     */
    public String getattachmentTypeId() { return this.attachmentTypeId; }
    /**
     * Corresponding AttachmentType object to describe this attachment
     */
    public void setattachmentTypeId(String value) { this.attachmentTypeId = value; }
    /**
     * Flag indicating the attachment was archived
     */
    public boolean getisArchived() { return this.isArchived; }
    /**
     * Flag indicating the attachment was archived
     */
    public void setisArchived(boolean value) { this.isArchived = value; }
    public String getoriginAttachmentId() { return this.originAttachmentId; }
    public void setoriginAttachmentId(String value) { this.originAttachmentId = value; }
    /**
     * Flag for if LS clients can see this file
     */
    public boolean getviewInternal() { return this.viewInternal; }
    /**
     * Flag for if LS clients can see this file
     */
    public void setviewInternal(boolean value) { this.viewInternal = value; }
    /**
     * Flag for if Vendors and customers can see this file
     */
    public boolean getviewExternal() { return this.viewExternal; }
    /**
     * Flag for if Vendors and customers can see this file
     */
    public void setviewExternal(boolean value) { this.viewExternal = value; }
    /**
     * The date the attachment was created
     */
    public String getcreated() { return this.created; }
    /**
     * The date the attachment was created
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * Id of the user who made the file
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * Id of the user who made the file
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
};
public class AvailableGroup
{
    private String groupKey;
    private Integer invoiceCount;
    private Integer lineCount;
    private Integer companyCount;
    private Integer contactCount;
    private Integer paymentCount;
    private Integer paymentAppliedCount;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The number of invoices.
     */
    public Integer getinvoiceCount() { return this.invoiceCount; }
    /**
     * The number of invoices.
     */
    public void setinvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * The number of invoice lines.
     */
    public Integer getlineCount() { return this.lineCount; }
    /**
     * The number of invoice lines.
     */
    public void setlineCount(Integer value) { this.lineCount = value; }
    /**
     * The number of companies.
     */
    public Integer getcompanyCount() { return this.companyCount; }
    /**
     * The number of companies.
     */
    public void setcompanyCount(Integer value) { this.companyCount = value; }
    /**
     * The number of contacts.
     */
    public Integer getcontactCount() { return this.contactCount; }
    /**
     * The number of contacts.
     */
    public void setcontactCount(Integer value) { this.contactCount = value; }
    /**
     * The number of payments.
     */
    public Integer getpaymentCount() { return this.paymentCount; }
    /**
     * The number of payments.
     */
    public void setpaymentCount(Integer value) { this.paymentCount = value; }
    /**
     * The number of payments applied.
     */
    public Integer getpaymentAppliedCount() { return this.paymentAppliedCount; }
    /**
     * The number of payments applied.
     */
    public void setpaymentAppliedCount(Integer value) { this.paymentAppliedCount = value; }
};
public class AvailableMigrationsModel
{
    private AvailableGroup[] migrations;

    /**
     * Indicates which records are available for migration
     */
    public AvailableGroup[] getmigrations() { return this.migrations; }
    /**
     * Indicates which records are available for migration
     */
    public void setmigrations(AvailableGroup[] value) { this.migrations = value; }
};
public class BulkCurrencyConversionModel
{
    private Date date;
    private String sourceCurrency;

    /**
     * The date for the currency rate
     */
    public Date getdate() { return this.date; }
    /**
     * The date for the currency rate
     */
    public void setdate(Date value) { this.date = value; }
    /**
     * The currency code This will be validated by the /api/v1/currencies data set
     */
    public String getsourceCurrency() { return this.sourceCurrency; }
    /**
     * The currency code This will be validated by the /api/v1/currencies data set
     */
    public void setsourceCurrency(String value) { this.sourceCurrency = value; }
};
public class CashflowReportModel
{
    private Integer timeframe;
    private Double paymentsCollected;
    private Integer paymentsCollectedCount;
    private Double invoicesBilled;
    private Integer invoicesBilledCount;

    /**
     * Timeframe in days the cashflow report is generated on
     */
    public Integer gettimeframe() { return this.timeframe; }
    /**
     * Timeframe in days the cashflow report is generated on
     */
    public void settimeframe(Integer value) { this.timeframe = value; }
    /**
     * Amount of payments collected based in the timeframe
     */
    public Double getpaymentsCollected() { return this.paymentsCollected; }
    /**
     * Amount of payments collected based in the timeframe
     */
    public void setpaymentsCollected(Double value) { this.paymentsCollected = value; }
    /**
     * Number of payments collected based in the timeframe
     */
    public Integer getpaymentsCollectedCount() { return this.paymentsCollectedCount; }
    /**
     * Number of payments collected based in the timeframe
     */
    public void setpaymentsCollectedCount(Integer value) { this.paymentsCollectedCount = value; }
    /**
     * Amount of invoices billed based in the timeframe
     */
    public Double getinvoicesBilled() { return this.invoicesBilled; }
    /**
     * Amount of invoices billed based in the timeframe
     */
    public void setinvoicesBilled(Double value) { this.invoicesBilled = value; }
    /**
     * Number of invoices billed in the timeframe
     */
    public Integer getinvoicesBilledCount() { return this.invoicesBilledCount; }
    /**
     * Number of invoices billed in the timeframe
     */
    public void setinvoicesBilledCount(Integer value) { this.invoicesBilledCount = value; }
};
public class CodeDefinitionModel
{
    private String codeDefinitionId;
    private String groupKey;
    private String codeType;
    private String code;
    private String codeDescription;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getcodeDefinitionId() { return this.codeDefinitionId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setcodeDefinitionId(String value) { this.codeDefinitionId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The type of the Code Definition
     */
    public String getcodeType() { return this.codeType; }
    /**
     * The type of the Code Definition
     */
    public void setcodeType(String value) { this.codeType = value; }
    /**
     * The Code to be defined.
     */
    public String getcode() { return this.code; }
    /**
     * The Code to be defined.
     */
    public void setcode(String value) { this.code = value; }
    /**
     * The definition of the Code
     */
    public String getcodeDescription() { return this.codeDescription; }
    /**
     * The definition of the Code
     */
    public void setcodeDescription(String value) { this.codeDescription = value; }
    /**
     * The date that the Code Definition was created
     */
    public String getcreated() { return this.created; }
    /**
     * The date that the Code Definition was created
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID of the user who created the Code Definition
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the Code Definition
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the Code Definition was last modified
     */
    public String getmodified() { return this.modified; }
    /**
     * The date the Code Definition was last modified
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The ID of the user who last modified the Code Definition
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the Code Definition
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
};
public class CompanyModel
{
    private String companyId;
    private String companyName;
    private String erpKey;
    private String companyType;
    private String companyStatus;
    private String parentCompanyId;
    private String enterpriseId;
    private String groupKey;
    private boolean isActive;
    private String defaultCurrencyCode;
    private String companyLogoUrl;
    private String primaryContactId;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String stateRegion;
    private String postalCode;
    private String country;
    private String phoneNumber;
    private String faxNumber;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String modifiedUserName;
    private String taxId;
    private String dunsNumber;
    private String apEmailAddress;
    private String arEmailAddress;
    private String domainName;
    private String companyClassificationCodeDefId;
    private String description;
    private String website;
    private String appEnrollmentId;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private ContactModel[] contacts;
    private object[] invoices;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;
    private CodeDefinitionModel companyClassificationCodeDefinition;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The short name of the company.
     */
    public String getcompanyName() { return this.companyName; }
    /**
     * The short name of the company.
     */
    public void setcompanyName(String value) { this.companyName = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String geterpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void seterpKey(String value) { this.erpKey = value; }
    /**
     * This field indicates the type of company.  It can be one of a limited number of values:
     * Company, Customer, Group, or Vendor.  A company that represents both a customer and a vendor
     * is identified as a CustomerVendor.
     * 
     * * `Company` - This record represents a company that is part of the organization of the account holder.
     * * `Customer` - This record represents a business entity that purchases things from the account holder.
     * * `Group` - Only one record of type `GROUP` exists in each account.  Contains your account profile.
     * * `Vendor` - This record represents a business entity that sells things to the account holder.
     * * `CustomerVendor` - Both a customer and a vendor.
     */
    public String getcompanyType() { return this.companyType; }
    /**
     * This field indicates the type of company.  It can be one of a limited number of values:
     * Company, Customer, Group, or Vendor.  A company that represents both a customer and a vendor
     * is identified as a CustomerVendor.
     * 
     * * `Company` - This record represents a company that is part of the organization of the account holder.
     * * `Customer` - This record represents a business entity that purchases things from the account holder.
     * * `Group` - Only one record of type `GROUP` exists in each account.  Contains your account profile.
     * * `Vendor` - This record represents a business entity that sells things to the account holder.
     * * `CustomerVendor` - Both a customer and a vendor.
     */
    public void setcompanyType(String value) { this.companyType = value; }
    /**
     * The status of the company.  Companies can be either `Active` or `Inactive`.  When matched to a
     * Lockstep corporate profile, this value will change to reflect that this record will be kept
     * in sync with that company's identity.
     */
    public String getcompanyStatus() { return this.companyStatus; }
    /**
     * The status of the company.  Companies can be either `Active` or `Inactive`.  When matched to a
     * Lockstep corporate profile, this value will change to reflect that this record will be kept
     * in sync with that company's identity.
     */
    public void setcompanyStatus(String value) { this.companyStatus = value; }
    /**
     * If this business entity is part of an organization, this value is non-null and it is set
     * to the `CompanyId` value of the parent company of this business entity.
     * 
     * If this value is null, this business entity is a standalone.
     */
    public String getparentCompanyId() { return this.parentCompanyId; }
    /**
     * If this business entity is part of an organization, this value is non-null and it is set
     * to the `CompanyId` value of the parent company of this business entity.
     * 
     * If this value is null, this business entity is a standalone.
     */
    public void setparentCompanyId(String value) { this.parentCompanyId = value; }
    /**
     * For convenience, this field indicates the top-level parent company.  This can be used
     * to jump directly to the top parent in complex organizational hierarchies.
     */
    public String getenterpriseId() { return this.enterpriseId; }
    /**
     * For convenience, this field indicates the top-level parent company.  This can be used
     * to jump directly to the top parent in complex organizational hierarchies.
     */
    public void setenterpriseId(String value) { this.enterpriseId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * This flag indicates whether the company is currently active.  An inactive company
     * should be hidden from the user interface but will still be available for querying.
     */
    public boolean getisActive() { return this.isActive; }
    /**
     * This flag indicates whether the company is currently active.  An inactive company
     * should be hidden from the user interface but will still be available for querying.
     */
    public void setisActive(boolean value) { this.isActive = value; }
    /**
     * The default currency code used by this business entity.  This value can be overridden
     * for invoices in a different currency code.
     * 
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies)
     */
    public String getdefaultCurrencyCode() { return this.defaultCurrencyCode; }
    /**
     * The default currency code used by this business entity.  This value can be overridden
     * for invoices in a different currency code.
     * 
     * For a list of defined currency codes, see [Query Currencies](https://developer.lockstep.io/reference/get_api-v1-definitions-currencies)
     */
    public void setdefaultCurrencyCode(String value) { this.defaultCurrencyCode = value; }
    /**
     * The URL of this company's logo, if known.
     */
    public String getcompanyLogoUrl() { return this.companyLogoUrl; }
    /**
     * The URL of this company's logo, if known.
     */
    public void setcompanyLogoUrl(String value) { this.companyLogoUrl = value; }
    /**
     * The Lockstep `ContactId` of the primary contact for this company.
     */
    public String getprimaryContactId() { return this.primaryContactId; }
    /**
     * The Lockstep `ContactId` of the primary contact for this company.
     */
    public void setprimaryContactId(String value) { this.primaryContactId = value; }
    /**
     * Address info
     */
    public String getaddress1() { return this.address1; }
    /**
     * Address info
     */
    public void setaddress1(String value) { this.address1 = value; }
    /**
     * Address info
     */
    public String getaddress2() { return this.address2; }
    /**
     * Address info
     */
    public void setaddress2(String value) { this.address2 = value; }
    /**
     * Address info
     */
    public String getaddress3() { return this.address3; }
    /**
     * Address info
     */
    public void setaddress3(String value) { this.address3 = value; }
    /**
     * Address info
     */
    public String getcity() { return this.city; }
    /**
     * Address info
     */
    public void setcity(String value) { this.city = value; }
    /**
     * Address info
     */
    public String getstateRegion() { return this.stateRegion; }
    /**
     * Address info
     */
    public void setstateRegion(String value) { this.stateRegion = value; }
    /**
     * Address info
     */
    public String getpostalCode() { return this.postalCode; }
    /**
     * Address info
     */
    public void setpostalCode(String value) { this.postalCode = value; }
    /**
     * Address info
     */
    public String getcountry() { return this.country; }
    /**
     * Address info
     */
    public void setcountry(String value) { this.country = value; }
    /**
     * Phone number
     */
    public String getphoneNumber() { return this.phoneNumber; }
    /**
     * Phone number
     */
    public void setphoneNumber(String value) { this.phoneNumber = value; }
    /**
     * Fax number
     */
    public String getfaxNumber() { return this.faxNumber; }
    /**
     * Fax number
     */
    public void setfaxNumber(String value) { this.faxNumber = value; }
    /**
     * The date this company was created
     */
    public String getcreated() { return this.created; }
    /**
     * The date this company was created
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID of the user who created this company
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this company
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date this company was last modified
     */
    public String getmodified() { return this.modified; }
    /**
     * The date this company was last modified
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The ID of the user who last modified this company
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this company
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The name of the user who last modified this company
     */
    public String getmodifiedUserName() { return this.modifiedUserName; }
    /**
     * The name of the user who last modified this company
     */
    public void setmodifiedUserName(String value) { this.modifiedUserName = value; }
    /**
     * Federal Tax ID
     */
    public String gettaxId() { return this.taxId; }
    /**
     * Federal Tax ID
     */
    public void settaxId(String value) { this.taxId = value; }
    /**
     * Dun & Bradstreet Number
     */
    public String getdunsNumber() { return this.dunsNumber; }
    /**
     * Dun & Bradstreet Number
     */
    public void setdunsNumber(String value) { this.dunsNumber = value; }
    /**
     * AP (Accounts Payable) Email Address
     */
    public String getapEmailAddress() { return this.apEmailAddress; }
    /**
     * AP (Accounts Payable) Email Address
     */
    public void setapEmailAddress(String value) { this.apEmailAddress = value; }
    /**
     * AR (Accounts Receivable) Email Address
     */
    public String getarEmailAddress() { return this.arEmailAddress; }
    /**
     * AR (Accounts Receivable) Email Address
     */
    public void setarEmailAddress(String value) { this.arEmailAddress = value; }
    /**
     * For companies that use a custom domain name for their email system, this is
     * the domain name used by this company.  If this value is known, new emails that
     * come in from this domain will be connected to this company.
     */
    public String getdomainName() { return this.domainName; }
    /**
     * For companies that use a custom domain name for their email system, this is
     * the domain name used by this company.  If this value is known, new emails that
     * come in from this domain will be connected to this company.
     */
    public void setdomainName(String value) { this.domainName = value; }
    /**
     * Identifier for classification of this company.
     */
    public String getcompanyClassificationCodeDefId() { return this.companyClassificationCodeDefId; }
    /**
     * Identifier for classification of this company.
     */
    public void setcompanyClassificationCodeDefId(String value) { this.companyClassificationCodeDefId = value; }
    /**
     * Description of the company.
     */
    public String getdescription() { return this.description; }
    /**
     * Description of the company.
     */
    public void setdescription(String value) { this.description = value; }
    /**
     * Website URL for this company.
     */
    public String getwebsite() { return this.website; }
    /**
     * Website URL for this company.
     */
    public void setwebsite(String value) { this.website = value; }
    /**
     * The AppEnrollmentId of the application that imported this company record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application that imported this company record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * All notes attached to this company.
     * 
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this company.
     * 
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this company.
     * 
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this company.
     * 
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All contacts attached to this company.
     * 
     * To retrieve this collection, specify `Contacts` in the "Include" parameter for your query.
     */
    public ContactModel[] getcontacts() { return this.contacts; }
    /**
     * All contacts attached to this company.
     * 
     * To retrieve this collection, specify `Contacts` in the "Include" parameter for your query.
     */
    public void setcontacts(ContactModel[] value) { this.contacts = value; }
    /**
     * All invoices attached to this company.
     * 
     * To retrieve this collection, specify `Invoices` in the "Include" parameter for your query. For more information on Invoices, see [InvoiceModel](https://developer.lockstep.io/reference/get_api-v1-invoices-id).
     */
    public object[] getinvoices() { return this.invoices; }
    /**
     * All invoices attached to this company.
     * 
     * To retrieve this collection, specify `Invoices` in the "Include" parameter for your query. For more information on Invoices, see [InvoiceModel](https://developer.lockstep.io/reference/get_api-v1-invoices-id).
     */
    public void setinvoices(object[] value) { this.invoices = value; }
    /**
     * All definitions attached to this company.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this company.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this company.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this company.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Classification code definition for this company.
     * 
     * To retrieve this collection, specify `Classification` in the "Include" parameter for your query.
     */
    public CodeDefinitionModel getcompanyClassificationCodeDefinition() { return this.companyClassificationCodeDefinition; }
    /**
     * Classification code definition for this company.
     * 
     * To retrieve this collection, specify `Classification` in the "Include" parameter for your query.
     */
    public void setcompanyClassificationCodeDefinition(CodeDefinitionModel value) { this.companyClassificationCodeDefinition = value; }
};
public class ConnectorInfoModel
{
    private String authCode;
    private String realmId;
    private String redirectUri;
    private String email;

    /**
     * The authorization code returned from the first step of the OAuth2 flow
     * https://oauth.net/2/grant-types/authorization-code/
     */
    public String getauthCode() { return this.authCode; }
    /**
     * The authorization code returned from the first step of the OAuth2 flow
     * https://oauth.net/2/grant-types/authorization-code/
     */
    public void setauthCode(String value) { this.authCode = value; }
    /**
     * The realm id of the account being granted permissions to access
     */
    public String getrealmId() { return this.realmId; }
    /**
     * The realm id of the account being granted permissions to access
     */
    public void setrealmId(String value) { this.realmId = value; }
    /**
     * The redirect uri used for step one of the OAuth2.0 flow.
     */
    public String getredirectUri() { return this.redirectUri; }
    /**
     * The redirect uri used for step one of the OAuth2.0 flow.
     */
    public void setredirectUri(String value) { this.redirectUri = value; }
    /**
     * The email an email connection is being created for.
     */
    public String getemail() { return this.email; }
    /**
     * The email an email connection is being created for.
     */
    public void setemail(String value) { this.email = value; }
};
public class ContactModel
{
    private String contactId;
    private String companyId;
    private String groupKey;
    private String erpKey;
    private String contactName;
    private String contactCode;
    private String title;
    private String roleCode;
    private String emailAddress;
    private String phone;
    private String fax;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String stateRegion;
    private String postalCode;
    private String countryCode;
    private boolean isActive;
    private String webpageUrl;
    private String pictureUrl;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getcontactId() { return this.contactId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setcontactId(String value) { this.contactId = value; }
    /**
     * The ID of the company to which this contact belongs.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID of the company to which this contact belongs.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String geterpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void seterpKey(String value) { this.erpKey = value; }
    /**
     * The name of the contact.
     */
    public String getcontactName() { return this.contactName; }
    /**
     * The name of the contact.
     */
    public void setcontactName(String value) { this.contactName = value; }
    /**
     * A friendly human-readable code that describes this Contact.
     */
    public String getcontactCode() { return this.contactCode; }
    /**
     * A friendly human-readable code that describes this Contact.
     */
    public void setcontactCode(String value) { this.contactCode = value; }
    /**
     * The title of the contact.
     */
    public String gettitle() { return this.title; }
    /**
     * The title of the contact.
     */
    public void settitle(String value) { this.title = value; }
    /**
     * The role code for the contact.
     */
    public String getroleCode() { return this.roleCode; }
    /**
     * The role code for the contact.
     */
    public void setroleCode(String value) { this.roleCode = value; }
    /**
     * The email address of the contact.
     */
    public String getemailAddress() { return this.emailAddress; }
    /**
     * The email address of the contact.
     */
    public void setemailAddress(String value) { this.emailAddress = value; }
    /**
     * The phone number of the contact.
     */
    public String getphone() { return this.phone; }
    /**
     * The phone number of the contact.
     */
    public void setphone(String value) { this.phone = value; }
    /**
     * The fax number of the contact.
     */
    public String getfax() { return this.fax; }
    /**
     * The fax number of the contact.
     */
    public void setfax(String value) { this.fax = value; }
    /**
     * The first line of the address.
     */
    public String getaddress1() { return this.address1; }
    /**
     * The first line of the address.
     */
    public void setaddress1(String value) { this.address1 = value; }
    /**
     * The second line of the address.
     */
    public String getaddress2() { return this.address2; }
    /**
     * The second line of the address.
     */
    public void setaddress2(String value) { this.address2 = value; }
    /**
     * The third line of the address.
     */
    public String getaddress3() { return this.address3; }
    /**
     * The third line of the address.
     */
    public void setaddress3(String value) { this.address3 = value; }
    /**
     * The city of the address.
     */
    public String getcity() { return this.city; }
    /**
     * The city of the address.
     */
    public void setcity(String value) { this.city = value; }
    /**
     * The state/region of the address.
     */
    public String getstateRegion() { return this.stateRegion; }
    /**
     * The state/region of the address.
     */
    public void setstateRegion(String value) { this.stateRegion = value; }
    /**
     * The postal/zip code of the address.
     */
    public String getpostalCode() { return this.postalCode; }
    /**
     * The postal/zip code of the address.
     */
    public void setpostalCode(String value) { this.postalCode = value; }
    /**
     * The two character country code of the address. This will be validated by the /api/v1/countries data set
     */
    public String getcountryCode() { return this.countryCode; }
    /**
     * The two character country code of the address. This will be validated by the /api/v1/countries data set
     */
    public void setcountryCode(String value) { this.countryCode = value; }
    /**
     * Flag indicating if the contact is active.
     */
    public boolean getisActive() { return this.isActive; }
    /**
     * Flag indicating if the contact is active.
     */
    public void setisActive(boolean value) { this.isActive = value; }
    /**
     * The webpage url of the contact.
     */
    public String getwebpageUrl() { return this.webpageUrl; }
    /**
     * The webpage url of the contact.
     */
    public void setwebpageUrl(String value) { this.webpageUrl = value; }
    /**
     * The picture/avatar url of the contact.
     */
    public String getpictureUrl() { return this.pictureUrl; }
    /**
     * The picture/avatar url of the contact.
     */
    public void setpictureUrl(String value) { this.pictureUrl = value; }
    /**
     * The date on which this record was created.
     */
    public String getcreated() { return this.created; }
    /**
     * The date on which this record was created.
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID of the user who created this contact.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this contact.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this record was last modified.
     */
    public String getmodified() { return this.modified; }
    /**
     * The date on which this record was last modified.
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The ID of the user who last modified this contact.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this contact.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to this contact.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this contact.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this contact.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this contact.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
public class CountryModel
{
    private String name;
    private String alpha2;
    private String alpha3;
    private Integer countryCode;
    private String region;
    private String subRegion;
    private String intermediateRegion;
    private Integer regionCode;
    private Integer subRegionCode;
    private Integer intermediateRegionCode;
    private String frenchName;
    private String aliases;

    /**
     * Name of the country
     */
    public String getname() { return this.name; }
    /**
     * Name of the country
     */
    public void setname(String value) { this.name = value; }
    /**
     * 2 letter alphabetic code for the given country
     */
    public String getalpha2() { return this.alpha2; }
    /**
     * 2 letter alphabetic code for the given country
     */
    public void setalpha2(String value) { this.alpha2 = value; }
    /**
     * 3 letter alphabetic code for the given country
     */
    public String getalpha3() { return this.alpha3; }
    /**
     * 3 letter alphabetic code for the given country
     */
    public void setalpha3(String value) { this.alpha3 = value; }
    /**
     * Unique 3 digit number for the given country
     */
    public Integer getcountryCode() { return this.countryCode; }
    /**
     * Unique 3 digit number for the given country
     */
    public void setcountryCode(Integer value) { this.countryCode = value; }
    /**
     * Region of the country
     */
    public String getregion() { return this.region; }
    /**
     * Region of the country
     */
    public void setregion(String value) { this.region = value; }
    /**
     * Subregion of the country
     */
    public String getsubRegion() { return this.subRegion; }
    /**
     * Subregion of the country
     */
    public void setsubRegion(String value) { this.subRegion = value; }
    /**
     * Intermediate region of the country
     */
    public String getintermediateRegion() { return this.intermediateRegion; }
    /**
     * Intermediate region of the country
     */
    public void setintermediateRegion(String value) { this.intermediateRegion = value; }
    /**
     * Numeric code for a region
     */
    public Integer getregionCode() { return this.regionCode; }
    /**
     * Numeric code for a region
     */
    public void setregionCode(Integer value) { this.regionCode = value; }
    /**
     * Numeric code for a subregion
     */
    public Integer getsubRegionCode() { return this.subRegionCode; }
    /**
     * Numeric code for a subregion
     */
    public void setsubRegionCode(Integer value) { this.subRegionCode = value; }
    /**
     * Numeric code for an intermediate region
     */
    public Integer getintermediateRegionCode() { return this.intermediateRegionCode; }
    /**
     * Numeric code for an intermediate region
     */
    public void setintermediateRegionCode(Integer value) { this.intermediateRegionCode = value; }
    /**
     * French name of the country
     */
    public String getfrenchName() { return this.frenchName; }
    /**
     * French name of the country
     */
    public void setfrenchName(String value) { this.frenchName = value; }
    /**
     * A different name for a country
     */
    public String getaliases() { return this.aliases; }
    /**
     * A different name for a country
     */
    public void setaliases(String value) { this.aliases = value; }
};
public class CreditMemoAppliedModel
{
    private String creditMemoAppliedId;
    private String groupKey;
    private String invoiceId;
    private String creditMemoInvoiceId;
    private String erpKey;
    private Integer entryNumber;
    private String applyToInvoiceDate;
    private Double creditMemoAppliedAmount;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private AttachmentModel[] attachments;
    private NoteModel[] notes;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getcreditMemoAppliedId() { return this.creditMemoAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setcreditMemoAppliedId(String value) { this.creditMemoAppliedId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The id of the invoice
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The id of the invoice
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The id of the credit memo invoice
     */
    public String getcreditMemoInvoiceId() { return this.creditMemoInvoiceId; }
    /**
     * The id of the credit memo invoice
     */
    public void setcreditMemoInvoiceId(String value) { this.creditMemoInvoiceId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String geterpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void seterpKey(String value) { this.erpKey = value; }
    /**
     * Reference number for the applied credit memo.
     */
    public Integer getentryNumber() { return this.entryNumber; }
    /**
     * Reference number for the applied credit memo.
     */
    public void setentryNumber(Integer value) { this.entryNumber = value; }
    /**
     * Date payment applied to credit memo.
     */
    public String getapplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date payment applied to credit memo.
     */
    public void setapplyToInvoiceDate(String value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to credit memo.
     */
    public Double getcreditMemoAppliedAmount() { return this.creditMemoAppliedAmount; }
    /**
     * Amount applied to credit memo.
     */
    public void setcreditMemoAppliedAmount(Double value) { this.creditMemoAppliedAmount = value; }
    /**
     * Date credit memo applied record was created.
     */
    public String getcreated() { return this.created; }
    /**
     * Date credit memo applied record was created.
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The id of the user who created this applied credit memo.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The id of the user who created this applied credit memo.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Date credit memo applied record was modified.
     */
    public String getmodified() { return this.modified; }
    /**
     * Date credit memo applied record was modified.
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The id of the user who modified this applied credit memo.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The id of the user who modified this applied credit memo.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * All attachments attached to applied Credit Memo.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to applied Credit Memo.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All notes attached to this applied Credit Memo.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this applied Credit Memo.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All definitions attached to this applied Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this applied Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
public class CreditMemoInvoiceModel
{
    private String groupKey;
    private String creditMemoAppliedId;
    private String invoiceId;
    private String creditMemoInvoiceId;
    private Date applyToInvoiceDate;
    private Double creditMemoAppliedAmount;
    private String referenceCode;
    private String companyId;
    private String customerId;
    private String invoiceStatusCode;
    private Double totalAmount;
    private Double outstandingBalanceAmount;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getcreditMemoAppliedId() { return this.creditMemoAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setcreditMemoAppliedId(String value) { this.creditMemoAppliedId = value; }
    /**
     * The id of the invoice
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The id of the invoice
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The id of the credit memo invoice
     */
    public String getcreditMemoInvoiceId() { return this.creditMemoInvoiceId; }
    /**
     * The id of the credit memo invoice
     */
    public void setcreditMemoInvoiceId(String value) { this.creditMemoInvoiceId = value; }
    /**
     * Date invoice applied to credit memo.
     */
    public Date getapplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date invoice applied to credit memo.
     */
    public void setapplyToInvoiceDate(Date value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to credit memo.
     */
    public Double getcreditMemoAppliedAmount() { return this.creditMemoAppliedAmount; }
    /**
     * Amount applied to credit memo.
     */
    public void setcreditMemoAppliedAmount(Double value) { this.creditMemoAppliedAmount = value; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public String getreferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public void setreferenceCode(String value) { this.referenceCode = value; }
    /**
     * The ID number of the company that created this invoice.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID number of the company that created this invoice.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * A code identifying the status of this invoice.
     */
    public String getinvoiceStatusCode() { return this.invoiceStatusCode; }
    /**
     * A code identifying the status of this invoice.
     */
    public void setinvoiceStatusCode(String value) { this.invoiceStatusCode = value; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     */
    public Double gettotalAmount() { return this.totalAmount; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     */
    public void settotalAmount(Double value) { this.totalAmount = value; }
    /**
     * The remaining balance value of this invoice.
     */
    public Double getoutstandingBalanceAmount() { return this.outstandingBalanceAmount; }
    /**
     * The remaining balance value of this invoice.
     */
    public void setoutstandingBalanceAmount(Double value) { this.outstandingBalanceAmount = value; }
};
public class CurrencyModel
{
    private String alphaCode;
    private String numericCode;
    private String currencyName;
    private Integer minorUnit;
    private String symbol;

    /**
     * Alphabetic code for the given currency
     */
    public String getalphaCode() { return this.alphaCode; }
    /**
     * Alphabetic code for the given currency
     */
    public void setalphaCode(String value) { this.alphaCode = value; }
    /**
     * Numeric code for the given currency
     */
    public String getnumericCode() { return this.numericCode; }
    /**
     * Numeric code for the given currency
     */
    public void setnumericCode(String value) { this.numericCode = value; }
    /**
     * Name of currency
     */
    public String getcurrencyName() { return this.currencyName; }
    /**
     * Name of currency
     */
    public void setcurrencyName(String value) { this.currencyName = value; }
    /**
     * Number of places after the decimal for this currency
     */
    public Integer getminorUnit() { return this.minorUnit; }
    /**
     * Number of places after the decimal for this currency
     */
    public void setminorUnit(Integer value) { this.minorUnit = value; }
    /**
     * Symbol for the given currency
     */
    public String getsymbol() { return this.symbol; }
    /**
     * Symbol for the given currency
     */
    public void setsymbol(String value) { this.symbol = value; }
};
public class CurrencyRateModel
{
    private String sourceCurrency;
    private String destinationCurrency;
    private Date date;
    private Double currencyRate;

    /**
     * The source currency
     */
    public String getsourceCurrency() { return this.sourceCurrency; }
    /**
     * The source currency
     */
    public void setsourceCurrency(String value) { this.sourceCurrency = value; }
    /**
     * The destination currency
     */
    public String getdestinationCurrency() { return this.destinationCurrency; }
    /**
     * The destination currency
     */
    public void setdestinationCurrency(String value) { this.destinationCurrency = value; }
    /**
     * The date for the currency rate
     */
    public Date getdate() { return this.date; }
    /**
     * The date for the currency rate
     */
    public void setdate(Date value) { this.date = value; }
    /**
     * The currency rate value
     */
    public Double getcurrencyRate() { return this.currencyRate; }
    /**
     * The currency rate value
     */
    public void setcurrencyRate(Double value) { this.currencyRate = value; }
};
public class CustomerDetailsModel
{
    private String groupKey;
    private String customerId;
    private String name;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String phoneNumber;
    private String faxNumber;
    private String email;
    private String contactId;
    private String contactName;
    private String contactEmail;
    private Integer outstandingInvoices;
    private Double outstandingAmount;
    private Double amountPastDue;
    private CustomerDetailsPaymentModel[] payments;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this customer
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The unique ID of this customer
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID of this customer
     */
    public String getname() { return this.name; }
    /**
     * The unique ID of this customer
     */
    public void setname(String value) { this.name = value; }
    /**
     * Customer address info
     */
    public String getaddress1() { return this.address1; }
    /**
     * Customer address info
     */
    public void setaddress1(String value) { this.address1 = value; }
    /**
     * Customer address info
     */
    public String getaddress2() { return this.address2; }
    /**
     * Customer address info
     */
    public void setaddress2(String value) { this.address2 = value; }
    /**
     * Customer address info
     */
    public String getaddress3() { return this.address3; }
    /**
     * Customer address info
     */
    public void setaddress3(String value) { this.address3 = value; }
    /**
     * Customer address info
     */
    public String getcity() { return this.city; }
    /**
     * Customer address info
     */
    public void setcity(String value) { this.city = value; }
    /**
     * Customer address info
     */
    public String getstate() { return this.state; }
    /**
     * Customer address info
     */
    public void setstate(String value) { this.state = value; }
    /**
     * Customer address info
     */
    public String getpostalCode() { return this.postalCode; }
    /**
     * Customer address info
     */
    public void setpostalCode(String value) { this.postalCode = value; }
    /**
     * Customer address country
     */
    public String getcountry() { return this.country; }
    /**
     * Customer address country
     */
    public void setcountry(String value) { this.country = value; }
    /**
     * Customer phone number
     */
    public String getphoneNumber() { return this.phoneNumber; }
    /**
     * Customer phone number
     */
    public void setphoneNumber(String value) { this.phoneNumber = value; }
    /**
     * Customer fax number
     */
    public String getfaxNumber() { return this.faxNumber; }
    /**
     * Customer fax number
     */
    public void setfaxNumber(String value) { this.faxNumber = value; }
    /**
     * Customer AR email address
     */
    public String getemail() { return this.email; }
    /**
     * Customer AR email address
     */
    public void setemail(String value) { this.email = value; }
    /**
     * Customer primary contact id
     */
    public String getcontactId() { return this.contactId; }
    /**
     * Customer primary contact id
     */
    public void setcontactId(String value) { this.contactId = value; }
    /**
     * Customer primary contact name
     */
    public String getcontactName() { return this.contactName; }
    /**
     * Customer primary contact name
     */
    public void setcontactName(String value) { this.contactName = value; }
    /**
     * Customer primary contact email address
     */
    public String getcontactEmail() { return this.contactEmail; }
    /**
     * Customer primary contact email address
     */
    public void setcontactEmail(String value) { this.contactEmail = value; }
    /**
     * Customer number of outstanding invoices
     */
    public Integer getoutstandingInvoices() { return this.outstandingInvoices; }
    /**
     * Customer number of outstanding invoices
     */
    public void setoutstandingInvoices(Integer value) { this.outstandingInvoices = value; }
    /**
     * Customer total outstanding invoice amount
     */
    public Double getoutstandingAmount() { return this.outstandingAmount; }
    /**
     * Customer total outstanding invoice amount
     */
    public void setoutstandingAmount(Double value) { this.outstandingAmount = value; }
    /**
     * Customer total past due amount
     */
    public Double getamountPastDue() { return this.amountPastDue; }
    /**
     * Customer total past due amount
     */
    public void setamountPastDue(Double value) { this.amountPastDue = value; }
    /**
     * Customer payments collected
     */
    public CustomerDetailsPaymentModel[] getpayments() { return this.payments; }
    /**
     * Customer payments collected
     */
    public void setpayments(CustomerDetailsPaymentModel[] value) { this.payments = value; }
};
public class CustomerDetailsPaymentModel
{
    private String groupKey;
    private String paymentId;
    private String paymentAppliedId;
    private String paymentType;
    private String invoiceId;
    private String invoiceTypeCode;
    private String invoiceReferenceCode;
    private Double invoiceTotalAmount;
    private String paymentDate;
    private Double paymentAmount;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * Unique identifier for payment
     */
    public String getpaymentId() { return this.paymentId; }
    /**
     * Unique identifier for payment
     */
    public void setpaymentId(String value) { this.paymentId = value; }
    /**
     * Unique identifier for payment applied
     */
    public String getpaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * Unique identifier for payment applied
     */
    public void setpaymentAppliedId(String value) { this.paymentAppliedId = value; }
    /**
     * Payment type
     */
    public String getpaymentType() { return this.paymentType; }
    /**
     * Payment type
     */
    public void setpaymentType(String value) { this.paymentType = value; }
    /**
     * Unique identifier for invoice payment is associated with
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * Unique identifier for invoice payment is associated with
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * Invoice type payment is associated with
     */
    public String getinvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * Invoice type payment is associated with
     */
    public void setinvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * Invoice reference code payment is associated with
     */
    public String getinvoiceReferenceCode() { return this.invoiceReferenceCode; }
    /**
     * Invoice reference code payment is associated with
     */
    public void setinvoiceReferenceCode(String value) { this.invoiceReferenceCode = value; }
    /**
     * Invoice total amount payment is associated with
     */
    public Double getinvoiceTotalAmount() { return this.invoiceTotalAmount; }
    /**
     * Invoice total amount payment is associated with
     */
    public void setinvoiceTotalAmount(Double value) { this.invoiceTotalAmount = value; }
    /**
     * Date payment placed
     */
    public String getpaymentDate() { return this.paymentDate; }
    /**
     * Date payment placed
     */
    public void setpaymentDate(String value) { this.paymentDate = value; }
    /**
     * Amount payment was made for
     */
    public Double getpaymentAmount() { return this.paymentAmount; }
    /**
     * Amount payment was made for
     */
    public void setpaymentAmount(Double value) { this.paymentAmount = value; }
};
public class CustomerSummaryModel
{
    private String groupKey;
    private String companyId;
    private String companyName;
    private String primaryContact;
    private Integer outstandingInvoices;
    private Integer totalInvoicesOpen;
    private Integer totalInvoicesPastDue;
    private Integer closedInvoices;
    private Double amountCollected;
    private Double outstandingAmount;
    private Double amountPastDue;
    private Double unappliedPayments;
    private Double percentOfTotalAr;
    private Double dso;
    private Date newestActivity;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this company.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The unique ID of this company.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The name of the company.
     */
    public String getcompanyName() { return this.companyName; }
    /**
     * The name of the company.
     */
    public void setcompanyName(String value) { this.companyName = value; }
    /**
     * The name of the primary contact.
     */
    public String getprimaryContact() { return this.primaryContact; }
    /**
     * The name of the primary contact.
     */
    public void setprimaryContact(String value) { this.primaryContact = value; }
    /**
     * The number of outstanding invoices for this customer.
     */
    public Integer getoutstandingInvoices() { return this.outstandingInvoices; }
    /**
     * The number of outstanding invoices for this customer.
     */
    public void setoutstandingInvoices(Integer value) { this.outstandingInvoices = value; }
    /**
     * The number of open invoices.
     */
    public Integer gettotalInvoicesOpen() { return this.totalInvoicesOpen; }
    /**
     * The number of open invoices.
     */
    public void settotalInvoicesOpen(Integer value) { this.totalInvoicesOpen = value; }
    /**
     * The number of past due invoices.
     */
    public Integer gettotalInvoicesPastDue() { return this.totalInvoicesPastDue; }
    /**
     * The number of past due invoices.
     */
    public void settotalInvoicesPastDue(Integer value) { this.totalInvoicesPastDue = value; }
    /**
     * The number of closed invoices for this customer.
     */
    public Integer getclosedInvoices() { return this.closedInvoices; }
    /**
     * The number of closed invoices for this customer.
     */
    public void setclosedInvoices(Integer value) { this.closedInvoices = value; }
    /**
     * The total from collected payments.
     */
    public Double getamountCollected() { return this.amountCollected; }
    /**
     * The total from collected payments.
     */
    public void setamountCollected(Double value) { this.amountCollected = value; }
    /**
     * The total balance of outstanding invoices.
     */
    public Double getoutstandingAmount() { return this.outstandingAmount; }
    /**
     * The total balance of outstanding invoices.
     */
    public void setoutstandingAmount(Double value) { this.outstandingAmount = value; }
    /**
     * The total amount past due for this customer.
     */
    public Double getamountPastDue() { return this.amountPastDue; }
    /**
     * The total amount past due for this customer.
     */
    public void setamountPastDue(Double value) { this.amountPastDue = value; }
    /**
     * The total value of unapplied Payments for this Customer.
     */
    public Double getunappliedPayments() { return this.unappliedPayments; }
    /**
     * The total value of unapplied Payments for this Customer.
     */
    public void setunappliedPayments(Double value) { this.unappliedPayments = value; }
    /**
     * Portion of Total AR for this Customer that is Past due. (TotalPastDue / Total AR).
     */
    public Double getpercentOfTotalAr() { return this.percentOfTotalAr; }
    /**
     * Portion of Total AR for this Customer that is Past due. (TotalPastDue / Total AR).
     */
    public void setpercentOfTotalAr(Double value) { this.percentOfTotalAr = value; }
    /**
     * Daily sales outstanding value for this Customer.
     */
    public Double getdso() { return this.dso; }
    /**
     * Daily sales outstanding value for this Customer.
     */
    public void setdso(Double value) { this.dso = value; }
    /**
     * The date stamp for the newest Activity on this Customer.
     */
    public Date getnewestActivity() { return this.newestActivity; }
    /**
     * The date stamp for the newest Activity on this Customer.
     */
    public void setnewestActivity(Date value) { this.newestActivity = value; }
};
public class CustomFieldDefinitionModel
{
    private String groupKey;
    private String customFieldDefinitionId;
    private String tableKey;
    private String appId;
    private String customFieldLabel;
    private String dataType;
    private Integer sortOrder;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String appEnrollmentId;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getcustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setcustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * Table to which this definition belongs
     */
    public String gettableKey() { return this.tableKey; }
    /**
     * Table to which this definition belongs
     */
    public void settableKey(String value) { this.tableKey = value; }
    /**
     * Id of app this definition belongs to
     */
    public String getappId() { return this.appId; }
    /**
     * Id of app this definition belongs to
     */
    public void setappId(String value) { this.appId = value; }
    /**
     * Text to display in-application for custom field
     */
    public String getcustomFieldLabel() { return this.customFieldLabel; }
    /**
     * Text to display in-application for custom field
     */
    public void setcustomFieldLabel(String value) { this.customFieldLabel = value; }
    /**
     * Data type of this definition
     */
    public String getdataType() { return this.dataType; }
    /**
     * Data type of this definition
     */
    public void setdataType(String value) { this.dataType = value; }
    /**
     * Used for display logic when multiple custom fields exist
     */
    public Integer getsortOrder() { return this.sortOrder; }
    /**
     * Used for display logic when multiple custom fields exist
     */
    public void setsortOrder(Integer value) { this.sortOrder = value; }
    /**
     * Date created
     */
    public String getcreated() { return this.created; }
    /**
     * Date created
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * Id of user who created this definition
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * Id of user who created this definition
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Date modified
     */
    public String getmodified() { return this.modified; }
    /**
     * Date modified
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * Id of user who modified this definition
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * Id of user who modified this definition
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
};
public class CustomFieldValueModel
{
    private String groupKey;
    private String customFieldDefinitionId;
    private String recordKey;
    private String stringValue;
    private Double numericValue;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private CustomFieldDefinitionModel customFieldDefinition;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getcustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setcustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * Additional key if source table doesn't have a unique id
     */
    public String getrecordKey() { return this.recordKey; }
    /**
     * Additional key if source table doesn't have a unique id
     */
    public void setrecordKey(String value) { this.recordKey = value; }
    /**
     * String of data for field
     */
    public String getstringValue() { return this.stringValue; }
    /**
     * String of data for field
     */
    public void setstringValue(String value) { this.stringValue = value; }
    /**
     * Number data for field
     */
    public Double getnumericValue() { return this.numericValue; }
    /**
     * Number data for field
     */
    public void setnumericValue(Double value) { this.numericValue = value; }
    /**
     * Date created
     */
    public String getcreated() { return this.created; }
    /**
     * Date created
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * Id of user who created this value
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * Id of user who created this value
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Date modified
     */
    public String getmodified() { return this.modified; }
    /**
     * Date modified
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * Id of user who modified this value
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * Id of user who modified this value
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Definition of the value
     */
    public CustomFieldDefinitionModel getcustomFieldDefinition() { return this.customFieldDefinition; }
    /**
     * Definition of the value
     */
    public void setcustomFieldDefinition(CustomFieldDefinitionModel value) { this.customFieldDefinition = value; }
};
public class DailySalesOutstandingReportModel
{
    private String timeframe;
    private Integer invoiceCount;
    private Double dailySalesOutstanding;

    /**
     * Timeframe (month) the daily sales outstanding values are associated with
     */
    public String gettimeframe() { return this.timeframe; }
    /**
     * Timeframe (month) the daily sales outstanding values are associated with
     */
    public void settimeframe(String value) { this.timeframe = value; }
    /**
     * Number of invoices the average daily sales outstanding is calculated on
     */
    public Integer getinvoiceCount() { return this.invoiceCount; }
    /**
     * Number of invoices the average daily sales outstanding is calculated on
     */
    public void setinvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * Time (in days) between an invoice was completed paid off and when the invoice was issued
     */
    public Double getdailySalesOutstanding() { return this.dailySalesOutstanding; }
    /**
     * Time (in days) between an invoice was completed paid off and when the invoice was issued
     */
    public void setdailySalesOutstanding(Double value) { this.dailySalesOutstanding = value; }
};
public class EmailModel
{
    private String emailId;
    private String threadId;
    private String groupKey;
    private String companyId;
    private String emailFrom;
    private String emailTo;
    private String emailCC;
    private String emailSubject;
    private String emailBody;
    private String sentDate;
    private boolean isUnread;
    private boolean isPriority;
    private boolean isSpam;
    private String created;
    private String createdUserId;
    private boolean toBeSent;
    private String customerId;
    private String receivedTimeStamp;
    private String openedTimestamp;
    private Integer viewCount;
    private String appEnrollmentId;
    private String externalEmailId;
    private String externalThreadId;
    private String emailBcc;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getemailId() { return this.emailId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setemailId(String value) { this.emailId = value; }
    /**
     * The unique ID number of this email's conversation thread.
     */
    public String getthreadId() { return this.threadId; }
    /**
     * The unique ID number of this email's conversation thread.
     */
    public void setthreadId(String value) { this.threadId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The ID number of the company that created this email.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID number of the company that created this email.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The email address for the sender of this email.
     */
    public String getemailFrom() { return this.emailFrom; }
    /**
     * The email address for the sender of this email.
     */
    public void setemailFrom(String value) { this.emailFrom = value; }
    /**
     * The email address for the recipient(s) of this email.
     */
    public String getemailTo() { return this.emailTo; }
    /**
     * The email address for the recipient(s) of this email.
     */
    public void setemailTo(String value) { this.emailTo = value; }
    /**
     * The email address for the CC recipient(s) of this email
     */
    public String getemailCC() { return this.emailCC; }
    /**
     * The email address for the CC recipient(s) of this email
     */
    public void setemailCC(String value) { this.emailCC = value; }
    /**
     * The subject line of this email.
     */
    public String getemailSubject() { return this.emailSubject; }
    /**
     * The subject line of this email.
     */
    public void setemailSubject(String value) { this.emailSubject = value; }
    /**
     * The body content of this email.
     */
    public String getemailBody() { return this.emailBody; }
    /**
     * The body content of this email.
     */
    public void setemailBody(String value) { this.emailBody = value; }
    /**
     * The date on which this email was sent.
     */
    public String getsentDate() { return this.sentDate; }
    /**
     * The date on which this email was sent.
     */
    public void setsentDate(String value) { this.sentDate = value; }
    /**
     * A status flag indicating if this email is unread.
     */
    public boolean getisUnread() { return this.isUnread; }
    /**
     * A status flag indicating if this email is unread.
     */
    public void setisUnread(boolean value) { this.isUnread = value; }
    /**
     * A status flag indicating if this email is priority status.
     */
    public boolean getisPriority() { return this.isPriority; }
    /**
     * A status flag indicating if this email is priority status.
     */
    public void setisPriority(boolean value) { this.isPriority = value; }
    /**
     * A status flag indicating if this email is marked as spam.
     */
    public boolean getisSpam() { return this.isSpam; }
    /**
     * A status flag indicating if this email is marked as spam.
     */
    public void setisSpam(boolean value) { this.isSpam = value; }
    /**
     * The date on which this email was created.
     */
    public String getcreated() { return this.created; }
    /**
     * The date on which this email was created.
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID number of the user who created this email.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this email.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * A status flag indicating if this email is to be sent.
     */
    public boolean gettoBeSent() { return this.toBeSent; }
    /**
     * A status flag indicating if this email is to be sent.
     */
    public void settoBeSent(boolean value) { this.toBeSent = value; }
    /**
     * The ID number of the customer that sent this email.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The ID number of the customer that sent this email.
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * The date on which this email was received.
     */
    public String getreceivedTimeStamp() { return this.receivedTimeStamp; }
    /**
     * The date on which this email was received.
     */
    public void setreceivedTimeStamp(String value) { this.receivedTimeStamp = value; }
    /**
     * The date on which this email was opened.
     */
    public String getopenedTimestamp() { return this.openedTimestamp; }
    /**
     * The date on which this email was opened.
     */
    public void setopenedTimestamp(String value) { this.openedTimestamp = value; }
    /**
     * The number of times this email was viewed.
     */
    public Integer getviewCount() { return this.viewCount; }
    /**
     * The number of times this email was viewed.
     */
    public void setviewCount(Integer value) { this.viewCount = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The id of the email in an external system if imported.
     */
    public String getexternalEmailId() { return this.externalEmailId; }
    /**
     * The id of the email in an external system if imported.
     */
    public void setexternalEmailId(String value) { this.externalEmailId = value; }
    /**
     * The id of the email thread in an external system if imported.
     */
    public String getexternalThreadId() { return this.externalThreadId; }
    /**
     * The id of the email thread in an external system if imported.
     */
    public void setexternalThreadId(String value) { this.externalThreadId = value; }
    /**
     * The email address(es) for the BCC recipient(s) of this email
     */
    public String getemailBcc() { return this.emailBcc; }
    /**
     * The email address(es) for the BCC recipient(s) of this email
     */
    public void setemailBcc(String value) { this.emailBcc = value; }
    /**
     * All notes attached to this email.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this email.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this email.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this email.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to this email.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this email.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this email.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this email.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
public class ErpInfoDataModel
{
    private String authCode;
    private String realmId;
    private String redirectUri;

    /**
     * The authorization code returned from the first step of the OAuth2 flow
     * https://oauth.net/2/grant-types/authorization-code/
     */
    public String getauthCode() { return this.authCode; }
    /**
     * The authorization code returned from the first step of the OAuth2 flow
     * https://oauth.net/2/grant-types/authorization-code/
     */
    public void setauthCode(String value) { this.authCode = value; }
    /**
     * The realm id of the account being granted permissions to access
     */
    public String getrealmId() { return this.realmId; }
    /**
     * The realm id of the account being granted permissions to access
     */
    public void setrealmId(String value) { this.realmId = value; }
    /**
     * The redirect uri used for step one of the OAuth2.0 flow.
     */
    public String getredirectUri() { return this.redirectUri; }
    /**
     * The redirect uri used for step one of the OAuth2.0 flow.
     */
    public void setredirectUri(String value) { this.redirectUri = value; }
};
public class ErpInfoModel
{
    private String appId;
    private ConnectorInfoModel data;

    /**
     * The id of the ERP's App
     */
    public String getappId() { return this.appId; }
    /**
     * The id of the ERP's App
     */
    public void setappId(String value) { this.appId = value; }
    /**
     * The data required to store for connector access
     */
    public ConnectorInfoModel getdata() { return this.data; }
    /**
     * The data required to store for connector access
     */
    public void setdata(ConnectorInfoModel value) { this.data = value; }
};
public class ErpModel
{
    private String erpSystemId;
    private String name;
    private boolean isSupported;

    /**
     * Unique ID for this ERP
     */
    public String geterpSystemId() { return this.erpSystemId; }
    /**
     * Unique ID for this ERP
     */
    public void seterpSystemId(String value) { this.erpSystemId = value; }
    /**
     * Name of ERP
     */
    public String getname() { return this.name; }
    /**
     * Name of ERP
     */
    public void setname(String value) { this.name = value; }
    /**
     * Flag to indicate if ERP is supported
     */
    public boolean getisSupported() { return this.isSupported; }
    /**
     * Flag to indicate if ERP is supported
     */
    public void setisSupported(boolean value) { this.isSupported = value; }
};
public class InviteDataModel
{
    private String email;
    private String userStatus;

    /**
     * The email address of the invited user.
     */
    public String getemail() { return this.email; }
    /**
     * The email address of the invited user.
     */
    public void setemail(String value) { this.email = value; }
    /**
     * The status of the user.
     */
    public String getuserStatus() { return this.userStatus; }
    /**
     * The status of the user.
     */
    public void setuserStatus(String value) { this.userStatus = value; }
};
public class InviteModel
{
    private String email;
    private boolean success;
    private UserAccountModel invitedUser;
    private String errorMessage;

    /**
     * The invited email address
     */
    public String getemail() { return this.email; }
    /**
     * The invited email address
     */
    public void setemail(String value) { this.email = value; }
    /**
     * True if the invite was sent successfully
     */
    public boolean getsuccess() { return this.success; }
    /**
     * True if the invite was sent successfully
     */
    public void setsuccess(boolean value) { this.success = value; }
    /**
     * The invited user, may be null if the user could not be invited
     */
    public UserAccountModel getinvitedUser() { return this.invitedUser; }
    /**
     * The invited user, may be null if the user could not be invited
     */
    public void setinvitedUser(UserAccountModel value) { this.invitedUser = value; }
    /**
     * The error message if the invite was not successful
     */
    public String geterrorMessage() { return this.errorMessage; }
    /**
     * The error message if the invite was not successful
     */
    public void seterrorMessage(String value) { this.errorMessage = value; }
};
public class InviteSubmitModel
{
    private String email;

    /**
     * The email address of the user to invite
     */
    public String getemail() { return this.email; }
    /**
     * The email address of the user to invite
     */
    public void setemail(String value) { this.email = value; }
};
public class InvoiceAddressModel
{
    private String invoiceAddressId;
    private String groupKey;
    private String invoiceId;
    private String line1;
    private String line2;
    private String line3;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private Float latitude;
    private Float longitude;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getinvoiceAddressId() { return this.invoiceAddressId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setinvoiceAddressId(String value) { this.invoiceAddressId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The ID number of the invoice this address belongs to
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The ID number of the invoice this address belongs to
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The first line of the address.
     */
    public String getline1() { return this.line1; }
    /**
     * The first line of the address.
     */
    public void setline1(String value) { this.line1 = value; }
    /**
     * The second line of the address.
     */
    public String getline2() { return this.line2; }
    /**
     * The second line of the address.
     */
    public void setline2(String value) { this.line2 = value; }
    /**
     * The third line of the address.
     */
    public String getline3() { return this.line3; }
    /**
     * The third line of the address.
     */
    public void setline3(String value) { this.line3 = value; }
    /**
     * The name of the city for this address.
     */
    public String getcity() { return this.city; }
    /**
     * The name of the city for this address.
     */
    public void setcity(String value) { this.city = value; }
    /**
     * The state or region part of this address.
     */
    public String getregion() { return this.region; }
    /**
     * The state or region part of this address.
     */
    public void setregion(String value) { this.region = value; }
    /**
     * The postal code for this address.
     */
    public String getpostalCode() { return this.postalCode; }
    /**
     * The postal code for this address.
     */
    public void setpostalCode(String value) { this.postalCode = value; }
    /**
     * The country for this address.
     */
    public String getcountry() { return this.country; }
    /**
     * The country for this address.
     */
    public void setcountry(String value) { this.country = value; }
    /**
     * The latitude of this address, if available.
     */
    public Float getlatitude() { return this.latitude; }
    /**
     * The latitude of this address, if available.
     */
    public void setlatitude(Float value) { this.latitude = value; }
    /**
     * The longitude of this address, if available.
     */
    public Float getlongitude() { return this.longitude; }
    /**
     * The longitude of this address, if available.
     */
    public void setlongitude(Float value) { this.longitude = value; }
    /**
     * The date on which this address record was created.
     */
    public String getcreated() { return this.created; }
    /**
     * The date on which this address record was created.
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID number of the user who created this address.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this address.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this address record was last modified.
     */
    public String getmodified() { return this.modified; }
    /**
     * The date on which this address record was last modified.
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this address.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this address.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
};
public class InvoiceHistoryModel
{
    private String groupKey;
    private String invoiceHistoryId;
    private String invoiceId;
    private String companyId;
    private String customerId;
    private String erpKey;
    private String purchaseOrderCode;
    private String referenceCode;
    private String salespersonCode;
    private String salespersonName;
    private String invoiceTypeCode;
    private String invoiceStatusCode;
    private String termsCode;
    private String specialTerms;
    private String currencyCode;
    private Double totalAmount;
    private Double salesTaxAmount;
    private Double discountAmount;
    private Double outstandingBalanceAmount;
    private Date invoiceDate;
    private Date discountDate;
    private Date postedDate;
    private Date invoiceClosedDate;
    private Date paymentDueDate;
    private String importedDate;
    private String primaryOriginAddressId;
    private String primaryBillToAddressId;
    private String primaryShipToAddressId;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID number of this invoice history entry.
     */
    public String getinvoiceHistoryId() { return this.invoiceHistoryId; }
    /**
     * The unique ID number of this invoice history entry.
     */
    public void setinvoiceHistoryId(String value) { this.invoiceHistoryId = value; }
    /**
     * The unique ID of the Invoice represented by this history entry.  This ID was automatically assigned
     * by Lockstep to the Invoice record when it was added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The unique ID of the Invoice represented by this history entry.  This ID was automatically assigned
     * by Lockstep to the Invoice record when it was added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The ID number of the company that created this invoice.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID number of the company that created this invoice.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String geterpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void seterpKey(String value) { this.erpKey = value; }
    /**
     * The purchase order code as it exists in the user's ERP or accounting system.
     */
    public String getpurchaseOrderCode() { return this.purchaseOrderCode; }
    /**
     * The purchase order code as it exists in the user's ERP or accounting system.
     */
    public void setpurchaseOrderCode(String value) { this.purchaseOrderCode = value; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public String getreferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public void setreferenceCode(String value) { this.referenceCode = value; }
    /**
     * A code identifying the salesperson responsible for writing this invoice.
     */
    public String getsalespersonCode() { return this.salespersonCode; }
    /**
     * A code identifying the salesperson responsible for writing this invoice.
     */
    public void setsalespersonCode(String value) { this.salespersonCode = value; }
    /**
     * A string identifying the salesperson responsible for writing this invoice.
     */
    public String getsalespersonName() { return this.salespersonName; }
    /**
     * A string identifying the salesperson responsible for writing this invoice.
     */
    public void setsalespersonName(String value) { this.salespersonName = value; }
    /**
     * A code identifying the type of this invoice.
     */
    public String getinvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this invoice.
     */
    public void setinvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * A code identifying the status of this invoice.
     */
    public String getinvoiceStatusCode() { return this.invoiceStatusCode; }
    /**
     * A code identifying the status of this invoice.
     */
    public void setinvoiceStatusCode(String value) { this.invoiceStatusCode = value; }
    /**
     * A code identifying the terms given to the purchaser.
     */
    public String gettermsCode() { return this.termsCode; }
    /**
     * A code identifying the terms given to the purchaser.
     */
    public void settermsCode(String value) { this.termsCode = value; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     */
    public String getspecialTerms() { return this.specialTerms; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     */
    public void setspecialTerms(String value) { this.specialTerms = value; }
    /**
     * The three-character ISO 4217 currency code used for this invoice. This will be validated by the /api/v1/currencies data set
     */
    public String getcurrencyCode() { return this.currencyCode; }
    /**
     * The three-character ISO 4217 currency code used for this invoice. This will be validated by the /api/v1/currencies data set
     */
    public void setcurrencyCode(String value) { this.currencyCode = value; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     */
    public Double gettotalAmount() { return this.totalAmount; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     */
    public void settotalAmount(Double value) { this.totalAmount = value; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     */
    public Double getsalesTaxAmount() { return this.salesTaxAmount; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     */
    public void setsalesTaxAmount(Double value) { this.salesTaxAmount = value; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     */
    public Double getdiscountAmount() { return this.discountAmount; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     */
    public void setdiscountAmount(Double value) { this.discountAmount = value; }
    /**
     * The remaining balance value of this invoice.
     */
    public Double getoutstandingBalanceAmount() { return this.outstandingBalanceAmount; }
    /**
     * The remaining balance value of this invoice.
     */
    public void setoutstandingBalanceAmount(Double value) { this.outstandingBalanceAmount = value; }
    /**
     * The reporting date for this invoice.
     */
    public Date getinvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     */
    public void setinvoiceDate(Date value) { this.invoiceDate = value; }
    /**
     * The date when discounts were adjusted for this invoice.
     */
    public Date getdiscountDate() { return this.discountDate; }
    /**
     * The date when discounts were adjusted for this invoice.
     */
    public void setdiscountDate(Date value) { this.discountDate = value; }
    /**
     * The date when this invoice posted to the company's general ledger.
     */
    public Date getpostedDate() { return this.postedDate; }
    /**
     * The date when this invoice posted to the company's general ledger.
     */
    public void setpostedDate(Date value) { this.postedDate = value; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     */
    public Date getinvoiceClosedDate() { return this.invoiceClosedDate; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     */
    public void setinvoiceClosedDate(Date value) { this.invoiceClosedDate = value; }
    /**
     * The date when the remaining outstanding balance is due.
     */
    public Date getpaymentDueDate() { return this.paymentDueDate; }
    /**
     * The date when the remaining outstanding balance is due.
     */
    public void setpaymentDueDate(Date value) { this.paymentDueDate = value; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     */
    public String getimportedDate() { return this.importedDate; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     */
    public void setimportedDate(String value) { this.importedDate = value; }
    /**
     * The ID number of the invoice's origination address
     */
    public String getprimaryOriginAddressId() { return this.primaryOriginAddressId; }
    /**
     * The ID number of the invoice's origination address
     */
    public void setprimaryOriginAddressId(String value) { this.primaryOriginAddressId = value; }
    /**
     * The ID number of the invoice's bill-to address
     */
    public String getprimaryBillToAddressId() { return this.primaryBillToAddressId; }
    /**
     * The ID number of the invoice's bill-to address
     */
    public void setprimaryBillToAddressId(String value) { this.primaryBillToAddressId = value; }
    /**
     * The ID number of the invoice's ship-to address
     */
    public String getprimaryShipToAddressId() { return this.primaryShipToAddressId; }
    /**
     * The ID number of the invoice's ship-to address
     */
    public void setprimaryShipToAddressId(String value) { this.primaryShipToAddressId = value; }
    /**
     * The date on which this invoice record was created.
     */
    public String getcreated() { return this.created; }
    /**
     * The date on which this invoice record was created.
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID number of the user who created this invoice.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this invoice.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this invoice record was last modified.
     */
    public String getmodified() { return this.modified; }
    /**
     * The date on which this invoice record was last modified.
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this invoice.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this invoice.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
};
public class InvoiceLineModel
{
    private String invoiceLineId;
    private String groupKey;
    private String invoiceId;
    private String erpKey;
    private String lineNumber;
    private String productCode;
    private String description;
    private String unitMeasureCode;
    private Double unitPrice;
    private Double quantity;
    private Double quantityShipped;
    private Double quantityReceived;
    private Double totalAmount;
    private String exemptionCode;
    private Date reportingDate;
    private String overrideOriginAddressId;
    private String overrideBillToAddressId;
    private String overrideShipToAddressId;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getinvoiceLineId() { return this.invoiceLineId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setinvoiceLineId(String value) { this.invoiceLineId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The ID number of the invoice this line belongs to.
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The ID number of the invoice this line belongs to.
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system, if it was
     * different from the original `LineNumber`.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String geterpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system, if it was
     * different from the original `LineNumber`.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void seterpKey(String value) { this.erpKey = value; }
    /**
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     */
    public String getlineNumber() { return this.lineNumber; }
    /**
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     */
    public void setlineNumber(String value) { this.lineNumber = value; }
    /**
     * A code number identifying the product or service that is specified on this line.
     */
    public String getproductCode() { return this.productCode; }
    /**
     * A code number identifying the product or service that is specified on this line.
     */
    public void setproductCode(String value) { this.productCode = value; }
    /**
     * Description of this invoice line.
     */
    public String getdescription() { return this.description; }
    /**
     * Description of this invoice line.
     */
    public void setdescription(String value) { this.description = value; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     */
    public String getunitMeasureCode() { return this.unitMeasureCode; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     */
    public void setunitMeasureCode(String value) { this.unitMeasureCode = value; }
    /**
     * The price of a single unit for this line.
     */
    public Double getunitPrice() { return this.unitPrice; }
    /**
     * The price of a single unit for this line.
     */
    public void setunitPrice(Double value) { this.unitPrice = value; }
    /**
     * The quantity of items for ths line.
     */
    public Double getquantity() { return this.quantity; }
    /**
     * The quantity of items for ths line.
     */
    public void setquantity(Double value) { this.quantity = value; }
    /**
     * The number of items that have been shipped.
     */
    public Double getquantityShipped() { return this.quantityShipped; }
    /**
     * The number of items that have been shipped.
     */
    public void setquantityShipped(Double value) { this.quantityShipped = value; }
    /**
     * The number of items that has been received.
     */
    public Double getquantityReceived() { return this.quantityReceived; }
    /**
     * The number of items that has been received.
     */
    public void setquantityReceived(Double value) { this.quantityReceived = value; }
    /**
     * The total amount for this line.
     */
    public Double gettotalAmount() { return this.totalAmount; }
    /**
     * The total amount for this line.
     */
    public void settotalAmount(Double value) { this.totalAmount = value; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     */
    public String getexemptionCode() { return this.exemptionCode; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     */
    public void setexemptionCode(String value) { this.exemptionCode = value; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     */
    public Date getreportingDate() { return this.reportingDate; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     */
    public void setreportingDate(Date value) { this.reportingDate = value; }
    /**
     * An optional ID number for the line's origin address.
     */
    public String getoverrideOriginAddressId() { return this.overrideOriginAddressId; }
    /**
     * An optional ID number for the line's origin address.
     */
    public void setoverrideOriginAddressId(String value) { this.overrideOriginAddressId = value; }
    /**
     * An optional ID number for the line's bill to address.
     */
    public String getoverrideBillToAddressId() { return this.overrideBillToAddressId; }
    /**
     * An optional ID number for the line's bill to address.
     */
    public void setoverrideBillToAddressId(String value) { this.overrideBillToAddressId = value; }
    /**
     * An optional ID number for the line's ship to address.
     */
    public String getoverrideShipToAddressId() { return this.overrideShipToAddressId; }
    /**
     * An optional ID number for the line's ship to address.
     */
    public void setoverrideShipToAddressId(String value) { this.overrideShipToAddressId = value; }
    /**
     * The date on which this line was created.
     */
    public String getcreated() { return this.created; }
    /**
     * The date on which this line was created.
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID number of the user who created this line.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this line.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this line was last modified.
     */
    public String getmodified() { return this.modified; }
    /**
     * The date on which this line was last modified.
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this line.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this line.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
};
public class InvoiceModel
{
    private String groupKey;
    private String invoiceId;
    private String companyId;
    private String customerId;
    private String erpKey;
    private String purchaseOrderCode;
    private String referenceCode;
    private String salespersonCode;
    private String salespersonName;
    private String invoiceTypeCode;
    private String invoiceStatusCode;
    private String termsCode;
    private String specialTerms;
    private String currencyCode;
    private Double totalAmount;
    private Double salesTaxAmount;
    private Double discountAmount;
    private Double outstandingBalanceAmount;
    private Date invoiceDate;
    private Date discountDate;
    private Date postedDate;
    private Date invoiceClosedDate;
    private Date paymentDueDate;
    private String importedDate;
    private String primaryOriginAddressId;
    private String primaryBillToAddressId;
    private String primaryShipToAddressId;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private boolean isVoided;
    private boolean inDispute;
    private boolean excludeFromAging;
    private InvoiceAddressModel[] addresses;
    private InvoiceLineModel[] lines;
    private InvoicePaymentDetailModel[] payments;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CompanyModel company;
    private CompanyModel customer;
    private ContactModel customerPrimaryContact;
    private CreditMemoInvoiceModel[] creditMemos;
    private CustomFieldValueModel[] customFieldValues;
    private CustomFieldDefinitionModel[] customFieldDefinitions;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The ID number of the company that created this invoice.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID number of the company that created this invoice.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String geterpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void seterpKey(String value) { this.erpKey = value; }
    /**
     * The purchase order code as it exists in the user's ERP or accounting system.
     */
    public String getpurchaseOrderCode() { return this.purchaseOrderCode; }
    /**
     * The purchase order code as it exists in the user's ERP or accounting system.
     */
    public void setpurchaseOrderCode(String value) { this.purchaseOrderCode = value; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public String getreferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public void setreferenceCode(String value) { this.referenceCode = value; }
    /**
     * A code identifying the salesperson responsible for writing this quote, invoice, or order.
     */
    public String getsalespersonCode() { return this.salespersonCode; }
    /**
     * A code identifying the salesperson responsible for writing this quote, invoice, or order.
     */
    public void setsalespersonCode(String value) { this.salespersonCode = value; }
    /**
     * A string identifying the salesperson responsible for writing this quote, invoice, or order.
     */
    public String getsalespersonName() { return this.salespersonName; }
    /**
     * A string identifying the salesperson responsible for writing this quote, invoice, or order.
     */
    public void setsalespersonName(String value) { this.salespersonName = value; }
    /**
     * A code identifying the type of this invoice.
     */
    public String getinvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this invoice.
     */
    public void setinvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * A code identifying the status of this invoice.
     */
    public String getinvoiceStatusCode() { return this.invoiceStatusCode; }
    /**
     * A code identifying the status of this invoice.
     */
    public void setinvoiceStatusCode(String value) { this.invoiceStatusCode = value; }
    /**
     * A code identifying the terms given to the purchaser.
     */
    public String gettermsCode() { return this.termsCode; }
    /**
     * A code identifying the terms given to the purchaser.
     */
    public void settermsCode(String value) { this.termsCode = value; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     */
    public String getspecialTerms() { return this.specialTerms; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     */
    public void setspecialTerms(String value) { this.specialTerms = value; }
    /**
     * The three-character ISO 4217 currency code used for this invoice.
     */
    public String getcurrencyCode() { return this.currencyCode; }
    /**
     * The three-character ISO 4217 currency code used for this invoice.
     */
    public void setcurrencyCode(String value) { this.currencyCode = value; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     */
    public Double gettotalAmount() { return this.totalAmount; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     */
    public void settotalAmount(Double value) { this.totalAmount = value; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     */
    public Double getsalesTaxAmount() { return this.salesTaxAmount; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     */
    public void setsalesTaxAmount(Double value) { this.salesTaxAmount = value; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     */
    public Double getdiscountAmount() { return this.discountAmount; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     */
    public void setdiscountAmount(Double value) { this.discountAmount = value; }
    /**
     * The remaining balance value of this invoice.
     */
    public Double getoutstandingBalanceAmount() { return this.outstandingBalanceAmount; }
    /**
     * The remaining balance value of this invoice.
     */
    public void setoutstandingBalanceAmount(Double value) { this.outstandingBalanceAmount = value; }
    /**
     * The reporting date for this invoice.
     */
    public Date getinvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     */
    public void setinvoiceDate(Date value) { this.invoiceDate = value; }
    /**
     * The date when discounts were adjusted for this invoice.
     */
    public Date getdiscountDate() { return this.discountDate; }
    /**
     * The date when discounts were adjusted for this invoice.
     */
    public void setdiscountDate(Date value) { this.discountDate = value; }
    /**
     * The date when this invoice posted to the company's general ledger.
     */
    public Date getpostedDate() { return this.postedDate; }
    /**
     * The date when this invoice posted to the company's general ledger.
     */
    public void setpostedDate(Date value) { this.postedDate = value; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     */
    public Date getinvoiceClosedDate() { return this.invoiceClosedDate; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     */
    public void setinvoiceClosedDate(Date value) { this.invoiceClosedDate = value; }
    /**
     * The date when the remaining outstanding balance is due.
     */
    public Date getpaymentDueDate() { return this.paymentDueDate; }
    /**
     * The date when the remaining outstanding balance is due.
     */
    public void setpaymentDueDate(Date value) { this.paymentDueDate = value; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     */
    public String getimportedDate() { return this.importedDate; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     */
    public void setimportedDate(String value) { this.importedDate = value; }
    /**
     * The ID number of the invoice's origination address
     */
    public String getprimaryOriginAddressId() { return this.primaryOriginAddressId; }
    /**
     * The ID number of the invoice's origination address
     */
    public void setprimaryOriginAddressId(String value) { this.primaryOriginAddressId = value; }
    /**
     * The ID number of the invoice's bill-to address
     */
    public String getprimaryBillToAddressId() { return this.primaryBillToAddressId; }
    /**
     * The ID number of the invoice's bill-to address
     */
    public void setprimaryBillToAddressId(String value) { this.primaryBillToAddressId = value; }
    /**
     * The ID number of the invoice's ship-to address
     */
    public String getprimaryShipToAddressId() { return this.primaryShipToAddressId; }
    /**
     * The ID number of the invoice's ship-to address
     */
    public void setprimaryShipToAddressId(String value) { this.primaryShipToAddressId = value; }
    /**
     * The date on which this address record was created.
     */
    public String getcreated() { return this.created; }
    /**
     * The date on which this address record was created.
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID number of the user who created this address.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this address.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this address record was last modified.
     */
    public String getmodified() { return this.modified; }
    /**
     * The date on which this address record was last modified.
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this address.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this address.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Is the invoice voided?
     */
    public boolean getisVoided() { return this.isVoided; }
    /**
     * Is the invoice voided?
     */
    public void setisVoided(boolean value) { this.isVoided = value; }
    /**
     * Is the invoice in dispute?
     */
    public boolean getinDispute() { return this.inDispute; }
    /**
     * Is the invoice in dispute?
     */
    public void setinDispute(boolean value) { this.inDispute = value; }
    /**
     * Should the invoice be excluded from aging calculations?
     */
    public boolean getexcludeFromAging() { return this.excludeFromAging; }
    /**
     * Should the invoice be excluded from aging calculations?
     */
    public void setexcludeFromAging(boolean value) { this.excludeFromAging = value; }
    /**
     * All addresses connected to this invoice.
     * To retrieve this collection, specify `Addresses` in the "Include" parameter for your query.
     */
    public InvoiceAddressModel[] getaddresses() { return this.addresses; }
    /**
     * All addresses connected to this invoice.
     * To retrieve this collection, specify `Addresses` in the "Include" parameter for your query.
     */
    public void setaddresses(InvoiceAddressModel[] value) { this.addresses = value; }
    /**
     * All lines attached to this invoice.
     * To retrieve this collection, specify `Lines` in the "Include" parameter for your query.
     */
    public InvoiceLineModel[] getlines() { return this.lines; }
    /**
     * All lines attached to this invoice.
     * To retrieve this collection, specify `Lines` in the "Include" parameter for your query.
     */
    public void setlines(InvoiceLineModel[] value) { this.lines = value; }
    /**
     * All payments attached to this invoice, the amount of the payment applied to this Invoice, and the date the Payment was applied.
     * To retrieve this collection, specify `Payments` in the "Include" parameter for your query.
     */
    public InvoicePaymentDetailModel[] getpayments() { return this.payments; }
    /**
     * All payments attached to this invoice, the amount of the payment applied to this Invoice, and the date the Payment was applied.
     * To retrieve this collection, specify `Payments` in the "Include" parameter for your query.
     */
    public void setpayments(InvoicePaymentDetailModel[] value) { this.payments = value; }
    /**
     * All notes attached to this invoice.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this invoice.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this invoice.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this invoice.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * The Company associated to this invoice.
     * To retrieve this item, specify `Company` in the "Include" parameter for your query.
     */
    public CompanyModel getcompany() { return this.company; }
    /**
     * The Company associated to this invoice.
     * To retrieve this item, specify `Company` in the "Include" parameter for your query.
     */
    public void setcompany(CompanyModel value) { this.company = value; }
    /**
     * The Customer associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     */
    public CompanyModel getcustomer() { return this.customer; }
    /**
     * The Customer associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     */
    public void setcustomer(CompanyModel value) { this.customer = value; }
    /**
     * The Contact associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     */
    public ContactModel getcustomerPrimaryContact() { return this.customerPrimaryContact; }
    /**
     * The Contact associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     */
    public void setcustomerPrimaryContact(ContactModel value) { this.customerPrimaryContact = value; }
    /**
     * The credit memos associated to this invoice.
     * To retrieve this item, specify `CreditMemos` in the "Include" parameter for your query.
     */
    public CreditMemoInvoiceModel[] getcreditMemos() { return this.creditMemos; }
    /**
     * The credit memos associated to this invoice.
     * To retrieve this item, specify `CreditMemos` in the "Include" parameter for your query.
     */
    public void setcreditMemos(CreditMemoInvoiceModel[] value) { this.creditMemos = value; }
    /**
     * All custom field values associated with this invoice
     * To retrieve this item, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All custom field values associated with this invoice
     * To retrieve this item, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * All custom field definitions
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All custom field definitions
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
};
public class InvoicePaymentDetailModel
{
    private String groupKey;
    private String paymentAppliedId;
    private String invoiceId;
    private String paymentId;
    private Date applyToInvoiceDate;
    private Double paymentAppliedAmount;
    private String referenceCode;
    private String companyId;
    private Double paymentAmount;
    private Double unappliedAmount;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique identifier of this PaymentApplied record.
     */
    public String getpaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * The unique identifier of this PaymentApplied record.
     */
    public void setpaymentAppliedId(String value) { this.paymentAppliedId = value; }
    /**
     * The database id of the invoice
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The database id of the invoice
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The database id of the Payment.
     */
    public String getpaymentId() { return this.paymentId; }
    /**
     * The database id of the Payment.
     */
    public void setpaymentId(String value) { this.paymentId = value; }
    /**
     * Date Payment applied to Invoice.
     */
    public Date getapplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date Payment applied to Invoice.
     */
    public void setapplyToInvoiceDate(Date value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to Invoice.
     */
    public Double getpaymentAppliedAmount() { return this.paymentAppliedAmount; }
    /**
     * Amount applied to Invoice.
     */
    public void setpaymentAppliedAmount(Double value) { this.paymentAppliedAmount = value; }
    /**
     * An additional reference code that is sometimes used to identify this Payment.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public String getreferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this Payment.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public void setreferenceCode(String value) { this.referenceCode = value; }
    /**
     * The ID number of the Company (CompanyType = "Customer") that created this Payment.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID number of the Company (CompanyType = "Customer") that created this Payment.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The total value of this Payment.
     */
    public Double getpaymentAmount() { return this.paymentAmount; }
    /**
     * The total value of this Payment.
     */
    public void setpaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * The remaining balance value of this Payment.
     */
    public Double getunappliedAmount() { return this.unappliedAmount; }
    /**
     * The remaining balance value of this Payment.
     */
    public void setunappliedAmount(Double value) { this.unappliedAmount = value; }
};
public class InvoiceSummaryModel
{
    private String groupKey;
    private String customerId;
    private String invoiceId;
    private String invoiceNumber;
    private Date invoiceDate;
    private String customerName;
    private String status;
    private Date paymentDueDate;
    private Double invoiceAmount;
    private Double outstandingBalance;
    private String invoiceTypeCode;
    private Date newestActivity;
    private Integer daysPastDue;
    private String[] paymentNumbers;
    private String[] paymentIds;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID number of this invoice.
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The unique ID number of this invoice.
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * A reference code that is used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public String getinvoiceNumber() { return this.invoiceNumber; }
    /**
     * A reference code that is used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public void setinvoiceNumber(String value) { this.invoiceNumber = value; }
    /**
     * The reporting date for this invoice.
     */
    public Date getinvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     */
    public void setinvoiceDate(Date value) { this.invoiceDate = value; }
    /**
     * The name of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getcustomerName() { return this.customerName; }
    /**
     * The name of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setcustomerName(String value) { this.customerName = value; }
    /**
     * The status of the invoice.
     */
    public String getstatus() { return this.status; }
    /**
     * The status of the invoice.
     */
    public void setstatus(String value) { this.status = value; }
    /**
     * The due date of the invoice.
     */
    public Date getpaymentDueDate() { return this.paymentDueDate; }
    /**
     * The due date of the invoice.
     */
    public void setpaymentDueDate(Date value) { this.paymentDueDate = value; }
    /**
     * The total amount of the Invoice.
     */
    public Double getinvoiceAmount() { return this.invoiceAmount; }
    /**
     * The total amount of the Invoice.
     */
    public void setinvoiceAmount(Double value) { this.invoiceAmount = value; }
    /**
     * The remaining balance value of this invoice.
     */
    public Double getoutstandingBalance() { return this.outstandingBalance; }
    /**
     * The remaining balance value of this invoice.
     */
    public void setoutstandingBalance(Double value) { this.outstandingBalance = value; }
    /**
     * A code identifying the type of this Invoice.
     */
    public String getinvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this Invoice.
     */
    public void setinvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * The date stamp for the newest Activity on this Invoice.
     */
    public Date getnewestActivity() { return this.newestActivity; }
    /**
     * The date stamp for the newest Activity on this Invoice.
     */
    public void setnewestActivity(Date value) { this.newestActivity = value; }
    /**
     * The number of days this Invoice is past due.
     */
    public Integer getdaysPastDue() { return this.daysPastDue; }
    /**
     * The number of days this Invoice is past due.
     */
    public void setdaysPastDue(Integer value) { this.daysPastDue = value; }
    /**
     * The memo text of the payments associated to this invoice.
     */
    public String[] getpaymentNumbers() { return this.paymentNumbers; }
    /**
     * The memo text of the payments associated to this invoice.
     */
    public void setpaymentNumbers(String[] value) { this.paymentNumbers = value; }
    /**
     * The ids of the payments associated to this invoice.
     */
    public String[] getpaymentIds() { return this.paymentIds; }
    /**
     * The ids of the payments associated to this invoice.
     */
    public void setpaymentIds(String[] value) { this.paymentIds = value; }
};
public class LeadModel
{
    private String leadId;
    private String name;
    private String company;
    private String email;
    private String erpSystem;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getleadId() { return this.leadId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setleadId(String value) { this.leadId = value; }
    /**
     * Name of lead
     */
    public String getname() { return this.name; }
    /**
     * Name of lead
     */
    public void setname(String value) { this.name = value; }
    /**
     * Name of company of lead
     */
    public String getcompany() { return this.company; }
    /**
     * Name of company of lead
     */
    public void setcompany(String value) { this.company = value; }
    /**
     * Email of lead
     */
    public String getemail() { return this.email; }
    /**
     * Email of lead
     */
    public void setemail(String value) { this.email = value; }
    /**
     * Requested ERP of lead
     */
    public String geterpSystem() { return this.erpSystem; }
    /**
     * Requested ERP of lead
     */
    public void seterpSystem(String value) { this.erpSystem = value; }
};
public class MigrationResultModel
{
    private String[] messages;
    private String groupKey;
    private Integer invoiceCount;
    private Integer addressCount;
    private Integer invoiceFieldCount;
    private Integer lineCount;
    private Integer contactCount;
    private Integer companyCount;
    private Integer paymentCount;
    private Integer paymentFieldCount;
    private Integer paymentAppliedCount;

    /**
     * If the API call produced messages, this element will contain a list of user-visible
     * text strings that contain information about what work occurred in the API.
     */
    public String[] getmessages() { return this.messages; }
    /**
     * If the API call produced messages, this element will contain a list of user-visible
     * text strings that contain information about what work occurred in the API.
     */
    public void setmessages(String[] value) { this.messages = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The number of invoices migrated
     */
    public Integer getinvoiceCount() { return this.invoiceCount; }
    /**
     * The number of invoices migrated
     */
    public void setinvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * The number of addresses migrated
     */
    public Integer getaddressCount() { return this.addressCount; }
    /**
     * The number of addresses migrated
     */
    public void setaddressCount(Integer value) { this.addressCount = value; }
    /**
     * The number of invoice and invoice line fields migrated
     */
    public Integer getinvoiceFieldCount() { return this.invoiceFieldCount; }
    /**
     * The number of invoice and invoice line fields migrated
     */
    public void setinvoiceFieldCount(Integer value) { this.invoiceFieldCount = value; }
    /**
     * The number of invoice lines migrated
     */
    public Integer getlineCount() { return this.lineCount; }
    /**
     * The number of invoice lines migrated
     */
    public void setlineCount(Integer value) { this.lineCount = value; }
    /**
     * The number of contacts migrated
     */
    public Integer getcontactCount() { return this.contactCount; }
    /**
     * The number of contacts migrated
     */
    public void setcontactCount(Integer value) { this.contactCount = value; }
    /**
     * The number of companies migrated
     */
    public Integer getcompanyCount() { return this.companyCount; }
    /**
     * The number of companies migrated
     */
    public void setcompanyCount(Integer value) { this.companyCount = value; }
    /**
     * The number of payments migrated
     */
    public Integer getpaymentCount() { return this.paymentCount; }
    /**
     * The number of payments migrated
     */
    public void setpaymentCount(Integer value) { this.paymentCount = value; }
    /**
     * The number of payment fields migrated
     */
    public Integer getpaymentFieldCount() { return this.paymentFieldCount; }
    /**
     * The number of payment fields migrated
     */
    public void setpaymentFieldCount(Integer value) { this.paymentFieldCount = value; }
    /**
     * The number of payments applied migrated
     */
    public Integer getpaymentAppliedCount() { return this.paymentAppliedCount; }
    /**
     * The number of payments applied migrated
     */
    public void setpaymentAppliedCount(Integer value) { this.paymentAppliedCount = value; }
};
public class NoteModel
{
    private String noteId;
    private String groupKey;
    private String tableKey;
    private String objectKey;
    private String noteText;
    private String noteType;
    private boolean isArchived;
    private String created;
    private String createdUserId;
    private String createdUserName;
    private String appEnrollmentId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getnoteId() { return this.noteId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setnoteId(String value) { this.noteId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The name of the table the note is associated with
     */
    public String gettableKey() { return this.tableKey; }
    /**
     * The name of the table the note is associated with
     */
    public void settableKey(String value) { this.tableKey = value; }
    /**
     * The ID of the object the note is associated with
     */
    public String getobjectKey() { return this.objectKey; }
    /**
     * The ID of the object the note is associated with
     */
    public void setobjectKey(String value) { this.objectKey = value; }
    /**
     * The text of the note
     */
    public String getnoteText() { return this.noteText; }
    /**
     * The text of the note
     */
    public void setnoteText(String value) { this.noteText = value; }
    /**
     * The type of the note
     */
    public String getnoteType() { return this.noteType; }
    /**
     * The type of the note
     */
    public void setnoteType(String value) { this.noteType = value; }
    /**
     * Flag indicating if the note has been archived
     */
    public boolean getisArchived() { return this.isArchived; }
    /**
     * Flag indicating if the note has been archived
     */
    public void setisArchived(boolean value) { this.isArchived = value; }
    /**
     * The date the note was created
     */
    public String getcreated() { return this.created; }
    /**
     * The date the note was created
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID of the user who created the note
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the note
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The name of the user who created the note
     */
    public String getcreatedUserName() { return this.createdUserName; }
    /**
     * The name of the user who created the note
     */
    public void setcreatedUserName(String value) { this.createdUserName = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
};
public class PaymentAppliedModel
{
    private String groupKey;
    private String paymentAppliedId;
    private String invoiceId;
    private String paymentId;
    private String erpKey;
    private Integer entryNumber;
    private String applyToInvoiceDate;
    private Double paymentAppliedAmount;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private InvoiceModel invoice;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getpaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setpaymentAppliedId(String value) { this.paymentAppliedId = value; }
    /**
     * The Invoice this payment is applied to.
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The Invoice this payment is applied to.
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The Payment applied to the invoice.
     */
    public String getpaymentId() { return this.paymentId; }
    /**
     * The Payment applied to the invoice.
     */
    public void setpaymentId(String value) { this.paymentId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String geterpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void seterpKey(String value) { this.erpKey = value; }
    /**
     * Reference number for the payment applied.
     */
    public Integer getentryNumber() { return this.entryNumber; }
    /**
     * Reference number for the payment applied.
     */
    public void setentryNumber(Integer value) { this.entryNumber = value; }
    /**
     * Date payment applied to invoice.
     */
    public String getapplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date payment applied to invoice.
     */
    public void setapplyToInvoiceDate(String value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to invoice.
     */
    public Double getpaymentAppliedAmount() { return this.paymentAppliedAmount; }
    /**
     * Amount applied to invoice.
     */
    public void setpaymentAppliedAmount(Double value) { this.paymentAppliedAmount = value; }
    /**
     * Date payment applied record was created.
     */
    public String getcreated() { return this.created; }
    /**
     * Date payment applied record was created.
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The id of the user who created this applied payment.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The id of the user who created this applied payment.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Date payment applied record was modified.
     */
    public String getmodified() { return this.modified; }
    /**
     * Date payment applied record was modified.
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The id of the user who modified this applied payment.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The id of the user who modified this applied payment.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The invoice associated with this applied payment.
     */
    public InvoiceModel getinvoice() { return this.invoice; }
    /**
     * The invoice associated with this applied payment.
     */
    public void setinvoice(InvoiceModel value) { this.invoice = value; }
};
public class PaymentDetailHeaderModel
{
    private String groupKey;
    private Integer customerCount;
    private Double amountCollected;
    private Double unappliedAmount;
    private Integer paidInvoiceCount;
    private Integer openInvoiceCount;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The total number of Customers.
     */
    public Integer getcustomerCount() { return this.customerCount; }
    /**
     * The total number of Customers.
     */
    public void setcustomerCount(Integer value) { this.customerCount = value; }
    /**
     * The total amount collected.
     */
    public Double getamountCollected() { return this.amountCollected; }
    /**
     * The total amount collected.
     */
    public void setamountCollected(Double value) { this.amountCollected = value; }
    /**
     * The total unapplied amount.
     */
    public Double getunappliedAmount() { return this.unappliedAmount; }
    /**
     * The total unapplied amount.
     */
    public void setunappliedAmount(Double value) { this.unappliedAmount = value; }
    /**
     * The number of paid invoices.
     */
    public Integer getpaidInvoiceCount() { return this.paidInvoiceCount; }
    /**
     * The number of paid invoices.
     */
    public void setpaidInvoiceCount(Integer value) { this.paidInvoiceCount = value; }
    /**
     * The number of open invoices.
     */
    public Integer getopenInvoiceCount() { return this.openInvoiceCount; }
    /**
     * The number of open invoices.
     */
    public void setopenInvoiceCount(Integer value) { this.openInvoiceCount = value; }
};
public class PaymentDetailModel
{
    private String groupKey;
    private String paymentId;
    private String customerId;
    private String customerName;
    private String memoText;
    private String referenceCode;
    private String primaryContact;
    private String email;
    private Double paymentAmount;
    private Double unappliedAmount;
    private String paymentType;
    private Date paymentDate;
    private Date postDate;
    private String phone;
    private String fax;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String stateRegion;
    private String postalCode;
    private String countryCode;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this Payment.
     */
    public String getpaymentId() { return this.paymentId; }
    /**
     * The unique ID of this Payment.
     */
    public void setpaymentId(String value) { this.paymentId = value; }
    /**
     * The ID of the customer to which this Payment belongs.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The ID of the customer to which this Payment belongs.
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * The name of the customer to which this Payment belongs.
     */
    public String getcustomerName() { return this.customerName; }
    /**
     * The name of the customer to which this Payment belongs.
     */
    public void setcustomerName(String value) { this.customerName = value; }
    /**
     * Memo or reference text (ex. memo field on a check).
     */
    public String getmemoText() { return this.memoText; }
    /**
     * Memo or reference text (ex. memo field on a check).
     */
    public void setmemoText(String value) { this.memoText = value; }
    /**
     * Reference code for the payment for the given Erp system.
     */
    public String getreferenceCode() { return this.referenceCode; }
    /**
     * Reference code for the payment for the given Erp system.
     */
    public void setreferenceCode(String value) { this.referenceCode = value; }
    /**
     * The name of the Primary Contact for the Customer.
     */
    public String getprimaryContact() { return this.primaryContact; }
    /**
     * The name of the Primary Contact for the Customer.
     */
    public void setprimaryContact(String value) { this.primaryContact = value; }
    /**
     * The Email address of the Customer.
     */
    public String getemail() { return this.email; }
    /**
     * The Email address of the Customer.
     */
    public void setemail(String value) { this.email = value; }
    /**
     * Total amount of this Payment.
     */
    public Double getpaymentAmount() { return this.paymentAmount; }
    /**
     * Total amount of this Payment.
     */
    public void setpaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * Unapplied balance of this Payment.
     */
    public Double getunappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this Payment.
     */
    public void setunappliedAmount(Double value) { this.unappliedAmount = value; }
    /**
     * The type of payment, Payment or AP Payment.
     */
    public String getpaymentType() { return this.paymentType; }
    /**
     * The type of payment, Payment or AP Payment.
     */
    public void setpaymentType(String value) { this.paymentType = value; }
    /**
     * The date of this Payment.
     */
    public Date getpaymentDate() { return this.paymentDate; }
    /**
     * The date of this Payment.
     */
    public void setpaymentDate(Date value) { this.paymentDate = value; }
    /**
     * Payment post date.
     */
    public Date getpostDate() { return this.postDate; }
    /**
     * Payment post date.
     */
    public void setpostDate(Date value) { this.postDate = value; }
    /**
     * The phone number of the Customer's Primary Contact.
     */
    public String getphone() { return this.phone; }
    /**
     * The phone number of the Customer's Primary Contact.
     */
    public void setphone(String value) { this.phone = value; }
    /**
     * The fax number of the Customer's Primary Contact.
     */
    public String getfax() { return this.fax; }
    /**
     * The fax number of the Customer's Primary Contact.
     */
    public void setfax(String value) { this.fax = value; }
    /**
     * The first line of the address for the Customer's Primary Contact.
     */
    public String getaddress1() { return this.address1; }
    /**
     * The first line of the address for the Customer's Primary Contact.
     */
    public void setaddress1(String value) { this.address1 = value; }
    /**
     * The second line of the address for the Customer's Primary Contact.
     */
    public String getaddress2() { return this.address2; }
    /**
     * The second line of the address for the Customer's Primary Contact.
     */
    public void setaddress2(String value) { this.address2 = value; }
    /**
     * The third line of the address for the Customer's Primary Contact.
     */
    public String getaddress3() { return this.address3; }
    /**
     * The third line of the address for the Customer's Primary Contact.
     */
    public void setaddress3(String value) { this.address3 = value; }
    /**
     * The city of the address for the Customer's Primary Contact.
     */
    public String getcity() { return this.city; }
    /**
     * The city of the address for the Customer's Primary Contact.
     */
    public void setcity(String value) { this.city = value; }
    /**
     * The state/region of the address for the Customer's Primary Contact.
     */
    public String getstateRegion() { return this.stateRegion; }
    /**
     * The state/region of the address for the Customer's Primary Contact.
     */
    public void setstateRegion(String value) { this.stateRegion = value; }
    /**
     * The postal/zip code of the address for the Customer's Primary Contact.
     */
    public String getpostalCode() { return this.postalCode; }
    /**
     * The postal/zip code of the address for the Customer's Primary Contact.
     */
    public void setpostalCode(String value) { this.postalCode = value; }
    /**
     * The 2 character country code of the address for the Customer's Primary Contact.
     */
    public String getcountryCode() { return this.countryCode; }
    /**
     * The 2 character country code of the address for the Customer's Primary Contact.
     */
    public void setcountryCode(String value) { this.countryCode = value; }
};
public class PaymentModel
{
    private String groupKey;
    private String paymentId;
    private String companyId;
    private String erpKey;
    private String paymentType;
    private String tenderType;
    private boolean isOpen;
    private String memoText;
    private Date paymentDate;
    private Date postDate;
    private Double paymentAmount;
    private Double unappliedAmount;
    private String currencyCode;
    private String referenceCode;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private boolean isVoided;
    private boolean inDispute;
    private PaymentAppliedModel[] applications;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getpaymentId() { return this.paymentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setpaymentId(String value) { this.paymentId = value; }
    /**
     * The ID of the company to which this payment belongs.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The ID of the company to which this payment belongs.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String geterpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void seterpKey(String value) { this.erpKey = value; }
    /**
     * The type of payment, cash or check.
     */
    public String getpaymentType() { return this.paymentType; }
    /**
     * The type of payment, cash or check.
     */
    public void setpaymentType(String value) { this.paymentType = value; }
    /**
     * Cash, check, credit card, wire transfer.
     */
    public String gettenderType() { return this.tenderType; }
    /**
     * Cash, check, credit card, wire transfer.
     */
    public void settenderType(String value) { this.tenderType = value; }
    /**
     * Has the payment been fully applied?
     */
    public boolean getisOpen() { return this.isOpen; }
    /**
     * Has the payment been fully applied?
     */
    public void setisOpen(boolean value) { this.isOpen = value; }
    /**
     * Memo or reference text (ex. memo field on a check).
     */
    public String getmemoText() { return this.memoText; }
    /**
     * Memo or reference text (ex. memo field on a check).
     */
    public void setmemoText(String value) { this.memoText = value; }
    /**
     * The date of this payment.
     */
    public Date getpaymentDate() { return this.paymentDate; }
    /**
     * The date of this payment.
     */
    public void setpaymentDate(Date value) { this.paymentDate = value; }
    /**
     * Payment post date.
     */
    public Date getpostDate() { return this.postDate; }
    /**
     * Payment post date.
     */
    public void setpostDate(Date value) { this.postDate = value; }
    /**
     * Total amount of this payment.
     */
    public Double getpaymentAmount() { return this.paymentAmount; }
    /**
     * Total amount of this payment.
     */
    public void setpaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * Unapplied balance of this payment.
     */
    public Double getunappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this payment.
     */
    public void setunappliedAmount(Double value) { this.unappliedAmount = value; }
    /**
     * Currency of the payment. This will be validated by the /api/v1/currencies data set
     */
    public String getcurrencyCode() { return this.currencyCode; }
    /**
     * Currency of the payment. This will be validated by the /api/v1/currencies data set
     */
    public void setcurrencyCode(String value) { this.currencyCode = value; }
    /**
     * Reference code for the payment for the given Erp system.
     */
    public String getreferenceCode() { return this.referenceCode; }
    /**
     * Reference code for the payment for the given Erp system.
     */
    public void setreferenceCode(String value) { this.referenceCode = value; }
    /**
     * The date on which this record was created.
     */
    public String getcreated() { return this.created; }
    /**
     * The date on which this record was created.
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID of the user who created this payment.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this payment.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this record was last modified.
     */
    public String getmodified() { return this.modified; }
    /**
     * The date on which this record was last modified.
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The ID of the user who last modified this payment.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this payment.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Is the payment voided?
     */
    public boolean getisVoided() { return this.isVoided; }
    /**
     * Is the payment voided?
     */
    public void setisVoided(boolean value) { this.isVoided = value; }
    /**
     * Is the payment in dispute?
     */
    public boolean getinDispute() { return this.inDispute; }
    /**
     * Is the payment in dispute?
     */
    public void setinDispute(boolean value) { this.inDispute = value; }
    /**
     * All applications this payment is associated with.
     * To retrieve this collection, specify `Applications` in the "Include" parameter for your query.
     */
    public PaymentAppliedModel[] getapplications() { return this.applications; }
    /**
     * All applications this payment is associated with.
     * To retrieve this collection, specify `Applications` in the "Include" parameter for your query.
     */
    public void setapplications(PaymentAppliedModel[] value) { this.applications = value; }
    /**
     * All notes attached to this payment.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this payment.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this payment.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this payment.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getcustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
public class PaymentSummaryModel
{
    private String groupKey;
    private String paymentId;
    private String memoText;
    private String referenceCode;
    private String paymentType;
    private Date paymentDate;
    private Double paymentAmount;
    private Double unappliedAmount;
    private Integer invoiceCount;
    private Double totalPaymentsApplied;
    private String[] invoiceList;
    private String[] invoiceIdList;
    private String customerName;
    private String customerId;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The id of the payment
     */
    public String getpaymentId() { return this.paymentId; }
    /**
     * The id of the payment
     */
    public void setpaymentId(String value) { this.paymentId = value; }
    /**
     * Memo or reference text (ex. memo field on a check).
     */
    public String getmemoText() { return this.memoText; }
    /**
     * Memo or reference text (ex. memo field on a check).
     */
    public void setmemoText(String value) { this.memoText = value; }
    /**
     * Reference code for the payment for the given Erp system.
     */
    public String getreferenceCode() { return this.referenceCode; }
    /**
     * Reference code for the payment for the given Erp system.
     */
    public void setreferenceCode(String value) { this.referenceCode = value; }
    /**
     * The type of payment, Payment or AP Payment.
     */
    public String getpaymentType() { return this.paymentType; }
    /**
     * The type of payment, Payment or AP Payment.
     */
    public void setpaymentType(String value) { this.paymentType = value; }
    /**
     * The date of this payment.
     */
    public Date getpaymentDate() { return this.paymentDate; }
    /**
     * The date of this payment.
     */
    public void setpaymentDate(Date value) { this.paymentDate = value; }
    /**
     * Total amount of this payment.
     */
    public Double getpaymentAmount() { return this.paymentAmount; }
    /**
     * Total amount of this payment.
     */
    public void setpaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * Unapplied balance of this payment.
     */
    public Double getunappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this payment.
     */
    public void setunappliedAmount(Double value) { this.unappliedAmount = value; }
    /**
     * The number of invoices associated to this payment.
     */
    public Integer getinvoiceCount() { return this.invoiceCount; }
    /**
     * The number of invoices associated to this payment.
     */
    public void setinvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * The number of payments applied to this payment.
     */
    public Double gettotalPaymentsApplied() { return this.totalPaymentsApplied; }
    /**
     * The number of payments applied to this payment.
     */
    public void settotalPaymentsApplied(Double value) { this.totalPaymentsApplied = value; }
    /**
     * The reference codes of the invoices associated to this payment.
     */
    public String[] getinvoiceList() { return this.invoiceList; }
    /**
     * The reference codes of the invoices associated to this payment.
     */
    public void setinvoiceList(String[] value) { this.invoiceList = value; }
    /**
     * The ids of the invoices associated to this payment.
     */
    public String[] getinvoiceIdList() { return this.invoiceIdList; }
    /**
     * The ids of the invoices associated to this payment.
     */
    public void setinvoiceIdList(String[] value) { this.invoiceIdList = value; }
    /**
     * The name of the customer for this payment.
     */
    public String getcustomerName() { return this.customerName; }
    /**
     * The name of the customer for this payment.
     */
    public void setcustomerName(String value) { this.customerName = value; }
    /**
     * The id of the customer for this payment.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The id of the customer for this payment.
     */
    public void setcustomerId(String value) { this.customerId = value; }
};
public class ProvisioningFinalizeRequestModel
{
    private String fullName;
    private String timeZone;
    private String defaultCurrency;
    private CompanyModel company;
    private ErpInfoModel emailConnector;

    /**
     * The full name of the user
     */
    public String getfullName() { return this.fullName; }
    /**
     * The full name of the user
     */
    public void setfullName(String value) { this.fullName = value; }
    /**
     * The time zone of the user
     */
    public String gettimeZone() { return this.timeZone; }
    /**
     * The time zone of the user
     */
    public void settimeZone(String value) { this.timeZone = value; }
    /**
     * The default currency of the user
     */
    public String getdefaultCurrency() { return this.defaultCurrency; }
    /**
     * The default currency of the user
     */
    public void setdefaultCurrency(String value) { this.defaultCurrency = value; }
    /**
     * The company information for the user and group
     */
    public CompanyModel getcompany() { return this.company; }
    /**
     * The company information for the user and group
     */
    public void setcompany(CompanyModel value) { this.company = value; }
    /**
     * Optional connector information needed to enroll user to their email connector
     */
    public ErpInfoModel getemailConnector() { return this.emailConnector; }
    /**
     * Optional connector information needed to enroll user to their email connector
     */
    public void setemailConnector(ErpInfoModel value) { this.emailConnector = value; }
};
public class ProvisioningModel
{
    private String fullName;
    private ErpInfoModel erp;

    /**
     * The full name of the new user
     */
    public String getfullName() { return this.fullName; }
    /**
     * The full name of the new user
     */
    public void setfullName(String value) { this.fullName = value; }
    /**
     * The information necessary to enroll the user in their ERP
     */
    public ErpInfoModel geterp() { return this.erp; }
    /**
     * The information necessary to enroll the user in their ERP
     */
    public void seterp(ErpInfoModel value) { this.erp = value; }
};
public class ProvisioningResponseModel
{
    private String userName;
    private String accountName;
    private String userId;
    private String groupKey;
    private String appEnrollmentId;
    private String syncRequestId;
    private String errorMessage;

    /**
     * If provisioning is successful, contains the username of the created user.
     */
    public String getuserName() { return this.userName; }
    /**
     * If provisioning is successful, contains the username of the created user.
     */
    public void setuserName(String value) { this.userName = value; }
    /**
     * If provisioning is successful, contains subscription account name of created user.
     */
    public String getaccountName() { return this.accountName; }
    /**
     * If provisioning is successful, contains subscription account name of created user.
     */
    public void setaccountName(String value) { this.accountName = value; }
    /**
     * If provisioning is successful, contains the unique identifier of the created user.
     */
    public String getuserId() { return this.userId; }
    /**
     * If provisioning is successful, contains the unique identifier of the created user.
     */
    public void setuserId(String value) { this.userId = value; }
    /**
     * If provisioning is successful, contains the group key of the created user.
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * If provisioning is successful, contains the group key of the created user.
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * If provisioning is successful, contains the app enrollment id of the created app enrollment.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * If provisioning is successful, contains the app enrollment id of the created app enrollment.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * if provisioning is successful, contains the sync request id of the sync that was started for the app enrollment.
     */
    public String getsyncRequestId() { return this.syncRequestId; }
    /**
     * if provisioning is successful, contains the sync request id of the sync that was started for the app enrollment.
     */
    public void setsyncRequestId(String value) { this.syncRequestId = value; }
    /**
     * The error message(s).
     */
    public String geterrorMessage() { return this.errorMessage; }
    /**
     * The error message(s).
     */
    public void seterrorMessage(String value) { this.errorMessage = value; }
};
public class RiskRateModel
{
    private String groupKey;
    private String reportPeriod;
    private String invoiceMonthName;
    private Integer totalInvoiceCount;
    private Double totalInvoiceAmount;
    private Integer atRiskCount;
    private Double atRiskAmount;
    private Double atRiskCountPercentage;
    private Double atRiskPercentage;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The month the risk rate was calculated for
     */
    public String getreportPeriod() { return this.reportPeriod; }
    /**
     * The month the risk rate was calculated for
     */
    public void setreportPeriod(String value) { this.reportPeriod = value; }
    /**
     * The string name of the month the risk rate was calculated for
     */
    public String getinvoiceMonthName() { return this.invoiceMonthName; }
    /**
     * The string name of the month the risk rate was calculated for
     */
    public void setinvoiceMonthName(String value) { this.invoiceMonthName = value; }
    /**
     * The count of all invoices in the calculation month
     */
    public Integer gettotalInvoiceCount() { return this.totalInvoiceCount; }
    /**
     * The count of all invoices in the calculation month
     */
    public void settotalInvoiceCount(Integer value) { this.totalInvoiceCount = value; }
    /**
     * The sum of the total amount for invoices in the calculation month
     */
    public Double gettotalInvoiceAmount() { return this.totalInvoiceAmount; }
    /**
     * The sum of the total amount for invoices in the calculation month
     */
    public void settotalInvoiceAmount(Double value) { this.totalInvoiceAmount = value; }
    /**
     * The count of open invoices over 90 days from the calculation month
     */
    public Integer getatRiskCount() { return this.atRiskCount; }
    /**
     * The count of open invoices over 90 days from the calculation month
     */
    public void setatRiskCount(Integer value) { this.atRiskCount = value; }
    /**
     * The sum of the outstanding balance of open invoices over 90 days from the calculation month
     */
    public Double getatRiskAmount() { return this.atRiskAmount; }
    /**
     * The sum of the outstanding balance of open invoices over 90 days from the calculation month
     */
    public void setatRiskAmount(Double value) { this.atRiskAmount = value; }
    /**
     * The percentage of all open invoices for the calculation month that are over 90 days based on count
     */
    public Double getatRiskCountPercentage() { return this.atRiskCountPercentage; }
    /**
     * The percentage of all open invoices for the calculation month that are over 90 days based on count
     */
    public void setatRiskCountPercentage(Double value) { this.atRiskCountPercentage = value; }
    /**
     * The percentage of all open invoices for the calculation month that are over 90 days based on outstanding balance
     */
    public Double getatRiskPercentage() { return this.atRiskPercentage; }
    /**
     * The percentage of all open invoices for the calculation month that are over 90 days based on outstanding balance
     */
    public void setatRiskPercentage(Double value) { this.atRiskPercentage = value; }
};
public class StateModel
{
    private String name;
    private String alpha2;
    private String aliases;

    /**
     * Name of the state
     */
    public String getname() { return this.name; }
    /**
     * Name of the state
     */
    public void setname(String value) { this.name = value; }
    /**
     * 2 letter alphabetic code for the given state
     */
    public String getalpha2() { return this.alpha2; }
    /**
     * 2 letter alphabetic code for the given state
     */
    public void setalpha2(String value) { this.alpha2 = value; }
    /**
     * A different name for a state
     */
    public String getaliases() { return this.aliases; }
    /**
     * A different name for a state
     */
    public void setaliases(String value) { this.aliases = value; }
};
public class StatusModel
{
    private String userName;
    private String accountName;
    private String accountCompanyId;
    private String userId;
    private String groupKey;
    private boolean loggedIn;
    private String errorMessage;
    private String[] roles;
    private String lastLoggedIn;
    private String apiKeyId;
    private String userStatus;
    private object dependencies;

    /**
     * If authentication is successful, contains the username of the logged-in user.
     */
    public String getuserName() { return this.userName; }
    /**
     * If authentication is successful, contains the username of the logged-in user.
     */
    public void setuserName(String value) { this.userName = value; }
    /**
     * If authentication is successful, contains subscription account name of logged-in user.
     */
    public String getaccountName() { return this.accountName; }
    /**
     * If authentication is successful, contains subscription account name of logged-in user.
     */
    public void setaccountName(String value) { this.accountName = value; }
    /**
     * If authentication is successful, contains subscription account company id of logged-in user.
     */
    public String getaccountCompanyId() { return this.accountCompanyId; }
    /**
     * If authentication is successful, contains subscription account company id of logged-in user.
     */
    public void setaccountCompanyId(String value) { this.accountCompanyId = value; }
    /**
     * If authentication is successful, contains the unique identifier of the logged-in user.
     */
    public String getuserId() { return this.userId; }
    /**
     * If authentication is successful, contains the unique identifier of the logged-in user.
     */
    public void setuserId(String value) { this.userId = value; }
    /**
     * If authentication is successful, contains the group key of the logged-in user.
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * If authentication is successful, contains the group key of the logged-in user.
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * Returns true if authentication for this API was successful.
     */
    public boolean getloggedIn() { return this.loggedIn; }
    /**
     * Returns true if authentication for this API was successful.
     */
    public void setloggedIn(boolean value) { this.loggedIn = value; }
    /**
     * The error message.
     */
    public String geterrorMessage() { return this.errorMessage; }
    /**
     * The error message.
     */
    public void seterrorMessage(String value) { this.errorMessage = value; }
    /**
     * The set of roles for this user.
     */
    public String[] getroles() { return this.roles; }
    /**
     * The set of roles for this user.
     */
    public void setroles(String[] value) { this.roles = value; }
    /**
     * Date and time user has last logged into Azure B2C.
     */
    public String getlastLoggedIn() { return this.lastLoggedIn; }
    /**
     * Date and time user has last logged into Azure B2C.
     */
    public void setlastLoggedIn(String value) { this.lastLoggedIn = value; }
    /**
     * The id of the API key used to authenticate.
     */
    public String getapiKeyId() { return this.apiKeyId; }
    /**
     * The id of the API key used to authenticate.
     */
    public void setapiKeyId(String value) { this.apiKeyId = value; }
    /**
     * If authentication is successful, contains the user status of the logged-in user.
     */
    public String getuserStatus() { return this.userStatus; }
    /**
     * If authentication is successful, contains the user status of the logged-in user.
     */
    public void setuserStatus(String value) { this.userStatus = value; }
    /**
     * Statuses for the dependencies of this api.
     * OK if the dependency is working.
     */
    public object getdependencies() { return this.dependencies; }
    /**
     * Statuses for the dependencies of this api.
     * OK if the dependency is working.
     */
    public void setdependencies(object value) { this.dependencies = value; }
};
public class SyncEntityResultModel
{
    private Integer insertCount;
    private Integer updateCount;
    private Integer skipCount;
    private Integer errorCount;
    private object errors;

    /**
     * The number of entities inserted
     */
    public Integer getinsertCount() { return this.insertCount; }
    /**
     * The number of entities inserted
     */
    public void setinsertCount(Integer value) { this.insertCount = value; }
    /**
     * The number of entities updated
     */
    public Integer getupdateCount() { return this.updateCount; }
    /**
     * The number of entities updated
     */
    public void setupdateCount(Integer value) { this.updateCount = value; }
    /**
     * The number of entities skipped
     */
    public Integer getskipCount() { return this.skipCount; }
    /**
     * The number of entities skipped
     */
    public void setskipCount(Integer value) { this.skipCount = value; }
    /**
     * The number of errors encountered during sync
     */
    public Integer geterrorCount() { return this.errorCount; }
    /**
     * The number of errors encountered during sync
     */
    public void seterrorCount(Integer value) { this.errorCount = value; }
    /**
     * The errors encountered during sync keyed by ERP key
     */
    public object geterrors() { return this.errors; }
    /**
     * The errors encountered during sync keyed by ERP key
     */
    public void seterrors(object value) { this.errors = value; }
};
public class SyncRequestModel
{
    private String syncRequestId;
    private String groupKey;
    private String statusCode;
    private String processResultMessage;
    private String appEnrollmentId;
    private String created;
    private String modified;
    private String modifiedUserId;
    private object details;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getsyncRequestId() { return this.syncRequestId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setsyncRequestId(String value) { this.syncRequestId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * Potential values = Cancelled, Ready, In Progress, Success, Failed
     */
    public String getstatusCode() { return this.statusCode; }
    /**
     * Potential values = Cancelled, Ready, In Progress, Success, Failed
     */
    public void setstatusCode(String value) { this.statusCode = value; }
    /**
     * Message containing information about the sync request results
     */
    public String getprocessResultMessage() { return this.processResultMessage; }
    /**
     * Message containing information about the sync request results
     */
    public void setprocessResultMessage(String value) { this.processResultMessage = value; }
    /**
     * App enrollment sync request is for
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * App enrollment sync request is for
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The date this sync request was created
     */
    public String getcreated() { return this.created; }
    /**
     * The date this sync request was created
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The date this sync request was last modified
     */
    public String getmodified() { return this.modified; }
    /**
     * The date this sync request was last modified
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this sync request.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this sync request.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The detailed results from the sync.
     * To retrieve this collection, set `includeDetails` to true in your GET requests.
     */
    public object getdetails() { return this.details; }
    /**
     * The detailed results from the sync.
     * To retrieve this collection, set `includeDetails` to true in your GET requests.
     */
    public void setdetails(object value) { this.details = value; }
};
public class SyncSubmitModel
{
    private String appEnrollmentId;

    /**
     * The identifier of the app enrollment
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The identifier of the app enrollment
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
};
public class TransferOwnerModel
{
    private UserAccountModel previousOwner;
    private UserAccountModel newOwner;

    /**
     * The previous owner of the account.
     */
    public UserAccountModel getpreviousOwner() { return this.previousOwner; }
    /**
     * The previous owner of the account.
     */
    public void setpreviousOwner(UserAccountModel value) { this.previousOwner = value; }
    /**
     * The new owner of the account.
     */
    public UserAccountModel getnewOwner() { return this.newOwner; }
    /**
     * The new owner of the account.
     */
    public void setnewOwner(UserAccountModel value) { this.newOwner = value; }
};
public class TransferOwnerSubmitModel
{
    private String targetUserId;

    /**
     * The ID of the user to transfer ownership to.
     */
    public String gettargetUserId() { return this.targetUserId; }
    /**
     * The ID of the user to transfer ownership to.
     */
    public void settargetUserId(String value) { this.targetUserId = value; }
};
public class UserAccountModel
{
    private String userId;
    private String groupKey;
    private String userName;
    private String email;
    private String status;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String modifiedUserName;
    private String b2CUserId;
    private String userRole;
    private String inviteSent;
    private String phoneNumber;
    private String faxNumber;
    private String title;
    private String accountingRoleCodeDefId;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String stateRegion;
    private String postalCode;
    private String country;
    private String imageURL;
    private String description;
    private String b2CLastLoggedIn;
    private String defaultCurrencyCode;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CustomFieldValueModel[] customFieldValues;
    private CodeDefinitionModel accountingRoleCodeDefinition;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * This record provides a link to the user's Azure AD B2C OID.
     */
    public String getuserId() { return this.userId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * This record provides a link to the user's Azure AD B2C OID.
     */
    public void setuserId(String value) { this.userId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The full name of the user
     */
    public String getuserName() { return this.userName; }
    /**
     * The full name of the user
     */
    public void setuserName(String value) { this.userName = value; }
    /**
     * The email of the user
     */
    public String getemail() { return this.email; }
    /**
     * The email of the user
     */
    public void setemail(String value) { this.email = value; }
    /**
     * The status of the user's account
     */
    public String getstatus() { return this.status; }
    /**
     * The status of the user's account
     */
    public void setstatus(String value) { this.status = value; }
    /**
     * The date that the user account was created
     */
    public String getcreated() { return this.created; }
    /**
     * The date that the user account was created
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID of the user who created the user account
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the user account
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the user account was last modified
     */
    public String getmodified() { return this.modified; }
    /**
     * The date the user account was last modified
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The ID of the user who last modified the user account
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the user account
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The name of the user who last modified the user account
     */
    public String getmodifiedUserName() { return this.modifiedUserName; }
    /**
     * The name of the user who last modified the user account
     */
    public void setmodifiedUserName(String value) { this.modifiedUserName = value; }
    /**
     * The ID of the user in Azure B2C
     */
    public String getb2CUserId() { return this.b2CUserId; }
    /**
     * The ID of the user in Azure B2C
     */
    public void setb2CUserId(String value) { this.b2CUserId = value; }
    /**
     * The id of the Permission Level for the user.
     */
    public String getuserRole() { return this.userRole; }
    /**
     * The id of the Permission Level for the user.
     */
    public void setuserRole(String value) { this.userRole = value; }
    /**
     * The date timestamp when the invite was sent to the user.
     */
    public String getinviteSent() { return this.inviteSent; }
    /**
     * The date timestamp when the invite was sent to the user.
     */
    public void setinviteSent(String value) { this.inviteSent = value; }
    /**
     * The phone number of the user.
     */
    public String getphoneNumber() { return this.phoneNumber; }
    /**
     * The phone number of the user.
     */
    public void setphoneNumber(String value) { this.phoneNumber = value; }
    /**
     * The fax number of the user.
     */
    public String getfaxNumber() { return this.faxNumber; }
    /**
     * The fax number of the user.
     */
    public void setfaxNumber(String value) { this.faxNumber = value; }
    /**
     * The title of the user; free text field
     */
    public String gettitle() { return this.title; }
    /**
     * The title of the user; free text field
     */
    public void settitle(String value) { this.title = value; }
    /**
     * FK to the CodeDefinition table; CodeType = 'AccountingRole'
     */
    public String getaccountingRoleCodeDefId() { return this.accountingRoleCodeDefId; }
    /**
     * FK to the CodeDefinition table; CodeType = 'AccountingRole'
     */
    public void setaccountingRoleCodeDefId(String value) { this.accountingRoleCodeDefId = value; }
    /**
     * Address Line 1 for this User
     */
    public String getaddress1() { return this.address1; }
    /**
     * Address Line 1 for this User
     */
    public void setaddress1(String value) { this.address1 = value; }
    /**
     * Address Line 2 for this User
     */
    public String getaddress2() { return this.address2; }
    /**
     * Address Line 2 for this User
     */
    public void setaddress2(String value) { this.address2 = value; }
    /**
     * Address Line 3 for this User
     */
    public String getaddress3() { return this.address3; }
    /**
     * Address Line 3 for this User
     */
    public void setaddress3(String value) { this.address3 = value; }
    /**
     * City for this User
     */
    public String getcity() { return this.city; }
    /**
     * City for this User
     */
    public void setcity(String value) { this.city = value; }
    /**
     * Region ("state" in the US) for this User
     */
    public String getstateRegion() { return this.stateRegion; }
    /**
     * Region ("state" in the US) for this User
     */
    public void setstateRegion(String value) { this.stateRegion = value; }
    /**
     * Postal Code this User
     */
    public String getpostalCode() { return this.postalCode; }
    /**
     * Postal Code this User
     */
    public void setpostalCode(String value) { this.postalCode = value; }
    /**
     * Country for this User This will be validated by the /api/v1/countries data set
     */
    public String getcountry() { return this.country; }
    /**
     * Country for this User This will be validated by the /api/v1/countries data set
     */
    public void setcountry(String value) { this.country = value; }
    /**
     * Image URL for this User
     */
    public String getimageURL() { return this.imageURL; }
    /**
     * Image URL for this User
     */
    public void setimageURL(String value) { this.imageURL = value; }
    /**
     * Description for this User.
     */
    public String getdescription() { return this.description; }
    /**
     * Description for this User.
     */
    public void setdescription(String value) { this.description = value; }
    /**
     * Last date time user logged into Azure B2C.
     */
    public String getb2CLastLoggedIn() { return this.b2CLastLoggedIn; }
    /**
     * Last date time user logged into Azure B2C.
     */
    public void setb2CLastLoggedIn(String value) { this.b2CLastLoggedIn = value; }
    /**
     * The default currency code used by this user entity.  This value can be overridden
     * for invoices in a different currency code.
     * 
     * For a list of defined currency codes, see [TODO]()
     */
    public String getdefaultCurrencyCode() { return this.defaultCurrencyCode; }
    /**
     * The default currency code used by this user entity.  This value can be overridden
     * for invoices in a different currency code.
     * 
     * For a list of defined currency codes, see [TODO]()
     */
    public void setdefaultCurrencyCode(String value) { this.defaultCurrencyCode = value; }
    /**
     * All notes attached to this User.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this User.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this User.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this User.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All values attached to this User.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getcustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this User.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setcustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Accounting role definition for this User.
     * To retrieve this collection, specify `AccountingRole` in the "Include" parameter for your query.
     */
    public CodeDefinitionModel getaccountingRoleCodeDefinition() { return this.accountingRoleCodeDefinition; }
    /**
     * Accounting role definition for this User.
     * To retrieve this collection, specify `AccountingRole` in the "Include" parameter for your query.
     */
    public void setaccountingRoleCodeDefinition(CodeDefinitionModel value) { this.accountingRoleCodeDefinition = value; }
};
public class UserRoleModel
{
    private String userRoleId;
    private String groupKey;
    private String userRoleName;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getuserRoleId() { return this.userRoleId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setuserRoleId(String value) { this.userRoleId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The name of the user role
     */
    public String getuserRoleName() { return this.userRoleName; }
    /**
     * The name of the user role
     */
    public void setuserRoleName(String value) { this.userRoleName = value; }
    /**
     * The date that the user role was created
     */
    public String getcreated() { return this.created; }
    /**
     * The date that the user role was created
     */
    public void setcreated(String value) { this.created = value; }
    /**
     * The ID of the user who created the user role
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the user role
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date the user role was last modified
     */
    public String getmodified() { return this.modified; }
    /**
     * The date the user role was last modified
     */
    public void setmodified(String value) { this.modified = value; }
    /**
     * The ID of the user who last modified the user role
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the user role
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
};
