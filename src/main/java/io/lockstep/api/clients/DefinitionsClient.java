
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
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;
import io.lockstep.api.models.CountryModel;

import io.lockstep.api.models.CurrencyModel;
import io.lockstep.api.models.StateModel;
import io.lockstep.api.models.ErpModel;

/**
 * Contains all methods related to Definitions
 */
public class DefinitionsClient
{
    private LockstepApi client;

    /**
     * Constructor for the Definitions API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public DefinitionsClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Queries the ISO3166 List of Countries using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * Your program may want to show a list of countries. The ISO maintains a list of countries called [ISO3166](https://www.iso.org/iso-3166-country-codes.html). For convenience, this list is available in the API.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available, but may be offered in the future.
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<CountryModel>> queryCountries(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<CountryModel>> r = new RestRequest<FetchResult<CountryModel>>(this.client, "GET", "/api/v1/Definitions/countries");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<CountryModel>>() {}.getType());
    }

    /**
     * Queries Currencies on the Lockstep Platform using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * Your app may wish to make use of a reference list that contains names and attributes for all ISO-4217 defined currency codes.  This information is provided via a query endpoint so that you can use this API to provide a user selection screen.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available, but may be offered in the future.
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<CurrencyModel>> queryCurrencies(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<CurrencyModel>> r = new RestRequest<FetchResult<CurrencyModel>>(this.client, "GET", "/api/v1/Definitions/currencies");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<CurrencyModel>>() {}.getType());
    }

    /**
     * Queries the list of States in the United States using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * Your app may wish to make use of a reference list that contains names and codes for all states in the United States.  This information is provided for the United States since many financial systems require mailing addresses that use codes for states.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available, but may be offered in the future.
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<StateModel>> queryStates(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<StateModel>> r = new RestRequest<FetchResult<StateModel>>(this.client, "GET", "/api/v1/Definitions/states");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<StateModel>>() {}.getType());
    }

    /**
     * Queries a list of financial systems using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * Lockstep provides a list of financial systems that may be useful as a selection screen that allows customers to select from a list.  You can query these items by name or attributes and use this data source to help users complete a selection.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available, but may be offered in the future.
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<ErpModel>> queryFinancialSystems(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<ErpModel>> r = new RestRequest<FetchResult<ErpModel>>(this.client, "GET", "/api/v1/Definitions/financialsystems");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<ErpModel>>() {}.getType());
    }
}
