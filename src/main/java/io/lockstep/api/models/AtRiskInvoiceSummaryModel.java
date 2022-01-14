
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
 * @version    2022.2
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;
public class AtRiskInvoiceSummaryModel
{
    private Date reportDate;
    private String groupKey;
    private String customerId;
    private String invoiceId;
    private String invoiceNumber;
    private Date invoiceDate;
    private String customerName;
    private String status;
    private Date paymentDueDate;
    private Double invoiceAmount;
    private Double outstandingBalance;
    private String invoiceTypeCode;
    private Date newestActivity;
    private Integer daysPastDue;
    private String[] paymentNumbers;
    private String[] paymentIds;

    /**
     * The date of the report
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getReportDate() { return this.reportDate; }
    /**
     * The date of the report
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setReportDate(Date value) { this.reportDate = value; }
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
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID number of this invoice.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * The unique ID number of this invoice.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * A reference code that is used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceNumber() { return this.invoiceNumber; }
    /**
     * A reference code that is used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceNumber(String value) { this.invoiceNumber = value; }
    /**
     * The reporting date for this invoice.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getInvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setInvoiceDate(Date value) { this.invoiceDate = value; }
    /**
     * The name of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCustomerName() { return this.customerName; }
    /**
     * The name of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCustomerName(String value) { this.customerName = value; }
    /**
     * The status of the invoice.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getStatus() { return this.status; }
    /**
     * The status of the invoice.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setStatus(String value) { this.status = value; }
    /**
     * The due date of the invoice.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getPaymentDueDate() { return this.paymentDueDate; }
    /**
     * The due date of the invoice.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setPaymentDueDate(Date value) { this.paymentDueDate = value; }
    /**
     * The total amount of the Invoice.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getInvoiceAmount() { return this.invoiceAmount; }
    /**
     * The total amount of the Invoice.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setInvoiceAmount(Double value) { this.invoiceAmount = value; }
    /**
     * The remaining balance value of this invoice.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getOutstandingBalance() { return this.outstandingBalance; }
    /**
     * The remaining balance value of this invoice.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setOutstandingBalance(Double value) { this.outstandingBalance = value; }
    /**
     * A code identifying the type of this Invoice.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this Invoice.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * The date stamp for the newest Activity on this Invoice.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getNewestActivity() { return this.newestActivity; }
    /**
     * The date stamp for the newest Activity on this Invoice.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setNewestActivity(Date value) { this.newestActivity = value; }
    /**
     * The number of days this Invoice is past due.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getDaysPastDue() { return this.daysPastDue; }
    /**
     * The number of days this Invoice is past due.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setDaysPastDue(Integer value) { this.daysPastDue = value; }
    /**
     * The memo text of the payments associated to this invoice.
     *
     * @return an array of {@link java.lang.String} objects.
     */
    public String[] getPaymentNumbers() { return this.paymentNumbers; }
    /**
     * The memo text of the payments associated to this invoice.
     *
     * @param value an array of {@link java.lang.String} objects.
     */
    public void setPaymentNumbers(String[] value) { this.paymentNumbers = value; }
    /**
     * The ids of the payments associated to this invoice.
     *
     * @return an array of {@link java.lang.String} objects.
     */
    public String[] getPaymentIds() { return this.paymentIds; }
    /**
     * The ids of the payments associated to this invoice.
     *
     * @param value an array of {@link java.lang.String} objects.
     */
    public void setPaymentIds(String[] value) { this.paymentIds = value; }
};
