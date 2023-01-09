
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
 * The totals for an Invoice Summary
 */
public class InvoiceSummaryTotalsModel
{
    private @NotNull Double totalInvoiceAmount;
    private @NotNull Double totalInvoiceBalance;

    /**
     * The total amount invoiced.
     *
     * @return The field totalInvoiceAmount
     */
    public @NotNull Double getTotalInvoiceAmount() { return this.totalInvoiceAmount; }
    /**
     * The total amount invoiced.
     *
     * @param value The new value for totalInvoiceAmount
     */
    public void setTotalInvoiceAmount(@NotNull Double value) { this.totalInvoiceAmount = value; }
    /**
     * The total outstanding balance
     *
     * @return The field totalInvoiceBalance
     */
    public @NotNull Double getTotalInvoiceBalance() { return this.totalInvoiceBalance; }
    /**
     * The total outstanding balance
     *
     * @param value The new value for totalInvoiceBalance
     */
    public void setTotalInvoiceBalance(@NotNull Double value) { this.totalInvoiceBalance = value; }
};
