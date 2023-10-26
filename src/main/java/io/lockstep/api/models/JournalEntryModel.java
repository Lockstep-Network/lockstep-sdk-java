
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2023 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2023 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Contains information about a journal entry
 */
public class JournalEntryModel
{
    private @NotNull String journalEntryId;
    private @NotNull String groupKey;
    private @Nullable String appEnrollmentId;
    private @Nullable String erpKey;
    private @Nullable String journalId;
    private @NotNull Integer source;
    private @NotNull String postingDate;
    private @NotNull Integer status;
    private @Nullable String description;
    private @Nullable String comment;
    private @Nullable String referenceNumber;
    private @NotNull String sourcePostingDate;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable String sourceModifiedDate;
    private @NotNull JournalEntryLineModel[] lines;
    private @Nullable AttachmentModel[] attachments;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field journalEntryId
     */
    public @NotNull String getJournalEntryId() { return this.journalEntryId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for journalEntryId
     */
    public void setJournalEntryId(@NotNull String value) { this.journalEntryId = value; }
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
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this journal entry record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public @Nullable String getErpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this journal entry record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@Nullable String value) { this.erpKey = value; }
    /**
     * The ERP’s identifier for this journal entry, usually has meaning to the user.
     * May be the same value of the ERP Key.
     *
     * @return The field journalId
     */
    public @Nullable String getJournalId() { return this.journalId; }
    /**
     * The ERP’s identifier for this journal entry, usually has meaning to the user.
     * May be the same value of the ERP Key.
     *
     * @param value The new value for journalId
     */
    public void setJournalId(@Nullable String value) { this.journalId = value; }
    /**
     * Possible sources for a Journal Entry.
     *
     * @return The field source
     */
    public @NotNull Integer getSource() { return this.source; }
    /**
     * Possible sources for a Journal Entry.
     *
     * @param value The new value for source
     */
    public void setSource(@NotNull Integer value) { this.source = value; }
    /**
     * The UTC date and time when this journal entry was posted.
     *
     * @return The field postingDate
     */
    public @NotNull String getPostingDate() { return this.postingDate; }
    /**
     * The UTC date and time when this journal entry was posted.
     *
     * @param value The new value for postingDate
     */
    public void setPostingDate(@NotNull String value) { this.postingDate = value; }
    /**
     * Possible statuses for a Journal Entry.
     *
     * @return The field status
     */
    public @NotNull Integer getStatus() { return this.status; }
    /**
     * Possible statuses for a Journal Entry.
     *
     * @param value The new value for status
     */
    public void setStatus(@NotNull Integer value) { this.status = value; }
    /**
     * A brief description explaining the purpose of the journal entry.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * A brief description explaining the purpose of the journal entry.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * An additional comment related to the entry.
     *
     * @return The field comment
     */
    public @Nullable String getComment() { return this.comment; }
    /**
     * An additional comment related to the entry.
     *
     * @param value The new value for comment
     */
    public void setComment(@Nullable String value) { this.comment = value; }
    /**
     * Any reference number or identifier associated with the entry, such as an invoice number or purchase order.
     *
     * @return The field referenceNumber
     */
    public @Nullable String getReferenceNumber() { return this.referenceNumber; }
    /**
     * Any reference number or identifier associated with the entry, such as an invoice number or purchase order.
     *
     * @param value The new value for referenceNumber
     */
    public void setReferenceNumber(@Nullable String value) { this.referenceNumber = value; }
    /**
     * The raw posting date from the source.
     *
     * @return The field sourcePostingDate
     */
    public @NotNull String getSourcePostingDate() { return this.sourcePostingDate; }
    /**
     * The raw posting date from the source.
     *
     * @param value The new value for sourcePostingDate
     */
    public void setSourcePostingDate(@NotNull String value) { this.sourcePostingDate = value; }
    /**
     * The date that the journal entry was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date that the journal entry was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID of the user who created the journal entry.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created the journal entry.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date that the journal entry was last modified.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date that the journal entry was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID of the user who last modified the journal entry.
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified the journal entry.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
    /**
     * The date on which this record was last modified in source ERP.
     *
     * @return The field sourceModifiedDate
     */
    public @Nullable String getSourceModifiedDate() { return this.sourceModifiedDate; }
    /**
     * The date on which this record was last modified in source ERP.
     *
     * @param value The new value for sourceModifiedDate
     */
    public void setSourceModifiedDate(@Nullable String value) { this.sourceModifiedDate = value; }
    /**
     * All lines attached to this journal entry.
     * To retrieve this collection, specify `Lines` in the "Include" parameter for your query.
     *
     * @return The field lines
     */
    public @NotNull JournalEntryLineModel[] getLines() { return this.lines; }
    /**
     * All lines attached to this journal entry.
     * To retrieve this collection, specify `Lines` in the "Include" parameter for your query.
     *
     * @param value The new value for lines
     */
    public void setLines(@NotNull JournalEntryLineModel[] value) { this.lines = value; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `Invoice` and the `ObjectKey` set to the `InvoiceId` for this record.  For
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
     * endpoint with the `TableKey` to `Invoice` and the `ObjectKey` set to the `InvoiceId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for attachments
     */
    public void setAttachments(@Nullable AttachmentModel[] value) { this.attachments = value; }
};
