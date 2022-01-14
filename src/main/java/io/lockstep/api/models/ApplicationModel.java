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
     * @return A unique code identifying this application
     */
    public String getAppId() { return this.appId; }
    /**
     * @param value - A unique code identifying this application
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * @return The name of this application
     */
    public String getName() { return this.name; }
    /**
     * @param value - The name of this application
     */
    public void setName(String value) { this.name = value; }
    /**
     * @return Brief summary of this application shown as a subtitle
     */
    public String getDescription() { return this.description; }
    /**
     * @param value - Brief summary of this application shown as a subtitle
     */
    public void setDescription(String value) { this.description = value; }
    /**
     * @return Tag for what type of app this is
     */
    public String getAppType() { return this.appType; }
    /**
     * @param value - Tag for what type of app this is
     */
    public void setAppType(String value) { this.appType = value; }
    /**
     * @return The ID of the owner
     */
    public String getOwnerId() { return this.ownerId; }
    /**
     * @param value - The ID of the owner
     */
    public void setOwnerId(String value) { this.ownerId = value; }
    /**
     * @return The URL to visit for more information about this application
     */
    public String getProjectUrl() { return this.projectUrl; }
    /**
     * @param value - The URL to visit for more information about this application
     */
    public void setProjectUrl(String value) { this.projectUrl = value; }
    /**
     * @return The URL for the icon for this application
     */
    public String getIconUrl() { return this.iconUrl; }
    /**
     * @param value - The URL for the icon for this application
     */
    public void setIconUrl(String value) { this.iconUrl = value; }
    /**
     * @return The description of the price for this application
     */
    public String getPriceTerms() { return this.priceTerms; }
    /**
     * @param value - The description of the price for this application
     */
    public void setPriceTerms(String value) { this.priceTerms = value; }
    /**
     * @return The ID of the user who created this application
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - The ID of the user who created this application
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return The ID of the user who last modified this application
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - The ID of the user who last modified this application
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * @return The date this application was created
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - The date this application was created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return The date this application was last modified
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - The date this application was last modified
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return Flag indicating if the application is active.
     */
    public Boolean getIsActive() { return this.isActive; }
    /**
     * @param value - Flag indicating if the application is active.
     */
    public void setIsActive(Boolean value) { this.isActive = value; }
    /**
     * @return URL to the Wiki for the Application
     */
    public String getWikiURL() { return this.wikiURL; }
    /**
     * @param value - URL to the Wiki for the Application
     */
    public void setWikiURL(String value) { this.wikiURL = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return All notes attached to this app. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * @param value - All notes attached to this app. To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * @return All attachments attached to this app. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * @param value - All attachments attached to this app. To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * @return All definitions attached to the application. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * @param value - All definitions attached to the application. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * @return All values attached to the application. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * @param value - All values attached to the application. To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
