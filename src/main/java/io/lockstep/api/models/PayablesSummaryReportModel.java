
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
 * Represents the payables summary report based on a timeframe
 */
public class PayablesSummaryReportModel
{
    private @NotNull String groupKey;
    private @NotNull Integer timeframe;
    private @Nullable String baseCurrencyCode;
    private @NotNull Double totalPaymentsAmount;
    private @NotNull Integer totalPaymentsCount;
    private @NotNull Double totalAmountBilled;
    private @NotNull Integer totalBillsCount;

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
     * Timeframe in days the payables summary report is generated on
     *
     * @return The field timeframe
     */
    public @NotNull Integer getTimeframe() { return this.timeframe; }
    /**
     * Timeframe in days the payables summary report is generated on
     *
     * @param value The new value for timeframe
     */
    public void setTimeframe(@NotNull Integer value) { this.timeframe = value; }
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
     * Amount of payments made based in the timeframe in the group's base currency.
     *
     * @return The field totalPaymentsAmount
     */
    public @NotNull Double getTotalPaymentsAmount() { return this.totalPaymentsAmount; }
    /**
     * Amount of payments made based in the timeframe in the group's base currency.
     *
     * @param value The new value for totalPaymentsAmount
     */
    public void setTotalPaymentsAmount(@NotNull Double value) { this.totalPaymentsAmount = value; }
    /**
     * Number of payments made based in the timeframe
     *
     * @return The field totalPaymentsCount
     */
    public @NotNull Integer getTotalPaymentsCount() { return this.totalPaymentsCount; }
    /**
     * Number of payments made based in the timeframe
     *
     * @param value The new value for totalPaymentsCount
     */
    public void setTotalPaymentsCount(@NotNull Integer value) { this.totalPaymentsCount = value; }
    /**
     * Amount of bills received based in the timeframe in the group's base currency.
     *
     * @return The field totalAmountBilled
     */
    public @NotNull Double getTotalAmountBilled() { return this.totalAmountBilled; }
    /**
     * Amount of bills received based in the timeframe in the group's base currency.
     *
     * @param value The new value for totalAmountBilled
     */
    public void setTotalAmountBilled(@NotNull Double value) { this.totalAmountBilled = value; }
    /**
     * Number of bills received in the timeframe
     *
     * @return The field totalBillsCount
     */
    public @NotNull Integer getTotalBillsCount() { return this.totalBillsCount; }
    /**
     * Number of bills received in the timeframe
     *
     * @param value The new value for totalBillsCount
     */
    public void setTotalBillsCount(@NotNull Integer value) { this.totalBillsCount = value; }
};
