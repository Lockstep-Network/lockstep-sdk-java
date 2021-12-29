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


public class PaymentDetailHeaderModel
{
    private String groupKey;
    private Integer customerCount;
    private Double amountCollected;
    private Double unappliedAmount;
    private Integer paidInvoiceCount;
    private Integer openInvoiceCount;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The total number of Customers.
     */
    public Integer getCustomerCount() { return this.customerCount; }
    /**
     * The total number of Customers.
     */
    public void setCustomerCount(Integer value) { this.customerCount = value; }
    /**
     * The total amount collected.
     */
    public Double getAmountCollected() { return this.amountCollected; }
    /**
     * The total amount collected.
     */
    public void setAmountCollected(Double value) { this.amountCollected = value; }
    /**
     * The total unapplied amount.
     */
    public Double getUnappliedAmount() { return this.unappliedAmount; }
    /**
     * The total unapplied amount.
     */
    public void setUnappliedAmount(Double value) { this.unappliedAmount = value; }
    /**
     * The number of paid invoices.
     */
    public Integer getPaidInvoiceCount() { return this.paidInvoiceCount; }
    /**
     * The number of paid invoices.
     */
    public void setPaidInvoiceCount(Integer value) { this.paidInvoiceCount = value; }
    /**
     * The number of open invoices.
     */
    public Integer getOpenInvoiceCount() { return this.openInvoiceCount; }
    /**
     * The number of open invoices.
     */
    public void setOpenInvoiceCount(Integer value) { this.openInvoiceCount = value; }
};
