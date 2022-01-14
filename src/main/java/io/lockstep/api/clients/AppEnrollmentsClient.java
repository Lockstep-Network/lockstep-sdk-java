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
import io.lockstep.api.models.AppEnrollmentModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;
import io.lockstep.api.models.AppEnrollmentCustomFieldModel;

public class AppEnrollmentsClient
{
    private LockstepApi client;

     /**
      * Constructor for method collection
      * @param client A {@link io.lockstep.api.LockstepApi} platform client
      */
    public AppEnrollmentsClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the App Enrollment with this identifier.
     * 
     * An App Enrollment represents an app that has been enrolled to the current account.  When you sign up for an app using the Lockstep Platform, you obtain an enrollment record for that app.  Example types of apps include connectors and feature enhancement apps. The App Enrollment object contains information about this app, its configuration, and settings.
     * 
     * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
     * 
     * @param id - The unique ID number of the App Enrollment to retrieve
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: App, CustomFields
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<AppEnrollmentModel> retrieveAppEnrollment(String id, String include)
    {
        RestRequest<AppEnrollmentModel> r = new RestRequest<AppEnrollmentModel>(this.client, "GET", "/api/v1/AppEnrollments/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(AppEnrollmentModel.class);
    }

    /**
     * Updates an existing App Enrollment with the information supplied to this PATCH call.
     * 
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  For example, you can provide the field name "IsActive" and specify the new value "False"; this API will then change the value of IsActive to false.
     * 
     * An App Enrollment represents an app that has been enrolled to the current account.  When you sign up for an app using the Lockstep Platform, you obtain an enrollment record for that app.  Example types of apps include connectors and feature enhancement apps. The App Enrollment object contains information about this app, its configuration, and settings.
     * 
     * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
     * 
     * @param id - The unique ID number of the App Enrollment to update
     * @param body - A list of changes to apply to this App Enrollment
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<AppEnrollmentModel> updateAppEnrollment(String id, Object body)
    {
        RestRequest<AppEnrollmentModel> r = new RestRequest<AppEnrollmentModel>(this.client, "PATCH", "/api/v1/AppEnrollments/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(AppEnrollmentModel.class);
    }

    /**
     * Deletes the App Enrollment referred to by this unique identifier. An App Enrollment represents an app that has been enrolled to the current account.  When you sign up for an app using the Lockstep Platform, you obtain an enrollment record for that app.  Example types of apps include connectors and feature enhancement apps. The App Enrollment object contains information about this app, its configuration, and settings.
     * 
     * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
     * 
     * @param id - The unique ID number of the App Enrollment to delete
     * @param removeEnrollmentData - Option to remove all associated app enrollment data when deleting app enrollment (default false)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<ActionResultModel> deleteAppEnrollment(String id, Boolean removeEnrollmentData)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/AppEnrollments/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("removeEnrollmentData", removeEnrollmentData.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates one or more App Enrollments within this account and returns the records as created.
     * 
     * An App Enrollment represents an app that has been enrolled to the current account.  When you sign up for an app using the Lockstep Platform, you obtain an enrollment record for that app.  Example types of apps include connectors and feature enhancement apps. The App Enrollment object contains information about this app, its configuration, and settings.
     * 
     * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
     * 
     * @param body - The App Enrollments to create
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<AppEnrollmentModel[]> createAppEnrollments(AppEnrollmentModel[] body)
    {
        RestRequest<AppEnrollmentModel[]> r = new RestRequest<AppEnrollmentModel[]>(this.client, "POST", "/api/v1/AppEnrollments");
        r.AddBody(body);
        return r.Call(AppEnrollmentModel[].class);
    }

    /**
     * Queries App Enrollments for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     * 
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     * 
     * An App Enrollment represents an app that has been enrolled to the current account.  When you sign up for an app using the Lockstep Platform, you obtain an enrollment record for that app.  Example types of apps include connectors and feature enhancement apps. The App Enrollment object contains information about this app, its configuration, and settings.
     * 
     * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
     * 
     * @param filter - The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: App, CustomFields, LastSync
     * @param order - The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize - The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber - The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<AppEnrollmentModel>> queryAppEnrollments(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<AppEnrollmentModel>> r = new RestRequest<FetchResult<AppEnrollmentModel>>(this.client, "GET", "/api/v1/AppEnrollments/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<AppEnrollmentModel>>() {}.getType());
    }

    /**
     * Queries custom fields settings for app enrollment within the Lockstep platform using the specified filtering, sorting, nested fetch, and pagination rules requested.
     * 
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     * 
     * An App Enrollment represents an app that has been enrolled to the current account.  When you sign up for an app using the Lockstep Platform, you obtain an enrollment record for that app.  Example types of apps include connectors and feature enhancement apps. The App Enrollment object contains information about this app, its configuration, and settings.
     * 
     * See [Applications and Enrollments](https://developer.lockstep.io/docs/applications-and-enrollments) for more information.
     * 
     * @param id - The unique ID number of the App Enrollment for which we retrieve custom fields
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<AppEnrollmentCustomFieldModel>> queryEnrollmentFields(String id)
    {
        RestRequest<FetchResult<AppEnrollmentCustomFieldModel>> r = new RestRequest<FetchResult<AppEnrollmentCustomFieldModel>>(this.client, "GET", "/api/v1/AppEnrollments/settings/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(new TypeToken<FetchResult<AppEnrollmentCustomFieldModel>>() {}.getType());
    }
}
