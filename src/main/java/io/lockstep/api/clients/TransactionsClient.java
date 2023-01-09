
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
import io.lockstep.api.models.TransactionModelTransactionSummaryTotalModelSummaryFetchResult;

import io.lockstep.api.models.TransactionDetailModel;

/**
 * Contains all methods related to Transactions
 */
public class TransactionsClient
{
    private LockstepApi client;

    /**
     * Constructor for the Transactions API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public TransactionsClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Queries transactions (invoices/credit memos/payments) for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order The sort order for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param currentDate The date the days past due value will be calculated against. If no currentDate is provided the current UTC date will be used.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<TransactionModelTransactionSummaryTotalModelSummaryFetchResult> queryTransactions(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber, @Nullable String currentDate)
    {
        RestRequest<TransactionModelTransactionSummaryTotalModelSummaryFetchResult> r = new RestRequest<TransactionModelTransactionSummaryTotalModelSummaryFetchResult>(this.client, "GET", "/api/v1/Transactions/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        r.AddQuery("currentDate", currentDate.toString());
        return r.Call(TransactionModelTransactionSummaryTotalModelSummaryFetchResult.class);
    }

    /**
     * Retrieves a list of transaction details for the supplied transaction id.
     *
     * A Transaction Detail contains information about the associated Transaction. This information can be an invoice associated to a payment or credit memo or a payment or credit memo used as payment for one or more invoices.
     *
     * @param id Documentation pending
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<TransactionDetailModel[]> retrieveTransactionDetails(@NotNull String id)
    {
        RestRequest<TransactionDetailModel[]> r = new RestRequest<TransactionDetailModel[]>(this.client, "GET", "/api/v1/Transactions/{id}/details");
        r.AddPath("{id}", id.toString());
        return r.Call(TransactionDetailModel[].class);
    }
}
