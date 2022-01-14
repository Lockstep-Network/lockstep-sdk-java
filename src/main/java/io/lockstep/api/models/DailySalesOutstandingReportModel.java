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
 * @version    2022.2
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;

public class DailySalesOutstandingReportModel
{
    private Date timeframe;
    private Integer invoiceCount;
    private Double dailySalesOutstanding;

    /**
     * @return Timeframe (month) the daily sales outstanding values are associated with
     */
    public Date getTimeframe() { return this.timeframe; }
    /**
     * @param value - Timeframe (month) the daily sales outstanding values are associated with
     */
    public void setTimeframe(Date value) { this.timeframe = value; }
    /**
     * @return Number of invoices the average daily sales outstanding is calculated on
     */
    public Integer getInvoiceCount() { return this.invoiceCount; }
    /**
     * @param value - Number of invoices the average daily sales outstanding is calculated on
     */
    public void setInvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * @return Time (in days) between an invoice was completed paid off and when the invoice was issued
     */
    public Double getDailySalesOutstanding() { return this.dailySalesOutstanding; }
    /**
     * @param value - Time (in days) between an invoice was completed paid off and when the invoice was issued
     */
    public void setDailySalesOutstanding(Double value) { this.dailySalesOutstanding = value; }
};
