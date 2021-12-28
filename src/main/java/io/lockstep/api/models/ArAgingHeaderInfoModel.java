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


public class ArAgingHeaderInfoModel
{
    private String groupKey;
    private String reportBucket;
    private Integer totalCustomers;
    private Integer totalInvoicesOutstanding;
    private Double totalOutstandingAmount;
    private Double totalArAmount;
    private Double percentageOfTotalAr;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The aging bucket this data belongs to.
     */
    public String getreportBucket() { return this.reportBucket; }
    /**
     * The aging bucket this data belongs to.
     */
    public void setreportBucket(String value) { this.reportBucket = value; }
    /**
     * The total number of customers.
     */
    public Integer gettotalCustomers() { return this.totalCustomers; }
    /**
     * The total number of customers.
     */
    public void settotalCustomers(Integer value) { this.totalCustomers = value; }
    /**
     * The total number of invoices outstanding.
     */
    public Integer gettotalInvoicesOutstanding() { return this.totalInvoicesOutstanding; }
    /**
     * The total number of invoices outstanding.
     */
    public void settotalInvoicesOutstanding(Integer value) { this.totalInvoicesOutstanding = value; }
    /**
     * The total amount outstanding.
     */
    public Double gettotalOutstandingAmount() { return this.totalOutstandingAmount; }
    /**
     * The total amount outstanding.
     */
    public void settotalOutstandingAmount(Double value) { this.totalOutstandingAmount = value; }
    /**
     * The total amount for AR.
     */
    public Double gettotalArAmount() { return this.totalArAmount; }
    /**
     * The total amount for AR.
     */
    public void settotalArAmount(Double value) { this.totalArAmount = value; }
    /**
     * Portion of Total AR this data represents.
     */
    public Double getpercentageOfTotalAr() { return this.percentageOfTotalAr; }
    /**
     * Portion of Total AR this data represents.
     */
    public void setpercentageOfTotalAr(Double value) { this.percentageOfTotalAr = value; }
};
