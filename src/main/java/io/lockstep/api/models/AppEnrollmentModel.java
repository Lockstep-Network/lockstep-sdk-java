
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
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The ID number of the Application that this enrollment represents.  You can fetch information
     * about this Application object by specifying `App` in the "Include" parameter for your request.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppId() { return this.appId; }
    /**
     * The ID number of the Application that this enrollment represents.  You can fetch information
     * about this Application object by specifying `App` in the "Include" parameter for your request.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * Determines whether the app enrollment is in use
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * Determines whether the app enrollment is in use
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * Created date
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getCreated() { return this.created; }
    /**
     * Created date
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * Created user ID
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * Created user ID
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Last modified date
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getModified() { return this.modified; }
    /**
     * Last modified date
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * Last user ID to modify
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * Last user ID to modify
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * Stores schedule information for the application enrollment
     * see https://en.wikipedia.org/wiki/Cron
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCronSettings() { return this.cronSettings; }
    /**
     * Stores schedule information for the application enrollment
     * see https://en.wikipedia.org/wiki/Cron
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCronSettings(String value) { this.cronSettings = value; }
    /**
     * Flag indicating if the Sync process should be ran on the specified schedule
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getSyncScheduleIsActive() { return this.syncScheduleIsActive; }
    /**
     * Flag indicating if the Sync process should be ran on the specified schedule
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setSyncScheduleIsActive(Boolean value) { this.syncScheduleIsActive = value; }
    /**
     * The Application to which this AppEnrollment belongs.  Contains general name, description,
     * logo, and other metadata about this application.
     *
     * To retrieve this object, specify `App` in the "Include" parameter for your query.
     *
     * @return a {@link io.lockstep.api.models.ApplicationModel} object.
     */
    public ApplicationModel getApp() { return this.app; }
    /**
     * The Application to which this AppEnrollment belongs.  Contains general name, description,
     * logo, and other metadata about this application.
     *
     * To retrieve this object, specify `App` in the "Include" parameter for your query.
     *
     * @param value a {@link io.lockstep.api.models.ApplicationModel} object.
     */
    public void setApp(ApplicationModel value) { this.app = value; }
    /**
     * All definitions attached to this app.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this app.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this app.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this app.
     *
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * Data about the last sync attached to this app enrollment
     *
     * To retrieve this collection, specify `LastSync` in the "Include" parameter for your query.
     *
     * @return a {@link io.lockstep.api.models.SyncRequestModel} object.
     */
    public SyncRequestModel getLastSync() { return this.lastSync; }
    /**
     * Data about the last sync attached to this app enrollment
     *
     * To retrieve this collection, specify `LastSync` in the "Include" parameter for your query.
     *
     * @param value a {@link io.lockstep.api.models.SyncRequestModel} object.
     */
    public void setLastSync(SyncRequestModel value) { this.lastSync = value; }
    /**
     * Optional data necessary to create an app enrollment for a supported connector.
     * Only enter relevant fields for the given connector.
     *
     * @return a {@link io.lockstep.api.models.ConnectorInfoModel} object.
     */
    public ConnectorInfoModel getConnectorInfo() { return this.connectorInfo; }
    /**
     * Optional data necessary to create an app enrollment for a supported connector.
     * Only enter relevant fields for the given connector.
     *
     * @param value a {@link io.lockstep.api.models.ConnectorInfoModel} object.
     */
    public void setConnectorInfo(ConnectorInfoModel value) { this.connectorInfo = value; }
};
