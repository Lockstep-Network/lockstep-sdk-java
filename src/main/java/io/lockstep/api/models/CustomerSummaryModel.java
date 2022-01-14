
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
     * The unique ID of this company.
     *
     * @return The field companyId
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * The unique ID of this company.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * The name of the company.
     *
     * @return The field companyName
     */
    public String getCompanyName() { return this.companyName; }
    /**
     * The name of the company.
     *
     * @param value The new value for companyName
     */
    public void setCompanyName(String value) { this.companyName = value; }
    /**
     * The name of the primary contact.
     *
     * @return The field primaryContact
     */
    public String getPrimaryContact() { return this.primaryContact; }
    /**
     * The name of the primary contact.
     *
     * @param value The new value for primaryContact
     */
    public void setPrimaryContact(String value) { this.primaryContact = value; }
    /**
     * The number of outstanding invoices for this customer.
     *
     * @return The field outstandingInvoices
     */
    public Integer getOutstandingInvoices() { return this.outstandingInvoices; }
    /**
     * The number of outstanding invoices for this customer.
     *
     * @param value The new value for outstandingInvoices
     */
    public void setOutstandingInvoices(Integer value) { this.outstandingInvoices = value; }
    /**
     * The number of open invoices.
     *
     * @return The field totalInvoicesOpen
     */
    public Integer getTotalInvoicesOpen() { return this.totalInvoicesOpen; }
    /**
     * The number of open invoices.
     *
     * @param value The new value for totalInvoicesOpen
     */
    public void setTotalInvoicesOpen(Integer value) { this.totalInvoicesOpen = value; }
    /**
     * The number of past due invoices.
     *
     * @return The field totalInvoicesPastDue
     */
    public Integer getTotalInvoicesPastDue() { return this.totalInvoicesPastDue; }
    /**
     * The number of past due invoices.
     *
     * @param value The new value for totalInvoicesPastDue
     */
    public void setTotalInvoicesPastDue(Integer value) { this.totalInvoicesPastDue = value; }
    /**
     * The number of closed invoices for this customer.
     *
     * @return The field closedInvoices
     */
    public Integer getClosedInvoices() { return this.closedInvoices; }
    /**
     * The number of closed invoices for this customer.
     *
     * @param value The new value for closedInvoices
     */
    public void setClosedInvoices(Integer value) { this.closedInvoices = value; }
    /**
     * The total from collected payments.
     *
     * @return The field amountCollected
     */
    public Double getAmountCollected() { return this.amountCollected; }
    /**
     * The total from collected payments.
     *
     * @param value The new value for amountCollected
     */
    public void setAmountCollected(Double value) { this.amountCollected = value; }
    /**
     * The total balance of outstanding invoices.
     *
     * @return The field outstandingAmount
     */
    public Double getOutstandingAmount() { return this.outstandingAmount; }
    /**
     * The total balance of outstanding invoices.
     *
     * @param value The new value for outstandingAmount
     */
    public void setOutstandingAmount(Double value) { this.outstandingAmount = value; }
    /**
     * The total amount past due for this customer.
     *
     * @return The field amountPastDue
     */
    public Double getAmountPastDue() { return this.amountPastDue; }
    /**
     * The total amount past due for this customer.
     *
     * @param value The new value for amountPastDue
     */
    public void setAmountPastDue(Double value) { this.amountPastDue = value; }
    /**
     * The total value of unapplied Payments for this Customer.
     *
     * @return The field unappliedPayments
     */
    public Double getUnappliedPayments() { return this.unappliedPayments; }
    /**
     * The total value of unapplied Payments for this Customer.
     *
     * @param value The new value for unappliedPayments
     */
    public void setUnappliedPayments(Double value) { this.unappliedPayments = value; }
    /**
     * Portion of Total AR for this Customer that is Past due. (TotalPastDue / Total AR).
     *
     * @return The field percentOfTotalAr
     */
    public Double getPercentOfTotalAr() { return this.percentOfTotalAr; }
    /**
     * Portion of Total AR for this Customer that is Past due. (TotalPastDue / Total AR).
     *
     * @param value The new value for percentOfTotalAr
     */
    public void setPercentOfTotalAr(Double value) { this.percentOfTotalAr = value; }
    /**
     * Daily sales outstanding value for this Customer.
     *
     * @return The field dso
     */
    public Double getDso() { return this.dso; }
    /**
     * Daily sales outstanding value for this Customer.
     *
     * @param value The new value for dso
     */
    public void setDso(Double value) { this.dso = value; }
    /**
     * The date stamp for the newest Activity on this Customer.
     *
     * @return The field newestActivity
     */
    public Date getNewestActivity() { return this.newestActivity; }
    /**
     * The date stamp for the newest Activity on this Customer.
     *
     * @param value The new value for newestActivity
     */
    public void setNewestActivity(Date value) { this.newestActivity = value; }
};
