
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
 * Contains summarized data for an invoice
 */
public class AtRiskInvoiceSummaryModel
{
    private @Nullable String reportDate;
    private @NotNull String groupKey;
    private @Nullable String customerId;
    private @NotNull String invoiceId;
    private @Nullable String invoiceNumber;
    private @Nullable String invoiceDate;
    private @Nullable String customerName;
    private @Nullable String status;
    private @Nullable String paymentDueDate;
    private @Nullable Double invoiceAmount;
    private @Nullable Double outstandingBalance;
    private @Nullable String invoiceTypeCode;
    private @Nullable String newestActivity;
    private @Nullable Integer daysPastDue;
    private @Nullable String[] paymentNumbers;
    private @Nullable String[] paymentIds;

    /**
     * The date of the report
     *
     * @return The field reportDate
     */
    public @Nullable String getReportDate() { return this.reportDate; }
    /**
     * The date of the report
     *
     * @param value The new value for reportDate
     */
    public void setReportDate(@Nullable String value) { this.reportDate = value; }
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
     * The unique ID number of this invoice.
     *
     * @return The field invoiceId
     */
    public @NotNull String getInvoiceId() { return this.invoiceId; }
    /**
     * The unique ID number of this invoice.
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(@NotNull String value) { this.invoiceId = value; }
    /**
     * A reference code that is used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @return The field invoiceNumber
     */
    public @Nullable String getInvoiceNumber() { return this.invoiceNumber; }
    /**
     * A reference code that is used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @param value The new value for invoiceNumber
     */
    public void setInvoiceNumber(@Nullable String value) { this.invoiceNumber = value; }
    /**
     * The reporting date for this invoice.
     *
     * @return The field invoiceDate
     */
    public @Nullable String getInvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     *
     * @param value The new value for invoiceDate
     */
    public void setInvoiceDate(@Nullable String value) { this.invoiceDate = value; }
    /**
     * The name of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @return The field customerName
     */
    public @Nullable String getCustomerName() { return this.customerName; }
    /**
     * The name of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @param value The new value for customerName
     */
    public void setCustomerName(@Nullable String value) { this.customerName = value; }
    /**
     * The status of the invoice.
     *
     * @return The field status
     */
    public @Nullable String getStatus() { return this.status; }
    /**
     * The status of the invoice.
     *
     * @param value The new value for status
     */
    public void setStatus(@Nullable String value) { this.status = value; }
    /**
     * The due date of the invoice.
     *
     * @return The field paymentDueDate
     */
    public @Nullable String getPaymentDueDate() { return this.paymentDueDate; }
    /**
     * The due date of the invoice.
     *
     * @param value The new value for paymentDueDate
     */
    public void setPaymentDueDate(@Nullable String value) { this.paymentDueDate = value; }
    /**
     * The total amount of the Invoice.
     *
     * @return The field invoiceAmount
     */
    public @Nullable Double getInvoiceAmount() { return this.invoiceAmount; }
    /**
     * The total amount of the Invoice.
     *
     * @param value The new value for invoiceAmount
     */
    public void setInvoiceAmount(@Nullable Double value) { this.invoiceAmount = value; }
    /**
     * The remaining balance value of this invoice.
     *
     * @return The field outstandingBalance
     */
    public @Nullable Double getOutstandingBalance() { return this.outstandingBalance; }
    /**
     * The remaining balance value of this invoice.
     *
     * @param value The new value for outstandingBalance
     */
    public void setOutstandingBalance(@Nullable Double value) { this.outstandingBalance = value; }
    /**
     * A code identifying the type of this Invoice.
     *
     * @return The field invoiceTypeCode
     */
    public @Nullable String getInvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this Invoice.
     *
     * @param value The new value for invoiceTypeCode
     */
    public void setInvoiceTypeCode(@Nullable String value) { this.invoiceTypeCode = value; }
    /**
     * The date stamp for the newest Activity on this Invoice.
     *
     * @return The field newestActivity
     */
    public @Nullable String getNewestActivity() { return this.newestActivity; }
    /**
     * The date stamp for the newest Activity on this Invoice.
     *
     * @param value The new value for newestActivity
     */
    public void setNewestActivity(@Nullable String value) { this.newestActivity = value; }
    /**
     * The number of days this Invoice is past due.
     *
     * @return The field daysPastDue
     */
    public @Nullable Integer getDaysPastDue() { return this.daysPastDue; }
    /**
     * The number of days this Invoice is past due.
     *
     * @param value The new value for daysPastDue
     */
    public void setDaysPastDue(@Nullable Integer value) { this.daysPastDue = value; }
    /**
     * The memo text of the payments associated to this invoice.
     *
     * @return The field paymentNumbers
     */
    public @Nullable String[] getPaymentNumbers() { return this.paymentNumbers; }
    /**
     * The memo text of the payments associated to this invoice.
     *
     * @param value The new value for paymentNumbers
     */
    public void setPaymentNumbers(@Nullable String[] value) { this.paymentNumbers = value; }
    /**
     * The ids of the payments associated to this invoice.
     *
     * @return The field paymentIds
     */
    public @Nullable String[] getPaymentIds() { return this.paymentIds; }
    /**
     * The ids of the payments associated to this invoice.
     *
     * @param value The new value for paymentIds
     */
    public void setPaymentIds(@Nullable String[] value) { this.paymentIds = value; }
};
