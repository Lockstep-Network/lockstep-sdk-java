
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
import io.lockstep.api.models.StatusModel;

/**
 * Contains all methods related to Status
 */
public class StatusClient
{
    private LockstepApi client;

    /**
     * Constructor for the Status API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public StatusClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Verifies that your application can successfully call the Lockstep Platform API and returns a successful code regardless of your authentication status or permissions.
     *
     * The Ping API can be used to verify that your app is working correctly.  The Ping API will always return 200 OK.  If you call this API and you receive a code other than 200 OK, you should check your network connectivity.  A response code of anything other than 200 means that a routing issue or proxy issue may prevent your application from reaching the Lockstep API
     *
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<StatusModel> ping()
    {
        RestRequest<StatusModel> r = new RestRequest<StatusModel>(this.client, "GET", "/api/v1/Status");
        return r.Call(StatusModel.class);
    }
}
