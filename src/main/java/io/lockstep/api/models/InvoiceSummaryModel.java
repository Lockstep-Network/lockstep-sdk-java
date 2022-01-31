
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
 * @version    2022.4
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;


/**
 * Contains summarized data for an invoice
 */
public class InvoiceSummaryModel
{
    private String groupKey;
    private String customerId;
    private String invoiceId;
    private String invoiceNumber;
    private String invoiceDate;
    private String customerName;
    private String status;
    private String paymentDueDate;
    private Double invoiceAmount;
    private Double outstandingBalance;
    private String invoiceTypeCode;
    private String newestActivity;
    private Integer daysPastDue;
    private String[] paymentNumbers;
    private String[] paymentIds;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @return The field customerId
     */
    public String getCustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @param value The new value for customerId
     */
    public void setCustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID number of this invoice.
     *
     * @return The field invoiceId
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * The unique ID number of this invoice.
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * A reference code that is used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @return The field invoiceNumber
     */
    public String getInvoiceNumber() { return this.invoiceNumber; }
    /**
     * A reference code that is used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @param value The new value for invoiceNumber
     */
    public void setInvoiceNumber(String value) { this.invoiceNumber = value; }
    /**
     * The reporting date for this invoice.
     *
     * @return The field invoiceDate
     */
    public String getInvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     *
     * @param value The new value for invoiceDate
     */
    public void setInvoiceDate(String value) { this.invoiceDate = value; }
    /**
     * The name of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @return The field customerName
     */
    public String getCustomerName() { return this.customerName; }
    /**
     * The name of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @param value The new value for customerName
     */
    public void setCustomerName(String value) { this.customerName = value; }
    /**
     * The status of the invoice.
     *
     * @return The field status
     */
    public String getStatus() { return this.status; }
    /**
     * The status of the invoice.
     *
     * @param value The new value for status
     */
    public void setStatus(String value) { this.status = value; }
    /**
     * The due date of the invoice.
     *
     * @return The field paymentDueDate
     */
    public String getPaymentDueDate() { return this.paymentDueDate; }
    /**
     * The due date of the invoice.
     *
     * @param value The new value for paymentDueDate
     */
    public void setPaymentDueDate(String value) { this.paymentDueDate = value; }
    /**
     * The total amount of the Invoice.
     *
     * @return The field invoiceAmount
     */
    public Double getInvoiceAmount() { return this.invoiceAmount; }
    /**
     * The total amount of the Invoice.
     *
     * @param value The new value for invoiceAmount
     */
    public void setInvoiceAmount(Double value) { this.invoiceAmount = value; }
    /**
     * The remaining balance value of this invoice.
     *
     * @return The field outstandingBalance
     */
    public Double getOutstandingBalance() { return this.outstandingBalance; }
    /**
     * The remaining balance value of this invoice.
     *
     * @param value The new value for outstandingBalance
     */
    public void setOutstandingBalance(Double value) { this.outstandingBalance = value; }
    /**
     * A code identifying the type of this Invoice.
     *
     * @return The field invoiceTypeCode
     */
    public String getInvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this Invoice.
     *
     * @param value The new value for invoiceTypeCode
     */
    public void setInvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * The date stamp for the newest Activity on this Invoice.
     *
     * @return The field newestActivity
     */
    public String getNewestActivity() { return this.newestActivity; }
    /**
     * The date stamp for the newest Activity on this Invoice.
     *
     * @param value The new value for newestActivity
     */
    public void setNewestActivity(String value) { this.newestActivity = value; }
    /**
     * The number of days this Invoice is past due.
     *
     * @return The field daysPastDue
     */
    public Integer getDaysPastDue() { return this.daysPastDue; }
    /**
     * The number of days this Invoice is past due.
     *
     * @param value The new value for daysPastDue
     */
    public void setDaysPastDue(Integer value) { this.daysPastDue = value; }
    /**
     * The memo text of the payments associated to this invoice.
     *
     * @return The field paymentNumbers
     */
    public String[] getPaymentNumbers() { return this.paymentNumbers; }
    /**
     * The memo text of the payments associated to this invoice.
     *
     * @param value The new value for paymentNumbers
     */
    public void setPaymentNumbers(String[] value) { this.paymentNumbers = value; }
    /**
     * The ids of the payments associated to this invoice.
     *
     * @return The field paymentIds
     */
    public String[] getPaymentIds() { return this.paymentIds; }
    /**
     * The ids of the payments associated to this invoice.
     *
     * @param value The new value for paymentIds
     */
    public void setPaymentIds(String[] value) { this.paymentIds = value; }
};
