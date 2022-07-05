
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
 * Represents the daily sales outstanding report
 */
public class DailySalesOutstandingReportModel
{
    private @NotNull String timeframe;
    private @NotNull Double dailySalesOutstanding;

    /**
     * Timeframe (month) the daily sales outstanding values are associated with
     *
     * @return The field timeframe
     */
    public @NotNull String getTimeframe() { return this.timeframe; }
    /**
     * Timeframe (month) the daily sales outstanding values are associated with
     *
     * @param value The new value for timeframe
     */
    public void setTimeframe(@NotNull String value) { this.timeframe = value; }
    /**
     * Time (in days) between an invoice was completed paid off and when the invoice was issued
     *
     * @return The field dailySalesOutstanding
     */
    public @NotNull Double getDailySalesOutstanding() { return this.dailySalesOutstanding; }
    /**
     * Time (in days) between an invoice was completed paid off and when the invoice was issued
     *
     * @param value The new value for dailySalesOutstanding
     */
    public void setDailySalesOutstanding(@NotNull Double value) { this.dailySalesOutstanding = value; }
};
