
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
 * @version    2022.4
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


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
    private String noteId;
    private String groupKey;
    private String tableKey;
    private String objectKey;
    private String noteText;
    private String noteType;
    private Boolean isArchived;
    private String created;
    private String createdUserId;
    private String createdUserName;
    private String appEnrollmentId;
    private String recipientName;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field noteId
     */
    public String getNoteId() { return this.noteId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for noteId
     */
    public void setNoteId(String value) { this.noteId = value; }
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
     * The name of the table the note is associated with
     *
     * @return The field tableKey
     */
    public String getTableKey() { return this.tableKey; }
    /**
     * The name of the table the note is associated with
     *
     * @param value The new value for tableKey
     */
    public void setTableKey(String value) { this.tableKey = value; }
    /**
     * The ID of the object the note is associated with
     *
     * @return The field objectKey
     */
    public String getObjectKey() { return this.objectKey; }
    /**
     * The ID of the object the note is associated with
     *
     * @param value The new value for objectKey
     */
    public void setObjectKey(String value) { this.objectKey = value; }
    /**
     * The text of the note
     *
     * @return The field noteText
     */
    public String getNoteText() { return this.noteText; }
    /**
     * The text of the note
     *
     * @param value The new value for noteText
     */
    public void setNoteText(String value) { this.noteText = value; }
    /**
     * The type of the note
     *
     * @return The field noteType
     */
    public String getNoteType() { return this.noteType; }
    /**
     * The type of the note
     *
     * @param value The new value for noteType
     */
    public void setNoteType(String value) { this.noteType = value; }
    /**
     * Flag indicating if the note has been archived
     *
     * @return The field isArchived
     */
    public Boolean getIsArchived() { return this.isArchived; }
    /**
     * Flag indicating if the note has been archived
     *
     * @param value The new value for isArchived
     */
    public void setIsArchived(Boolean value) { this.isArchived = value; }
    /**
     * The date the note was created
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * The date the note was created
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * The ID of the user who created the note
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the note
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The name of the user who created the note
     *
     * @return The field createdUserName
     */
    public String getCreatedUserName() { return this.createdUserName; }
    /**
     * The name of the user who created the note
     *
     * @param value The new value for createdUserName
     */
    public void setCreatedUserName(String value) { this.createdUserName = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The person to whom this note is intended for.
     *
     * @return The field recipientName
     */
    public String getRecipientName() { return this.recipientName; }
    /**
     * The person to whom this note is intended for.
     *
     * @param value The new value for recipientName
     */
    public void setRecipientName(String value) { this.recipientName = value; }
};
