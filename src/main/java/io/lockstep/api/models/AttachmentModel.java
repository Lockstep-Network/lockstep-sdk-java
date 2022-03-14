
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
 * An Attachment is a file that can be attached to various account attributes within Lockstep.
 * This data model contains metadata about the attachment.  You can upload and download attachments
 * into the Lockstep Platform along with this metadata.  Attachments can be used for invoices, payments,
 * legal documents, or any other external files that you wish to track.
 *
 * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
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
    private @Nullable String attachmentType;

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
     * An Attachment is connected to an existing item within the Lockstep Platform by the fields `TableKey` and
     * `ObjectKey`.  For example, an Attachment connected to Invoice 12345 would have a `TableKey` value of
     * `Invoice` and an `ObjectKey` value of `12345`.
     *
     * The `TableKey` value contains the name of the table within the Lockstep Platform to which this Attachment
     * is connected.
     *
     * For more information, see [linking metadata to an object](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field tableKey
     */
    public @Nullable String getTableKey() { return this.tableKey; }
    /**
     * An Attachment is connected to an existing item within the Lockstep Platform by the fields `TableKey` and
     * `ObjectKey`.  For example, an Attachment connected to Invoice 12345 would have a `TableKey` value of
     * `Invoice` and an `ObjectKey` value of `12345`.
     *
     * The `TableKey` value contains the name of the table within the Lockstep Platform to which this Attachment
     * is connected.
     *
     * For more information, see [linking metadata to an object](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for tableKey
     */
    public void setTableKey(@Nullable String value) { this.tableKey = value; }
    /**
     * An Attachment is connected to an existing item within the Lockstep Platform by the fields `TableKey` and
     * `ObjectKey`.  For example, an Attachment connected to Invoice 12345 would have a `TableKey` value of
     * `Invoice` and an `ObjectKey` value of `12345`.
     *
     * The `ObjectKey` value contains the primary key of the record within the Lockstep Platform to which this
     * Attachment is connected.
     *
     * For more information, see [linking metadata to an object](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field objectKey
     */
    public @NotNull String getObjectKey() { return this.objectKey; }
    /**
     * An Attachment is connected to an existing item within the Lockstep Platform by the fields `TableKey` and
     * `ObjectKey`.  For example, an Attachment connected to Invoice 12345 would have a `TableKey` value of
     * `Invoice` and an `ObjectKey` value of `12345`.
     *
     * The `ObjectKey` value contains the primary key of the record within the Lockstep Platform to which this
     * Attachment is connected.
     *
     * For more information, see [linking metadata to an object](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for objectKey
     */
    public void setObjectKey(@NotNull String value) { this.objectKey = value; }
    /**
     * An Attachment represents a file that was uploaded to the Lockstep Platform.  This field contains the original
     * name of the file on disk, without its extension.
     *
     * @return The field fileName
     */
    public @Nullable String getFileName() { return this.fileName; }
    /**
     * An Attachment represents a file that was uploaded to the Lockstep Platform.  This field contains the original
     * name of the file on disk, without its extension.
     *
     * @param value The new value for fileName
     */
    public void setFileName(@Nullable String value) { this.fileName = value; }
    /**
     * An Attachment represents a file that was uploaded to the Lockstep Platform.  This field contains the original
     * extension name of the file on disk.
     *
     * @return The field fileExt
     */
    public @Nullable String getFileExt() { return this.fileExt; }
    /**
     * An Attachment represents a file that was uploaded to the Lockstep Platform.  This field contains the original
     * extension name of the file on disk.
     *
     * @param value The new value for fileExt
     */
    public void setFileExt(@Nullable String value) { this.fileExt = value; }
    /**
     * DEPRECATED: This field is replaced by `AttachmentType`.
     *
     * @return The field attachmentTypeId
     */
    public @NotNull String getAttachmentTypeId() { return this.attachmentTypeId; }
    /**
     * DEPRECATED: This field is replaced by `AttachmentType`.
     *
     * @param value The new value for attachmentTypeId
     */
    public void setAttachmentTypeId(@NotNull String value) { this.attachmentTypeId = value; }
    /**
     * A flag indicating whether this Attachment is archived (also known as hidden or deleted).  When you call
     * [ArchiveAttachment](https://developer.lockstep.io/reference/delete_api-v1-attachments-id) this field will
     * be set to true.
     *
     * You should avoid displaying Attachments with the IsArchived field set to true in your user interface.
     *
     * @return The field isArchived
     */
    public @NotNull Boolean getIsArchived() { return this.isArchived; }
    /**
     * A flag indicating whether this Attachment is archived (also known as hidden or deleted).  When you call
     * [ArchiveAttachment](https://developer.lockstep.io/reference/delete_api-v1-attachments-id) this field will
     * be set to true.
     *
     * You should avoid displaying Attachments with the IsArchived field set to true in your user interface.
     *
     * @param value The new value for isArchived
     */
    public void setIsArchived(@NotNull Boolean value) { this.isArchived = value; }
    /**
     * DEPRECATED - Do not use
     *
     * @return The field originAttachmentId
     */
    public @NotNull String getOriginAttachmentId() { return this.originAttachmentId; }
    /**
     * DEPRECATED - Do not use
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
     * The date the attachment was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date the attachment was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The unique ID of the [UserAccount](https://developer.lockstep.io/docs/useraccountmodel) of the user
     * who created this Attachment.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The unique ID of the [UserAccount](https://developer.lockstep.io/docs/useraccountmodel) of the user
     * who created this Attachment.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * A text string describing the type of this Attachment.
     *
     * @return The field attachmentType
     */
    public @Nullable String getAttachmentType() { return this.attachmentType; }
    /**
     * A text string describing the type of this Attachment.
     *
     * @param value The new value for attachmentType
     */
    public void setAttachmentType(@Nullable String value) { this.attachmentType = value; }
};
