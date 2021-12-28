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



public class UserAccountsClient
{
    private LockstepApi client;

    public UserAccountsClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the User with this identifier.
     * 
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Insights.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     * 
     * @param id - The unique ID number of the User to retrieve
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Notes, Attachments, CustomFields, AccountingRole
     */
    public LockstepResponse<UserAccountModel> RetrieveUser(String id, String include)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/UserAccounts/{id}");
        r.AddPath("{id}", id);
        r.AddQuery("include", include);
        return this.client.Request<UserAccountModel>(r);
    }

    /**
     * Updates a User that matches the specified id with the requested information.
     * 
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.  A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Insights.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     * 
     * @param id - The unique ID number of the User to retrieve
     * @param body - A list of changes to apply to this User
     */
    public LockstepResponse<UserAccountModel> UpdateUser(String id, object body)
    {
        RestRequest r = new RestRequest("PATCH", "/api/v1/UserAccounts/{id}");
        r.AddPath("{id}", id);
        r.AddBody(body);
        return this.client.Request<UserAccountModel>(r);
    }

    /**
     * Disable the user referred to by this unique identifier.
     * 
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Insights.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     * 
     * @param id - The unique Lockstep Platform ID number of this User
     */
    public LockstepResponse<ActionResultModel> DisableUser(String id)
    {
        RestRequest r = new RestRequest("DELETE", "/api/v1/UserAccounts/{id}");
        r.AddPath("{id}", id);
        return this.client.Request<ActionResultModel>(r);
    }

    /**
     * Reenable the user referred to by this unique identifier.
     * 
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Insights.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     * 
     * @param id - The unique Lockstep Platform ID number of this User
     */
    public LockstepResponse<ActionResultModel> ReenableUser(String id)
    {
        RestRequest r = new RestRequest("POST", "/api/v1/UserAccounts/reenable");
        r.AddQuery("id", id);
        return this.client.Request<ActionResultModel>(r);
    }

    /**
     * Invite a user with the specified email to join your accounting group. The user will receive an email to set up their account.
     * 
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Insights.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     * 
     * @param body - The user to invite
     */
    public LockstepResponse<InviteModel[]> InviteUser(InviteSubmitModel[] body)
    {
        RestRequest r = new RestRequest("POST", "/api/v1/UserAccounts/invite");
        r.AddBody(body);
        return this.client.Request<InviteModel[]>(r);
    }

    /**
     * Retrieves invite information for the specified invite token.
     * 
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Insights.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     * @param code - The code of the invite
     */
    public LockstepResponse<InviteDataModel> RetrieveInviteData(String code)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/UserAccounts/invite");
        r.AddQuery("code", code);
        return this.client.Request<InviteDataModel>(r);
    }

    /**
     * Transfer the ownership of a group to another user. This API must be called by the current owner of the group.
     * 
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Insights.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     * 
     * @param body - 
     */
    public LockstepResponse<TransferOwnerModel> TransferOwner(TransferOwnerSubmitModel body)
    {
        RestRequest r = new RestRequest("POST", "/api/v1/UserAccounts/transfer-owner");
        r.AddBody(body);
        return this.client.Request<TransferOwnerModel>(r);
    }

    /**
     * Queries Users for this account using the specified filtering, sorting, nested fetch, and pagination rules requested. A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Insights.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     * 
     * @param filter - The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include - To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Notes, Attachments, CustomFields, AccountingRole
     * @param order - The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize - The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber - The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     */
    public LockstepResponse<FetchResult<UserAccountModel>> QueryUsers(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest r = new RestRequest("GET", "/api/v1/UserAccounts/query");
        r.AddQuery("filter", filter);
        r.AddQuery("include", include);
        r.AddQuery("order", order);
        r.AddQuery("pageSize", pageSize);
        r.AddQuery("pageNumber", pageNumber);
        return this.client.Request<FetchResult<UserAccountModel>>(r);
    }
}
