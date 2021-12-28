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

package io.lockstep.api;



public class ActivitiesClient
{
    private LockstepApi client;

    public ActivitiesClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the Activity specified by this unique identifier, optionally including nested data sets.
     * 
     * An Activity contains information about work being done on a specific accounting task. You can use Activities to track information about who has been assigned a specific task, the current status of the task, the name and description given for the particular task, the priority of the task, and any amounts collected, paid, or credited for the task.
     * 
     * @param id - The unique Lockstep Platform ID number of this Activity
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, CustomFields, and Notes
     */
    public LockstepResponse<ActivityModel> RetrieveActivity(String id, String include)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/Activities/{id}");
        r.AddPath("{id}", id);
        r.AddQuery("include", include);
        return this.client.Request<ActivityModel>(r);
    }

    /**
     * Updates an activity that matches the specified id with the requested information.
     * 
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     * 
     * An Activity contains information about work being done on a specific accounting task. You can use Activities to track information about who has been assigned a specific task, the current status of the task, the name and description given for the particular task, the priority of the task, and any amounts collected, paid, or credited for the task.
     * 
     * @param id - The unique Lockstep Platform ID number of the Activity to update
     * @param body - A list of changes to apply to this Activity
     */
    public LockstepResponse<ActivityModel> UpdateActivity(String id, object body)
    {
        RestRequest r = new RestRequest("PATCH", "/api/v1/Activities/{id}");
        r.AddPath("{id}", id);
        r.AddBody(body);
        return this.client.Request<ActivityModel>(r);
    }

    /**
     * Delete the Activity referred to by this unique identifier.
     * 
     * An Activity contains information about work being done on a specific accounting task. You can use Activities to track information about who has been assigned a specific task, the current status of the task, the name and description given for the particular task, the priority of the task, and any amounts collected, paid, or credited for the task.
     * 
     * @param id - The unique Lockstep Platform ID number of the Activity to delete
     */
    public LockstepResponse<ActivityModel> DeleteActivity(String id)
    {
        RestRequest r = new RestRequest("DELETE", "/api/v1/Activities/{id}");
        r.AddPath("{id}", id);
        return this.client.Request<ActivityModel>(r);
    }

    /**
     * Creates one or more activities from a given model.
     * 
     * An Activity contains information about work being done on a specific accounting task. You can use Activities to track information about who has been assigned a specific task, the current status of the task, the name and description given for the particular task, the priority of the task, and any amounts collected, paid, or credited for the task.
     * 
     * @param body - The Activities to create
     */
    public LockstepResponse<ActivityModel[]> CreateActivities(ActivityModel[] body)
    {
        RestRequest r = new RestRequest("POST", "/api/v1/Activities");
        r.AddBody(body);
        return this.client.Request<ActivityModel[]>(r);
    }

    /**
     * Queries Activities for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     * 
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     * 
     * An Activity contains information about work being done on a specific accounting task. You can use Activities to track information about who has been assigned a specific task, the current status of the task, the name and description given for the particular task, the priority of the task, and any amounts collected, paid, or credited for the task.
     * 
     * @param filter - The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, CustomFields, and Notes
     * @param order - The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize - The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber - The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     */
    public LockstepResponse<FetchResult<ActivityModel>> QueryActivities(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/Activities/query");
        r.AddQuery("filter", filter);
        r.AddQuery("include", include);
        r.AddQuery("order", order);
        r.AddQuery("pageSize", pageSize);
        r.AddQuery("pageNumber", pageNumber);
        return this.client.Request<FetchResult<ActivityModel>>(r);
    }
}
