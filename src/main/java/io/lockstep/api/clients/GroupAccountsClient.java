
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
import io.lockstep.api.models.GroupAccountModel;


/**
 * Contains all methods related to GroupAccounts
 */
public class GroupAccountsClient
{
    private LockstepApi client;

    /**
     * Constructor for the GroupAccounts API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public GroupAccountsClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves group account data for the current user.
     *
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<GroupAccountModel> retrieveGroupAccountData()
    {
        RestRequest<GroupAccountModel> r = new RestRequest<GroupAccountModel>(this.client, "GET", "/api/v1/GroupAccounts/me");
        return r.Call(GroupAccountModel.class);
    }

    /**
     * Updates a group account that matches the specified id with the requested information.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * @param id The unique ID number of the Group Account to retrieve
     * @param body A list of changes to apply to this Group Account
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<GroupAccountModel> updateGroupAccount(@NotNull String id, @NotNull Object body)
    {
        RestRequest<GroupAccountModel> r = new RestRequest<GroupAccountModel>(this.client, "PATCH", "/api/v1/GroupAccounts/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(GroupAccountModel.class);
    }
}
