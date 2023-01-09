
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
 * Represents transaction summary information based on the query request within the group account.
 */
public class TransactionSummaryTotalModel
{
    private @NotNull Integer totalCount;
    private @NotNull Double totalAmount;
    private @NotNull Double outstandingAmount;
    private @NotNull Integer invoiceOpenCount;
    private @NotNull Integer invoicePastDueCount;

    /**
     * Total count of all transactions from the query request.
     *
     * @return The field totalCount
     */
    public @NotNull Integer getTotalCount() { return this.totalCount; }
    /**
     * Total count of all transactions from the query request.
     *
     * @param value The new value for totalCount
     */
    public void setTotalCount(@NotNull Integer value) { this.totalCount = value; }
    /**
     * Total value of all transactions from the query request.
     *
     * @return The field totalAmount
     */
    public @NotNull Double getTotalAmount() { return this.totalAmount; }
    /**
     * Total value of all transactions from the query request.
     *
     * @param value The new value for totalAmount
     */
    public void setTotalAmount(@NotNull Double value) { this.totalAmount = value; }
    /**
     * Total outstanding amount value of all transactions from the query request.
     *
     * @return The field outstandingAmount
     */
    public @NotNull Double getOutstandingAmount() { return this.outstandingAmount; }
    /**
     * Total outstanding amount value of all transactions from the query request.
     *
     * @param value The new value for outstandingAmount
     */
    public void setOutstandingAmount(@NotNull Double value) { this.outstandingAmount = value; }
    /**
     * Total open invoice count from the query request.
     *
     * @return The field invoiceOpenCount
     */
    public @NotNull Integer getInvoiceOpenCount() { return this.invoiceOpenCount; }
    /**
     * Total open invoice count from the query request.
     *
     * @param value The new value for invoiceOpenCount
     */
    public void setInvoiceOpenCount(@NotNull Integer value) { this.invoiceOpenCount = value; }
    /**
     * Total past due invoice count from the query request.
     *
     * @return The field invoicePastDueCount
     */
    public @NotNull Integer getInvoicePastDueCount() { return this.invoicePastDueCount; }
    /**
     * Total past due invoice count from the query request.
     *
     * @param value The new value for invoicePastDueCount
     */
    public void setInvoicePastDueCount(@NotNull Integer value) { this.invoicePastDueCount = value; }
};
