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


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import io.lockstep.api.models.UserRoleModel;

import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;

public class UserRolesClient
{
    private LockstepApi client;

    public UserRolesClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the User Role with this identifier.
     * 
     * @param id - The unique ID number of the User Role to retrieve
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     */
    public LockstepResponse<UserRoleModel> retrieveUserRole(String id, String include)
    {
        RestRequest<UserRoleModel> r = new RestRequest<UserRoleModel>(this.client, "GET", "/api/v1/UserRoles/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(UserRoleModel.class);
    }

    /**
     * Queries User Roles for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     * 
     * @param filter - The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order - The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize - The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber - The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     */
    public LockstepResponse<FetchResult<UserRoleModel>> queryUserRoles(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<UserRoleModel>> r = new RestRequest<FetchResult<UserRoleModel>>(this.client, "GET", "/api/v1/UserRoles/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<UserRoleModel>>() {}.getType());
    }
}
