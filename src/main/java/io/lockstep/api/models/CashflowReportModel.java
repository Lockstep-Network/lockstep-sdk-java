
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
 * Represents the cashflow report based on a timeframe
 */
public class CashflowReportModel
{
    private @NotNull Integer timeframe;
    private @NotNull Double paymentsCollected;
    private @NotNull Integer paymentsCollectedCount;
    private @NotNull Double invoicesBilled;
    private @NotNull Integer invoicesBilledCount;

    /**
     * Timeframe in days the cashflow report is generated on
     *
     * @return The field timeframe
     */
    public @NotNull Integer getTimeframe() { return this.timeframe; }
    /**
     * Timeframe in days the cashflow report is generated on
     *
     * @param value The new value for timeframe
     */
    public void setTimeframe(@NotNull Integer value) { this.timeframe = value; }
    /**
     * Amount of payments collected based in the timeframe
     *
     * @return The field paymentsCollected
     */
    public @NotNull Double getPaymentsCollected() { return this.paymentsCollected; }
    /**
     * Amount of payments collected based in the timeframe
     *
     * @param value The new value for paymentsCollected
     */
    public void setPaymentsCollected(@NotNull Double value) { this.paymentsCollected = value; }
    /**
     * Number of payments collected based in the timeframe
     *
     * @return The field paymentsCollectedCount
     */
    public @NotNull Integer getPaymentsCollectedCount() { return this.paymentsCollectedCount; }
    /**
     * Number of payments collected based in the timeframe
     *
     * @param value The new value for paymentsCollectedCount
     */
    public void setPaymentsCollectedCount(@NotNull Integer value) { this.paymentsCollectedCount = value; }
    /**
     * Amount of invoices billed based in the timeframe
     *
     * @return The field invoicesBilled
     */
    public @NotNull Double getInvoicesBilled() { return this.invoicesBilled; }
    /**
     * Amount of invoices billed based in the timeframe
     *
     * @param value The new value for invoicesBilled
     */
    public void setInvoicesBilled(@NotNull Double value) { this.invoicesBilled = value; }
    /**
     * Number of invoices billed in the timeframe
     *
     * @return The field invoicesBilledCount
     */
    public @NotNull Integer getInvoicesBilledCount() { return this.invoicesBilledCount; }
    /**
     * Number of invoices billed in the timeframe
     *
     * @param value The new value for invoicesBilledCount
     */
    public void setInvoicesBilledCount(@NotNull Integer value) { this.invoicesBilledCount = value; }
};
