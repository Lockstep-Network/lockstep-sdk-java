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

public class ArHeaderInfoModel
{
    private String groupKey;
    private Date reportPeriod;
    private Integer totalCustomers;
    private Integer totalInvoices;
    private Double totalInvoicedAmount;
    private Double totalUnappliedPayments;
    private Double totalCollected;
    private Double totalArAmount;
    private Integer totalInvoicesPaid;
    private Integer totalInvoicesPastDue;
    private Integer totalInvoices90DaysPastDue;
    private Double totalPastDueAmount;
    private Double totalPastDueAmount90Days;
    private Double percentageOfTotalAr;
    private Double dso;
    private Double totalInvoiceAmountCurrentYear;
    private Double totalInvoiceAmountPreviousYear;
    private Double totalPaymentAmountCurrentYear;
    private Integer totalCollectedPastThirtyDays;
    private Integer totalInvoicesPaidPastThirtyDays;
    private Double percentageOfTotalAr90DaysPastDue;

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
     * The date of the report
     */
    public Date getreportPeriod() { return this.reportPeriod; }
    /**
     * The date of the report
     */
    public void setreportPeriod(Date value) { this.reportPeriod = value; }
    /**
     * The total number of customers.
     */
    public Integer gettotalCustomers() { return this.totalCustomers; }
    /**
     * The total number of customers.
     */
    public void settotalCustomers(Integer value) { this.totalCustomers = value; }
    /**
     * The total number of invoices.
     */
    public Integer gettotalInvoices() { return this.totalInvoices; }
    /**
     * The total number of invoices.
     */
    public void settotalInvoices(Integer value) { this.totalInvoices = value; }
    /**
     * The total amount invoiced.
     */
    public Double gettotalInvoicedAmount() { return this.totalInvoicedAmount; }
    /**
     * The total amount invoiced.
     */
    public void settotalInvoicedAmount(Double value) { this.totalInvoicedAmount = value; }
    /**
     * The total number of unapplied payments.
     */
    public Double gettotalUnappliedPayments() { return this.totalUnappliedPayments; }
    /**
     * The total number of unapplied payments.
     */
    public void settotalUnappliedPayments(Double value) { this.totalUnappliedPayments = value; }
    /**
     * The total amount of collected payments.
     */
    public Double gettotalCollected() { return this.totalCollected; }
    /**
     * The total amount of collected payments.
     */
    public void settotalCollected(Double value) { this.totalCollected = value; }
    /**
     * The total accounts receivable amount.
     */
    public Double gettotalArAmount() { return this.totalArAmount; }
    /**
     * The total accounts receivable amount.
     */
    public void settotalArAmount(Double value) { this.totalArAmount = value; }
    /**
     * The number of paid invoices.
     */
    public Integer gettotalInvoicesPaid() { return this.totalInvoicesPaid; }
    /**
     * The number of paid invoices.
     */
    public void settotalInvoicesPaid(Integer value) { this.totalInvoicesPaid = value; }
    /**
     * The number of past due invoices.
     */
    public Integer gettotalInvoicesPastDue() { return this.totalInvoicesPastDue; }
    /**
     * The number of past due invoices.
     */
    public void settotalInvoicesPastDue(Integer value) { this.totalInvoicesPastDue = value; }
    /**
     * The number of past due invoices for the last 90 days.
     */
    public Integer gettotalInvoices90DaysPastDue() { return this.totalInvoices90DaysPastDue; }
    /**
     * The number of past due invoices for the last 90 days.
     */
    public void settotalInvoices90DaysPastDue(Integer value) { this.totalInvoices90DaysPastDue = value; }
    /**
     * The total amount past due.
     */
    public Double gettotalPastDueAmount() { return this.totalPastDueAmount; }
    /**
     * The total amount past due.
     */
    public void settotalPastDueAmount(Double value) { this.totalPastDueAmount = value; }
    /**
     * The total past due for the past 90 days.
     */
    public Double gettotalPastDueAmount90Days() { return this.totalPastDueAmount90Days; }
    /**
     * The total past due for the past 90 days.
     */
    public void settotalPastDueAmount90Days(Double value) { this.totalPastDueAmount90Days = value; }
    /**
     * Portion of Total AR that is Past due.
     */
    public Double getpercentageOfTotalAr() { return this.percentageOfTotalAr; }
    /**
     * Portion of Total AR that is Past due.
     */
    public void setpercentageOfTotalAr(Double value) { this.percentageOfTotalAr = value; }
    /**
     * Daily sales outstanding.
     */
    public Double getdso() { return this.dso; }
    /**
     * Daily sales outstanding.
     */
    public void setdso(Double value) { this.dso = value; }
    /**
     * The total amount invoiced, due this year.
     */
    public Double gettotalInvoiceAmountCurrentYear() { return this.totalInvoiceAmountCurrentYear; }
    /**
     * The total amount invoiced, due this year.
     */
    public void settotalInvoiceAmountCurrentYear(Double value) { this.totalInvoiceAmountCurrentYear = value; }
    /**
     * The total amount invoiced, due last year.
     */
    public Double gettotalInvoiceAmountPreviousYear() { return this.totalInvoiceAmountPreviousYear; }
    /**
     * The total amount invoiced, due last year.
     */
    public void settotalInvoiceAmountPreviousYear(Double value) { this.totalInvoiceAmountPreviousYear = value; }
    /**
     * The total of all payments received this year.
     */
    public Double gettotalPaymentAmountCurrentYear() { return this.totalPaymentAmountCurrentYear; }
    /**
     * The total of all payments received this year.
     */
    public void settotalPaymentAmountCurrentYear(Double value) { this.totalPaymentAmountCurrentYear = value; }
    /**
     * The total amount of payments received in the last 30 days
     */
    public Integer gettotalCollectedPastThirtyDays() { return this.totalCollectedPastThirtyDays; }
    /**
     * The total amount of payments received in the last 30 days
     */
    public void settotalCollectedPastThirtyDays(Integer value) { this.totalCollectedPastThirtyDays = value; }
    /**
     * The total amount of Invoices paid in the last 30 days
     */
    public Integer gettotalInvoicesPaidPastThirtyDays() { return this.totalInvoicesPaidPastThirtyDays; }
    /**
     * The total amount of Invoices paid in the last 30 days
     */
    public void settotalInvoicesPaidPastThirtyDays(Integer value) { this.totalInvoicesPaidPastThirtyDays = value; }
    /**
     * Portion of Total AR that is 90+ days Past due.
     */
    public Double getpercentageOfTotalAr90DaysPastDue() { return this.percentageOfTotalAr90DaysPastDue; }
    /**
     * Portion of Total AR that is 90+ days Past due.
     */
    public void setpercentageOfTotalAr90DaysPastDue(Double value) { this.percentageOfTotalAr90DaysPastDue = value; }
};
