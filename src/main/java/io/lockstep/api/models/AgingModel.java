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


public class AgingModel
{
    private Integer bucket;
    private String currencyCode;
    private Double outstandingBalance;

    /**
     * Aging bucket of outstanding balance data (days past due date of invoice)
     */
    public Integer getbucket() { return this.bucket; }
    /**
     * Aging bucket of outstanding balance data (days past due date of invoice)
     */
    public void setbucket(Integer value) { this.bucket = value; }
    /**
     * Currency code of aging bucket
     */
    public String getcurrencyCode() { return this.currencyCode; }
    /**
     * Currency code of aging bucket
     */
    public void setcurrencyCode(String value) { this.currencyCode = value; }
    /**
     * Outstanding balance for the given aging bucket
     */
    public Double getoutstandingBalance() { return this.outstandingBalance; }
    /**
     * Outstanding balance for the given aging bucket
     */
    public void setoutstandingBalance(Double value) { this.outstandingBalance = value; }
};
