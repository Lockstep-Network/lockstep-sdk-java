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
    public String[] getMessages() { return this.messages; }
    /**
     * If the API call produced messages, this element will contain a list of user-visible
     * text strings that contain information about what work occurred in the API.
     */
    public void setMessages(String[] value) { this.messages = value; }
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
     * The number of invoices migrated
     */
    public Integer getInvoiceCount() { return this.invoiceCount; }
    /**
     * The number of invoices migrated
     */
    public void setInvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * The number of addresses migrated
     */
    public Integer getAddressCount() { return this.addressCount; }
    /**
     * The number of addresses migrated
     */
    public void setAddressCount(Integer value) { this.addressCount = value; }
    /**
     * The number of invoice and invoice line fields migrated
     */
    public Integer getInvoiceFieldCount() { return this.invoiceFieldCount; }
    /**
     * The number of invoice and invoice line fields migrated
     */
    public void setInvoiceFieldCount(Integer value) { this.invoiceFieldCount = value; }
    /**
     * The number of invoice lines migrated
     */
    public Integer getLineCount() { return this.lineCount; }
    /**
     * The number of invoice lines migrated
     */
    public void setLineCount(Integer value) { this.lineCount = value; }
    /**
     * The number of contacts migrated
     */
    public Integer getContactCount() { return this.contactCount; }
    /**
     * The number of contacts migrated
     */
    public void setContactCount(Integer value) { this.contactCount = value; }
    /**
     * The number of companies migrated
     */
    public Integer getCompanyCount() { return this.companyCount; }
    /**
     * The number of companies migrated
     */
    public void setCompanyCount(Integer value) { this.companyCount = value; }
    /**
     * The number of payments migrated
     */
    public Integer getPaymentCount() { return this.paymentCount; }
    /**
     * The number of payments migrated
     */
    public void setPaymentCount(Integer value) { this.paymentCount = value; }
    /**
     * The number of payment fields migrated
     */
    public Integer getPaymentFieldCount() { return this.paymentFieldCount; }
    /**
     * The number of payment fields migrated
     */
    public void setPaymentFieldCount(Integer value) { this.paymentFieldCount = value; }
    /**
     * The number of payments applied migrated
     */
    public Integer getPaymentAppliedCount() { return this.paymentAppliedCount; }
    /**
     * The number of payments applied migrated
     */
    public void setPaymentAppliedCount(Integer value) { this.paymentAppliedCount = value; }
};
