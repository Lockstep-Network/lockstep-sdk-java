
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
 * Aggregated Accounts Receivable Aging information.
 */
public class ArAgingHeaderInfoModel
{
    private @NotNull String groupKey;
    private @Nullable String reportBucket;
    private @NotNull Integer totalCustomers;
    private @NotNull Integer totalInvoicesOutstanding;
    private @NotNull Double totalOutstandingAmount;
    private @NotNull Double totalArAmount;
    private @NotNull Double percentageOfTotalAr;

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
     * The total number of invoices outstanding.
     *
     * @return The field totalInvoicesOutstanding
     */
    public @NotNull Integer getTotalInvoicesOutstanding() { return this.totalInvoicesOutstanding; }
    /**
     * The total number of invoices outstanding.
     *
     * @param value The new value for totalInvoicesOutstanding
     */
    public void setTotalInvoicesOutstanding(@NotNull Integer value) { this.totalInvoicesOutstanding = value; }
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
     * The total amount for AR.
     *
     * @return The field totalArAmount
     */
    public @NotNull Double getTotalArAmount() { return this.totalArAmount; }
    /**
     * The total amount for AR.
     *
     * @param value The new value for totalArAmount
     */
    public void setTotalArAmount(@NotNull Double value) { this.totalArAmount = value; }
    /**
     * Portion of Total AR this data represents.
     *
     * @return The field percentageOfTotalAr
     */
    public @NotNull Double getPercentageOfTotalAr() { return this.percentageOfTotalAr; }
    /**
     * Portion of Total AR this data represents.
     *
     * @param value The new value for percentageOfTotalAr
     */
    public void setPercentageOfTotalAr(@NotNull Double value) { this.percentageOfTotalAr = value; }
};
