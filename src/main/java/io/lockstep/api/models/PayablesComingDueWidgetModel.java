
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
 * Contains summary information for payables for the widget
 */
public class PayablesComingDueWidgetModel
{
    private @NotNull String groupKey;
    private @NotNull String date;
    private @Nullable String baseCurrencyCode;
    private @NotNull Double amountDue;

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
     * This model represents all the payables that are
     * either already due or due within this date.
     *
     * @return The field date
     */
    public @NotNull String getDate() { return this.date; }
    /**
     * This model represents all the payables that are
     * either already due or due within this date.
     *
     * @param value The new value for date
     */
    public void setDate(@NotNull String value) { this.date = value; }
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
     * Total amount due for this time period at the group's base currency.
     *
     * @return The field amountDue
     */
    public @NotNull Double getAmountDue() { return this.amountDue; }
    /**
     * Total amount due for this time period at the group's base currency.
     *
     * @param value The new value for amountDue
     */
    public void setAmountDue(@NotNull Double value) { this.amountDue = value; }
};
