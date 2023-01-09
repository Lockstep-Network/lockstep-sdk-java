
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
 * Contains information about a credit memo invoice
 */
public class CreditMemoInvoiceModel
{
    private @NotNull String groupKey;
    private @Nullable String baseCurrencyCode;
    private @Nullable String currencyCode;
    private @NotNull String creditMemoAppliedId;
    private @NotNull String invoiceId;
    private @NotNull String creditMemoInvoiceId;
    private @Nullable String applyToInvoiceDate;
    private @NotNull Double creditMemoAppliedAmount;
    private @NotNull Double baseCurrencyCreditMemoAppliedAmount;
    private @Nullable String referenceCode;
    private @Nullable String companyId;
    private @Nullable String customerId;
    private @Nullable String invoiceStatusCode;
    private @Nullable Double totalAmount;
    private @Nullable Double outstandingBalanceAmount;
    private @Nullable Double baseCurrencyTotalAmount;
    private @Nullable Double baseCurrencyOutstandingBalanceAmount;

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
     * The base currency code of the group.
     *
     * @return The field baseCurrencyCode
     */
    public @Nullable String getBaseCurrencyCode() { return this.baseCurrencyCode; }
    /**
     * The base currency code of the group.
     *
     * @param value The new value for baseCurrencyCode
     */
    public void setBaseCurrencyCode(@Nullable String value) { this.baseCurrencyCode = value; }
    /**
     * The currency code of the credit memo invoice.
     *
     * @return The field currencyCode
     */
    public @Nullable String getCurrencyCode() { return this.currencyCode; }
    /**
     * The currency code of the credit memo invoice.
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(@Nullable String value) { this.currencyCode = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field creditMemoAppliedId
     */
    public @NotNull String getCreditMemoAppliedId() { return this.creditMemoAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for creditMemoAppliedId
     */
    public void setCreditMemoAppliedId(@NotNull String value) { this.creditMemoAppliedId = value; }
    /**
     * The id of the invoice
     *
     * @return The field invoiceId
     */
    public @NotNull String getInvoiceId() { return this.invoiceId; }
    /**
     * The id of the invoice
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(@NotNull String value) { this.invoiceId = value; }
    /**
     * The id of the credit memo invoice
     *
     * @return The field creditMemoInvoiceId
     */
    public @NotNull String getCreditMemoInvoiceId() { return this.creditMemoInvoiceId; }
    /**
     * The id of the credit memo invoice
     *
     * @param value The new value for creditMemoInvoiceId
     */
    public void setCreditMemoInvoiceId(@NotNull String value) { this.creditMemoInvoiceId = value; }
    /**
     * Date invoice applied to credit memo.
     *
     * @return The field applyToInvoiceDate
     */
    public @Nullable String getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date invoice applied to credit memo.
     *
     * @param value The new value for applyToInvoiceDate
     */
    public void setApplyToInvoiceDate(@Nullable String value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to credit memo.
     *
     * @return The field creditMemoAppliedAmount
     */
    public @NotNull Double getCreditMemoAppliedAmount() { return this.creditMemoAppliedAmount; }
    /**
     * Amount applied to credit memo.
     *
     * @param value The new value for creditMemoAppliedAmount
     */
    public void setCreditMemoAppliedAmount(@NotNull Double value) { this.creditMemoAppliedAmount = value; }
    /**
     * The amount applied to credit memo in the group's base currency.
     *
     * @return The field baseCurrencyCreditMemoAppliedAmount
     */
    public @NotNull Double getBaseCurrencyCreditMemoAppliedAmount() { return this.baseCurrencyCreditMemoAppliedAmount; }
    /**
     * The amount applied to credit memo in the group's base currency.
     *
     * @param value The new value for baseCurrencyCreditMemoAppliedAmount
     */
    public void setBaseCurrencyCreditMemoAppliedAmount(@NotNull Double value) { this.baseCurrencyCreditMemoAppliedAmount = value; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @return The field referenceCode
     */
    public @Nullable String getReferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @param value The new value for referenceCode
     */
    public void setReferenceCode(@Nullable String value) { this.referenceCode = value; }
    /**
     * The ID number of the company that created this invoice.
     *
     * @return The field companyId
     */
    public @Nullable String getCompanyId() { return this.companyId; }
    /**
     * The ID number of the company that created this invoice.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(@Nullable String value) { this.companyId = value; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @return The field customerId
     */
    public @Nullable String getCustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @param value The new value for customerId
     */
    public void setCustomerId(@Nullable String value) { this.customerId = value; }
    /**
     * A code identifying the status of this invoice.
     *
     * @return The field invoiceStatusCode
     */
    public @Nullable String getInvoiceStatusCode() { return this.invoiceStatusCode; }
    /**
     * A code identifying the status of this invoice.
     *
     * @param value The new value for invoiceStatusCode
     */
    public void setInvoiceStatusCode(@Nullable String value) { this.invoiceStatusCode = value; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     *
     * @return The field totalAmount
     */
    public @Nullable Double getTotalAmount() { return this.totalAmount; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     *
     * @param value The new value for totalAmount
     */
    public void setTotalAmount(@Nullable Double value) { this.totalAmount = value; }
    /**
     * The remaining balance value of this invoice.
     *
     * @return The field outstandingBalanceAmount
     */
    public @Nullable Double getOutstandingBalanceAmount() { return this.outstandingBalanceAmount; }
    /**
     * The remaining balance value of this invoice.
     *
     * @param value The new value for outstandingBalanceAmount
     */
    public void setOutstandingBalanceAmount(@Nullable Double value) { this.outstandingBalanceAmount = value; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items in the group's base currency.
     *
     * @return The field baseCurrencyTotalAmount
     */
    public @Nullable Double getBaseCurrencyTotalAmount() { return this.baseCurrencyTotalAmount; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items in the group's base currency.
     *
     * @param value The new value for baseCurrencyTotalAmount
     */
    public void setBaseCurrencyTotalAmount(@Nullable Double value) { this.baseCurrencyTotalAmount = value; }
    /**
     * The remaining balance value of this invoice in the group's base currency.
     *
     * @return The field baseCurrencyOutstandingBalanceAmount
     */
    public @Nullable Double getBaseCurrencyOutstandingBalanceAmount() { return this.baseCurrencyOutstandingBalanceAmount; }
    /**
     * The remaining balance value of this invoice in the group's base currency.
     *
     * @param value The new value for baseCurrencyOutstandingBalanceAmount
     */
    public void setBaseCurrencyOutstandingBalanceAmount(@Nullable Double value) { this.baseCurrencyOutstandingBalanceAmount = value; }
};
