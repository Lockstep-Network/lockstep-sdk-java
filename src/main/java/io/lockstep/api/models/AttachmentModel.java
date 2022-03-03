
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
 * Represents a user uploaded attachment
 */
public class AttachmentModel
{
    private @NotNull String attachmentId;
    private @NotNull String groupKey;
    private @Nullable String tableKey;
    private @NotNull String objectKey;
    private @Nullable String fileName;
    private @Nullable String fileExt;
    private @NotNull String attachmentTypeId;
    private @NotNull Boolean isArchived;
    private @NotNull String originAttachmentId;
    private @NotNull Boolean viewInternal;
    private @NotNull Boolean viewExternal;
    private @Nullable String erpKey;
    private @Nullable String appEnrollmentId;
    private @NotNull String created;
    private @NotNull String createdUserId;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field attachmentId
     */
    public @NotNull String getAttachmentId() { return this.attachmentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for attachmentId
     */
    public void setAttachmentId(@NotNull String value) { this.attachmentId = value; }
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
     * The name of the table the attachment is associated with
     *
     * @return The field tableKey
     */
    public @Nullable String getTableKey() { return this.tableKey; }
    /**
     * The name of the table the attachment is associated with
     *
     * @param value The new value for tableKey
     */
    public void setTableKey(@Nullable String value) { this.tableKey = value; }
    /**
     * The ID of the object the attachment is associated with
     *
     * @return The field objectKey
     */
    public @NotNull String getObjectKey() { return this.objectKey; }
    /**
     * The ID of the object the attachment is associated with
     *
     * @param value The new value for objectKey
     */
    public void setObjectKey(@NotNull String value) { this.objectKey = value; }
    /**
     * Name of the file
     *
     * @return The field fileName
     */
    public @Nullable String getFileName() { return this.fileName; }
    /**
     * Name of the file
     *
     * @param value The new value for fileName
     */
    public void setFileName(@Nullable String value) { this.fileName = value; }
    /**
     * Extension type of the file
     *
     * @return The field fileExt
     */
    public @Nullable String getFileExt() { return this.fileExt; }
    /**
     * Extension type of the file
     *
     * @param value The new value for fileExt
     */
    public void setFileExt(@Nullable String value) { this.fileExt = value; }
    /**
     * Corresponding AttachmentType object to describe this attachment
     *
     * @return The field attachmentTypeId
     */
    public @NotNull String getAttachmentTypeId() { return this.attachmentTypeId; }
    /**
     * Corresponding AttachmentType object to describe this attachment
     *
     * @param value The new value for attachmentTypeId
     */
    public void setAttachmentTypeId(@NotNull String value) { this.attachmentTypeId = value; }
    /**
     * Flag indicating the attachment was archived
     *
     * @return The field isArchived
     */
    public @NotNull Boolean getIsArchived() { return this.isArchived; }
    /**
     * Flag indicating the attachment was archived
     *
     * @param value The new value for isArchived
     */
    public void setIsArchived(@NotNull Boolean value) { this.isArchived = value; }
    /**
     * Tracks the original record for this attachment, not currently used.
     *
     * @return The field originAttachmentId
     */
    public @NotNull String getOriginAttachmentId() { return this.originAttachmentId; }
    /**
     * Tracks the original record for this attachment, not currently used.
     *
     * @param value The new value for originAttachmentId
     */
    public void setOriginAttachmentId(@NotNull String value) { this.originAttachmentId = value; }
    /**
     * Flag for if LS clients can see this file
     *
     * @return The field viewInternal
     */
    public @NotNull Boolean getViewInternal() { return this.viewInternal; }
    /**
     * Flag for if LS clients can see this file
     *
     * @param value The new value for viewInternal
     */
    public void setViewInternal(@NotNull Boolean value) { this.viewInternal = value; }
    /**
     * Flag for if Vendors and customers can see this file
     *
     * @return The field viewExternal
     */
    public @NotNull Boolean getViewExternal() { return this.viewExternal; }
    /**
     * Flag for if Vendors and customers can see this file
     *
     * @param value The new value for viewExternal
     */
    public void setViewExternal(@NotNull Boolean value) { this.viewExternal = value; }
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
    public @Nullable String getErpKey() { return this.erpKey; }
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
    public void setErpKey(@Nullable String value) { this.erpKey = value; }
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
     * The date the attachment was created
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date the attachment was created
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * Id of the user who made the file
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * Id of the user who made the file
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
};
