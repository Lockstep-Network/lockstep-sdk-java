
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
 * Represents a risk rate calculation for a single month
 */
public class RiskRateModel
{
    private @NotNull String groupKey;
    private @NotNull String reportPeriod;
    private @Nullable String invoiceMonthName;
    private @NotNull Integer totalInvoiceCount;
    private @NotNull Double totalInvoiceAmount;
    private @NotNull Integer atRiskCount;
    private @NotNull Double atRiskAmount;
    private @NotNull Double atRiskCountPercentage;
    private @NotNull Double atRiskPercentage;

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
     * The month the risk rate was calculated for
     *
     * @return The field reportPeriod
     */
    public @NotNull String getReportPeriod() { return this.reportPeriod; }
    /**
     * The month the risk rate was calculated for
     *
     * @param value The new value for reportPeriod
     */
    public void setReportPeriod(@NotNull String value) { this.reportPeriod = value; }
    /**
     * The string name of the month the risk rate was calculated for
     *
     * @return The field invoiceMonthName
     */
    public @Nullable String getInvoiceMonthName() { return this.invoiceMonthName; }
    /**
     * The string name of the month the risk rate was calculated for
     *
     * @param value The new value for invoiceMonthName
     */
    public void setInvoiceMonthName(@Nullable String value) { this.invoiceMonthName = value; }
    /**
     * The count of all invoices in the calculation month
     *
     * @return The field totalInvoiceCount
     */
    public @NotNull Integer getTotalInvoiceCount() { return this.totalInvoiceCount; }
    /**
     * The count of all invoices in the calculation month
     *
     * @param value The new value for totalInvoiceCount
     */
    public void setTotalInvoiceCount(@NotNull Integer value) { this.totalInvoiceCount = value; }
    /**
     * The sum of the total amount for invoices in the calculation month
     *
     * @return The field totalInvoiceAmount
     */
    public @NotNull Double getTotalInvoiceAmount() { return this.totalInvoiceAmount; }
    /**
     * The sum of the total amount for invoices in the calculation month
     *
     * @param value The new value for totalInvoiceAmount
     */
    public void setTotalInvoiceAmount(@NotNull Double value) { this.totalInvoiceAmount = value; }
    /**
     * The count of open invoices over 90 days from the calculation month
     *
     * @return The field atRiskCount
     */
    public @NotNull Integer getAtRiskCount() { return this.atRiskCount; }
    /**
     * The count of open invoices over 90 days from the calculation month
     *
     * @param value The new value for atRiskCount
     */
    public void setAtRiskCount(@NotNull Integer value) { this.atRiskCount = value; }
    /**
     * The sum of the outstanding balance of open invoices over 90 days from the calculation month
     *
     * @return The field atRiskAmount
     */
    public @NotNull Double getAtRiskAmount() { return this.atRiskAmount; }
    /**
     * The sum of the outstanding balance of open invoices over 90 days from the calculation month
     *
     * @param value The new value for atRiskAmount
     */
    public void setAtRiskAmount(@NotNull Double value) { this.atRiskAmount = value; }
    /**
     * The percentage of all open invoices for the calculation month that are over 90 days based on count
     *
     * @return The field atRiskCountPercentage
     */
    public @NotNull Double getAtRiskCountPercentage() { return this.atRiskCountPercentage; }
    /**
     * The percentage of all open invoices for the calculation month that are over 90 days based on count
     *
     * @param value The new value for atRiskCountPercentage
     */
    public void setAtRiskCountPercentage(@NotNull Double value) { this.atRiskCountPercentage = value; }
    /**
     * The percentage of all open invoices for the calculation month that are over 90 days based on outstanding balance
     *
     * @return The field atRiskPercentage
     */
    public @NotNull Double getAtRiskPercentage() { return this.atRiskPercentage; }
    /**
     * The percentage of all open invoices for the calculation month that are over 90 days based on outstanding balance
     *
     * @param value The new value for atRiskPercentage
     */
    public void setAtRiskPercentage(@NotNull Double value) { this.atRiskPercentage = value; }
};
