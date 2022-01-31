
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
 * @version    2022.4
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import io.lockstep.api.models.ApiKeyModel;

import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to ApiKeys
 */
public class ApiKeysClient
{
    private LockstepApi client;

    /**
     * Constructor for the ApiKeys API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public ApiKeysClient(LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the API Key with this identifier.
     *
     * An API Key is an authentication token that you may use with the Lockstep API.  Because API Keys do not have an expiration date, they are well suited for unattended processes.  Each API Key is associated with a user, and may be revoked to prevent it from accessing the Lockstep API. When you create an API Key, make sure to save the value in a secure location.  Lockstep cannot retrieve an API Key once it is created.  For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     *
     * @param id The unique ID number of the API Key to retrieve
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future.
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<ApiKeyModel> retrieveAPIKey(String id, String include)
    {
        RestRequest<ApiKeyModel> r = new RestRequest<ApiKeyModel>(this.client, "GET", "/api/v1/ApiKeys/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(ApiKeyModel.class);
    }

    /**
     * Immediately revokes the API Key with the specified id so it cannot be used to call the API.  The Lockstep Platform guarantees that revocation will be received by all servers within five minutes of revocation.  API calls made using this API key after the revocation will fail.  A revoked API Key  cannot be un-revoked and may be removed 60 days after revocation.
     *
     * An API Key is an authentication token that you may use with the Lockstep API.  Because API Keys do not have an expiration date, they are well suited for unattended processes.  Each API Key is associated with a user, and may be revoked to prevent it from accessing the Lockstep API. When you create an API Key, make sure to save the value in a secure location.  Lockstep cannot retrieve an API Key once it is created.  For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     *
     * @param id The unique Lockstep Platform ID number of this API Key
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<ApiKeyModel> revokeAPIKey(String id)
    {
        RestRequest<ApiKeyModel> r = new RestRequest<ApiKeyModel>(this.client, "DELETE", "/api/v1/ApiKeys/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ApiKeyModel.class);
    }

    /**
     * Creates an API key with the specified name.
     *
     * An API Key is an authentication token that you may use with the Lockstep API.  Because API Keys do not have an expiration date, they are well suited for unattended processes.  Each API Key is associated with a user, and may be revoked to prevent it from accessing the Lockstep API. When you create an API Key, make sure to save the value in a secure location.  Lockstep cannot retrieve an API Key once it is created.  For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     *
     * @param body Metadata about the API Key to create.
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<ApiKeyModel> createAPIKey(ApiKeyModel body)
    {
        RestRequest<ApiKeyModel> r = new RestRequest<ApiKeyModel>(this.client, "POST", "/api/v1/ApiKeys");
        r.AddBody(body);
        return r.Call(ApiKeyModel.class);
    }

    /**
     * Queries API Keys for this user using the specified filtering, sorting, nested fetch, and pagination rules requested.  An API Key is an authentication token that you may use with the Lockstep API.  Because API Keys do not have an expiration date, they are well suited for unattended processes.  Each API Key is associated with a user, and may be revoked to prevent it from accessing the Lockstep API. When you create an API Key, make sure to save the value in a secure location.  Lockstep cannot retrieve an API Key once it is created.  For more information, see [API Keys](https://developer.lockstep.io/docs/api-keys).
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future.
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<ApiKeyModel>> queryAPIKeys(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<ApiKeyModel>> r = new RestRequest<FetchResult<ApiKeyModel>>(this.client, "GET", "/api/v1/ApiKeys/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<ApiKeyModel>>() {}.getType());
    }
}
