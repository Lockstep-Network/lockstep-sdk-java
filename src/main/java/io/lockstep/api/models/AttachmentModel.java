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
    public String getAttachmentId() { return this.attachmentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     */
    public void setAttachmentId(String value) { this.attachmentId = value; }
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
     * The name of the table the attachment is associated with
     */
    public String getTableKey() { return this.tableKey; }
    /**
     * The name of the table the attachment is associated with
     */
    public void setTableKey(String value) { this.tableKey = value; }
    /**
     * The ID of the object the attachment is associated with
     */
    public String getObjectKey() { return this.objectKey; }
    /**
     * The ID of the object the attachment is associated with
     */
    public void setObjectKey(String value) { this.objectKey = value; }
    /**
     * Name of the file
     */
    public String getFileName() { return this.fileName; }
    /**
     * Name of the file
     */
    public void setFileName(String value) { this.fileName = value; }
    /**
     * Extension type of the file
     */
    public String getFileExt() { return this.fileExt; }
    /**
     * Extension type of the file
     */
    public void setFileExt(String value) { this.fileExt = value; }
    /**
     * Corresponding AttachmentType object to describe this attachment
     */
    public String getAttachmentTypeId() { return this.attachmentTypeId; }
    /**
     * Corresponding AttachmentType object to describe this attachment
     */
    public void setAttachmentTypeId(String value) { this.attachmentTypeId = value; }
    /**
     * Flag indicating the attachment was archived
     */
    public Boolean getIsArchived() { return this.isArchived; }
    /**
     * Flag indicating the attachment was archived
     */
    public void setIsArchived(Boolean value) { this.isArchived = value; }
    public String getOriginAttachmentId() { return this.originAttachmentId; }
    public void setOriginAttachmentId(String value) { this.originAttachmentId = value; }
    /**
     * Flag for if LS clients can see this file
     */
    public Boolean getViewInternal() { return this.viewInternal; }
    /**
     * Flag for if LS clients can see this file
     */
    public void setViewInternal(Boolean value) { this.viewInternal = value; }
    /**
     * Flag for if Vendors and customers can see this file
     */
    public Boolean getViewExternal() { return this.viewExternal; }
    /**
     * Flag for if Vendors and customers can see this file
     */
    public void setViewExternal(Boolean value) { this.viewExternal = value; }
    /**
     * The date the attachment was created
     */
    public Date getCreated() { return this.created; }
    /**
     * The date the attachment was created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * Id of the user who made the file
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * Id of the user who made the file
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
};
