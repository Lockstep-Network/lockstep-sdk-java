
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
 * Contains group level payment data.
 */
public class PaymentDetailHeaderModel
{
    private @NotNull String groupKey;
    private @Nullable Integer customerCount;
    private @Nullable Double amountCollected;
    private @Nullable Double unappliedAmount;
    private @Nullable Integer paidInvoiceCount;
    private @Nullable Integer openInvoiceCount;

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
     * The total number of Customers.
     *
     * @return The field customerCount
     */
    public @Nullable Integer getCustomerCount() { return this.customerCount; }
    /**
     * The total number of Customers.
     *
     * @param value The new value for customerCount
     */
    public void setCustomerCount(@Nullable Integer value) { this.customerCount = value; }
    /**
     * The total amount collected.
     *
     * @return The field amountCollected
     */
    public @Nullable Double getAmountCollected() { return this.amountCollected; }
    /**
     * The total amount collected.
     *
     * @param value The new value for amountCollected
     */
    public void setAmountCollected(@Nullable Double value) { this.amountCollected = value; }
    /**
     * The total unapplied amount.
     *
     * @return The field unappliedAmount
     */
    public @Nullable Double getUnappliedAmount() { return this.unappliedAmount; }
    /**
     * The total unapplied amount.
     *
     * @param value The new value for unappliedAmount
     */
    public void setUnappliedAmount(@Nullable Double value) { this.unappliedAmount = value; }
    /**
     * The number of paid invoices.
     *
     * @return The field paidInvoiceCount
     */
    public @Nullable Integer getPaidInvoiceCount() { return this.paidInvoiceCount; }
    /**
     * The number of paid invoices.
     *
     * @param value The new value for paidInvoiceCount
     */
    public void setPaidInvoiceCount(@Nullable Integer value) { this.paidInvoiceCount = value; }
    /**
     * The number of open invoices.
     *
     * @return The field openInvoiceCount
     */
    public @Nullable Integer getOpenInvoiceCount() { return this.openInvoiceCount; }
    /**
     * The number of open invoices.
     *
     * @param value The new value for openInvoiceCount
     */
    public void setOpenInvoiceCount(@Nullable Integer value) { this.openInvoiceCount = value; }
};
