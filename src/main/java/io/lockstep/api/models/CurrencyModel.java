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


public class CurrencyModel
{
    private String alphaCode;
    private String numericCode;
    private String currencyName;
    private Integer minorUnit;
    private String symbol;

    /**
     * Alphabetic code for the given currency
     */
    public String getalphaCode() { return this.alphaCode; }
    /**
     * Alphabetic code for the given currency
     */
    public void setalphaCode(String value) { this.alphaCode = value; }
    /**
     * Numeric code for the given currency
     */
    public String getnumericCode() { return this.numericCode; }
    /**
     * Numeric code for the given currency
     */
    public void setnumericCode(String value) { this.numericCode = value; }
    /**
     * Name of currency
     */
    public String getcurrencyName() { return this.currencyName; }
    /**
     * Name of currency
     */
    public void setcurrencyName(String value) { this.currencyName = value; }
    /**
     * Number of places after the decimal for this currency
     */
    public Integer getminorUnit() { return this.minorUnit; }
    /**
     * Number of places after the decimal for this currency
     */
    public void setminorUnit(Integer value) { this.minorUnit = value; }
    /**
     * Symbol for the given currency
     */
    public String getsymbol() { return this.symbol; }
    /**
     * Symbol for the given currency
     */
    public void setsymbol(String value) { this.symbol = value; }
};
