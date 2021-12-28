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

package io.lockstep.api;



public class ReportsClient
{
    private LockstepApi client;

    public ReportsClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves a current Cash Flow report for this account.
     * 
     * The Cash Flow report indicates the amount of payments retrieved and invoices billed within a given timeframe.  You can use this report to determine the overall balance of money coming into and out of your accounts receivable and accounts payable businesses.
     * 
     * @param timeframe - Number of days of data to include for the Cash Flow Report (default is 30 days from today)
     */
    public LockstepResponse<CashflowReportModel> CashFlow(Integer timeframe)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/Reports/cashflow");
        r.AddQuery("timeframe", timeframe);
        return this.client.Request<CashflowReportModel>(r);
    }

    /**
     * Retrieves a current Daily Sales Outstanding (DSO) report for this account.
     * 
     * Daily Sales Outstanding, or DSO, is a metric that indicates the average number of days that it takes for an invoice to be fully paid.  You can use this report to identify whether a company is improving on its ability to collect on invoices.
     * 
     */
    public LockstepResponse<DailySalesOutstandingReportModel[]> DailySalesOutstanding()
    {
        RestRequest r = new RestRequest("GET", "/api/v1/Reports/dailysalesoutstanding");
        return this.client.Request<DailySalesOutstandingReportModel[]>(r);
    }

    /**
     * Retrieves a current Risk Rate report for this account.
     * 
     * Risk Rate is a metric that indicates the percentage of total AR balance left unpaid after 90 days.  You can use this report to identify the percentage of invoice value that is not being collected in a timely manner.
     * 
     */
    public LockstepResponse<RiskRateModel[]> RiskRates()
    {
        RestRequest r = new RestRequest("GET", "/api/v1/Reports/riskrates");
        return this.client.Request<RiskRateModel[]>(r);
    }

    /**
     * Retrieves AR header information up to the date specified.
     * 
     * @param reportDate - The date of the report.
     * @param companyId - Include a company to get AR data for a specific company, leave as null to include all Companies.
     */
    public LockstepResponse<ArHeaderInfoModel> AccountsReceivableHeader(Date reportDate, String companyId)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/Reports/ar-header");
        r.AddQuery("reportDate", reportDate);
        r.AddQuery("companyId", companyId);
        return this.client.Request<ArHeaderInfoModel>(r);
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
     * @param CompanyId - Company aging buckets are filtered by (all company aging returned if not company specified)
     * @param Recalculate - Force api to recalculate aging data, cached data may be returned when set to false
     * @param CurrencyCode - Currency aging buckets are converted to (all aging data returned without currency conversion if no currency is specified)
     * @param CurrencyProvider - Currency provider currency rates should be returned from to convert aging amounts to (default Lockstep currency provider used if no data provider specified)
     * @param Buckets - Customized buckets used for aging calculations (default buckets [0,30,60,90,120,180] will be used if buckets not specified)
     */
    public LockstepResponse<AgingModel[]> Invoiceagingreport(String CompanyId, boolean Recalculate, String CurrencyCode, String CurrencyProvider, Integer[] Buckets)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/Reports/aging");
        r.AddQuery("CompanyId", CompanyId);
        r.AddQuery("Recalculate", Recalculate);
        r.AddQuery("CurrencyCode", CurrencyCode);
        r.AddQuery("CurrencyProvider", CurrencyProvider);
        r.AddQuery("Buckets", Buckets);
        return this.client.Request<AgingModel[]>(r);
    }

    /**
     * Retrieves AR Aging Header information report broken down by aging bucket.
     * 
     * The AR Aging Header report contains aggregated information about the `TotalInvoicesPastDue`, `TotalCustomers`, and their respective `PercentageOfTotalAr` grouped by their aging `ReportBucket`.
     * 
     */
    public LockstepResponse<ArAgingHeaderInfoModel[]> AccountsReceivableAgingHeader()
    {
        RestRequest r = new RestRequest("GET", "/api/v1/Reports/ar-aging-header");
        return this.client.Request<ArAgingHeaderInfoModel[]>(r);
    }
}
