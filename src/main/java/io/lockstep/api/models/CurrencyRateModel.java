
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
 * @version    2022.3
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * Represents a currency rate for specific currencies and date
 */
public class CurrencyRateModel
{
    private String sourceCurrency;
    private String destinationCurrency;
    private String date;
    private Double currencyRate;

    /**
     * The source currency
     *
     * @return The field sourceCurrency
     */
    public String getSourceCurrency() { return this.sourceCurrency; }
    /**
     * The source currency
     *
     * @param value The new value for sourceCurrency
     */
    public void setSourceCurrency(String value) { this.sourceCurrency = value; }
    /**
     * The destination currency
     *
     * @return The field destinationCurrency
     */
    public String getDestinationCurrency() { return this.destinationCurrency; }
    /**
     * The destination currency
     *
     * @param value The new value for destinationCurrency
     */
    public void setDestinationCurrency(String value) { this.destinationCurrency = value; }
    /**
     * The date for the currency rate
     *
     * @return The field date
     */
    public String getDate() { return this.date; }
    /**
     * The date for the currency rate
     *
     * @param value The new value for date
     */
    public void setDate(String value) { this.date = value; }
    /**
     * The currency rate value
     *
     * @return The field currencyRate
     */
    public Double getCurrencyRate() { return this.currencyRate; }
    /**
     * The currency rate value
     *
     * @param value The new value for currencyRate
     */
    public void setCurrencyRate(Double value) { this.currencyRate = value; }
};
