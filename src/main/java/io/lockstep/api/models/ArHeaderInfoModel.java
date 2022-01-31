
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
 * Aggregated Accounts Receivable information.
 */
public class ArHeaderInfoModel
{
    private String groupKey;
    private String reportPeriod;
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
     * The date of the report
     *
     * @return The field reportPeriod
     */
    public String getReportPeriod() { return this.reportPeriod; }
    /**
     * The date of the report
     *
     * @param value The new value for reportPeriod
     */
    public void setReportPeriod(String value) { this.reportPeriod = value; }
    /**
     * The total number of customers.
     *
     * @return The field totalCustomers
     */
    public Integer getTotalCustomers() { return this.totalCustomers; }
    /**
     * The total number of customers.
     *
     * @param value The new value for totalCustomers
     */
    public void setTotalCustomers(Integer value) { this.totalCustomers = value; }
    /**
     * The total number of invoices.
     *
     * @return The field totalInvoices
     */
    public Integer getTotalInvoices() { return this.totalInvoices; }
    /**
     * The total number of invoices.
     *
     * @param value The new value for totalInvoices
     */
    public void setTotalInvoices(Integer value) { this.totalInvoices = value; }
    /**
     * The total amount invoiced.
     *
     * @return The field totalInvoicedAmount
     */
    public Double getTotalInvoicedAmount() { return this.totalInvoicedAmount; }
    /**
     * The total amount invoiced.
     *
     * @param value The new value for totalInvoicedAmount
     */
    public void setTotalInvoicedAmount(Double value) { this.totalInvoicedAmount = value; }
    /**
     * The total number of unapplied payments.
     *
     * @return The field totalUnappliedPayments
     */
    public Double getTotalUnappliedPayments() { return this.totalUnappliedPayments; }
    /**
     * The total number of unapplied payments.
     *
     * @param value The new value for totalUnappliedPayments
     */
    public void setTotalUnappliedPayments(Double value) { this.totalUnappliedPayments = value; }
    /**
     * The total amount of collected payments.
     *
     * @return The field totalCollected
     */
    public Double getTotalCollected() { return this.totalCollected; }
    /**
     * The total amount of collected payments.
     *
     * @param value The new value for totalCollected
     */
    public void setTotalCollected(Double value) { this.totalCollected = value; }
    /**
     * The total accounts receivable amount.
     *
     * @return The field totalArAmount
     */
    public Double getTotalArAmount() { return this.totalArAmount; }
    /**
     * The total accounts receivable amount.
     *
     * @param value The new value for totalArAmount
     */
    public void setTotalArAmount(Double value) { this.totalArAmount = value; }
    /**
     * The number of paid invoices.
     *
     * @return The field totalInvoicesPaid
     */
    public Integer getTotalInvoicesPaid() { return this.totalInvoicesPaid; }
    /**
     * The number of paid invoices.
     *
     * @param value The new value for totalInvoicesPaid
     */
    public void setTotalInvoicesPaid(Integer value) { this.totalInvoicesPaid = value; }
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
     * The number of past due invoices for the last 90 days.
     *
     * @return The field totalInvoices90DaysPastDue
     */
    public Integer getTotalInvoices90DaysPastDue() { return this.totalInvoices90DaysPastDue; }
    /**
     * The number of past due invoices for the last 90 days.
     *
     * @param value The new value for totalInvoices90DaysPastDue
     */
    public void setTotalInvoices90DaysPastDue(Integer value) { this.totalInvoices90DaysPastDue = value; }
    /**
     * The total amount past due.
     *
     * @return The field totalPastDueAmount
     */
    public Double getTotalPastDueAmount() { return this.totalPastDueAmount; }
    /**
     * The total amount past due.
     *
     * @param value The new value for totalPastDueAmount
     */
    public void setTotalPastDueAmount(Double value) { this.totalPastDueAmount = value; }
    /**
     * The total past due for the past 90 days.
     *
     * @return The field totalPastDueAmount90Days
     */
    public Double getTotalPastDueAmount90Days() { return this.totalPastDueAmount90Days; }
    /**
     * The total past due for the past 90 days.
     *
     * @param value The new value for totalPastDueAmount90Days
     */
    public void setTotalPastDueAmount90Days(Double value) { this.totalPastDueAmount90Days = value; }
    /**
     * Portion of Total AR that is Past due.
     *
     * @return The field percentageOfTotalAr
     */
    public Double getPercentageOfTotalAr() { return this.percentageOfTotalAr; }
    /**
     * Portion of Total AR that is Past due.
     *
     * @param value The new value for percentageOfTotalAr
     */
    public void setPercentageOfTotalAr(Double value) { this.percentageOfTotalAr = value; }
    /**
     * Daily sales outstanding.
     *
     * @return The field dso
     */
    public Double getDso() { return this.dso; }
    /**
     * Daily sales outstanding.
     *
     * @param value The new value for dso
     */
    public void setDso(Double value) { this.dso = value; }
    /**
     * The total amount invoiced, due this year.
     *
     * @return The field totalInvoiceAmountCurrentYear
     */
    public Double getTotalInvoiceAmountCurrentYear() { return this.totalInvoiceAmountCurrentYear; }
    /**
     * The total amount invoiced, due this year.
     *
     * @param value The new value for totalInvoiceAmountCurrentYear
     */
    public void setTotalInvoiceAmountCurrentYear(Double value) { this.totalInvoiceAmountCurrentYear = value; }
    /**
     * The total amount invoiced, due last year.
     *
     * @return The field totalInvoiceAmountPreviousYear
     */
    public Double getTotalInvoiceAmountPreviousYear() { return this.totalInvoiceAmountPreviousYear; }
    /**
     * The total amount invoiced, due last year.
     *
     * @param value The new value for totalInvoiceAmountPreviousYear
     */
    public void setTotalInvoiceAmountPreviousYear(Double value) { this.totalInvoiceAmountPreviousYear = value; }
    /**
     * The total of all payments received this year.
     *
     * @return The field totalPaymentAmountCurrentYear
     */
    public Double getTotalPaymentAmountCurrentYear() { return this.totalPaymentAmountCurrentYear; }
    /**
     * The total of all payments received this year.
     *
     * @param value The new value for totalPaymentAmountCurrentYear
     */
    public void setTotalPaymentAmountCurrentYear(Double value) { this.totalPaymentAmountCurrentYear = value; }
    /**
     * The total amount of payments received in the last 30 days
     *
     * @return The field totalCollectedPastThirtyDays
     */
    public Integer getTotalCollectedPastThirtyDays() { return this.totalCollectedPastThirtyDays; }
    /**
     * The total amount of payments received in the last 30 days
     *
     * @param value The new value for totalCollectedPastThirtyDays
     */
    public void setTotalCollectedPastThirtyDays(Integer value) { this.totalCollectedPastThirtyDays = value; }
    /**
     * The total amount of Invoices paid in the last 30 days
     *
     * @return The field totalInvoicesPaidPastThirtyDays
     */
    public Integer getTotalInvoicesPaidPastThirtyDays() { return this.totalInvoicesPaidPastThirtyDays; }
    /**
     * The total amount of Invoices paid in the last 30 days
     *
     * @param value The new value for totalInvoicesPaidPastThirtyDays
     */
    public void setTotalInvoicesPaidPastThirtyDays(Integer value) { this.totalInvoicesPaidPastThirtyDays = value; }
    /**
     * Portion of Total AR that is 90+ days Past due.
     *
     * @return The field percentageOfTotalAr90DaysPastDue
     */
    public Double getPercentageOfTotalAr90DaysPastDue() { return this.percentageOfTotalAr90DaysPastDue; }
    /**
     * Portion of Total AR that is 90+ days Past due.
     *
     * @param value The new value for percentageOfTotalAr90DaysPastDue
     */
    public void setPercentageOfTotalAr90DaysPastDue(Double value) { this.percentageOfTotalAr90DaysPastDue = value; }
};
