
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
 * Contains summarized data for a vendor
 */
public class VendorSummaryModel
{
    private @NotNull String groupKey;
    private @NotNull String vendorId;
    private @Nullable String vendorName;
    private @Nullable String appEnrollmentId;
    private @Nullable String primaryContactName;
    private @Nullable String primaryContactId;
    private @Nullable Double amountPaidPastThirtyDays;
    private @Nullable Double advancePayPastThirtyDays;
    private @Nullable Double advancePayOutstanding;
    private @Nullable Double amountBilledPastThirtyDays;
    private @Nullable Double amountBilledOutstandingPastThirtyDays;
    private @Nullable Double amountBilledOutstanding;
    private @Nullable Integer billCountPastThirtyDays;
    private @Nullable Integer paidBillCountPastThirtyDays;
    private @Nullable Integer openBillCount;
    private @Nullable Integer paidBillCount;
    private @Nullable Integer totalBillCount;
    private @Nullable Double dpo;
    private @NotNull String modified;

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
     * The unique ID of this Vendor
     *
     * @return The field vendorId
     */
    public @NotNull String getVendorId() { return this.vendorId; }
    /**
     * The unique ID of this Vendor
     *
     * @param value The new value for vendorId
     */
    public void setVendorId(@NotNull String value) { this.vendorId = value; }
    /**
     * The name of this Vendor
     *
     * @return The field vendorName
     */
    public @Nullable String getVendorName() { return this.vendorName; }
    /**
     * The name of this Vendor
     *
     * @param value The new value for vendorName
     */
    public void setVendorName(@Nullable String value) { this.vendorName = value; }
    /**
     * The app enrollment ID this Vendor is associated with
     *
     * @return The field appEnrollmentId
     */
    public @Nullable String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The app enrollment ID this Vendor is associated with
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@Nullable String value) { this.appEnrollmentId = value; }
    /**
     * The name of this Vendor's primary contact
     *
     * @return The field primaryContactName
     */
    public @Nullable String getPrimaryContactName() { return this.primaryContactName; }
    /**
     * The name of this Vendor's primary contact
     *
     * @param value The new value for primaryContactName
     */
    public void setPrimaryContactName(@Nullable String value) { this.primaryContactName = value; }
    /**
     * This Vendor's primary contact id
     *
     * @return The field primaryContactId
     */
    public @Nullable String getPrimaryContactId() { return this.primaryContactId; }
    /**
     * This Vendor's primary contact id
     *
     * @param value The new value for primaryContactId
     */
    public void setPrimaryContactId(@Nullable String value) { this.primaryContactId = value; }
    /**
     * The amount paid to this Vendor in the last 30 days
     *
     * @return The field amountPaidPastThirtyDays
     */
    public @Nullable Double getAmountPaidPastThirtyDays() { return this.amountPaidPastThirtyDays; }
    /**
     * The amount paid to this Vendor in the last 30 days
     *
     * @param value The new value for amountPaidPastThirtyDays
     */
    public void setAmountPaidPastThirtyDays(@Nullable Double value) { this.amountPaidPastThirtyDays = value; }
    /**
     * The outstanding advance pay balance on payments in the last 30 days
     *
     * @return The field advancePayPastThirtyDays
     */
    public @Nullable Double getAdvancePayPastThirtyDays() { return this.advancePayPastThirtyDays; }
    /**
     * The outstanding advance pay balance on payments in the last 30 days
     *
     * @param value The new value for advancePayPastThirtyDays
     */
    public void setAdvancePayPastThirtyDays(@Nullable Double value) { this.advancePayPastThirtyDays = value; }
    /**
     * The outstanding advance pay balance with this Vendor
     *
     * @return The field advancePayOutstanding
     */
    public @Nullable Double getAdvancePayOutstanding() { return this.advancePayOutstanding; }
    /**
     * The outstanding advance pay balance with this Vendor
     *
     * @param value The new value for advancePayOutstanding
     */
    public void setAdvancePayOutstanding(@Nullable Double value) { this.advancePayOutstanding = value; }
    /**
     * The amount billed from this Vendor in the last 30 days
     *
     * @return The field amountBilledPastThirtyDays
     */
    public @Nullable Double getAmountBilledPastThirtyDays() { return this.amountBilledPastThirtyDays; }
    /**
     * The amount billed from this Vendor in the last 30 days
     *
     * @param value The new value for amountBilledPastThirtyDays
     */
    public void setAmountBilledPastThirtyDays(@Nullable Double value) { this.amountBilledPastThirtyDays = value; }
    /**
     * The outstanding balance with this Vendor for bills in the last 30 days
     *
     * @return The field amountBilledOutstandingPastThirtyDays
     */
    public @Nullable Double getAmountBilledOutstandingPastThirtyDays() { return this.amountBilledOutstandingPastThirtyDays; }
    /**
     * The outstanding balance with this Vendor for bills in the last 30 days
     *
     * @param value The new value for amountBilledOutstandingPastThirtyDays
     */
    public void setAmountBilledOutstandingPastThirtyDays(@Nullable Double value) { this.amountBilledOutstandingPastThirtyDays = value; }
    /**
     * The outstanding balance with this Vendor
     *
     * @return The field amountBilledOutstanding
     */
    public @Nullable Double getAmountBilledOutstanding() { return this.amountBilledOutstanding; }
    /**
     * The outstanding balance with this Vendor
     *
     * @param value The new value for amountBilledOutstanding
     */
    public void setAmountBilledOutstanding(@Nullable Double value) { this.amountBilledOutstanding = value; }
    /**
     * The number of bills received from this Vendor in the last 30 days
     *
     * @return The field billCountPastThirtyDays
     */
    public @Nullable Integer getBillCountPastThirtyDays() { return this.billCountPastThirtyDays; }
    /**
     * The number of bills received from this Vendor in the last 30 days
     *
     * @param value The new value for billCountPastThirtyDays
     */
    public void setBillCountPastThirtyDays(@Nullable Integer value) { this.billCountPastThirtyDays = value; }
    /**
     * The number of bills from this Vendor that were paid in full in the last 30 days
     *
     * @return The field paidBillCountPastThirtyDays
     */
    public @Nullable Integer getPaidBillCountPastThirtyDays() { return this.paidBillCountPastThirtyDays; }
    /**
     * The number of bills from this Vendor that were paid in full in the last 30 days
     *
     * @param value The new value for paidBillCountPastThirtyDays
     */
    public void setPaidBillCountPastThirtyDays(@Nullable Integer value) { this.paidBillCountPastThirtyDays = value; }
    /**
     * The number of open bills with this Vendor
     *
     * @return The field openBillCount
     */
    public @Nullable Integer getOpenBillCount() { return this.openBillCount; }
    /**
     * The number of open bills with this Vendor
     *
     * @param value The new value for openBillCount
     */
    public void setOpenBillCount(@Nullable Integer value) { this.openBillCount = value; }
    /**
     * The number of bills paid to this Vendor
     *
     * @return The field paidBillCount
     */
    public @Nullable Integer getPaidBillCount() { return this.paidBillCount; }
    /**
     * The number of bills paid to this Vendor
     *
     * @param value The new value for paidBillCount
     */
    public void setPaidBillCount(@Nullable Integer value) { this.paidBillCount = value; }
    /**
     * The total count of open and closed bills.
     *
     * @return The field totalBillCount
     */
    public @Nullable Integer getTotalBillCount() { return this.totalBillCount; }
    /**
     * The total count of open and closed bills.
     *
     * @param value The new value for totalBillCount
     */
    public void setTotalBillCount(@Nullable Integer value) { this.totalBillCount = value; }
    /**
     * The days payabale outstanding.
     *
     * @return The field dpo
     */
    public @Nullable Double getDpo() { return this.dpo; }
    /**
     * The days payabale outstanding.
     *
     * @param value The new value for dpo
     */
    public void setDpo(@Nullable Double value) { this.dpo = value; }
    /**
     * The modified date of the Vendor
     *
     * @return The field modified
     */
    public @NotNull String getModified() { return this.modified; }
    /**
     * The modified date of the Vendor
     *
     * @param value The new value for modified
     */
    public void setModified(@NotNull String value) { this.modified = value; }
};
