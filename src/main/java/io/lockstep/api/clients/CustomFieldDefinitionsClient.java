
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
import io.lockstep.api.models.CustomFieldDefinitionModel;

import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to CustomFieldDefinitions
 */
public class CustomFieldDefinitionsClient
{
    private LockstepApi client;

    /**
     * Constructor for method collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public CustomFieldDefinitionsClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the Custom Field Definition specified by this unique identifier.
     *
     * A Custom Field represents metadata added to an object within the Lockstep Platform.  Lockstep provides a core definition for each object.  The core definition is intended to represent a level of compatibility that provides support across most accounting systems and products.  When a user or developer requires information beyond this core definition, you can use Custom Fields to represent this information.  See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param id The unique Lockstep Platform ID number of this Custom Field Definition
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No additional data collections are currently defined on this object, but may be supported in the future.
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<CustomFieldDefinitionModel> retrieveFieldDefinition(String id, String include)
    {
        RestRequest<CustomFieldDefinitionModel> r = new RestRequest<CustomFieldDefinitionModel>(this.client, "GET", "/api/v1/CustomFieldDefinitions/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(CustomFieldDefinitionModel.class);
    }

    /**
     * Updates an existing Custom Field Definition with the information supplied to this PATCH call.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * A Custom Field represents metadata added to an object within the Lockstep Platform.  Lockstep provides a core definition for each object.  The core definition is intended to represent a level of compatibility that provides support across most accounting systems and products.  When a user or developer requires information beyond this core definition, you can use Custom Fields to represent this information.  See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param id The unique Lockstep Platform ID number of the Custom Field Definition to update
     * @param body A list of changes to apply to this Custom Field Definition
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<CustomFieldDefinitionModel> updateFieldDefinition(String id, Object body)
    {
        RestRequest<CustomFieldDefinitionModel> r = new RestRequest<CustomFieldDefinitionModel>(this.client, "PATCH", "/api/v1/CustomFieldDefinitions/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(CustomFieldDefinitionModel.class);
    }

    /**
     * Deletes the Custom Field Definition referred to by this unique identifier.
     *
     * A Custom Field represents metadata added to an object within the Lockstep Platform.  Lockstep provides a core definition for each object.  The core definition is intended to represent a level of compatibility that provides support across most accounting systems and products.  When a user or developer requires information beyond this core definition, you can use Custom Fields to represent this information.  See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param id The unique Lockstep Platform ID number of the Custom Field Definition to delete
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<CustomFieldDefinitionModel> deleteFieldDefinition(String id)
    {
        RestRequest<CustomFieldDefinitionModel> r = new RestRequest<CustomFieldDefinitionModel>(this.client, "DELETE", "/api/v1/CustomFieldDefinitions/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(CustomFieldDefinitionModel.class);
    }

    /**
     * Creates one or more Custom Field Definitions and returns the records as created.  A Custom Field represents metadata added to an object within the Lockstep Platform.  Lockstep provides a core definition for each object.  The core definition is intended to represent a level of compatibility that provides support across most accounting systems and products.  When a user or developer requires information beyond this core definition, you can use Custom Fields to represent this information.  See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param body The Custom Field Definitions to create
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<CustomFieldDefinitionModel[]> createFieldDefinitions(CustomFieldDefinitionModel[] body)
    {
        RestRequest<CustomFieldDefinitionModel[]> r = new RestRequest<CustomFieldDefinitionModel[]>(this.client, "POST", "/api/v1/CustomFieldDefinitions");
        r.AddBody(body);
        return r.Call(CustomFieldDefinitionModel[].class);
    }

    /**
     * Queries Custom Field Definitions within the Lockstep platform using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * A Custom Field represents metadata added to an object within the Lockstep Platform.  Lockstep provides a core definition for each object.  The core definition is intended to represent a level of compatibility that provides support across most accounting systems and products.  When a user or developer requires information beyond this core definition, you can use Custom Fields to represent this information.  See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No additional data collections are currently defined on this object, but may be supported in the future.
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<CustomFieldDefinitionModel>> queryFieldDefinitions(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<CustomFieldDefinitionModel>> r = new RestRequest<FetchResult<CustomFieldDefinitionModel>>(this.client, "GET", "/api/v1/CustomFieldDefinitions/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<CustomFieldDefinitionModel>>() {}.getType());
    }
}
