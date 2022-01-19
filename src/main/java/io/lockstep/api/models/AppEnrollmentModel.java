
/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @version    2022.3
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * An AppEnrollment represents an app that has been enrolled to the current account.  When you sign up for an
 * app using the Lockstep Platform, you obtain an enrollment record for that app.  Example types of apps include
 * connectors and feature enhancement apps. The App Enrollment object contains information about this app, its
 * configuration, and settings.
 *
 * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
 */
public class AppEnrollmentModel
{
    private String appEnrollmentId;
    private String appId;
    private String groupKey;
    private Boolean isActive;
    private String created;
    private String createdUserId;
    private String modified;
    private String modifiedUserId;
    private String cronSettings;
    private Boolean syncScheduleIsActive;
    private ApplicationModel app;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;
    private SyncRequestModel lastSync;
    private SyncRequestModel lastSuccessfulSync;
    private ConnectorInfoModel connectorInfo;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The ID number of the Application that this enrollment represents.  You can fetch information
     * about this Application object by specifying `App` in the "Include" parameter for your request.
     *
     * @return The field appId
     */
    public String getAppId() { return this.appId; }
    /**
     * The ID number of the Application that this enrollment represents.  You can fetch information
     * about this Application object by specifying `App` in the "Include" parameter for your request.
     *
     * @param value The new value for appId
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * Determines whether the app enrollment is in use
     *
     * @return The field isActive
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * Determines whether the app enrollment is in use
     *
     * @param value The new value for isActive
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * Created date
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * Created date
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * Created user ID
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * Created user ID
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Last modified date
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * Last modified date
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * Last user ID to modify
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * Last user ID to modify
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * Stores schedule information for the application enrollment
     * see https://en.wikipedia.org/wiki/Cron
     *
     * @return The field cronSettings
     */
    public String getCronSettings() { return this.cronSettings; }
    /**
     * Stores schedule information for the application enrollment
     * see https://en.wikipedia.org/wiki/Cron
     *
     * @param value The new value for cronSettings
     */
    public void setCronSettings(String value) { this.cronSettings = value; }
    /**
     * Flag indicating if the Sync process should be ran on the specified schedule
     *
     * @return The field syncScheduleIsActive
     */
    public Boolean getSyncScheduleIsActive() { return this.syncScheduleIsActive; }
    /**
     * Flag indicating if the Sync process should be ran on the specified schedule
     *
     * @param value The new value for syncScheduleIsActive
     */
    public void setSyncScheduleIsActive(Boolean value) { this.syncScheduleIsActive = value; }
    /**
     * The Application to which this AppEnrollment belongs.  Contains general name, description,
     * logo, and other metadata about this application.
     *
     * To retrieve this object, specify `App` in the "Include" parameter for your query.
     *
     * @return The field app
     */
    public ApplicationModel getApp() { return this.app; }
    /**
     * The Application to which this AppEnrollment belongs.  Contains general name, description,
     * logo, and other metadata about this application.
     *
     * To retrieve this object, specify `App` in the "Include" parameter for your query.
     *
     * @param value The new value for app
     */
    public void setApp(ApplicationModel value) { this.app = value; }
    /**
     * All definitions attached to this app.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return The field customFieldDefinitions
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this app.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value The new value for customFieldDefinitions
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this app.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return The field customFieldValues
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this app.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Data about the last sync attached to this app enrollment
     *
     * To retrieve this collection, specify `LastSync` in the "Include" parameter for your query.
     *
     * @return The field lastSync
     */
    public SyncRequestModel getLastSync() { return this.lastSync; }
    /**
     * Data about the last sync attached to this app enrollment
     *
     * To retrieve this collection, specify `LastSync` in the "Include" parameter for your query.
     *
     * @param value The new value for lastSync
     */
    public void setLastSync(SyncRequestModel value) { this.lastSync = value; }
    /**
     * Data about the last successful sync associated with this enrollment
     *
     * @return The field lastSuccessfulSync
     */
    public SyncRequestModel getLastSuccessfulSync() { return this.lastSuccessfulSync; }
    /**
     * Data about the last successful sync associated with this enrollment
     *
     * @param value The new value for lastSuccessfulSync
     */
    public void setLastSuccessfulSync(SyncRequestModel value) { this.lastSuccessfulSync = value; }
    /**
     * Optional data necessary to create an app enrollment for a supported connector.
     * Only enter relevant fields for the given connector.
     *
     * @return The field connectorInfo
     */
    public ConnectorInfoModel getConnectorInfo() { return this.connectorInfo; }
    /**
     * Optional data necessary to create an app enrollment for a supported connector.
     * Only enter relevant fields for the given connector.
     *
     * @param value The new value for connectorInfo
     */
    public void setConnectorInfo(ConnectorInfoModel value) { this.connectorInfo = value; }
};
