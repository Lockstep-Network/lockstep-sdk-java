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


public class CashflowReportModel
{
    private Integer timeframe;
    private Double paymentsCollected;
    private Integer paymentsCollectedCount;
    private Double invoicesBilled;
    private Integer invoicesBilledCount;

    /**
     * Timeframe in days the cashflow report is generated on
     */
    public Integer gettimeframe() { return this.timeframe; }
    /**
     * Timeframe in days the cashflow report is generated on
     */
    public void settimeframe(Integer value) { this.timeframe = value; }
    /**
     * Amount of payments collected based in the timeframe
     */
    public Double getpaymentsCollected() { return this.paymentsCollected; }
    /**
     * Amount of payments collected based in the timeframe
     */
    public void setpaymentsCollected(Double value) { this.paymentsCollected = value; }
    /**
     * Number of payments collected based in the timeframe
     */
    public Integer getpaymentsCollectedCount() { return this.paymentsCollectedCount; }
    /**
     * Number of payments collected based in the timeframe
     */
    public void setpaymentsCollectedCount(Integer value) { this.paymentsCollectedCount = value; }
    /**
     * Amount of invoices billed based in the timeframe
     */
    public Double getinvoicesBilled() { return this.invoicesBilled; }
    /**
     * Amount of invoices billed based in the timeframe
     */
    public void setinvoicesBilled(Double value) { this.invoicesBilled = value; }
    /**
     * Number of invoices billed in the timeframe
     */
    public Integer getinvoicesBilledCount() { return this.invoicesBilledCount; }
    /**
     * Number of invoices billed in the timeframe
     */
    public void setinvoicesBilledCount(Integer value) { this.invoicesBilledCount = value; }
};
