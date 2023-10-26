
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
 * Represents a line in an invoice
 */
public class InvoiceLineModel
{
    private @NotNull String invoiceLineId;
    private @NotNull String groupKey;
    private @NotNull String invoiceId;
    private @Nullable String erpKey;
    private @Nullable String lineNumber;
    private @Nullable String productCode;
    private @Nullable String description;
    private @Nullable String unitMeasureCode;
    private @NotNull Double unitPrice;
    private @Nullable Double quantity;
    private @Nullable Double quantityShipped;
    private @Nullable Double quantityReceived;
    private @Nullable Double totalAmount;
    private @Nullable String exemptionCode;
    private @Nullable String reportingDate;
    private @Nullable String overrideOriginAddressId;
    private @Nullable String overrideBillToAddressId;
    private @Nullable String overrideShipToAddressId;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable String appEnrollmentId;
    private @NotNull Integer erpUpdateStatus;
    private @NotNull Integer erpUpdateAction;
    private @Nullable String sourceModifiedDate;
    private @Nullable NoteModel[] notes;
    private @Nullable AttachmentModel[] attachments;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field invoiceLineId
     */
    public @NotNull String getInvoiceLineId() { return this.invoiceLineId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for invoiceLineId
     */
    public void setInvoiceLineId(@NotNull String value) { this.invoiceLineId = value; }
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
     * The ID number of the invoice this line belongs to.
     *
     * @return The field invoiceId
     */
    public @NotNull String getInvoiceId() { return this.invoiceId; }
    /**
     * The ID number of the invoice this line belongs to.
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(@NotNull String value) { this.invoiceId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system, if it was
     * different from the original `LineNumber`.
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
     * The unique ID of this record as it was known in its originating financial system, if it was
     * different from the original `LineNumber`.
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
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     *
     * @return The field lineNumber
     */
    public @Nullable String getLineNumber() { return this.lineNumber; }
    /**
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     *
     * @param value The new value for lineNumber
     */
    public void setLineNumber(@Nullable String value) { this.lineNumber = value; }
    /**
     * A code number identifying the product or service that is specified on this line.
     *
     * @return The field productCode
     */
    public @Nullable String getProductCode() { return this.productCode; }
    /**
     * A code number identifying the product or service that is specified on this line.
     *
     * @param value The new value for productCode
     */
    public void setProductCode(@Nullable String value) { this.productCode = value; }
    /**
     * Description of this invoice line.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * Description of this invoice line.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     *
     * @return The field unitMeasureCode
     */
    public @Nullable String getUnitMeasureCode() { return this.unitMeasureCode; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     *
     * @param value The new value for unitMeasureCode
     */
    public void setUnitMeasureCode(@Nullable String value) { this.unitMeasureCode = value; }
    /**
     * The price of a single unit for this line.
     *
     * @return The field unitPrice
     */
    public @NotNull Double getUnitPrice() { return this.unitPrice; }
    /**
     * The price of a single unit for this line.
     *
     * @param value The new value for unitPrice
     */
    public void setUnitPrice(@NotNull Double value) { this.unitPrice = value; }
    /**
     * The quantity of items for ths line.
     *
     * @return The field quantity
     */
    public @Nullable Double getQuantity() { return this.quantity; }
    /**
     * The quantity of items for ths line.
     *
     * @param value The new value for quantity
     */
    public void setQuantity(@Nullable Double value) { this.quantity = value; }
    /**
     * The number of items that have been shipped.
     *
     * @return The field quantityShipped
     */
    public @Nullable Double getQuantityShipped() { return this.quantityShipped; }
    /**
     * The number of items that have been shipped.
     *
     * @param value The new value for quantityShipped
     */
    public void setQuantityShipped(@Nullable Double value) { this.quantityShipped = value; }
    /**
     * The number of items that has been received.
     *
     * @return The field quantityReceived
     */
    public @Nullable Double getQuantityReceived() { return this.quantityReceived; }
    /**
     * The number of items that has been received.
     *
     * @param value The new value for quantityReceived
     */
    public void setQuantityReceived(@Nullable Double value) { this.quantityReceived = value; }
    /**
     * The total amount for this line.
     *
     * @return The field totalAmount
     */
    public @Nullable Double getTotalAmount() { return this.totalAmount; }
    /**
     * The total amount for this line.
     *
     * @param value The new value for totalAmount
     */
    public void setTotalAmount(@Nullable Double value) { this.totalAmount = value; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     *
     * @return The field exemptionCode
     */
    public @Nullable String getExemptionCode() { return this.exemptionCode; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     *
     * @param value The new value for exemptionCode
     */
    public void setExemptionCode(@Nullable String value) { this.exemptionCode = value; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     *
     * @return The field reportingDate
     */
    public @Nullable String getReportingDate() { return this.reportingDate; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     *
     * @param value The new value for reportingDate
     */
    public void setReportingDate(@Nullable String value) { this.reportingDate = value; }
    /**
     * An optional ID number for the line's origin address.
     *
     * @return The field overrideOriginAddressId
     */
    public @Nullable String getOverrideOriginAddressId() { return this.overrideOriginAddressId; }
    /**
     * An optional ID number for the line's origin address.
     *
     * @param value The new value for overrideOriginAddressId
     */
    public void setOverrideOriginAddressId(@Nullable String value) { this.overrideOriginAddressId = value; }
    /**
     * An optional ID number for the line's bill to address.
     *
     * @return The field overrideBillToAddressId
     */
    public @Nullable String getOverrideBillToAddressId() { return this.overrideBillToAddressId; }
    /**
     * An optional ID number for the line's bill to address.
     *
     * @param value The new value for overrideBillToAddressId
     */
    public void setOverrideBillToAddressId(@Nullable String value) { this.overrideBillToAddressId = value; }
    /**
     * An optional ID number for the line's ship to address.
     *
     * @return The field overrideShipToAddressId
     */
    public @Nullable String getOverrideShipToAddressId() { return this.overrideShipToAddressId; }
    /**
     * An optional ID number for the line's ship to address.
     *
     * @param value The new value for overrideShipToAddressId
     */
    public void setOverrideShipToAddressId(@Nullable String value) { this.overrideShipToAddressId = value; }
    /**
     * The date on which this line was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * The date on which this line was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The ID number of the user who created this line.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this line.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * The date on which this line was last modified.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The date on which this line was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this line.
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this line.
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
     * Possible statuses for a record that supports ERP Update.
     *
     * @return The field erpUpdateStatus
     */
    public @NotNull Integer getErpUpdateStatus() { return this.erpUpdateStatus; }
    /**
     * Possible statuses for a record that supports ERP Update.
     *
     * @param value The new value for erpUpdateStatus
     */
    public void setErpUpdateStatus(@NotNull Integer value) { this.erpUpdateStatus = value; }
    /**
     * Possible actions for a record that supports ERP Update.
     *
     * @return The field erpUpdateAction
     */
    public @NotNull Integer getErpUpdateAction() { return this.erpUpdateAction; }
    /**
     * Possible actions for a record that supports ERP Update.
     *
     * @param value The new value for erpUpdateAction
     */
    public void setErpUpdateAction(@NotNull Integer value) { this.erpUpdateAction = value; }
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
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `InvoiceLine` and the `ObjectKey` set to the `InvoiceLineId` for this record.  For
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
     * endpoint with the `TableKey` to `InvoiceLine` and the `ObjectKey` set to the `InvoiceLineId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable NoteModel[] value) { this.notes = value; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `InvoiceLine` and the `ObjectKey` set to the `InvoiceLineId` for this record.  For
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
     * endpoint with the `TableKey` to `InvoiceLine` and the `ObjectKey` set to the `InvoiceLineId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for attachments
     */
    public void setAttachments(@Nullable AttachmentModel[] value) { this.attachments = value; }
};
