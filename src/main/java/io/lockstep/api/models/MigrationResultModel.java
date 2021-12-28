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


public class MigrationResultModel
{
    private String[] messages;
    private String groupKey;
    private Integer invoiceCount;
    private Integer addressCount;
    private Integer invoiceFieldCount;
    private Integer lineCount;
    private Integer contactCount;
    private Integer companyCount;
    private Integer paymentCount;
    private Integer paymentFieldCount;
    private Integer paymentAppliedCount;

    /**
     * If the API call produced messages, this element will contain a list of user-visible
     * text strings that contain information about what work occurred in the API.
     */
    public String[] getmessages() { return this.messages; }
    /**
     * If the API call produced messages, this element will contain a list of user-visible
     * text strings that contain information about what work occurred in the API.
     */
    public void setmessages(String[] value) { this.messages = value; }
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
     * The number of invoices migrated
     */
    public Integer getinvoiceCount() { return this.invoiceCount; }
    /**
     * The number of invoices migrated
     */
    public void setinvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * The number of addresses migrated
     */
    public Integer getaddressCount() { return this.addressCount; }
    /**
     * The number of addresses migrated
     */
    public void setaddressCount(Integer value) { this.addressCount = value; }
    /**
     * The number of invoice and invoice line fields migrated
     */
    public Integer getinvoiceFieldCount() { return this.invoiceFieldCount; }
    /**
     * The number of invoice and invoice line fields migrated
     */
    public void setinvoiceFieldCount(Integer value) { this.invoiceFieldCount = value; }
    /**
     * The number of invoice lines migrated
     */
    public Integer getlineCount() { return this.lineCount; }
    /**
     * The number of invoice lines migrated
     */
    public void setlineCount(Integer value) { this.lineCount = value; }
    /**
     * The number of contacts migrated
     */
    public Integer getcontactCount() { return this.contactCount; }
    /**
     * The number of contacts migrated
     */
    public void setcontactCount(Integer value) { this.contactCount = value; }
    /**
     * The number of companies migrated
     */
    public Integer getcompanyCount() { return this.companyCount; }
    /**
     * The number of companies migrated
     */
    public void setcompanyCount(Integer value) { this.companyCount = value; }
    /**
     * The number of payments migrated
     */
    public Integer getpaymentCount() { return this.paymentCount; }
    /**
     * The number of payments migrated
     */
    public void setpaymentCount(Integer value) { this.paymentCount = value; }
    /**
     * The number of payment fields migrated
     */
    public Integer getpaymentFieldCount() { return this.paymentFieldCount; }
    /**
     * The number of payment fields migrated
     */
    public void setpaymentFieldCount(Integer value) { this.paymentFieldCount = value; }
    /**
     * The number of payments applied migrated
     */
    public Integer getpaymentAppliedCount() { return this.paymentAppliedCount; }
    /**
     * The number of payments applied migrated
     */
    public void setpaymentAppliedCount(Integer value) { this.paymentAppliedCount = value; }
};
