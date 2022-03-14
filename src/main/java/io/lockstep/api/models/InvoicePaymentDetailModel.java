
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
 * View to return Payment Detail information for a given Invoice record.
 */
public class InvoicePaymentDetailModel
{
    private @NotNull String groupKey;
    private @NotNull String paymentAppliedId;
    private @NotNull String invoiceId;
    private @NotNull String paymentId;
    private @Nullable String applyToInvoiceDate;
    private @NotNull Double paymentAppliedAmount;
    private @Nullable String referenceCode;
    private @Nullable String companyId;
    private @Nullable Double paymentAmount;
    private @Nullable Double unappliedAmount;

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
     * The unique identifier of this PaymentApplied record.
     *
     * @return The field paymentAppliedId
     */
    public @NotNull String getPaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * The unique identifier of this PaymentApplied record.
     *
     * @param value The new value for paymentAppliedId
     */
    public void setPaymentAppliedId(@NotNull String value) { this.paymentAppliedId = value; }
    /**
     * The database id of the invoice
     *
     * @return The field invoiceId
     */
    public @NotNull String getInvoiceId() { return this.invoiceId; }
    /**
     * The database id of the invoice
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(@NotNull String value) { this.invoiceId = value; }
    /**
     * The database id of the Payment.
     *
     * @return The field paymentId
     */
    public @NotNull String getPaymentId() { return this.paymentId; }
    /**
     * The database id of the Payment.
     *
     * @param value The new value for paymentId
     */
    public void setPaymentId(@NotNull String value) { this.paymentId = value; }
    /**
     * Date Payment applied to Invoice.
     *
     * @return The field applyToInvoiceDate
     */
    public @Nullable String getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date Payment applied to Invoice.
     *
     * @param value The new value for applyToInvoiceDate
     */
    public void setApplyToInvoiceDate(@Nullable String value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to Invoice.
     *
     * @return The field paymentAppliedAmount
     */
    public @NotNull Double getPaymentAppliedAmount() { return this.paymentAppliedAmount; }
    /**
     * Amount applied to Invoice.
     *
     * @param value The new value for paymentAppliedAmount
     */
    public void setPaymentAppliedAmount(@NotNull Double value) { this.paymentAppliedAmount = value; }
    /**
     * An additional reference code that is sometimes used to identify this Payment.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @return The field referenceCode
     */
    public @Nullable String getReferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this Payment.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @param value The new value for referenceCode
     */
    public void setReferenceCode(@Nullable String value) { this.referenceCode = value; }
    /**
     * The ID number of the Company (CompanyType = "Customer") that created this Payment.
     *
     * @return The field companyId
     */
    public @Nullable String getCompanyId() { return this.companyId; }
    /**
     * The ID number of the Company (CompanyType = "Customer") that created this Payment.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(@Nullable String value) { this.companyId = value; }
    /**
     * The total value of this Payment.
     *
     * @return The field paymentAmount
     */
    public @Nullable Double getPaymentAmount() { return this.paymentAmount; }
    /**
     * The total value of this Payment.
     *
     * @param value The new value for paymentAmount
     */
    public void setPaymentAmount(@Nullable Double value) { this.paymentAmount = value; }
    /**
     * The remaining balance value of this Payment.
     *
     * @return The field unappliedAmount
     */
    public @Nullable Double getUnappliedAmount() { return this.unappliedAmount; }
    /**
     * The remaining balance value of this Payment.
     *
     * @param value The new value for unappliedAmount
     */
    public void setUnappliedAmount(@Nullable Double value) { this.unappliedAmount = value; }
};
