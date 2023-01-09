
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

public class InvoiceSummaryModelInvoiceSummaryTotalsModelSummaryFetchResult
{
    private @Nullable InvoiceSummaryModel[] records;
    private @Nullable Integer totalCount;
    private @Nullable Integer pageSize;
    private @Nullable Integer pageNumber;
    private @Nullable InvoiceSummaryTotalsModel summary;
    private @Nullable SummaryAgingTotalsModel[] agingSummary;

    /**
     *
     * @return The field records
     */
    public @Nullable InvoiceSummaryModel[] getRecords() { return this.records; }
    /**
     *
     * @param value The new value for records
     */
    public void setRecords(@Nullable InvoiceSummaryModel[] value) { this.records = value; }
    /**
     *
     * @return The field totalCount
     */
    public @Nullable Integer getTotalCount() { return this.totalCount; }
    /**
     *
     * @param value The new value for totalCount
     */
    public void setTotalCount(@Nullable Integer value) { this.totalCount = value; }
    /**
     *
     * @return The field pageSize
     */
    public @Nullable Integer getPageSize() { return this.pageSize; }
    /**
     *
     * @param value The new value for pageSize
     */
    public void setPageSize(@Nullable Integer value) { this.pageSize = value; }
    /**
     *
     * @return The field pageNumber
     */
    public @Nullable Integer getPageNumber() { return this.pageNumber; }
    /**
     *
     * @param value The new value for pageNumber
     */
    public void setPageNumber(@Nullable Integer value) { this.pageNumber = value; }
    /**
     * The totals for an Invoice Summary
     *
     * @return The field summary
     */
    public @Nullable InvoiceSummaryTotalsModel getSummary() { return this.summary; }
    /**
     * The totals for an Invoice Summary
     *
     * @param value The new value for summary
     */
    public void setSummary(@Nullable InvoiceSummaryTotalsModel value) { this.summary = value; }
    /**
     *
     * @return The field agingSummary
     */
    public @Nullable SummaryAgingTotalsModel[] getAgingSummary() { return this.agingSummary; }
    /**
     *
     * @param value The new value for agingSummary
     */
    public void setAgingSummary(@Nullable SummaryAgingTotalsModel[] value) { this.agingSummary = value; }
};
