
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
import io.lockstep.api.models.MagicLinkModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.FetchResult;
import com.google.gson.reflect.TypeToken;
import io.lockstep.api.models.MagicLinkSummaryModel;

/**
 * Contains all methods related to MagicLinks
 */
public class MagicLinksClient
{
    private LockstepApi client;

    /**
     * Constructor for the MagicLinks API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public MagicLinksClient(@NotNull LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Magic Link specified by this unique identifier, optionally including nested data sets.
     *
     * @param id The id of the Magic Link
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: User
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<MagicLinkModel> retrieveMagicLink(@NotNull String id, @Nullable String include)
    {
        RestRequest<MagicLinkModel> r = new RestRequest<MagicLinkModel>(this.client, "GET", "/api/v1/useraccounts/magic-links/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(MagicLinkModel.class);
    }

    /**
     * Revokes the magic link with the specified id so it cannot be used to call the API.
     *
     * Revocation will be received by all servers within five minutes of revocation. API calls made using this magic link after the revocation will fail. A revoked magic link cannot be un-revoked.
     *
     * @param id The unique Lockstep Platform ID number of this magic link
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> revokeMagicLink(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/useraccounts/magic-links/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Revokes the bounced magic link with the specified id so it cannot be used to call the API.
     *
     * Revocation will be received by all servers within five minutes of revocation. API calls made using this magic link after the revocation will fail. A revoked magic link cannot be un-revoked.
     *
     * @param id The unique Lockstep Platform ID number of this magic link
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<ActionResultModel> revokeBouncedMagicLink(@NotNull String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/useraccounts/magic-links/{id}/bounced");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Queries Magic Links for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: User
     * @param order The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize The page size for results (default 250, maximum of 500)
     * @param pageNumber The page number for results (default 0)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<FetchResult<MagicLinkModel>> queryMagicLinks(@Nullable String filter, @Nullable String include, @Nullable String order, @Nullable Integer pageSize, @Nullable Integer pageNumber)
    {
        RestRequest<FetchResult<MagicLinkModel>> r = new RestRequest<FetchResult<MagicLinkModel>>(this.client, "GET", "/api/v1/useraccounts/magic-links/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<MagicLinkModel>>() {}.getType());
    }

    /**
     * Gets a summary of all magic links created during the specified date range, returns no content if there are no magic links for the specified date range
     *
     * @param from The date that the summary starts from (default one year ago from today)
     * @param to The date that the summary ends at (default today)
     * @return A {@link io.lockstep.api.LockstepResponse} containing the results
     */
    public @NotNull LockstepResponse<MagicLinkSummaryModel> magicLinkSummary(@Nullable String from, @Nullable String to)
    {
        RestRequest<MagicLinkSummaryModel> r = new RestRequest<MagicLinkSummaryModel>(this.client, "GET", "/api/v1/useraccounts/magic-links/summary");
        r.AddQuery("from", from.toString());
        r.AddQuery("to", to.toString());
        return r.Call(MagicLinkSummaryModel.class);
    }
}
