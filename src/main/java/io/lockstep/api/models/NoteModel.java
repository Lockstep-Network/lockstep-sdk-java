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

public class NoteModel
{
    private String noteId;
    private String groupKey;
    private String tableKey;
    private String objectKey;
    private String noteText;
    private String noteType;
    private Boolean isArchived;
    private Date created;
    private String createdUserId;
    private String createdUserName;
    private String appEnrollmentId;

    /**
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public String getNoteId() { return this.noteId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public void setNoteId(String value) { this.noteId = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The name of the table the note is associated with
     */
    public String getTableKey() { return this.tableKey; }
    /**
     * @param value - The name of the table the note is associated with
     */
    public void setTableKey(String value) { this.tableKey = value; }
    /**
     * @return The ID of the object the note is associated with
     */
    public String getObjectKey() { return this.objectKey; }
    /**
     * @param value - The ID of the object the note is associated with
     */
    public void setObjectKey(String value) { this.objectKey = value; }
    /**
     * @return The text of the note
     */
    public String getNoteText() { return this.noteText; }
    /**
     * @param value - The text of the note
     */
    public void setNoteText(String value) { this.noteText = value; }
    /**
     * @return The type of the note
     */
    public String getNoteType() { return this.noteType; }
    /**
     * @param value - The type of the note
     */
    public void setNoteType(String value) { this.noteType = value; }
    /**
     * @return Flag indicating if the note has been archived
     */
    public Boolean getIsArchived() { return this.isArchived; }
    /**
     * @param value - Flag indicating if the note has been archived
     */
    public void setIsArchived(Boolean value) { this.isArchived = value; }
    /**
     * @return The date the note was created
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - The date the note was created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return The ID of the user who created the note
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - The ID of the user who created the note
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return The name of the user who created the note
     */
    public String getCreatedUserName() { return this.createdUserName; }
    /**
     * @param value - The name of the user who created the note
     */
    public void setCreatedUserName(String value) { this.createdUserName = value; }
    /**
     * @return AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * @param value - AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
};
