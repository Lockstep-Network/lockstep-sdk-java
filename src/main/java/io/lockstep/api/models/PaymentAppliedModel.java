
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A Payment Application is created by a business who receives a Payment from a customer.  A customer may make
 * a single Payment to match an Invoice exactly, a partial Payment for an Invoice, or a single Payment may be
 * made for multiple smaller Invoices.  The Payment Application contains information about which Invoices are connected
 * to which Payments and for which amounts.
 */
public class PaymentAppliedModel
{
    private @NotNull String groupKey;
    private @NotNull String paymentAppliedId;
    private @NotNull String invoiceId;
    private @NotNull String paymentId;
    private @Nullable String erpKey;
    private @NotNull Integer entryNumber;
    private @NotNull String applyToInvoiceDate;
    private @NotNull Double paymentAppliedAmount;
    private @NotNull String created;
    private @NotNull String createdUserId;
    private @NotNull String modified;
    private @NotNull String modifiedUserId;
    private @Nullable String appEnrollmentId;
    private @Nullable InvoiceModel invoice;

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
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field paymentAppliedId
     */
    public @NotNull String getPaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for paymentAppliedId
     */
    public void setPaymentAppliedId(@NotNull String value) { this.paymentAppliedId = value; }
    /**
     * The Invoice this payment is applied to.
     *
     * @return The field invoiceId
     */
    public @NotNull String getInvoiceId() { return this.invoiceId; }
    /**
     * The Invoice this payment is applied to.
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(@NotNull String value) { this.invoiceId = value; }
    /**
     * The Payment applied to the invoice.
     *
     * @return The field paymentId
     */
    public @NotNull String getPaymentId() { return this.paymentId; }
    /**
     * The Payment applied to the invoice.
     *
     * @param value The new value for paymentId
     */
    public void setPaymentId(@NotNull String value) { this.paymentId = value; }
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
     * The entry number of this payment application.  This is often a journal entry number, confirmation code,
     * or other identifying field for this payment application.
     *
     * @return The field entryNumber
     */
    public @NotNull Integer getEntryNumber() { return this.entryNumber; }
    /**
     * The entry number of this payment application.  This is often a journal entry number, confirmation code,
     * or other identifying field for this payment application.
     *
     * @param value The new value for entryNumber
     */
    public void setEntryNumber(@NotNull Integer value) { this.entryNumber = value; }
    /**
     * The date this payment was applied to this invoice.
     *
     * @return The field applyToInvoiceDate
     */
    public @NotNull String getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * The date this payment was applied to this invoice.
     *
     * @param value The new value for applyToInvoiceDate
     */
    public void setApplyToInvoiceDate(@NotNull String value) { this.applyToInvoiceDate = value; }
    /**
     * The total amount that was applied to this Invoice from the Payment.
     *
     * @return The field paymentAppliedAmount
     */
    public @NotNull Double getPaymentAppliedAmount() { return this.paymentAppliedAmount; }
    /**
     * The total amount that was applied to this Invoice from the Payment.
     *
     * @param value The new value for paymentAppliedAmount
     */
    public void setPaymentAppliedAmount(@NotNull Double value) { this.paymentAppliedAmount = value; }
    /**
     * Date payment applied record was created.
     *
     * @return The field created
     */
    public @NotNull String getCreated() { return this.created; }
    /**
     * Date payment applied record was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@NotNull String value) { this.created = value; }
    /**
     * The id of the user who created this applied payment.
     *
     * @return The field createdUserId
     */
    public @NotNull String getCreatedUserId() { return this.createdUserId; }
    /**
     * The id of the user who created this applied payment.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@NotNull String value) { this.createdUserId = value; }
    /**
     * Date payment applied record was modified.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * Date payment applied record was modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
    /**
     * The id of the user who modified this applied payment.
     *
     * @return The field modifiedUserId
     */
    public @NotNull String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The id of the user who modified this applied payment.
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
     * The invoice associated with this applied payment.
     *
     * @return The field invoice
     */
    public @Nullable InvoiceModel getInvoice() { return this.invoice; }
    /**
     * The invoice associated with this applied payment.
     *
     * @param value The new value for invoice
     */
    public void setInvoice(@Nullable InvoiceModel value) { this.invoice = value; }
};
