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
 * @version    2021.39
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;

public class AppEnrollmentModel
{
    private String appEnrollmentId;
    private String appId;
    private String groupKey;
    private Boolean isActive;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String cronSettings;
    private Boolean syncScheduleIsActive;
    private ApplicationModel app;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;
    private SyncRequestModel lastSync;
    private ConnectorInfoModel connectorInfo;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The ID number of the Application that this enrollment represents.  You can fetch information
     * about this Application object by specifying `App` in the "Include" parameter for your request.
     */
    public String getAppId() { return this.appId; }
    /**
     * The ID number of the Application that this enrollment represents.  You can fetch information
     * about this Application object by specifying `App` in the "Include" parameter for your request.
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * Determines whether the app enrollment is in use
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * Determines whether the app enrollment is in use
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * Created date
     */
    public Date getCreated() { return this.created; }
    /**
     * Created date
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * Created user ID
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * Created user ID
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Last modified date
     */
    public Date getModified() { return this.modified; }
    /**
     * Last modified date
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * Last user ID to modify
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * Last user ID to modify
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * Stores schedule information for the application enrollment
     * see https://en.wikipedia.org/wiki/Cron
     */
    public String getCronSettings() { return this.cronSettings; }
    /**
     * Stores schedule information for the application enrollment
     * see https://en.wikipedia.org/wiki/Cron
     */
    public void setCronSettings(String value) { this.cronSettings = value; }
    /**
     * Flag indicating if the Sync process should be ran on the specified schedule
     */
    public Boolean getSyncScheduleIsActive() { return this.syncScheduleIsActive; }
    /**
     * Flag indicating if the Sync process should be ran on the specified schedule
     */
    public void setSyncScheduleIsActive(Boolean value) { this.syncScheduleIsActive = value; }
    /**
     * The Application to which this AppEnrollment belongs.  Contains general name, description,
     * logo, and other metadata about this application.
     * 
     * To retrieve this object, specify `App` in the "Include" parameter for your query.
     */
    public ApplicationModel getApp() { return this.app; }
    /**
     * The Application to which this AppEnrollment belongs.  Contains general name, description,
     * logo, and other metadata about this application.
     * 
     * To retrieve this object, specify `App` in the "Include" parameter for your query.
     */
    public void setApp(ApplicationModel value) { this.app = value; }
    /**
     * All definitions attached to this app.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this app.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this app.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this app.
     * 
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Data about the last sync attached to this app enrollment
     * 
     * To retrieve this collection, specify `LastSync` in the "Include" parameter for your query.
     */
    public SyncRequestModel getLastSync() { return this.lastSync; }
    /**
     * Data about the last sync attached to this app enrollment
     * 
     * To retrieve this collection, specify `LastSync` in the "Include" parameter for your query.
     */
    public void setLastSync(SyncRequestModel value) { this.lastSync = value; }
    /**
     * Optional data necessary to create an app enrollment for a supported connector.
     * Only enter relevant fields for the given connector.
     */
    public ConnectorInfoModel getConnectorInfo() { return this.connectorInfo; }
    /**
     * Optional data necessary to create an app enrollment for a supported connector.
     * Only enter relevant fields for the given connector.
     */
    public void setConnectorInfo(ConnectorInfoModel value) { this.connectorInfo = value; }
};
