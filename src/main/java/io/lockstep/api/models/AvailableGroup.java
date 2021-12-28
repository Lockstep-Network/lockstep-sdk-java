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


public class AvailableGroup
{
    private String groupKey;
    private Integer invoiceCount;
    private Integer lineCount;
    private Integer companyCount;
    private Integer contactCount;
    private Integer paymentCount;
    private Integer paymentAppliedCount;

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
     * The number of invoices.
     */
    public Integer getinvoiceCount() { return this.invoiceCount; }
    /**
     * The number of invoices.
     */
    public void setinvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * The number of invoice lines.
     */
    public Integer getlineCount() { return this.lineCount; }
    /**
     * The number of invoice lines.
     */
    public void setlineCount(Integer value) { this.lineCount = value; }
    /**
     * The number of companies.
     */
    public Integer getcompanyCount() { return this.companyCount; }
    /**
     * The number of companies.
     */
    public void setcompanyCount(Integer value) { this.companyCount = value; }
    /**
     * The number of contacts.
     */
    public Integer getcontactCount() { return this.contactCount; }
    /**
     * The number of contacts.
     */
    public void setcontactCount(Integer value) { this.contactCount = value; }
    /**
     * The number of payments.
     */
    public Integer getpaymentCount() { return this.paymentCount; }
    /**
     * The number of payments.
     */
    public void setpaymentCount(Integer value) { this.paymentCount = value; }
    /**
     * The number of payments applied.
     */
    public Integer getpaymentAppliedCount() { return this.paymentAppliedCount; }
    /**
     * The number of payments applied.
     */
    public void setpaymentAppliedCount(Integer value) { this.paymentAppliedCount = value; }
};
