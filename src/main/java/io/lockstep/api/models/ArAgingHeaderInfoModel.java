
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
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The aging bucket this data belongs to.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getReportBucket() { return this.reportBucket; }
    /**
     * The aging bucket this data belongs to.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setReportBucket(String value) { this.reportBucket = value; }
    /**
     * The total number of customers.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalCustomers() { return this.totalCustomers; }
    /**
     * The total number of customers.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalCustomers(Integer value) { this.totalCustomers = value; }
    /**
     * The total number of invoices outstanding.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalInvoicesOutstanding() { return this.totalInvoicesOutstanding; }
    /**
     * The total number of invoices outstanding.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalInvoicesOutstanding(Integer value) { this.totalInvoicesOutstanding = value; }
    /**
     * The total amount outstanding.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalOutstandingAmount() { return this.totalOutstandingAmount; }
    /**
     * The total amount outstanding.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalOutstandingAmount(Double value) { this.totalOutstandingAmount = value; }
    /**
     * The total amount for AR.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalArAmount() { return this.totalArAmount; }
    /**
     * The total amount for AR.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalArAmount(Double value) { this.totalArAmount = value; }
    /**
     * Portion of Total AR this data represents.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getPercentageOfTotalAr() { return this.percentageOfTotalAr; }
    /**
     * Portion of Total AR this data represents.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setPercentageOfTotalAr(Double value) { this.percentageOfTotalAr = value; }
};
