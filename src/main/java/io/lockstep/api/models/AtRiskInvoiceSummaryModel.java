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
     */
    public Date getreportDate() { return this.reportDate; }
    /**
     * The date of the report
     */
    public void setreportDate(Date value) { this.reportDate = value; }
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
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getcustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setcustomerId(String value) { this.customerId = value; }
    /**
     * The unique ID number of this invoice.
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The unique ID number of this invoice.
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * A reference code that is used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public String getinvoiceNumber() { return this.invoiceNumber; }
    /**
     * A reference code that is used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     */
    public void setinvoiceNumber(String value) { this.invoiceNumber = value; }
    /**
     * The reporting date for this invoice.
     */
    public Date getinvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     */
    public void setinvoiceDate(Date value) { this.invoiceDate = value; }
    /**
     * The name of the counterparty for the invoice, for example, a customer or vendor.
     */
    public String getcustomerName() { return this.customerName; }
    /**
     * The name of the counterparty for the invoice, for example, a customer or vendor.
     */
    public void setcustomerName(String value) { this.customerName = value; }
    /**
     * The status of the invoice.
     */
    public String getstatus() { return this.status; }
    /**
     * The status of the invoice.
     */
    public void setstatus(String value) { this.status = value; }
    /**
     * The due date of the invoice.
     */
    public Date getpaymentDueDate() { return this.paymentDueDate; }
    /**
     * The due date of the invoice.
     */
    public void setpaymentDueDate(Date value) { this.paymentDueDate = value; }
    /**
     * The total amount of the Invoice.
     */
    public Double getinvoiceAmount() { return this.invoiceAmount; }
    /**
     * The total amount of the Invoice.
     */
    public void setinvoiceAmount(Double value) { this.invoiceAmount = value; }
    /**
     * The remaining balance value of this invoice.
     */
    public Double getoutstandingBalance() { return this.outstandingBalance; }
    /**
     * The remaining balance value of this invoice.
     */
    public void setoutstandingBalance(Double value) { this.outstandingBalance = value; }
    /**
     * A code identifying the type of this Invoice.
     */
    public String getinvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this Invoice.
     */
    public void setinvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * The date stamp for the newest Activity on this Invoice.
     */
    public Date getnewestActivity() { return this.newestActivity; }
    /**
     * The date stamp for the newest Activity on this Invoice.
     */
    public void setnewestActivity(Date value) { this.newestActivity = value; }
    /**
     * The number of days this Invoice is past due.
     */
    public Integer getdaysPastDue() { return this.daysPastDue; }
    /**
     * The number of days this Invoice is past due.
     */
    public void setdaysPastDue(Integer value) { this.daysPastDue = value; }
    /**
     * The memo text of the payments associated to this invoice.
     */
    public String[] getpaymentNumbers() { return this.paymentNumbers; }
    /**
     * The memo text of the payments associated to this invoice.
     */
    public void setpaymentNumbers(String[] value) { this.paymentNumbers = value; }
    /**
     * The ids of the payments associated to this invoice.
     */
    public String[] getpaymentIds() { return this.paymentIds; }
    /**
     * The ids of the payments associated to this invoice.
     */
    public void setpaymentIds(String[] value) { this.paymentIds = value; }
};
