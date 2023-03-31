
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
 * Contains summarized data for a customer
 */
public class CustomerSummaryModel
{
    private @NotNull String groupKey;
    private @NotNull String companyId;
    private @Nullable String companyName;
    private @Nullable String primaryContact;
    private @Nullable String appEnrollmentId;
    private @Nullable Integer outstandingInvoices;
    private @Nullable Integer totalInvoicesOpen;
    private @Nullable Integer totalInvoicesPastDue;
    private @Nullable Integer closedInvoices;
    private @Nullable Integer closedInvoicesPastThirtyDays;
    private @Nullable Double amountCollected;
    private @Nullable Double amountCollectedPastThirtyDays;
    private @Nullable Double outstandingAmount;
    private @Nullable Double invoicedAmountPastThirtyDays;
    private @Nullable Double outstandingAmountPastThirtyDays;
    private @Nullable Integer invoicesPastThirtyDays;
    private @Nullable Double amountPastDue;
    private @Nullable Double unappliedPayments;
    private @Nullable Double unappliedAmountPastThirtyDays;
    private @Nullable Double percentOfTotalAr;
    private @Nullable Double dso;
    private @NotNull String modified;

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
     * The unique ID of this company.
     *
     * @return The field companyId
     */
    public @NotNull String getCompanyId() { return this.companyId; }
    /**
     * The unique ID of this company.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(@NotNull String value) { this.companyId = value; }
    /**
     * The name of the company.
     *
     * @return The field companyName
     */
    public @Nullable String getCompanyName() { return this.companyName; }
    /**
     * The name of the company.
     *
     * @param value The new value for companyName
     */
    public void setCompanyName(@Nullable String value) { this.companyName = value; }
    /**
     * The name of the primary contact.
     *
     * @return The field primaryContact
     */
    public @Nullable String getPrimaryContact() { return this.primaryContact; }
    /**
     * The name of the primary contact.
     *
     * @param value The new value for primaryContact
     */
    public void setPrimaryContact(@Nullable String value) { this.primaryContact = value; }
    /**
     * The app enrollment ID this Customer is associated with
     *
     * @return The field appEnrollmentId
     */
    public @Nullable String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The app enrollment ID this Customer is associated with
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@Nullable String value) { this.appEnrollmentId = value; }
    /**
     * The number of outstanding invoices for this customer.
     *
     * @return The field outstandingInvoices
     */
    public @Nullable Integer getOutstandingInvoices() { return this.outstandingInvoices; }
    /**
     * The number of outstanding invoices for this customer.
     *
     * @param value The new value for outstandingInvoices
     */
    public void setOutstandingInvoices(@Nullable Integer value) { this.outstandingInvoices = value; }
    /**
     * The number of open invoices.
     *
     * @return The field totalInvoicesOpen
     */
    public @Nullable Integer getTotalInvoicesOpen() { return this.totalInvoicesOpen; }
    /**
     * The number of open invoices.
     *
     * @param value The new value for totalInvoicesOpen
     */
    public void setTotalInvoicesOpen(@Nullable Integer value) { this.totalInvoicesOpen = value; }
    /**
     * The number of past due invoices.
     *
     * @return The field totalInvoicesPastDue
     */
    public @Nullable Integer getTotalInvoicesPastDue() { return this.totalInvoicesPastDue; }
    /**
     * The number of past due invoices.
     *
     * @param value The new value for totalInvoicesPastDue
     */
    public void setTotalInvoicesPastDue(@Nullable Integer value) { this.totalInvoicesPastDue = value; }
    /**
     * The number of closed invoices for this customer.
     *
     * @return The field closedInvoices
     */
    public @Nullable Integer getClosedInvoices() { return this.closedInvoices; }
    /**
     * The number of closed invoices for this customer.
     *
     * @param value The new value for closedInvoices
     */
    public void setClosedInvoices(@Nullable Integer value) { this.closedInvoices = value; }
    /**
     * The number of closed invoices for this customer in the past thirty days.
     *
     * @return The field closedInvoicesPastThirtyDays
     */
    public @Nullable Integer getClosedInvoicesPastThirtyDays() { return this.closedInvoicesPastThirtyDays; }
    /**
     * The number of closed invoices for this customer in the past thirty days.
     *
     * @param value The new value for closedInvoicesPastThirtyDays
     */
    public void setClosedInvoicesPastThirtyDays(@Nullable Integer value) { this.closedInvoicesPastThirtyDays = value; }
    /**
     * The total from collected payments.
     *
     * @return The field amountCollected
     */
    public @Nullable Double getAmountCollected() { return this.amountCollected; }
    /**
     * The total from collected payments.
     *
     * @param value The new value for amountCollected
     */
    public void setAmountCollected(@Nullable Double value) { this.amountCollected = value; }
    /**
     * The total from collected payments in the past thirty days.
     *
     * @return The field amountCollectedPastThirtyDays
     */
    public @Nullable Double getAmountCollectedPastThirtyDays() { return this.amountCollectedPastThirtyDays; }
    /**
     * The total from collected payments in the past thirty days.
     *
     * @param value The new value for amountCollectedPastThirtyDays
     */
    public void setAmountCollectedPastThirtyDays(@Nullable Double value) { this.amountCollectedPastThirtyDays = value; }
    /**
     * The total balance of outstanding invoices.
     *
     * @return The field outstandingAmount
     */
    public @Nullable Double getOutstandingAmount() { return this.outstandingAmount; }
    /**
     * The total balance of outstanding invoices.
     *
     * @param value The new value for outstandingAmount
     */
    public void setOutstandingAmount(@Nullable Double value) { this.outstandingAmount = value; }
    /**
     * The total amount invoiced in the past thirty days.
     *
     * @return The field invoicedAmountPastThirtyDays
     */
    public @Nullable Double getInvoicedAmountPastThirtyDays() { return this.invoicedAmountPastThirtyDays; }
    /**
     * The total amount invoiced in the past thirty days.
     *
     * @param value The new value for invoicedAmountPastThirtyDays
     */
    public void setInvoicedAmountPastThirtyDays(@Nullable Double value) { this.invoicedAmountPastThirtyDays = value; }
    /**
     * The total amount outstanding from the invoices invoiced in the past thirty days.
     *
     * @return The field outstandingAmountPastThirtyDays
     */
    public @Nullable Double getOutstandingAmountPastThirtyDays() { return this.outstandingAmountPastThirtyDays; }
    /**
     * The total amount outstanding from the invoices invoiced in the past thirty days.
     *
     * @param value The new value for outstandingAmountPastThirtyDays
     */
    public void setOutstandingAmountPastThirtyDays(@Nullable Double value) { this.outstandingAmountPastThirtyDays = value; }
    /**
     * The number of invoices invoiced in the past thirty days.
     *
     * @return The field invoicesPastThirtyDays
     */
    public @Nullable Integer getInvoicesPastThirtyDays() { return this.invoicesPastThirtyDays; }
    /**
     * The number of invoices invoiced in the past thirty days.
     *
     * @param value The new value for invoicesPastThirtyDays
     */
    public void setInvoicesPastThirtyDays(@Nullable Integer value) { this.invoicesPastThirtyDays = value; }
    /**
     * The total amount past due for this customer.
     *
     * @return The field amountPastDue
     */
    public @Nullable Double getAmountPastDue() { return this.amountPastDue; }
    /**
     * The total amount past due for this customer.
     *
     * @param value The new value for amountPastDue
     */
    public void setAmountPastDue(@Nullable Double value) { this.amountPastDue = value; }
    /**
     * The total value of unapplied Payments for this Customer.
     *
     * @return The field unappliedPayments
     */
    public @Nullable Double getUnappliedPayments() { return this.unappliedPayments; }
    /**
     * The total value of unapplied Payments for this Customer.
     *
     * @param value The new value for unappliedPayments
     */
    public void setUnappliedPayments(@Nullable Double value) { this.unappliedPayments = value; }
    /**
     * The total value of unapplied Payments for this Customer in the past thirty days.
     *
     * @return The field unappliedAmountPastThirtyDays
     */
    public @Nullable Double getUnappliedAmountPastThirtyDays() { return this.unappliedAmountPastThirtyDays; }
    /**
     * The total value of unapplied Payments for this Customer in the past thirty days.
     *
     * @param value The new value for unappliedAmountPastThirtyDays
     */
    public void setUnappliedAmountPastThirtyDays(@Nullable Double value) { this.unappliedAmountPastThirtyDays = value; }
    /**
     * Portion of Total AR for this Customer that is Past due. (TotalPastDue / Total AR).
     *
     * @return The field percentOfTotalAr
     */
    public @Nullable Double getPercentOfTotalAr() { return this.percentOfTotalAr; }
    /**
     * Portion of Total AR for this Customer that is Past due. (TotalPastDue / Total AR).
     *
     * @param value The new value for percentOfTotalAr
     */
    public void setPercentOfTotalAr(@Nullable Double value) { this.percentOfTotalAr = value; }
    /**
     * Daily sales outstanding value for this Customer.
     *
     * @return The field dso
     */
    public @Nullable Double getDso() { return this.dso; }
    /**
     * Daily sales outstanding value for this Customer.
     *
     * @param value The new value for dso
     */
    public void setDso(@Nullable Double value) { this.dso = value; }
    /**
     * The modified date of the customer.
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The modified date of the customer.
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
};
