
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
 * The totals for a Payment Summary
 */
public class PaymentSummaryTotalsModel
{
    private @NotNull Double totalPaidAmount;
    private @NotNull Double totalUnappliedBalance;

    /**
     * The total amount paid.
     *
     * @return The field totalPaidAmount
     */
    public @NotNull Double getTotalPaidAmount() { return this.totalPaidAmount; }
    /**
     * The total amount paid.
     *
     * @param value The new value for totalPaidAmount
     */
    public void setTotalPaidAmount(@NotNull Double value) { this.totalPaidAmount = value; }
    /**
     * The total amount unapplied.
     *
     * @return The field totalUnappliedBalance
     */
    public @NotNull Double getTotalUnappliedBalance() { return this.totalUnappliedBalance; }
    /**
     * The total amount unapplied.
     *
     * @param value The new value for totalUnappliedBalance
     */
    public void setTotalUnappliedBalance(@NotNull Double value) { this.totalUnappliedBalance = value; }
};
