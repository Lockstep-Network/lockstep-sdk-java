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
 * @version    2021.39
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import io.lockstep.api.models.ContactModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;

public class ContactsClient
{
    private LockstepApi client;

    public ContactsClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the Contact specified by this unique identifier, optionally including nested data sets.  A Contact contains information about a person or role within a Company. You can use Contacts to track information about who is responsible for a specific project, who handles invoices, or information about which role at a particular customer or vendor you should speak with about invoices.
     * 
     * @param id - The unique Lockstep Platform ID number of this Contact; NOT the customer's ERP key
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, CustomFields, Notes
     */
    public LockstepResponse<ContactModel> retrieveContact(String id, String include)
    {
        RestRequest<ContactModel> r = new RestRequest<ContactModel>(this.client, "GET", "/api/v1/Contacts/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(ContactModel.class);
    }

    /**
     * Updates a contact that matches the specified id with the requested information.
     * 
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.  A Contact contains information about a person or role within a Company. You can use Contacts to track information about who is responsible for a specific project, who handles invoices, or information about which role at a particular customer or vendor you should speak with about invoices.
     * 
     * @param id - The unique Lockstep Platform ID number of the Contact to update; NOT the customer's ERP key
     * @param body - A list of changes to apply to this Contact
     */
    public LockstepResponse<ContactModel> updateContact(String id, Object body)
    {
        RestRequest<ContactModel> r = new RestRequest<ContactModel>(this.client, "PATCH", "/api/v1/Contacts/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(ContactModel.class);
    }

    /**
     * Disable the Contact referred to by this unique identifier.
     * 
     * A Contact contains information about a person or role within a Company. You can use Contacts to track information about who is responsible for a specific project, who handles invoices, or information about which role at a particular customer or vendor you should speak with about invoices.
     * 
     * @param id - The unique Lockstep Platform ID number of the Contact to disable; NOT the customer's ERP key
     */
    public LockstepResponse<ActionResultModel> disableContact(String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/Contacts/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates one or more contacts from a given model.
     * 
     * A Contact contains information about a person or role within a Company. You can use Contacts to track information about who is responsible for a specific project, who handles invoices, or information about which role at a particular customer or vendor you should speak with about invoices.
     * 
     * @param body - The Contacts to create
     */
    public LockstepResponse<ContactModel[]> createContacts(ContactModel[] body)
    {
        RestRequest<ContactModel[]> r = new RestRequest<ContactModel[]>(this.client, "POST", "/api/v1/Contacts");
        r.AddBody(body);
        return r.Call(ContactModel[].class);
    }

    /**
     * Queries Contacts for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     * 
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.  A Contact contains information about a person or role within a Company. You can use Contacts to track information about who is responsible for a specific project, who handles invoices, or information about which role at a particular customer or vendor you should speak with about invoices.
     * 
     * @param filter - The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, CustomFields, Notes
     * @param order - The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize - The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber - The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     */
    public LockstepResponse<FetchResult<ContactModel>> queryContacts(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<ContactModel>> r = new RestRequest<FetchResult<ContactModel>>(this.client, "GET", "/api/v1/Contacts/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<ContactModel>>() {}.getType());
    }
}
