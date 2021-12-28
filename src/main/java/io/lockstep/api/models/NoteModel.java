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
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getnoteId() { return this.noteId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setnoteId(String value) { this.noteId = value; }
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
     * The name of the table the note is associated with
     */
    public String gettableKey() { return this.tableKey; }
    /**
     * The name of the table the note is associated with
     */
    public void settableKey(String value) { this.tableKey = value; }
    /**
     * The ID of the object the note is associated with
     */
    public String getobjectKey() { return this.objectKey; }
    /**
     * The ID of the object the note is associated with
     */
    public void setobjectKey(String value) { this.objectKey = value; }
    /**
     * The text of the note
     */
    public String getnoteText() { return this.noteText; }
    /**
     * The text of the note
     */
    public void setnoteText(String value) { this.noteText = value; }
    /**
     * The type of the note
     */
    public String getnoteType() { return this.noteType; }
    /**
     * The type of the note
     */
    public void setnoteType(String value) { this.noteType = value; }
    /**
     * Flag indicating if the note has been archived
     */
    public Boolean getisArchived() { return this.isArchived; }
    /**
     * Flag indicating if the note has been archived
     */
    public void setisArchived(Boolean value) { this.isArchived = value; }
    /**
     * The date the note was created
     */
    public Date getcreated() { return this.created; }
    /**
     * The date the note was created
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created the note
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the note
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The name of the user who created the note
     */
    public String getcreatedUserName() { return this.createdUserName; }
    /**
     * The name of the user who created the note
     */
    public void setcreatedUserName(String value) { this.createdUserName = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getappEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setappEnrollmentId(String value) { this.appEnrollmentId = value; }
};
