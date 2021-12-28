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



public class EmailsClient
{
    private LockstepApi client;

    public EmailsClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the email with the specified email identifier.
     * 
     * An Email represents a communication sent from one company to another.  The creator of the email is identified by the `CompanyId` field, recipient(s) by the `EmailTo` field, and cc recipient(s) by the 'EmailCC' field. The Email Model represents an email and a number of different metadata attributes related to the creation, storage, and ownership of the email.
     * 
     * @param id - The unique ID number of the Email to retrieve.
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, CustomFields, Notes
     */
    public LockstepResponse<EmailModel> RetrieveEmail(String id, String include)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/Emails/{id}");
        r.AddPath("{id}", id);
        r.AddQuery("include", include);
        return this.client.Request<EmailModel>(r);
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
     */
    public LockstepResponse<EmailModel> UpdateEmail(String id, object body)
    {
        RestRequest r = new RestRequest("PATCH", "/api/v1/Emails/{id}");
        r.AddPath("{id}", id);
        r.AddBody(body);
        return this.client.Request<EmailModel>(r);
    }

    /**
     * Deletes the Email referred to by this unique identifier.
     * 
     * An Email represents a communication sent from one company to another.  The creator of the email is identified by the `CompanyId` field, recipient(s) by the `EmailTo` field, and cc recipient(s) by the 'EmailCC' field. The Email Model represents an email and a number of different metadata attributes related to the creation, storage, and ownership of the email.
     * 
     * @param id - The unique Lockstep Platform ID number of the Email to delete
     */
    public LockstepResponse<ActionResultModel> DeleteEmail(String id)
    {
        RestRequest r = new RestRequest("DELETE", "/api/v1/Emails/{id}");
        r.AddPath("{id}", id);
        return this.client.Request<ActionResultModel>(r);
    }

    /**
     * Retrieves a signature logo for the email with the specified identifier and increments 'ViewCount'.
     * 
     * An Email represents a communication sent from one company to another.  The creator of the email is identified by the `CompanyId` field, recipient(s) by the `EmailTo` field, and cc recipient(s) by the 'EmailCC' field. The Email Model represents an email and a number of different metadata attributes related to the creation, storage, and ownership of the email.
     * @param emailId - The unique ID number of the Email to retrieve.
     * @param nonce - The random nonce applied at time of url creation.
     */
    public LockstepResponse<File> RetrieveEmailLogo(String emailId, String nonce)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/Emails/{emailId}/logo/{nonce}");
        r.AddPath("{emailId}", emailId);
        r.AddPath("{nonce}", nonce);
        return this.client.Request<File>(r);
    }

    /**
     * Creates one or more emails from the specified array of Email Models
     * 
     * An Email represents a communication sent from one company to another.  The creator of the email is identified by the `CompanyId` field, recipient(s) by the `EmailTo` field, and cc recipient(s) by the 'EmailCC' field. The Email Model represents an email and a number of different metadata attributes related to the creation, storage, and ownership of the email.
     * 
     * @param body - The array of emails to be created
     */
    public LockstepResponse<EmailModel[]> CreateEmails(EmailModel[] body)
    {
        RestRequest r = new RestRequest("POST", "/api/v1/Emails");
        r.AddBody(body);
        return this.client.Request<EmailModel[]>(r);
    }

    /**
     * Queries Emails on the Lockstep Platform using the specified filtering, sorting, nested fetch, and pagination rules requested.
     * 
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     * 
     * An Email represents a communication sent from one company to another.  The creator of the email is identified by the `CompanyId` field, recipient(s) by the `EmailTo` field, and cc recipient(s) by the 'EmailCC' field. The Email Model represents an email and a number of different metadata attributes related to the creation, storage, and ownership of the email.
     * 
     * @param filter - The filter to use to select from the list of available applications, in the [Searchlight query syntax](https://github.com/tspence/csharp-searchlight).
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Attachments, CustomFields, Notes
     * @param order - The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize - The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber - The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     */
    public LockstepResponse<FetchResult<EmailModel>> QueryEmails(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/Emails/query");
        r.AddQuery("filter", filter);
        r.AddQuery("include", include);
        r.AddQuery("order", order);
        r.AddQuery("pageSize", pageSize);
        r.AddQuery("pageNumber", pageNumber);
        return this.client.Request<FetchResult<EmailModel>>(r);
    }
}
