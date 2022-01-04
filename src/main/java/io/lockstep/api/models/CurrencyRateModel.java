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
 * @version    2021.39
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;

public class CurrencyRateModel
{
    private String sourceCurrency;
    private String destinationCurrency;
    private Date date;
    private Double currencyRate;

    /**
     * The source currency
     */
    public String getSourceCurrency() { return this.sourceCurrency; }
    /**
     * The source currency
     */
    public void setSourceCurrency(String value) { this.sourceCurrency = value; }
    /**
     * The destination currency
     */
    public String getDestinationCurrency() { return this.destinationCurrency; }
    /**
     * The destination currency
     */
    public void setDestinationCurrency(String value) { this.destinationCurrency = value; }
    /**
     * The date for the currency rate
     */
    public Date getDate() { return this.date; }
    /**
     * The date for the currency rate
     */
    public void setDate(Date value) { this.date = value; }
    /**
     * The currency rate value
     */
    public Double getCurrencyRate() { return this.currencyRate; }
    /**
     * The currency rate value
     */
    public void setCurrencyRate(Double value) { this.currencyRate = value; }
};
