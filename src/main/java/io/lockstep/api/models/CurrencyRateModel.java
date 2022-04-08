
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a currency rate for specific currencies and date
 */
public class CurrencyRateModel
{
    private @NotNull String sourceCurrency;
    private @NotNull String destinationCurrency;
    private @NotNull String date;
    private @Nullable Double currencyRate;

    /**
     * The source currency
     *
     * @return The field sourceCurrency
     */
    public @NotNull String getSourceCurrency() { return this.sourceCurrency; }
    /**
     * The source currency
     *
     * @param value The new value for sourceCurrency
     */
    public void setSourceCurrency(@NotNull String value) { this.sourceCurrency = value; }
    /**
     * The destination currency
     *
     * @return The field destinationCurrency
     */
    public @NotNull String getDestinationCurrency() { return this.destinationCurrency; }
    /**
     * The destination currency
     *
     * @param value The new value for destinationCurrency
     */
    public void setDestinationCurrency(@NotNull String value) { this.destinationCurrency = value; }
    /**
     * The date for the currency rate
     *
     * @return The field date
     */
    public @NotNull String getDate() { return this.date; }
    /**
     * The date for the currency rate
     *
     * @param value The new value for date
     */
    public void setDate(@NotNull String value) { this.date = value; }
    /**
     * The currency rate value
     *
     * @return The field currencyRate
     */
    public @Nullable Double getCurrencyRate() { return this.currencyRate; }
    /**
     * The currency rate value
     *
     * @param value The new value for currencyRate
     */
    public void setCurrencyRate(@Nullable Double value) { this.currencyRate = value; }
};
