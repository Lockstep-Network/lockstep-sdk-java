
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
 * Represents the group totals for the values found in the daily payable outstanding summary
 */
public class DpoSummaryGroupTotalModel
{
    private @NotNull String groupKey;
    private @NotNull Integer vendors;
    private @NotNull Integer bills;
    private @NotNull Double amountOutstanding;
    private @NotNull Double dpo;

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
     * The total number of vendors with outstanding bills
     *
     * @return The field vendors
     */
    public @NotNull Integer getVendors() { return this.vendors; }
    /**
     * The total number of vendors with outstanding bills
     *
     * @param value The new value for vendors
     */
    public void setVendors(@NotNull Integer value) { this.vendors = value; }
    /**
     * The total number of bills outstanding
     *
     * @return The field bills
     */
    public @NotNull Integer getBills() { return this.bills; }
    /**
     * The total number of bills outstanding
     *
     * @param value The new value for bills
     */
    public void setBills(@NotNull Integer value) { this.bills = value; }
    /**
     * The total amount outstanding
     *
     * @return The field amountOutstanding
     */
    public @NotNull Double getAmountOutstanding() { return this.amountOutstanding; }
    /**
     * The total amount outstanding
     *
     * @param value The new value for amountOutstanding
     */
    public void setAmountOutstanding(@NotNull Double value) { this.amountOutstanding = value; }
    /**
     * The total dpo for the group key
     *
     * @return The field dpo
     */
    public @NotNull Double getDpo() { return this.dpo; }
    /**
     * The total dpo for the group key
     *
     * @param value The new value for dpo
     */
    public void setDpo(@NotNull Double value) { this.dpo = value; }
};
