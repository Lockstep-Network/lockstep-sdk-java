
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;
import io.lockstep.api.models.InvoiceHistoryModel;


/**
 * Contains all methods related to InvoiceHistory
 */
public class InvoiceHistoryClient
{
    private LockstepApi client;

    /**
     * Constructor for the InvoiceHistory API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public InvoiceHistoryClient(LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the history of the Invoice specified by this unique identifier.
     *
     * An Invoice represents a bill sent from one company to another.  The Lockstep Platform tracks changes to each Invoice so that you can observe the changes over time.  You can view the InvoiceHistory list to monitor and observe the changes of this Invoice and track the dates when changes occurred.
     *
     * @param id The unique Lockstep Platform ID number of this invoice; NOT the customer's ERP key
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<InvoiceHistoryModel>> retrieveInvoiceHistory(String id)
    {
        RestRequest<FetchResult<InvoiceHistoryModel>> r = new RestRequest<FetchResult<InvoiceHistoryModel>>(this.client, "GET", "/api/v1/InvoiceHistory/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(new TypeToken<FetchResult<InvoiceHistoryModel>>() {}.getType());
    }

    /**
     * Queries Invoice History for this account using the specified filtering, sorting, and pagination rules requested.
     *
     * An Invoice represents a bill sent from one company to another.  The Lockstep Platform tracks changes to each Invoice so that you can observe the changes over time.  You can view the InvoiceHistory list to monitor and observe the changes of this Invoice and track the dates when changes occurred.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available for querying but may be available in the future.
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<InvoiceHistoryModel>> queryInvoiceHistory(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<InvoiceHistoryModel>> r = new RestRequest<FetchResult<InvoiceHistoryModel>>(this.client, "GET", "/api/v1/InvoiceHistory/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<InvoiceHistoryModel>>() {}.getType());
    }
}
