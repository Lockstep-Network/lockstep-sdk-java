
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
 * Represents the daily payable outstanding report
 */
public class DailyPayableOutstandingReportModel
{
    private @NotNull String timeframe;
    private @NotNull Integer invoiceCount;
    private @NotNull Double dailyPayableOutstanding;

    /**
     * Timeframe (quarter) the daily payable outstanding values are associated with
     *
     * @return The field timeframe
     */
    public @NotNull String getTimeframe() { return this.timeframe; }
    /**
     * Timeframe (quarter) the daily payable outstanding values are associated with
     *
     * @param value The new value for timeframe
     */
    public void setTimeframe(@NotNull String value) { this.timeframe = value; }
    /**
     * Number of invoices the average daily payable outstanding is calculated on
     *
     * @return The field invoiceCount
     */
    public @NotNull Integer getInvoiceCount() { return this.invoiceCount; }
    /**
     * Number of invoices the average daily payable outstanding is calculated on
     *
     * @param value The new value for invoiceCount
     */
    public void setInvoiceCount(@NotNull Integer value) { this.invoiceCount = value; }
    /**
     * Time (in days) between an invoice was completed paid off and when the invoice was issued
     *
     * @return The field dailyPayableOutstanding
     */
    public @NotNull Double getDailyPayableOutstanding() { return this.dailyPayableOutstanding; }
    /**
     * Time (in days) between an invoice was completed paid off and when the invoice was issued
     *
     * @param value The new value for dailyPayableOutstanding
     */
    public void setDailyPayableOutstanding(@NotNull Double value) { this.dailyPayableOutstanding = value; }
};
