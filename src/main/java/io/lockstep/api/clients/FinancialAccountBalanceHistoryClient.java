
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import io.lockstep.api.models.FinancialAccountBalanceHistoryModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to FinancialAccountBalanceHistory
 */
public class FinancialAccountBalanceHistoryClient
{
    private LockstepApi client;

    /**
     * Constructor for the FinancialAccountBalanceHistory API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public FinancialAccountBalanceHistoryClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Financial Account Balance History specified by this unique identifier.
     *
     * A Financial Account Balance History records either the current or end of period balance for a corresponding financial account.
     *
     * @param id The unique Lockstep Platform ID number of this Financial Account Balance History
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FinancialAccountBalanceHistoryModel> retrieveBalanceHistory(@NotNull String id)
    {
        RestRequest<FinancialAccountBalanceHistoryModel> r = new RestRequest<FinancialAccountBalanceHistoryModel>(this.client, "GET", "/api/v1/FinancialAccountBalanceHistory/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(FinancialAccountBalanceHistoryModel.class);
    }

    /**
     * Updates a Financial Account Balance History that matches the specified id with the requested information.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * A Financial Account Balance History records either the current or end of period balance for a corresponding financial account.
     *
     * @param id The unique Lockstep Platform ID number of the Financial Account Balance History to update
     * @param body A list of changes to apply to this Financial Account Balance History
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FinancialAccountBalanceHistoryModel> updateBalanceHistory(@NotNull String id, @NotNull Object body)
    {
        RestRequest<FinancialAccountBalanceHistoryModel> r = new RestRequest<FinancialAccountBalanceHistoryModel>(this.client, "PATCH", "/api/v1/FinancialAccountBalanceHistory/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(FinancialAccountBalanceHistoryModel.class);
    }

    /**
     * Delete the Financial Account Balance History referred to by this unique identifier.
     *
     * A Financial Account Balance History records either the current or end of period balance for a corresponding financial account.
     *
     * @param id The unique Lockstep Platform ID number of the Financial Account Balance History to disable
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> deleteBalanceHistory(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/FinancialAccountBalanceHistory/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates a Financial Account Balance History from a given model.
     *
     * A Financial Account Balance History records either the current or end of period balance for a corresponding financial account.
     *
     * @param body The Financial Account Balance Histories to create
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FinancialAccountBalanceHistoryModel[]> createBalanceHistory(@NotNull FinancialAccountBalanceHistoryModel[] body)
    {
        RestRequest<FinancialAccountBalanceHistoryModel[]> r = new RestRequest<FinancialAccountBalanceHistoryModel[]>(this.client, "POST", "/api/v1/FinancialAccountBalanceHistory");
        r.AddBody(body);
        return r.Call(FinancialAccountBalanceHistoryModel[].class);
    }

    /**
     * Queries Financial Account Balance History for this account using the specified filtering, sorting, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * A Financial Account Balance History records either the current or end of period balance for a corresponding financial account.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<FinancialAccountBalanceHistoryModel>> queryBalanceHistory(@Nullable String filter, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<FinancialAccountBalanceHistoryModel>> r = new RestRequest<FetchResult<FinancialAccountBalanceHistoryModel>>(this.client, "GET", "/api/v1/FinancialAccountBalanceHistory/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<FinancialAccountBalanceHistoryModel>>() {}.getType());
    }
}
