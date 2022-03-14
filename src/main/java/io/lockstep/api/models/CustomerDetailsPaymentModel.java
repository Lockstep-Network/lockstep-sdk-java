
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
 * Customer payment collected information
 */
public class CustomerDetailsPaymentModel
{
    private @NotNull String groupKey;
    private @NotNull String paymentId;
    private @Nullable String paymentAppliedId;
    private @Nullable String paymentType;
    private @Nullable String invoiceId;
    private @Nullable String invoiceTypeCode;
    private @Nullable String invoiceReferenceCode;
    private @NotNull Double invoiceTotalAmount;
    private @NotNull String paymentDate;
    private @NotNull Double paymentAmount;

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
     * Unique identifier for payment
     *
     * @return The field paymentId
     */
    public @NotNull String getPaymentId() { return this.paymentId; }
    /**
     * Unique identifier for payment
     *
     * @param value The new value for paymentId
     */
    public void setPaymentId(@NotNull String value) { this.paymentId = value; }
    /**
     * Unique identifier for payment applied
     *
     * @return The field paymentAppliedId
     */
    public @Nullable String getPaymentAppliedId() { return this.paymentAppliedId; }
    /**
     * Unique identifier for payment applied
     *
     * @param value The new value for paymentAppliedId
     */
    public void setPaymentAppliedId(@Nullable String value) { this.paymentAppliedId = value; }
    /**
     * Payment type
     *
     * @return The field paymentType
     */
    public @Nullable String getPaymentType() { return this.paymentType; }
    /**
     * Payment type
     *
     * @param value The new value for paymentType
     */
    public void setPaymentType(@Nullable String value) { this.paymentType = value; }
    /**
     * Unique identifier for invoice payment is associated with
     *
     * @return The field invoiceId
     */
    public @Nullable String getInvoiceId() { return this.invoiceId; }
    /**
     * Unique identifier for invoice payment is associated with
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(@Nullable String value) { this.invoiceId = value; }
    /**
     * Invoice type payment is associated with
     *
     * @return The field invoiceTypeCode
     */
    public @Nullable String getInvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * Invoice type payment is associated with
     *
     * @param value The new value for invoiceTypeCode
     */
    public void setInvoiceTypeCode(@Nullable String value) { this.invoiceTypeCode = value; }
    /**
     * Invoice reference code payment is associated with
     *
     * @return The field invoiceReferenceCode
     */
    public @Nullable String getInvoiceReferenceCode() { return this.invoiceReferenceCode; }
    /**
     * Invoice reference code payment is associated with
     *
     * @param value The new value for invoiceReferenceCode
     */
    public void setInvoiceReferenceCode(@Nullable String value) { this.invoiceReferenceCode = value; }
    /**
     * Invoice total amount payment is associated with
     *
     * @return The field invoiceTotalAmount
     */
    public @NotNull Double getInvoiceTotalAmount() { return this.invoiceTotalAmount; }
    /**
     * Invoice total amount payment is associated with
     *
     * @param value The new value for invoiceTotalAmount
     */
    public void setInvoiceTotalAmount(@NotNull Double value) { this.invoiceTotalAmount = value; }
    /**
     * Date payment placed
     *
     * @return The field paymentDate
     */
    public @NotNull String getPaymentDate() { return this.paymentDate; }
    /**
     * Date payment placed
     *
     * @param value The new value for paymentDate
     */
    public void setPaymentDate(@NotNull String value) { this.paymentDate = value; }
    /**
     * Amount payment was made for
     *
     * @return The field paymentAmount
     */
    public @NotNull Double getPaymentAmount() { return this.paymentAmount; }
    /**
     * Amount payment was made for
     *
     * @param value The new value for paymentAmount
     */
    public void setPaymentAmount(@NotNull Double value) { this.paymentAmount = value; }
};
