
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
 * Contains summary information for payables that will be due soon
 */
public class PayablesComingDueHeaderModel
{
    private @NotNull String groupKey;
    private @NotNull Integer numberOfBillsDue;
    private @NotNull Integer numberOfVendors;
    private @NotNull Double percentageOfTotal;
    private @Nullable String baseCurrencyCode;
    private @NotNull Double totalAmountDue;
    private @NotNull String dueDate;

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
     * Number of bills due for this time period
     *
     * @return The field numberOfBillsDue
     */
    public @NotNull Integer getNumberOfBillsDue() { return this.numberOfBillsDue; }
    /**
     * Number of bills due for this time period
     *
     * @param value The new value for numberOfBillsDue
     */
    public void setNumberOfBillsDue(@NotNull Integer value) { this.numberOfBillsDue = value; }
    /**
     * Number of total vendors for this time period
     *
     * @return The field numberOfVendors
     */
    public @NotNull Integer getNumberOfVendors() { return this.numberOfVendors; }
    /**
     * Number of total vendors for this time period
     *
     * @param value The new value for numberOfVendors
     */
    public void setNumberOfVendors(@NotNull Integer value) { this.numberOfVendors = value; }
    /**
     * Percentage of total for this time period
     *
     * @return The field percentageOfTotal
     */
    public @NotNull Double getPercentageOfTotal() { return this.percentageOfTotal; }
    /**
     * Percentage of total for this time period
     *
     * @param value The new value for percentageOfTotal
     */
    public void setPercentageOfTotal(@NotNull Double value) { this.percentageOfTotal = value; }
    /**
     * The group's base currency code.
     *
     * @return The field baseCurrencyCode
     */
    public @Nullable String getBaseCurrencyCode() { return this.baseCurrencyCode; }
    /**
     * The group's base currency code.
     *
     * @param value The new value for baseCurrencyCode
     */
    public void setBaseCurrencyCode(@Nullable String value) { this.baseCurrencyCode = value; }
    /**
     * Total amount due for this time period in the group's base currency.
     *
     * @return The field totalAmountDue
     */
    public @NotNull Double getTotalAmountDue() { return this.totalAmountDue; }
    /**
     * Total amount due for this time period in the group's base currency.
     *
     * @param value The new value for totalAmountDue
     */
    public void setTotalAmountDue(@NotNull Double value) { this.totalAmountDue = value; }
    /**
     * This model represents all the payables that are
     * either already due or due within this date.
     *
     * @return The field dueDate
     */
    public @NotNull String getDueDate() { return this.dueDate; }
    /**
     * This model represents all the payables that are
     * either already due or due within this date.
     *
     * @param value The new value for dueDate
     */
    public void setDueDate(@NotNull String value) { this.dueDate = value; }
};
