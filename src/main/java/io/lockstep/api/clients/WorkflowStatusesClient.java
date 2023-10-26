
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
import io.lockstep.api.models.WorkflowStatusModel;

import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to WorkflowStatuses
 */
public class WorkflowStatusesClient
{
    private LockstepApi client;

    /**
     * Constructor for the WorkflowStatuses API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public WorkflowStatusesClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Workflow Status specified by this unique identifier.
     *
     * A Workflow Status represents the state for a specific workflow for an entity. A Workflow Status may be generic for common use cases or specific to a set of predefined statuses.
     *
     * @param id The unique ID number of the Workflow Status to retrieve
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<WorkflowStatusModel> retrieveWorkflowStatus(@NotNull String id)
    {
        RestRequest<WorkflowStatusModel> r = new RestRequest<WorkflowStatusModel>(this.client, "GET", "/api/v1/workflow-statuses/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(WorkflowStatusModel.class);
    }

    /**
     * Creates one or more Workflow Statuses from a given model.
     *
     * A Workflow Status represents the state for a specific workflow for an entity. A Workflow Status may be generic for common use cases or specific to a set of predefined statuses.
     *
     * @param body The Workflow Statuses to create
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<WorkflowStatusModel[]> createWorkflowStatuses(@NotNull WorkflowStatusModel[] body)
    {
        RestRequest<WorkflowStatusModel[]> r = new RestRequest<WorkflowStatusModel[]>(this.client, "POST", "/api/v1/workflow-statuses");
        r.AddBody(body);
        return r.Call(WorkflowStatusModel[].class);
    }

    /**
     * Queries Workflow Statuses using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Accounting Data Services Developer website.
     *
     * A Workflow Status represents the state for a specific workflow for an entity. A Workflow Status may be generic for common use cases or specific to a set of predefined statuses.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 250, maximum of 500). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<WorkflowStatusModel>> queryWorkflowStatuses(@Nullable String filter, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<WorkflowStatusModel>> r = new RestRequest<FetchResult<WorkflowStatusModel>>(this.client, "GET", "/api/v1/workflow-statuses/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<WorkflowStatusModel>>() {}.getType());
    }
}
