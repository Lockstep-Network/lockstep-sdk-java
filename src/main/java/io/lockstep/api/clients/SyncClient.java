
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
import io.lockstep.api.models.SyncRequestModel;
import io.lockstep.api.models.SyncSubmitModel;

import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;

public class SyncClient
{
    private LockstepApi client;

    /**
     * Constructor for method collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public SyncClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Requests a new Sync task from the Application specified in the request and returns a token that can be used to check the progress and status of the task.
     *
     * A Sync task represents an action performed by an Application for a particular account.  An Application can provide many different tasks as part of their capabilities.  Sync tasks are executed in the background and will continue running after they are created.  Use one of the creation APIs to request execution of a task. To check on the progress of the task, call GetSync or QuerySync.
     *
     * @param body Information about the Sync to execute
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<SyncRequestModel> createSync(SyncSubmitModel body)
    {
        RestRequest<SyncRequestModel> r = new RestRequest<SyncRequestModel>(this.client, "POST", "/api/v1/Sync");
        r.AddBody(body);
        return r.Call(SyncRequestModel.class);
    }

    /**
     * Requests a new Sync task from a ZIP file you provide.  This ZIP file can contain one or more files with data from the customer's platform.  Individual files can be in the format CSV or JSONL (JSON with Lines).
     *
     * A Sync task represents an action performed by an Application for a particular account.  An Application can provide many different tasks as part of their capabilities.  Sync tasks are executed in the background and will continue running after they are created.  Use one of the creation APIs to request execution of a task. To check on the progress of the task, call GetSync or QuerySync.
     *
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<SyncRequestModel> uploadSyncFile()
    {
        RestRequest<SyncRequestModel> r = new RestRequest<SyncRequestModel>(this.client, "POST", "/api/v1/Sync/zip");
        return r.Call(SyncRequestModel.class);
    }

    /**
     * Updates an existing Sync with the information supplied to this PATCH call.
     *
     * This API is restricted to internal service users and may not be called by customers or partners.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  For example, you can provide the field name "IsActive" and specify the new value "False"; this API will then change the value of IsActive to false.
     *
     * A Sync task represents an action performed by an Application for a particular account.  An Application can provide many different tasks as part of their capabilities.  Sync tasks are executed in the background and will continue running after they are created.  Use one of the creation APIs to request execution of a task. To check on the progress of the task, call GetSync or QuerySync.
     *
     * @param id The unique ID number of the Sync to update
     * @param body A list of changes to apply to this Application
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<SyncRequestModel> updateSync(String id, Object body)
    {
        RestRequest<SyncRequestModel> r = new RestRequest<SyncRequestModel>(this.client, "PATCH", "/api/v1/Sync/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(SyncRequestModel.class);
    }

    /**
     * Retrieves the status and information about a Sync operation by the requested ID.  Provides status and progress information about this task.
     *
     * A Sync task represents an action performed by an Application for a particular account.  An Application can provide many different tasks as part of their capabilities.  Sync tasks are executed in the background and will continue running after they are created.  Use one of the creation APIs to request execution of a task. To check on the progress of the task, call GetSync or QuerySync.
     *
     * @param id The unique ID number of the Sync task to retrieve
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Details
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<SyncRequestModel> retrieveSync(String id, String include)
    {
        RestRequest<SyncRequestModel> r = new RestRequest<SyncRequestModel>(this.client, "GET", "/api/v1/Sync/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(SyncRequestModel.class);
    }

    /**
     * Queries Sync tasks for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * A Sync task represents an action performed by an Application for a particular account.  An Application can provide many different tasks as part of their capabilities.  Sync tasks are executed in the background and will continue running after they are created.  Use one of the creation APIs to request execution of a task. To check on the progress of the task, call GetSync or QuerySync.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Details
     * @param order The sort order for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<SyncRequestModel>> querySyncs(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<SyncRequestModel>> r = new RestRequest<FetchResult<SyncRequestModel>>(this.client, "GET", "/api/v1/Sync/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<SyncRequestModel>>() {}.getType());
    }
}
