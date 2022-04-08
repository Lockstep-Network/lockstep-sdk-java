
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import io.lockstep.api.models.SyncRequestModel;
import io.lockstep.api.models.SyncSubmitModel;
import io.lockstep.api.models.BatchSyncModel;
import io.lockstep.api.BlobRequest;

import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to Sync
 */
public class SyncClient
{
    private LockstepApi client;

    /**
     * Constructor for the Sync API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public SyncClient(@NotNull LockstepApi client) {
        super();
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
    public @NotNull LockstepResponse<SyncRequestModel> createSync(@NotNull SyncSubmitModel body)
    {
        RestRequest<SyncRequestModel> r = new RestRequest<SyncRequestModel>(this.client, "POST", "/api/v1/Sync");
        r.AddBody(body);
        return r.Call(SyncRequestModel.class);
    }

    /**
     * Creates a new batch import Sync task that imports all the models provided to this API call.
     *
     * A Sync task represents ingestion of data from a source.  For each data model in the source, the Sync process will determine whether the data is new, updated, or unchanged from data that already exists within the Lockstep Platform.  For records that are new, the Sync process will add them to the Lockstep Platform data.  For records that are updated, the Sync process will update existing data to match the newly uploaded records.  If records have not changed, no action will be taken.
     *
     * You can use this Batch Import process to load data in bulk directly into the Lockstep Platform.
     *
     * @param body Information about the Sync to execute
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<SyncRequestModel> createBatchImport(@NotNull BatchSyncModel body)
    {
        RestRequest<SyncRequestModel> r = new RestRequest<SyncRequestModel>(this.client, "POST", "/api/v1/Sync/batch");
        r.AddBody(body);
        return r.Call(SyncRequestModel.class);
    }

    /**
     * Requests a new Sync task from a ZIP file you provide.  This ZIP file can contain one or more files with data from the customer's platform.  Individual files can be in the format CSV or JSONL (JSON with Lines).
     *
     * A Sync task represents an action performed by an Application for a particular account.  An Application can provide many different tasks as part of their capabilities.  Sync tasks are executed in the background and will continue running after they are created.  Use one of the creation APIs to request execution of a task. To check on the progress of the task, call GetSync or QuerySync.
     *
     * @param filename The full path of a file to upload to the API
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<SyncRequestModel> uploadSyncFile(@NotNull byte[] filename)
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
    public @NotNull LockstepResponse<SyncRequestModel> updateSync(@NotNull String id, @NotNull Object body)
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
    public @NotNull LockstepResponse<SyncRequestModel> retrieveSync(@NotNull String id, @Nullable String include)
    {
        RestRequest<SyncRequestModel> r = new RestRequest<SyncRequestModel>(this.client, "GET", "/api/v1/Sync/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(SyncRequestModel.class);
    }

    /**
     * Cancels a Sync process for an Application if the request is still being processed within the Application. This does not cancel Sync processes which have already proceeded to completion within the Application, or Sync processes outside of Applications such as from a Zip file or Batch Import.
     *
     * A Sync task represents an action performed by an Application for a particular account.  An Application can provide many different tasks as part of their capabilities.  Sync tasks are executed in the background and will continue running after they are created.  Use one of the creation APIs to request execution of a task. To check on the progress of the task, call GetSync or QuerySync.
     *
     * @param id The unique ID number of the Sync task to cancel
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<SyncRequestModel> cancelSync(@NotNull String id)
    {
        RestRequest<SyncRequestModel> r = new RestRequest<SyncRequestModel>(this.client, "DELETE", "/api/v1/Sync/{id}");
        r.AddPath("{id}", id.toString());
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
    public @NotNull LockstepResponse<FetchResult<SyncRequestModel>> querySyncs(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
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
