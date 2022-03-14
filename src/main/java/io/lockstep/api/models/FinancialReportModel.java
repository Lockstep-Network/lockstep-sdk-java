
/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a Financial Report
 */
public class FinancialReportModel
{
    private @Nullable String reportName;
    private @NotNull String groupKey;
    private @NotNull String reportStartDate;
    private @NotNull String reportEndDate;
    private @NotNull String reportCreatedDate;
    private @Nullable FinancialReportRowModel[] rows;

    /**
     * The name of the report ("*Report Type* for *Company*")
     *
     * @return The field reportName
     */
    public @Nullable String getReportName() { return this.reportName; }
    /**
     * The name of the report ("*Report Type* for *Company*")
     *
     * @param value The new value for reportName
     */
    public void setReportName(@Nullable String value) { this.reportName = value; }
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
     * The start date of the financial report
     *
     * @return The field reportStartDate
     */
    public @NotNull String getReportStartDate() { return this.reportStartDate; }
    /**
     * The start date of the financial report
     *
     * @param value The new value for reportStartDate
     */
    public void setReportStartDate(@NotNull String value) { this.reportStartDate = value; }
    /**
     * The end date of the financial report
     *
     * @return The field reportEndDate
     */
    public @NotNull String getReportEndDate() { return this.reportEndDate; }
    /**
     * The end date of the financial report
     *
     * @param value The new value for reportEndDate
     */
    public void setReportEndDate(@NotNull String value) { this.reportEndDate = value; }
    /**
     * The created date of the financial report
     *
     * @return The field reportCreatedDate
     */
    public @NotNull String getReportCreatedDate() { return this.reportCreatedDate; }
    /**
     * The created date of the financial report
     *
     * @param value The new value for reportCreatedDate
     */
    public void setReportCreatedDate(@NotNull String value) { this.reportCreatedDate = value; }
    /**
     * The rows of the financial report
     *
     * @return The field rows
     */
    public @Nullable FinancialReportRowModel[] getRows() { return this.rows; }
    /**
     * The rows of the financial report
     *
     * @param value The new value for rows
     */
    public void setRows(@Nullable FinancialReportRowModel[] value) { this.rows = value; }
};
