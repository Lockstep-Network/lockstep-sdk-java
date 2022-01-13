
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
     * The date of the report
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getReportPeriod() { return this.reportPeriod; }
    /**
     * The date of the report
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setReportPeriod(Date value) { this.reportPeriod = value; }
    /**
     * The total number of customers.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalCustomers() { return this.totalCustomers; }
    /**
     * The total number of customers.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalCustomers(Integer value) { this.totalCustomers = value; }
    /**
     * The total number of invoices.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalInvoices() { return this.totalInvoices; }
    /**
     * The total number of invoices.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalInvoices(Integer value) { this.totalInvoices = value; }
    /**
     * The total amount invoiced.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalInvoicedAmount() { return this.totalInvoicedAmount; }
    /**
     * The total amount invoiced.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalInvoicedAmount(Double value) { this.totalInvoicedAmount = value; }
    /**
     * The total number of unapplied payments.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalUnappliedPayments() { return this.totalUnappliedPayments; }
    /**
     * The total number of unapplied payments.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalUnappliedPayments(Double value) { this.totalUnappliedPayments = value; }
    /**
     * The total amount of collected payments.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalCollected() { return this.totalCollected; }
    /**
     * The total amount of collected payments.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalCollected(Double value) { this.totalCollected = value; }
    /**
     * The total accounts receivable amount.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalArAmount() { return this.totalArAmount; }
    /**
     * The total accounts receivable amount.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalArAmount(Double value) { this.totalArAmount = value; }
    /**
     * The number of paid invoices.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalInvoicesPaid() { return this.totalInvoicesPaid; }
    /**
     * The number of paid invoices.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalInvoicesPaid(Integer value) { this.totalInvoicesPaid = value; }
    /**
     * The number of past due invoices.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalInvoicesPastDue() { return this.totalInvoicesPastDue; }
    /**
     * The number of past due invoices.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalInvoicesPastDue(Integer value) { this.totalInvoicesPastDue = value; }
    /**
     * The number of past due invoices for the last 90 days.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalInvoices90DaysPastDue() { return this.totalInvoices90DaysPastDue; }
    /**
     * The number of past due invoices for the last 90 days.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalInvoices90DaysPastDue(Integer value) { this.totalInvoices90DaysPastDue = value; }
    /**
     * The total amount past due.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalPastDueAmount() { return this.totalPastDueAmount; }
    /**
     * The total amount past due.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalPastDueAmount(Double value) { this.totalPastDueAmount = value; }
    /**
     * The total past due for the past 90 days.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalPastDueAmount90Days() { return this.totalPastDueAmount90Days; }
    /**
     * The total past due for the past 90 days.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalPastDueAmount90Days(Double value) { this.totalPastDueAmount90Days = value; }
    /**
     * Portion of Total AR that is Past due.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getPercentageOfTotalAr() { return this.percentageOfTotalAr; }
    /**
     * Portion of Total AR that is Past due.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setPercentageOfTotalAr(Double value) { this.percentageOfTotalAr = value; }
    /**
     * Daily sales outstanding.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getDso() { return this.dso; }
    /**
     * Daily sales outstanding.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setDso(Double value) { this.dso = value; }
    /**
     * The total amount invoiced, due this year.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalInvoiceAmountCurrentYear() { return this.totalInvoiceAmountCurrentYear; }
    /**
     * The total amount invoiced, due this year.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalInvoiceAmountCurrentYear(Double value) { this.totalInvoiceAmountCurrentYear = value; }
    /**
     * The total amount invoiced, due last year.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalInvoiceAmountPreviousYear() { return this.totalInvoiceAmountPreviousYear; }
    /**
     * The total amount invoiced, due last year.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalInvoiceAmountPreviousYear(Double value) { this.totalInvoiceAmountPreviousYear = value; }
    /**
     * The total of all payments received this year.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getTotalPaymentAmountCurrentYear() { return this.totalPaymentAmountCurrentYear; }
    /**
     * The total of all payments received this year.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setTotalPaymentAmountCurrentYear(Double value) { this.totalPaymentAmountCurrentYear = value; }
    /**
     * The total amount of payments received in the last 30 days
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalCollectedPastThirtyDays() { return this.totalCollectedPastThirtyDays; }
    /**
     * The total amount of payments received in the last 30 days
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalCollectedPastThirtyDays(Integer value) { this.totalCollectedPastThirtyDays = value; }
    /**
     * The total amount of Invoices paid in the last 30 days
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalInvoicesPaidPastThirtyDays() { return this.totalInvoicesPaidPastThirtyDays; }
    /**
     * The total amount of Invoices paid in the last 30 days
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalInvoicesPaidPastThirtyDays(Integer value) { this.totalInvoicesPaidPastThirtyDays = value; }
    /**
     * Portion of Total AR that is 90+ days Past due.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getPercentageOfTotalAr90DaysPastDue() { return this.percentageOfTotalAr90DaysPastDue; }
    /**
     * Portion of Total AR that is 90+ days Past due.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setPercentageOfTotalAr90DaysPastDue(Double value) { this.percentageOfTotalAr90DaysPastDue = value; }
};
