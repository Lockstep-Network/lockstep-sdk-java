
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
import io.lockstep.api.LockstepResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import io.lockstep.api.models.ActivityModel;

import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;
import io.lockstep.api.models.ActivityStreamItemModel;

/**
 * Contains all methods related to Activities
 */
public class ActivitiesClient
{
    private LockstepApi client;

    /**
     * Constructor for the Activities API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public ActivitiesClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Activity specified by this unique identifier, optionally including nested data sets.
     *
     * An Activity contains information about work being done on a specific accounting task. You can use Activities to track information about who has been assigned a specific task, the current status of the task, the name and description given for the particular task, the priority of the task, and any amounts collected, paid, or credited for the task.
     *
     * @param id The unique Lockstep Platform ID number of this Activity
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Company, Attachments, CustomFields, Notes, References, and UserAssignedToName
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActivityModel> retrieveActivity(@NotNull String id, @Nullable String include)
    {
        RestRequest<ActivityModel> r = new RestRequest<ActivityModel>(this.client, "GET", "/api/v1/Activities/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(ActivityModel.class);
    }

    /**
     * Updates an activity that matches the specified id with the requested information.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * An Activity contains information about work being done on a specific accounting task. You can use Activities to track information about who has been assigned a specific task, the current status of the task, the name and description given for the particular task, the priority of the task, and any amounts collected, paid, or credited for the task.
     *
     * @param id The unique Lockstep Platform ID number of the Activity to update
     * @param body A list of changes to apply to this Activity
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActivityModel> updateActivity(@NotNull String id, @NotNull Object body)
    {
        RestRequest<ActivityModel> r = new RestRequest<ActivityModel>(this.client, "PATCH", "/api/v1/Activities/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(ActivityModel.class);
    }

    /**
     * Delete the Activity referred to by this unique identifier.
     *
     * An Activity contains information about work being done on a specific accounting task. You can use Activities to track information about who has been assigned a specific task, the current status of the task, the name and description given for the particular task, the priority of the task, and any amounts collected, paid, or credited for the task.
     *
     * @param id The unique Lockstep Platform ID number of the Activity to delete
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActivityModel> deleteActivity(@NotNull String id)
    {
        RestRequest<ActivityModel> r = new RestRequest<ActivityModel>(this.client, "DELETE", "/api/v1/Activities/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActivityModel.class);
    }

    /**
     * Creates one or more activities from a given model.
     *
     * An Activity contains information about work being done on a specific accounting task. You can use Activities to track information about who has been assigned a specific task, the current status of the task, the name and description given for the particular task, the priority of the task, and any amounts collected, paid, or credited for the task.
     *
     * @param body The Activities to create
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActivityModel[]> createActivities(@NotNull ActivityModel[] body)
    {
        RestRequest<ActivityModel[]> r = new RestRequest<ActivityModel[]>(this.client, "POST", "/api/v1/Activities");
        r.AddBody(body);
        return r.Call(ActivityModel[].class);
    }

    /**
     * Queries Activities for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * An Activity contains information about work being done on a specific accounting task. You can use Activities to track information about who has been assigned a specific task, the current status of the task, the name and description given for the particular task, the priority of the task, and any amounts collected, paid, or credited for the task.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Company, Attachments, CustomFields, Notes, References, and UserAssignedToName
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<ActivityModel>> queryActivities(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<ActivityModel>> r = new RestRequest<FetchResult<ActivityModel>>(this.client, "GET", "/api/v1/Activities/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<ActivityModel>>() {}.getType());
    }

    /**
     * Retrieves a list of items representing the activity stream for the supplied activity id.
     *
     * An Activity contains information about work being done on a specific accounting task. You can use Activities to track information about who has been assigned a specific task, the current status of the task, the name and description given for the particular task, the priority of the task, and any amounts collected, paid, or credited for the task.
     *
     * @param id The unique Lockstep Platform ID number of this Activity
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActivityStreamItemModel[]> retrieveActivityStream(@NotNull String id)
    {
        RestRequest<ActivityStreamItemModel[]> r = new RestRequest<ActivityStreamItemModel[]>(this.client, "GET", "/api/v1/Activities/{id}/stream");
        r.AddPath("{id}", id.toString());
        return r.Call(ActivityStreamItemModel[].class);
    }

    /**
     * Forwards an activity by creating a new activity with all child references and assigning the new activity to a new user.
     *
     * An Activity contains information about work being done on a specific accounting task. You can use Activities to track information about who has been assigned a specific task, the current status of the task, the name and description given for the particular task, the priority of the task, and any amounts collected, paid, or credited for the task.
     *
     * @param activityId Documentation pending
     * @param userId Documentation pending
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActivityModel> forwardActivity(@NotNull String activityId, @NotNull String userId)
    {
        RestRequest<ActivityModel> r = new RestRequest<ActivityModel>(this.client, "POST", "/api/v1/Activities/{activityId}/forward/{userId}");
        r.AddPath("{activityId}", activityId.toString());
        r.AddPath("{userId}", userId.toString());
        return r.Call(ActivityModel.class);
    }
}
