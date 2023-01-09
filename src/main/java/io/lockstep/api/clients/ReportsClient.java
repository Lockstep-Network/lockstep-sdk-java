
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2023 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2023 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.LockstepResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import io.lockstep.api.models.CashflowReportModel;

import io.lockstep.api.models.PayablesSummaryReportModel;
import io.lockstep.api.models.DailySalesOutstandingReportModel;
import io.lockstep.api.models.DailyPayableOutstandingReportModel;
import io.lockstep.api.models.PayablesComingDueWidgetModel;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;
import io.lockstep.api.models.PayablesComingDueModel;
import io.lockstep.api.models.PayablesComingDueHeaderModel;
import io.lockstep.api.models.RiskRateModel;
import io.lockstep.api.models.ArHeaderInfoModel;
import io.lockstep.api.models.ApHeaderInfoModel;
import io.lockstep.api.models.AgingModel;
import io.lockstep.api.models.ArAgingHeaderInfoModel;
import io.lockstep.api.models.ApAgingHeaderInfoModel;
import io.lockstep.api.models.AttachmentHeaderInfoModel;
import io.lockstep.api.models.FinancialReportModel;
import io.lockstep.api.models.DpoSummaryModel;
import io.lockstep.api.models.DpoSummaryGroupTotalModel;

/**
 * Contains all methods related to Reports
 */
public class ReportsClient
{
    private LockstepApi client;

    /**
     * Constructor for the Reports API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public ReportsClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves a current Cash Flow report for this account.
     *
     * The Cash Flow report indicates the amount of payments retrieved and invoices billed within a given timeframe.  You can use this report to determine the overall balance of money coming into and out of your accounts receivable and accounts payable businesses.
     *
     * @param timeframe Number of days of data to include for the Cash Flow Report (default is 30 days from today)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<CashflowReportModel> cashFlow(@Nullable Integer timeframe)
    {
        RestRequest<CashflowReportModel> r = new RestRequest<CashflowReportModel>(this.client, "GET", "/api/v1/Reports/cashflow");
        r.AddQuery("timeframe", timeframe.toString());
        return r.Call(CashflowReportModel.class);
    }

    /**
     * Retrieves a current Payables Summary report for this account.
     *
     * The Payables Summary report indicates the amount of payments sent and bills received within a given timeframe.  You can use this report to determine the overall balance of money coming into and out of your accounts receivable and accounts payable businesses.
     *
     * @param timeframe Number of days of data to include for the Payables Summary Report (default is 30 days from today)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<PayablesSummaryReportModel> payablesSummaryReport(@Nullable Integer timeframe)
    {
        RestRequest<PayablesSummaryReportModel> r = new RestRequest<PayablesSummaryReportModel>(this.client, "GET", "/api/v1/Reports/payables-summary");
        r.AddQuery("timeframe", timeframe.toString());
        return r.Call(PayablesSummaryReportModel.class);
    }

    /**
     * Retrieves a current Daily Sales Outstanding (DSO) report for this account.
     *
     * Daily Sales Outstanding, or DSO, is a metric that indicates the average number of days that it takes for an invoice to be fully paid.  You can use this report to identify whether a company is improving on its ability to collect on invoices.
     *
     * @param reportDate Optional: Specify the specific report date to generate the from (default UTC now)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<DailySalesOutstandingReportModel[]> dailySalesOutstanding(@Nullable String reportDate)
    {
        RestRequest<DailySalesOutstandingReportModel[]> r = new RestRequest<DailySalesOutstandingReportModel[]>(this.client, "GET", "/api/v1/Reports/daily-sales-outstanding");
        r.AddQuery("reportDate", reportDate.toString());
        return r.Call(DailySalesOutstandingReportModel[].class);
    }

    /**
     * Retrieves a current Days Payable Outstanding (DPO) report for this account.
     *
     * Days payable outstanding (DPO) is a financial ratio that indicates the average time (in days) that a company takes to pay its bills to its trade creditors, which may include suppliers, vendors, or financiers.
     *
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<DailyPayableOutstandingReportModel[]> daysPayableOutstanding()
    {
        RestRequest<DailyPayableOutstandingReportModel[]> r = new RestRequest<DailyPayableOutstandingReportModel[]>(this.client, "GET", "/api/v1/Reports/daily-payable-outstanding");
        return r.Call(DailyPayableOutstandingReportModel[].class);
    }

    /**
     * Retrieves payable amount due for 4 time buckets (Today, 7 Days from Today, 14 Days from Today, and 30 Days from Today).
     *
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<PayablesComingDueWidgetModel[]> payablesComingDue()
    {
        RestRequest<PayablesComingDueWidgetModel[]> r = new RestRequest<PayablesComingDueWidgetModel[]>(this.client, "GET", "/api/v1/Reports/payables-coming-due");
        return r.Call(PayablesComingDueWidgetModel[].class);
    }

    /**
     * Payables coming due represents the amount of cash required to pay vendor bills based on the due dates of the bills. Each bucket represents total amount due within the time period based on open Payables as of today.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize The page size for results (default 250, maximum of 500)
     * @param pageNumber The page number for results (default 0)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<PayablesComingDueModel>> payablesComingDueSummary(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<PayablesComingDueModel>> r = new RestRequest<FetchResult<PayablesComingDueModel>>(this.client, "GET", "/api/v1/Reports/payables-coming-due-summary");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<PayablesComingDueModel>>() {}.getType());
    }

    /**
     * Retrieves total number of vendors, bills, the total amount outstanding, for a group.
     *
     * @param reportDate The date the outstanding values are calculated on. Should be either the current day, 7 days after the current day, 14 days after the current day, or 30 days after the current day.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<PayablesComingDueHeaderModel[]> payablesComingDueHeader(@NotNull String reportDate)
    {
        RestRequest<PayablesComingDueHeaderModel[]> r = new RestRequest<PayablesComingDueHeaderModel[]>(this.client, "GET", "/api/v1/Reports/payables-coming-due-header");
        r.AddQuery("reportDate", reportDate.toString());
        return r.Call(PayablesComingDueHeaderModel[].class);
    }

    /**
     * Retrieves a current Risk Rate report for this account.
     *
     * Risk Rate is a metric that indicates the percentage of total AR balance left unpaid after 90 days.  You can use this report to identify the percentage of invoice value that is not being collected in a timely manner.
     *
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<RiskRateModel[]> riskRates()
    {
        RestRequest<RiskRateModel[]> r = new RestRequest<RiskRateModel[]>(this.client, "GET", "/api/v1/Reports/risk-rates");
        return r.Call(RiskRateModel[].class);
    }

    /**
     * Retrieves AR header information up to the date specified.
     *
     * @param reportDate The date of the report.
     * @param companyId Include a company to get AR data for a specific company, leave as null to include all Companies.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ArHeaderInfoModel> accountsReceivableHeader(@NotNull String reportDate, @Nullable String companyId)
    {
        RestRequest<ArHeaderInfoModel> r = new RestRequest<ArHeaderInfoModel>(this.client, "GET", "/api/v1/Reports/ar-header");
        r.AddQuery("reportDate", reportDate.toString());
        r.AddQuery("companyId", companyId.toString());
        return r.Call(ArHeaderInfoModel.class);
    }

    /**
     * Retrieves AP header information up to the date specified.
     *
     * @param reportDate The date of the report.
     * @param companyId Include a company to get AP data for a specific company, leave as null to include all Companies.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ApHeaderInfoModel> accountsPayableHeader(@NotNull String reportDate, @Nullable String companyId)
    {
        RestRequest<ApHeaderInfoModel> r = new RestRequest<ApHeaderInfoModel>(this.client, "GET", "/api/v1/Reports/ap-header");
        r.AddQuery("reportDate", reportDate.toString());
        r.AddQuery("companyId", companyId.toString());
        return r.Call(ApHeaderInfoModel.class);
    }

    /**
     * The Aging Report contains information about the total dollar value of invoices broken down by their age. Last default or specified bucket treated as a catch all bucket for values that fit in that bucket or beyond.
     *
     * You can specify viewing parameters for the aging report such as currency code and date bucket configuration. You can also view aging data for an entire account or a specific company.
     *
     * This information is recalculated when invoice data changes.  After each invoice data change occurs, Lockstep queues up a calculation based on the current invoice data at that time.  This information is calculated and persisted for each customer so that the report will be available quickly.
     *
     * To force a recalculation of aging data, specify the `recalculate` option.  Note that forcing a recalculation will slow your API response time.
     *
     * @param CompanyId Company aging buckets are filtered by (all company aging returned if not company specified)
     * @param Recalculate Force api to recalculate aging data, cached data may be returned when set to false
     * @param CurrencyCode Currency aging buckets are converted to (all aging data returned without currency conversion if no currency is specified)
     * @param CurrencyProvider Currency provider currency rates should be returned from to convert aging amounts to (default Lockstep currency provider used if no data provider specified)
     * @param Buckets Customized buckets used for aging calculations (default buckets [0,30,60,90,120,180] will be used if buckets not specified)
     * @param ApReport A boolean to turn on AP Aging reports
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<AgingModel[]> invoiceagingreport(@Nullable String CompanyId, @Nullable Boolean Recalculate, @Nullable String CurrencyCode, @Nullable String CurrencyProvider, @Nullable Integer[] Buckets, @Nullable Boolean ApReport)
    {
        RestRequest<AgingModel[]> r = new RestRequest<AgingModel[]>(this.client, "GET", "/api/v1/Reports/aging");
        r.AddQuery("CompanyId", CompanyId.toString());
        r.AddQuery("Recalculate", Recalculate.toString());
        r.AddQuery("CurrencyCode", CurrencyCode.toString());
        r.AddQuery("CurrencyProvider", CurrencyProvider.toString());
        r.AddQuery("Buckets", Buckets.toString());
        r.AddQuery("ApReport", ApReport.toString());
        return r.Call(AgingModel[].class);
    }

    /**
     * Retrieves AR Aging Header information report broken down by aging bucket.
     *
     * The AR Aging Header report contains aggregated information about the `TotalInvoicesPastDue`, `TotalCustomers`, and their respective `PercentageOfTotalAr` grouped by their aging `ReportBucket`.
     *
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ArAgingHeaderInfoModel[]> accountsReceivableAgingHeader()
    {
        RestRequest<ArAgingHeaderInfoModel[]> r = new RestRequest<ArAgingHeaderInfoModel[]>(this.client, "GET", "/api/v1/Reports/ar-aging-header");
        return r.Call(ArAgingHeaderInfoModel[].class);
    }

    /**
     * Retrieves AP Aging Header information report broken down by aging bucket.
     *
     * The AP Aging Header report contains aggregated information about the `TotalBillsPastDue`, `TotalVendors`, and their respective `PercentageOfTotalAp` grouped by their aging `ReportBucket`.
     *
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ApAgingHeaderInfoModel[]> accountsPayableAgingHeader()
    {
        RestRequest<ApAgingHeaderInfoModel[]> r = new RestRequest<ApAgingHeaderInfoModel[]>(this.client, "GET", "/api/v1/Reports/ap-aging-header");
        return r.Call(ApAgingHeaderInfoModel[].class);
    }

    /**
     * Retrieves Attachment Header information for the requested companyId.
     *
     * The Attachment Header report contains aggregated information about the `TotalAttachments`, `TotalArchived`, and `TotalActive` attachment classifications.
     *
     * @param companyId Include a specific company to get Attachment data for, leave as null to include all Companies.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<AttachmentHeaderInfoModel> attachmentsHeaderInformation(@Nullable String companyId)
    {
        RestRequest<AttachmentHeaderInfoModel> r = new RestRequest<AttachmentHeaderInfoModel>(this.client, "GET", "/api/v1/Reports/attachments-header");
        r.AddQuery("companyId", companyId.toString());
        return r.Call(AttachmentHeaderInfoModel.class);
    }

    /**
     * Generates a Trial Balance Report for the given time range.
     *
     * @param startDate The start date of the report
     * @param endDate The end date of the report
     * @param appEnrollmentId The app enrollment id of the app enrollment whose data will be used.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FinancialReportModel> trialBalanceReport(@Nullable String startDate, @Nullable String endDate, @Nullable String appEnrollmentId)
    {
        RestRequest<FinancialReportModel> r = new RestRequest<FinancialReportModel>(this.client, "GET", "/api/v1/Reports/trial-balance");
        r.AddQuery("startDate", startDate.toString());
        r.AddQuery("endDate", endDate.toString());
        r.AddQuery("appEnrollmentId", appEnrollmentId.toString());
        return r.Call(FinancialReportModel.class);
    }

    /**
     * Generates an Income Statement for the given time range.
     *
     * @param startDate The start date of the report
     * @param endDate The end date of the report
     * @param appEnrollmentId The app enrollment id of the app enrollment whose data will be used.
     * @param columnOption The desired column splitting of the report data. An empty string or anything unrecognized will result in only totals being displayed. Options are as follows: By Period - a column for every month/fiscal period within the reporting dates Quarterly - a column for every quarter within the reporting dates Annually - a column for every year within the reporting dates
     * @param displayDepth The desired row splitting of the report data. For Income Statements, the minimum report depth is 1. Options are as follows: 1 - combine all accounts by their category 2 - combine all accounts by their subcategory 3 - display all accounts
     * @param comparisonPeriod Add a column for historical data with the following options and use showCurrencyDifference and/or show percentageDifference to display a comparison of that historical data to the report period. Options are as follows (note for YTD the data will be compared as a percentage of YTD and showCurrencyDifference and showPercentageDifference should not be used): "PP" - previous period (will show the previous quarter or year if Quarterly or Annually is chosen for columnOption) "PY" - previous year (the same date range as the report, but for the year prior) "YTD" - year to date (the current financial year to the current period)
     * @param showCurrencyDifference A boolean to turn on a currency based difference between the reporting period and the comparison period.
     * @param showPercentageDifference A boolean to turn on a percent based difference between the reporting period and the comparison period.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FinancialReportModel> incomeStatementReport(@Nullable String startDate, @Nullable String endDate, @Nullable String appEnrollmentId, @Nullable String columnOption, @Nullable Integer displayDepth, @Nullable String comparisonPeriod, @Nullable Boolean showCurrencyDifference, @Nullable Boolean showPercentageDifference)
    {
        RestRequest<FinancialReportModel> r = new RestRequest<FinancialReportModel>(this.client, "GET", "/api/v1/Reports/income-statement");
        r.AddQuery("startDate", startDate.toString());
        r.AddQuery("endDate", endDate.toString());
        r.AddQuery("appEnrollmentId", appEnrollmentId.toString());
        r.AddQuery("columnOption", columnOption.toString());
        r.AddQuery("displayDepth", displayDepth.toString());
        r.AddQuery("comparisonPeriod", comparisonPeriod.toString());
        r.AddQuery("showCurrencyDifference", showCurrencyDifference.toString());
        r.AddQuery("showPercentageDifference", showPercentageDifference.toString());
        return r.Call(FinancialReportModel.class);
    }

    /**
     * Generates a balance sheet for the given time range.
     *
     * @param startDate The start date of the report
     * @param endDate The end date of the report
     * @param appEnrollmentId The app enrollment id of the app enrollment whose data will be used.
     * @param columnOption The desired column splitting of the report data. An empty string or anything unrecognized will result in only totals being displayed. Options are as follows: By Period - a column for every month/fiscal period within the reporting dates Quarterly - a column for every quarter within the reporting dates Annually - a column for every year within the reporting dates
     * @param displayDepth The desired row splitting of the report data. For Balance Sheets, the minimum report depth is 1. Options are as follows: 1 - combine all accounts by their category 2 - combine all accounts by their subcategory 3 - display all accounts
     * @param comparisonPeriod Add a column for historical data with the following options and use showCurrencyDifference and/or show percentageDifference to display a comparison of that historical data to the report period. "PP" - previous period (will show the previous quarter or year if Quarterly or Annually is chosen for columnOption) "PY" - previous year (the same date range as the report, but for the year prior)
     * @param showCurrencyDifference A boolean to turn on a currency based difference between the reporting period and the comparison period.
     * @param showPercentageDifference A boolean to turn on a percent based difference between the reporting period and the comparison period.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FinancialReportModel> balanceSheetReport(@Nullable String startDate, @Nullable String endDate, @Nullable String appEnrollmentId, @Nullable String columnOption, @Nullable Integer displayDepth, @Nullable String comparisonPeriod, @Nullable Boolean showCurrencyDifference, @Nullable Boolean showPercentageDifference)
    {
        RestRequest<FinancialReportModel> r = new RestRequest<FinancialReportModel>(this.client, "GET", "/api/v1/Reports/balance-sheet");
        r.AddQuery("startDate", startDate.toString());
        r.AddQuery("endDate", endDate.toString());
        r.AddQuery("appEnrollmentId", appEnrollmentId.toString());
        r.AddQuery("columnOption", columnOption.toString());
        r.AddQuery("displayDepth", displayDepth.toString());
        r.AddQuery("comparisonPeriod", comparisonPeriod.toString());
        r.AddQuery("showCurrencyDifference", showCurrencyDifference.toString());
        r.AddQuery("showPercentageDifference", showPercentageDifference.toString());
        return r.Call(FinancialReportModel.class);
    }

    /**
     * Generates a cash flow statement for the given time range.
     *
     * @param startDate The start date of the report
     * @param endDate The end date of the report
     * @param appEnrollmentId The app enrollment id of the app enrollment whose data will be used.
     * @param columnOption The desired column splitting of the report data. An empty string or anything unrecognized will result in only totals being displayed. Options are as follows: By Period - a column for every month/fiscal period within the reporting dates Quarterly - a column for every quarter within the reporting dates Annually - a column for every year within the reporting dates
     * @param displayDepth The desired row splitting of the report data. Options are as follows: 0 - combine all accounts by their classification 1 - combine all accounts by their category 2 - combine all accounts by their subcategory 3 - display all accounts
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FinancialReportModel> cashFlowStatementReport(@Nullable String startDate, @Nullable String endDate, @Nullable String appEnrollmentId, @Nullable String columnOption, @Nullable Integer displayDepth)
    {
        RestRequest<FinancialReportModel> r = new RestRequest<FinancialReportModel>(this.client, "GET", "/api/v1/Reports/cash-flow-statement");
        r.AddQuery("startDate", startDate.toString());
        r.AddQuery("endDate", endDate.toString());
        r.AddQuery("appEnrollmentId", appEnrollmentId.toString());
        r.AddQuery("columnOption", columnOption.toString());
        r.AddQuery("displayDepth", displayDepth.toString());
        return r.Call(FinancialReportModel.class);
    }

    /**
     * Retrieves a summary for each vendor that includes a count of their outstanding bills, the total amount outstanding, and their daily payable outstanding value.
     *
     * Days payable outstanding (DPO) is a financial ratio that indicates the average time (in days) that a company takes to pay its bills to its trade creditors, which may include suppliers, vendors, or financiers.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * @param reportDate The date the outstanding values are calculated on. Should be either the current day or the end of a previous quarter.
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize The page size for results (default 250, maximum of 500)
     * @param pageNumber The page number for results (default 0)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<DpoSummaryModel>> daysPayableOutstandingSummary(@NotNull String reportDate, @Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<DpoSummaryModel>> r = new RestRequest<FetchResult<DpoSummaryModel>>(this.client, "GET", "/api/v1/Reports/daily-payable-outstanding-summary");
        r.AddQuery("reportDate", reportDate.toString());
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<DpoSummaryModel>>() {}.getType());
    }

    /**
     * Retrieves total number of vendors, bills, the total amount outstanding, and the daily payable outstanding value for a group.
     *
     * Days payable outstanding (DPO) is a financial ratio that indicates the average time (in days) that a company takes to pay its bills to its trade creditors, which may include suppliers, vendors, or financiers.
     *
     * @param reportDate The date the outstanding values are calculated on. Should be either the current day or the end of a previous quarter.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<DpoSummaryGroupTotalModel> daysPayableOutstandingSummaryTotal(@NotNull String reportDate)
    {
        RestRequest<DpoSummaryGroupTotalModel> r = new RestRequest<DpoSummaryGroupTotalModel>(this.client, "GET", "/api/v1/Reports/daily-payable-outstanding-summary-total");
        r.AddQuery("reportDate", reportDate.toString());
        return r.Call(DpoSummaryGroupTotalModel.class);
    }
}
