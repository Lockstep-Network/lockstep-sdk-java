
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
import io.lockstep.api.models.LeadModel;

/**
 * Contains all methods related to Leads
 */
public class LeadsClient
{
    private LockstepApi client;

    /**
     * Constructor for the Leads API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public LeadsClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Creates one or more Leads within the Lockstep platform and returns the records as created.
     *
     * A Lead is a person who is interested in the Lockstep platform but needs certain new features in order to use it. If you are interested in the Lockstep platform, you can create a lead with your information and our team will prioritize the feature you need.
     *
     * @param body The Leads to create
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<LeadModel[]> createLeads(@NotNull LeadModel[] body)
    {
        RestRequest<LeadModel[]> r = new RestRequest<LeadModel[]>(this.client, "POST", "/api/v1/Leads");
        r.AddBody(body);
        return r.Call(LeadModel[].class);
    }
}
