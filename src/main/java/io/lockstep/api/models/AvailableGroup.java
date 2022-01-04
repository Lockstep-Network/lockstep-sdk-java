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
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The number of invoices.
     */
    public Integer getInvoiceCount() { return this.invoiceCount; }
    /**
     * The number of invoices.
     */
    public void setInvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * The number of invoice lines.
     */
    public Integer getLineCount() { return this.lineCount; }
    /**
     * The number of invoice lines.
     */
    public void setLineCount(Integer value) { this.lineCount = value; }
    /**
     * The number of companies.
     */
    public Integer getCompanyCount() { return this.companyCount; }
    /**
     * The number of companies.
     */
    public void setCompanyCount(Integer value) { this.companyCount = value; }
    /**
     * The number of contacts.
     */
    public Integer getContactCount() { return this.contactCount; }
    /**
     * The number of contacts.
     */
    public void setContactCount(Integer value) { this.contactCount = value; }
    /**
     * The number of payments.
     */
    public Integer getPaymentCount() { return this.paymentCount; }
    /**
     * The number of payments.
     */
    public void setPaymentCount(Integer value) { this.paymentCount = value; }
    /**
     * The number of payments applied.
     */
    public Integer getPaymentAppliedCount() { return this.paymentAppliedCount; }
    /**
     * The number of payments applied.
     */
    public void setPaymentAppliedCount(Integer value) { this.paymentAppliedCount = value; }
};
