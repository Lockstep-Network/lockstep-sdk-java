
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


/**
 * Represents the daily sales outstanding report
 */
public class DailySalesOutstandingReportModel
{
    private String timeframe;
    private Integer invoiceCount;
    private Double dailySalesOutstanding;

    /**
     * Timeframe (month) the daily sales outstanding values are associated with
     *
     * @return The field timeframe
     */
    public String getTimeframe() { return this.timeframe; }
    /**
     * Timeframe (month) the daily sales outstanding values are associated with
     *
     * @param value The new value for timeframe
     */
    public void setTimeframe(String value) { this.timeframe = value; }
    /**
     * Number of invoices the average daily sales outstanding is calculated on
     *
     * @return The field invoiceCount
     */
    public Integer getInvoiceCount() { return this.invoiceCount; }
    /**
     * Number of invoices the average daily sales outstanding is calculated on
     *
     * @param value The new value for invoiceCount
     */
    public void setInvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * Time (in days) between an invoice was completed paid off and when the invoice was issued
     *
     * @return The field dailySalesOutstanding
     */
    public Double getDailySalesOutstanding() { return this.dailySalesOutstanding; }
    /**
     * Time (in days) between an invoice was completed paid off and when the invoice was issued
     *
     * @param value The new value for dailySalesOutstanding
     */
    public void setDailySalesOutstanding(Double value) { this.dailySalesOutstanding = value; }
};
