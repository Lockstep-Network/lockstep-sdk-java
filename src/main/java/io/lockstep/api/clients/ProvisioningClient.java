
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
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import io.lockstep.api.models.ProvisioningResponseModel;
import io.lockstep.api.models.ProvisioningModel;
import io.lockstep.api.models.ProvisioningFinalizeRequestModel;
import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.DeveloperAccountSubmitModel;

/**
 * Contains all methods related to Provisioning
 */
public class ProvisioningClient
{
    private LockstepApi client;

    /**
     * Constructor for the Provisioning API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public ProvisioningClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Creates a new User or updates an Invited user based on metadata provided by the User during the onboarding process
     *
     * @param body Represents a User and their related metadata
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ProvisioningResponseModel> provisionUserAccount(@NotNull ProvisioningModel body)
    {
        RestRequest<ProvisioningResponseModel> r = new RestRequest<ProvisioningResponseModel>(this.client, "POST", "/api/v1/Provisioning");
        r.AddBody(body);
        return r.Call(ProvisioningResponseModel.class);
    }

    /**
     * Updates user, company and group metadata for a User of status 'Onboarding' and finalizes a user's onboarding process by changing the user status to 'Active'
     *
     * @param body Represents a User and their related metadata
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ProvisioningResponseModel> finalizeUserAccountProvisioning(@NotNull ProvisioningFinalizeRequestModel body)
    {
        RestRequest<ProvisioningResponseModel> r = new RestRequest<ProvisioningResponseModel>(this.client, "POST", "/api/v1/Provisioning/finalize");
        r.AddBody(body);
        return r.Call(ProvisioningResponseModel.class);
    }

    /**
     * Creates a new account for a developer, sending an email with information on how to access the API.
     *
     * @param body Documentation pending
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> provisionFreeDeveloperAccount(@NotNull DeveloperAccountSubmitModel body)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "POST", "/api/v1/Provisioning/free-account");
        r.AddBody(body);
        return r.Call(ActionResultModel.class);
    }
}
