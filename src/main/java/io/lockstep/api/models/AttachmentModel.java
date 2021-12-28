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

public class AttachmentModel
{
    private String attachmentId;
    private String groupKey;
    private String tableKey;
    private String objectKey;
    private String fileName;
    private String fileExt;
    private String attachmentTypeId;
    private Boolean isArchived;
    private String originAttachmentId;
    private Boolean viewInternal;
    private Boolean viewExternal;
    private Date created;
    private String createdUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public String getattachmentId() { return this.attachmentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setattachmentId(String value) { this.attachmentId = value; }
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
     * The name of the table the attachment is associated with
     */
    public String gettableKey() { return this.tableKey; }
    /**
     * The name of the table the attachment is associated with
     */
    public void settableKey(String value) { this.tableKey = value; }
    /**
     * The ID of the object the attachment is associated with
     */
    public String getobjectKey() { return this.objectKey; }
    /**
     * The ID of the object the attachment is associated with
     */
    public void setobjectKey(String value) { this.objectKey = value; }
    /**
     * Name of the file
     */
    public String getfileName() { return this.fileName; }
    /**
     * Name of the file
     */
    public void setfileName(String value) { this.fileName = value; }
    /**
     * Extension type of the file
     */
    public String getfileExt() { return this.fileExt; }
    /**
     * Extension type of the file
     */
    public void setfileExt(String value) { this.fileExt = value; }
    /**
     * Corresponding AttachmentType object to describe this attachment
     */
    public String getattachmentTypeId() { return this.attachmentTypeId; }
    /**
     * Corresponding AttachmentType object to describe this attachment
     */
    public void setattachmentTypeId(String value) { this.attachmentTypeId = value; }
    /**
     * Flag indicating the attachment was archived
     */
    public Boolean getisArchived() { return this.isArchived; }
    /**
     * Flag indicating the attachment was archived
     */
    public void setisArchived(Boolean value) { this.isArchived = value; }
    public String getoriginAttachmentId() { return this.originAttachmentId; }
    public void setoriginAttachmentId(String value) { this.originAttachmentId = value; }
    /**
     * Flag for if LS clients can see this file
     */
    public Boolean getviewInternal() { return this.viewInternal; }
    /**
     * Flag for if LS clients can see this file
     */
    public void setviewInternal(Boolean value) { this.viewInternal = value; }
    /**
     * Flag for if Vendors and customers can see this file
     */
    public Boolean getviewExternal() { return this.viewExternal; }
    /**
     * Flag for if Vendors and customers can see this file
     */
    public void setviewExternal(Boolean value) { this.viewExternal = value; }
    /**
     * The date the attachment was created
     */
    public Date getcreated() { return this.created; }
    /**
     * The date the attachment was created
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * Id of the user who made the file
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * Id of the user who made the file
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
};
