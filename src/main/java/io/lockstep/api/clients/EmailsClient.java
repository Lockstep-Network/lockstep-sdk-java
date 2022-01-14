
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
import io.lockstep.api.models.EmailModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;
public class EmailsClient
{
    private LockstepApi client;

    /**
     * <p>Constructor for EmailsClient.</p>
     *
     * @param client a {@link io.lockstep.api.LockstepApi} object.
     */
    public EmailsClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the email with the specified email identifier.
     *
     * An Email represents a communication sent from one company to another.  The creator of the email is identified by the `CompanyId` field, recipient(s) by the `EmailTo` field, and cc recipient(s) by the 'EmailCC' field. The Email Model represents an email and a number of different metadata attributes related to the creation, storage, and ownership of the email.
     *
     * @param id - The unique ID number of the Email to retrieve.
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, CustomFields, Notes, ResponseOrigin
     * @return a {@link io.lockstep.api.models.LockstepResponse} object.
     */
    public LockstepResponse<EmailModel> retrieveEmail(String id, String include)
    {
        RestRequest<EmailModel> r = new RestRequest<EmailModel>(this.client, "GET", "/api/v1/Emails/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(EmailModel.class);
    }

    /**
     * Updates an existing Email with the information supplied to this PATCH call.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * An Email represents a communication sent from one company to another.  The creator of the email is identified by the `CompanyId` field, recipient(s) by the `EmailTo` field, and cc recipient(s) by the 'EmailCC' field. The Email Model represents an email and a number of different metadata attributes related to the creation, storage, and ownership of the email.
     *
     * @param id - The unique Lockstep Platform ID number of the email to update
     * @param body - A list of changes to apply to this Email
     * @return a {@link io.lockstep.api.models.LockstepResponse} object.
     */
    public LockstepResponse<EmailModel> updateEmail(String id, Object body)
    {
        RestRequest<EmailModel> r = new RestRequest<EmailModel>(this.client, "PATCH", "/api/v1/Emails/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(EmailModel.class);
    }

    /**
     * Deletes the Email referred to by this unique identifier.
     *
     * An Email represents a communication sent from one company to another.  The creator of the email is identified by the `CompanyId` field, recipient(s) by the `EmailTo` field, and cc recipient(s) by the 'EmailCC' field. The Email Model represents an email and a number of different metadata attributes related to the creation, storage, and ownership of the email.
     *
     * @param id - The unique Lockstep Platform ID number of the Email to delete
     * @return a {@link io.lockstep.api.models.LockstepResponse} object.
     */
    public LockstepResponse<ActionResultModel> deleteEmail(String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/Emails/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Retrieves a signature logo for the email with the specified identifier and increments 'ViewCount'.
     *
     * An Email represents a communication sent from one company to another.  The creator of the email is identified by the `CompanyId` field, recipient(s) by the `EmailTo` field, and cc recipient(s) by the 'EmailCC' field. The Email Model represents an email and a number of different metadata attributes related to the creation, storage, and ownership of the email.
     *
     * @param emailId - The unique ID number of the Email to retrieve.
     * @param nonce - The random nonce applied at time of url creation.
     * @return a {@link io.lockstep.api.models.LockstepResponse} object.
     */
    public LockstepResponse<byte[]> retrieveEmailLogo(String emailId, String nonce)
    {
        RestRequest<byte[]> r = new RestRequest<byte[]>(this.client, "GET", "/api/v1/Emails/{emailId}/logo/{nonce}");
        r.AddPath("{emailId}", emailId.toString());
        r.AddPath("{nonce}", nonce.toString());
        return r.Call(byte[].class);
    }

    /**
     * Creates one or more emails from the specified array of Email Models
     *
     * An Email represents a communication sent from one company to another.  The creator of the email is identified by the `CompanyId` field, recipient(s) by the `EmailTo` field, and cc recipient(s) by the 'EmailCC' field. The Email Model represents an email and a number of different metadata attributes related to the creation, storage, and ownership of the email.
     *
     * @param body - The array of emails to be created
     * @return a {@link io.lockstep.api.models.LockstepResponse} object.
     */
    public LockstepResponse<EmailModel[]> createEmails(EmailModel[] body)
    {
        RestRequest<EmailModel[]> r = new RestRequest<EmailModel[]>(this.client, "POST", "/api/v1/Emails");
        r.AddBody(body);
        return r.Call(EmailModel[].class);
    }

    /**
     * Queries Emails on the Lockstep Platform using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * An Email represents a communication sent from one company to another.  The creator of the email is identified by the `CompanyId` field, recipient(s) by the `EmailTo` field, and cc recipient(s) by the 'EmailCC' field. The Email Model represents an email and a number of different metadata attributes related to the creation, storage, and ownership of the email.
     *
     * @param filter - The filter to use to select from the list of available applications, in the [Searchlight query syntax](https://github.com/tspence/csharp-searchlight).
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, CustomFields, Notes, ResponseOrigin
     * @param order - The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize - The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber - The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return a {@link io.lockstep.api.models.LockstepResponse} object.
     */
    public LockstepResponse<FetchResult<EmailModel>> queryEmails(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<EmailModel>> r = new RestRequest<FetchResult<EmailModel>>(this.client, "GET", "/api/v1/Emails/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<EmailModel>>() {}.getType());
    }
}
