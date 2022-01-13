
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
     *
     * @return an array of {@link java.lang.String} objects.
     */
    public String[] getMessages() { return this.messages; }
    /**
     * If the API call produced messages, this element will contain a list of user-visible
     * text strings that contain information about what work occurred in the API.
     *
     * @param value an array of {@link java.lang.String} objects.
     */
    public void setMessages(String[] value) { this.messages = value; }
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
     * The number of invoices migrated
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getInvoiceCount() { return this.invoiceCount; }
    /**
     * The number of invoices migrated
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setInvoiceCount(Integer value) { this.invoiceCount = value; }
    /**
     * The number of addresses migrated
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getAddressCount() { return this.addressCount; }
    /**
     * The number of addresses migrated
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setAddressCount(Integer value) { this.addressCount = value; }
    /**
     * The number of invoice and invoice line fields migrated
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getInvoiceFieldCount() { return this.invoiceFieldCount; }
    /**
     * The number of invoice and invoice line fields migrated
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setInvoiceFieldCount(Integer value) { this.invoiceFieldCount = value; }
    /**
     * The number of invoice lines migrated
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getLineCount() { return this.lineCount; }
    /**
     * The number of invoice lines migrated
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setLineCount(Integer value) { this.lineCount = value; }
    /**
     * The number of contacts migrated
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getContactCount() { return this.contactCount; }
    /**
     * The number of contacts migrated
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setContactCount(Integer value) { this.contactCount = value; }
    /**
     * The number of companies migrated
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getCompanyCount() { return this.companyCount; }
    /**
     * The number of companies migrated
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setCompanyCount(Integer value) { this.companyCount = value; }
    /**
     * The number of payments migrated
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getPaymentCount() { return this.paymentCount; }
    /**
     * The number of payments migrated
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setPaymentCount(Integer value) { this.paymentCount = value; }
    /**
     * The number of payment fields migrated
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getPaymentFieldCount() { return this.paymentFieldCount; }
    /**
     * The number of payment fields migrated
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setPaymentFieldCount(Integer value) { this.paymentFieldCount = value; }
    /**
     * The number of payments applied migrated
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getPaymentAppliedCount() { return this.paymentAppliedCount; }
    /**
     * The number of payments applied migrated
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setPaymentAppliedCount(Integer value) { this.paymentAppliedCount = value; }
};
