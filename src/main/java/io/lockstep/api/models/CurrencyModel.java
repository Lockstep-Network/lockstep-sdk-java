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
     * @return Alphabetic code for the given currency
     */
    public String getAlphaCode() { return this.alphaCode; }
    /**
     * @param value - Alphabetic code for the given currency
     */
    public void setAlphaCode(String value) { this.alphaCode = value; }
    /**
     * @return Numeric code for the given currency
     */
    public String getNumericCode() { return this.numericCode; }
    /**
     * @param value - Numeric code for the given currency
     */
    public void setNumericCode(String value) { this.numericCode = value; }
    /**
     * @return Name of currency
     */
    public String getCurrencyName() { return this.currencyName; }
    /**
     * @param value - Name of currency
     */
    public void setCurrencyName(String value) { this.currencyName = value; }
    /**
     * @return Number of places after the decimal for this currency
     */
    public Integer getMinorUnit() { return this.minorUnit; }
    /**
     * @param value - Number of places after the decimal for this currency
     */
    public void setMinorUnit(Integer value) { this.minorUnit = value; }
    /**
     * @return Symbol for the given currency
     */
    public String getSymbol() { return this.symbol; }
    /**
     * @param value - Symbol for the given currency
     */
    public void setSymbol(String value) { this.symbol = value; }
};
