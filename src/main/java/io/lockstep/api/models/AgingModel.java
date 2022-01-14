
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


/**
 * Represents an aging record
 */
public class AgingModel
{
    private Integer bucket;
    private String currencyCode;
    private Double outstandingBalance;

    /**
     * Aging bucket of outstanding balance data (days past due date of invoice)
     *
     * @return The field bucket
     */
    public Integer getBucket() { return this.bucket; }
    /**
     * Aging bucket of outstanding balance data (days past due date of invoice)
     *
     * @param value The new value for bucket
     */
    public void setBucket(Integer value) { this.bucket = value; }
    /**
     * Currency code of aging bucket
     *
     * @return The field currencyCode
     */
    public String getCurrencyCode() { return this.currencyCode; }
    /**
     * Currency code of aging bucket
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(String value) { this.currencyCode = value; }
    /**
     * Outstanding balance for the given aging bucket
     *
     * @return The field outstandingBalance
     */
    public Double getOutstandingBalance() { return this.outstandingBalance; }
    /**
     * Outstanding balance for the given aging bucket
     *
     * @param value The new value for outstandingBalance
     */
    public void setOutstandingBalance(Double value) { this.outstandingBalance = value; }
};
