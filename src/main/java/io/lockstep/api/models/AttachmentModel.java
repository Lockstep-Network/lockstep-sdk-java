
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


/**
 * Represents a user uploaded attachment
 */
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
    private String erpKey;
    private String appEnrollmentId;
    private String created;
    private String createdUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field attachmentId
     */
    public String getAttachmentId() { return this.attachmentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for attachmentId
     */
    public void setAttachmentId(String value) { this.attachmentId = value; }
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
     * The name of the table the attachment is associated with
     *
     * @return The field tableKey
     */
    public String getTableKey() { return this.tableKey; }
    /**
     * The name of the table the attachment is associated with
     *
     * @param value The new value for tableKey
     */
    public void setTableKey(String value) { this.tableKey = value; }
    /**
     * The ID of the object the attachment is associated with
     *
     * @return The field objectKey
     */
    public String getObjectKey() { return this.objectKey; }
    /**
     * The ID of the object the attachment is associated with
     *
     * @param value The new value for objectKey
     */
    public void setObjectKey(String value) { this.objectKey = value; }
    /**
     * Name of the file
     *
     * @return The field fileName
     */
    public String getFileName() { return this.fileName; }
    /**
     * Name of the file
     *
     * @param value The new value for fileName
     */
    public void setFileName(String value) { this.fileName = value; }
    /**
     * Extension type of the file
     *
     * @return The field fileExt
     */
    public String getFileExt() { return this.fileExt; }
    /**
     * Extension type of the file
     *
     * @param value The new value for fileExt
     */
    public void setFileExt(String value) { this.fileExt = value; }
    /**
     * Corresponding AttachmentType object to describe this attachment
     *
     * @return The field attachmentTypeId
     */
    public String getAttachmentTypeId() { return this.attachmentTypeId; }
    /**
     * Corresponding AttachmentType object to describe this attachment
     *
     * @param value The new value for attachmentTypeId
     */
    public void setAttachmentTypeId(String value) { this.attachmentTypeId = value; }
    /**
     * Flag indicating the attachment was archived
     *
     * @return The field isArchived
     */
    public Boolean getIsArchived() { return this.isArchived; }
    /**
     * Flag indicating the attachment was archived
     *
     * @param value The new value for isArchived
     */
    public void setIsArchived(Boolean value) { this.isArchived = value; }
    /**
     *
     * @return The field originAttachmentId
     */
    public String getOriginAttachmentId() { return this.originAttachmentId; }
    /**
     *
     * @param value The new value for originAttachmentId
     */
    public void setOriginAttachmentId(String value) { this.originAttachmentId = value; }
    /**
     * Flag for if LS clients can see this file
     *
     * @return The field viewInternal
     */
    public Boolean getViewInternal() { return this.viewInternal; }
    /**
     * Flag for if LS clients can see this file
     *
     * @param value The new value for viewInternal
     */
    public void setViewInternal(Boolean value) { this.viewInternal = value; }
    /**
     * Flag for if Vendors and customers can see this file
     *
     * @return The field viewExternal
     */
    public Boolean getViewExternal() { return this.viewExternal; }
    /**
     * Flag for if Vendors and customers can see this file
     *
     * @param value The new value for viewExternal
     */
    public void setViewExternal(Boolean value) { this.viewExternal = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported from a financial system, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported from a financial system, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * The AppEnrollmentId of the application that imported this attachment record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application that imported this attachment record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * The date the attachment was created
     *
     * @return The field created
     */
    public String getCreated() { return this.created; }
    /**
     * The date the attachment was created
     *
     * @param value The new value for created
     */
    public void setCreated(String value) { this.created = value; }
    /**
     * Id of the user who made the file
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * Id of the user who made the file
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
};
