
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
 * Aggregated Accounts Receivable information.
 */
public class ArHeaderInfoModel
{
    private @NotNull String groupKey;
    private @Nullable String reportPeriod;
    private @NotNull Integer totalCustomers;
    private @NotNull Integer totalInvoices;
    private @NotNull Double totalInvoicedAmount;
    private @NotNull Double totalUnappliedPayments;
    private @NotNull Double totalCollected;
    private @NotNull Double totalArAmount;
    private @NotNull Integer totalInvoicesPaid;
    private @NotNull Integer totalInvoicesPastDue;
    private @NotNull Integer totalInvoices90DaysPastDue;
    private @NotNull Double totalPastDueAmount;
    private @NotNull Double totalPastDueAmount90Days;
    private @NotNull Double percentageOfTotalAr;
    private @NotNull Double dso;
    private @NotNull Double totalInvoiceAmountCurrentYear;
    private @NotNull Double totalInvoiceAmountPreviousYear;
    private @NotNull Double totalPaymentAmountCurrentYear;
    private @NotNull Integer totalCollectedPastThirtyDays;
    private @NotNull Integer totalInvoicesPaidPastThirtyDays;
    private @NotNull Double percentageOfTotalAr90DaysPastDue;

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
     * The date of the report
     *
     * @return The field reportPeriod
     */
    public @Nullable String getReportPeriod() { return this.reportPeriod; }
    /**
     * The date of the report
     *
     * @param value The new value for reportPeriod
     */
    public void setReportPeriod(@Nullable String value) { this.reportPeriod = value; }
    /**
     * The total number of customers.
     *
     * @return The field totalCustomers
     */
    public @NotNull Integer getTotalCustomers() { return this.totalCustomers; }
    /**
     * The total number of customers.
     *
     * @param value The new value for totalCustomers
     */
    public void setTotalCustomers(@NotNull Integer value) { this.totalCustomers = value; }
    /**
     * The total number of invoices.
     *
     * @return The field totalInvoices
     */
    public @NotNull Integer getTotalInvoices() { return this.totalInvoices; }
    /**
     * The total number of invoices.
     *
     * @param value The new value for totalInvoices
     */
    public void setTotalInvoices(@NotNull Integer value) { this.totalInvoices = value; }
    /**
     * The total amount invoiced.
     *
     * @return The field totalInvoicedAmount
     */
    public @NotNull Double getTotalInvoicedAmount() { return this.totalInvoicedAmount; }
    /**
     * The total amount invoiced.
     *
     * @param value The new value for totalInvoicedAmount
     */
    public void setTotalInvoicedAmount(@NotNull Double value) { this.totalInvoicedAmount = value; }
    /**
     * The total number of unapplied payments.
     *
     * @return The field totalUnappliedPayments
     */
    public @NotNull Double getTotalUnappliedPayments() { return this.totalUnappliedPayments; }
    /**
     * The total number of unapplied payments.
     *
     * @param value The new value for totalUnappliedPayments
     */
    public void setTotalUnappliedPayments(@NotNull Double value) { this.totalUnappliedPayments = value; }
    /**
     * The total amount of collected payments.
     *
     * @return The field totalCollected
     */
    public @NotNull Double getTotalCollected() { return this.totalCollected; }
    /**
     * The total amount of collected payments.
     *
     * @param value The new value for totalCollected
     */
    public void setTotalCollected(@NotNull Double value) { this.totalCollected = value; }
    /**
     * The total accounts receivable amount.
     *
     * @return The field totalArAmount
     */
    public @NotNull Double getTotalArAmount() { return this.totalArAmount; }
    /**
     * The total accounts receivable amount.
     *
     * @param value The new value for totalArAmount
     */
    public void setTotalArAmount(@NotNull Double value) { this.totalArAmount = value; }
    /**
     * The number of paid invoices.
     *
     * @return The field totalInvoicesPaid
     */
    public @NotNull Integer getTotalInvoicesPaid() { return this.totalInvoicesPaid; }
    /**
     * The number of paid invoices.
     *
     * @param value The new value for totalInvoicesPaid
     */
    public void setTotalInvoicesPaid(@NotNull Integer value) { this.totalInvoicesPaid = value; }
    /**
     * The number of past due invoices.
     *
     * @return The field totalInvoicesPastDue
     */
    public @NotNull Integer getTotalInvoicesPastDue() { return this.totalInvoicesPastDue; }
    /**
     * The number of past due invoices.
     *
     * @param value The new value for totalInvoicesPastDue
     */
    public void setTotalInvoicesPastDue(@NotNull Integer value) { this.totalInvoicesPastDue = value; }
    /**
     * The number of past due invoices for the last 90 days.
     *
     * @return The field totalInvoices90DaysPastDue
     */
    public @NotNull Integer getTotalInvoices90DaysPastDue() { return this.totalInvoices90DaysPastDue; }
    /**
     * The number of past due invoices for the last 90 days.
     *
     * @param value The new value for totalInvoices90DaysPastDue
     */
    public void setTotalInvoices90DaysPastDue(@NotNull Integer value) { this.totalInvoices90DaysPastDue = value; }
    /**
     * The total amount past due.
     *
     * @return The field totalPastDueAmount
     */
    public @NotNull Double getTotalPastDueAmount() { return this.totalPastDueAmount; }
    /**
     * The total amount past due.
     *
     * @param value The new value for totalPastDueAmount
     */
    public void setTotalPastDueAmount(@NotNull Double value) { this.totalPastDueAmount = value; }
    /**
     * The total past due for the past 90 days.
     *
     * @return The field totalPastDueAmount90Days
     */
    public @NotNull Double getTotalPastDueAmount90Days() { return this.totalPastDueAmount90Days; }
    /**
     * The total past due for the past 90 days.
     *
     * @param value The new value for totalPastDueAmount90Days
     */
    public void setTotalPastDueAmount90Days(@NotNull Double value) { this.totalPastDueAmount90Days = value; }
    /**
     * Portion of Total AR that is Past due.
     *
     * @return The field percentageOfTotalAr
     */
    public @NotNull Double getPercentageOfTotalAr() { return this.percentageOfTotalAr; }
    /**
     * Portion of Total AR that is Past due.
     *
     * @param value The new value for percentageOfTotalAr
     */
    public void setPercentageOfTotalAr(@NotNull Double value) { this.percentageOfTotalAr = value; }
    /**
     * Daily sales outstanding.
     *
     * @return The field dso
     */
    public @NotNull Double getDso() { return this.dso; }
    /**
     * Daily sales outstanding.
     *
     * @param value The new value for dso
     */
    public void setDso(@NotNull Double value) { this.dso = value; }
    /**
     * The total amount invoiced, due this year.
     *
     * @return The field totalInvoiceAmountCurrentYear
     */
    public @NotNull Double getTotalInvoiceAmountCurrentYear() { return this.totalInvoiceAmountCurrentYear; }
    /**
     * The total amount invoiced, due this year.
     *
     * @param value The new value for totalInvoiceAmountCurrentYear
     */
    public void setTotalInvoiceAmountCurrentYear(@NotNull Double value) { this.totalInvoiceAmountCurrentYear = value; }
    /**
     * The total amount invoiced, due last year.
     *
     * @return The field totalInvoiceAmountPreviousYear
     */
    public @NotNull Double getTotalInvoiceAmountPreviousYear() { return this.totalInvoiceAmountPreviousYear; }
    /**
     * The total amount invoiced, due last year.
     *
     * @param value The new value for totalInvoiceAmountPreviousYear
     */
    public void setTotalInvoiceAmountPreviousYear(@NotNull Double value) { this.totalInvoiceAmountPreviousYear = value; }
    /**
     * The total of all payments received this year.
     *
     * @return The field totalPaymentAmountCurrentYear
     */
    public @NotNull Double getTotalPaymentAmountCurrentYear() { return this.totalPaymentAmountCurrentYear; }
    /**
     * The total of all payments received this year.
     *
     * @param value The new value for totalPaymentAmountCurrentYear
     */
    public void setTotalPaymentAmountCurrentYear(@NotNull Double value) { this.totalPaymentAmountCurrentYear = value; }
    /**
     * The total amount of payments received in the last 30 days
     *
     * @return The field totalCollectedPastThirtyDays
     */
    public @NotNull Integer getTotalCollectedPastThirtyDays() { return this.totalCollectedPastThirtyDays; }
    /**
     * The total amount of payments received in the last 30 days
     *
     * @param value The new value for totalCollectedPastThirtyDays
     */
    public void setTotalCollectedPastThirtyDays(@NotNull Integer value) { this.totalCollectedPastThirtyDays = value; }
    /**
     * The total amount of Invoices paid in the last 30 days
     *
     * @return The field totalInvoicesPaidPastThirtyDays
     */
    public @NotNull Integer getTotalInvoicesPaidPastThirtyDays() { return this.totalInvoicesPaidPastThirtyDays; }
    /**
     * The total amount of Invoices paid in the last 30 days
     *
     * @param value The new value for totalInvoicesPaidPastThirtyDays
     */
    public void setTotalInvoicesPaidPastThirtyDays(@NotNull Integer value) { this.totalInvoicesPaidPastThirtyDays = value; }
    /**
     * Portion of Total AR that is 90+ days Past due.
     *
     * @return The field percentageOfTotalAr90DaysPastDue
     */
    public @NotNull Double getPercentageOfTotalAr90DaysPastDue() { return this.percentageOfTotalAr90DaysPastDue; }
    /**
     * Portion of Total AR that is 90+ days Past due.
     *
     * @param value The new value for percentageOfTotalAr90DaysPastDue
     */
    public void setPercentageOfTotalAr90DaysPastDue(@NotNull Double value) { this.percentageOfTotalAr90DaysPastDue = value; }
};
