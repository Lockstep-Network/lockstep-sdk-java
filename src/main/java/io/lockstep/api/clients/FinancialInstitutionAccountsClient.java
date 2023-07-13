
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
import io.lockstep.api.models.FinancialInstitutionAccountModel;

import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to FinancialInstitutionAccounts
 */
public class FinancialInstitutionAccountsClient
{
    private LockstepApi client;

    /**
     * Constructor for the FinancialInstitutionAccounts API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public FinancialInstitutionAccountsClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the financial institution account specified by this unique identifier.
     *
     * @param id The unique Lockstep Platform ID number of this institution account; NOT the customer's ERP key
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FinancialInstitutionAccountModel> retrieveFinancialInstitutionAccounts(@NotNull String id)
    {
        RestRequest<FinancialInstitutionAccountModel> r = new RestRequest<FinancialInstitutionAccountModel>(this.client, "GET", "/api/v1/financial-institution-accounts/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(FinancialInstitutionAccountModel.class);
    }

    /**
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future.
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<FinancialInstitutionAccountModel>> queryFinancialInstitutionAccounts(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<FinancialInstitutionAccountModel>> r = new RestRequest<FetchResult<FinancialInstitutionAccountModel>>(this.client, "GET", "/api/v1/financial-institution-accounts/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<FinancialInstitutionAccountModel>>() {}.getType());
    }
}
