
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
import io.lockstep.api.models.FinancialAccountModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to FinancialAccount
 */
public class FinancialAccountClient
{
    private LockstepApi client;

    /**
     * Constructor for the FinancialAccount API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public FinancialAccountClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Creates a financial account with the specified name.
     *
     * @param body Metadata about the financial account to create.
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FinancialAccountModel> createFinancialAccount(@NotNull FinancialAccountModel[] body)
    {
        RestRequest<FinancialAccountModel> r = new RestRequest<FinancialAccountModel>(this.client, "POST", "/api/v1/FinancialAccount");
        r.AddBody(body);
        return r.Call(FinancialAccountModel.class);
    }

    /**
     * Retrieves the financial account specified by this unique identifier.
     *
     * @param id The unique Lockstep Platform ID number of this Account; NOT the customer's ERP key
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FinancialAccountModel> retrieveFinancialAccount(@NotNull String id)
    {
        RestRequest<FinancialAccountModel> r = new RestRequest<FinancialAccountModel>(this.client, "GET", "/api/v1/FinancialAccount/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(FinancialAccountModel.class);
    }

    /**
     *
     * @param id The unique Lockstep Platform ID number of the Account to update; NOT the customer's ERP key
     * @param body A list of changes to apply to this Account
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FinancialAccountModel> updateFinancialAccount(@NotNull String id, @NotNull Object body)
    {
        RestRequest<FinancialAccountModel> r = new RestRequest<FinancialAccountModel>(this.client, "PATCH", "/api/v1/FinancialAccount/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(FinancialAccountModel.class);
    }

    /**
     * Deletes the Financial Account referred to by this unique identifier.
     *
     * @param id The unique Lockstep Platform ID number of the Financial Account to disable; NOT the customer's ERP key
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> deleteFinancialAccount(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/FinancialAccount/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve.
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<FinancialAccountModel>> queryFinancialAccounts(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<FinancialAccountModel>> r = new RestRequest<FetchResult<FinancialAccountModel>>(this.client, "GET", "/api/v1/FinancialAccount/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<FinancialAccountModel>>() {}.getType());
    }
}
