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
 * @version    2021.39
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
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
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The aging bucket this data belongs to.
     */
    public String getReportBucket() { return this.reportBucket; }
    /**
     * The aging bucket this data belongs to.
     */
    public void setReportBucket(String value) { this.reportBucket = value; }
    /**
     * The total number of customers.
     */
    public Integer getTotalCustomers() { return this.totalCustomers; }
    /**
     * The total number of customers.
     */
    public void setTotalCustomers(Integer value) { this.totalCustomers = value; }
    /**
     * The total number of invoices outstanding.
     */
    public Integer getTotalInvoicesOutstanding() { return this.totalInvoicesOutstanding; }
    /**
     * The total number of invoices outstanding.
     */
    public void setTotalInvoicesOutstanding(Integer value) { this.totalInvoicesOutstanding = value; }
    /**
     * The total amount outstanding.
     */
    public Double getTotalOutstandingAmount() { return this.totalOutstandingAmount; }
    /**
     * The total amount outstanding.
     */
    public void setTotalOutstandingAmount(Double value) { this.totalOutstandingAmount = value; }
    /**
     * The total amount for AR.
     */
    public Double getTotalArAmount() { return this.totalArAmount; }
    /**
     * The total amount for AR.
     */
    public void setTotalArAmount(Double value) { this.totalArAmount = value; }
    /**
     * Portion of Total AR this data represents.
     */
    public Double getPercentageOfTotalAr() { return this.percentageOfTotalAr; }
    /**
     * Portion of Total AR this data represents.
     */
    public void setPercentageOfTotalAr(Double value) { this.percentageOfTotalAr = value; }
};
