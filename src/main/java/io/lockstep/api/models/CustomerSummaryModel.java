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

public class CustomerSummaryModel
{
    private String groupKey;
    private String companyId;
    private String companyName;
    private String primaryContact;
    private Integer outstandingInvoices;
    private Integer totalInvoicesOpen;
    private Integer totalInvoicesPastDue;
    private Integer closedInvoices;
    private Double amountCollected;
    private Double outstandingAmount;
    private Double amountPastDue;
    private Double unappliedPayments;
    private Double percentOfTotalAr;
    private Double dso;
    private Date newestActivity;

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
     * The unique ID of this company.
     */
    public String getcompanyId() { return this.companyId; }
    /**
     * The unique ID of this company.
     */
    public void setcompanyId(String value) { this.companyId = value; }
    /**
     * The name of the company.
     */
    public String getcompanyName() { return this.companyName; }
    /**
     * The name of the company.
     */
    public void setcompanyName(String value) { this.companyName = value; }
    /**
     * The name of the primary contact.
     */
    public String getprimaryContact() { return this.primaryContact; }
    /**
     * The name of the primary contact.
     */
    public void setprimaryContact(String value) { this.primaryContact = value; }
    /**
     * The number of outstanding invoices for this customer.
     */
    public Integer getoutstandingInvoices() { return this.outstandingInvoices; }
    /**
     * The number of outstanding invoices for this customer.
     */
    public void setoutstandingInvoices(Integer value) { this.outstandingInvoices = value; }
    /**
     * The number of open invoices.
     */
    public Integer gettotalInvoicesOpen() { return this.totalInvoicesOpen; }
    /**
     * The number of open invoices.
     */
    public void settotalInvoicesOpen(Integer value) { this.totalInvoicesOpen = value; }
    /**
     * The number of past due invoices.
     */
    public Integer gettotalInvoicesPastDue() { return this.totalInvoicesPastDue; }
    /**
     * The number of past due invoices.
     */
    public void settotalInvoicesPastDue(Integer value) { this.totalInvoicesPastDue = value; }
    /**
     * The number of closed invoices for this customer.
     */
    public Integer getclosedInvoices() { return this.closedInvoices; }
    /**
     * The number of closed invoices for this customer.
     */
    public void setclosedInvoices(Integer value) { this.closedInvoices = value; }
    /**
     * The total from collected payments.
     */
    public Double getamountCollected() { return this.amountCollected; }
    /**
     * The total from collected payments.
     */
    public void setamountCollected(Double value) { this.amountCollected = value; }
    /**
     * The total balance of outstanding invoices.
     */
    public Double getoutstandingAmount() { return this.outstandingAmount; }
    /**
     * The total balance of outstanding invoices.
     */
    public void setoutstandingAmount(Double value) { this.outstandingAmount = value; }
    /**
     * The total amount past due for this customer.
     */
    public Double getamountPastDue() { return this.amountPastDue; }
    /**
     * The total amount past due for this customer.
     */
    public void setamountPastDue(Double value) { this.amountPastDue = value; }
    /**
     * The total value of unapplied Payments for this Customer.
     */
    public Double getunappliedPayments() { return this.unappliedPayments; }
    /**
     * The total value of unapplied Payments for this Customer.
     */
    public void setunappliedPayments(Double value) { this.unappliedPayments = value; }
    /**
     * Portion of Total AR for this Customer that is Past due. (TotalPastDue / Total AR).
     */
    public Double getpercentOfTotalAr() { return this.percentOfTotalAr; }
    /**
     * Portion of Total AR for this Customer that is Past due. (TotalPastDue / Total AR).
     */
    public void setpercentOfTotalAr(Double value) { this.percentOfTotalAr = value; }
    /**
     * Daily sales outstanding value for this Customer.
     */
    public Double getdso() { return this.dso; }
    /**
     * Daily sales outstanding value for this Customer.
     */
    public void setdso(Double value) { this.dso = value; }
    /**
     * The date stamp for the newest Activity on this Customer.
     */
    public Date getnewestActivity() { return this.newestActivity; }
    /**
     * The date stamp for the newest Activity on this Customer.
     */
    public void setnewestActivity(Date value) { this.newestActivity = value; }
};
