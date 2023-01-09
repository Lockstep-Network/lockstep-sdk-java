
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
 * Represents a summary of outstanding amounts for bills to vendors and their associated daily payable outstanding value.
 */
public class DpoSummaryModel
{
    private @NotNull String groupKey;
    private @NotNull String vendorId;
    private @Nullable String vendorName;
    private @Nullable String primaryContact;
    private @NotNull Integer bills;
    private @NotNull Double amountOutstanding;
    private @NotNull Double dpo;

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
     * The unique ID of the vendor.
     *
     * @return The field vendorId
     */
    public @NotNull String getVendorId() { return this.vendorId; }
    /**
     * The unique ID of the vendor.
     *
     * @param value The new value for vendorId
     */
    public void setVendorId(@NotNull String value) { this.vendorId = value; }
    /**
     * The name of the vendor.
     *
     * @return The field vendorName
     */
    public @Nullable String getVendorName() { return this.vendorName; }
    /**
     * The name of the vendor.
     *
     * @param value The new value for vendorName
     */
    public void setVendorName(@Nullable String value) { this.vendorName = value; }
    /**
     * The name of the primary contact.
     *
     * @return The field primaryContact
     */
    public @Nullable String getPrimaryContact() { return this.primaryContact; }
    /**
     * The name of the primary contact.
     *
     * @param value The new value for primaryContact
     */
    public void setPrimaryContact(@Nullable String value) { this.primaryContact = value; }
    /**
     * The total number of outstanding bills.
     *
     * @return The field bills
     */
    public @NotNull Integer getBills() { return this.bills; }
    /**
     * The total number of outstanding bills.
     *
     * @param value The new value for bills
     */
    public void setBills(@NotNull Integer value) { this.bills = value; }
    /**
     * The total amount outstanding.
     *
     * @return The field amountOutstanding
     */
    public @NotNull Double getAmountOutstanding() { return this.amountOutstanding; }
    /**
     * The total amount outstanding.
     *
     * @param value The new value for amountOutstanding
     */
    public void setAmountOutstanding(@NotNull Double value) { this.amountOutstanding = value; }
    /**
     * The days payable outstanding value.
     *
     * @return The field dpo
     */
    public @NotNull Double getDpo() { return this.dpo; }
    /**
     * The days payable outstanding value.
     *
     * @param value The new value for dpo
     */
    public void setDpo(@NotNull Double value) { this.dpo = value; }
};
