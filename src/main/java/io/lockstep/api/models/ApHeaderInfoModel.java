
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
 * Aggregated Accounts Payable information.
 */
public class ApHeaderInfoModel
{
    private @NotNull String groupKey;
    private @Nullable String baseCurrencyCode;
    private @NotNull String reportDate;
    private @NotNull Integer totalVendors;
    private @NotNull Integer totalBills;
    private @NotNull Double totalBilledAmount;
    private @NotNull Double totalAdvancePayments;
    private @NotNull Double totalPaid;
    private @NotNull Double totalApAmount;
    private @NotNull Integer totalBillsPaid;
    private @NotNull Integer totalBillsPastDue;
    private @NotNull Integer totalBills90DaysPastDue;
    private @NotNull Double totalPastDueAmount;
    private @NotNull Double totalPastDueAmount90Days;
    private @NotNull Double percentageOfTotalAp;
    private @NotNull Double totalBilledAmountCurrentYear;
    private @NotNull Double totalBilledAmountPreviousYear;
    private @NotNull Double totalPaidAmountCurrentYear;
    private @NotNull Double percentageOfTotalAp90DaysPastDue;
    private @NotNull Integer vendorsPaidPastThirtyDays;
    private @NotNull Double amountPaidPastThirtyDays;
    private @NotNull Double advancePaymentAmountPastThirtyDays;
    private @NotNull Integer billsPaidPastThirtyDays;
    private @NotNull Integer billingVendorsPastThirtyDays;
    private @NotNull Double amountBilledPastThirtyDays;
    private @NotNull Double amountDuePastThirtyDays;
    private @NotNull Integer billsPastThirtyDays;

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
     * The base currency code of the group account
     *
     * @return The field baseCurrencyCode
     */
    public @Nullable String getBaseCurrencyCode() { return this.baseCurrencyCode; }
    /**
     * The base currency code of the group account
     *
     * @param value The new value for baseCurrencyCode
     */
    public void setBaseCurrencyCode(@Nullable String value) { this.baseCurrencyCode = value; }
    /**
     * The date of the report
     *
     * @return The field reportDate
     */
    public @NotNull String getReportDate() { return this.reportDate; }
    /**
     * The date of the report
     *
     * @param value The new value for reportDate
     */
    public void setReportDate(@NotNull String value) { this.reportDate = value; }
    /**
     * The total number of vendors.
     *
     * @return The field totalVendors
     */
    public @NotNull Integer getTotalVendors() { return this.totalVendors; }
    /**
     * The total number of vendors.
     *
     * @param value The new value for totalVendors
     */
    public void setTotalVendors(@NotNull Integer value) { this.totalVendors = value; }
    /**
     * The total number of bills.
     *
     * @return The field totalBills
     */
    public @NotNull Integer getTotalBills() { return this.totalBills; }
    /**
     * The total number of bills.
     *
     * @param value The new value for totalBills
     */
    public void setTotalBills(@NotNull Integer value) { this.totalBills = value; }
    /**
     * The total amount billed.
     *
     * @return The field totalBilledAmount
     */
    public @NotNull Double getTotalBilledAmount() { return this.totalBilledAmount; }
    /**
     * The total amount billed.
     *
     * @param value The new value for totalBilledAmount
     */
    public void setTotalBilledAmount(@NotNull Double value) { this.totalBilledAmount = value; }
    /**
     * The total number of advance payments.
     *
     * @return The field totalAdvancePayments
     */
    public @NotNull Double getTotalAdvancePayments() { return this.totalAdvancePayments; }
    /**
     * The total number of advance payments.
     *
     * @param value The new value for totalAdvancePayments
     */
    public void setTotalAdvancePayments(@NotNull Double value) { this.totalAdvancePayments = value; }
    /**
     * The total amount paid.
     *
     * @return The field totalPaid
     */
    public @NotNull Double getTotalPaid() { return this.totalPaid; }
    /**
     * The total amount paid.
     *
     * @param value The new value for totalPaid
     */
    public void setTotalPaid(@NotNull Double value) { this.totalPaid = value; }
    /**
     * The total accounts payable amount.
     *
     * @return The field totalApAmount
     */
    public @NotNull Double getTotalApAmount() { return this.totalApAmount; }
    /**
     * The total accounts payable amount.
     *
     * @param value The new value for totalApAmount
     */
    public void setTotalApAmount(@NotNull Double value) { this.totalApAmount = value; }
    /**
     * The number of paid bills.
     *
     * @return The field totalBillsPaid
     */
    public @NotNull Integer getTotalBillsPaid() { return this.totalBillsPaid; }
    /**
     * The number of paid bills.
     *
     * @param value The new value for totalBillsPaid
     */
    public void setTotalBillsPaid(@NotNull Integer value) { this.totalBillsPaid = value; }
    /**
     * The number of past due bills.
     *
     * @return The field totalBillsPastDue
     */
    public @NotNull Integer getTotalBillsPastDue() { return this.totalBillsPastDue; }
    /**
     * The number of past due bills.
     *
     * @param value The new value for totalBillsPastDue
     */
    public void setTotalBillsPastDue(@NotNull Integer value) { this.totalBillsPastDue = value; }
    /**
     * The number of bills 90+ days past due.
     *
     * @return The field totalBills90DaysPastDue
     */
    public @NotNull Integer getTotalBills90DaysPastDue() { return this.totalBills90DaysPastDue; }
    /**
     * The number of bills 90+ days past due.
     *
     * @param value The new value for totalBills90DaysPastDue
     */
    public void setTotalBills90DaysPastDue(@NotNull Integer value) { this.totalBills90DaysPastDue = value; }
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
     * The total amount for bills 90+ days past due.
     *
     * @return The field totalPastDueAmount90Days
     */
    public @NotNull Double getTotalPastDueAmount90Days() { return this.totalPastDueAmount90Days; }
    /**
     * The total amount for bills 90+ days past due.
     *
     * @param value The new value for totalPastDueAmount90Days
     */
    public void setTotalPastDueAmount90Days(@NotNull Double value) { this.totalPastDueAmount90Days = value; }
    /**
     * Portion of Total AP that is Past due.
     *
     * @return The field percentageOfTotalAp
     */
    public @NotNull Double getPercentageOfTotalAp() { return this.percentageOfTotalAp; }
    /**
     * Portion of Total AP that is Past due.
     *
     * @param value The new value for percentageOfTotalAp
     */
    public void setPercentageOfTotalAp(@NotNull Double value) { this.percentageOfTotalAp = value; }
    /**
     * The total amount billed, due this year.
     *
     * @return The field totalBilledAmountCurrentYear
     */
    public @NotNull Double getTotalBilledAmountCurrentYear() { return this.totalBilledAmountCurrentYear; }
    /**
     * The total amount billed, due this year.
     *
     * @param value The new value for totalBilledAmountCurrentYear
     */
    public void setTotalBilledAmountCurrentYear(@NotNull Double value) { this.totalBilledAmountCurrentYear = value; }
    /**
     * The total amount billed, due last year.
     *
     * @return The field totalBilledAmountPreviousYear
     */
    public @NotNull Double getTotalBilledAmountPreviousYear() { return this.totalBilledAmountPreviousYear; }
    /**
     * The total amount billed, due last year.
     *
     * @param value The new value for totalBilledAmountPreviousYear
     */
    public void setTotalBilledAmountPreviousYear(@NotNull Double value) { this.totalBilledAmountPreviousYear = value; }
    /**
     * The total of all payments made this year.
     *
     * @return The field totalPaidAmountCurrentYear
     */
    public @NotNull Double getTotalPaidAmountCurrentYear() { return this.totalPaidAmountCurrentYear; }
    /**
     * The total of all payments made this year.
     *
     * @param value The new value for totalPaidAmountCurrentYear
     */
    public void setTotalPaidAmountCurrentYear(@NotNull Double value) { this.totalPaidAmountCurrentYear = value; }
    /**
     * Portion of Total AP that is 90+ days Past due.
     *
     * @return The field percentageOfTotalAp90DaysPastDue
     */
    public @NotNull Double getPercentageOfTotalAp90DaysPastDue() { return this.percentageOfTotalAp90DaysPastDue; }
    /**
     * Portion of Total AP that is 90+ days Past due.
     *
     * @param value The new value for percentageOfTotalAp90DaysPastDue
     */
    public void setPercentageOfTotalAp90DaysPastDue(@NotNull Double value) { this.percentageOfTotalAp90DaysPastDue = value; }
    /**
     * The number of vendors who were paid within the past thirty days.
     *
     * @return The field vendorsPaidPastThirtyDays
     */
    public @NotNull Integer getVendorsPaidPastThirtyDays() { return this.vendorsPaidPastThirtyDays; }
    /**
     * The number of vendors who were paid within the past thirty days.
     *
     * @param value The new value for vendorsPaidPastThirtyDays
     */
    public void setVendorsPaidPastThirtyDays(@NotNull Integer value) { this.vendorsPaidPastThirtyDays = value; }
    /**
     * The total amount paid over the past thirty days.
     *
     * @return The field amountPaidPastThirtyDays
     */
    public @NotNull Double getAmountPaidPastThirtyDays() { return this.amountPaidPastThirtyDays; }
    /**
     * The total amount paid over the past thirty days.
     *
     * @param value The new value for amountPaidPastThirtyDays
     */
    public void setAmountPaidPastThirtyDays(@NotNull Double value) { this.amountPaidPastThirtyDays = value; }
    /**
     * The amount in advance from the payments made over the past thirty days.
     *
     * @return The field advancePaymentAmountPastThirtyDays
     */
    public @NotNull Double getAdvancePaymentAmountPastThirtyDays() { return this.advancePaymentAmountPastThirtyDays; }
    /**
     * The amount in advance from the payments made over the past thirty days.
     *
     * @param value The new value for advancePaymentAmountPastThirtyDays
     */
    public void setAdvancePaymentAmountPastThirtyDays(@NotNull Double value) { this.advancePaymentAmountPastThirtyDays = value; }
    /**
     * The number of bills paid over the past thirty days.
     *
     * @return The field billsPaidPastThirtyDays
     */
    public @NotNull Integer getBillsPaidPastThirtyDays() { return this.billsPaidPastThirtyDays; }
    /**
     * The number of bills paid over the past thirty days.
     *
     * @param value The new value for billsPaidPastThirtyDays
     */
    public void setBillsPaidPastThirtyDays(@NotNull Integer value) { this.billsPaidPastThirtyDays = value; }
    /**
     * The number of vendors that sent bills over the the past thirty days.
     *
     * @return The field billingVendorsPastThirtyDays
     */
    public @NotNull Integer getBillingVendorsPastThirtyDays() { return this.billingVendorsPastThirtyDays; }
    /**
     * The number of vendors that sent bills over the the past thirty days.
     *
     * @param value The new value for billingVendorsPastThirtyDays
     */
    public void setBillingVendorsPastThirtyDays(@NotNull Integer value) { this.billingVendorsPastThirtyDays = value; }
    /**
     * The total amount billed over the past thirty days.
     *
     * @return The field amountBilledPastThirtyDays
     */
    public @NotNull Double getAmountBilledPastThirtyDays() { return this.amountBilledPastThirtyDays; }
    /**
     * The total amount billed over the past thirty days.
     *
     * @param value The new value for amountBilledPastThirtyDays
     */
    public void setAmountBilledPastThirtyDays(@NotNull Double value) { this.amountBilledPastThirtyDays = value; }
    /**
     * The amount outstanding on the bills received over the past thirty days.
     *
     * @return The field amountDuePastThirtyDays
     */
    public @NotNull Double getAmountDuePastThirtyDays() { return this.amountDuePastThirtyDays; }
    /**
     * The amount outstanding on the bills received over the past thirty days.
     *
     * @param value The new value for amountDuePastThirtyDays
     */
    public void setAmountDuePastThirtyDays(@NotNull Double value) { this.amountDuePastThirtyDays = value; }
    /**
     * The number of bills received over the past thirty days.
     *
     * @return The field billsPastThirtyDays
     */
    public @NotNull Integer getBillsPastThirtyDays() { return this.billsPastThirtyDays; }
    /**
     * The number of bills received over the past thirty days.
     *
     * @param value The new value for billsPastThirtyDays
     */
    public void setBillsPastThirtyDays(@NotNull Integer value) { this.billsPastThirtyDays = value; }
};
