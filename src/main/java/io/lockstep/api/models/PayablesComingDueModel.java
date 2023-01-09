
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
 * Contains information for payables that will be due soon
 */
public class PayablesComingDueModel
{
    private @NotNull String groupKey;
    private @NotNull Integer numberOfBillsDue;
    private @NotNull String vendorId;
    private @Nullable String vendorName;
    private @Nullable String primaryContact;
    private @NotNull Double percentageOfTotal;
    private @NotNull Double totalAmountDue;
    private @NotNull String dueDate;

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
     * Number of bills due for this time period
     *
     * @return The field numberOfBillsDue
     */
    public @NotNull Integer getNumberOfBillsDue() { return this.numberOfBillsDue; }
    /**
     * Number of bills due for this time period
     *
     * @param value The new value for numberOfBillsDue
     */
    public void setNumberOfBillsDue(@NotNull Integer value) { this.numberOfBillsDue = value; }
    /**
     * The unique Lockstep Id for the Vendor
     *
     * @return The field vendorId
     */
    public @NotNull String getVendorId() { return this.vendorId; }
    /**
     * The unique Lockstep Id for the Vendor
     *
     * @param value The new value for vendorId
     */
    public void setVendorId(@NotNull String value) { this.vendorId = value; }
    /**
     * Name for this company
     *
     * @return The field vendorName
     */
    public @Nullable String getVendorName() { return this.vendorName; }
    /**
     * Name for this company
     *
     * @param value The new value for vendorName
     */
    public void setVendorName(@Nullable String value) { this.vendorName = value; }
    /**
     * Primary Contact for this company
     *
     * @return The field primaryContact
     */
    public @Nullable String getPrimaryContact() { return this.primaryContact; }
    /**
     * Primary Contact for this company
     *
     * @param value The new value for primaryContact
     */
    public void setPrimaryContact(@Nullable String value) { this.primaryContact = value; }
    /**
     * Percentage of total for this time period
     *
     * @return The field percentageOfTotal
     */
    public @NotNull Double getPercentageOfTotal() { return this.percentageOfTotal; }
    /**
     * Percentage of total for this time period
     *
     * @param value The new value for percentageOfTotal
     */
    public void setPercentageOfTotal(@NotNull Double value) { this.percentageOfTotal = value; }
    /**
     * Total amount due for this time period
     *
     * @return The field totalAmountDue
     */
    public @NotNull Double getTotalAmountDue() { return this.totalAmountDue; }
    /**
     * Total amount due for this time period
     *
     * @param value The new value for totalAmountDue
     */
    public void setTotalAmountDue(@NotNull Double value) { this.totalAmountDue = value; }
    /**
     * This model represents all the payables that are
     * either already due or due within this date.
     *
     * @return The field dueDate
     */
    public @NotNull String getDueDate() { return this.dueDate; }
    /**
     * This model represents all the payables that are
     * either already due or due within this date.
     *
     * @param value The new value for dueDate
     */
    public void setDueDate(@NotNull String value) { this.dueDate = value; }
};
