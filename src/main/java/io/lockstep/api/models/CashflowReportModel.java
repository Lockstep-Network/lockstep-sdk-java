
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
public class CashflowReportModel
{
    private Integer timeframe;
    private Double paymentsCollected;
    private Integer paymentsCollectedCount;
    private Double invoicesBilled;
    private Integer invoicesBilledCount;

    /**
     * Timeframe in days the cashflow report is generated on
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTimeframe() { return this.timeframe; }
    /**
     * Timeframe in days the cashflow report is generated on
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTimeframe(Integer value) { this.timeframe = value; }
    /**
     * Amount of payments collected based in the timeframe
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getPaymentsCollected() { return this.paymentsCollected; }
    /**
     * Amount of payments collected based in the timeframe
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setPaymentsCollected(Double value) { this.paymentsCollected = value; }
    /**
     * Number of payments collected based in the timeframe
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getPaymentsCollectedCount() { return this.paymentsCollectedCount; }
    /**
     * Number of payments collected based in the timeframe
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setPaymentsCollectedCount(Integer value) { this.paymentsCollectedCount = value; }
    /**
     * Amount of invoices billed based in the timeframe
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getInvoicesBilled() { return this.invoicesBilled; }
    /**
     * Amount of invoices billed based in the timeframe
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setInvoicesBilled(Double value) { this.invoicesBilled = value; }
    /**
     * Number of invoices billed in the timeframe
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getInvoicesBilledCount() { return this.invoicesBilledCount; }
    /**
     * Number of invoices billed in the timeframe
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setInvoicesBilledCount(Integer value) { this.invoicesBilledCount = value; }
};
