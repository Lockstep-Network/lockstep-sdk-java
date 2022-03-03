
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A note is a customizable text string that can be attached to various account attributes
 * within Lockstep. You can use notes for internal communication, correspondence with
 * clients, or personal reminders. The Note Model represents a note and a number of
 * different metadata attributes related to the creation, storage, and ownership of the note.
 *
 * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
 */
public class NoteModel
{
    private @NotNull String noteId;
    private @NotNull String groupKey;
    private @Nullable String tableKey;
    private @NotNull String objectKey;
    private @Nullable String noteText;
    private @Nullable String noteType;
    private @NotNull Boolean isArchived;
    private @Nullable String created;
    private @NotNull String createdUserId;
    private @Nullable String createdUserName;
    private @Nullable String appEnrollmentId;
    private @Nullable String recipientName;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field noteId
     */
    public @NotNull String getNoteId() { return this.noteId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for noteId
     */
    public void setNoteId(@NotNull String value) { this.noteId = value; }
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
     * The name of the table the note is associated with
     *
     * @return The field tableKey
     */
    public @Nullable String getTableKey() { return this.tableKey; }
    /**
     * The name of the table the note is associated with
     *
     * @param value The new value for tableKey
     */
    public void setTableKey(@Nullable String value) { this.tableKey = value; }
    /**
     * The ID of the object the note is associated with
     *
     * @return The field objectKey
     */
    public @NotNull String getObjectKey() { return this.objectKey; }
    /**
     * The ID of the object the note is associated with
     *
     * @param value The new value for objectKey
     */
    public void setObjectKey(@NotNull String value) { this.objectKey = value; }
    /**
     * The text of the note
     *
     * @return The field noteText
     */
    public @Nullable String getNoteText() { return this.noteText; }
    /**
     * The text of the note
     *
     * @param value The new value for noteText
     */
    public void setNoteText(@Nullable String value) { this.noteText = value; }
    /**
     * The type of the note
     *
     * @return The field noteType
     */
    public @Nullable String getNoteType() { return this.noteType; }
    /**
     * The type of the note
     *
     * @param value The new value for noteType
     */
    public void setNoteType(@Nullable String value) { this.noteType = value; }
    /**
     * Flag indicating if the note has been archived
     *
     * @return The field isArchived
     */
    public @NotNull Boolean getIsArchived() { return this.isArchived; }
    /**
     * Flag indicating if the note has been archived
     *
     * @param value The new value for isArchived
     */
    public void setIsArchived(@NotNull Boolean value) { this.isArchived = value; }
    /**
     * The date the note was created
     *
     * @return The field created
     */
    public @Nullable String getCreated() { return this.created; }
    /**
     * The date the note was created
     *
     * @param value The new value for created
     */
    public void setCreated(@Nullable String value) { this.created = value; }
    /**
     * The ID of the user who created the note
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the note
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The name of the user who created the note
     *
     * @return The field createdUserName
     */
    public @Nullable String getCreatedUserName() { return this.createdUserName; }
    /**
     * The name of the user who created the note
     *
     * @param value The new value for createdUserName
     */
    public void setCreatedUserName(@Nullable String value) { this.createdUserName = value; }
    /**
     * The AppEnrollmentId of the application that imported this record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @return The field appEnrollmentId
     */
    public @Nullable String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application that imported this record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@Nullable String value) { this.appEnrollmentId = value; }
    /**
     * The person to whom this note is intended for.
     *
     * @return The field recipientName
     */
    public @Nullable String getRecipientName() { return this.recipientName; }
    /**
     * The person to whom this note is intended for.
     *
     * @param value The new value for recipientName
     */
    public void setRecipientName(@Nullable String value) { this.recipientName = value; }
};
