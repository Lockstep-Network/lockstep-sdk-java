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
     */
    public String getAppId() { return this.appId; }
    /**
     * A unique code identifying this application
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * The name of this application
     */
    public String getName() { return this.name; }
    /**
     * The name of this application
     */
    public void setName(String value) { this.name = value; }
    /**
     * Brief summary of this application shown as a subtitle
     */
    public String getDescription() { return this.description; }
    /**
     * Brief summary of this application shown as a subtitle
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * Tag for what type of app this is
     */
    public String getAppType() { return this.appType; }
    /**
     * Tag for what type of app this is
     */
    public void setAppType(String value) { this.appType = value; }
    /**
     * The ID of the owner
     */
    public String getOwnerId() { return this.ownerId; }
    /**
     * The ID of the owner
     */
    public void setOwnerId(String value) { this.ownerId = value; }
    /**
     * The URL to visit for more information about this application
     */
    public String getProjectUrl() { return this.projectUrl; }
    /**
     * The URL to visit for more information about this application
     */
    public void setProjectUrl(String value) { this.projectUrl = value; }
    /**
     * The URL for the icon for this application
     */
    public String getIconUrl() { return this.iconUrl; }
    /**
     * The URL for the icon for this application
     */
    public void setIconUrl(String value) { this.iconUrl = value; }
    /**
     * The description of the price for this application
     */
    public String getPriceTerms() { return this.priceTerms; }
    /**
     * The description of the price for this application
     */
    public void setPriceTerms(String value) { this.priceTerms = value; }
    /**
     * The ID of the user who created this application
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this application
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The ID of the user who last modified this application
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this application
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * The date this application was created
     */
    public Date getCreated() { return this.created; }
    /**
     * The date this application was created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The date this application was last modified
     */
    public Date getModified() { return this.modified; }
    /**
     * The date this application was last modified
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * Flag indicating if the application is active.
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * Flag indicating if the application is active.
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * URL to the Wiki for the Application
     */
    public String getWikiURL() { return this.wikiURL; }
    /**
     * URL to the Wiki for the Application
     */
    public void setWikiURL(String value) { this.wikiURL = value; }
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
     * All notes attached to this app.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this app.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this app.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to this app.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to the application.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
