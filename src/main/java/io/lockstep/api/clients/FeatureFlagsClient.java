
/**
 * Lockstep Platform SDK for Java
 *
 * (c) 2021-2023 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Lockstep Network <support@lockstep.io>
 * @copyright  2021-2023 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.LockstepResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import io.lockstep.api.models.FeatureFlagsResponseModel;
import io.lockstep.api.models.FeatureFlagsRequestModel;

/**
 * Contains all methods related to FeatureFlags
 */
public class FeatureFlagsClient
{
    private LockstepApi client;

    /**
     * Constructor for the FeatureFlags API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public FeatureFlagsClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the specified feature flags. True if they are enabled, false otherwise.
     *
     * @param body Documentation pending
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FeatureFlagsResponseModel> retrieveFeatureFlags(@NotNull FeatureFlagsRequestModel body)
    {
        RestRequest<FeatureFlagsResponseModel> r = new RestRequest<FeatureFlagsResponseModel>(this.client, "POST", "/api/v1/feature-flags");
        r.AddBody(body);
        return r.Call(FeatureFlagsResponseModel.class);
    }
}
