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
 * @version    2022.2
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
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * @return The ID number of the Application that this enrollment represents. You can fetch information about this Application object by specifying `App` in the "Include" parameter for your request.
     */
    public String getAppId() { return this.appId; }
    /**
     * @param value - The ID number of the Application that this enrollment represents. You can fetch information about this Application object by specifying `App` in the "Include" parameter for your request.
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return Determines whether the app enrollment is in use
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * @param value - Determines whether the app enrollment is in use
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * @return Created date
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - Created date
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return Created user ID
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - Created user ID
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return Last modified date
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - Last modified date
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return Last user ID to modify
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - Last user ID to modify
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * @return Stores schedule information for the application enrollment see https://en.wikipedia.org/wiki/Cron
     */
    public String getCronSettings() { return this.cronSettings; }
    /**
     * @param value - Stores schedule information for the application enrollment see https://en.wikipedia.org/wiki/Cron
     */
    public void setCronSettings(String value) { this.cronSettings = value; }
    /**
     * @return Flag indicating if the Sync process should be ran on the specified schedule
     */
    public Boolean getSyncScheduleIsActive() { return this.syncScheduleIsActive; }
    /**
     * @param value - Flag indicating if the Sync process should be ran on the specified schedule
     */
    public void setSyncScheduleIsActive(Boolean value) { this.syncScheduleIsActive = value; }
    /**
     * @return The Application to which this AppEnrollment belongs. Contains general name, description, logo, and other metadata about this application. To retrieve this object, specify `App` in the "Include" parameter for your query.
     */
    public ApplicationModel getApp() { return this.app; }
    /**
     * @param value - The Application to which this AppEnrollment belongs. Contains general name, description, logo, and other metadata about this application. To retrieve this object, specify `App` in the "Include" parameter for your query.
     */
    public void setApp(ApplicationModel value) { this.app = value; }
    /**
     * @return All definitions attached to this app. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * @param value - All definitions attached to this app. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * @return All values attached to this app. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * @param value - All values attached to this app. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * @return Data about the last sync attached to this app enrollment To retrieve this collection, specify `LastSync` in the "Include" parameter for your query.
     */
    public SyncRequestModel getLastSync() { return this.lastSync; }
    /**
     * @param value - Data about the last sync attached to this app enrollment To retrieve this collection, specify `LastSync` in the "Include" parameter for your query.
     */
    public void setLastSync(SyncRequestModel value) { this.lastSync = value; }
    /**
     * @return Optional data necessary to create an app enrollment for a supported connector. Only enter relevant fields for the given connector.
     */
    public ConnectorInfoModel getConnectorInfo() { return this.connectorInfo; }
    /**
     * @param value - Optional data necessary to create an app enrollment for a supported connector. Only enter relevant fields for the given connector.
     */
    public void setConnectorInfo(ConnectorInfoModel value) { this.connectorInfo = value; }
};
