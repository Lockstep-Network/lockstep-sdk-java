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
 * @version    2022.2
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import io.lockstep.api.models.CodeDefinitionModel;

import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;

public class CodeDefinitionsClient
{
    private LockstepApi client;

     /**
      * Constructor for method collection
      *
      * @param client A {@link io.lockstep.api.LockstepApi} platform client
      */
    public CodeDefinitionsClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the CodeDefinition specified by this unique identifier, optionally including nested data sets.
     *
     * A CodeDefinition contains information around system code values and their definitions.
     *
     * @param id - The unique Lockstep Platform ID number of this CodeDefinition
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<CodeDefinitionModel> retrieveCodeDefinition(String id, String include)
    {
        RestRequest<CodeDefinitionModel> r = new RestRequest<CodeDefinitionModel>(this.client, "GET", "/api/v1/CodeDefinitions/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(CodeDefinitionModel.class);
    }

    /**
     * Queries CodeDefinitions for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * A CodeDefinition contains information around system code values and their definitions.
     *
     * @param filter - The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order - The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize - The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber - The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<CodeDefinitionModel>> queryCodeDefinitions(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<CodeDefinitionModel>> r = new RestRequest<FetchResult<CodeDefinitionModel>>(this.client, "GET", "/api/v1/CodeDefinitions/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<CodeDefinitionModel>>() {}.getType());
    }
}
