
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
    private Date created;
    private Date modified;
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
     * @return a {@link java.lang.String} object.
     */
    public String getAppId() { return this.appId; }
    /**
     * A unique code identifying this application
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * The name of this application
     *
     * @return a {@link java.lang.String} object.
     */
    public String getName() { return this.name; }
    /**
     * The name of this application
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setName(String value) { this.name = value; }
    /**
     * Brief summary of this application shown as a subtitle
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDescription() { return this.description; }
    /**
     * Brief summary of this application shown as a subtitle
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * Tag for what type of app this is
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppType() { return this.appType; }
    /**
     * Tag for what type of app this is
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppType(String value) { this.appType = value; }
    /**
     * The ID of the owner
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOwnerId() { return this.ownerId; }
    /**
     * The ID of the owner
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setOwnerId(String value) { this.ownerId = value; }
    /**
     * The URL to visit for more information about this application
     *
     * @return a {@link java.lang.String} object.
     */
    public String getProjectUrl() { return this.projectUrl; }
    /**
     * The URL to visit for more information about this application
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setProjectUrl(String value) { this.projectUrl = value; }
    /**
     * The URL for the icon for this application
     *
     * @return a {@link java.lang.String} object.
     */
    public String getIconUrl() { return this.iconUrl; }
    /**
     * The URL for the icon for this application
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setIconUrl(String value) { this.iconUrl = value; }
    /**
     * The description of the price for this application
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPriceTerms() { return this.priceTerms; }
    /**
     * The description of the price for this application
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setPriceTerms(String value) { this.priceTerms = value; }
    /**
     * The ID of the user who created this application
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this application
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The ID of the user who last modified this application
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this application
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The date this application was created
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getCreated() { return this.created; }
    /**
     * The date this application was created
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The date this application was last modified
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getModified() { return this.modified; }
    /**
     * The date this application was last modified
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * Flag indicating if the application is active.
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * Flag indicating if the application is active.
     *
     * @param value a {@link java.lang.Boolean} object.
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * URL to the Wiki for the Application
     *
     * @return a {@link java.lang.String} object.
     */
    public String getWikiURL() { return this.wikiURL; }
    /**
     * URL to the Wiki for the Application
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setWikiURL(String value) { this.wikiURL = value; }
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
     * All notes attached to this app.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this app.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this app.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to this app.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
