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



public class InvoiceHistoryClient
{
    private LockstepApi client;

    public InvoiceHistoryClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the history of the Invoice specified by this unique identifier.
     * 
     * An Invoice represents a bill sent from one company to another.  The Lockstep Platform tracks changes to each Invoice so that you can observe the changes over time.  You can view the InvoiceHistory list to monitor and observe the changes of this Invoice and track the dates when changes occurred.
     * 
     * @param id - The unique Lockstep Platform ID number of this invoice; NOT the customer's ERP key
     */
    public LockstepResponse<FetchResult<InvoiceHistoryModel>> RetrieveInvoiceHistory(String id)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/InvoiceHistory/{id}");
        r.AddPath("{id}", id);
        return this.client.Request<FetchResult<InvoiceHistoryModel>>(r);
    }

    /**
     * Queries Invoice History for this account using the specified filtering, sorting, and pagination rules requested.
     * 
     * An Invoice represents a bill sent from one company to another.  The Lockstep Platform tracks changes to each Invoice so that you can observe the changes over time.  You can view the InvoiceHistory list to monitor and observe the changes of this Invoice and track the dates when changes occurred.
     * 
     * @param filter - The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available for querying but may be available in the future.
     * @param order - The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize - The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber - The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     */
    public LockstepResponse<FetchResult<InvoiceHistoryModel>> QueryInvoiceHistory(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/InvoiceHistory/query");
        r.AddQuery("filter", filter);
        r.AddQuery("include", include);
        r.AddQuery("order", order);
        r.AddQuery("pageSize", pageSize);
        r.AddQuery("pageNumber", pageNumber);
        return this.client.Request<FetchResult<InvoiceHistoryModel>>(r);
    }
}
