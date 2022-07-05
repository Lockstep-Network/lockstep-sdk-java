
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
    private @Nullable Double amountPaidLast30;
    private @Nullable Double advancePayLast30;
    private @Nullable Double advancePayOutstanding;
    private @Nullable Double amountBilledLast30;
    private @Nullable Double amountBilledOutstandingLast30;
    private @Nullable Double amountBilledOutstanding;
    private @Nullable Integer billCountLast30;
    private @Nullable Integer paidBillCountLast30;
    private @Nullable Integer openBillCount;
    private @Nullable Integer paidBillCount;
    private @Nullable Integer totalBillCount;

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
     * @return The field amountPaidLast30
     */
    public @Nullable Double getAmountPaidLast30() { return this.amountPaidLast30; }
    /**
     * The amount paid to this Vendor in the last 30 days
     *
     * @param value The new value for amountPaidLast30
     */
    public void setAmountPaidLast30(@Nullable Double value) { this.amountPaidLast30 = value; }
    /**
     * The outstanding advance pay balance on payments in the last 30 days
     *
     * @return The field advancePayLast30
     */
    public @Nullable Double getAdvancePayLast30() { return this.advancePayLast30; }
    /**
     * The outstanding advance pay balance on payments in the last 30 days
     *
     * @param value The new value for advancePayLast30
     */
    public void setAdvancePayLast30(@Nullable Double value) { this.advancePayLast30 = value; }
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
     * @return The field amountBilledLast30
     */
    public @Nullable Double getAmountBilledLast30() { return this.amountBilledLast30; }
    /**
     * The amount billed from this Vendor in the last 30 days
     *
     * @param value The new value for amountBilledLast30
     */
    public void setAmountBilledLast30(@Nullable Double value) { this.amountBilledLast30 = value; }
    /**
     * The outstanding balance with this Vendor for bills in the last 30 days
     *
     * @return The field amountBilledOutstandingLast30
     */
    public @Nullable Double getAmountBilledOutstandingLast30() { return this.amountBilledOutstandingLast30; }
    /**
     * The outstanding balance with this Vendor for bills in the last 30 days
     *
     * @param value The new value for amountBilledOutstandingLast30
     */
    public void setAmountBilledOutstandingLast30(@Nullable Double value) { this.amountBilledOutstandingLast30 = value; }
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
     * @return The field billCountLast30
     */
    public @Nullable Integer getBillCountLast30() { return this.billCountLast30; }
    /**
     * The number of bills received from this Vendor in the last 30 days
     *
     * @param value The new value for billCountLast30
     */
    public void setBillCountLast30(@Nullable Integer value) { this.billCountLast30 = value; }
    /**
     * The number of bills from this Vendor that were paid in full in the last 30 days
     *
     * @return The field paidBillCountLast30
     */
    public @Nullable Integer getPaidBillCountLast30() { return this.paidBillCountLast30; }
    /**
     * The number of bills from this Vendor that were paid in full in the last 30 days
     *
     * @param value The new value for paidBillCountLast30
     */
    public void setPaidBillCountLast30(@Nullable Integer value) { this.paidBillCountLast30 = value; }
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
};
