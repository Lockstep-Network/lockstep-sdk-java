
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    private @NotNull String appId;
    private @Nullable String name;
    private @Nullable String description;
    private @NotNull String appType;
    private @NotNull String ownerId;
    private @Nullable String projectUrl;
    private @Nullable String iconUrl;
    private @Nullable String priceTerms;
    private @Nullable String createdUserId;
    private @Nullable String modifiedUserId;
    private @Nullable String created;
    private @Nullable String modified;
    private @NotNull Boolean isActive;
    private @Nullable String wikiURL;
    private @NotNull String groupKey;
    private @Nullable NoteModel[] notes;
    private @Nullable AttachmentModel[] attachments;
    private @Nullable CustomFieldDefinitionModel[] customFieldDefinitions;
    private @Nullable CustomFieldValueModel[] customFieldValues;

    /**
     * A unique code identifying this application
     *
     * @return The field appId
     */
    public @NotNull String getAppId() { return this.appId; }
    /**
     * A unique code identifying this application
     *
     * @param value The new value for appId
     */
    public void setAppId(@NotNull String value) { this.appId = value; }
    /**
     * The name of this application
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of this application
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * Brief summary of this application shown as a subtitle
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * Brief summary of this application shown as a subtitle
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * Tag for what type of app this is
     *
     * @return The field appType
     */
    public @NotNull String getAppType() { return this.appType; }
    /**
     * Tag for what type of app this is
     *
     * @param value The new value for appType
     */
    public void setAppType(@NotNull String value) { this.appType = value; }
    /**
     * The ID of the owner
     *
     * @return The field ownerId
     */
    public @NotNull String getOwnerId() { return this.ownerId; }
    /**
     * The ID of the owner
     *
     * @param value The new value for ownerId
     */
    public void setOwnerId(@NotNull String value) { this.ownerId = value; }
    /**
     * The URL to visit for more information about this application
     *
     * @return The field projectUrl
     */
    public @Nullable String getProjectUrl() { return this.projectUrl; }
    /**
     * The URL to visit for more information about this application
     *
     * @param value The new value for projectUrl
     */
    public void setProjectUrl(@Nullable String value) { this.projectUrl = value; }
    /**
     * The URL for the icon for this application
     *
     * @return The field iconUrl
     */
    public @Nullable String getIconUrl() { return this.iconUrl; }
    /**
     * The URL for the icon for this application
     *
     * @param value The new value for iconUrl
     */
    public void setIconUrl(@Nullable String value) { this.iconUrl = value; }
    /**
     * The description of the price for this application
     *
     * @return The field priceTerms
     */
    public @Nullable String getPriceTerms() { return this.priceTerms; }
    /**
     * The description of the price for this application
     *
     * @param value The new value for priceTerms
     */
    public void setPriceTerms(@Nullable String value) { this.priceTerms = value; }
    /**
     * The ID of the user who created this application
     *
     * @return The field createdUserId
     */
    public @Nullable String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this application
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@Nullable String value) { this.createdUserId = value; }
    /**
     * The ID of the user who last modified this application
     *
     * @return The field modifiedUserId
     */
    public @Nullable String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this application
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@Nullable String value) { this.modifiedUserId = value; }
    /**
     * The date this application was created
     *
     * @return The field created
     */
    public @Nullable String getCreated() { return this.created; }
    /**
     * The date this application was created
     *
     * @param value The new value for created
     */
    public void setCreated(@Nullable String value) { this.created = value; }
    /**
     * The date this application was last modified
     *
     * @return The field modified
     */
    public @Nullable String getModified() { return this.modified; }
    /**
     * The date this application was last modified
     *
     * @param value The new value for modified
     */
    public void setModified(@Nullable String value) { this.modified = value; }
    /**
     * Flag indicating if the application is active.
     *
     * @return The field isActive
     */
    public @NotNull Boolean getIsActive() { return this.isActive; }
    /**
     * Flag indicating if the application is active.
     *
     * @param value The new value for isActive
     */
    public void setIsActive(@NotNull Boolean value) { this.isActive = value; }
    /**
     * URL to the Wiki for the Application
     *
     * @return The field wikiURL
     */
    public @Nullable String getWikiURL() { return this.wikiURL; }
    /**
     * URL to the Wiki for the Application
     *
     * @param value The new value for wikiURL
     */
    public void setWikiURL(@Nullable String value) { this.wikiURL = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `Application` and the `ObjectKey` set to the `ApplicationId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field notes
     */
    public @Nullable NoteModel[] getNotes() { return this.notes; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `Application` and the `ObjectKey` set to the `ApplicationId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable NoteModel[] value) { this.notes = value; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `Application` and the `ObjectKey` set to the `ApplicationId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field attachments
     */
    public @Nullable AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `Application` and the `ObjectKey` set to the `ApplicationId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for attachments
     */
    public void setAttachments(@Nullable AttachmentModel[] value) { this.attachments = value; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldDefinitions` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Application` and the `ObjectKey` set to the `ApplicationId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field customFieldDefinitions
     */
    public @Nullable CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldDefinitions` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Application` and the `ObjectKey` set to the `ApplicationId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for customFieldDefinitions
     */
    public void setCustomFieldDefinitions(@Nullable CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldValues` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Application` and the `ObjectKey` set to the `ApplicationId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field customFieldValues
     */
    public @Nullable CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldValues` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Application` and the `ObjectKey` set to the `ApplicationId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(@Nullable CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
