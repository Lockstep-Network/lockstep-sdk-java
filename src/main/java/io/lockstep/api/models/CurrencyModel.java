
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


public class CurrencyModel
{
    private String alphaCode;
    private String numericCode;
    private String currencyName;
    private Integer minorUnit;
    private String symbol;

    /**
     * Alphabetic code for the given currency
     *
     * @return The field alphaCode
     */
    public String getAlphaCode() { return this.alphaCode; }
    /**
     * Alphabetic code for the given currency
     *
     * @param value The new value for alphaCode
     */
    public void setAlphaCode(String value) { this.alphaCode = value; }
    /**
     * Numeric code for the given currency
     *
     * @return The field numericCode
     */
    public String getNumericCode() { return this.numericCode; }
    /**
     * Numeric code for the given currency
     *
     * @param value The new value for numericCode
     */
    public void setNumericCode(String value) { this.numericCode = value; }
    /**
     * Name of currency
     *
     * @return The field currencyName
     */
    public String getCurrencyName() { return this.currencyName; }
    /**
     * Name of currency
     *
     * @param value The new value for currencyName
     */
    public void setCurrencyName(String value) { this.currencyName = value; }
    /**
     * Number of places after the decimal for this currency
     *
     * @return The field minorUnit
     */
    public Integer getMinorUnit() { return this.minorUnit; }
    /**
     * Number of places after the decimal for this currency
     *
     * @param value The new value for minorUnit
     */
    public void setMinorUnit(Integer value) { this.minorUnit = value; }
    /**
     * Symbol for the given currency
     *
     * @return The field symbol
     */
    public String getSymbol() { return this.symbol; }
    /**
     * Symbol for the given currency
     *
     * @param value The new value for symbol
     */
    public void setSymbol(String value) { this.symbol = value; }
};
