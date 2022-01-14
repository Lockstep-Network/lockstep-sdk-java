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
     * @return The date of the report
     */
    public Date getReportDate() { return this.reportDate; }
    /**
     * @param value - The date of the report
     */
    public void setReportDate(Date value) { this.reportDate = value; }
    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getCustomerId() { return this.customerId; }
    /**
     * @param value - The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setCustomerId(String value) { this.customerId = value; }
    /**
     * @return The unique ID number of this invoice.
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * @param value - The unique ID number of this invoice.
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * @return A reference code that is used to identify this invoice. The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public String getInvoiceNumber() { return this.invoiceNumber; }
    /**
     * @param value - A reference code that is used to identify this invoice. The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public void setInvoiceNumber(String value) { this.invoiceNumber = value; }
    /**
     * @return The reporting date for this invoice.
     */
    public Date getInvoiceDate() { return this.invoiceDate; }
    /**
     * @param value - The reporting date for this invoice.
     */
    public void setInvoiceDate(Date value) { this.invoiceDate = value; }
    /**
     * @return The name of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getCustomerName() { return this.customerName; }
    /**
     * @param value - The name of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setCustomerName(String value) { this.customerName = value; }
    /**
     * @return The status of the invoice.
     */
    public String getStatus() { return this.status; }
    /**
     * @param value - The status of the invoice.
     */
    public void setStatus(String value) { this.status = value; }
    /**
     * @return The due date of the invoice.
     */
    public Date getPaymentDueDate() { return this.paymentDueDate; }
    /**
     * @param value - The due date of the invoice.
     */
    public void setPaymentDueDate(Date value) { this.paymentDueDate = value; }
    /**
     * @return The total amount of the Invoice.
     */
    public Double getInvoiceAmount() { return this.invoiceAmount; }
    /**
     * @param value - The total amount of the Invoice.
     */
    public void setInvoiceAmount(Double value) { this.invoiceAmount = value; }
    /**
     * @return The remaining balance value of this invoice.
     */
    public Double getOutstandingBalance() { return this.outstandingBalance; }
    /**
     * @param value - The remaining balance value of this invoice.
     */
    public void setOutstandingBalance(Double value) { this.outstandingBalance = value; }
    /**
     * @return A code identifying the type of this Invoice.
     */
    public String getInvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * @param value - A code identifying the type of this Invoice.
     */
    public void setInvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * @return The date stamp for the newest Activity on this Invoice.
     */
    public Date getNewestActivity() { return this.newestActivity; }
    /**
     * @param value - The date stamp for the newest Activity on this Invoice.
     */
    public void setNewestActivity(Date value) { this.newestActivity = value; }
    /**
     * @return The number of days this Invoice is past due.
     */
    public Integer getDaysPastDue() { return this.daysPastDue; }
    /**
     * @param value - The number of days this Invoice is past due.
     */
    public void setDaysPastDue(Integer value) { this.daysPastDue = value; }
    /**
     * @return The memo text of the payments associated to this invoice.
     */
    public String[] getPaymentNumbers() { return this.paymentNumbers; }
    /**
     * @param value - The memo text of the payments associated to this invoice.
     */
    public void setPaymentNumbers(String[] value) { this.paymentNumbers = value; }
    /**
     * @return The ids of the payments associated to this invoice.
     */
    public String[] getPaymentIds() { return this.paymentIds; }
    /**
     * @param value - The ids of the payments associated to this invoice.
     */
    public void setPaymentIds(String[] value) { this.paymentIds = value; }
};
