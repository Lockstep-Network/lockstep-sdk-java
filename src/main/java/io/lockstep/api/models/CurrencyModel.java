
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
 * Represents an ISO-4217 currency code definition
 */
public class CurrencyModel
{
    private @Nullable String alphaCode;
    private @Nullable String numericCode;
    private @Nullable String currencyName;
    private @NotNull Integer minorUnit;
    private @Nullable String symbol;

    /**
     * Alphabetic code for the given currency
     *
     * @return The field alphaCode
     */
    public @Nullable String getAlphaCode() { return this.alphaCode; }
    /**
     * Alphabetic code for the given currency
     *
     * @param value The new value for alphaCode
     */
    public void setAlphaCode(@Nullable String value) { this.alphaCode = value; }
    /**
     * Numeric code for the given currency
     *
     * @return The field numericCode
     */
    public @Nullable String getNumericCode() { return this.numericCode; }
    /**
     * Numeric code for the given currency
     *
     * @param value The new value for numericCode
     */
    public void setNumericCode(@Nullable String value) { this.numericCode = value; }
    /**
     * Name of currency
     *
     * @return The field currencyName
     */
    public @Nullable String getCurrencyName() { return this.currencyName; }
    /**
     * Name of currency
     *
     * @param value The new value for currencyName
     */
    public void setCurrencyName(@Nullable String value) { this.currencyName = value; }
    /**
     * Number of places after the decimal for this currency
     *
     * @return The field minorUnit
     */
    public @NotNull Integer getMinorUnit() { return this.minorUnit; }
    /**
     * Number of places after the decimal for this currency
     *
     * @param value The new value for minorUnit
     */
    public void setMinorUnit(@NotNull Integer value) { this.minorUnit = value; }
    /**
     * Symbol for the given currency
     *
     * @return The field symbol
     */
    public @Nullable String getSymbol() { return this.symbol; }
    /**
     * Symbol for the given currency
     *
     * @param value The new value for symbol
     */
    public void setSymbol(@Nullable String value) { this.symbol = value; }
};
