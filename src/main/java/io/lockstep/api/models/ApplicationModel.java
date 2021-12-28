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
    public Date getcreated() { return this.created; }
    /**
     * The date this application was created
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The date this application was last modified
     */
    public Date getmodified() { return this.modified; }
    /**
     * The date this application was last modified
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * Flag indicating if the application is active.
     */
    public Boolean getisActive() { return this.isActive; }
    /**
     * Flag indicating if the application is active.
     */
    public void setisActive(Boolean value) { this.isActive = value; }
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
