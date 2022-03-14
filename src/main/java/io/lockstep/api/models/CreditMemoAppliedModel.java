
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
 * Credit Memos reflect credits granted to a customer for various reasons, such as discounts or refunds.
 * Credit Memos may be applied to Invoices as Payments. When a Credit Memo is applied as payment to an Invoice,
 * Lockstep creates a Credit Memo Application record to track the amount from the Credit Memo that was applied
 * as payment to the Invoice. You can examine Credit Memo Application records to track which Invoices were paid
 * using this Credit.
 */
public class CreditMemoAppliedModel
{
    private @NotNull String creditMemoAppliedId;
    private @NotNull String groupKey;
    private @NotNull String invoiceId;
    private @NotNull String creditMemoInvoiceId;
    private @Nullable String erpKey;
    private @NotNull Integer entryNumber;
    private @NotNull String applyToInvoiceDate;
    private @NotNull Double creditMemoAppliedAmount;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable String appEnrollmentId;
    private @Nullable AttachmentModel[] attachments;
    private @Nullable NoteModel[] notes;
    private @Nullable CustomFieldDefinitionModel[] customFieldDefinitions;
    private @Nullable CustomFieldValueModel[] customFieldValues;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field creditMemoAppliedId
     */
    public @NotNull String getCreditMemoAppliedId() { return this.creditMemoAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for creditMemoAppliedId
     */
    public void setCreditMemoAppliedId(@NotNull String value) { this.creditMemoAppliedId = value; }
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
     * The Lockstep ID of the Invoice to which this credit memo was applied.  This Invoice's outstanding balance
     * was reduced by the value of the field `CreditMemoAppliedAmount` on the date `ApplyToInvoiceDate`.
     *
     * Example: Company ABC received a credit memo, CM000123 for $500.  Company ABC then chooses to apply this
     * credit memo to reduce the balance of the invoice PO1000578.  The `InvoiceErpKey` is the Lockstep Platform
     * ID number of Invoice `PO1000578`.
     *
     * @return The field invoiceId
     */
    public @NotNull String getInvoiceId() { return this.invoiceId; }
    /**
     * The Lockstep ID of the Invoice to which this credit memo was applied.  This Invoice's outstanding balance
     * was reduced by the value of the field `CreditMemoAppliedAmount` on the date `ApplyToInvoiceDate`.
     *
     * Example: Company ABC received a credit memo, CM000123 for $500.  Company ABC then chooses to apply this
     * credit memo to reduce the balance of the invoice PO1000578.  The `InvoiceErpKey` is the Lockstep Platform
     * ID number of Invoice `PO1000578`.
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(@NotNull String value) { this.invoiceId = value; }
    /**
     * The Lockstep ID of the Invoice of type "Credit Memo" that was consumed in this payment application event.
     *
     * Example: Company ABC received a credit memo, CM000123 for $500.  Company ABC then chooses to apply this
     * credit memo to reduce the balance of the invoice PO1000578.  The `CreditMemoInvoiceId` is the Lockstep
     * Platform ID number of Invoice `CM000123`.
     *
     * @return The field creditMemoInvoiceId
     */
    public @NotNull String getCreditMemoInvoiceId() { return this.creditMemoInvoiceId; }
    /**
     * The Lockstep ID of the Invoice of type "Credit Memo" that was consumed in this payment application event.
     *
     * Example: Company ABC received a credit memo, CM000123 for $500.  Company ABC then chooses to apply this
     * credit memo to reduce the balance of the invoice PO1000578.  The `CreditMemoInvoiceId` is the Lockstep
     * Platform ID number of Invoice `CM000123`.
     *
     * @param value The new value for creditMemoInvoiceId
     */
    public void setCreditMemoInvoiceId(@NotNull String value) { this.creditMemoInvoiceId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
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
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@Nullable String value) { this.erpKey = value; }
    /**
     * Reference number for the applied credit memo.
     *
     * @return The field entryNumber
     */
    public @NotNull Integer getEntryNumber() { return this.entryNumber; }
    /**
     * Reference number for the applied credit memo.
     *
     * @param value The new value for entryNumber
     */
    public void setEntryNumber(@NotNull Integer value) { this.entryNumber = value; }
    /**
     * The date on which this credit memo was applied to the Invoice represented by `InvoiceId`.
     *
     * @return The field applyToInvoiceDate
     */
    public @NotNull String getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * The date on which this credit memo was applied to the Invoice represented by `InvoiceId`.
     *
     * @param value The new value for applyToInvoiceDate
     */
    public void setApplyToInvoiceDate(@NotNull String value) { this.applyToInvoiceDate = value; }
    /**
     * The amount of the credit memo that was applied to the Invoice represented by `InvoiceId`.
     *
     * @return The field creditMemoAppliedAmount
     */
    public @NotNull Double getCreditMemoAppliedAmount() { return this.creditMemoAppliedAmount; }
    /**
     * The amount of the credit memo that was applied to the Invoice represented by `InvoiceId`.
     *
     * @param value The new value for creditMemoAppliedAmount
     */
    public void setCreditMemoAppliedAmount(@NotNull Double value) { this.creditMemoAppliedAmount = value; }
    /**
     * Date credit memo applied record was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * Date credit memo applied record was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The id of the user who created this applied credit memo.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The id of the user who created this applied credit memo.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * Date credit memo applied record was modified.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * Date credit memo applied record was modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The id of the user who modified this applied credit memo.
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The id of the user who modified this applied credit memo.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@NotNull String value) { this.modifiedUserId = value; }
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
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `CreditMemoApplied` and the `ObjectKey` set to the `CreditMemoAppliedId` for this record.  For
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
     * endpoint with the `TableKey` to `CreditMemoApplied` and the `ObjectKey` set to the `CreditMemoAppliedId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for attachments
     */
    public void setAttachments(@Nullable AttachmentModel[] value) { this.attachments = value; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `CreditMemoApplied` and the `ObjectKey` set to the `CreditMemoAppliedId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field notes
     */
    public @Nullable NoteModel[] getNotes() { return this.notes; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `CreditMemoApplied` and the `ObjectKey` set to the `CreditMemoAppliedId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable NoteModel[] value) { this.notes = value; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldDefinitions` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `CreditMemoApplied` and the `ObjectKey` set to the `CreditMemoAppliedId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field customFieldDefinitions
     */
    public @Nullable CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldDefinitions` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `CreditMemoApplied` and the `ObjectKey` set to the `CreditMemoAppliedId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for customFieldDefinitions
     */
    public void setCustomFieldDefinitions(@Nullable CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldValues` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `CreditMemoApplied` and the `ObjectKey` set to the `CreditMemoAppliedId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field customFieldValues
     */
    public @Nullable CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldValues` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `CreditMemoApplied` and the `ObjectKey` set to the `CreditMemoAppliedId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(@Nullable CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
