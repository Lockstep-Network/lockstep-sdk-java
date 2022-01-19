
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
 * An Application represents a feature available to customers within the Lockstep Platform.  You can create
 * Applications by working with your Lockstep business development manager and publish them on the platform
 * so that customers can browse and find your Application on the Lockstep Platform Marketplace.  When a
 * customer adds an Application to their account, they obtain an AppEnrollment which represents that customer's
 * instance of this Application.  The customer-specific AppEnrollment contains a customer's configuration data
 * for the Application, which is not customer-specific.
 *
 * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
 * --swaggerCategory:Platform
 */
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
    private Boolean isActive;
    private String wikiURL;
    private String groupKey;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * A unique code identifying this application
     *
     * @return The field appId
     */
    public String getAppId() { return this.appId; }
    /**
     * A unique code identifying this application
     *
     * @param value The new value for appId
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * The name of this application
     *
     * @return The field name
     */
    public String getName() { return this.name; }
    /**
     * The name of this application
     *
     * @param value The new value for name
     */
    public void setName(String value) { this.name = value; }
    /**
     * Brief summary of this application shown as a subtitle
     *
     * @return The field description
     */
    public String getDescription() { return this.description; }
    /**
     * Brief summary of this application shown as a subtitle
     *
     * @param value The new value for description
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * Tag for what type of app this is
     *
     * @return The field appType
     */
    public String getAppType() { return this.appType; }
    /**
     * Tag for what type of app this is
     *
     * @param value The new value for appType
     */
    public void setAppType(String value) { this.appType = value; }
    /**
     * The ID of the owner
     *
     * @return The field ownerId
     */
    public String getOwnerId() { return this.ownerId; }
    /**
     * The ID of the owner
     *
     * @param value The new value for ownerId
     */
    public void setOwnerId(String value) { this.ownerId = value; }
    /**
     * The URL to visit for more information about this application
     *
     * @return The field projectUrl
     */
    public String getProjectUrl() { return this.projectUrl; }
    /**
     * The URL to visit for more information about this application
     *
     * @param value The new value for projectUrl
     */
    public void setProjectUrl(String value) { this.projectUrl = value; }
    /**
     * The URL for the icon for this application
     *
     * @return The field iconUrl
     */
    public String getIconUrl() { return this.iconUrl; }
    /**
     * The URL for the icon for this application
     *
     * @param value The new value for iconUrl
     */
    public void setIconUrl(String value) { this.iconUrl = value; }
    /**
     * The description of the price for this application
     *
     * @return The field priceTerms
     */
    public String getPriceTerms() { return this.priceTerms; }
    /**
     * The description of the price for this application
     *
     * @param value The new value for priceTerms
     */
    public void setPriceTerms(String value) { this.priceTerms = value; }
    /**
     * The ID of the user who created this application
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this application
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The ID of the user who last modified this application
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this application
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The date this application was created
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * The date this application was created
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The date this application was last modified
     *
     * @return The field modified
     */
    public String getModified() { return this.modified; }
    /**
     * The date this application was last modified
     *
     * @param value The new value for modified
     */
    public void setModified(String value) { this.modified = value; }
    /**
     * Flag indicating if the application is active.
     *
     * @return The field isActive
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * Flag indicating if the application is active.
     *
     * @param value The new value for isActive
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * URL to the Wiki for the Application
     *
     * @return The field wikiURL
     */
    public String getWikiURL() { return this.wikiURL; }
    /**
     * URL to the Wiki for the Application
     *
     * @param value The new value for wikiURL
     */
    public void setWikiURL(String value) { this.wikiURL = value; }
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
     * All notes attached to this app.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return The field notes
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this app.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value The new value for notes
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this app.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return The field attachments
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to this app.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value The new value for attachments
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return The field customFieldDefinitions
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value The new value for customFieldDefinitions
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return The field customFieldValues
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
