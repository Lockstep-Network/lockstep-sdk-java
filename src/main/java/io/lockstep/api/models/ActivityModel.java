
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
 * An Activity contains information about work being done on a specific accounting task.
 * You can use Activities to track information about who has been assigned a specific task,
 * the current status of the task, the name and description given for the particular task,
 * the priority of the task, and any amounts collected, paid, or credited for the task.
 */
public class ActivityModel
{
    private @NotNull String activityId;
    private @NotNull String groupKey;
    private @NotNull String companyId;
    private @Nullable String activityTypeCode;
    private @NotNull String activityName;
    private @Nullable String activityDescription;
    private @Nullable String activityStatus;
    private @NotNull Boolean isOpen;
    private @Nullable String priority;
    private @Nullable String userAssignedTo;
    private @Nullable String dateAssigned;
    private @Nullable String dateClosed;
    private @Nullable String snoozeUntilDate;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable Double amountCollected;
    private @Nullable Double amountPaid;
    private @Nullable Double creditGiven;
    private @NotNull Boolean isUnread;
    private @NotNull Boolean isArchived;
    private @Nullable CompanyModel company;
    private @Nullable String userAssignedToName;
    private @Nullable AttachmentModel[] attachments;
    private @Nullable NoteModel[] notes;
    private @Nullable CustomFieldDefinitionModel[] customFieldDefinitions;
    private @Nullable CustomFieldValueModel[] customFieldValues;
    private @Nullable ActivityXRefModel[] references;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field activityId
     */
    public @NotNull String getActivityId() { return this.activityId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for activityId
     */
    public void setActivityId(@NotNull String value) { this.activityId = value; }
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
     * The ID of the company to which this activity belongs.
     *
     * @return The field companyId
     */
    public @NotNull String getCompanyId() { return this.companyId; }
    /**
     * The ID of the company to which this activity belongs.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(@NotNull String value) { this.companyId = value; }
    /**
     * The type code of the activity
     *
     * @return The field activityTypeCode
     */
    public @Nullable String getActivityTypeCode() { return this.activityTypeCode; }
    /**
     * The type code of the activity
     *
     * @param value The new value for activityTypeCode
     */
    public void setActivityTypeCode(@Nullable String value) { this.activityTypeCode = value; }
    /**
     * The name of the activity.  The name is a short name provided by the
     * person who created the activity that can be displayed in a list.
     *
     * @return The field activityName
     */
    public @NotNull String getActivityName() { return this.activityName; }
    /**
     * The name of the activity.  The name is a short name provided by the
     * person who created the activity that can be displayed in a list.
     *
     * @param value The new value for activityName
     */
    public void setActivityName(@NotNull String value) { this.activityName = value; }
    /**
     * A description of the activity.  This field contains more detailed text about the
     * activity and can be lengthy.
     *
     * @return The field activityDescription
     */
    public @Nullable String getActivityDescription() { return this.activityDescription; }
    /**
     * A description of the activity.  This field contains more detailed text about the
     * activity and can be lengthy.
     *
     * @param value The new value for activityDescription
     */
    public void setActivityDescription(@Nullable String value) { this.activityDescription = value; }
    /**
     * The status of the activity.
     *
     * @return The field activityStatus
     */
    public @Nullable String getActivityStatus() { return this.activityStatus; }
    /**
     * The status of the activity.
     *
     * @param value The new value for activityStatus
     */
    public void setActivityStatus(@Nullable String value) { this.activityStatus = value; }
    /**
     * True if this activity is currently "open", which indicates that the activity is
     * currently in progress.
     *
     * @return The field isOpen
     */
    public @NotNull Boolean getIsOpen() { return this.isOpen; }
    /**
     * True if this activity is currently "open", which indicates that the activity is
     * currently in progress.
     *
     * @param value The new value for isOpen
     */
    public void setIsOpen(@NotNull Boolean value) { this.isOpen = value; }
    /**
     * The priority of the activity.
     *
     * @return The field priority
     */
    public @Nullable String getPriority() { return this.priority; }
    /**
     * The priority of the activity.
     *
     * @param value The new value for priority
     */
    public void setPriority(@Nullable String value) { this.priority = value; }
    /**
     * The ID of the user the activity is assigned to.
     *
     * @return The field userAssignedTo
     */
    public @Nullable String getUserAssignedTo() { return this.userAssignedTo; }
    /**
     * The ID of the user the activity is assigned to.
     *
     * @param value The new value for userAssignedTo
     */
    public void setUserAssignedTo(@Nullable String value) { this.userAssignedTo = value; }
    /**
     * The date the activity was assigned.
     *
     * @return The field dateAssigned
     */
    public @Nullable String getDateAssigned() { return this.dateAssigned; }
    /**
     * The date the activity was assigned.
     *
     * @param value The new value for dateAssigned
     */
    public void setDateAssigned(@Nullable String value) { this.dateAssigned = value; }
    /**
     * The date the activity was closed.
     *
     * @return The field dateClosed
     */
    public @Nullable String getDateClosed() { return this.dateClosed; }
    /**
     * The date the activity was closed.
     *
     * @param value The new value for dateClosed
     */
    public void setDateClosed(@Nullable String value) { this.dateClosed = value; }
    /**
     * If this activity has been "snoozed", this field will be non-null and will contain
     * the date when the activity will be displayed.  Until that date arrives, the activity
     * will remain hidden.
     *
     * @return The field snoozeUntilDate
     */
    public @Nullable String getSnoozeUntilDate() { return this.snoozeUntilDate; }
    /**
     * If this activity has been "snoozed", this field will be non-null and will contain
     * the date when the activity will be displayed.  Until that date arrives, the activity
     * will remain hidden.
     *
     * @param value The new value for snoozeUntilDate
     */
    public void setSnoozeUntilDate(@Nullable String value) { this.snoozeUntilDate = value; }
    /**
     * The date on which this activity was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date on which this activity was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID of the user who created this activity.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this activity.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date on which this activity was last modified.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date on which this activity was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID of the user who last modified this activity.
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this activity.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
    /**
     * Amount collected (if any) for the activity.
     *
     * @return The field amountCollected
     */
    public @Nullable Double getAmountCollected() { return this.amountCollected; }
    /**
     * Amount collected (if any) for the activity.
     *
     * @param value The new value for amountCollected
     */
    public void setAmountCollected(@Nullable Double value) { this.amountCollected = value; }
    /**
     * Amount paid (if any) for the activity.
     *
     * @return The field amountPaid
     */
    public @Nullable Double getAmountPaid() { return this.amountPaid; }
    /**
     * Amount paid (if any) for the activity.
     *
     * @param value The new value for amountPaid
     */
    public void setAmountPaid(@Nullable Double value) { this.amountPaid = value; }
    /**
     * Credit given (if any) for the activity.
     *
     * @return The field creditGiven
     */
    public @Nullable Double getCreditGiven() { return this.creditGiven; }
    /**
     * Credit given (if any) for the activity.
     *
     * @param value The new value for creditGiven
     */
    public void setCreditGiven(@Nullable Double value) { this.creditGiven = value; }
    /**
     * True if this activity is to be shown in an "unread" state.  When an activity
     * is read by a person it is assigned to, this flag is set to false.
     *
     * @return The field isUnread
     */
    public @NotNull Boolean getIsUnread() { return this.isUnread; }
    /**
     * True if this activity is to be shown in an "unread" state.  When an activity
     * is read by a person it is assigned to, this flag is set to false.
     *
     * @param value The new value for isUnread
     */
    public void setIsUnread(@NotNull Boolean value) { this.isUnread = value; }
    /**
     * Activities may be archived when they should be hidden from the user.  When
     * this flag is true, this activity should be hidden.
     *
     * @return The field isArchived
     */
    public @NotNull Boolean getIsArchived() { return this.isArchived; }
    /**
     * Activities may be archived when they should be hidden from the user.  When
     * this flag is true, this activity should be hidden.
     *
     * @param value The new value for isArchived
     */
    public void setIsArchived(@NotNull Boolean value) { this.isArchived = value; }
    /**
     * The company associated with the activity
     *
     * To retrieve this collection, specify `Company` in the "Include" parameter for your query.
     *
     * @return The field company
     */
    public @Nullable CompanyModel getCompany() { return this.company; }
    /**
     * The company associated with the activity
     *
     * To retrieve this collection, specify `Company` in the "Include" parameter for your query.
     *
     * @param value The new value for company
     */
    public void setCompany(@Nullable CompanyModel value) { this.company = value; }
    /**
     * The name of the user the activity is assigned to
     *
     * @return The field userAssignedToName
     */
    public @Nullable String getUserAssignedToName() { return this.userAssignedToName; }
    /**
     * The name of the user the activity is assigned to
     *
     * @param value The new value for userAssignedToName
     */
    public void setUserAssignedToName(@Nullable String value) { this.userAssignedToName = value; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `Activity` and the `ObjectKey` set to the `ActivityId` for this record.  For
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
     * endpoint with the `TableKey` to `Activity` and the `ObjectKey` set to the `ActivityId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for attachments
     */
    public void setAttachments(@Nullable AttachmentModel[] value) { this.attachments = value; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `Activity` and the `ObjectKey` set to the `ActivityId` for this record.  For
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
     * endpoint with the `TableKey` to `Activity` and the `ObjectKey` set to the `ActivityId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable NoteModel[] value) { this.notes = value; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldDefinitions` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Activity` and the `ObjectKey` set to the `ActivityId` for this record.  For
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
     * endpoint with the `TableKey` to `Activity` and the `ObjectKey` set to the `ActivityId` for this record.  For
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
     * endpoint with the `TableKey` to `Activity` and the `ObjectKey` set to the `ActivityId` for this record.  For
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
     * endpoint with the `TableKey` to `Activity` and the `ObjectKey` set to the `ActivityId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(@Nullable CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * All references attached to this applied activity.
     *
     * To retrieve this collection, specify `References` in the "Include" parameter for your query.
     *
     * @return The field references
     */
    public @Nullable ActivityXRefModel[] getReferences() { return this.references; }
    /**
     * All references attached to this applied activity.
     *
     * To retrieve this collection, specify `References` in the "Include" parameter for your query.
     *
     * @param value The new value for references
     */
    public void setReferences(@Nullable ActivityXRefModel[] value) { this.references = value; }
};
