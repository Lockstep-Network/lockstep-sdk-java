/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;

public class DailySalesOutstandingReportModel
{
    private Date timeframe;
    private Integer invoiceCount;
    private Double dailySalesOutstanding;

    /**
     * Timeframe (month) the daily sales outstanding values are associated with
     */
    public Date gettimeframe() { return this.timeframe; }
    /**
     * Timeframe (month) the daily sales outstanding values are associated with
     */
    public void settimeframe(Date value) { this.timeframe = value; }
    /**
     * Number of invoices the average daily sales outstanding is calculated on
     */
    public Integer getinvoiceCount() { return this.invoiceCount; }
    /**
     * Number of invoices the average daily sales outstanding is calculated on
     */
    public void setinvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * Time (in days) between an invoice was completed paid off and when the invoice was issued
     */
    public Double getdailySalesOutstanding() { return this.dailySalesOutstanding; }
    /**
     * Time (in days) between an invoice was completed paid off and when the invoice was issued
     */
    public void setdailySalesOutstanding(Double value) { this.dailySalesOutstanding = value; }
};
