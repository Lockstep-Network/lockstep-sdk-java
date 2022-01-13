
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
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSourceCurrency() { return this.sourceCurrency; }
    /**
     * The source currency
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setSourceCurrency(String value) { this.sourceCurrency = value; }
    /**
     * The destination currency
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDestinationCurrency() { return this.destinationCurrency; }
    /**
     * The destination currency
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setDestinationCurrency(String value) { this.destinationCurrency = value; }
    /**
     * The date for the currency rate
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getDate() { return this.date; }
    /**
     * The date for the currency rate
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setDate(Date value) { this.date = value; }
    /**
     * The currency rate value
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getCurrencyRate() { return this.currencyRate; }
    /**
     * The currency rate value
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setCurrencyRate(Double value) { this.currencyRate = value; }
};
