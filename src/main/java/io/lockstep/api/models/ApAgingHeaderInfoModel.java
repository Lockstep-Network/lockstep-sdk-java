
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
 * Aggregated Accounts Payable Aging information.
 */
public class ApAgingHeaderInfoModel
{
    private @NotNull String groupKey;
    private @Nullable String reportBucket;
    private @NotNull Integer totalVendors;
    private @NotNull Integer totalBillsOutstanding;
    private @NotNull Double totalBillsOutstandingAmount;
    private @NotNull Double totalCreditMemoOutstandingAmount;
    private @NotNull Double totalAdvancePaymentAmount;
    private @NotNull Double totalOutstandingAmount;
    private @NotNull Double totalApAmount;
    private @NotNull Double percentageOfTotalAp;

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
     * The aging bucket this data belongs to.
     *
     * @return The field reportBucket
     */
    public @Nullable String getReportBucket() { return this.reportBucket; }
    /**
     * The aging bucket this data belongs to.
     *
     * @param value The new value for reportBucket
     */
    public void setReportBucket(@Nullable String value) { this.reportBucket = value; }
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
     * The total number of bills outstanding.
     *
     * @return The field totalBillsOutstanding
     */
    public @NotNull Integer getTotalBillsOutstanding() { return this.totalBillsOutstanding; }
    /**
     * The total number of bills outstanding.
     *
     * @param value The new value for totalBillsOutstanding
     */
    public void setTotalBillsOutstanding(@NotNull Integer value) { this.totalBillsOutstanding = value; }
    /**
     * The total amount outstanding on bills.
     *
     * @return The field totalBillsOutstandingAmount
     */
    public @NotNull Double getTotalBillsOutstandingAmount() { return this.totalBillsOutstandingAmount; }
    /**
     * The total amount outstanding on bills.
     *
     * @param value The new value for totalBillsOutstandingAmount
     */
    public void setTotalBillsOutstandingAmount(@NotNull Double value) { this.totalBillsOutstandingAmount = value; }
    /**
     * The total amount outstanding on credit memos.
     *
     * @return The field totalCreditMemoOutstandingAmount
     */
    public @NotNull Double getTotalCreditMemoOutstandingAmount() { return this.totalCreditMemoOutstandingAmount; }
    /**
     * The total amount outstanding on credit memos.
     *
     * @param value The new value for totalCreditMemoOutstandingAmount
     */
    public void setTotalCreditMemoOutstandingAmount(@NotNull Double value) { this.totalCreditMemoOutstandingAmount = value; }
    /**
     * The total amount of advance payments.
     *
     * @return The field totalAdvancePaymentAmount
     */
    public @NotNull Double getTotalAdvancePaymentAmount() { return this.totalAdvancePaymentAmount; }
    /**
     * The total amount of advance payments.
     *
     * @param value The new value for totalAdvancePaymentAmount
     */
    public void setTotalAdvancePaymentAmount(@NotNull Double value) { this.totalAdvancePaymentAmount = value; }
    /**
     * The total amount outstanding.
     *
     * @return The field totalOutstandingAmount
     */
    public @NotNull Double getTotalOutstandingAmount() { return this.totalOutstandingAmount; }
    /**
     * The total amount outstanding.
     *
     * @param value The new value for totalOutstandingAmount
     */
    public void setTotalOutstandingAmount(@NotNull Double value) { this.totalOutstandingAmount = value; }
    /**
     * The total amount for AP.
     *
     * @return The field totalApAmount
     */
    public @NotNull Double getTotalApAmount() { return this.totalApAmount; }
    /**
     * The total amount for AP.
     *
     * @param value The new value for totalApAmount
     */
    public void setTotalApAmount(@NotNull Double value) { this.totalApAmount = value; }
    /**
     * Portion of Total AP this data represents.
     *
     * @return The field percentageOfTotalAp
     */
    public @NotNull Double getPercentageOfTotalAp() { return this.percentageOfTotalAp; }
    /**
     * Portion of Total AP this data represents.
     *
     * @param value The new value for percentageOfTotalAp
     */
    public void setPercentageOfTotalAp(@NotNull Double value) { this.percentageOfTotalAp = value; }
};
