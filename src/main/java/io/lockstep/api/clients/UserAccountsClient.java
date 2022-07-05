
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
import io.lockstep.api.models.UserAccountModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.InviteModel;
import io.lockstep.api.models.InviteSubmitModel;
import io.lockstep.api.models.InviteDataModel;
import io.lockstep.api.models.TransferOwnerModel;
import io.lockstep.api.models.TransferOwnerSubmitModel;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to UserAccounts
 */
public class UserAccountsClient
{
    private LockstepApi client;

    /**
     * Constructor for the UserAccounts API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public UserAccountsClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the User with this identifier.
     *
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Inbox.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     *
     * @param id The unique ID number of the User to retrieve
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Notes, Attachments, CustomFields, AccountingRole
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<UserAccountModel> retrieveUser(@NotNull String id, @Nullable String include)
    {
        RestRequest<UserAccountModel> r = new RestRequest<UserAccountModel>(this.client, "GET", "/api/v1/UserAccounts/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(UserAccountModel.class);
    }

    /**
     * Updates a User that matches the specified id with the requested information.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Inbox.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     *
     * @param id The unique ID number of the User to retrieve
     * @param body A list of changes to apply to this User
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<UserAccountModel> updateUser(@NotNull String id, @NotNull Object body)
    {
        RestRequest<UserAccountModel> r = new RestRequest<UserAccountModel>(this.client, "PATCH", "/api/v1/UserAccounts/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(UserAccountModel.class);
    }

    /**
     * Disable the user referred to by this unique identifier.
     *
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Inbox.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     *
     * @param id The unique Lockstep Platform ID number of this User
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> disableUser(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/UserAccounts/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Reenable the user referred to by this unique identifier.
     *
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Inbox.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     *
     * @param id The unique Lockstep Platform ID number of this User
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> reenableUser(@Nullable String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "POST", "/api/v1/UserAccounts/reenable");
        r.AddQuery("id", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Invite a user with the specified email to join your accounting group. The user will receive an email to set up their account.
     *
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Inbox.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     *
     * @param body The user to invite
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<InviteModel[]> inviteUser(@NotNull InviteSubmitModel[] body)
    {
        RestRequest<InviteModel[]> r = new RestRequest<InviteModel[]>(this.client, "POST", "/api/v1/UserAccounts/invite");
        r.AddBody(body);
        return r.Call(InviteModel[].class);
    }

    /**
     * Retrieves invite information for the specified invite token.
     *
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Inbox.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     *
     * @param code The code of the invite
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<InviteDataModel> retrieveInviteData(@Nullable String code)
    {
        RestRequest<InviteDataModel> r = new RestRequest<InviteDataModel>(this.client, "GET", "/api/v1/UserAccounts/invite");
        r.AddQuery("code", code.toString());
        return r.Call(InviteDataModel.class);
    }

    /**
     * Transfer the ownership of a group to another user. This API must be called by the current owner of the group.
     *
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Inbox.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     *
     * @param body Documentation pending
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<TransferOwnerModel> transferOwner(@NotNull TransferOwnerSubmitModel body)
    {
        RestRequest<TransferOwnerModel> r = new RestRequest<TransferOwnerModel>(this.client, "POST", "/api/v1/UserAccounts/transfer-owner");
        r.AddBody(body);
        return r.Call(TransferOwnerModel.class);
    }

    /**
     * Queries Users for this account using the specified filtering, sorting, nested fetch, and pagination rules requested. A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Inbox.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Notes, Attachments, CustomFields, AccountingRole
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<UserAccountModel>> queryUsers(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<UserAccountModel>> r = new RestRequest<FetchResult<UserAccountModel>>(this.client, "GET", "/api/v1/UserAccounts/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<UserAccountModel>>() {}.getType());
    }

    /**
     * Change the active GroupKey of the calling user.
     *
     * A User represents a person who has the ability to authenticate against the Lockstep Platform and use services such as Lockstep Inbox.  A User is uniquely identified by an Azure identity, and each user must have an email address defined within their account.  All Users must validate their email to make use of Lockstep platform services.  Users may have different privileges and access control rights within the Lockstep Platform.
     *
     * @param groupKey Documentation pending
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<UserAccountModel> changeUserGroup(@NotNull String groupKey)
    {
        RestRequest<UserAccountModel> r = new RestRequest<UserAccountModel>(this.client, "POST", "/api/v1/UserAccounts/change-group");
        r.AddQuery("groupKey", groupKey.toString());
        return r.Call(UserAccountModel.class);
    }
}
