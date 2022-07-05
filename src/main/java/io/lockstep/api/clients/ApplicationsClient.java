
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
import io.lockstep.api.models.ApplicationModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to Applications
 */
public class ApplicationsClient
{
    private LockstepApi client;

    /**
     * Constructor for the Applications API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public ApplicationsClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Application with this identifier.
     *
     * An Application represents a feature available to customers within the Lockstep Platform.  You can create Applications by working with your Lockstep business development manager and publish them on the platform so that customers can browse and find your Application on the Lockstep Platform Marketplace.  When a customer adds an Application to their account, they obtain an AppEnrollment which represents that customer's instance of this Application.  The customer-specific AppEnrollment contains a customer's configuration data for the Application, which is not customer-specific.
     *
     * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
     *
     * @param id The unique ID number of the Application to retrieve
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Notes, Attachments, CustomFields
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ApplicationModel> retrieveApplication(@NotNull String id, @Nullable String include)
    {
        RestRequest<ApplicationModel> r = new RestRequest<ApplicationModel>(this.client, "GET", "/api/v1/Applications/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(ApplicationModel.class);
    }

    /**
     * Updates an existing Application with the information supplied to this PATCH call.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  For example, you can provide the field name "IsActive" and specify the new value "False"; this API will then change the value of IsActive to false.
     *
     * An Application represents a feature available to customers within the Lockstep Platform.  You can create Applications by working with your Lockstep business development manager and publish them on the platform so that customers can browse and find your Application on the Lockstep Platform Marketplace.  When a customer adds an Application to their account, they obtain an AppEnrollment which represents that customer's instance of this Application.  The customer-specific AppEnrollment contains a customer's configuration data for the Application, which is not customer-specific.
     *
     * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
     *
     * @param id The unique ID number of the Application to update
     * @param body A list of changes to apply to this Application
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ApplicationModel> updateApplication(@NotNull String id, @NotNull Object body)
    {
        RestRequest<ApplicationModel> r = new RestRequest<ApplicationModel>(this.client, "PATCH", "/api/v1/Applications/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(ApplicationModel.class);
    }

    /**
     * Deletes the Application referred to by this unique identifier.  Information about this Application is retained but after the DELETE call, this Application is no longer available for use on the Lockstep Platform.
     *
     * An Application represents a feature available to customers within the Lockstep Platform.  You can create Applications by working with your Lockstep business development manager and publish them on the platform so that customers can browse and find your Application on the Lockstep Platform Marketplace.  When a customer adds an Application to their account, they obtain an AppEnrollment which represents that customer's instance of this Application.  The customer-specific AppEnrollment contains a customer's configuration data for the Application, which is not customer-specific.
     *
     * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
     *
     * @param id The unique ID number of the Application to delete
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> deleteApplication(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/Applications/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates one or more Applications and returns the records as created.  Applications are universal and available across all accounts.
     *
     * An Application represents a feature available to customers within the Lockstep Platform.  You can create Applications by working with your Lockstep business development manager and publish them on the platform so that customers can browse and find your Application on the Lockstep Platform Marketplace.  When a customer adds an Application to their account, they obtain an AppEnrollment which represents that customer's instance of this Application.  The customer-specific AppEnrollment contains a customer's configuration data for the Application, which is not customer-specific.
     *
     * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
     *
     * @param body The Applications to create
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ApplicationModel[]> createApplications(@NotNull ApplicationModel[] body)
    {
        RestRequest<ApplicationModel[]> r = new RestRequest<ApplicationModel[]>(this.client, "POST", "/api/v1/Applications");
        r.AddBody(body);
        return r.Call(ApplicationModel[].class);
    }

    /**
     * Queries Applications on the Lockstep Platform using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * An Application represents a feature available to customers within the Lockstep Platform.  You can create Applications by working with your Lockstep business development manager and publish them on the platform so that customers can browse and find your Application on the Lockstep Platform Marketplace.  When a customer adds an Application to their account, they obtain an AppEnrollment which represents that customer's instance of this Application.  The customer-specific AppEnrollment contains a customer's configuration data for the Application, which is not customer-specific.
     *
     * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Notes, Attachments, CustomFields
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<ApplicationModel>> queryApplications(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<ApplicationModel>> r = new RestRequest<FetchResult<ApplicationModel>>(this.client, "GET", "/api/v1/Applications/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<ApplicationModel>>() {}.getType());
    }
}
