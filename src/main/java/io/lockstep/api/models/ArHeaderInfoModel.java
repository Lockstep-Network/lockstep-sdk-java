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
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The date of the report
     */
    public Date getReportPeriod() { return this.reportPeriod; }
    /**
     * The date of the report
     */
    public void setReportPeriod(Date value) { this.reportPeriod = value; }
    /**
     * The total number of customers.
     */
    public Integer getTotalCustomers() { return this.totalCustomers; }
    /**
     * The total number of customers.
     */
    public void setTotalCustomers(Integer value) { this.totalCustomers = value; }
    /**
     * The total number of invoices.
     */
    public Integer getTotalInvoices() { return this.totalInvoices; }
    /**
     * The total number of invoices.
     */
    public void setTotalInvoices(Integer value) { this.totalInvoices = value; }
    /**
     * The total amount invoiced.
     */
    public Double getTotalInvoicedAmount() { return this.totalInvoicedAmount; }
    /**
     * The total amount invoiced.
     */
    public void setTotalInvoicedAmount(Double value) { this.totalInvoicedAmount = value; }
    /**
     * The total number of unapplied payments.
     */
    public Double getTotalUnappliedPayments() { return this.totalUnappliedPayments; }
    /**
     * The total number of unapplied payments.
     */
    public void setTotalUnappliedPayments(Double value) { this.totalUnappliedPayments = value; }
    /**
     * The total amount of collected payments.
     */
    public Double getTotalCollected() { return this.totalCollected; }
    /**
     * The total amount of collected payments.
     */
    public void setTotalCollected(Double value) { this.totalCollected = value; }
    /**
     * The total accounts receivable amount.
     */
    public Double getTotalArAmount() { return this.totalArAmount; }
    /**
     * The total accounts receivable amount.
     */
    public void setTotalArAmount(Double value) { this.totalArAmount = value; }
    /**
     * The number of paid invoices.
     */
    public Integer getTotalInvoicesPaid() { return this.totalInvoicesPaid; }
    /**
     * The number of paid invoices.
     */
    public void setTotalInvoicesPaid(Integer value) { this.totalInvoicesPaid = value; }
    /**
     * The number of past due invoices.
     */
    public Integer getTotalInvoicesPastDue() { return this.totalInvoicesPastDue; }
    /**
     * The number of past due invoices.
     */
    public void setTotalInvoicesPastDue(Integer value) { this.totalInvoicesPastDue = value; }
    /**
     * The number of past due invoices for the last 90 days.
     */
    public Integer getTotalInvoices90DaysPastDue() { return this.totalInvoices90DaysPastDue; }
    /**
     * The number of past due invoices for the last 90 days.
     */
    public void setTotalInvoices90DaysPastDue(Integer value) { this.totalInvoices90DaysPastDue = value; }
    /**
     * The total amount past due.
     */
    public Double getTotalPastDueAmount() { return this.totalPastDueAmount; }
    /**
     * The total amount past due.
     */
    public void setTotalPastDueAmount(Double value) { this.totalPastDueAmount = value; }
    /**
     * The total past due for the past 90 days.
     */
    public Double getTotalPastDueAmount90Days() { return this.totalPastDueAmount90Days; }
    /**
     * The total past due for the past 90 days.
     */
    public void setTotalPastDueAmount90Days(Double value) { this.totalPastDueAmount90Days = value; }
    /**
     * Portion of Total AR that is Past due.
     */
    public Double getPercentageOfTotalAr() { return this.percentageOfTotalAr; }
    /**
     * Portion of Total AR that is Past due.
     */
    public void setPercentageOfTotalAr(Double value) { this.percentageOfTotalAr = value; }
    /**
     * Daily sales outstanding.
     */
    public Double getDso() { return this.dso; }
    /**
     * Daily sales outstanding.
     */
    public void setDso(Double value) { this.dso = value; }
    /**
     * The total amount invoiced, due this year.
     */
    public Double getTotalInvoiceAmountCurrentYear() { return this.totalInvoiceAmountCurrentYear; }
    /**
     * The total amount invoiced, due this year.
     */
    public void setTotalInvoiceAmountCurrentYear(Double value) { this.totalInvoiceAmountCurrentYear = value; }
    /**
     * The total amount invoiced, due last year.
     */
    public Double getTotalInvoiceAmountPreviousYear() { return this.totalInvoiceAmountPreviousYear; }
    /**
     * The total amount invoiced, due last year.
     */
    public void setTotalInvoiceAmountPreviousYear(Double value) { this.totalInvoiceAmountPreviousYear = value; }
    /**
     * The total of all payments received this year.
     */
    public Double getTotalPaymentAmountCurrentYear() { return this.totalPaymentAmountCurrentYear; }
    /**
     * The total of all payments received this year.
     */
    public void setTotalPaymentAmountCurrentYear(Double value) { this.totalPaymentAmountCurrentYear = value; }
    /**
     * The total amount of payments received in the last 30 days
     */
    public Integer getTotalCollectedPastThirtyDays() { return this.totalCollectedPastThirtyDays; }
    /**
     * The total amount of payments received in the last 30 days
     */
    public void setTotalCollectedPastThirtyDays(Integer value) { this.totalCollectedPastThirtyDays = value; }
    /**
     * The total amount of Invoices paid in the last 30 days
     */
    public Integer getTotalInvoicesPaidPastThirtyDays() { return this.totalInvoicesPaidPastThirtyDays; }
    /**
     * The total amount of Invoices paid in the last 30 days
     */
    public void setTotalInvoicesPaidPastThirtyDays(Integer value) { this.totalInvoicesPaidPastThirtyDays = value; }
    /**
     * Portion of Total AR that is 90+ days Past due.
     */
    public Double getPercentageOfTotalAr90DaysPastDue() { return this.percentageOfTotalAr90DaysPastDue; }
    /**
     * Portion of Total AR that is 90+ days Past due.
     */
    public void setPercentageOfTotalAr90DaysPastDue(Double value) { this.percentageOfTotalAr90DaysPastDue = value; }
};
